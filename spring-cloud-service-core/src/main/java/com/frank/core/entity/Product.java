package com.frank.core.entity;

import java.util.Date;

public class Product {
    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品图片
     */
    private String productImg;

    /**
     * 产品视频
     */
    private String productVideo;

    /**
     * 产地
     */
    private String originPlace;

    /**
     * 规格
     */
    private String specification;

    /**
     * 保质期
     */
    private String shelfLife;

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
     * 产品图片
     * @return product_img 产品图片
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * 产品图片
     * @param productImg 产品图片
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    /**
     * 产品视频
     * @return product_video 产品视频
     */
    public String getProductVideo() {
        return productVideo;
    }

    /**
     * 产品视频
     * @param productVideo 产品视频
     */
    public void setProductVideo(String productVideo) {
        this.productVideo = productVideo == null ? null : productVideo.trim();
    }

    /**
     * 产地
     * @return origin_place 产地
     */
    public String getOriginPlace() {
        return originPlace;
    }

    /**
     * 产地
     * @param originPlace 产地
     */
    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace == null ? null : originPlace.trim();
    }

    /**
     * 规格
     * @return specification 规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 规格
     * @param specification 规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * 保质期
     * @return shelf_life 保质期
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * 保质期
     * @param shelfLife 保质期
     */
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife == null ? null : shelfLife.trim();
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