package com.servicecomb.springboot.msaccount.provider.impl;

import com.microservice.common.mscommon.bean.msaccount.User;
import com.servicecomb.springboot.msaccount.dao.UserMapper;
import com.servicecomb.springboot.msaccount.provider.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired(required = false)
    private UserMapper userMapper;

    public User findUser(String account) {
        return userMapper.selectUserByAccount(account);
    }

    @Override
    public User findUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
