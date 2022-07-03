package com.rise.service.service;

import com.rise.service.api.UserService;
import com.rise.service.dto.LoginReq;
import com.rise.service.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        System.out.println("成功登录了呢");
        return null;
    }
}
