package com.huihuitf.facelogin.controller;

import com.huihuitf.facelogin.jwt.UserLoginToken;
import com.huihuitf.facelogin.pojo.User;
import com.huihuitf.facelogin.service.TokenService;
import com.huihuitf.facelogin.service.UserService;
import com.huihuitf.facelogin.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public CommonResult<Object> login(String userId) {
        User userForBase = userService.findUserById(userId);
        if (userForBase == null) {
            return CommonResult.failed("用户不存在");
        } else {
            String token = tokenService.getToken(userForBase);
            return CommonResult.success(token);
        }
    }

    @UserLoginToken
    @PostMapping("addUser")
    public CommonResult<Object> addUser(@RequestBody User user) {
        if (userService.addUser(user)) {
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }

    @UserLoginToken
    @PostMapping("deleteUser")
    public CommonResult<Object> deleteUser(String userId) {
        if (userService.deleteUser(userId)) {
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }

    @UserLoginToken
    @GetMapping("getUser")
    public CommonResult<List<User>> getUser(int pageNum, int pageSize, String groupId) {
        return CommonResult.success(userService.getUser(pageNum, pageSize, groupId));
    }

    @UserLoginToken
    @GetMapping("findUserById")
    public CommonResult<User> findUserById(String userId){
        return CommonResult.success(userService.findUserById(userId));
    }
}
