package com.demo.hmjob;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.dao.RoleDAO;
import com.demo.dao.ServerDAO;
import com.demo.domain.Role;
import com.demo.domain.Server;
import com.demo.util.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/*.xml" })
public class RoleJob {
    @Resource
    RoleDAO roleDAO;
    @Resource
    ServerDAO serverDAO;
    Gson gson = new Gson();
    static List<String> urlList = new ArrayList<>();
    static int index = 0;
    static Logger log  =  Logger.getLogger(RoleJob.class );

    private void  initUrlList(){
        log.info("initUrlList start");
        List<Server> list = serverDAO.selectAll();
        for (Server server : list) {
            String data = HttpUtils.doGet("http://qibao.gyyx.cn/AdvancedSearch/RoleItemList?sex=不限&level=&serverId="+
                    server.getServerCode()+"&state=0&pageIndex=1&pageSize=1");
            JsonObject ele = gson.fromJson(data, JsonObject.class);
            int total = Integer.parseInt(ele.get("TotalCount").toString());
            total = total/800==0 ? (total/800) : (total/800+1);
            for (int i = 1; i <= total; i++) {
                urlList.add("http://qibao.gyyx.cn/AdvancedSearch/RoleItemList?sex=不限&level=&serverId="+
                    server.getServerCode()+"&state=0&pageIndex="+
                        i+"&pageSize=800");
            }
        }
        log.info("initUrlList end");
    }
    private synchronized String getUrl(){
        String url = urlList.get(index);
        index++;
        return url;
    }
    @Test
    public void doTask(){
        initUrlList();
        for (int i = 0; i < urlList.size(); i++) {
            log.info("doTask");
            String url = getUrl();
            log.info(url);
            String data = HttpUtils.doGet(url);
            JsonObject dataObj = gson.fromJson(data, JsonObject.class);
            JsonArray array =  (JsonArray) dataObj.get("Data");
            log.info("store");
            for (JsonElement roleEle : array) {
                Role role = gson.fromJson(roleEle, Role.class);
                if(roleDAO.selectByPrimaryKey(role.getItemOrderCode())==null){
                    roleDAO.insert(role);
                }
                
            }
        }
    }
}
