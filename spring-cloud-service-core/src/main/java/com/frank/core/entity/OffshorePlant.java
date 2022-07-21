package com.frank.core.entity;

import java.util.Date;

public class OffshorePlant {
    /**
     * 加工厂ID
     */
    private Long plantId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 加工厂名称
     */
    private String plantName;

    /**
     * 加工厂地址
     */
    private String plantAddress;

    /**
     * 加工厂介绍
     */
    private String plantIntroduction;

    /**
     * 生产批号
     */
    private String productionBatch;

    /**
     * 生产检测标准
     */
    private String inspectionStandard;

    /**
     * 生产检测时间
     */
    private Date inspectionTime;

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
     * 加工厂ID
     * @return plant_id 加工厂ID
     */
    public Long getPlantId() {
        return plantId;
    }

    /**
     * 加工厂ID
     * @param plantId 加工厂ID
     */
    public void setPlantId(Long plantId) {
        this.plantId = plantId;
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
     * 加工厂名称
     * @return plant_name 加工厂名称
     */
    public String getPlantName() {
        return plantName;
    }

    /**
     * 加工厂名称
     * @param plantName 加工厂名称
     */
    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
    }

    /**
     * 加工厂地址
     * @return plant_address 加工厂地址
     */
    public String getPlantAddress() {
        return plantAddress;
    }

    /**
     * 加工厂地址
     * @param plantAddress 加工厂地址
     */
    public void setPlantAddress(String plantAddress) {
        this.plantAddress = plantAddress == null ? null : plantAddress.trim();
    }

    /**
     * 加工厂介绍
     * @return plant_introduction 加工厂介绍
     */
    public String getPlantIntroduction() {
        return plantIntroduction;
    }

    /**
     * 加工厂介绍
     * @param plantIntroduction 加工厂介绍
     */
    public void setPlantIntroduction(String plantIntroduction) {
        this.plantIntroduction = plantIntroduction == null ? null : plantIntroduction.trim();
    }

    /**
     * 生产批号
     * @return production_batch 生产批号
     */
    public String getProductionBatch() {
        return productionBatch;
    }

    /**
     * 生产批号
     * @param productionBatch 生产批号
     */
    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch == null ? null : productionBatch.trim();
    }

    /**
     * 生产检测标准
     * @return inspection_standard 生产检测标准
     */
    public String getInspectionStandard() {
        return inspectionStandard;
    }

    /**
     * 生产检测标准
     * @param inspectionStandard 生产检测标准
     */
    public void setInspectionStandard(String inspectionStandard) {
        this.inspectionStandard = inspectionStandard == null ? null : inspectionStandard.trim();
    }

    /**
     * 生产检测时间
     * @return inspection_time 生产检测时间
     */
    public Date getInspectionTime() {
        return inspectionTime;
    }

    /**
     * 生产检测时间
     * @param inspectionTime 生产检测时间
     */
    public void setInspectionTime(Date inspectionTime) {
        this.inspectionTime = inspectionTime;
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