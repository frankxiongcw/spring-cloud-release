package com.frank.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForetasteApplyExample {
    /**
     * tb_foretaste_apply
     */
    protected String orderByClause;

    /**
     * tb_foretaste_apply
     */
    protected boolean distinct;

    /**
     * tb_foretaste_apply
     */
    protected List<Criteria> oredCriteria;

    public ForetasteApplyExample() {
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
     * tb_foretaste_apply 2022-07-21
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Long value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Long value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Long value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Long value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Long> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Long> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Long value1, Long value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdIsNull() {
            addCriterion("foretaste_id is null");
            return (Criteria) this;
        }

        public Criteria andForetasteIdIsNotNull() {
            addCriterion("foretaste_id is not null");
            return (Criteria) this;
        }

        public Criteria andForetasteIdEqualTo(Long value) {
            addCriterion("foretaste_id =", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdNotEqualTo(Long value) {
            addCriterion("foretaste_id <>", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdGreaterThan(Long value) {
            addCriterion("foretaste_id >", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("foretaste_id >=", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdLessThan(Long value) {
            addCriterion("foretaste_id <", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdLessThanOrEqualTo(Long value) {
            addCriterion("foretaste_id <=", value, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdIn(List<Long> values) {
            addCriterion("foretaste_id in", values, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdNotIn(List<Long> values) {
            addCriterion("foretaste_id not in", values, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdBetween(Long value1, Long value2) {
            addCriterion("foretaste_id between", value1, value2, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andForetasteIdNotBetween(Long value1, Long value2) {
            addCriterion("foretaste_id not between", value1, value2, "foretasteId");
            return (Criteria) this;
        }

        public Criteria andCatBreedIsNull() {
            addCriterion("cat_breed is null");
            return (Criteria) this;
        }

        public Criteria andCatBreedIsNotNull() {
            addCriterion("cat_breed is not null");
            return (Criteria) this;
        }

        public Criteria andCatBreedEqualTo(String value) {
            addCriterion("cat_breed =", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedNotEqualTo(String value) {
            addCriterion("cat_breed <>", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedGreaterThan(String value) {
            addCriterion("cat_breed >", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedGreaterThanOrEqualTo(String value) {
            addCriterion("cat_breed >=", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedLessThan(String value) {
            addCriterion("cat_breed <", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedLessThanOrEqualTo(String value) {
            addCriterion("cat_breed <=", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedLike(String value) {
            addCriterion("cat_breed like", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedNotLike(String value) {
            addCriterion("cat_breed not like", value, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedIn(List<String> values) {
            addCriterion("cat_breed in", values, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedNotIn(List<String> values) {
            addCriterion("cat_breed not in", values, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedBetween(String value1, String value2) {
            addCriterion("cat_breed between", value1, value2, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatBreedNotBetween(String value1, String value2) {
            addCriterion("cat_breed not between", value1, value2, "catBreed");
            return (Criteria) this;
        }

        public Criteria andCatAgeIsNull() {
            addCriterion("cat_age is null");
            return (Criteria) this;
        }

        public Criteria andCatAgeIsNotNull() {
            addCriterion("cat_age is not null");
            return (Criteria) this;
        }

        public Criteria andCatAgeEqualTo(Integer value) {
            addCriterion("cat_age =", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeNotEqualTo(Integer value) {
            addCriterion("cat_age <>", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeGreaterThan(Integer value) {
            addCriterion("cat_age >", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_age >=", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeLessThan(Integer value) {
            addCriterion("cat_age <", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeLessThanOrEqualTo(Integer value) {
            addCriterion("cat_age <=", value, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeIn(List<Integer> values) {
            addCriterion("cat_age in", values, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeNotIn(List<Integer> values) {
            addCriterion("cat_age not in", values, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeBetween(Integer value1, Integer value2) {
            addCriterion("cat_age between", value1, value2, "catAge");
            return (Criteria) this;
        }

        public Criteria andCatAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_age not between", value1, value2, "catAge");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameIsNull() {
            addCriterion("recipienter_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameIsNotNull() {
            addCriterion("recipienter_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameEqualTo(String value) {
            addCriterion("recipienter_name =", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameNotEqualTo(String value) {
            addCriterion("recipienter_name <>", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameGreaterThan(String value) {
            addCriterion("recipienter_name >", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_name >=", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameLessThan(String value) {
            addCriterion("recipienter_name <", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameLessThanOrEqualTo(String value) {
            addCriterion("recipienter_name <=", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameLike(String value) {
            addCriterion("recipienter_name like", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameNotLike(String value) {
            addCriterion("recipienter_name not like", value, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameIn(List<String> values) {
            addCriterion("recipienter_name in", values, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameNotIn(List<String> values) {
            addCriterion("recipienter_name not in", values, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameBetween(String value1, String value2) {
            addCriterion("recipienter_name between", value1, value2, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterNameNotBetween(String value1, String value2) {
            addCriterion("recipienter_name not between", value1, value2, "recipienterName");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneIsNull() {
            addCriterion("recipienter_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneIsNotNull() {
            addCriterion("recipienter_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneEqualTo(String value) {
            addCriterion("recipienter_phone =", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneNotEqualTo(String value) {
            addCriterion("recipienter_phone <>", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneGreaterThan(String value) {
            addCriterion("recipienter_phone >", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_phone >=", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneLessThan(String value) {
            addCriterion("recipienter_phone <", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneLessThanOrEqualTo(String value) {
            addCriterion("recipienter_phone <=", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneLike(String value) {
            addCriterion("recipienter_phone like", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneNotLike(String value) {
            addCriterion("recipienter_phone not like", value, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneIn(List<String> values) {
            addCriterion("recipienter_phone in", values, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneNotIn(List<String> values) {
            addCriterion("recipienter_phone not in", values, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneBetween(String value1, String value2) {
            addCriterion("recipienter_phone between", value1, value2, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterPhoneNotBetween(String value1, String value2) {
            addCriterion("recipienter_phone not between", value1, value2, "recipienterPhone");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceIsNull() {
            addCriterion("recipienter_province is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceIsNotNull() {
            addCriterion("recipienter_province is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceEqualTo(String value) {
            addCriterion("recipienter_province =", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceNotEqualTo(String value) {
            addCriterion("recipienter_province <>", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceGreaterThan(String value) {
            addCriterion("recipienter_province >", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_province >=", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceLessThan(String value) {
            addCriterion("recipienter_province <", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceLessThanOrEqualTo(String value) {
            addCriterion("recipienter_province <=", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceLike(String value) {
            addCriterion("recipienter_province like", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceNotLike(String value) {
            addCriterion("recipienter_province not like", value, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceIn(List<String> values) {
            addCriterion("recipienter_province in", values, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceNotIn(List<String> values) {
            addCriterion("recipienter_province not in", values, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceBetween(String value1, String value2) {
            addCriterion("recipienter_province between", value1, value2, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterProvinceNotBetween(String value1, String value2) {
            addCriterion("recipienter_province not between", value1, value2, "recipienterProvince");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityIsNull() {
            addCriterion("recipienter_city is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityIsNotNull() {
            addCriterion("recipienter_city is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityEqualTo(String value) {
            addCriterion("recipienter_city =", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityNotEqualTo(String value) {
            addCriterion("recipienter_city <>", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityGreaterThan(String value) {
            addCriterion("recipienter_city >", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_city >=", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityLessThan(String value) {
            addCriterion("recipienter_city <", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityLessThanOrEqualTo(String value) {
            addCriterion("recipienter_city <=", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityLike(String value) {
            addCriterion("recipienter_city like", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityNotLike(String value) {
            addCriterion("recipienter_city not like", value, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityIn(List<String> values) {
            addCriterion("recipienter_city in", values, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityNotIn(List<String> values) {
            addCriterion("recipienter_city not in", values, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityBetween(String value1, String value2) {
            addCriterion("recipienter_city between", value1, value2, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterCityNotBetween(String value1, String value2) {
            addCriterion("recipienter_city not between", value1, value2, "recipienterCity");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaIsNull() {
            addCriterion("recipienter_area is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaIsNotNull() {
            addCriterion("recipienter_area is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaEqualTo(String value) {
            addCriterion("recipienter_area =", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaNotEqualTo(String value) {
            addCriterion("recipienter_area <>", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaGreaterThan(String value) {
            addCriterion("recipienter_area >", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_area >=", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaLessThan(String value) {
            addCriterion("recipienter_area <", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaLessThanOrEqualTo(String value) {
            addCriterion("recipienter_area <=", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaLike(String value) {
            addCriterion("recipienter_area like", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaNotLike(String value) {
            addCriterion("recipienter_area not like", value, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaIn(List<String> values) {
            addCriterion("recipienter_area in", values, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaNotIn(List<String> values) {
            addCriterion("recipienter_area not in", values, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaBetween(String value1, String value2) {
            addCriterion("recipienter_area between", value1, value2, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterAreaNotBetween(String value1, String value2) {
            addCriterion("recipienter_area not between", value1, value2, "recipienterArea");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetIsNull() {
            addCriterion("recipienter_street is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetIsNotNull() {
            addCriterion("recipienter_street is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetEqualTo(String value) {
            addCriterion("recipienter_street =", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetNotEqualTo(String value) {
            addCriterion("recipienter_street <>", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetGreaterThan(String value) {
            addCriterion("recipienter_street >", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_street >=", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetLessThan(String value) {
            addCriterion("recipienter_street <", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetLessThanOrEqualTo(String value) {
            addCriterion("recipienter_street <=", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetLike(String value) {
            addCriterion("recipienter_street like", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetNotLike(String value) {
            addCriterion("recipienter_street not like", value, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetIn(List<String> values) {
            addCriterion("recipienter_street in", values, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetNotIn(List<String> values) {
            addCriterion("recipienter_street not in", values, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetBetween(String value1, String value2) {
            addCriterion("recipienter_street between", value1, value2, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterStreetNotBetween(String value1, String value2) {
            addCriterion("recipienter_street not between", value1, value2, "recipienterStreet");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressIsNull() {
            addCriterion("recipienter_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressIsNotNull() {
            addCriterion("recipienter_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressEqualTo(String value) {
            addCriterion("recipienter_detail_address =", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressNotEqualTo(String value) {
            addCriterion("recipienter_detail_address <>", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressGreaterThan(String value) {
            addCriterion("recipienter_detail_address >", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recipienter_detail_address >=", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressLessThan(String value) {
            addCriterion("recipienter_detail_address <", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("recipienter_detail_address <=", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressLike(String value) {
            addCriterion("recipienter_detail_address like", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressNotLike(String value) {
            addCriterion("recipienter_detail_address not like", value, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressIn(List<String> values) {
            addCriterion("recipienter_detail_address in", values, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressNotIn(List<String> values) {
            addCriterion("recipienter_detail_address not in", values, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressBetween(String value1, String value2) {
            addCriterion("recipienter_detail_address between", value1, value2, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andRecipienterDetailAddressNotBetween(String value1, String value2) {
            addCriterion("recipienter_detail_address not between", value1, value2, "recipienterDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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
     * tb_foretaste_apply
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * tb_foretaste_apply 2022-07-21
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