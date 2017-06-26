package com.demo.hmjob;


import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import com.demo.util.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class RoleDetailJob {
    static Gson gson = new Gson();
    public static JsonObject getOne(String url) {
        String data = HttpUtils.doGet(url);
        XMLSerializer serializer = new XMLSerializer();
        JSON read = serializer.read(data);
        JsonObject detail = gson.fromJson(read.toString(), JsonObject.class);
        JsonObject role =  (JsonObject) detail.get("role");
        role.remove("skills");
        detail.remove("upgrade");
        detail.remove("bag");
        detail.remove("equip");
        detail.remove("children");
        detail.remove("guards");
        try {
            JsonArray pets = (JsonArray) detail.get("pets");
            if(null != pets){
                for (JsonElement jsonElement : pets) {
                    ((JsonObject) jsonElement).remove("@locality");
                    ((JsonObject) jsonElement).remove("extra_attribs");
                    ((JsonObject) jsonElement).remove("skills");
                    ((JsonObject) jsonElement).remove("pet_godbooks");
                    ((JsonObject) jsonElement).remove("medicine_used");
                }
            }
        } catch (Exception e) {
            JsonObject pets = (JsonObject) detail.get("pets");
            JsonObject pet =  (JsonObject) pets.get("pet");
            pet.remove("@locality");
            pet.remove("extra_attribs");
            pet.remove("skills");
            pet.remove("pet_godbooks");
            pet.remove("medicine_used");
        }
        
        return detail;
    }

    public static void main(String[] args) {
        System.out.println(getOne("http://qibao.gyyx.cn/Buy/GetItemInfoXMLByItemId/34372430"));
    }
}
