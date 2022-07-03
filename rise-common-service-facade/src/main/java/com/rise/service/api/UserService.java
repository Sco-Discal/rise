package com.rise.service.api;

import com.rise.service.dto.LoginReq;
import com.rise.service.entity.UserEntity;

public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
