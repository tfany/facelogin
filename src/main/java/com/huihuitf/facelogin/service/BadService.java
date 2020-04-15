package com.huihuitf.facelogin.service;

import com.huihuitf.facelogin.pojo.Bad;

import java.util.List;

public interface BadService {
    /**
     * 保障报修
     * @param bad 错误类
     * @return boolean
     */
    boolean tellNewBad(Bad bad);

    /**
     * 故障处理
     * @param bad 维修结果
     * @return boolean
     */
    boolean detailBad(Bad bad);

    /**
     * 查询报修记录
     * @param customerId 用户id
     * @return list
     */
    List<Bad> queryTellBadRecord(String customerId);

    /**
     * 查询所有维修记录
     * @return
     */
    List<Bad> queryFixBadRecord();

    /**
     * 按维修结果查询所有记录
     * @param fixResult 维修结构
     * @return list
     */
    List<Bad> queryAllByFixResult(Integer fixResult);

}
