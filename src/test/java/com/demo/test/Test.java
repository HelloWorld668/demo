package com.demo.test;

import org.apache.log4j.Logger;

import com.demo.hmjob.RoleJob;
import com.demo.util.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Test {
    static Logger log  =  Logger.getLogger(RoleJob.class );
    public static void main(String[] args) {
        Gson gson = new Gson();
        log.info("hah");
        log.debug("==================");
        log.error("haha");
        String data = HttpUtils.doGet("http://qibao.gyyx.cn/AdvancedSearch/RoleItemList?sex=不限&level=&serverId=248&state=0&pageIndex=1&pageSize=1");
        JsonObject dataObj = gson.fromJson(data, JsonObject.class);
    }
    static void test(String s){
        if (!"Cluster".equalsIgnoreCase(s)
                && !"Bridge".equalsIgnoreCase(s)) {
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}
