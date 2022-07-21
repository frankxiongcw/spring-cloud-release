package com.frank.core.entity;

import java.util.Date;

public class ForetasteApply {
    /**
     * 申请ID
     */
    private Long applyId;

    /**
     * 试吃ID
     */
    private Long foretasteId;

    /**
     * 猫咪品种
     */
    private String catBreed;

    /**
     * 猫咪年龄
     */
    private Integer catAge;

    /**
     * openId
     */
    private String openId;

    /**
     * 收件人姓名
     */
    private String recipienterName;

    /**
     * 收件人电话
     */
    private String recipienterPhone;

    /**
     * 收件人省份
     */
    private String recipienterProvince;

    /**
     * 收件人城市
     */
    private String recipienterCity;

    /**
     * 收件人区
     */
    private String recipienterArea;

    /**
     * 收件人区
     */
    private String recipienterStreet;

    /**
     * 收件人详细地址
     */
    private String recipienterDetailAddress;

    /**
     * 状态(0:待处理;1:已处理;2:已拒绝)
     */
    private Byte status;

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
     * 申请ID
     * @return apply_id 申请ID
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 申请ID
     * @param applyId 申请ID
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 试吃ID
     * @return foretaste_id 试吃ID
     */
    public Long getForetasteId() {
        return foretasteId;
    }

    /**
     * 试吃ID
     * @param foretasteId 试吃ID
     */
    public void setForetasteId(Long foretasteId) {
        this.foretasteId = foretasteId;
    }

    /**
     * 猫咪品种
     * @return cat_breed 猫咪品种
     */
    public String getCatBreed() {
        return catBreed;
    }

    /**
     * 猫咪品种
     * @param catBreed 猫咪品种
     */
    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed == null ? null : catBreed.trim();
    }

    /**
     * 猫咪年龄
     * @return cat_age 猫咪年龄
     */
    public Integer getCatAge() {
        return catAge;
    }

    /**
     * 猫咪年龄
     * @param catAge 猫咪年龄
     */
    public void setCatAge(Integer catAge) {
        this.catAge = catAge;
    }

    /**
     * openId
     * @return open_id openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * openId
     * @param openId openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 收件人姓名
     * @return recipienter_name 收件人姓名
     */
    public String getRecipienterName() {
        return recipienterName;
    }

    /**
     * 收件人姓名
     * @param recipienterName 收件人姓名
     */
    public void setRecipienterName(String recipienterName) {
        this.recipienterName = recipienterName == null ? null : recipienterName.trim();
    }

    /**
     * 收件人电话
     * @return recipienter_phone 收件人电话
     */
    public String getRecipienterPhone() {
        return recipienterPhone;
    }

    /**
     * 收件人电话
     * @param recipienterPhone 收件人电话
     */
    public void setRecipienterPhone(String recipienterPhone) {
        this.recipienterPhone = recipienterPhone == null ? null : recipienterPhone.trim();
    }

    /**
     * 收件人省份
     * @return recipienter_province 收件人省份
     */
    public String getRecipienterProvince() {
        return recipienterProvince;
    }

    /**
     * 收件人省份
     * @param recipienterProvince 收件人省份
     */
    public void setRecipienterProvince(String recipienterProvince) {
        this.recipienterProvince = recipienterProvince == null ? null : recipienterProvince.trim();
    }

    /**
     * 收件人城市
     * @return recipienter_city 收件人城市
     */
    public String getRecipienterCity() {
        return recipienterCity;
    }

    /**
     * 收件人城市
     * @param recipienterCity 收件人城市
     */
    public void setRecipienterCity(String recipienterCity) {
        this.recipienterCity = recipienterCity == null ? null : recipienterCity.trim();
    }

    /**
     * 收件人区
     * @return recipienter_area 收件人区
     */
    public String getRecipienterArea() {
        return recipienterArea;
    }

    /**
     * 收件人区
     * @param recipienterArea 收件人区
     */
    public void setRecipienterArea(String recipienterArea) {
        this.recipienterArea = recipienterArea == null ? null : recipienterArea.trim();
    }

    /**
     * 收件人区
     * @return recipienter_street 收件人区
     */
    public String getRecipienterStreet() {
        return recipienterStreet;
    }

    /**
     * 收件人区
     * @param recipienterStreet 收件人区
     */
    public void setRecipienterStreet(String recipienterStreet) {
        this.recipienterStreet = recipienterStreet == null ? null : recipienterStreet.trim();
    }

    /**
     * 收件人详细地址
     * @return recipienter_detail_address 收件人详细地址
     */
    public String getRecipienterDetailAddress() {
        return recipienterDetailAddress;
    }

    /**
     * 收件人详细地址
     * @param recipienterDetailAddress 收件人详细地址
     */
    public void setRecipienterDetailAddress(String recipienterDetailAddress) {
        this.recipienterDetailAddress = recipienterDetailAddress == null ? null : recipienterDetailAddress.trim();
    }

    /**
     * 状态(0:待处理;1:已处理;2:已拒绝)
     * @return status 状态(0:待处理;1:已处理;2:已拒绝)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态(0:待处理;1:已处理;2:已拒绝)
     * @param status 状态(0:待处理;1:已处理;2:已拒绝)
     */
    public void setStatus(Byte status) {
        this.status = status;
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