package com.frank.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFormulaExample {
    /**
     * tb_product_formula
     */
    protected String orderByClause;

    /**
     * tb_product_formula
     */
    protected boolean distinct;

    /**
     * tb_product_formula
     */
    protected List<Criteria> oredCriteria;

    public ProductFormulaExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * tb_product_formula 2022-07-21
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFormulaIdIsNull() {
            addCriterion("formula_id is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIsNotNull() {
            addCriterion("formula_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdEqualTo(Long value) {
            addCriterion("formula_id =", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotEqualTo(Long value) {
            addCriterion("formula_id <>", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThan(Long value) {
            addCriterion("formula_id >", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("formula_id >=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThan(Long value) {
            addCriterion("formula_id <", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThanOrEqualTo(Long value) {
            addCriterion("formula_id <=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIn(List<Long> values) {
            addCriterion("formula_id in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotIn(List<Long> values) {
            addCriterion("formula_id not in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdBetween(Long value1, Long value2) {
            addCriterion("formula_id between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotBetween(Long value1, Long value2) {
            addCriterion("formula_id not between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionIsNull() {
            addCriterion("formula_proportion is null");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionIsNotNull() {
            addCriterion("formula_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionEqualTo(String value) {
            addCriterion("formula_proportion =", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionNotEqualTo(String value) {
            addCriterion("formula_proportion <>", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionGreaterThan(String value) {
            addCriterion("formula_proportion >", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionGreaterThanOrEqualTo(String value) {
            addCriterion("formula_proportion >=", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionLessThan(String value) {
            addCriterion("formula_proportion <", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionLessThanOrEqualTo(String value) {
            addCriterion("formula_proportion <=", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionLike(String value) {
            addCriterion("formula_proportion like", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionNotLike(String value) {
            addCriterion("formula_proportion not like", value, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionIn(List<String> values) {
            addCriterion("formula_proportion in", values, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionNotIn(List<String> values) {
            addCriterion("formula_proportion not in", values, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionBetween(String value1, String value2) {
            addCriterion("formula_proportion between", value1, value2, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaProportionNotBetween(String value1, String value2) {
            addCriterion("formula_proportion not between", value1, value2, "formulaProportion");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientIsNull() {
            addCriterion("formula_ingredient is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientIsNotNull() {
            addCriterion("formula_ingredient is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientEqualTo(String value) {
            addCriterion("formula_ingredient =", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientNotEqualTo(String value) {
            addCriterion("formula_ingredient <>", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientGreaterThan(String value) {
            addCriterion("formula_ingredient >", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientGreaterThanOrEqualTo(String value) {
            addCriterion("formula_ingredient >=", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientLessThan(String value) {
            addCriterion("formula_ingredient <", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientLessThanOrEqualTo(String value) {
            addCriterion("formula_ingredient <=", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientLike(String value) {
            addCriterion("formula_ingredient like", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientNotLike(String value) {
            addCriterion("formula_ingredient not like", value, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientIn(List<String> values) {
            addCriterion("formula_ingredient in", values, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientNotIn(List<String> values) {
            addCriterion("formula_ingredient not in", values, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientBetween(String value1, String value2) {
            addCriterion("formula_ingredient between", value1, value2, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaIngredientNotBetween(String value1, String value2) {
            addCriterion("formula_ingredient not between", value1, value2, "formulaIngredient");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionIsNull() {
            addCriterion("formula_description is null");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionIsNotNull() {
            addCriterion("formula_description is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionEqualTo(String value) {
            addCriterion("formula_description =", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionNotEqualTo(String value) {
            addCriterion("formula_description <>", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionGreaterThan(String value) {
            addCriterion("formula_description >", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("formula_description >=", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionLessThan(String value) {
            addCriterion("formula_description <", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("formula_description <=", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionLike(String value) {
            addCriterion("formula_description like", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionNotLike(String value) {
            addCriterion("formula_description not like", value, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionIn(List<String> values) {
            addCriterion("formula_description in", values, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionNotIn(List<String> values) {
            addCriterion("formula_description not in", values, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionBetween(String value1, String value2) {
            addCriterion("formula_description between", value1, value2, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andFormulaDescriptionNotBetween(String value1, String value2) {
            addCriterion("formula_description not between", value1, value2, "formulaDescription");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }
    }

    /**
     * tb_product_formula
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * tb_product_formula 2022-07-21
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}