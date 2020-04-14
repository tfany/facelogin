package com.huihuitf.facelogin.service.impl;

import com.huihuitf.facelogin.dao.PowerDetailMapper;
import com.huihuitf.facelogin.pojo.PowerDetail;
import com.huihuitf.facelogin.service.PowerDetailService;
import com.huihuitf.facelogin.util.AboutMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import org.apache.commons.lang3.RandomUtils;

import java.util.Date;
import java.util.List;

@Service
public class PowerDetailServiceImpl implements PowerDetailService {
    @Autowired
    private PowerDetailMapper powerDetailMapper;
    @Override
    public List<PowerDetail> getCurrentPower(String userId,int amount) {
        Example example=new Example(PowerDetail.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("customerId",userId).andBetween("recordTime", AboutMonth.getFirstDay(amount),AboutMonth.getLastDay(amount));
        return powerDetailMapper.selectByExample(example);
    }
    @Override
    public List<PowerDetail> getHistory(String userId,int amount) {
        Example example=new Example(PowerDetail.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("customerId",userId).andLessThan("recordTime",AboutMonth.getFirstDay(0));
        return powerDetailMapper.selectByExample(example);
    }

    @Override
    public void imitationData(String userId,int num) {
        for(int i=0;i<num;i++){
            List<PowerDetail> powerDetail=getCurrentPower(userId,i);
            if(powerDetail==null || powerDetail.isEmpty()){
                PowerDetail temp=new PowerDetail();
                temp.setCustomerId(userId);
                temp.setCreateTime(new Date());
                temp.setUpdateTime(new Date());
                int ele=RandomUtils.nextInt(100,500);
                temp.setElectricity(ele);
                temp.setAmount(ele*50);
                temp.setRemaining(RandomUtils.nextInt(1000,30000));
                temp.setRecordTime(AboutMonth.getFirstDay(i));
                powerDetailMapper.insert(temp);
            }
        }
    }
}
