package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarAssetChglogQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarAssetChglogQuery() {
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
     * This class corresponds to the database table cc_car_asset_chglog
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

        public Criteria andChglogIdIsNull() {
            addCriterion("chglog_id is null");
            return (Criteria) this;
        }

        public Criteria andChglogIdIsNotNull() {
            addCriterion("chglog_id is not null");
            return (Criteria) this;
        }

        public Criteria andChglogIdEqualTo(Long value) {
            addCriterion("chglog_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdNotEqualTo(Long value) {
            addCriterion("chglog_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anChglogIdGreaterThan(Long value) {
            addCriterion("chglog_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chglog_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdLessThan(Long value) {
            addCriterion("chglog_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdLessThanOrEqualTo(Long value) {
            addCriterion("chglog_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdIn(List<Long> values) {
            addCriterion("chglog_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdNotIn(List<Long> values) {
            addCriterion("chglog_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdBetween(Long value1, Long value2) {
            addCriterion("chglog_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChglogIdNotBetween(Long value1, Long value2) {
            addCriterion("chglog_id not between", value1, value2, "id");
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(Long value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(Long value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNull() {
            addCriterion("o_type is null");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNotNull() {
            addCriterion("o_type is not null");
            return (Criteria) this;
        }

        public Criteria andOTypeEqualTo(Integer value) {
            addCriterion("o_type =", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotEqualTo(Integer value) {
            addCriterion("o_type <>", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThan(Integer value) {
            addCriterion("o_type >", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_type >=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThan(Integer value) {
            addCriterion("o_type <", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThanOrEqualTo(Integer value) {
            addCriterion("o_type <=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLike(Integer value) {
            addCriterion("o_type like", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotLike(Integer value) {
            addCriterion("o_type not like", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeIn(List<Integer> values) {
            addCriterion("o_type in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotIn(List<Integer> values) {
            addCriterion("o_type not in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeBetween(Integer value1, Integer value2) {
            addCriterion("o_type between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("o_type not between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Long value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Long value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Long value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Long value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Long value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Long value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(Long value) {
            addCriterion("nid like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(Long value) {
            addCriterion("nid not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Long> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Long> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Long value1, Long value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Long value1, Long value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNull() {
            addCriterion("n_type is null");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNotNull() {
            addCriterion("n_type is not null");
            return (Criteria) this;
        }

        public Criteria andNTypeEqualTo(Integer value) {
            addCriterion("n_type =", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotEqualTo(Integer value) {
            addCriterion("n_type <>", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThan(Integer value) {
            addCriterion("n_type >", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_type >=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThan(Integer value) {
            addCriterion("n_type <", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_type <=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLike(Integer value) {
            addCriterion("n_type like", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotLike(Integer value) {
            addCriterion("n_type not like", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeIn(List<Integer> values) {
            addCriterion("n_type in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotIn(List<Integer> values) {
            addCriterion("n_type not in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_type between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_type not between", value1, value2, "nType");
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

    }

    /**
     * This class corresponds to the database table cc_car_asset_chglog
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