package com.frank.core.entity;

import java.util.Date;

public class PortRegulatory {
    /**
     * 监管ID
     */
    private Long regulatoryId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 监管机构名称
     */
    private String regulatoryAgencyName;

    /**
     * 监管机构地址
     */
    private String regulatoryAgencyAddress;

    /**
     * 监管机构电话
     */
    private String regulatoryAgencyPhone;

    /**
     * 检验检疫附件
     */
    private String inspectionQuarantineCertificateAttachment;

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
     * 监管ID
     * @return regulatory_id 监管ID
     */
    public Long getRegulatoryId() {
        return regulatoryId;
    }

    /**
     * 监管ID
     * @param regulatoryId 监管ID
     */
    public void setRegulatoryId(Long regulatoryId) {
        this.regulatoryId = regulatoryId;
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
     * 监管机构名称
     * @return regulatory_agency_name 监管机构名称
     */
    public String getRegulatoryAgencyName() {
        return regulatoryAgencyName;
    }

    /**
     * 监管机构名称
     * @param regulatoryAgencyName 监管机构名称
     */
    public void setRegulatoryAgencyName(String regulatoryAgencyName) {
        this.regulatoryAgencyName = regulatoryAgencyName == null ? null : regulatoryAgencyName.trim();
    }

    /**
     * 监管机构地址
     * @return regulatory_agency_address 监管机构地址
     */
    public String getRegulatoryAgencyAddress() {
        return regulatoryAgencyAddress;
    }

    /**
     * 监管机构地址
     * @param regulatoryAgencyAddress 监管机构地址
     */
    public void setRegulatoryAgencyAddress(String regulatoryAgencyAddress) {
        this.regulatoryAgencyAddress = regulatoryAgencyAddress == null ? null : regulatoryAgencyAddress.trim();
    }

    /**
     * 监管机构电话
     * @return regulatory_agency_phone 监管机构电话
     */
    public String getRegulatoryAgencyPhone() {
        return regulatoryAgencyPhone;
    }

    /**
     * 监管机构电话
     * @param regulatoryAgencyPhone 监管机构电话
     */
    public void setRegulatoryAgencyPhone(String regulatoryAgencyPhone) {
        this.regulatoryAgencyPhone = regulatoryAgencyPhone == null ? null : regulatoryAgencyPhone.trim();
    }

    /**
     * 检验检疫附件
     * @return inspection_quarantine_certificate_attachment 检验检疫附件
     */
    public String getInspectionQuarantineCertificateAttachment() {
        return inspectionQuarantineCertificateAttachment;
    }

    /**
     * 检验检疫附件
     * @param inspectionQuarantineCertificateAttachment 检验检疫附件
     */
    public void setInspectionQuarantineCertificateAttachment(String inspectionQuarantineCertificateAttachment) {
        this.inspectionQuarantineCertificateAttachment = inspectionQuarantineCertificateAttachment == null ? null : inspectionQuarantineCertificateAttachment.trim();
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