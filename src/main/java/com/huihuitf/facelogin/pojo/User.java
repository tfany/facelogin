package com.huihuitf.facelogin.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * 客户表id
     */
    @Id
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机号码
     */
    private String phone;

    /**
     * 表创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 表更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 管理员 维修人员 普通客户
     */
    private String permissions;

    /**
     * 人脸图片
     */
    @Column(name = "face_img")
    private String faceImg;

    /**
     * 获取客户表id
     *
     * @return id - 客户表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置客户表id
     *
     * @param id 客户表id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取用户手机号码
     *
     * @return phone - 用户手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号码
     *
     * @param phone 用户手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取表创建时间
     *
     * @return create_time - 表创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置表创建时间
     *
     * @param createTime 表创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取表更新时间
     *
     * @return update_time - 表更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置表更新时间
     *
     * @param updateTime 表更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取管理员 维修人员 普通客户
     *
     * @return permissions - 管理员 维修人员 普通客户
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * 设置管理员 维修人员 普通客户
     *
     * @param permissions 管理员 维修人员 普通客户
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }

    /**
     * 获取人脸图片
     *
     * @return face_img - 人脸图片
     */
    public String getFaceImg() {
        return faceImg;
    }

    /**
     * 设置人脸图片
     *
     * @param faceImg 人脸图片
     */
    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg == null ? null : faceImg.trim();
    }
}