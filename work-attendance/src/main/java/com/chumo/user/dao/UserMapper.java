package com.chumo.user.dao;

import com.chumo.user.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}