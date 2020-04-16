package com.huihuitf.facelogin.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.huihuitf.facelogin.pojo.User;
import com.huihuitf.facelogin.service.TokenService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user) {
        String token="";
        Date expireDate = new Date(System.currentTimeMillis() + 1000*60*5);
        token= JWT.create()
                .withSubject(user.getName())
                .withAudience(user.getId())
                .withClaim("user_id", user.getId())
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(user.getPhone()));
        return token;
    }
}
