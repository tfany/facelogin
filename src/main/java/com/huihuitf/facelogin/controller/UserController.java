package com.huihuitf.facelogin.controller;

import com.huihuitf.facelogin.pojo.User;
import com.huihuitf.facelogin.service.UserService;
import com.huihuitf.facelogin.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("addUser")
    public CommonResult<Object> addUser(@RequestBody User user){
        if(userService.addUser(user)){
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }

    @PostMapping("deleteUser")
    public CommonResult<Object> deleteUser(String userId){
        if(userService.deleteUser(userId)){
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }
}
