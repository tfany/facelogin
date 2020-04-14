package com.huihuitf.facelogin.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "power_detail")
public class PowerDetail {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 普通客户id
     */
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 记录生成时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 月用电量w
     */
    private Integer electricity;

    /**
     * 消费金额(分)
     */
    private Integer amount;

    /**
     * 剩余金额(分)
     */
    private Integer remaining;

    /**
     * 哪一年哪一月的数据
     */
    @Column(name = "record_time")
    private Date recordTime;

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
     * 获取普通客户id
     *
     * @return customer_id - 普通客户id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置普通客户id
     *
     * @param customerId 普通客户id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 获取记录生成时间
     *
     * @return create_time - 记录生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录生成时间
     *
     * @param createTime 记录生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取记录更新时间
     *
     * @return update_time - 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录更新时间
     *
     * @param updateTime 记录更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取月用电量w
     *
     * @return electricity - 月用电量w
     */
    public Integer getElectricity() {
        return electricity;
    }

    /**
     * 设置月用电量w
     *
     * @param electricity 月用电量w
     */
    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    /**
     * 获取消费金额(分)
     *
     * @return amount - 消费金额(分)
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置消费金额(分)
     *
     * @param amount 消费金额(分)
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取剩余金额(分)
     *
     * @return remaining - 剩余金额(分)
     */
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * 设置剩余金额(分)
     *
     * @param remaining 剩余金额(分)
     */
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    /**
     * 获取哪一年哪一月的数据
     *
     * @return record_time - 哪一年哪一月的数据
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * 设置哪一年哪一月的数据
     *
     * @param recordTime 哪一年哪一月的数据
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}