package com.rise.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.Result;
import com.rise.service.api.UserService;
import com.rise.service.dto.LoginReq;
import com.rise.service.entity.UserEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserControllerImpl implements UserController{

    @Reference
    private UserService userService;


    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);

        return null;
    }
}
