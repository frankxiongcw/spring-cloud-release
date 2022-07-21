package com.frank.core.entity;

import java.util.Date;

public class ChinaTripartiteDetect {
    /**
     * ID
     */
    private Long tripartiteId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 检测机构名称
     */
    private String detectAgencyName;

    /**
     * 检测机构地址
     */
    private String detectAgencyAddress;

    /**
     * 检测机构介绍
     */
    private String detectAgencyIntroduction;

    /**
     * 检验时间
     */
    private Date detectTime;

    /**
     * 检测证明附件
     */
    private String detectAttachment;

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
     * ID
     * @return tripartite_id ID
     */
    public Long getTripartiteId() {
        return tripartiteId;
    }

    /**
     * ID
     * @param tripartiteId ID
     */
    public void setTripartiteId(Long tripartiteId) {
        this.tripartiteId = tripartiteId;
    }

    /**
     * 产品ID
     * @return product_id 产品ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 产品ID
     * @param productId 产品ID
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 批次号
     * @return batch_no 批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 批次号
     * @param batchNo 批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * 检测机构名称
     * @return detect_agency_name 检测机构名称
     */
    public String getDetectAgencyName() {
        return detectAgencyName;
    }

    /**
     * 检测机构名称
     * @param detectAgencyName 检测机构名称
     */
    public void setDetectAgencyName(String detectAgencyName) {
        this.detectAgencyName = detectAgencyName == null ? null : detectAgencyName.trim();
    }

    /**
     * 检测机构地址
     * @return detect_agency_address 检测机构地址
     */
    public String getDetectAgencyAddress() {
        return detectAgencyAddress;
    }

    /**
     * 检测机构地址
     * @param detectAgencyAddress 检测机构地址
     */
    public void setDetectAgencyAddress(String detectAgencyAddress) {
        this.detectAgencyAddress = detectAgencyAddress == null ? null : detectAgencyAddress.trim();
    }

    /**
     * 检测机构介绍
     * @return detect_agency_introduction 检测机构介绍
     */
    public String getDetectAgencyIntroduction() {
        return detectAgencyIntroduction;
    }

    /**
     * 检测机构介绍
     * @param detectAgencyIntroduction 检测机构介绍
     */
    public void setDetectAgencyIntroduction(String detectAgencyIntroduction) {
        this.detectAgencyIntroduction = detectAgencyIntroduction == null ? null : detectAgencyIntroduction.trim();
    }

    /**
     * 检验时间
     * @return detect_time 检验时间
     */
    public Date getDetectTime() {
        return detectTime;
    }

    /**
     * 检验时间
     * @param detectTime 检验时间
     */
    public void setDetectTime(Date detectTime) {
        this.detectTime = detectTime;
    }

    /**
     * 检测证明附件
     * @return detect_attachment 检测证明附件
     */
    public String getDetectAttachment() {
        return detectAttachment;
    }

    /**
     * 检测证明附件
     * @param detectAttachment 检测证明附件
     */
    public void setDetectAttachment(String detectAttachment) {
        this.detectAttachment = detectAttachment == null ? null : detectAttachment.trim();
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