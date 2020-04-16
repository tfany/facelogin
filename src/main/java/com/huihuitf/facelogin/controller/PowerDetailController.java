package com.huihuitf.facelogin.controller;

import com.huihuitf.facelogin.jwt.UserLoginToken;
import com.huihuitf.facelogin.pojo.PowerDetail;
import com.huihuitf.facelogin.service.PowerDetailService;
import com.huihuitf.facelogin.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

@RestController
public class PowerDetailController {
    @Autowired
    private PowerDetailService powerDetailService;

    @UserLoginToken
    @PostMapping("/imitationData")
    public CommonResult<Object> imitationData(String userId, int count) {
        powerDetailService.imitationData(userId, count);
        return CommonResult.success(null);
    }

    @UserLoginToken
    @GetMapping("getCurrentMonth")
    public CommonResult<List<PowerDetail>> getCurrentMonth(String userId, int amount) {
        List<PowerDetail> powerDetailList = powerDetailService.getCurrentPower(userId, amount);
        if (powerDetailList != null)
            return CommonResult.success(powerDetailList);
        return CommonResult.failed();
    }

    @UserLoginToken
    @GetMapping("getHistory")
    public CommonResult<List<PowerDetail>> getHistory(String userId,int amount){
        return CommonResult.success(powerDetailService.getHistory(userId,amount));
    }
}
