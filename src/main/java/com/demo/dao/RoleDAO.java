package com.demo.dao;

import com.demo.domain.Role;

public interface RoleDAO {
    int deleteByPrimaryKey(Integer icon);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer icon);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}