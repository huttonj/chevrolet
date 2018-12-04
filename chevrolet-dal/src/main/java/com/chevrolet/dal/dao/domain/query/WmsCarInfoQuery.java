package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsCarInfoQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsCarInfoQuery() {
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
     * This class corresponds to the database table wms_car_info
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "id");
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

        public Criteria andShippingOrderIdIsNull() {
            addCriterion("shipping_order_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdIsNotNull() {
            addCriterion("shipping_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdEqualTo(Long value) {
            addCriterion("shipping_order_id =", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotEqualTo(Long value) {
            addCriterion("shipping_order_id <>", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdGreaterThan(Long value) {
            addCriterion("shipping_order_id >", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shipping_order_id >=", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLessThan(Long value) {
            addCriterion("shipping_order_id <", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("shipping_order_id <=", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLike(Long value) {
            addCriterion("shipping_order_id like", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotLike(Long value) {
            addCriterion("shipping_order_id not like", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdIn(List<Long> values) {
            addCriterion("shipping_order_id in", values, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotIn(List<Long> values) {
            addCriterion("shipping_order_id not in", values, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdBetween(Long value1, Long value2) {
            addCriterion("shipping_order_id between", value1, value2, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("shipping_order_id not between", value1, value2, "shippingOrderId");
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

        public Criteria andOutCarIdIsNull() {
            addCriterion("out_car_id is null");
            return (Criteria) this;
        }

        public Criteria andOutCarIdIsNotNull() {
            addCriterion("out_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutCarIdEqualTo(Long value) {
            addCriterion("out_car_id =", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdNotEqualTo(Long value) {
            addCriterion("out_car_id <>", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdGreaterThan(Long value) {
            addCriterion("out_car_id >", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("out_car_id >=", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdLessThan(Long value) {
            addCriterion("out_car_id <", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdLessThanOrEqualTo(Long value) {
            addCriterion("out_car_id <=", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdLike(Long value) {
            addCriterion("out_car_id like", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdNotLike(Long value) {
            addCriterion("out_car_id not like", value, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdIn(List<Long> values) {
            addCriterion("out_car_id in", values, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdNotIn(List<Long> values) {
            addCriterion("out_car_id not in", values, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdBetween(Long value1, Long value2) {
            addCriterion("out_car_id between", value1, value2, "outCarId");
            return (Criteria) this;
        }

        public Criteria andOutCarIdNotBetween(Long value1, Long value2) {
            addCriterion("out_car_id not between", value1, value2, "outCarId");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeIsNull() {
            addCriterion("car_source_type is null");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeIsNotNull() {
            addCriterion("car_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeEqualTo(Integer value) {
            addCriterion("car_source_type =", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeNotEqualTo(Integer value) {
            addCriterion("car_source_type <>", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeGreaterThan(Integer value) {
            addCriterion("car_source_type >", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_source_type >=", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeLessThan(Integer value) {
            addCriterion("car_source_type <", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("car_source_type <=", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeLike(Integer value) {
            addCriterion("car_source_type like", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeNotLike(Integer value) {
            addCriterion("car_source_type not like", value, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeIn(List<Integer> values) {
            addCriterion("car_source_type in", values, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeNotIn(List<Integer> values) {
            addCriterion("car_source_type not in", values, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("car_source_type between", value1, value2, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_source_type not between", value1, value2, "carSourceType");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdIsNull() {
            addCriterion("car_snap_id is null");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdIsNotNull() {
            addCriterion("car_snap_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdEqualTo(Long value) {
            addCriterion("car_snap_id =", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdNotEqualTo(Long value) {
            addCriterion("car_snap_id <>", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdGreaterThan(Long value) {
            addCriterion("car_snap_id >", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_snap_id >=", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdLessThan(Long value) {
            addCriterion("car_snap_id <", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdLessThanOrEqualTo(Long value) {
            addCriterion("car_snap_id <=", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdLike(Long value) {
            addCriterion("car_snap_id like", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdNotLike(Long value) {
            addCriterion("car_snap_id not like", value, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdIn(List<Long> values) {
            addCriterion("car_snap_id in", values, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdNotIn(List<Long> values) {
            addCriterion("car_snap_id not in", values, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdBetween(Long value1, Long value2) {
            addCriterion("car_snap_id between", value1, value2, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andCarSnapIdNotBetween(Long value1, Long value2) {
            addCriterion("car_snap_id not between", value1, value2, "carSnapId");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(Integer value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(Integer value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(Integer value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(Integer value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(Integer value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(Integer value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(Integer value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<Integer> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<Integer> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(Integer value1, Integer value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(Integer value1, Integer value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(Integer value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(Integer value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Integer value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Integer value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Integer value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Integer value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLike(Integer value) {
            addCriterion("series_id like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotLike(Integer value) {
            addCriterion("series_id not like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Integer> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Integer> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(Integer value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(Integer value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNull() {
            addCriterion("outer_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNotNull() {
            addCriterion("outer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterIdEqualTo(Integer value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(Integer value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(Integer value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(Integer value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(Integer value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(Integer value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(Integer value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<Integer> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<Integer> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(Integer value1, Integer value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterNameIsNull() {
            addCriterion("outer_name is null");
            return (Criteria) this;
        }

        public Criteria andOuterNameIsNotNull() {
            addCriterion("outer_name is not null");
            return (Criteria) this;
        }

        public Criteria andOuterNameEqualTo(String value) {
            addCriterion("outer_name =", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameNotEqualTo(String value) {
            addCriterion("outer_name <>", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameGreaterThan(String value) {
            addCriterion("outer_name >", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameGreaterThanOrEqualTo(String value) {
            addCriterion("outer_name >=", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameLessThan(String value) {
            addCriterion("outer_name <", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameLessThanOrEqualTo(String value) {
            addCriterion("outer_name <=", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameLike(String value) {
            addCriterion("outer_name like", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameNotLike(String value) {
            addCriterion("outer_name not like", value, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameIn(List<String> values) {
            addCriterion("outer_name in", values, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameNotIn(List<String> values) {
            addCriterion("outer_name not in", values, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameBetween(String value1, String value2) {
            addCriterion("outer_name between", value1, value2, "outerName");
            return (Criteria) this;
        }

        public Criteria andOuterNameNotBetween(String value1, String value2) {
            addCriterion("outer_name not between", value1, value2, "outerName");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNull() {
            addCriterion("inner_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNotNull() {
            addCriterion("inner_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerIdEqualTo(Integer value) {
            addCriterion("inner_id =", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotEqualTo(Integer value) {
            addCriterion("inner_id <>", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThan(Integer value) {
            addCriterion("inner_id >", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inner_id >=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThan(Integer value) {
            addCriterion("inner_id <", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("inner_id <=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLike(Integer value) {
            addCriterion("inner_id like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotLike(Integer value) {
            addCriterion("inner_id not like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdIn(List<Integer> values) {
            addCriterion("inner_id in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotIn(List<Integer> values) {
            addCriterion("inner_id not in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdBetween(Integer value1, Integer value2) {
            addCriterion("inner_id between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inner_id not between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerNameIsNull() {
            addCriterion("inner_name is null");
            return (Criteria) this;
        }

        public Criteria andInnerNameIsNotNull() {
            addCriterion("inner_name is not null");
            return (Criteria) this;
        }

        public Criteria andInnerNameEqualTo(String value) {
            addCriterion("inner_name =", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotEqualTo(String value) {
            addCriterion("inner_name <>", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameGreaterThan(String value) {
            addCriterion("inner_name >", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("inner_name >=", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLessThan(String value) {
            addCriterion("inner_name <", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLessThanOrEqualTo(String value) {
            addCriterion("inner_name <=", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameLike(String value) {
            addCriterion("inner_name like", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotLike(String value) {
            addCriterion("inner_name not like", value, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameIn(List<String> values) {
            addCriterion("inner_name in", values, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotIn(List<String> values) {
            addCriterion("inner_name not in", values, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameBetween(String value1, String value2) {
            addCriterion("inner_name between", value1, value2, "innerName");
            return (Criteria) this;
        }

        public Criteria andInnerNameNotBetween(String value1, String value2) {
            addCriterion("inner_name not between", value1, value2, "innerName");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIsNull() {
            addCriterion("car_unique is null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIsNotNull() {
            addCriterion("car_unique is not null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueEqualTo(String value) {
            addCriterion("car_unique =", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotEqualTo(String value) {
            addCriterion("car_unique <>", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueGreaterThan(String value) {
            addCriterion("car_unique >", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("car_unique >=", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLessThan(String value) {
            addCriterion("car_unique <", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLessThanOrEqualTo(String value) {
            addCriterion("car_unique <=", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLike(String value) {
            addCriterion("car_unique like", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotLike(String value) {
            addCriterion("car_unique not like", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIn(List<String> values) {
            addCriterion("car_unique in", values, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotIn(List<String> values) {
            addCriterion("car_unique not in", values, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueBetween(String value1, String value2) {
            addCriterion("car_unique between", value1, value2, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotBetween(String value1, String value2) {
            addCriterion("car_unique not between", value1, value2, "carUnique");
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

        public Criteria andCarDataIsNull() {
            addCriterion("car_data is null");
            return (Criteria) this;
        }

        public Criteria andCarDataIsNotNull() {
            addCriterion("car_data is not null");
            return (Criteria) this;
        }

        public Criteria andCarDataEqualTo(String value) {
            addCriterion("car_data =", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataNotEqualTo(String value) {
            addCriterion("car_data <>", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataGreaterThan(String value) {
            addCriterion("car_data >", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataGreaterThanOrEqualTo(String value) {
            addCriterion("car_data >=", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataLessThan(String value) {
            addCriterion("car_data <", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataLessThanOrEqualTo(String value) {
            addCriterion("car_data <=", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataLike(String value) {
            addCriterion("car_data like", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataNotLike(String value) {
            addCriterion("car_data not like", value, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataIn(List<String> values) {
            addCriterion("car_data in", values, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataNotIn(List<String> values) {
            addCriterion("car_data not in", values, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataBetween(String value1, String value2) {
            addCriterion("car_data between", value1, value2, "carData");
            return (Criteria) this;
        }

        public Criteria andCarDataNotBetween(String value1, String value2) {
            addCriterion("car_data not between", value1, value2, "carData");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryIsNull() {
            addCriterion("car_accessory is null");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryIsNotNull() {
            addCriterion("car_accessory is not null");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryEqualTo(String value) {
            addCriterion("car_accessory =", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryNotEqualTo(String value) {
            addCriterion("car_accessory <>", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryGreaterThan(String value) {
            addCriterion("car_accessory >", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("car_accessory >=", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryLessThan(String value) {
            addCriterion("car_accessory <", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryLessThanOrEqualTo(String value) {
            addCriterion("car_accessory <=", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryLike(String value) {
            addCriterion("car_accessory like", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryNotLike(String value) {
            addCriterion("car_accessory not like", value, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryIn(List<String> values) {
            addCriterion("car_accessory in", values, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryNotIn(List<String> values) {
            addCriterion("car_accessory not in", values, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryBetween(String value1, String value2) {
            addCriterion("car_accessory between", value1, value2, "carAccessory");
            return (Criteria) this;
        }

        public Criteria andCarAccessoryNotBetween(String value1, String value2) {
            addCriterion("car_accessory not between", value1, value2, "carAccessory");
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

        public Criteria andOdometerEqualTo(java.lang.Float value) {
            addCriterion("odometer =", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotEqualTo(java.lang.Float value) {
            addCriterion("odometer <>", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThan(java.lang.Float value) {
            addCriterion("odometer >", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThanOrEqualTo(java.lang.Float value) {
            addCriterion("odometer >=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThan(java.lang.Float value) {
            addCriterion("odometer <", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThanOrEqualTo(java.lang.Float value) {
            addCriterion("odometer <=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLike(java.lang.Float value) {
            addCriterion("odometer like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotLike(java.lang.Float value) {
            addCriterion("odometer not like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerIn(List<java.lang.Float> values) {
            addCriterion("odometer in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotIn(List<java.lang.Float> values) {
            addCriterion("odometer not in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerBetween(java.lang.Float value1, java.lang.Float value2) {
            addCriterion("odometer between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotBetween(java.lang.Float value1, java.lang.Float value2) {
            addCriterion("odometer not between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNull() {
            addCriterion("parking_space is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNotNull() {
            addCriterion("parking_space is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceEqualTo(String value) {
            addCriterion("parking_space =", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotEqualTo(String value) {
            addCriterion("parking_space <>", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThan(String value) {
            addCriterion("parking_space >", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("parking_space >=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThan(String value) {
            addCriterion("parking_space <", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThanOrEqualTo(String value) {
            addCriterion("parking_space <=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLike(String value) {
            addCriterion("parking_space like", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotLike(String value) {
            addCriterion("parking_space not like", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIn(List<String> values) {
            addCriterion("parking_space in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotIn(List<String> values) {
            addCriterion("parking_space not in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceBetween(String value1, String value2) {
            addCriterion("parking_space between", value1, value2, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotBetween(String value1, String value2) {
            addCriterion("parking_space not between", value1, value2, "parkingSpace");
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

        public Criteria andImgEntryMassLossIsNull() {
            addCriterion("img_entry_mass_loss is null");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossIsNotNull() {
            addCriterion("img_entry_mass_loss is not null");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossEqualTo(String value) {
            addCriterion("img_entry_mass_loss =", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossNotEqualTo(String value) {
            addCriterion("img_entry_mass_loss <>", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossGreaterThan(String value) {
            addCriterion("img_entry_mass_loss >", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossGreaterThanOrEqualTo(String value) {
            addCriterion("img_entry_mass_loss >=", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossLessThan(String value) {
            addCriterion("img_entry_mass_loss <", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossLessThanOrEqualTo(String value) {
            addCriterion("img_entry_mass_loss <=", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossLike(String value) {
            addCriterion("img_entry_mass_loss like", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossNotLike(String value) {
            addCriterion("img_entry_mass_loss not like", value, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossIn(List<String> values) {
            addCriterion("img_entry_mass_loss in", values, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossNotIn(List<String> values) {
            addCriterion("img_entry_mass_loss not in", values, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossBetween(String value1, String value2) {
            addCriterion("img_entry_mass_loss between", value1, value2, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgEntryMassLossNotBetween(String value1, String value2) {
            addCriterion("img_entry_mass_loss not between", value1, value2, "imgEntryMassLoss");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoIsNull() {
            addCriterion("entry_mass_loss_memo is null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoIsNotNull() {
            addCriterion("entry_mass_loss_memo is not null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoEqualTo(String value) {
            addCriterion("entry_mass_loss_memo =", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoNotEqualTo(String value) {
            addCriterion("entry_mass_loss_memo <>", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoGreaterThan(String value) {
            addCriterion("entry_mass_loss_memo >", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoGreaterThanOrEqualTo(String value) {
            addCriterion("entry_mass_loss_memo >=", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoLessThan(String value) {
            addCriterion("entry_mass_loss_memo <", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoLessThanOrEqualTo(String value) {
            addCriterion("entry_mass_loss_memo <=", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoLike(String value) {
            addCriterion("entry_mass_loss_memo like", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoNotLike(String value) {
            addCriterion("entry_mass_loss_memo not like", value, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoIn(List<String> values) {
            addCriterion("entry_mass_loss_memo in", values, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoNotIn(List<String> values) {
            addCriterion("entry_mass_loss_memo not in", values, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoBetween(String value1, String value2) {
            addCriterion("entry_mass_loss_memo between", value1, value2, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossMemoNotBetween(String value1, String value2) {
            addCriterion("entry_mass_loss_memo not between", value1, value2, "entryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateIsNull() {
            addCriterion("entry_mass_loss_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateIsNotNull() {
            addCriterion("entry_mass_loss_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateEqualTo(Date value) {
            addCriterion("entry_mass_loss_date =", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateNotEqualTo(Date value) {
            addCriterion("entry_mass_loss_date <>", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateGreaterThan(Date value) {
            addCriterion("entry_mass_loss_date >", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_mass_loss_date >=", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateLessThan(Date value) {
            addCriterion("entry_mass_loss_date <", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateLessThanOrEqualTo(Date value) {
            addCriterion("entry_mass_loss_date <=", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateLike(Date value) {
            addCriterion("entry_mass_loss_date like", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateNotLike(Date value) {
            addCriterion("entry_mass_loss_date not like", value, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateIn(List<Date> values) {
            addCriterion("entry_mass_loss_date in", values, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateNotIn(List<Date> values) {
            addCriterion("entry_mass_loss_date not in", values, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateBetween(Date value1, Date value2) {
            addCriterion("entry_mass_loss_date between", value1, value2, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossDateNotBetween(Date value1, Date value2) {
            addCriterion("entry_mass_loss_date not between", value1, value2, "entryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorIsNull() {
            addCriterion("entry_mass_loss_transactor is null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorIsNotNull() {
            addCriterion("entry_mass_loss_transactor is not null");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorEqualTo(String value) {
            addCriterion("entry_mass_loss_transactor =", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorNotEqualTo(String value) {
            addCriterion("entry_mass_loss_transactor <>", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorGreaterThan(String value) {
            addCriterion("entry_mass_loss_transactor >", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("entry_mass_loss_transactor >=", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorLessThan(String value) {
            addCriterion("entry_mass_loss_transactor <", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorLessThanOrEqualTo(String value) {
            addCriterion("entry_mass_loss_transactor <=", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorLike(String value) {
            addCriterion("entry_mass_loss_transactor like", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorNotLike(String value) {
            addCriterion("entry_mass_loss_transactor not like", value, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorIn(List<String> values) {
            addCriterion("entry_mass_loss_transactor in", values, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorNotIn(List<String> values) {
            addCriterion("entry_mass_loss_transactor not in", values, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorBetween(String value1, String value2) {
            addCriterion("entry_mass_loss_transactor between", value1, value2, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andEntryMassLossTransactorNotBetween(String value1, String value2) {
            addCriterion("entry_mass_loss_transactor not between", value1, value2, "entryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossIsNull() {
            addCriterion("img_repertory_mass_loss is null");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossIsNotNull() {
            addCriterion("img_repertory_mass_loss is not null");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossEqualTo(String value) {
            addCriterion("img_repertory_mass_loss =", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossNotEqualTo(String value) {
            addCriterion("img_repertory_mass_loss <>", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossGreaterThan(String value) {
            addCriterion("img_repertory_mass_loss >", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossGreaterThanOrEqualTo(String value) {
            addCriterion("img_repertory_mass_loss >=", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossLessThan(String value) {
            addCriterion("img_repertory_mass_loss <", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossLessThanOrEqualTo(String value) {
            addCriterion("img_repertory_mass_loss <=", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossLike(String value) {
            addCriterion("img_repertory_mass_loss like", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossNotLike(String value) {
            addCriterion("img_repertory_mass_loss not like", value, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossIn(List<String> values) {
            addCriterion("img_repertory_mass_loss in", values, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossNotIn(List<String> values) {
            addCriterion("img_repertory_mass_loss not in", values, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossBetween(String value1, String value2) {
            addCriterion("img_repertory_mass_loss between", value1, value2, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgRepertoryMassLossNotBetween(String value1, String value2) {
            addCriterion("img_repertory_mass_loss not between", value1, value2, "imgRepertoryMassLoss");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoIsNull() {
            addCriterion("repertory_mass_loss_memo is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoIsNotNull() {
            addCriterion("repertory_mass_loss_memo is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoEqualTo(String value) {
            addCriterion("repertory_mass_loss_memo =", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoNotEqualTo(String value) {
            addCriterion("repertory_mass_loss_memo <>", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoGreaterThan(String value) {
            addCriterion("repertory_mass_loss_memo >", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoGreaterThanOrEqualTo(String value) {
            addCriterion("repertory_mass_loss_memo >=", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoLessThan(String value) {
            addCriterion("repertory_mass_loss_memo <", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoLessThanOrEqualTo(String value) {
            addCriterion("repertory_mass_loss_memo <=", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoLike(String value) {
            addCriterion("repertory_mass_loss_memo like", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoNotLike(String value) {
            addCriterion("repertory_mass_loss_memo not like", value, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoIn(List<String> values) {
            addCriterion("repertory_mass_loss_memo in", values, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoNotIn(List<String> values) {
            addCriterion("repertory_mass_loss_memo not in", values, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoBetween(String value1, String value2) {
            addCriterion("repertory_mass_loss_memo between", value1, value2, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossMemoNotBetween(String value1, String value2) {
            addCriterion("repertory_mass_loss_memo not between", value1, value2, "repertoryMassLossMemo");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateIsNull() {
            addCriterion("repertory_mass_loss_date is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateIsNotNull() {
            addCriterion("repertory_mass_loss_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateEqualTo(Date value) {
            addCriterion("repertory_mass_loss_date =", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateNotEqualTo(Date value) {
            addCriterion("repertory_mass_loss_date <>", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateGreaterThan(Date value) {
            addCriterion("repertory_mass_loss_date >", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repertory_mass_loss_date >=", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateLessThan(Date value) {
            addCriterion("repertory_mass_loss_date <", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateLessThanOrEqualTo(Date value) {
            addCriterion("repertory_mass_loss_date <=", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateLike(Date value) {
            addCriterion("repertory_mass_loss_date like", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateNotLike(Date value) {
            addCriterion("repertory_mass_loss_date not like", value, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateIn(List<Date> values) {
            addCriterion("repertory_mass_loss_date in", values, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateNotIn(List<Date> values) {
            addCriterion("repertory_mass_loss_date not in", values, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateBetween(Date value1, Date value2) {
            addCriterion("repertory_mass_loss_date between", value1, value2, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossDateNotBetween(Date value1, Date value2) {
            addCriterion("repertory_mass_loss_date not between", value1, value2, "repertoryMassLossDate");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorIsNull() {
            addCriterion("repertory_mass_loss_transactor is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorIsNotNull() {
            addCriterion("repertory_mass_loss_transactor is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorEqualTo(String value) {
            addCriterion("repertory_mass_loss_transactor =", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorNotEqualTo(String value) {
            addCriterion("repertory_mass_loss_transactor <>", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorGreaterThan(String value) {
            addCriterion("repertory_mass_loss_transactor >", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("repertory_mass_loss_transactor >=", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorLessThan(String value) {
            addCriterion("repertory_mass_loss_transactor <", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorLessThanOrEqualTo(String value) {
            addCriterion("repertory_mass_loss_transactor <=", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorLike(String value) {
            addCriterion("repertory_mass_loss_transactor like", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorNotLike(String value) {
            addCriterion("repertory_mass_loss_transactor not like", value, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorIn(List<String> values) {
            addCriterion("repertory_mass_loss_transactor in", values, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorNotIn(List<String> values) {
            addCriterion("repertory_mass_loss_transactor not in", values, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorBetween(String value1, String value2) {
            addCriterion("repertory_mass_loss_transactor between", value1, value2, "repertoryMassLossTransactor");
            return (Criteria) this;
        }

        public Criteria andRepertoryMassLossTransactorNotBetween(String value1, String value2) {
            addCriterion("repertory_mass_loss_transactor not between", value1, value2, "repertoryMassLossTransactor");
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

        public Criteria andCertificateStatusIsNull() {
            addCriterion("certificate_status is null");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusIsNotNull() {
            addCriterion("certificate_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusEqualTo(Integer value) {
            addCriterion("certificate_status =", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusNotEqualTo(Integer value) {
            addCriterion("certificate_status <>", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusGreaterThan(Integer value) {
            addCriterion("certificate_status >", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificate_status >=", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusLessThan(Integer value) {
            addCriterion("certificate_status <", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("certificate_status <=", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusLike(Integer value) {
            addCriterion("certificate_status like", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusNotLike(Integer value) {
            addCriterion("certificate_status not like", value, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusIn(List<Integer> values) {
            addCriterion("certificate_status in", values, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusNotIn(List<Integer> values) {
            addCriterion("certificate_status not in", values, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusBetween(Integer value1, Integer value2) {
            addCriterion("certificate_status between", value1, value2, "certificateStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("certificate_status not between", value1, value2, "certificateStatus");
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

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(Integer value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(Integer value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table wms_car_info
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