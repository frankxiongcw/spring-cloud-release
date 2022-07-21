package com.frank.core.entity;

import java.util.Date;

public class Background {
    /**
     * 主键
     */
    private Long backgroundId;

    /**
     * 背景图片地址
     */
    private String backgroundImg;

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     */
    private Byte backgroundStatus;

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
     * @return background_id 主键
     */
    public Long getBackgroundId() {
        return backgroundId;
    }

    /**
     * 主键
     * @param backgroundId 主键
     */
    public void setBackgroundId(Long backgroundId) {
        this.backgroundId = backgroundId;
    }

    /**
     * 背景图片地址
     * @return background_img 背景图片地址
     */
    public String getBackgroundImg() {
        return backgroundImg;
    }

    /**
     * 背景图片地址
     * @param backgroundImg 背景图片地址
     */
    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg == null ? null : backgroundImg.trim();
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @return background_status 状态(0:待发布;1:已发布;2:已下架)
     */
    public Byte getBackgroundStatus() {
        return backgroundStatus;
    }

    /**
     * 状态(0:待发布;1:已发布;2:已下架)
     * @param backgroundStatus 状态(0:待发布;1:已发布;2:已下架)
     */
    public void setBackgroundStatus(Byte backgroundStatus) {
        this.backgroundStatus = backgroundStatus;
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