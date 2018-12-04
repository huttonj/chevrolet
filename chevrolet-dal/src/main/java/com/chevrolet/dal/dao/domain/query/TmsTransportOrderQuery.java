package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsTransportOrderQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsTransportOrderQuery() {
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
     * This class corresponds to the database table tms_transport_order
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

        public Criteria andTransportOrderIdIsNull() {
            addCriterion("transport_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIsNotNull() {
            addCriterion("transport_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdEqualTo(Long value) {
            addCriterion("transport_order_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotEqualTo(Long value) {
            addCriterion("transport_order_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anTransportOrderIdGreaterThan(Long value) {
            addCriterion("transport_order_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_order_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThan(Long value) {
            addCriterion("transport_order_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_order_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIn(List<Long> values) {
            addCriterion("transport_order_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotIn(List<Long> values) {
            addCriterion("transport_order_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdBetween(Long value1, Long value2) {
            addCriterion("transport_order_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_order_id not between", value1, value2, "id");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("biz_id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(Long value) {
            addCriterion("biz_id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(Long value) {
            addCriterion("biz_id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(Long value) {
            addCriterion("biz_id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(Long value) {
            addCriterion("biz_id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(Long value) {
            addCriterion("biz_id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(Long value) {
            addCriterion("biz_id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLike(Long value) {
            addCriterion("biz_id like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotLike(Long value) {
            addCriterion("biz_id not like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<Long> values) {
            addCriterion("biz_id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<Long> values) {
            addCriterion("biz_id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(Long value1, Long value2) {
            addCriterion("biz_id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(Long value1, Long value2) {
            addCriterion("biz_id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNull() {
            addCriterion("biz_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNotNull() {
            addCriterion("biz_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoEqualTo(String value) {
            addCriterion("biz_order_no =", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotEqualTo(String value) {
            addCriterion("biz_order_no <>", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThan(String value) {
            addCriterion("biz_order_no >", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_order_no >=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThan(String value) {
            addCriterion("biz_order_no <", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThanOrEqualTo(String value) {
            addCriterion("biz_order_no <=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLike(String value) {
            addCriterion("biz_order_no like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotLike(String value) {
            addCriterion("biz_order_no not like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIn(List<String> values) {
            addCriterion("biz_order_no in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotIn(List<String> values) {
            addCriterion("biz_order_no not in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoBetween(String value1, String value2) {
            addCriterion("biz_order_no between", value1, value2, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotBetween(String value1, String value2) {
            addCriterion("biz_order_no not between", value1, value2, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameIsNull() {
            addCriterion("biz_order_name is null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameIsNotNull() {
            addCriterion("biz_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameEqualTo(String value) {
            addCriterion("biz_order_name =", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameNotEqualTo(String value) {
            addCriterion("biz_order_name <>", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameGreaterThan(String value) {
            addCriterion("biz_order_name >", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("biz_order_name >=", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameLessThan(String value) {
            addCriterion("biz_order_name <", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameLessThanOrEqualTo(String value) {
            addCriterion("biz_order_name <=", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameLike(String value) {
            addCriterion("biz_order_name like", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameNotLike(String value) {
            addCriterion("biz_order_name not like", value, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameIn(List<String> values) {
            addCriterion("biz_order_name in", values, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameNotIn(List<String> values) {
            addCriterion("biz_order_name not in", values, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameBetween(String value1, String value2) {
            addCriterion("biz_order_name between", value1, value2, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizOrderNameNotBetween(String value1, String value2) {
            addCriterion("biz_order_name not between", value1, value2, "bizOrderName");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Integer value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Integer value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Integer value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Integer value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Integer value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(Integer value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(Integer value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Integer> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Integer> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Integer value1, Integer value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(Integer value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(Integer value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(Long value) {
            addCriterion("carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(Long value) {
            addCriterion("carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(Long value) {
            addCriterion("carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(Long value) {
            addCriterion("carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(Long value) {
            addCriterion("carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(Long value) {
            addCriterion("carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(Long value) {
            addCriterion("carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<Long> values) {
            addCriterion("carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<Long> values) {
            addCriterion("carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(Long value1, Long value2) {
            addCriterion("carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(Long value1, Long value2) {
            addCriterion("carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNull() {
            addCriterion("carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("carrier_name =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("carrier_name <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("carrier_name >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_name >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("carrier_name <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("carrier_name <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("carrier_name like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("carrier_name not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("carrier_name in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("carrier_name not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("carrier_name between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("carrier_name not between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdIsNull() {
            addCriterion("carrier_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdIsNotNull() {
            addCriterion("carrier_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdEqualTo(Long value) {
            addCriterion("carrier_staff_id =", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdNotEqualTo(Long value) {
            addCriterion("carrier_staff_id <>", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdGreaterThan(Long value) {
            addCriterion("carrier_staff_id >", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("carrier_staff_id >=", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdLessThan(Long value) {
            addCriterion("carrier_staff_id <", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("carrier_staff_id <=", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdLike(Long value) {
            addCriterion("carrier_staff_id like", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdNotLike(Long value) {
            addCriterion("carrier_staff_id not like", value, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdIn(List<Long> values) {
            addCriterion("carrier_staff_id in", values, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdNotIn(List<Long> values) {
            addCriterion("carrier_staff_id not in", values, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdBetween(Long value1, Long value2) {
            addCriterion("carrier_staff_id between", value1, value2, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andCarrierStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("carrier_staff_id not between", value1, value2, "carrierStaffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberIsNull() {
            addCriterion("staff_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberIsNotNull() {
            addCriterion("staff_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberEqualTo(String value) {
            addCriterion("staff_phone_number =", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberNotEqualTo(String value) {
            addCriterion("staff_phone_number <>", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberGreaterThan(String value) {
            addCriterion("staff_phone_number >", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone_number >=", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberLessThan(String value) {
            addCriterion("staff_phone_number <", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("staff_phone_number <=", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberLike(String value) {
            addCriterion("staff_phone_number like", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberNotLike(String value) {
            addCriterion("staff_phone_number not like", value, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberIn(List<String> values) {
            addCriterion("staff_phone_number in", values, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberNotIn(List<String> values) {
            addCriterion("staff_phone_number not in", values, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberBetween(String value1, String value2) {
            addCriterion("staff_phone_number between", value1, value2, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("staff_phone_number not between", value1, value2, "staffPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Long value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Long value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Long value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Long value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Long value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(Long value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(Long value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Long> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Long> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Long value1, Long value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Long value1, Long value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientContactIdIsNull() {
            addCriterion("client_contact_id is null");
            return (Criteria) this;
        }

        public Criteria andClientContactIdIsNotNull() {
            addCriterion("client_contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientContactIdEqualTo(Long value) {
            addCriterion("client_contact_id =", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotEqualTo(Long value) {
            addCriterion("client_contact_id <>", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdGreaterThan(Long value) {
            addCriterion("client_contact_id >", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_contact_id >=", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLessThan(Long value) {
            addCriterion("client_contact_id <", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLessThanOrEqualTo(Long value) {
            addCriterion("client_contact_id <=", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLike(Long value) {
            addCriterion("client_contact_id like", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotLike(Long value) {
            addCriterion("client_contact_id not like", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdIn(List<Long> values) {
            addCriterion("client_contact_id in", values, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotIn(List<Long> values) {
            addCriterion("client_contact_id not in", values, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdBetween(Long value1, Long value2) {
            addCriterion("client_contact_id between", value1, value2, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotBetween(Long value1, Long value2) {
            addCriterion("client_contact_id not between", value1, value2, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIsNull() {
            addCriterion("client_contact is null");
            return (Criteria) this;
        }

        public Criteria andClientContactIsNotNull() {
            addCriterion("client_contact is not null");
            return (Criteria) this;
        }

        public Criteria andClientContactEqualTo(String value) {
            addCriterion("client_contact =", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactNotEqualTo(String value) {
            addCriterion("client_contact <>", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactGreaterThan(String value) {
            addCriterion("client_contact >", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactGreaterThanOrEqualTo(String value) {
            addCriterion("client_contact >=", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactLessThan(String value) {
            addCriterion("client_contact <", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactLessThanOrEqualTo(String value) {
            addCriterion("client_contact <=", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactLike(String value) {
            addCriterion("client_contact like", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactNotLike(String value) {
            addCriterion("client_contact not like", value, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactIn(List<String> values) {
            addCriterion("client_contact in", values, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactNotIn(List<String> values) {
            addCriterion("client_contact not in", values, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactBetween(String value1, String value2) {
            addCriterion("client_contact between", value1, value2, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactNotBetween(String value1, String value2) {
            addCriterion("client_contact not between", value1, value2, "clientContact");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneIsNull() {
            addCriterion("client_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneIsNotNull() {
            addCriterion("client_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneEqualTo(String value) {
            addCriterion("client_contact_phone =", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneNotEqualTo(String value) {
            addCriterion("client_contact_phone <>", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneGreaterThan(String value) {
            addCriterion("client_contact_phone >", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("client_contact_phone >=", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneLessThan(String value) {
            addCriterion("client_contact_phone <", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("client_contact_phone <=", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneLike(String value) {
            addCriterion("client_contact_phone like", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneNotLike(String value) {
            addCriterion("client_contact_phone not like", value, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneIn(List<String> values) {
            addCriterion("client_contact_phone in", values, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneNotIn(List<String> values) {
            addCriterion("client_contact_phone not in", values, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneBetween(String value1, String value2) {
            addCriterion("client_contact_phone between", value1, value2, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andClientContactPhoneNotBetween(String value1, String value2) {
            addCriterion("client_contact_phone not between", value1, value2, "clientContactPhone");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractIsNull() {
            addCriterion("img_transport_contract is null");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractIsNotNull() {
            addCriterion("img_transport_contract is not null");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractEqualTo(String value) {
            addCriterion("img_transport_contract =", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractNotEqualTo(String value) {
            addCriterion("img_transport_contract <>", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractGreaterThan(String value) {
            addCriterion("img_transport_contract >", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractGreaterThanOrEqualTo(String value) {
            addCriterion("img_transport_contract >=", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractLessThan(String value) {
            addCriterion("img_transport_contract <", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractLessThanOrEqualTo(String value) {
            addCriterion("img_transport_contract <=", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractLike(String value) {
            addCriterion("img_transport_contract like", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractNotLike(String value) {
            addCriterion("img_transport_contract not like", value, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractIn(List<String> values) {
            addCriterion("img_transport_contract in", values, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractNotIn(List<String> values) {
            addCriterion("img_transport_contract not in", values, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractBetween(String value1, String value2) {
            addCriterion("img_transport_contract between", value1, value2, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andImgTransportContractNotBetween(String value1, String value2) {
            addCriterion("img_transport_contract not between", value1, value2, "imgTransportContract");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeIsNull() {
            addCriterion("shipment_time is null");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeIsNotNull() {
            addCriterion("shipment_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeEqualTo(Date value) {
            addCriterion("shipment_time =", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeNotEqualTo(Date value) {
            addCriterion("shipment_time <>", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeGreaterThan(Date value) {
            addCriterion("shipment_time >", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipment_time >=", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeLessThan(Date value) {
            addCriterion("shipment_time <", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipment_time <=", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeLike(Date value) {
            addCriterion("shipment_time like", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeNotLike(Date value) {
            addCriterion("shipment_time not like", value, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeIn(List<Date> values) {
            addCriterion("shipment_time in", values, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeNotIn(List<Date> values) {
            addCriterion("shipment_time not in", values, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeBetween(Date value1, Date value2) {
            addCriterion("shipment_time between", value1, value2, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andShipmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipment_time not between", value1, value2, "shipmentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLike(Date value) {
            addCriterion("payment_time like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotLike(Date value) {
            addCriterion("payment_time not like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceIsNull() {
            addCriterion("has_invoice is null");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceIsNotNull() {
            addCriterion("has_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceEqualTo(Integer value) {
            addCriterion("has_invoice =", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceNotEqualTo(Integer value) {
            addCriterion("has_invoice <>", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceGreaterThan(Integer value) {
            addCriterion("has_invoice >", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_invoice >=", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceLessThan(Integer value) {
            addCriterion("has_invoice <", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("has_invoice <=", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceLike(Integer value) {
            addCriterion("has_invoice like", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceNotLike(Integer value) {
            addCriterion("has_invoice not like", value, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceIn(List<Integer> values) {
            addCriterion("has_invoice in", values, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceNotIn(List<Integer> values) {
            addCriterion("has_invoice not in", values, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("has_invoice between", value1, value2, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andHasInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("has_invoice not between", value1, value2, "hasInvoice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceIsNull() {
            addCriterion("transport_price is null");
            return (Criteria) this;
        }

        public Criteria andTransportPriceIsNotNull() {
            addCriterion("transport_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransportPriceEqualTo(Integer value) {
            addCriterion("transport_price =", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceNotEqualTo(Integer value) {
            addCriterion("transport_price <>", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceGreaterThan(Integer value) {
            addCriterion("transport_price >", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_price >=", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceLessThan(Integer value) {
            addCriterion("transport_price <", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceLessThanOrEqualTo(Integer value) {
            addCriterion("transport_price <=", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceLike(Integer value) {
            addCriterion("transport_price like", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceNotLike(Integer value) {
            addCriterion("transport_price not like", value, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceIn(List<Integer> values) {
            addCriterion("transport_price in", values, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceNotIn(List<Integer> values) {
            addCriterion("transport_price not in", values, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceBetween(Integer value1, Integer value2) {
            addCriterion("transport_price between", value1, value2, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_price not between", value1, value2, "transportPrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(Integer value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(Integer value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(Integer value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(Integer value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(Integer value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLike(Integer value) {
            addCriterion("service_price like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotLike(Integer value) {
            addCriterion("service_price not like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<Integer> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<Integer> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(Integer value1, Integer value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Integer value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Integer value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Integer value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Integer value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(Integer value) {
            addCriterion("insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(Integer value) {
            addCriterion("insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Integer> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Integer> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNull() {
            addCriterion("consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNotNull() {
            addCriterion("consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneEqualTo(String value) {
            addCriterion("consignee_phone =", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotEqualTo(String value) {
            addCriterion("consignee_phone <>", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThan(String value) {
            addCriterion("consignee_phone >", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_phone >=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThan(String value) {
            addCriterion("consignee_phone <", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("consignee_phone <=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLike(String value) {
            addCriterion("consignee_phone like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotLike(String value) {
            addCriterion("consignee_phone not like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIn(List<String> values) {
            addCriterion("consignee_phone in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotIn(List<String> values) {
            addCriterion("consignee_phone not in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneBetween(String value1, String value2) {
            addCriterion("consignee_phone between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("consignee_phone not between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNull() {
            addCriterion("consignee_address is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNotNull() {
            addCriterion("consignee_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressEqualTo(String value) {
            addCriterion("consignee_address =", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotEqualTo(String value) {
            addCriterion("consignee_address <>", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThan(String value) {
            addCriterion("consignee_address >", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_address >=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThan(String value) {
            addCriterion("consignee_address <", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("consignee_address <=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLike(String value) {
            addCriterion("consignee_address like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotLike(String value) {
            addCriterion("consignee_address not like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIn(List<String> values) {
            addCriterion("consignee_address in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotIn(List<String> values) {
            addCriterion("consignee_address not in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressBetween(String value1, String value2) {
            addCriterion("consignee_address between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("consignee_address not between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(Integer value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(Integer value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeIsNull() {
            addCriterion("carrier_source_type is null");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeIsNotNull() {
            addCriterion("carrier_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeEqualTo(Integer value) {
            addCriterion("carrier_source_type =", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeNotEqualTo(Integer value) {
            addCriterion("carrier_source_type <>", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeGreaterThan(Integer value) {
            addCriterion("carrier_source_type >", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrier_source_type >=", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeLessThan(Integer value) {
            addCriterion("carrier_source_type <", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("carrier_source_type <=", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeLike(Integer value) {
            addCriterion("carrier_source_type like", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeNotLike(Integer value) {
            addCriterion("carrier_source_type not like", value, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeIn(List<Integer> values) {
            addCriterion("carrier_source_type in", values, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeNotIn(List<Integer> values) {
            addCriterion("carrier_source_type not in", values, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("carrier_source_type between", value1, value2, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andCarrierSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("carrier_source_type not between", value1, value2, "carrierSourceType");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoIsNull() {
            addCriterion("out_transport_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoIsNotNull() {
            addCriterion("out_transport_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoEqualTo(String value) {
            addCriterion("out_transport_order_no =", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoNotEqualTo(String value) {
            addCriterion("out_transport_order_no <>", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoGreaterThan(String value) {
            addCriterion("out_transport_order_no >", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_transport_order_no >=", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoLessThan(String value) {
            addCriterion("out_transport_order_no <", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoLessThanOrEqualTo(String value) {
            addCriterion("out_transport_order_no <=", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoLike(String value) {
            addCriterion("out_transport_order_no like", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoNotLike(String value) {
            addCriterion("out_transport_order_no not like", value, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoIn(List<String> values) {
            addCriterion("out_transport_order_no in", values, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoNotIn(List<String> values) {
            addCriterion("out_transport_order_no not in", values, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoBetween(String value1, String value2) {
            addCriterion("out_transport_order_no between", value1, value2, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutTransportOrderNoNotBetween(String value1, String value2) {
            addCriterion("out_transport_order_no not between", value1, value2, "outTransportOrderNo");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIsNull() {
            addCriterion("client_remarks is null");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIsNotNull() {
            addCriterion("client_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andClientRemarksEqualTo(String value) {
            addCriterion("client_remarks =", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotEqualTo(String value) {
            addCriterion("client_remarks <>", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksGreaterThan(String value) {
            addCriterion("client_remarks >", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("client_remarks >=", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLessThan(String value) {
            addCriterion("client_remarks <", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLessThanOrEqualTo(String value) {
            addCriterion("client_remarks <=", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLike(String value) {
            addCriterion("client_remarks like", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotLike(String value) {
            addCriterion("client_remarks not like", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIn(List<String> values) {
            addCriterion("client_remarks in", values, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotIn(List<String> values) {
            addCriterion("client_remarks not in", values, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksBetween(String value1, String value2) {
            addCriterion("client_remarks between", value1, value2, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotBetween(String value1, String value2) {
            addCriterion("client_remarks not between", value1, value2, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksIsNull() {
            addCriterion("dispatcher_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksIsNotNull() {
            addCriterion("dispatcher_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksEqualTo(String value) {
            addCriterion("dispatcher_remarks =", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksNotEqualTo(String value) {
            addCriterion("dispatcher_remarks <>", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksGreaterThan(String value) {
            addCriterion("dispatcher_remarks >", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("dispatcher_remarks >=", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksLessThan(String value) {
            addCriterion("dispatcher_remarks <", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksLessThanOrEqualTo(String value) {
            addCriterion("dispatcher_remarks <=", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksLike(String value) {
            addCriterion("dispatcher_remarks like", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksNotLike(String value) {
            addCriterion("dispatcher_remarks not like", value, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksIn(List<String> values) {
            addCriterion("dispatcher_remarks in", values, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksNotIn(List<String> values) {
            addCriterion("dispatcher_remarks not in", values, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksBetween(String value1, String value2) {
            addCriterion("dispatcher_remarks between", value1, value2, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andDispatcherRemarksNotBetween(String value1, String value2) {
            addCriterion("dispatcher_remarks not between", value1, value2, "dispatcherRemarks");
            return (Criteria) this;
        }

        public Criteria andCommissionerIsNull() {
            addCriterion("commissioner is null");
            return (Criteria) this;
        }

        public Criteria andCommissionerIsNotNull() {
            addCriterion("commissioner is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionerEqualTo(String value) {
            addCriterion("commissioner =", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerNotEqualTo(String value) {
            addCriterion("commissioner <>", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerGreaterThan(String value) {
            addCriterion("commissioner >", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerGreaterThanOrEqualTo(String value) {
            addCriterion("commissioner >=", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerLessThan(String value) {
            addCriterion("commissioner <", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerLessThanOrEqualTo(String value) {
            addCriterion("commissioner <=", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerLike(String value) {
            addCriterion("commissioner like", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerNotLike(String value) {
            addCriterion("commissioner not like", value, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerIn(List<String> values) {
            addCriterion("commissioner in", values, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerNotIn(List<String> values) {
            addCriterion("commissioner not in", values, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerBetween(String value1, String value2) {
            addCriterion("commissioner between", value1, value2, "commissioner");
            return (Criteria) this;
        }

        public Criteria andCommissionerNotBetween(String value1, String value2) {
            addCriterion("commissioner not between", value1, value2, "commissioner");
            return (Criteria) this;
        }

        public Criteria andControlledStatusIsNull() {
            addCriterion("controlled_status is null");
            return (Criteria) this;
        }

        public Criteria andControlledStatusIsNotNull() {
            addCriterion("controlled_status is not null");
            return (Criteria) this;
        }

        public Criteria andControlledStatusEqualTo(Integer value) {
            addCriterion("controlled_status =", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotEqualTo(Integer value) {
            addCriterion("controlled_status <>", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusGreaterThan(Integer value) {
            addCriterion("controlled_status >", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("controlled_status >=", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLessThan(Integer value) {
            addCriterion("controlled_status <", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLessThanOrEqualTo(Integer value) {
            addCriterion("controlled_status <=", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLike(Integer value) {
            addCriterion("controlled_status like", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotLike(Integer value) {
            addCriterion("controlled_status not like", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusIn(List<Integer> values) {
            addCriterion("controlled_status in", values, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotIn(List<Integer> values) {
            addCriterion("controlled_status not in", values, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusBetween(Integer value1, Integer value2) {
            addCriterion("controlled_status between", value1, value2, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("controlled_status not between", value1, value2, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
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

        public Criteria andOldTransportPriceIsNull() {
            addCriterion("old_transport_price is null");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceIsNotNull() {
            addCriterion("old_transport_price is not null");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceEqualTo(Integer value) {
            addCriterion("old_transport_price =", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotEqualTo(Integer value) {
            addCriterion("old_transport_price <>", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceGreaterThan(Integer value) {
            addCriterion("old_transport_price >", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_transport_price >=", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLessThan(Integer value) {
            addCriterion("old_transport_price <", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLessThanOrEqualTo(Integer value) {
            addCriterion("old_transport_price <=", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLike(Integer value) {
            addCriterion("old_transport_price like", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotLike(Integer value) {
            addCriterion("old_transport_price not like", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceIn(List<Integer> values) {
            addCriterion("old_transport_price in", values, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotIn(List<Integer> values) {
            addCriterion("old_transport_price not in", values, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceBetween(Integer value1, Integer value2) {
            addCriterion("old_transport_price between", value1, value2, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("old_transport_price not between", value1, value2, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(Integer value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(Integer value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(Integer value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(Integer value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(Integer value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(Integer value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<Integer> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<Integer> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(Integer value1, Integer value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andExamineStatusIsNull() {
            addCriterion("examine_status is null");
            return (Criteria) this;
        }

        public Criteria andExamineStatusIsNotNull() {
            addCriterion("examine_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStatusEqualTo(Integer value) {
            addCriterion("examine_status =", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotEqualTo(Integer value) {
            addCriterion("examine_status <>", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusGreaterThan(Integer value) {
            addCriterion("examine_status >", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine_status >=", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLessThan(Integer value) {
            addCriterion("examine_status <", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("examine_status <=", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLike(Integer value) {
            addCriterion("examine_status like", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotLike(Integer value) {
            addCriterion("examine_status not like", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusIn(List<Integer> values) {
            addCriterion("examine_status in", values, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotIn(List<Integer> values) {
            addCriterion("examine_status not in", values, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusBetween(Integer value1, Integer value2) {
            addCriterion("examine_status between", value1, value2, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("examine_status not between", value1, value2, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusIsNull() {
            addCriterion("finance_review_status is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusIsNotNull() {
            addCriterion("finance_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusEqualTo(Integer value) {
            addCriterion("finance_review_status =", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusNotEqualTo(Integer value) {
            addCriterion("finance_review_status <>", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusGreaterThan(Integer value) {
            addCriterion("finance_review_status >", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_review_status >=", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusLessThan(Integer value) {
            addCriterion("finance_review_status <", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("finance_review_status <=", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusLike(Integer value) {
            addCriterion("finance_review_status like", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusNotLike(Integer value) {
            addCriterion("finance_review_status not like", value, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusIn(List<Integer> values) {
            addCriterion("finance_review_status in", values, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusNotIn(List<Integer> values) {
            addCriterion("finance_review_status not in", values, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("finance_review_status between", value1, value2, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceReviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_review_status not between", value1, value2, "financeReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusIsNull() {
            addCriterion("finance_loan_status is null");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusIsNotNull() {
            addCriterion("finance_loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusEqualTo(Integer value) {
            addCriterion("finance_loan_status =", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusNotEqualTo(Integer value) {
            addCriterion("finance_loan_status <>", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusGreaterThan(Integer value) {
            addCriterion("finance_loan_status >", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_loan_status >=", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusLessThan(Integer value) {
            addCriterion("finance_loan_status <", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusLessThanOrEqualTo(Integer value) {
            addCriterion("finance_loan_status <=", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusLike(Integer value) {
            addCriterion("finance_loan_status like", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusNotLike(Integer value) {
            addCriterion("finance_loan_status not like", value, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusIn(List<Integer> values) {
            addCriterion("finance_loan_status in", values, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusNotIn(List<Integer> values) {
            addCriterion("finance_loan_status not in", values, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusBetween(Integer value1, Integer value2) {
            addCriterion("finance_loan_status between", value1, value2, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceLoanStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_loan_status not between", value1, value2, "financeLoanStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeModelIsNull() {
            addCriterion("distribute_model is null");
            return (Criteria) this;
        }

        public Criteria andDistributeModelIsNotNull() {
            addCriterion("distribute_model is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeModelEqualTo(Integer value) {
            addCriterion("distribute_model =", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelNotEqualTo(Integer value) {
            addCriterion("distribute_model <>", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelGreaterThan(Integer value) {
            addCriterion("distribute_model >", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_model >=", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelLessThan(Integer value) {
            addCriterion("distribute_model <", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_model <=", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelLike(Integer value) {
            addCriterion("distribute_model like", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelNotLike(Integer value) {
            addCriterion("distribute_model not like", value, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelIn(List<Integer> values) {
            addCriterion("distribute_model in", values, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelNotIn(List<Integer> values) {
            addCriterion("distribute_model not in", values, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelBetween(Integer value1, Integer value2) {
            addCriterion("distribute_model between", value1, value2, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeModelNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_model not between", value1, value2, "distributeModel");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIsNull() {
            addCriterion("distribute_status is null");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIsNotNull() {
            addCriterion("distribute_status is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusEqualTo(Integer value) {
            addCriterion("distribute_status =", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotEqualTo(Integer value) {
            addCriterion("distribute_status <>", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusGreaterThan(Integer value) {
            addCriterion("distribute_status >", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_status >=", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLessThan(Integer value) {
            addCriterion("distribute_status <", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_status <=", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusLike(Integer value) {
            addCriterion("distribute_status like", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotLike(Integer value) {
            addCriterion("distribute_status not like", value, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusIn(List<Integer> values) {
            addCriterion("distribute_status in", values, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotIn(List<Integer> values) {
            addCriterion("distribute_status not in", values, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusBetween(Integer value1, Integer value2) {
            addCriterion("distribute_status between", value1, value2, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_status not between", value1, value2, "distributeStatus");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNull() {
            addCriterion("distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNotNull() {
            addCriterion("distribute_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeEqualTo(Date value) {
            addCriterion("distribute_time =", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotEqualTo(Date value) {
            addCriterion("distribute_time <>", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThan(Date value) {
            addCriterion("distribute_time >", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribute_time >=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThan(Date value) {
            addCriterion("distribute_time <", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribute_time <=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLike(Date value) {
            addCriterion("distribute_time like", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotLike(Date value) {
            addCriterion("distribute_time not like", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIn(List<Date> values) {
            addCriterion("distribute_time in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotIn(List<Date> values) {
            addCriterion("distribute_time not in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeBetween(Date value1, Date value2) {
            addCriterion("distribute_time between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribute_time not between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusIsNull() {
            addCriterion("allot_price_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusIsNotNull() {
            addCriterion("allot_price_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusEqualTo(Integer value) {
            addCriterion("allot_price_status =", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusNotEqualTo(Integer value) {
            addCriterion("allot_price_status <>", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusGreaterThan(Integer value) {
            addCriterion("allot_price_status >", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_price_status >=", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusLessThan(Integer value) {
            addCriterion("allot_price_status <", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("allot_price_status <=", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusLike(Integer value) {
            addCriterion("allot_price_status like", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusNotLike(Integer value) {
            addCriterion("allot_price_status not like", value, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusIn(List<Integer> values) {
            addCriterion("allot_price_status in", values, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusNotIn(List<Integer> values) {
            addCriterion("allot_price_status not in", values, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusBetween(Integer value1, Integer value2) {
            addCriterion("allot_price_status between", value1, value2, "allotPriceStatus");
            return (Criteria) this;
        }

        public Criteria andAllotPriceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_price_status not between", value1, value2, "allotPriceStatus");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table tms_transport_order
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