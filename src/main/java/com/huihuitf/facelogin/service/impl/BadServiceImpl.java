package com.huihuitf.facelogin.service.impl;

import com.huihuitf.facelogin.dao.BadMapper;
import com.huihuitf.facelogin.pojo.Bad;
import com.huihuitf.facelogin.service.BadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class BadServiceImpl implements BadService {
    @Autowired
    private BadMapper badMapper;

    @Override
    public boolean tellNewBad(Bad bad) {
        if(bad.getCustomerId()==null || bad.getBadType()==null) return false;
        bad.setTellErrorTime(new Date());
        bad.setFixResult(0);
        return badMapper.insert(bad)==1;
    }

    @Override
    public boolean detailBad(Bad bad) {
        if(bad.getId()==null || bad.getFixResult()==null || bad.getFixerId()==null)
            return false;
        bad.setFixTime(new Date());
        return badMapper.updateByPrimaryKeySelective(bad)==1;
    }

    @Override
    public List<Bad> queryTellBadRecord(String customerId) {
        Example example=new Example(Bad.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("customerId",customerId);
        return badMapper.selectByExample(example);
    }

    @Override
    public List<Bad> queryFixBadRecord() {
        return badMapper.selectAll();
    }

    @Override
    public List<Bad> queryAllByFixResult(Integer fixResult) {
        Example example=new Example(Bad.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("fixResult",fixResult);
        return badMapper.selectByExample(example);
    }
}
