package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarRiskConfirmQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarRiskConfirmQuery() {
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
     * This class corresponds to the database table cc_car_risk_confirm
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

        public Criteria andCarRiskConfirmIdIsNull() {
            addCriterion("car_risk_confirm_id is null");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdIsNotNull() {
            addCriterion("car_risk_confirm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdEqualTo(Long value) {
            addCriterion("car_risk_confirm_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdNotEqualTo(Long value) {
            addCriterion("car_risk_confirm_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarRiskConfirmIdGreaterThan(Long value) {
            addCriterion("car_risk_confirm_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_risk_confirm_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdLessThan(Long value) {
            addCriterion("car_risk_confirm_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdLessThanOrEqualTo(Long value) {
            addCriterion("car_risk_confirm_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdIn(List<Long> values) {
            addCriterion("car_risk_confirm_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdNotIn(List<Long> values) {
            addCriterion("car_risk_confirm_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdBetween(Long value1, Long value2) {
            addCriterion("car_risk_confirm_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarRiskConfirmIdNotBetween(Long value1, Long value2) {
            addCriterion("car_risk_confirm_id not between", value1, value2, "id");
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(Long value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(Long value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andConfirmPicIsNull() {
            addCriterion("confirm_pic is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPicIsNotNull() {
            addCriterion("confirm_pic is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPicEqualTo(Long value) {
            addCriterion("confirm_pic =", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicNotEqualTo(Long value) {
            addCriterion("confirm_pic <>", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicGreaterThan(Long value) {
            addCriterion("confirm_pic >", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicGreaterThanOrEqualTo(Long value) {
            addCriterion("confirm_pic >=", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicLessThan(Long value) {
            addCriterion("confirm_pic <", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicLessThanOrEqualTo(Long value) {
            addCriterion("confirm_pic <=", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicLike(Long value) {
            addCriterion("confirm_pic like", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicNotLike(Long value) {
            addCriterion("confirm_pic not like", value, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicIn(List<Long> values) {
            addCriterion("confirm_pic in", values, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicNotIn(List<Long> values) {
            addCriterion("confirm_pic not in", values, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicBetween(Long value1, Long value2) {
            addCriterion("confirm_pic between", value1, value2, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmPicNotBetween(Long value1, Long value2) {
            addCriterion("confirm_pic not between", value1, value2, "confirmPic");
            return (Criteria) this;
        }

        public Criteria andConfirmDescIsNull() {
            addCriterion("confirm_desc is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDescIsNotNull() {
            addCriterion("confirm_desc is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDescEqualTo(String value) {
            addCriterion("confirm_desc =", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescNotEqualTo(String value) {
            addCriterion("confirm_desc <>", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescGreaterThan(String value) {
            addCriterion("confirm_desc >", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_desc >=", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescLessThan(String value) {
            addCriterion("confirm_desc <", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescLessThanOrEqualTo(String value) {
            addCriterion("confirm_desc <=", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescLike(String value) {
            addCriterion("confirm_desc like", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescNotLike(String value) {
            addCriterion("confirm_desc not like", value, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescIn(List<String> values) {
            addCriterion("confirm_desc in", values, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescNotIn(List<String> values) {
            addCriterion("confirm_desc not in", values, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescBetween(String value1, String value2) {
            addCriterion("confirm_desc between", value1, value2, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andConfirmDescNotBetween(String value1, String value2) {
            addCriterion("confirm_desc not between", value1, value2, "confirmDesc");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(Integer value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(Integer value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_car_risk_confirm
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