package com.demo.util;

import org.springframework.util.StringUtils;

public class DomainJsonFormateUtil {
    static public String formate(String path){
        StringBuilder domain = new StringBuilder();
        String[] split = ReadAndWrite.readTxtFile(path).toString().split("private");
        for (String lineString : split) {
            if(!StringUtils.isEmpty(lineString)){
                String name = lineString.split(" ")[2].replace(";", "");
                domain.append("@SerializedName(\""+name.replaceFirst(String.valueOf(name.charAt(0)), String.valueOf(Character.toUpperCase(name.charAt(0))))+"\")").append("\n");
                domain.append("private "+lineString).append("\n");
            }
            
        }
        return domain.toString();
        
    }
    public static void main(String[] args) {
        System.out.println(formate("C://book//domainformat.txt"));
    }
}
