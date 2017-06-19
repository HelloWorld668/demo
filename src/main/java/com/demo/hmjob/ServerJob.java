package com.demo.hmjob;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.dao.ServerDAO;
import com.demo.domain.Server;
import com.demo.util.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/*.xml" })
public class ServerJob {
    @Resource
    ServerDAO serverDAO;
    Gson gson = new Gson();
    @Test
    public void run(){
        String data = HttpUtils.doGet("http://qibao.gyyx.cn/AdvancedSearch/GameServerList");
        JsonObject dataObj = gson.fromJson(data, JsonObject.class);
        JsonArray servers = (JsonArray) dataObj.get("Data");
        for (JsonElement jsonElement : servers) {
            Server server =  gson.fromJson(jsonElement, Server.class);
            System.out.println(server);
            serverDAO.insert(server);
        }
    }
}
