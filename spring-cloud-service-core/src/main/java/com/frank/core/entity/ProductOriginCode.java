package com.frank.core.entity;

import java.util.Date;

public class ProductOriginCode {
    /**
     * 主键ID
     */
    private Long codeId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 溯源码
     */
    private String originCode;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 到期日期
     */
    private String expireTime;

    /**
     * 经销商ID
     */
    private String dealerId;

    /**
     * 产品编号
     */
    private String productNum;

    /**
     * 状态(0:核销;1:已核销)
     */
    private Byte status;

    /**
     * 溯源用户open_id
     */
    private String openId;

    /**
     * 溯源次数
     */
    private Integer investigateTimes;

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
     * 主键ID
     * @return code_id 主键ID
     */
    public Long getCodeId() {
        return codeId;
    }

    /**
     * 主键ID
     * @param codeId 主键ID
     */
    public void setCodeId(Long codeId) {
        this.codeId = codeId;
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
     * 溯源码
     * @return origin_code 溯源码
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * 溯源码
     * @param originCode 溯源码
     */
    public void setOriginCode(String originCode) {
        this.originCode = originCode == null ? null : originCode.trim();
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
     * 到期日期
     * @return expire_time 到期日期
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * 到期日期
     * @param expireTime 到期日期
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime == null ? null : expireTime.trim();
    }

    /**
     * 经销商ID
     * @return dealer_id 经销商ID
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 经销商ID
     * @param dealerId 经销商ID
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    /**
     * 产品编号
     * @return product_num 产品编号
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * 产品编号
     * @param productNum 产品编号
     */
    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    /**
     * 状态(0:核销;1:已核销)
     * @return status 状态(0:核销;1:已核销)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态(0:核销;1:已核销)
     * @param status 状态(0:核销;1:已核销)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 溯源用户open_id
     * @return open_id 溯源用户open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 溯源用户open_id
     * @param openId 溯源用户open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 溯源次数
     * @return investigate_times 溯源次数
     */
    public Integer getInvestigateTimes() {
        return investigateTimes;
    }

    /**
     * 溯源次数
     * @param investigateTimes 溯源次数
     */
    public void setInvestigateTimes(Integer investigateTimes) {
        this.investigateTimes = investigateTimes;
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