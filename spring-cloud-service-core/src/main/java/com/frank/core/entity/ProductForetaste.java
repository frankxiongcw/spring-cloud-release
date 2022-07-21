package com.frank.core.entity;

import java.util.Date;

public class ProductForetaste {
    /**
     * 试吃ID
     */
    private Long foretasteId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 试吃Title
     */
    private String foretasteTitle;

    /**
     * 试吃描述
     */
    private String foretasteDescription;

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
     * 产品名称
     * @return product_name 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品名称
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 试吃Title
     * @return foretaste_title 试吃Title
     */
    public String getForetasteTitle() {
        return foretasteTitle;
    }

    /**
     * 试吃Title
     * @param foretasteTitle 试吃Title
     */
    public void setForetasteTitle(String foretasteTitle) {
        this.foretasteTitle = foretasteTitle == null ? null : foretasteTitle.trim();
    }

    /**
     * 试吃描述
     * @return foretaste_description 试吃描述
     */
    public String getForetasteDescription() {
        return foretasteDescription;
    }

    /**
     * 试吃描述
     * @param foretasteDescription 试吃描述
     */
    public void setForetasteDescription(String foretasteDescription) {
        this.foretasteDescription = foretasteDescription == null ? null : foretasteDescription.trim();
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