package com.huihuitf.facelogin.service;

import com.huihuitf.facelogin.pojo.User;

public interface TokenService {
    String getToken(User user);
}
