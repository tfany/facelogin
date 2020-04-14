package com.huihuitf.facelogin.service;

import com.huihuitf.facelogin.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     * @param user user
     * @return boolean
     */

    public boolean addUser(User user);

    /**
     * 删除用户
     * @param id 用户user_id
     * @return boolean
     */
    public boolean deleteUser(String id);

    /**
     * 获取用户列表
     * @param pageNum 第几页
     * @param pageSize 页数
     * @param groupId 用户权限
     * @return 用户列表
     */
    public List<User> getUser(int pageNum,int pageSize,String groupId);

    User findUserById(String userId);
}
