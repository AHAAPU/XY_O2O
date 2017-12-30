package com.chumo.user.service;

import com.chumo.user.dao.UserMapper;
import com.chumo.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userServiceImlp")
public class UserServiceImlp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public int createUser(User user) {
        return userMapper.insertSelective(user);
    }
}
