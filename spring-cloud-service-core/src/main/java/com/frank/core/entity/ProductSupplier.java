package com.frank.core.entity;

import java.util.Date;

public class ProductSupplier {
    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 供应商类别
     */
    private Integer supplierType;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 供应商地址
     */
    private String supplierAddress;

    /**
     * 地址code
     */
    private String addressCode;

    /**
     * 供应商图片
     */
    private String supplierImg;

    /**
     * 描述
     */
    private String supplierDescription;

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
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
     * 供应商ID
     * @return supplier_id 供应商ID
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商ID
     * @param supplierId 供应商ID
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 供应商类别
     * @return supplier_type 供应商类别
     */
    public Integer getSupplierType() {
        return supplierType;
    }

    /**
     * 供应商类别
     * @param supplierType 供应商类别
     */
    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }

    /**
     * 供应商名称
     * @return supplier_name 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 供应商名称
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 供应商地址
     * @return supplier_address 供应商地址
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * 供应商地址
     * @param supplierAddress 供应商地址
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    /**
     * 地址code
     * @return address_code 地址code
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * 地址code
     * @param addressCode 地址code
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    /**
     * 供应商图片
     * @return supplier_img 供应商图片
     */
    public String getSupplierImg() {
        return supplierImg;
    }

    /**
     * 供应商图片
     * @param supplierImg 供应商图片
     */
    public void setSupplierImg(String supplierImg) {
        this.supplierImg = supplierImg == null ? null : supplierImg.trim();
    }

    /**
     * 描述
     * @return supplier_description 描述
     */
    public String getSupplierDescription() {
        return supplierDescription;
    }

    /**
     * 描述
     * @param supplierDescription 描述
     */
    public void setSupplierDescription(String supplierDescription) {
        this.supplierDescription = supplierDescription == null ? null : supplierDescription.trim();
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @return status 状态(0:待发布;1:已发布;2:已下架)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @param status 状态(0:待发布;1:已发布;2:已下架)
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