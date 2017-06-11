package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.mapping.TestMapper;

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
}
