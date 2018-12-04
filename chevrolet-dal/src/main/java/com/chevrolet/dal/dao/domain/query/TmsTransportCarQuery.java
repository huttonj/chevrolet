package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsTransportCarQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsTransportCarQuery() {
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
     * This class corresponds to the database table tms_transport_car
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

        public Criteria andTransportCarIdIsNull() {
            addCriterion("transport_car_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIsNotNull() {
            addCriterion("transport_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdEqualTo(Long value) {
            addCriterion("transport_car_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotEqualTo(Long value) {
            addCriterion("transport_car_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anTransportCarIdGreaterThan(Long value) {
            addCriterion("transport_car_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_car_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThan(Long value) {
            addCriterion("transport_car_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_car_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIn(List<Long> values) {
            addCriterion("transport_car_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotIn(List<Long> values) {
            addCriterion("transport_car_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdBetween(Long value1, Long value2) {
            addCriterion("transport_car_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_car_id not between", value1, value2, "id");
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

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(Integer value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(Integer value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNull() {
            addCriterion("guide_price is null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNotNull() {
            addCriterion("guide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceEqualTo(Long value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(Long value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(Long value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(Long value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(Long value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLike(Long value) {
            addCriterion("guide_price like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotLike(Long value) {
            addCriterion("guide_price not like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<Long> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<Long> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(Long value1, Long value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(Long value1, Long value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
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

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(Integer value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(Integer value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(Integer value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(Integer value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(Integer value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLike(Integer value) {
            addCriterion("service_charge like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotLike(Integer value) {
            addCriterion("service_charge not like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<Integer> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<Integer> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(Integer value1, Integer value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
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

        public Criteria andAwaitPriceIsNull() {
            addCriterion("await_price is null");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceIsNotNull() {
            addCriterion("await_price is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceEqualTo(Integer value) {
            addCriterion("await_price =", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceNotEqualTo(Integer value) {
            addCriterion("await_price <>", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceGreaterThan(Integer value) {
            addCriterion("await_price >", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("await_price >=", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceLessThan(Integer value) {
            addCriterion("await_price <", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("await_price <=", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceLike(Integer value) {
            addCriterion("await_price like", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceNotLike(Integer value) {
            addCriterion("await_price not like", value, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceIn(List<Integer> values) {
            addCriterion("await_price in", values, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceNotIn(List<Integer> values) {
            addCriterion("await_price not in", values, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceBetween(Integer value1, Integer value2) {
            addCriterion("await_price between", value1, value2, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andAwaitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("await_price not between", value1, value2, "awaitPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceIsNull() {
            addCriterion("empty_run_price is null");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceIsNotNull() {
            addCriterion("empty_run_price is not null");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceEqualTo(Integer value) {
            addCriterion("empty_run_price =", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceNotEqualTo(Integer value) {
            addCriterion("empty_run_price <>", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceGreaterThan(Integer value) {
            addCriterion("empty_run_price >", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("empty_run_price >=", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceLessThan(Integer value) {
            addCriterion("empty_run_price <", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceLessThanOrEqualTo(Integer value) {
            addCriterion("empty_run_price <=", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceLike(Integer value) {
            addCriterion("empty_run_price like", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceNotLike(Integer value) {
            addCriterion("empty_run_price not like", value, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceIn(List<Integer> values) {
            addCriterion("empty_run_price in", values, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceNotIn(List<Integer> values) {
            addCriterion("empty_run_price not in", values, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceBetween(Integer value1, Integer value2) {
            addCriterion("empty_run_price between", value1, value2, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andEmptyRunPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("empty_run_price not between", value1, value2, "emptyRunPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNull() {
            addCriterion("tax_price is null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNotNull() {
            addCriterion("tax_price is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceEqualTo(Integer value) {
            addCriterion("tax_price =", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotEqualTo(Integer value) {
            addCriterion("tax_price <>", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThan(Integer value) {
            addCriterion("tax_price >", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_price >=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThan(Integer value) {
            addCriterion("tax_price <", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThanOrEqualTo(Integer value) {
            addCriterion("tax_price <=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLike(Integer value) {
            addCriterion("tax_price like", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotLike(Integer value) {
            addCriterion("tax_price not like", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIn(List<Integer> values) {
            addCriterion("tax_price in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotIn(List<Integer> values) {
            addCriterion("tax_price not in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceBetween(Integer value1, Integer value2) {
            addCriterion("tax_price between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_price not between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIsNull() {
            addCriterion("start_city_id is null");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIsNotNull() {
            addCriterion("start_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartCityIdEqualTo(Long value) {
            addCriterion("start_city_id =", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotEqualTo(Long value) {
            addCriterion("start_city_id <>", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdGreaterThan(Long value) {
            addCriterion("start_city_id >", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("start_city_id >=", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLessThan(Long value) {
            addCriterion("start_city_id <", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLessThanOrEqualTo(Long value) {
            addCriterion("start_city_id <=", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLike(Long value) {
            addCriterion("start_city_id like", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotLike(Long value) {
            addCriterion("start_city_id not like", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIn(List<Long> values) {
            addCriterion("start_city_id in", values, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotIn(List<Long> values) {
            addCriterion("start_city_id not in", values, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdBetween(Long value1, Long value2) {
            addCriterion("start_city_id between", value1, value2, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotBetween(Long value1, Long value2) {
            addCriterion("start_city_id not between", value1, value2, "startCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIsNull() {
            addCriterion("destination_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIsNotNull() {
            addCriterion("destination_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdEqualTo(Long value) {
            addCriterion("destination_city_id =", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotEqualTo(Long value) {
            addCriterion("destination_city_id <>", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdGreaterThan(Long value) {
            addCriterion("destination_city_id >", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("destination_city_id >=", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLessThan(Long value) {
            addCriterion("destination_city_id <", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLessThanOrEqualTo(Long value) {
            addCriterion("destination_city_id <=", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLike(Long value) {
            addCriterion("destination_city_id like", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotLike(Long value) {
            addCriterion("destination_city_id not like", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIn(List<Long> values) {
            addCriterion("destination_city_id in", values, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotIn(List<Long> values) {
            addCriterion("destination_city_id not in", values, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdBetween(Long value1, Long value2) {
            addCriterion("destination_city_id between", value1, value2, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotBetween(Long value1, Long value2) {
            addCriterion("destination_city_id not between", value1, value2, "destinationCityId");
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

        public Criteria andInspectionTimeIsNull() {
            addCriterion("inspection_time is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeIsNotNull() {
            addCriterion("inspection_time is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeEqualTo(Date value) {
            addCriterion("inspection_time =", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotEqualTo(Date value) {
            addCriterion("inspection_time <>", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeGreaterThan(Date value) {
            addCriterion("inspection_time >", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inspection_time >=", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeLessThan(Date value) {
            addCriterion("inspection_time <", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("inspection_time <=", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeLike(Date value) {
            addCriterion("inspection_time like", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotLike(Date value) {
            addCriterion("inspection_time not like", value, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeIn(List<Date> values) {
            addCriterion("inspection_time in", values, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotIn(List<Date> values) {
            addCriterion("inspection_time not in", values, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeBetween(Date value1, Date value2) {
            addCriterion("inspection_time between", value1, value2, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andInspectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("inspection_time not between", value1, value2, "inspectionTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Date value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Date value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Date value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Date value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLike(Date value) {
            addCriterion("shipping_time like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotLike(Date value) {
            addCriterion("shipping_time not like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Date> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Date> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Date value1, Date value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeIsNull() {
            addCriterion("predict_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeIsNotNull() {
            addCriterion("predict_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeEqualTo(Date value) {
            addCriterion("predict_arrival_time =", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeNotEqualTo(Date value) {
            addCriterion("predict_arrival_time <>", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeGreaterThan(Date value) {
            addCriterion("predict_arrival_time >", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predict_arrival_time >=", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeLessThan(Date value) {
            addCriterion("predict_arrival_time <", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("predict_arrival_time <=", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeLike(Date value) {
            addCriterion("predict_arrival_time like", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeNotLike(Date value) {
            addCriterion("predict_arrival_time not like", value, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeIn(List<Date> values) {
            addCriterion("predict_arrival_time in", values, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeNotIn(List<Date> values) {
            addCriterion("predict_arrival_time not in", values, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("predict_arrival_time between", value1, value2, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPredictArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("predict_arrival_time not between", value1, value2, "predictArrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(Date value) {
            addCriterion("arrival_time like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(Date value) {
            addCriterion("arrival_time not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLike(Date value) {
            addCriterion("delivery_time like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotLike(Date value) {
            addCriterion("delivery_time not like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andImgPolicyIsNull() {
            addCriterion("img_policy is null");
            return (Criteria) this;
        }

        public Criteria andImgPolicyIsNotNull() {
            addCriterion("img_policy is not null");
            return (Criteria) this;
        }

        public Criteria andImgPolicyEqualTo(String value) {
            addCriterion("img_policy =", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyNotEqualTo(String value) {
            addCriterion("img_policy <>", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyGreaterThan(String value) {
            addCriterion("img_policy >", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("img_policy >=", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyLessThan(String value) {
            addCriterion("img_policy <", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyLessThanOrEqualTo(String value) {
            addCriterion("img_policy <=", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyLike(String value) {
            addCriterion("img_policy like", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyNotLike(String value) {
            addCriterion("img_policy not like", value, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyIn(List<String> values) {
            addCriterion("img_policy in", values, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyNotIn(List<String> values) {
            addCriterion("img_policy not in", values, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyBetween(String value1, String value2) {
            addCriterion("img_policy between", value1, value2, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgPolicyNotBetween(String value1, String value2) {
            addCriterion("img_policy not between", value1, value2, "imgPolicy");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryIsNull() {
            addCriterion("img_delivery is null");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryIsNotNull() {
            addCriterion("img_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryEqualTo(String value) {
            addCriterion("img_delivery =", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryNotEqualTo(String value) {
            addCriterion("img_delivery <>", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryGreaterThan(String value) {
            addCriterion("img_delivery >", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("img_delivery >=", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryLessThan(String value) {
            addCriterion("img_delivery <", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryLessThanOrEqualTo(String value) {
            addCriterion("img_delivery <=", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryLike(String value) {
            addCriterion("img_delivery like", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryNotLike(String value) {
            addCriterion("img_delivery not like", value, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryIn(List<String> values) {
            addCriterion("img_delivery in", values, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryNotIn(List<String> values) {
            addCriterion("img_delivery not in", values, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryBetween(String value1, String value2) {
            addCriterion("img_delivery between", value1, value2, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgDeliveryNotBetween(String value1, String value2) {
            addCriterion("img_delivery not between", value1, value2, "imgDelivery");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterIsNull() {
            addCriterion("img_pick_letter is null");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterIsNotNull() {
            addCriterion("img_pick_letter is not null");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterEqualTo(String value) {
            addCriterion("img_pick_letter =", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterNotEqualTo(String value) {
            addCriterion("img_pick_letter <>", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterGreaterThan(String value) {
            addCriterion("img_pick_letter >", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterGreaterThanOrEqualTo(String value) {
            addCriterion("img_pick_letter >=", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterLessThan(String value) {
            addCriterion("img_pick_letter <", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterLessThanOrEqualTo(String value) {
            addCriterion("img_pick_letter <=", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterLike(String value) {
            addCriterion("img_pick_letter like", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterNotLike(String value) {
            addCriterion("img_pick_letter not like", value, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterIn(List<String> values) {
            addCriterion("img_pick_letter in", values, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterNotIn(List<String> values) {
            addCriterion("img_pick_letter not in", values, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterBetween(String value1, String value2) {
            addCriterion("img_pick_letter between", value1, value2, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgPickLetterNotBetween(String value1, String value2) {
            addCriterion("img_pick_letter not between", value1, value2, "imgPickLetter");
            return (Criteria) this;
        }

        public Criteria andImgFrontIsNull() {
            addCriterion("img_front is null");
            return (Criteria) this;
        }

        public Criteria andImgFrontIsNotNull() {
            addCriterion("img_front is not null");
            return (Criteria) this;
        }

        public Criteria andImgFrontEqualTo(String value) {
            addCriterion("img_front =", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotEqualTo(String value) {
            addCriterion("img_front <>", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontGreaterThan(String value) {
            addCriterion("img_front >", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontGreaterThanOrEqualTo(String value) {
            addCriterion("img_front >=", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLessThan(String value) {
            addCriterion("img_front <", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLessThanOrEqualTo(String value) {
            addCriterion("img_front <=", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLike(String value) {
            addCriterion("img_front like", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotLike(String value) {
            addCriterion("img_front not like", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontIn(List<String> values) {
            addCriterion("img_front in", values, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotIn(List<String> values) {
            addCriterion("img_front not in", values, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontBetween(String value1, String value2) {
            addCriterion("img_front between", value1, value2, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotBetween(String value1, String value2) {
            addCriterion("img_front not between", value1, value2, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgBehindIsNull() {
            addCriterion("img_behind is null");
            return (Criteria) this;
        }

        public Criteria andImgBehindIsNotNull() {
            addCriterion("img_behind is not null");
            return (Criteria) this;
        }

        public Criteria andImgBehindEqualTo(String value) {
            addCriterion("img_behind =", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotEqualTo(String value) {
            addCriterion("img_behind <>", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindGreaterThan(String value) {
            addCriterion("img_behind >", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindGreaterThanOrEqualTo(String value) {
            addCriterion("img_behind >=", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLessThan(String value) {
            addCriterion("img_behind <", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLessThanOrEqualTo(String value) {
            addCriterion("img_behind <=", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLike(String value) {
            addCriterion("img_behind like", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotLike(String value) {
            addCriterion("img_behind not like", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindIn(List<String> values) {
            addCriterion("img_behind in", values, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotIn(List<String> values) {
            addCriterion("img_behind not in", values, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindBetween(String value1, String value2) {
            addCriterion("img_behind between", value1, value2, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotBetween(String value1, String value2) {
            addCriterion("img_behind not between", value1, value2, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgInnerIsNull() {
            addCriterion("img_inner is null");
            return (Criteria) this;
        }

        public Criteria andImgInnerIsNotNull() {
            addCriterion("img_inner is not null");
            return (Criteria) this;
        }

        public Criteria andImgInnerEqualTo(String value) {
            addCriterion("img_inner =", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerNotEqualTo(String value) {
            addCriterion("img_inner <>", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerGreaterThan(String value) {
            addCriterion("img_inner >", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerGreaterThanOrEqualTo(String value) {
            addCriterion("img_inner >=", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerLessThan(String value) {
            addCriterion("img_inner <", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerLessThanOrEqualTo(String value) {
            addCriterion("img_inner <=", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerLike(String value) {
            addCriterion("img_inner like", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerNotLike(String value) {
            addCriterion("img_inner not like", value, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerIn(List<String> values) {
            addCriterion("img_inner in", values, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerNotIn(List<String> values) {
            addCriterion("img_inner not in", values, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerBetween(String value1, String value2) {
            addCriterion("img_inner between", value1, value2, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgInnerNotBetween(String value1, String value2) {
            addCriterion("img_inner not between", value1, value2, "imgInner");
            return (Criteria) this;
        }

        public Criteria andImgOdometerIsNull() {
            addCriterion("img_odometer is null");
            return (Criteria) this;
        }

        public Criteria andImgOdometerIsNotNull() {
            addCriterion("img_odometer is not null");
            return (Criteria) this;
        }

        public Criteria andImgOdometerEqualTo(String value) {
            addCriterion("img_odometer =", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerNotEqualTo(String value) {
            addCriterion("img_odometer <>", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerGreaterThan(String value) {
            addCriterion("img_odometer >", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerGreaterThanOrEqualTo(String value) {
            addCriterion("img_odometer >=", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerLessThan(String value) {
            addCriterion("img_odometer <", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerLessThanOrEqualTo(String value) {
            addCriterion("img_odometer <=", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerLike(String value) {
            addCriterion("img_odometer like", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerNotLike(String value) {
            addCriterion("img_odometer not like", value, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerIn(List<String> values) {
            addCriterion("img_odometer in", values, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerNotIn(List<String> values) {
            addCriterion("img_odometer not in", values, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerBetween(String value1, String value2) {
            addCriterion("img_odometer between", value1, value2, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgOdometerNotBetween(String value1, String value2) {
            addCriterion("img_odometer not between", value1, value2, "imgOdometer");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIsNull() {
            addCriterion("img_nameplate is null");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIsNotNull() {
            addCriterion("img_nameplate is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameplateEqualTo(String value) {
            addCriterion("img_nameplate =", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotEqualTo(String value) {
            addCriterion("img_nameplate <>", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateGreaterThan(String value) {
            addCriterion("img_nameplate >", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateGreaterThanOrEqualTo(String value) {
            addCriterion("img_nameplate >=", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLessThan(String value) {
            addCriterion("img_nameplate <", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLessThanOrEqualTo(String value) {
            addCriterion("img_nameplate <=", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLike(String value) {
            addCriterion("img_nameplate like", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotLike(String value) {
            addCriterion("img_nameplate not like", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIn(List<String> values) {
            addCriterion("img_nameplate in", values, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotIn(List<String> values) {
            addCriterion("img_nameplate not in", values, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateBetween(String value1, String value2) {
            addCriterion("img_nameplate between", value1, value2, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotBetween(String value1, String value2) {
            addCriterion("img_nameplate not between", value1, value2, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusIsNull() {
            addCriterion("car_transport_status is null");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusIsNotNull() {
            addCriterion("car_transport_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusEqualTo(Integer value) {
            addCriterion("car_transport_status =", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusNotEqualTo(Integer value) {
            addCriterion("car_transport_status <>", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusGreaterThan(Integer value) {
            addCriterion("car_transport_status >", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_transport_status >=", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusLessThan(Integer value) {
            addCriterion("car_transport_status <", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusLessThanOrEqualTo(Integer value) {
            addCriterion("car_transport_status <=", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusLike(Integer value) {
            addCriterion("car_transport_status like", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusNotLike(Integer value) {
            addCriterion("car_transport_status not like", value, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusIn(List<Integer> values) {
            addCriterion("car_transport_status in", values, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusNotIn(List<Integer> values) {
            addCriterion("car_transport_status not in", values, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusBetween(Integer value1, Integer value2) {
            addCriterion("car_transport_status between", value1, value2, "carTransportStatus");
            return (Criteria) this;
        }

        public Criteria andCarTransportStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("car_transport_status not between", value1, value2, "carTransportStatus");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

        public Criteria andSettlementStatusIsNull() {
            addCriterion("settlement_status is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("settlement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Integer value) {
            addCriterion("settlement_status =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Integer value) {
            addCriterion("settlement_status <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Integer value) {
            addCriterion("settlement_status >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_status >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Integer value) {
            addCriterion("settlement_status <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_status <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLike(Integer value) {
            addCriterion("settlement_status like", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotLike(Integer value) {
            addCriterion("settlement_status not like", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Integer> values) {
            addCriterion("settlement_status in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Integer> values) {
            addCriterion("settlement_status not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status not between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementNoIsNull() {
            addCriterion("settlement_no is null");
            return (Criteria) this;
        }

        public Criteria andSettlementNoIsNotNull() {
            addCriterion("settlement_no is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementNoEqualTo(String value) {
            addCriterion("settlement_no =", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotEqualTo(String value) {
            addCriterion("settlement_no <>", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoGreaterThan(String value) {
            addCriterion("settlement_no >", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_no >=", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLessThan(String value) {
            addCriterion("settlement_no <", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLessThanOrEqualTo(String value) {
            addCriterion("settlement_no <=", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLike(String value) {
            addCriterion("settlement_no like", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotLike(String value) {
            addCriterion("settlement_no not like", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoIn(List<String> values) {
            addCriterion("settlement_no in", values, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotIn(List<String> values) {
            addCriterion("settlement_no not in", values, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoBetween(String value1, String value2) {
            addCriterion("settlement_no between", value1, value2, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotBetween(String value1, String value2) {
            addCriterion("settlement_no not between", value1, value2, "settlementNo");
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

        public Criteria andNoticeDeliveryTimeIsNull() {
            addCriterion("notice_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeIsNotNull() {
            addCriterion("notice_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeEqualTo(Date value) {
            addCriterion("notice_delivery_time =", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeNotEqualTo(Date value) {
            addCriterion("notice_delivery_time <>", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeGreaterThan(Date value) {
            addCriterion("notice_delivery_time >", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_delivery_time >=", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeLessThan(Date value) {
            addCriterion("notice_delivery_time <", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_delivery_time <=", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeLike(Date value) {
            addCriterion("notice_delivery_time like", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeNotLike(Date value) {
            addCriterion("notice_delivery_time not like", value, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeIn(List<Date> values) {
            addCriterion("notice_delivery_time in", values, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeNotIn(List<Date> values) {
            addCriterion("notice_delivery_time not in", values, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("notice_delivery_time between", value1, value2, "noticeDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andNoticeDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_delivery_time not between", value1, value2, "noticeDeliveryTime");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table tms_transport_car
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