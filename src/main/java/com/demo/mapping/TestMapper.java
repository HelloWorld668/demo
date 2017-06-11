package com.demo.mapping;

import org.springframework.stereotype.Component;

import com.demo.domain.Test;
@Component("testMapper")
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}