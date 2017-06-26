package com.demo.util;

import com.demo.hmjob.RoleDetailJob;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class TableInitUtil {
    static Gson gson = new Gson();  
    public static String getCreateSQL(String tableName,JsonObject tabelJson,String data){
        JsonArray array =  (JsonArray) tabelJson.get(data);
        String obj = array.get(0).toString();
        String[] split = obj.split(",[^0-9]");
        StringBuffer sb = new StringBuffer("create table "+tableName+"(").append("\n");
        for (String string : split) {
            String key = string.split(":")[0].replaceAll("[{}\"]", "");
            String value = string.split(":")[1];
            value = (value.indexOf("\"",0) == 0) ? value.replaceFirst("\"", ""): value;
            value = (value.indexOf("\"",value.length()-1) != -1) ? value.substring(0, value.length()-1): value;
            value = (value.indexOf("}",value.length()-1) != -1) ? value.substring(0, value.length()-1): value;
            sb.append("").append(key).append("   ").append(ChacterTypeUtil.getChacterType(value)).append(",\n");
        }
        sb.append(")");
        System.out.println(sb);
       
        return sb.toString();
        
    }
    public static void main1(String[] args) {
        String data = HttpUtils.doGet("http://qibao.gyyx.cn/AdvancedSearch/RoleItemList?sex=不限&level=&serverId=248&state=0&pageIndex=1&pageSize=100");
        JsonObject dataObj = gson.fromJson(data, JsonObject.class);
        getCreateSQL("role", dataObj, "Data");
    }
    public static void main(String[] args) {
        JsonObject one = RoleDetailJob.getOne("http://qibao.gyyx.cn/Buy/GetItemInfoXMLByItemId/34372430");
        JsonObject role = (JsonObject) one.get("pets");
        JsonObject pet = (JsonObject) role.get("pet");
        String attribs = ((JsonObject) pet.get("attribs")).toString();
        String[] split = attribs.split(",[^0-9]");
        StringBuffer sb = new StringBuffer("create table "+"role_detail"+"(").append("\n");
        for (String string : split) {
            String key = string.split(":")[0].replaceAll("[{}\"]", "");
            String value = string.split(":")[1];
            value = (value.indexOf("\"",0) == 0) ? value.replaceFirst("\"", ""): value;
            value = (value.indexOf("\"",value.length()-1) != -1) ? value.substring(0, value.length()-1): value;
            value = (value.indexOf("}",value.length()-1) != -1) ? value.substring(0, value.length()-1): value;
            sb.append("").append(key).append("   ").append(ChacterTypeUtil.getChacterType(value)).append(",\n");
        }
        sb.append(")");
        System.out.println(sb);
    }
}
