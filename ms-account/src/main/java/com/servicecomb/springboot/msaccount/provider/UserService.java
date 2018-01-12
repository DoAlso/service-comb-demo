package com.servicecomb.springboot.msaccount.provider;

import com.microservice.common.mscommon.bean.msaccount.User;

public interface UserService {

    User findUser(String account) throws Exception;

    User findUserById(Long userId) throws Exception;
}
