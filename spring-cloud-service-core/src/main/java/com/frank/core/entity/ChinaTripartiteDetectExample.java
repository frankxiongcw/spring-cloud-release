package com.frank.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChinaTripartiteDetectExample {
    /**
     * tb_china_tripartite_detect
     */
    protected String orderByClause;

    /**
     * tb_china_tripartite_detect
     */
    protected boolean distinct;

    /**
     * tb_china_tripartite_detect
     */
    protected List<Criteria> oredCriteria;

    public ChinaTripartiteDetectExample() {
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
     * tb_china_tripartite_detect 2022-07-21
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

        public Criteria andTripartiteIdIsNull() {
            addCriterion("tripartite_id is null");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdIsNotNull() {
            addCriterion("tripartite_id is not null");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdEqualTo(Long value) {
            addCriterion("tripartite_id =", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdNotEqualTo(Long value) {
            addCriterion("tripartite_id <>", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdGreaterThan(Long value) {
            addCriterion("tripartite_id >", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tripartite_id >=", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdLessThan(Long value) {
            addCriterion("tripartite_id <", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdLessThanOrEqualTo(Long value) {
            addCriterion("tripartite_id <=", value, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdIn(List<Long> values) {
            addCriterion("tripartite_id in", values, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdNotIn(List<Long> values) {
            addCriterion("tripartite_id not in", values, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdBetween(Long value1, Long value2) {
            addCriterion("tripartite_id between", value1, value2, "tripartiteId");
            return (Criteria) this;
        }

        public Criteria andTripartiteIdNotBetween(Long value1, Long value2) {
            addCriterion("tripartite_id not between", value1, value2, "tripartiteId");
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

        public Criteria andDetectAgencyNameIsNull() {
            addCriterion("detect_agency_name is null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameIsNotNull() {
            addCriterion("detect_agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameEqualTo(String value) {
            addCriterion("detect_agency_name =", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameNotEqualTo(String value) {
            addCriterion("detect_agency_name <>", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameGreaterThan(String value) {
            addCriterion("detect_agency_name >", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("detect_agency_name >=", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameLessThan(String value) {
            addCriterion("detect_agency_name <", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("detect_agency_name <=", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameLike(String value) {
            addCriterion("detect_agency_name like", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameNotLike(String value) {
            addCriterion("detect_agency_name not like", value, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameIn(List<String> values) {
            addCriterion("detect_agency_name in", values, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameNotIn(List<String> values) {
            addCriterion("detect_agency_name not in", values, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameBetween(String value1, String value2) {
            addCriterion("detect_agency_name between", value1, value2, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyNameNotBetween(String value1, String value2) {
            addCriterion("detect_agency_name not between", value1, value2, "detectAgencyName");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressIsNull() {
            addCriterion("detect_agency_address is null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressIsNotNull() {
            addCriterion("detect_agency_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressEqualTo(String value) {
            addCriterion("detect_agency_address =", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressNotEqualTo(String value) {
            addCriterion("detect_agency_address <>", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressGreaterThan(String value) {
            addCriterion("detect_agency_address >", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detect_agency_address >=", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressLessThan(String value) {
            addCriterion("detect_agency_address <", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressLessThanOrEqualTo(String value) {
            addCriterion("detect_agency_address <=", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressLike(String value) {
            addCriterion("detect_agency_address like", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressNotLike(String value) {
            addCriterion("detect_agency_address not like", value, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressIn(List<String> values) {
            addCriterion("detect_agency_address in", values, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressNotIn(List<String> values) {
            addCriterion("detect_agency_address not in", values, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressBetween(String value1, String value2) {
            addCriterion("detect_agency_address between", value1, value2, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyAddressNotBetween(String value1, String value2) {
            addCriterion("detect_agency_address not between", value1, value2, "detectAgencyAddress");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionIsNull() {
            addCriterion("detect_agency_introduction is null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionIsNotNull() {
            addCriterion("detect_agency_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionEqualTo(String value) {
            addCriterion("detect_agency_introduction =", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionNotEqualTo(String value) {
            addCriterion("detect_agency_introduction <>", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionGreaterThan(String value) {
            addCriterion("detect_agency_introduction >", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("detect_agency_introduction >=", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionLessThan(String value) {
            addCriterion("detect_agency_introduction <", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionLessThanOrEqualTo(String value) {
            addCriterion("detect_agency_introduction <=", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionLike(String value) {
            addCriterion("detect_agency_introduction like", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionNotLike(String value) {
            addCriterion("detect_agency_introduction not like", value, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionIn(List<String> values) {
            addCriterion("detect_agency_introduction in", values, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionNotIn(List<String> values) {
            addCriterion("detect_agency_introduction not in", values, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionBetween(String value1, String value2) {
            addCriterion("detect_agency_introduction between", value1, value2, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectAgencyIntroductionNotBetween(String value1, String value2) {
            addCriterion("detect_agency_introduction not between", value1, value2, "detectAgencyIntroduction");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIsNull() {
            addCriterion("detect_time is null");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIsNotNull() {
            addCriterion("detect_time is not null");
            return (Criteria) this;
        }

        public Criteria andDetectTimeEqualTo(Date value) {
            addCriterion("detect_time =", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotEqualTo(Date value) {
            addCriterion("detect_time <>", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeGreaterThan(Date value) {
            addCriterion("detect_time >", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("detect_time >=", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeLessThan(Date value) {
            addCriterion("detect_time <", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeLessThanOrEqualTo(Date value) {
            addCriterion("detect_time <=", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIn(List<Date> values) {
            addCriterion("detect_time in", values, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotIn(List<Date> values) {
            addCriterion("detect_time not in", values, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeBetween(Date value1, Date value2) {
            addCriterion("detect_time between", value1, value2, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotBetween(Date value1, Date value2) {
            addCriterion("detect_time not between", value1, value2, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentIsNull() {
            addCriterion("detect_attachment is null");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentIsNotNull() {
            addCriterion("detect_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentEqualTo(String value) {
            addCriterion("detect_attachment =", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentNotEqualTo(String value) {
            addCriterion("detect_attachment <>", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentGreaterThan(String value) {
            addCriterion("detect_attachment >", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("detect_attachment >=", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentLessThan(String value) {
            addCriterion("detect_attachment <", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentLessThanOrEqualTo(String value) {
            addCriterion("detect_attachment <=", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentLike(String value) {
            addCriterion("detect_attachment like", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentNotLike(String value) {
            addCriterion("detect_attachment not like", value, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentIn(List<String> values) {
            addCriterion("detect_attachment in", values, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentNotIn(List<String> values) {
            addCriterion("detect_attachment not in", values, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentBetween(String value1, String value2) {
            addCriterion("detect_attachment between", value1, value2, "detectAttachment");
            return (Criteria) this;
        }

        public Criteria andDetectAttachmentNotBetween(String value1, String value2) {
            addCriterion("detect_attachment not between", value1, value2, "detectAttachment");
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
     * tb_china_tripartite_detect
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * tb_china_tripartite_detect 2022-07-21
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