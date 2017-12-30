package com.chumo.login.dao;

import com.chumo.login.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Long aId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long aId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}