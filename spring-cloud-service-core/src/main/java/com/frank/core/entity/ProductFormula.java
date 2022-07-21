package com.frank.core.entity;

import java.util.Date;

public class ProductFormula {
    /**
     * 配方ID
     */
    private Long formulaId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 配方比例
     */
    private String formulaProportion;

    /**
     * 配方成分
     */
    private String formulaIngredient;

    /**
     * 配方描述
     */
    private String formulaDescription;

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
     * 配方ID
     * @return formula_id 配方ID
     */
    public Long getFormulaId() {
        return formulaId;
    }

    /**
     * 配方ID
     * @param formulaId 配方ID
     */
    public void setFormulaId(Long formulaId) {
        this.formulaId = formulaId;
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
     * 配方比例
     * @return formula_proportion 配方比例
     */
    public String getFormulaProportion() {
        return formulaProportion;
    }

    /**
     * 配方比例
     * @param formulaProportion 配方比例
     */
    public void setFormulaProportion(String formulaProportion) {
        this.formulaProportion = formulaProportion == null ? null : formulaProportion.trim();
    }

    /**
     * 配方成分
     * @return formula_ingredient 配方成分
     */
    public String getFormulaIngredient() {
        return formulaIngredient;
    }

    /**
     * 配方成分
     * @param formulaIngredient 配方成分
     */
    public void setFormulaIngredient(String formulaIngredient) {
        this.formulaIngredient = formulaIngredient == null ? null : formulaIngredient.trim();
    }

    /**
     * 配方描述
     * @return formula_description 配方描述
     */
    public String getFormulaDescription() {
        return formulaDescription;
    }

    /**
     * 配方描述
     * @param formulaDescription 配方描述
     */
    public void setFormulaDescription(String formulaDescription) {
        this.formulaDescription = formulaDescription == null ? null : formulaDescription.trim();
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