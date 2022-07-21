package com.frank.core.entity;

import java.util.Date;

public class ImportClearanceInfo {
    /**
     * 检测机构ID
     */
    private Long infoId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 境内收货人
     */
    private String domesticConsignee;

    /**
     * 消费使用单位
     */
    private String consumptionUnit;

    /**
     * 进境关别
     */
    private String entryCustoms;

    /**
     * 运输方式
     */
    private String transportMode;

    /**
     * 进境时间
     */
    private Date entryTime;

    /**
     * 申报日期
     */
    private Date declareTime;

    /**
     * 货物存放地点
     */
    private String cargoStorageLocation;

    /**
     * 启运国（地区）
     */
    private String departureCountry;

    /**
     * 经停港
     */
    private String stopPort;

    /**
     * 入境口岸
     */
    private String entryPort;

    /**
     * 申报单位
     */
    private String declareUnit;

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
     * @return info_id 检测机构ID
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * 检测机构ID
     * @param infoId 检测机构ID
     */
    public void setInfoId(Long infoId) {
        this.infoId = infoId;
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
     * 境内收货人
     * @return domestic_consignee 境内收货人
     */
    public String getDomesticConsignee() {
        return domesticConsignee;
    }

    /**
     * 境内收货人
     * @param domesticConsignee 境内收货人
     */
    public void setDomesticConsignee(String domesticConsignee) {
        this.domesticConsignee = domesticConsignee == null ? null : domesticConsignee.trim();
    }

    /**
     * 消费使用单位
     * @return consumption_unit 消费使用单位
     */
    public String getConsumptionUnit() {
        return consumptionUnit;
    }

    /**
     * 消费使用单位
     * @param consumptionUnit 消费使用单位
     */
    public void setConsumptionUnit(String consumptionUnit) {
        this.consumptionUnit = consumptionUnit == null ? null : consumptionUnit.trim();
    }

    /**
     * 进境关别
     * @return entry_customs 进境关别
     */
    public String getEntryCustoms() {
        return entryCustoms;
    }

    /**
     * 进境关别
     * @param entryCustoms 进境关别
     */
    public void setEntryCustoms(String entryCustoms) {
        this.entryCustoms = entryCustoms == null ? null : entryCustoms.trim();
    }

    /**
     * 运输方式
     * @return transport_mode 运输方式
     */
    public String getTransportMode() {
        return transportMode;
    }

    /**
     * 运输方式
     * @param transportMode 运输方式
     */
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode == null ? null : transportMode.trim();
    }

    /**
     * 进境时间
     * @return entry_time 进境时间
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * 进境时间
     * @param entryTime 进境时间
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * 申报日期
     * @return declare_time 申报日期
     */
    public Date getDeclareTime() {
        return declareTime;
    }

    /**
     * 申报日期
     * @param declareTime 申报日期
     */
    public void setDeclareTime(Date declareTime) {
        this.declareTime = declareTime;
    }

    /**
     * 货物存放地点
     * @return cargo_storage_location 货物存放地点
     */
    public String getCargoStorageLocation() {
        return cargoStorageLocation;
    }

    /**
     * 货物存放地点
     * @param cargoStorageLocation 货物存放地点
     */
    public void setCargoStorageLocation(String cargoStorageLocation) {
        this.cargoStorageLocation = cargoStorageLocation == null ? null : cargoStorageLocation.trim();
    }

    /**
     * 启运国（地区）
     * @return departure_country 启运国（地区）
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /**
     * 启运国（地区）
     * @param departureCountry 启运国（地区）
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry == null ? null : departureCountry.trim();
    }

    /**
     * 经停港
     * @return stop_port 经停港
     */
    public String getStopPort() {
        return stopPort;
    }

    /**
     * 经停港
     * @param stopPort 经停港
     */
    public void setStopPort(String stopPort) {
        this.stopPort = stopPort == null ? null : stopPort.trim();
    }

    /**
     * 入境口岸
     * @return entry_port 入境口岸
     */
    public String getEntryPort() {
        return entryPort;
    }

    /**
     * 入境口岸
     * @param entryPort 入境口岸
     */
    public void setEntryPort(String entryPort) {
        this.entryPort = entryPort == null ? null : entryPort.trim();
    }

    /**
     * 申报单位
     * @return declare_unit 申报单位
     */
    public String getDeclareUnit() {
        return declareUnit;
    }

    /**
     * 申报单位
     * @param declareUnit 申报单位
     */
    public void setDeclareUnit(String declareUnit) {
        this.declareUnit = declareUnit == null ? null : declareUnit.trim();
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