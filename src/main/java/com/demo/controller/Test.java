package com.demo.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dao.TestMapper;

@Controller

public class Test {
    
    @Resource
    TestMapper testMapper;
    
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        testMapper.selectByPrimaryKey(1);
        return testMapper.selectByPrimaryKey(1).getName();
    }
    public static void main(String[] args) {
        PropertyConfigurator.configure( "C:/workspace/demo/src/main/resources/log4j.properties" );
        Logger logger  =  Logger.getLogger(Test.class );
        logger.debug( " debug " );
        logger.error( " error " );
    }
}
