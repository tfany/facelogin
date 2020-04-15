package com.huihuitf.facelogin.controller;

import com.huihuitf.facelogin.pojo.Bad;
import com.huihuitf.facelogin.service.BadService;
import com.huihuitf.facelogin.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BadController {
    @Autowired
    private BadService badService;

    @PostMapping("tellNewBad")
    public CommonResult<Object> tellNewBad(@RequestBody Bad bad) {
        if (badService.tellNewBad(bad))
            return CommonResult.success(null);
        else return CommonResult.failed();
    }

    /**
     * 故障处理
     *
     * @param bad 维修结果
     * @return boolean
     */
    @PostMapping("detailBad")
    public CommonResult<Object> detailBad(@RequestBody Bad bad) {
        if (badService.detailBad(bad))
            return CommonResult.success(null);
        return CommonResult.failed();
    }

    /**
     * 查询报修记录
     * @param customerId 用户id
     * @return list
     */
    @GetMapping("queryTellBadRecord")
    public CommonResult<List<Bad>> queryTellBadRecord(String customerId) {
        return CommonResult.success(badService.queryTellBadRecord(customerId));
    }

    /**
     * 查询所有维修记录
     *
     * @return
     */
    @GetMapping("queryFixBadRecord")
    public CommonResult<List<Bad>>  queryFixBadRecord(){
        return CommonResult.success(badService.queryFixBadRecord());
    }

    /**
     * 按维修结果查询所有记录
     * @param fixResult 维修结构
     * @return list
     */
    @GetMapping("queryAllByFixResult")
    public CommonResult<List<Bad>> queryAllByFixResult(Integer fixResult){
        return CommonResult.success(badService.queryAllByFixResult(fixResult));
    }
}
