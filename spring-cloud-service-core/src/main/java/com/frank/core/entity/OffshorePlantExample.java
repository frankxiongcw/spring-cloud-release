package com.frank.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OffshorePlantExample {
    /**
     * tb_offshore_plant
     */
    protected String orderByClause;

    /**
     * tb_offshore_plant
     */
    protected boolean distinct;

    /**
     * tb_offshore_plant
     */
    protected List<Criteria> oredCriteria;

    public OffshorePlantExample() {
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
     * tb_offshore_plant 2022-07-21
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

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(Long value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(Long value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(Long value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(Long value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(Long value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<Long> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<Long> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(Long value1, Long value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(Long value1, Long value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
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

        public Criteria andPlantNameIsNull() {
            addCriterion("plant_name is null");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNotNull() {
            addCriterion("plant_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNameEqualTo(String value) {
            addCriterion("plant_name =", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotEqualTo(String value) {
            addCriterion("plant_name <>", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThan(String value) {
            addCriterion("plant_name >", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_name >=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThan(String value) {
            addCriterion("plant_name <", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThanOrEqualTo(String value) {
            addCriterion("plant_name <=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLike(String value) {
            addCriterion("plant_name like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotLike(String value) {
            addCriterion("plant_name not like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameIn(List<String> values) {
            addCriterion("plant_name in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotIn(List<String> values) {
            addCriterion("plant_name not in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameBetween(String value1, String value2) {
            addCriterion("plant_name between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotBetween(String value1, String value2) {
            addCriterion("plant_name not between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantAddressIsNull() {
            addCriterion("plant_address is null");
            return (Criteria) this;
        }

        public Criteria andPlantAddressIsNotNull() {
            addCriterion("plant_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlantAddressEqualTo(String value) {
            addCriterion("plant_address =", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressNotEqualTo(String value) {
            addCriterion("plant_address <>", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressGreaterThan(String value) {
            addCriterion("plant_address >", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressGreaterThanOrEqualTo(String value) {
            addCriterion("plant_address >=", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressLessThan(String value) {
            addCriterion("plant_address <", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressLessThanOrEqualTo(String value) {
            addCriterion("plant_address <=", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressLike(String value) {
            addCriterion("plant_address like", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressNotLike(String value) {
            addCriterion("plant_address not like", value, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressIn(List<String> values) {
            addCriterion("plant_address in", values, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressNotIn(List<String> values) {
            addCriterion("plant_address not in", values, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressBetween(String value1, String value2) {
            addCriterion("plant_address between", value1, value2, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantAddressNotBetween(String value1, String value2) {
            addCriterion("plant_address not between", value1, value2, "plantAddress");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionIsNull() {
            addCriterion("plant_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionIsNotNull() {
            addCriterion("plant_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionEqualTo(String value) {
            addCriterion("plant_introduction =", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionNotEqualTo(String value) {
            addCriterion("plant_introduction <>", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionGreaterThan(String value) {
            addCriterion("plant_introduction >", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("plant_introduction >=", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionLessThan(String value) {
            addCriterion("plant_introduction <", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionLessThanOrEqualTo(String value) {
            addCriterion("plant_introduction <=", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionLike(String value) {
            addCriterion("plant_introduction like", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionNotLike(String value) {
            addCriterion("plant_introduction not like", value, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionIn(List<String> values) {
            addCriterion("plant_introduction in", values, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionNotIn(List<String> values) {
            addCriterion("plant_introduction not in", values, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionBetween(String value1, String value2) {
            addCriterion("plant_introduction between", value1, value2, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andPlantIntroductionNotBetween(String value1, String value2) {
            addCriterion("plant_introduction not between", value1, value2, "plantIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNull() {
            addCriterion("production_batch is null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNotNull() {
            addCriterion("production_batch is not null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchEqualTo(String value) {
            addCriterion("production_batch =", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotEqualTo(String value) {
            addCriterion("production_batch <>", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThan(String value) {
            addCriterion("production_batch >", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThanOrEqualTo(String value) {
            addCriterion("production_batch >=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThan(String value) {
            addCriterion("production_batch <", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThanOrEqualTo(String value) {
            addCriterion("production_batch <=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLike(String value) {
            addCriterion("production_batch like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotLike(String value) {
            addCriterion("production_batch not like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIn(List<String> values) {
            addCriterion("production_batch in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotIn(List<String> values) {
            addCriterion("production_batch not in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchBetween(String value1, String value2) {
            addCriterion("production_batch between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotBetween(String value1, String value2) {
            addCriterion("production_batch not between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardIsNull() {
            addCriterion("inspection_standard is null");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardIsNotNull() {
            addCriterion("inspection_standard is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardEqualTo(String value) {
            addCriterion("inspection_standard =", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardNotEqualTo(String value) {
            addCriterion("inspection_standard <>", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardGreaterThan(String value) {
            addCriterion("inspection_standard >", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_standard >=", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardLessThan(String value) {
            addCriterion("inspection_standard <", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardLessThanOrEqualTo(String value) {
            addCriterion("inspection_standard <=", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardLike(String value) {
            addCriterion("inspection_standard like", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardNotLike(String value) {
            addCriterion("inspection_standard not like", value, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardIn(List<String> values) {
            addCriterion("inspection_standard in", values, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardNotIn(List<String> values) {
            addCriterion("inspection_standard not in", values, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardBetween(String value1, String value2) {
            addCriterion("inspection_standard between", value1, value2, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionStandardNotBetween(String value1, String value2) {
            addCriterion("inspection_standard not between", value1, value2, "inspectionStandard");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeIsNull() {
            addCriterion("inspection_time is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeIsNotNull() {
            addCriterion("inspection_time is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeEqualTo(Date value) {
            addCriterion("inspection_time =", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotEqualTo(Date value) {
            addCriterion("inspection_time <>", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeGreaterThan(Date value) {
            addCriterion("inspection_time >", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inspection_time >=", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeLessThan(Date value) {
            addCriterion("inspection_time <", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("inspection_time <=", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeIn(List<Date> values) {
            addCriterion("inspection_time in", values, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotIn(List<Date> values) {
            addCriterion("inspection_time not in", values, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeBetween(Date value1, Date value2) {
            addCriterion("inspection_time between", value1, value2, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("inspection_time not between", value1, value2, "inspectionTime");
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
     * tb_offshore_plant
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * tb_offshore_plant 2022-07-21
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