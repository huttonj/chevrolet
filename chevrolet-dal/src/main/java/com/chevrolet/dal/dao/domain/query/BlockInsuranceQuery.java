package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class BlockInsuranceQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public BlockInsuranceQuery() {
        super();
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        super.oredCriteria.add(criteria);
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

    /**
     * This class corresponds to the database table block_insurance
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        /******props query*****/

        public Criteria andPropsIsNull(String propsKey) {
            addCriterion(propsKey + " is null");
            return (Criteria) this;
        }

        public Criteria andPropsIsNotNull(String propsKey) {
            addCriterion(propsKey + " is not null");
            return (Criteria) this;
        }

        public Criteria andPropsEqualTo(String propsKey, Object value) {
            addCriterion(propsKey + " =", value, "id");
            return (Criteria) this;
        }

        public Criteria andPropsNotEqualTo(String propsKey, Object value) {
            addCriterion(propsKey + " <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anPropsGreaterThan(String propsKey, Object value) {
            addCriterion(propsKey + " >", value, "id");
            return (Criteria) this;
        }

        public Criteria andPropsGreaterThanOrEqualTo(String propsKey, Object value) {
            addCriterion(propsKey + " >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andPropsLessThan(String propsKey, Object value) {
            addCriterion(propsKey + " <", value, "id");
            return (Criteria) this;
        }

        public Criteria andPropsLessThanOrEqualTo(String propsKey, Object value) {
            addCriterion(propsKey + " <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andPropsIn(String propsKey, List<Object> values) {
            addCriterion(propsKey + " in", values, "id");
            return (Criteria) this;
        }

        public Criteria andPropsNotIn(String propsKey, List<Object> values) {
            addCriterion(propsKey + " not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andPropsBetween(String propsKey, Object value1, Object value2) {
            addCriterion(propsKey + " between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPropsNotBetween(String propsKey, Object value1, Object value2) {
            addCriterion(propsKey + " not between", value1, value2, "id");
            return (Criteria) this;
        }

        /******end*****/

        public Criteria andInsuranceIdIsNull() {
            addCriterion("insurance_id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("insurance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Long value) {
            addCriterion("insurance_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Long value) {
            addCriterion("insurance_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anInsuranceIdGreaterThan(Long value) {
            addCriterion("insurance_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Long value) {
            addCriterion("insurance_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Long value) {
            addCriterion("insurance_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Long> values) {
            addCriterion("insurance_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Long> values) {
            addCriterion("insurance_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Long value1, Long value2) {
            addCriterion("insurance_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Long value1, Long value2) {
            addCriterion("insurance_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNull() {
            addCriterion("block_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockIdIsNotNull() {
            addCriterion("block_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockIdEqualTo(Long value) {
            addCriterion("block_id =", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotEqualTo(Long value) {
            addCriterion("block_id <>", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThan(Long value) {
            addCriterion("block_id >", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("block_id >=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThan(Long value) {
            addCriterion("block_id <", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLessThanOrEqualTo(Long value) {
            addCriterion("block_id <=", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdLike(Long value) {
            addCriterion("block_id like", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotLike(Long value) {
            addCriterion("block_id not like", value, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdIn(List<Long> values) {
            addCriterion("block_id in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotIn(List<Long> values) {
            addCriterion("block_id not in", values, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdBetween(Long value1, Long value2) {
            addCriterion("block_id between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andBlockIdNotBetween(Long value1, Long value2) {
            addCriterion("block_id not between", value1, value2, "blockId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("insurance_cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("insurance_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(Long value) {
            addCriterion("insurance_cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(Long value) {
            addCriterion("insurance_cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(Long value) {
            addCriterion("insurance_cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance_cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(Long value) {
            addCriterion("insurance_cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(Long value) {
            addCriterion("insurance_cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLike(Long value) {
            addCriterion("insurance_cost like", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotLike(Long value) {
            addCriterion("insurance_cost not like", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<Long> values) {
            addCriterion("insurance_cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<Long> values) {
            addCriterion("insurance_cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(Long value1, Long value2) {
            addCriterion("insurance_cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(Long value1, Long value2) {
            addCriterion("insurance_cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIsNull() {
            addCriterion("insurance_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIsNotNull() {
            addCriterion("insurance_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time =", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time <>", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeGreaterThan(java.sql.Date value) {
            addCriterion("insurance_effective_time >", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time >=", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLessThan(java.sql.Date value) {
            addCriterion("insurance_effective_time <", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time <=", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLike(java.sql.Date value) {
            addCriterion("insurance_effective_time like", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotLike(java.sql.Date value) {
            addCriterion("insurance_effective_time not like", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIn(List<java.sql.Date> values) {
            addCriterion("insurance_effective_time in", values, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotIn(List<java.sql.Date> values) {
            addCriterion("insurance_effective_time not in", values, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_effective_time between", value1, value2, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_effective_time not between", value1, value2, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIsNull() {
            addCriterion("insurance_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIsNotNull() {
            addCriterion("insurance_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time =", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time <>", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("insurance_expiry_time >", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time >=", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("insurance_expiry_time <", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time <=", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLike(java.sql.Date value) {
            addCriterion("insurance_expiry_time like", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("insurance_expiry_time not like", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("insurance_expiry_time in", values, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("insurance_expiry_time not in", values, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_expiry_time between", value1, value2, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_expiry_time not between", value1, value2, "insuranceExpiryTime");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(Integer value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(Integer value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table block_insurance
    */
    public  static class Criteria extends GeneratedCriteria{
        protected Criteria() {
            super();
        }
    }



    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}