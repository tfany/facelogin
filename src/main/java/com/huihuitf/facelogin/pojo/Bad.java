package com.huihuitf.facelogin.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bad")
public class Bad {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 报修客户id
     */
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 报修时间
     */
    @Column(name = "tell_error_time")
    private Date tellErrorTime;

    /**
     * 1计量不准确 2无法显示数据 3家中停电 4其他异常
     */
    @Column(name = "bad_type")
    private Integer badType;

    /**
     * 用户留言
     */
    @Column(name = "customer_talk")
    private String customerTalk;

    /**
     * 维修人员id
     */
    @Column(name = "fixer_id")
    private String fixerId;

    /**
     * 1已修复 0未修复 2上次维修过但没修好
     */
    @Column(name = "fix_result")
    private Integer fixResult;

    /**
     * 上次维修时间
     */
    @Column(name = "fix_time")
    private Date fixTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取报修客户id
     *
     * @return customer_id - 报修客户id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置报修客户id
     *
     * @param customerId 报修客户id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 获取报修时间
     *
     * @return tell_error_time - 报修时间
     */
    public Date getTellErrorTime() {
        return tellErrorTime;
    }

    /**
     * 设置报修时间
     *
     * @param tellErrorTime 报修时间
     */
    public void setTellErrorTime(Date tellErrorTime) {
        this.tellErrorTime = tellErrorTime;
    }

    /**
     * 获取1计量不准确 2无法显示数据 3家中停电 4其他异常
     *
     * @return bad_type - 1计量不准确 2无法显示数据 3家中停电 4其他异常
     */
    public Integer getBadType() {
        return badType;
    }

    /**
     * 设置1计量不准确 2无法显示数据 3家中停电 4其他异常
     *
     * @param badType 1计量不准确 2无法显示数据 3家中停电 4其他异常
     */
    public void setBadType(Integer badType) {
        this.badType = badType;
    }

    /**
     * 获取用户留言
     *
     * @return customer_talk - 用户留言
     */
    public String getCustomerTalk() {
        return customerTalk;
    }

    /**
     * 设置用户留言
     *
     * @param customerTalk 用户留言
     */
    public void setCustomerTalk(String customerTalk) {
        this.customerTalk = customerTalk == null ? null : customerTalk.trim();
    }

    /**
     * 获取维修人员id
     *
     * @return fixer_id - 维修人员id
     */
    public String getFixerId() {
        return fixerId;
    }

    /**
     * 设置维修人员id
     *
     * @param fixerId 维修人员id
     */
    public void setFixerId(String fixerId) {
        this.fixerId = fixerId == null ? null : fixerId.trim();
    }

    /**
     * 获取1已修复 0未修复 2上次维修过但没修好
     *
     * @return fix_result - 1已修复 0未修复 2上次维修过但没修好
     */
    public Integer getFixResult() {
        return fixResult;
    }

    /**
     * 设置1已修复 0未修复 2上次维修过但没修好
     *
     * @param fixResult 1已修复 0未修复 2上次维修过但没修好
     */
    public void setFixResult(Integer fixResult) {
        this.fixResult = fixResult;
    }

    /**
     * 获取上次维修时间
     *
     * @return fix_time - 上次维修时间
     */
    public Date getFixTime() {
        return fixTime;
    }

    /**
     * 设置上次维修时间
     *
     * @param fixTime 上次维修时间
     */
    public void setFixTime(Date fixTime) {
        this.fixTime = fixTime;
    }
}