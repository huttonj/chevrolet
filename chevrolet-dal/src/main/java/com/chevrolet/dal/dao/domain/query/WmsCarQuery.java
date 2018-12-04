package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsCarQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsCarQuery() {
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
     * This class corresponds to the database table wms_car
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

        public Criteria andWmsCarIdIsNull() {
            addCriterion("wms_car_id is null");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdIsNotNull() {
            addCriterion("wms_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdEqualTo(Long value) {
            addCriterion("wms_car_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotEqualTo(Long value) {
            addCriterion("wms_car_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anWmsCarIdGreaterThan(Long value) {
            addCriterion("wms_car_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wms_car_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdLessThan(Long value) {
            addCriterion("wms_car_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdLessThanOrEqualTo(Long value) {
            addCriterion("wms_car_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdIn(List<Long> values) {
            addCriterion("wms_car_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotIn(List<Long> values) {
            addCriterion("wms_car_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdBetween(Long value1, Long value2) {
            addCriterion("wms_car_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWmsCarIdNotBetween(Long value1, Long value2) {
            addCriterion("wms_car_id not between", value1, value2, "id");
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

        public Criteria andCarStatusIsNull() {
            addCriterion("car_status is null");
            return (Criteria) this;
        }

        public Criteria andCarStatusIsNotNull() {
            addCriterion("car_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarStatusEqualTo(Integer value) {
            addCriterion("car_status =", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotEqualTo(Integer value) {
            addCriterion("car_status <>", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThan(Integer value) {
            addCriterion("car_status >", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_status >=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThan(Integer value) {
            addCriterion("car_status <", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThanOrEqualTo(Integer value) {
            addCriterion("car_status <=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLike(Integer value) {
            addCriterion("car_status like", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotLike(Integer value) {
            addCriterion("car_status not like", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusIn(List<Integer> values) {
            addCriterion("car_status in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotIn(List<Integer> values) {
            addCriterion("car_status not in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusBetween(Integer value1, Integer value2) {
            addCriterion("car_status between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("car_status not between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(Long value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(Long value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Long value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Long value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Long value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Long value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Long value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLike(Long value) {
            addCriterion("notice_id like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotLike(Long value) {
            addCriterion("notice_id not like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Long> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Long> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Long value1, Long value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Long value1, Long value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdIsNull() {
            addCriterion("cc_car_id is null");
            return (Criteria) this;
        }

        public Criteria andCcCarIdIsNotNull() {
            addCriterion("cc_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcCarIdEqualTo(Long value) {
            addCriterion("cc_car_id =", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdNotEqualTo(Long value) {
            addCriterion("cc_car_id <>", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdGreaterThan(Long value) {
            addCriterion("cc_car_id >", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cc_car_id >=", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdLessThan(Long value) {
            addCriterion("cc_car_id <", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdLessThanOrEqualTo(Long value) {
            addCriterion("cc_car_id <=", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdLike(Long value) {
            addCriterion("cc_car_id like", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdNotLike(Long value) {
            addCriterion("cc_car_id not like", value, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdIn(List<Long> values) {
            addCriterion("cc_car_id in", values, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdNotIn(List<Long> values) {
            addCriterion("cc_car_id not in", values, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdBetween(Long value1, Long value2) {
            addCriterion("cc_car_id between", value1, value2, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andCcCarIdNotBetween(Long value1, Long value2) {
            addCriterion("cc_car_id not between", value1, value2, "ccCarId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Long value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Long value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Long value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Long value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(Long value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(Long value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Long> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Long> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameIsNull() {
            addCriterion("warehouse_fullname is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameIsNotNull() {
            addCriterion("warehouse_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameEqualTo(String value) {
            addCriterion("warehouse_fullname =", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameNotEqualTo(String value) {
            addCriterion("warehouse_fullname <>", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameGreaterThan(String value) {
            addCriterion("warehouse_fullname >", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_fullname >=", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameLessThan(String value) {
            addCriterion("warehouse_fullname <", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_fullname <=", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameLike(String value) {
            addCriterion("warehouse_fullname like", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameNotLike(String value) {
            addCriterion("warehouse_fullname not like", value, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameIn(List<String> values) {
            addCriterion("warehouse_fullname in", values, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameNotIn(List<String> values) {
            addCriterion("warehouse_fullname not in", values, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameBetween(String value1, String value2) {
            addCriterion("warehouse_fullname between", value1, value2, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseFullnameNotBetween(String value1, String value2) {
            addCriterion("warehouse_fullname not between", value1, value2, "warehouseFullname");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNull() {
            addCriterion("warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNotNull() {
            addCriterion("warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeEqualTo(Integer value) {
            addCriterion("warehouse_type =", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotEqualTo(Integer value) {
            addCriterion("warehouse_type <>", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThan(Integer value) {
            addCriterion("warehouse_type >", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_type >=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThan(Integer value) {
            addCriterion("warehouse_type <", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_type <=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLike(Integer value) {
            addCriterion("warehouse_type like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotLike(Integer value) {
            addCriterion("warehouse_type not like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIn(List<Integer> values) {
            addCriterion("warehouse_type in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotIn(List<Integer> values) {
            addCriterion("warehouse_type not in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_type between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_type not between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(Long value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(Long value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterion("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterion("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterion("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterion("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterion("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLike(Date value) {
            addCriterion("entry_date like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotLike(Date value) {
            addCriterion("entry_date not like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterion("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterion("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterion("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterion("entry_date not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(Date value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(Date value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andKeyNumberIsNull() {
            addCriterion("key_number is null");
            return (Criteria) this;
        }

        public Criteria andKeyNumberIsNotNull() {
            addCriterion("key_number is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNumberEqualTo(Integer value) {
            addCriterion("key_number =", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberNotEqualTo(Integer value) {
            addCriterion("key_number <>", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberGreaterThan(Integer value) {
            addCriterion("key_number >", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_number >=", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberLessThan(Integer value) {
            addCriterion("key_number <", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("key_number <=", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberLike(Integer value) {
            addCriterion("key_number like", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberNotLike(Integer value) {
            addCriterion("key_number not like", value, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberIn(List<Integer> values) {
            addCriterion("key_number in", values, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberNotIn(List<Integer> values) {
            addCriterion("key_number not in", values, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberBetween(Integer value1, Integer value2) {
            addCriterion("key_number between", value1, value2, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andKeyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("key_number not between", value1, value2, "keyNumber");
            return (Criteria) this;
        }

        public Criteria andOdometerIsNull() {
            addCriterion("odometer is null");
            return (Criteria) this;
        }

        public Criteria andOdometerIsNotNull() {
            addCriterion("odometer is not null");
            return (Criteria) this;
        }

        public Criteria andOdometerEqualTo(String value) {
            addCriterion("odometer =", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotEqualTo(String value) {
            addCriterion("odometer <>", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThan(String value) {
            addCriterion("odometer >", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThanOrEqualTo(String value) {
            addCriterion("odometer >=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThan(String value) {
            addCriterion("odometer <", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThanOrEqualTo(String value) {
            addCriterion("odometer <=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLike(String value) {
            addCriterion("odometer like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotLike(String value) {
            addCriterion("odometer not like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerIn(List<String> values) {
            addCriterion("odometer in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotIn(List<String> values) {
            addCriterion("odometer not in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerBetween(String value1, String value2) {
            addCriterion("odometer between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotBetween(String value1, String value2) {
            addCriterion("odometer not between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusIsNull() {
            addCriterion("customs_clearance_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusIsNotNull() {
            addCriterion("customs_clearance_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusEqualTo(Integer value) {
            addCriterion("customs_clearance_status =", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusNotEqualTo(Integer value) {
            addCriterion("customs_clearance_status <>", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusGreaterThan(Integer value) {
            addCriterion("customs_clearance_status >", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customs_clearance_status >=", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusLessThan(Integer value) {
            addCriterion("customs_clearance_status <", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customs_clearance_status <=", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusLike(Integer value) {
            addCriterion("customs_clearance_status like", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusNotLike(Integer value) {
            addCriterion("customs_clearance_status not like", value, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusIn(List<Integer> values) {
            addCriterion("customs_clearance_status in", values, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusNotIn(List<Integer> values) {
            addCriterion("customs_clearance_status not in", values, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusBetween(Integer value1, Integer value2) {
            addCriterion("customs_clearance_status between", value1, value2, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customs_clearance_status not between", value1, value2, "customsClearanceStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusIsNull() {
            addCriterion("certificate_consistent_status is null");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusIsNotNull() {
            addCriterion("certificate_consistent_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusEqualTo(Integer value) {
            addCriterion("certificate_consistent_status =", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusNotEqualTo(Integer value) {
            addCriterion("certificate_consistent_status <>", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusGreaterThan(Integer value) {
            addCriterion("certificate_consistent_status >", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificate_consistent_status >=", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusLessThan(Integer value) {
            addCriterion("certificate_consistent_status <", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("certificate_consistent_status <=", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusLike(Integer value) {
            addCriterion("certificate_consistent_status like", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusNotLike(Integer value) {
            addCriterion("certificate_consistent_status not like", value, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusIn(List<Integer> values) {
            addCriterion("certificate_consistent_status in", values, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusNotIn(List<Integer> values) {
            addCriterion("certificate_consistent_status not in", values, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusBetween(Integer value1, Integer value2) {
            addCriterion("certificate_consistent_status between", value1, value2, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateConsistentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("certificate_consistent_status not between", value1, value2, "certificateConsistentStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusIsNull() {
            addCriterion("checklist_status is null");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusIsNotNull() {
            addCriterion("checklist_status is not null");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusEqualTo(Integer value) {
            addCriterion("checklist_status =", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusNotEqualTo(Integer value) {
            addCriterion("checklist_status <>", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusGreaterThan(Integer value) {
            addCriterion("checklist_status >", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checklist_status >=", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusLessThan(Integer value) {
            addCriterion("checklist_status <", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusLessThanOrEqualTo(Integer value) {
            addCriterion("checklist_status <=", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusLike(Integer value) {
            addCriterion("checklist_status like", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusNotLike(Integer value) {
            addCriterion("checklist_status not like", value, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusIn(List<Integer> values) {
            addCriterion("checklist_status in", values, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusNotIn(List<Integer> values) {
            addCriterion("checklist_status not in", values, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusBetween(Integer value1, Integer value2) {
            addCriterion("checklist_status between", value1, value2, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andChecklistStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checklist_status not between", value1, value2, "checklistStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusIsNull() {
            addCriterion("manual_status is null");
            return (Criteria) this;
        }

        public Criteria andManualStatusIsNotNull() {
            addCriterion("manual_status is not null");
            return (Criteria) this;
        }

        public Criteria andManualStatusEqualTo(Integer value) {
            addCriterion("manual_status =", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusNotEqualTo(Integer value) {
            addCriterion("manual_status <>", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusGreaterThan(Integer value) {
            addCriterion("manual_status >", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("manual_status >=", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusLessThan(Integer value) {
            addCriterion("manual_status <", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusLessThanOrEqualTo(Integer value) {
            addCriterion("manual_status <=", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusLike(Integer value) {
            addCriterion("manual_status like", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusNotLike(Integer value) {
            addCriterion("manual_status not like", value, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusIn(List<Integer> values) {
            addCriterion("manual_status in", values, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusNotIn(List<Integer> values) {
            addCriterion("manual_status not in", values, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusBetween(Integer value1, Integer value2) {
            addCriterion("manual_status between", value1, value2, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andManualStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("manual_status not between", value1, value2, "manualStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Long value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Long value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Long value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Long value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(Long value) {
            addCriterion("payment_id like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(Long value) {
            addCriterion("payment_id not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Long> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Long> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Long value1, Long value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusIsNull() {
            addCriterion("pay_off_status is null");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusIsNotNull() {
            addCriterion("pay_off_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusEqualTo(Integer value) {
            addCriterion("pay_off_status =", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusNotEqualTo(Integer value) {
            addCriterion("pay_off_status <>", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusGreaterThan(Integer value) {
            addCriterion("pay_off_status >", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_off_status >=", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusLessThan(Integer value) {
            addCriterion("pay_off_status <", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_off_status <=", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusLike(Integer value) {
            addCriterion("pay_off_status like", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusNotLike(Integer value) {
            addCriterion("pay_off_status not like", value, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusIn(List<Integer> values) {
            addCriterion("pay_off_status in", values, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusNotIn(List<Integer> values) {
            addCriterion("pay_off_status not in", values, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_off_status between", value1, value2, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPayOffStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_off_status not between", value1, value2, "payOffStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLike(Integer value) {
            addCriterion("payment_status like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotLike(Integer value) {
            addCriterion("payment_status not like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
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

        public Criteria andPaymentNoIsNull() {
            addCriterion("payment_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("payment_no =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("payment_no <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("payment_no >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_no >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("payment_no <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("payment_no <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("payment_no like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("payment_no not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("payment_no in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("payment_no not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("payment_no between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("payment_no not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNull() {
            addCriterion("store_status is null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNotNull() {
            addCriterion("store_status is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusEqualTo(Integer value) {
            addCriterion("store_status =", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotEqualTo(Integer value) {
            addCriterion("store_status <>", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThan(Integer value) {
            addCriterion("store_status >", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_status >=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThan(Integer value) {
            addCriterion("store_status <", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThanOrEqualTo(Integer value) {
            addCriterion("store_status <=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLike(Integer value) {
            addCriterion("store_status like", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotLike(Integer value) {
            addCriterion("store_status not like", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIn(List<Integer> values) {
            addCriterion("store_status in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotIn(List<Integer> values) {
            addCriterion("store_status not in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusBetween(Integer value1, Integer value2) {
            addCriterion("store_status between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("store_status not between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNull() {
            addCriterion("is_checked is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNotNull() {
            addCriterion("is_checked is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedEqualTo(Integer value) {
            addCriterion("is_checked =", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotEqualTo(Integer value) {
            addCriterion("is_checked <>", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThan(Integer value) {
            addCriterion("is_checked >", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_checked >=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThan(Integer value) {
            addCriterion("is_checked <", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("is_checked <=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLike(Integer value) {
            addCriterion("is_checked like", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotLike(Integer value) {
            addCriterion("is_checked not like", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIn(List<Integer> values) {
            addCriterion("is_checked in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotIn(List<Integer> values) {
            addCriterion("is_checked not in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("is_checked between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_checked not between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andDeliverableIsNull() {
            addCriterion("deliverable is null");
            return (Criteria) this;
        }

        public Criteria andDeliverableIsNotNull() {
            addCriterion("deliverable is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverableEqualTo(Integer value) {
            addCriterion("deliverable =", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableNotEqualTo(Integer value) {
            addCriterion("deliverable <>", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableGreaterThan(Integer value) {
            addCriterion("deliverable >", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverable >=", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableLessThan(Integer value) {
            addCriterion("deliverable <", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableLessThanOrEqualTo(Integer value) {
            addCriterion("deliverable <=", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableLike(Integer value) {
            addCriterion("deliverable like", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableNotLike(Integer value) {
            addCriterion("deliverable not like", value, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableIn(List<Integer> values) {
            addCriterion("deliverable in", values, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableNotIn(List<Integer> values) {
            addCriterion("deliverable not in", values, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableBetween(Integer value1, Integer value2) {
            addCriterion("deliverable between", value1, value2, "deliverable");
            return (Criteria) this;
        }

        public Criteria andDeliverableNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverable not between", value1, value2, "deliverable");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterion("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterion("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterion("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterion("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLike(Date value) {
            addCriterion("check_date like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotLike(Date value) {
            addCriterion("check_date not like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterion("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterion("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterion("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("check_date not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdIsNull() {
            addCriterion("car_storage_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdIsNotNull() {
            addCriterion("car_storage_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdEqualTo(Long value) {
            addCriterion("car_storage_operator_id =", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdNotEqualTo(Long value) {
            addCriterion("car_storage_operator_id <>", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdGreaterThan(Long value) {
            addCriterion("car_storage_operator_id >", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_storage_operator_id >=", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdLessThan(Long value) {
            addCriterion("car_storage_operator_id <", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("car_storage_operator_id <=", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdLike(Long value) {
            addCriterion("car_storage_operator_id like", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdNotLike(Long value) {
            addCriterion("car_storage_operator_id not like", value, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdIn(List<Long> values) {
            addCriterion("car_storage_operator_id in", values, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdNotIn(List<Long> values) {
            addCriterion("car_storage_operator_id not in", values, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdBetween(Long value1, Long value2) {
            addCriterion("car_storage_operator_id between", value1, value2, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("car_storage_operator_id not between", value1, value2, "carStorageOperatorId");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameIsNull() {
            addCriterion("car_storage_operator_name is null");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameIsNotNull() {
            addCriterion("car_storage_operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameEqualTo(String value) {
            addCriterion("car_storage_operator_name =", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameNotEqualTo(String value) {
            addCriterion("car_storage_operator_name <>", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameGreaterThan(String value) {
            addCriterion("car_storage_operator_name >", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_storage_operator_name >=", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameLessThan(String value) {
            addCriterion("car_storage_operator_name <", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("car_storage_operator_name <=", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameLike(String value) {
            addCriterion("car_storage_operator_name like", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameNotLike(String value) {
            addCriterion("car_storage_operator_name not like", value, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameIn(List<String> values) {
            addCriterion("car_storage_operator_name in", values, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameNotIn(List<String> values) {
            addCriterion("car_storage_operator_name not in", values, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameBetween(String value1, String value2) {
            addCriterion("car_storage_operator_name between", value1, value2, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andCarStorageOperatorNameNotBetween(String value1, String value2) {
            addCriterion("car_storage_operator_name not between", value1, value2, "carStorageOperatorName");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdIsNull() {
            addCriterion("area_position_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdIsNotNull() {
            addCriterion("area_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdEqualTo(Long value) {
            addCriterion("area_position_id =", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotEqualTo(Long value) {
            addCriterion("area_position_id <>", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdGreaterThan(Long value) {
            addCriterion("area_position_id >", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_position_id >=", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdLessThan(Long value) {
            addCriterion("area_position_id <", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdLessThanOrEqualTo(Long value) {
            addCriterion("area_position_id <=", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdLike(Long value) {
            addCriterion("area_position_id like", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotLike(Long value) {
            addCriterion("area_position_id not like", value, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdIn(List<Long> values) {
            addCriterion("area_position_id in", values, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotIn(List<Long> values) {
            addCriterion("area_position_id not in", values, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdBetween(Long value1, Long value2) {
            addCriterion("area_position_id between", value1, value2, "areaPositionId");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotBetween(Long value1, Long value2) {
            addCriterion("area_position_id not between", value1, value2, "areaPositionId");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table wms_car
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