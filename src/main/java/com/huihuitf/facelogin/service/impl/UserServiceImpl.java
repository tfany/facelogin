package com.huihuitf.facelogin.service.impl;

import com.github.pagehelper.PageHelper;
import com.huihuitf.facelogin.dao.UserMapper;
import com.huihuitf.facelogin.pojo.User;
import com.huihuitf.facelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean addUser(User user) {
        if(user.getId()==null)
            return false;
        int i = userMapper.insert(user);
        return i == 1;
    }

    @Override
    public boolean deleteUser(String id) {
        return userMapper.deleteByPrimaryKey(id)!=0;
    }

    @Override
    public List<User> getUser(int pageNum, int pageSize, String groupId) {
        Example example=new Example(User.class);
        Example.Criteria criteria= example.createCriteria();
        criteria.andEqualTo("permissions",groupId);
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectByExample(example);
    }

    @Override
    public User findUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
