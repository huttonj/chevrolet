package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class AllotCarQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public AllotCarQuery() {
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
     * This class corresponds to the database table allot_car
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

        public Criteria andAllotCarIdIsNull() {
            addCriterion("allot_car_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdIsNotNull() {
            addCriterion("allot_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdEqualTo(Long value) {
            addCriterion("allot_car_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdNotEqualTo(Long value) {
            addCriterion("allot_car_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anAllotCarIdGreaterThan(Long value) {
            addCriterion("allot_car_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("allot_car_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdLessThan(Long value) {
            addCriterion("allot_car_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdLessThanOrEqualTo(Long value) {
            addCriterion("allot_car_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdIn(List<Long> values) {
            addCriterion("allot_car_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdNotIn(List<Long> values) {
            addCriterion("allot_car_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdBetween(Long value1, Long value2) {
            addCriterion("allot_car_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAllotCarIdNotBetween(Long value1, Long value2) {
            addCriterion("allot_car_id not between", value1, value2, "id");
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

        public Criteria andAllotOrderIdIsNull() {
            addCriterion("allot_order_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdIsNotNull() {
            addCriterion("allot_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdEqualTo(Long value) {
            addCriterion("allot_order_id =", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotEqualTo(Long value) {
            addCriterion("allot_order_id <>", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdGreaterThan(Long value) {
            addCriterion("allot_order_id >", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("allot_order_id >=", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdLessThan(Long value) {
            addCriterion("allot_order_id <", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("allot_order_id <=", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdLike(Long value) {
            addCriterion("allot_order_id like", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotLike(Long value) {
            addCriterion("allot_order_id not like", value, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdIn(List<Long> values) {
            addCriterion("allot_order_id in", values, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotIn(List<Long> values) {
            addCriterion("allot_order_id not in", values, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdBetween(Long value1, Long value2) {
            addCriterion("allot_order_id between", value1, value2, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("allot_order_id not between", value1, value2, "allotOrderId");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusIsNull() {
            addCriterion("allot_car_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusIsNotNull() {
            addCriterion("allot_car_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusEqualTo(Integer value) {
            addCriterion("allot_car_status =", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusNotEqualTo(Integer value) {
            addCriterion("allot_car_status <>", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusGreaterThan(Integer value) {
            addCriterion("allot_car_status >", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_car_status >=", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusLessThan(Integer value) {
            addCriterion("allot_car_status <", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusLessThanOrEqualTo(Integer value) {
            addCriterion("allot_car_status <=", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusLike(Integer value) {
            addCriterion("allot_car_status like", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusNotLike(Integer value) {
            addCriterion("allot_car_status not like", value, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusIn(List<Integer> values) {
            addCriterion("allot_car_status in", values, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusNotIn(List<Integer> values) {
            addCriterion("allot_car_status not in", values, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusBetween(Integer value1, Integer value2) {
            addCriterion("allot_car_status between", value1, value2, "allotCarStatus");
            return (Criteria) this;
        }

        public Criteria andAllotCarStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_car_status not between", value1, value2, "allotCarStatus");
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

        public Criteria andWmsCarIdIsNull() {
            addCriterion("wms_car_id is null");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdIsNotNull() {
            addCriterion("wms_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdEqualTo(Long value) {
            addCriterion("wms_car_id =", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotEqualTo(Long value) {
            addCriterion("wms_car_id <>", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdGreaterThan(Long value) {
            addCriterion("wms_car_id >", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wms_car_id >=", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdLessThan(Long value) {
            addCriterion("wms_car_id <", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdLessThanOrEqualTo(Long value) {
            addCriterion("wms_car_id <=", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdLike(Long value) {
            addCriterion("wms_car_id like", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotLike(Long value) {
            addCriterion("wms_car_id not like", value, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdIn(List<Long> values) {
            addCriterion("wms_car_id in", values, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotIn(List<Long> values) {
            addCriterion("wms_car_id not in", values, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdBetween(Long value1, Long value2) {
            addCriterion("wms_car_id between", value1, value2, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotBetween(Long value1, Long value2) {
            addCriterion("wms_car_id not between", value1, value2, "wmsCarId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIsNull() {
            addCriterion("transport_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIsNotNull() {
            addCriterion("transport_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdEqualTo(Long value) {
            addCriterion("transport_order_id =", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotEqualTo(Long value) {
            addCriterion("transport_order_id <>", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdGreaterThan(Long value) {
            addCriterion("transport_order_id >", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_order_id >=", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThan(Long value) {
            addCriterion("transport_order_id <", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_order_id <=", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLike(Long value) {
            addCriterion("transport_order_id like", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotLike(Long value) {
            addCriterion("transport_order_id not like", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIn(List<Long> values) {
            addCriterion("transport_order_id in", values, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotIn(List<Long> values) {
            addCriterion("transport_order_id not in", values, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdBetween(Long value1, Long value2) {
            addCriterion("transport_order_id between", value1, value2, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_order_id not between", value1, value2, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoIsNull() {
            addCriterion("transport_order_no is null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoIsNotNull() {
            addCriterion("transport_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoEqualTo(String value) {
            addCriterion("transport_order_no =", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoNotEqualTo(String value) {
            addCriterion("transport_order_no <>", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoGreaterThan(String value) {
            addCriterion("transport_order_no >", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("transport_order_no >=", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoLessThan(String value) {
            addCriterion("transport_order_no <", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoLessThanOrEqualTo(String value) {
            addCriterion("transport_order_no <=", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoLike(String value) {
            addCriterion("transport_order_no like", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoNotLike(String value) {
            addCriterion("transport_order_no not like", value, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoIn(List<String> values) {
            addCriterion("transport_order_no in", values, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoNotIn(List<String> values) {
            addCriterion("transport_order_no not in", values, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoBetween(String value1, String value2) {
            addCriterion("transport_order_no between", value1, value2, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransportOrderNoNotBetween(String value1, String value2) {
            addCriterion("transport_order_no not between", value1, value2, "transportOrderNo");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdIsNull() {
            addCriterion("new_wms_car_id is null");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdIsNotNull() {
            addCriterion("new_wms_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdEqualTo(Long value) {
            addCriterion("new_wms_car_id =", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdNotEqualTo(Long value) {
            addCriterion("new_wms_car_id <>", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdGreaterThan(Long value) {
            addCriterion("new_wms_car_id >", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("new_wms_car_id >=", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdLessThan(Long value) {
            addCriterion("new_wms_car_id <", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdLessThanOrEqualTo(Long value) {
            addCriterion("new_wms_car_id <=", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdLike(Long value) {
            addCriterion("new_wms_car_id like", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdNotLike(Long value) {
            addCriterion("new_wms_car_id not like", value, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdIn(List<Long> values) {
            addCriterion("new_wms_car_id in", values, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdNotIn(List<Long> values) {
            addCriterion("new_wms_car_id not in", values, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdBetween(Long value1, Long value2) {
            addCriterion("new_wms_car_id between", value1, value2, "newWmsCarId");
            return (Criteria) this;
        }

        public Criteria andNewWmsCarIdNotBetween(Long value1, Long value2) {
            addCriterion("new_wms_car_id not between", value1, value2, "newWmsCarId");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table allot_car
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