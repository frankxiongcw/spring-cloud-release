package com.frank.core.entity;

import java.util.Date;

public class Banner {
    /**
     * 主键
     */
    private Long bannerId;

    /**
     * 排序号
     */
    private Integer sortNo;

    /**
     * banner图片地址
     */
    private String bannerImg;

    /**
     * 跳转地址
     */
    private String redirectUrl;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     */
    private Byte bannerStatus;

    /**
     * 发布时间
     */
    private Date publishTime;

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
     * 主键
     * @return banner_id 主键
     */
    public Long getBannerId() {
        return bannerId;
    }

    /**
     * 主键
     * @param bannerId 主键
     */
    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * 排序号
     * @return sort_no 排序号
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 排序号
     * @param sortNo 排序号
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * banner图片地址
     * @return banner_img banner图片地址
     */
    public String getBannerImg() {
        return bannerImg;
    }

    /**
     * banner图片地址
     * @param bannerImg banner图片地址
     */
    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg == null ? null : bannerImg.trim();
    }

    /**
     * 跳转地址
     * @return redirect_url 跳转地址
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 跳转地址
     * @param redirectUrl 跳转地址
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @return banner_status 状态(0:待发布;1:已发布;2:已下架)
     */
    public Byte getBannerStatus() {
        return bannerStatus;
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @param bannerStatus 状态(0:待发布;1:已发布;2:已下架)
     */
    public void setBannerStatus(Byte bannerStatus) {
        this.bannerStatus = bannerStatus;
    }

    /**
     * 发布时间
     * @return publish_time 发布时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 发布时间
     * @param publishTime 发布时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
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