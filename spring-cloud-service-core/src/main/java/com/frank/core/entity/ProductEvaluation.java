package com.frank.core.entity;

import java.util.Date;

public class ProductEvaluation {
    /**
     * 产品ID
     */
    private Long evaluationId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 用户ID
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userImg;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 评价内容
     */
    private String evaluationContent;

    /**
     * 评价图片
     */
    private String evaluationImg;

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
     * @return evaluation_id 产品ID
     */
    public Long getEvaluationId() {
        return evaluationId;
    }

    /**
     * 产品ID
     * @param evaluationId 产品ID
     */
    public void setEvaluationId(Long evaluationId) {
        this.evaluationId = evaluationId;
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
     * 用户ID
     * @return user_name 用户ID
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户ID
     * @param userName 用户ID
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户头像
     * @return user_img 用户头像
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 用户头像
     * @param userImg 用户头像
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    /**
     * 评分
     * @return score 评分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 评分
     * @param score 评分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 评价内容
     * @return evaluation_content 评价内容
     */
    public String getEvaluationContent() {
        return evaluationContent;
    }

    /**
     * 评价内容
     * @param evaluationContent 评价内容
     */
    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    /**
     * 评价图片
     * @return evaluation_img 评价图片
     */
    public String getEvaluationImg() {
        return evaluationImg;
    }

    /**
     * 评价图片
     * @param evaluationImg 评价图片
     */
    public void setEvaluationImg(String evaluationImg) {
        this.evaluationImg = evaluationImg == null ? null : evaluationImg.trim();
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