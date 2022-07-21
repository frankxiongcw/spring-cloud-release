package com.frank.core.entity;

import java.util.Date;

public class Advisory {
    /**
     * 主键
     */
    private Long advisoryId;

    /**
     * 联系人
     */
    private String userName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 街道/镇
     */
    private String street;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 内容
     */
    private String content;

    /**
     * 经营类型
     */
    private String businessType;

    /**
     * 状态(0:未处理;1:处理中;2:已处理)
     */
    private Byte applyStatus;

    /**
     * openid
     */
    private String openid;

    /**
     * 是否删除 0未删除 1已删除
     */
    private Boolean delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建人名字
     */
    private String creator;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新人名字
     */
    private String updater;

    /**
     * 主键
     * @return advisory_id 主键
     */
    public Long getAdvisoryId() {
        return advisoryId;
    }

    /**
     * 主键
     * @param advisoryId 主键
     */
    public void setAdvisoryId(Long advisoryId) {
        this.advisoryId = advisoryId;
    }

    /**
     * 联系人
     * @return user_name 联系人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 联系人
     * @param userName 联系人
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 电话
     * @return phone 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 电话
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 微信号
     * @return wechat 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 微信号
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区县
     * @return area 区县
     */
    public String getArea() {
        return area;
    }

    /**
     * 区县
     * @param area 区县
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 街道/镇
     * @return street 街道/镇
     */
    public String getStreet() {
        return street;
    }

    /**
     * 街道/镇
     * @param street 街道/镇
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * 详细地址
     * @return address 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 经营类型
     * @return business_type 经营类型
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 经营类型
     * @param businessType 经营类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 状态(0:未处理;1:处理中;2:已处理)
     * @return apply_status 状态(0:未处理;1:处理中;2:已处理)
     */
    public Byte getApplyStatus() {
        return applyStatus;
    }

    /**
     * 状态(0:未处理;1:处理中;2:已处理)
     * @param applyStatus 状态(0:未处理;1:处理中;2:已处理)
     */
    public void setApplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * openid
     * @return openid openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * openid
     * @param openid openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 是否删除 0未删除 1已删除
     * @return del_flag 是否删除 0未删除 1已删除
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除 0未删除 1已删除
     * @param delFlag 是否删除 0未删除 1已删除
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建人名字
     * @return creator 创建人名字
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人名字
     * @param creator 创建人名字
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人
     * @return update_by 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新人名字
     * @return updater 更新人名字
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 更新人名字
     * @param updater 更新人名字
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}