package com.demo.dao;

import org.springframework.stereotype.Component;

import com.demo.domain.Server;
@Component("serverDAO")
public interface ServerDAO {
    int deleteByPrimaryKey(Integer serverCode);

    int insert(Server record);

    int insertSelective(Server record);

    Server selectByPrimaryKey(Integer serverCode);

    int updateByPrimaryKeySelective(Server record);

    int updateByPrimaryKey(Server record);
}