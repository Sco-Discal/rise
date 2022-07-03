package com.rise.service.controller;

import com.alibaba.dubbo.rpc.Result;
import com.rise.service.dto.LoginReq;

import javax.servlet.http.HttpServletResponse;

public interface UserController {

    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) ;

}
