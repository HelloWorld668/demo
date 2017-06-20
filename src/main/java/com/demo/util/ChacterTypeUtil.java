package com.demo.util;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;



public class ChacterTypeUtil {
    static Logger logger  =  Logger.getLogger(ChacterTypeUtil.class );
    public static String getChacterType(String s){
        try {
            Integer.parseInt(s);
            return "int(11)";
        } catch (Exception e) {
            try {
                Double.parseDouble(s);
                return "double";
            } catch (Exception e2) {
               
            }
        }
        if("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)){
            return "varchar(16)";
        }
        if(!StringUtils.isEmpty(s)){
            if(s.length() < 8){
                return "varchar(16)";
            }else if(s.length() < 16){
                return "varchar(32)";
            }else if(s.length() < 64){
                return "varchar(128)";
            }else if(s.length() < 128){
                return "varchar(256)";
            }
            
        }else{
            return "varchar(16)";
        }
        System.out.println("error type"+s);
        
        return s;
    }
    public static void main(String[] args) {
       System.out.println( getChacterType("35737466"));
    }
}
