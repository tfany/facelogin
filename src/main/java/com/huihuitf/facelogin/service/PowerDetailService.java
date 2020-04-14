package com.huihuitf.facelogin.service;

import com.huihuitf.facelogin.pojo.PowerDetail;

import java.util.List;

public interface PowerDetailService {
    List<PowerDetail> getCurrentPower(String userId,int amount);
    List<PowerDetail> getHistory(String userId,int amount);
    void imitationData(String userId,int num);
}
