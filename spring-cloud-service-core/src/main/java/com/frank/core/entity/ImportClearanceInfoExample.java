package com.frank.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportClearanceInfoExample {
    /**
     * tb_import_clearance_info
     */
    protected String orderByClause;

    /**
     * tb_import_clearance_info
     */
    protected boolean distinct;

    /**
     * tb_import_clearance_info
     */
    protected List<Criteria> oredCriteria;

    public ImportClearanceInfoExample() {
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
     * tb_import_clearance_info 2022-07-21
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Long value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Long value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Long value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Long value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Long> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Long> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Long value1, Long value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
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

        public Criteria andDomesticConsigneeIsNull() {
            addCriterion("domestic_consignee is null");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeIsNotNull() {
            addCriterion("domestic_consignee is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeEqualTo(String value) {
            addCriterion("domestic_consignee =", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeNotEqualTo(String value) {
            addCriterion("domestic_consignee <>", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeGreaterThan(String value) {
            addCriterion("domestic_consignee >", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_consignee >=", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeLessThan(String value) {
            addCriterion("domestic_consignee <", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeLessThanOrEqualTo(String value) {
            addCriterion("domestic_consignee <=", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeLike(String value) {
            addCriterion("domestic_consignee like", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeNotLike(String value) {
            addCriterion("domestic_consignee not like", value, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeIn(List<String> values) {
            addCriterion("domestic_consignee in", values, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeNotIn(List<String> values) {
            addCriterion("domestic_consignee not in", values, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeBetween(String value1, String value2) {
            addCriterion("domestic_consignee between", value1, value2, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andDomesticConsigneeNotBetween(String value1, String value2) {
            addCriterion("domestic_consignee not between", value1, value2, "domesticConsignee");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitIsNull() {
            addCriterion("consumption_unit is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitIsNotNull() {
            addCriterion("consumption_unit is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitEqualTo(String value) {
            addCriterion("consumption_unit =", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitNotEqualTo(String value) {
            addCriterion("consumption_unit <>", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitGreaterThan(String value) {
            addCriterion("consumption_unit >", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitGreaterThanOrEqualTo(String value) {
            addCriterion("consumption_unit >=", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitLessThan(String value) {
            addCriterion("consumption_unit <", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitLessThanOrEqualTo(String value) {
            addCriterion("consumption_unit <=", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitLike(String value) {
            addCriterion("consumption_unit like", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitNotLike(String value) {
            addCriterion("consumption_unit not like", value, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitIn(List<String> values) {
            addCriterion("consumption_unit in", values, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitNotIn(List<String> values) {
            addCriterion("consumption_unit not in", values, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitBetween(String value1, String value2) {
            addCriterion("consumption_unit between", value1, value2, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andConsumptionUnitNotBetween(String value1, String value2) {
            addCriterion("consumption_unit not between", value1, value2, "consumptionUnit");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsIsNull() {
            addCriterion("entry_customs is null");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsIsNotNull() {
            addCriterion("entry_customs is not null");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsEqualTo(String value) {
            addCriterion("entry_customs =", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsNotEqualTo(String value) {
            addCriterion("entry_customs <>", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsGreaterThan(String value) {
            addCriterion("entry_customs >", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsGreaterThanOrEqualTo(String value) {
            addCriterion("entry_customs >=", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsLessThan(String value) {
            addCriterion("entry_customs <", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsLessThanOrEqualTo(String value) {
            addCriterion("entry_customs <=", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsLike(String value) {
            addCriterion("entry_customs like", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsNotLike(String value) {
            addCriterion("entry_customs not like", value, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsIn(List<String> values) {
            addCriterion("entry_customs in", values, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsNotIn(List<String> values) {
            addCriterion("entry_customs not in", values, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsBetween(String value1, String value2) {
            addCriterion("entry_customs between", value1, value2, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andEntryCustomsNotBetween(String value1, String value2) {
            addCriterion("entry_customs not between", value1, value2, "entryCustoms");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNull() {
            addCriterion("transport_mode is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNotNull() {
            addCriterion("transport_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeEqualTo(String value) {
            addCriterion("transport_mode =", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotEqualTo(String value) {
            addCriterion("transport_mode <>", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThan(String value) {
            addCriterion("transport_mode >", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_mode >=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThan(String value) {
            addCriterion("transport_mode <", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThanOrEqualTo(String value) {
            addCriterion("transport_mode <=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLike(String value) {
            addCriterion("transport_mode like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotLike(String value) {
            addCriterion("transport_mode not like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeIn(List<String> values) {
            addCriterion("transport_mode in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotIn(List<String> values) {
            addCriterion("transport_mode not in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeBetween(String value1, String value2) {
            addCriterion("transport_mode between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotBetween(String value1, String value2) {
            addCriterion("transport_mode not between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNull() {
            addCriterion("declare_time is null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNotNull() {
            addCriterion("declare_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeEqualTo(Date value) {
            addCriterion("declare_time =", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotEqualTo(Date value) {
            addCriterion("declare_time <>", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThan(Date value) {
            addCriterion("declare_time >", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("declare_time >=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThan(Date value) {
            addCriterion("declare_time <", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThanOrEqualTo(Date value) {
            addCriterion("declare_time <=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIn(List<Date> values) {
            addCriterion("declare_time in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotIn(List<Date> values) {
            addCriterion("declare_time not in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeBetween(Date value1, Date value2) {
            addCriterion("declare_time between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotBetween(Date value1, Date value2) {
            addCriterion("declare_time not between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationIsNull() {
            addCriterion("cargo_storage_location is null");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationIsNotNull() {
            addCriterion("cargo_storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationEqualTo(String value) {
            addCriterion("cargo_storage_location =", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationNotEqualTo(String value) {
            addCriterion("cargo_storage_location <>", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationGreaterThan(String value) {
            addCriterion("cargo_storage_location >", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_storage_location >=", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationLessThan(String value) {
            addCriterion("cargo_storage_location <", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("cargo_storage_location <=", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationLike(String value) {
            addCriterion("cargo_storage_location like", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationNotLike(String value) {
            addCriterion("cargo_storage_location not like", value, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationIn(List<String> values) {
            addCriterion("cargo_storage_location in", values, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationNotIn(List<String> values) {
            addCriterion("cargo_storage_location not in", values, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationBetween(String value1, String value2) {
            addCriterion("cargo_storage_location between", value1, value2, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andCargoStorageLocationNotBetween(String value1, String value2) {
            addCriterion("cargo_storage_location not between", value1, value2, "cargoStorageLocation");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryIsNull() {
            addCriterion("departure_country is null");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryIsNotNull() {
            addCriterion("departure_country is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryEqualTo(String value) {
            addCriterion("departure_country =", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryNotEqualTo(String value) {
            addCriterion("departure_country <>", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryGreaterThan(String value) {
            addCriterion("departure_country >", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryGreaterThanOrEqualTo(String value) {
            addCriterion("departure_country >=", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryLessThan(String value) {
            addCriterion("departure_country <", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryLessThanOrEqualTo(String value) {
            addCriterion("departure_country <=", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryLike(String value) {
            addCriterion("departure_country like", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryNotLike(String value) {
            addCriterion("departure_country not like", value, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryIn(List<String> values) {
            addCriterion("departure_country in", values, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryNotIn(List<String> values) {
            addCriterion("departure_country not in", values, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryBetween(String value1, String value2) {
            addCriterion("departure_country between", value1, value2, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andDepartureCountryNotBetween(String value1, String value2) {
            addCriterion("departure_country not between", value1, value2, "departureCountry");
            return (Criteria) this;
        }

        public Criteria andStopPortIsNull() {
            addCriterion("stop_port is null");
            return (Criteria) this;
        }

        public Criteria andStopPortIsNotNull() {
            addCriterion("stop_port is not null");
            return (Criteria) this;
        }

        public Criteria andStopPortEqualTo(String value) {
            addCriterion("stop_port =", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortNotEqualTo(String value) {
            addCriterion("stop_port <>", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortGreaterThan(String value) {
            addCriterion("stop_port >", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortGreaterThanOrEqualTo(String value) {
            addCriterion("stop_port >=", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortLessThan(String value) {
            addCriterion("stop_port <", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortLessThanOrEqualTo(String value) {
            addCriterion("stop_port <=", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortLike(String value) {
            addCriterion("stop_port like", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortNotLike(String value) {
            addCriterion("stop_port not like", value, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortIn(List<String> values) {
            addCriterion("stop_port in", values, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortNotIn(List<String> values) {
            addCriterion("stop_port not in", values, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortBetween(String value1, String value2) {
            addCriterion("stop_port between", value1, value2, "stopPort");
            return (Criteria) this;
        }

        public Criteria andStopPortNotBetween(String value1, String value2) {
            addCriterion("stop_port not between", value1, value2, "stopPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortIsNull() {
            addCriterion("entry_port is null");
            return (Criteria) this;
        }

        public Criteria andEntryPortIsNotNull() {
            addCriterion("entry_port is not null");
            return (Criteria) this;
        }

        public Criteria andEntryPortEqualTo(String value) {
            addCriterion("entry_port =", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortNotEqualTo(String value) {
            addCriterion("entry_port <>", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortGreaterThan(String value) {
            addCriterion("entry_port >", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortGreaterThanOrEqualTo(String value) {
            addCriterion("entry_port >=", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortLessThan(String value) {
            addCriterion("entry_port <", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortLessThanOrEqualTo(String value) {
            addCriterion("entry_port <=", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortLike(String value) {
            addCriterion("entry_port like", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortNotLike(String value) {
            addCriterion("entry_port not like", value, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortIn(List<String> values) {
            addCriterion("entry_port in", values, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortNotIn(List<String> values) {
            addCriterion("entry_port not in", values, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortBetween(String value1, String value2) {
            addCriterion("entry_port between", value1, value2, "entryPort");
            return (Criteria) this;
        }

        public Criteria andEntryPortNotBetween(String value1, String value2) {
            addCriterion("entry_port not between", value1, value2, "entryPort");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIsNull() {
            addCriterion("declare_unit is null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIsNotNull() {
            addCriterion("declare_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitEqualTo(String value) {
            addCriterion("declare_unit =", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotEqualTo(String value) {
            addCriterion("declare_unit <>", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitGreaterThan(String value) {
            addCriterion("declare_unit >", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitGreaterThanOrEqualTo(String value) {
            addCriterion("declare_unit >=", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLessThan(String value) {
            addCriterion("declare_unit <", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLessThanOrEqualTo(String value) {
            addCriterion("declare_unit <=", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLike(String value) {
            addCriterion("declare_unit like", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotLike(String value) {
            addCriterion("declare_unit not like", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIn(List<String> values) {
            addCriterion("declare_unit in", values, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotIn(List<String> values) {
            addCriterion("declare_unit not in", values, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitBetween(String value1, String value2) {
            addCriterion("declare_unit between", value1, value2, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotBetween(String value1, String value2) {
            addCriterion("declare_unit not between", value1, value2, "declareUnit");
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
     * tb_import_clearance_info
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * tb_import_clearance_info 2022-07-21
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