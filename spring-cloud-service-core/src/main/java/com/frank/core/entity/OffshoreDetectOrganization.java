package com.frank.core.entity;

import java.util.Date;

public class OffshoreDetectOrganization {
    /**
     * 检测机构ID
     */
    private Long organizationId;

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
    private String organizationName;

    /**
     * 检测机构地址
     */
    private String organizationAddress;

    /**
     * 检测机构电话
     */
    private String organizationPhone;

    /**
     * 检测机构附件
     */
    private String organizationAttachment;

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
     * 检测机构ID
     * @return organization_id 检测机构ID
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * 检测机构ID
     * @param organizationId 检测机构ID
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
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
     * @return organization_name 检测机构名称
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 检测机构名称
     * @param organizationName 检测机构名称
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    /**
     * 检测机构地址
     * @return organization_address 检测机构地址
     */
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * 检测机构地址
     * @param organizationAddress 检测机构地址
     */
    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress == null ? null : organizationAddress.trim();
    }

    /**
     * 检测机构电话
     * @return organization_phone 检测机构电话
     */
    public String getOrganizationPhone() {
        return organizationPhone;
    }

    /**
     * 检测机构电话
     * @param organizationPhone 检测机构电话
     */
    public void setOrganizationPhone(String organizationPhone) {
        this.organizationPhone = organizationPhone == null ? null : organizationPhone.trim();
    }

    /**
     * 检测机构附件
     * @return organization_attachment 检测机构附件
     */
    public String getOrganizationAttachment() {
        return organizationAttachment;
    }

    /**
     * 检测机构附件
     * @param organizationAttachment 检测机构附件
     */
    public void setOrganizationAttachment(String organizationAttachment) {
        this.organizationAttachment = organizationAttachment == null ? null : organizationAttachment.trim();
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