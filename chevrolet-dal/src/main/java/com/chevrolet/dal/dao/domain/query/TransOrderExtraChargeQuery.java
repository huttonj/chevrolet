package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TransOrderExtraChargeQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TransOrderExtraChargeQuery() {
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
     * This class corresponds to the database table tms_trans_order_extra_charge
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

        public Criteria andOrderExtraChargeIdIsNull() {
            addCriterion("order_extra_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdIsNotNull() {
            addCriterion("order_extra_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdEqualTo(Long value) {
            addCriterion("order_extra_charge_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdNotEqualTo(Long value) {
            addCriterion("order_extra_charge_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anOrderExtraChargeIdGreaterThan(Long value) {
            addCriterion("order_extra_charge_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_extra_charge_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdLessThan(Long value) {
            addCriterion("order_extra_charge_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("order_extra_charge_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdIn(List<Long> values) {
            addCriterion("order_extra_charge_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdNotIn(List<Long> values) {
            addCriterion("order_extra_charge_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdBetween(Long value1, Long value2) {
            addCriterion("order_extra_charge_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderExtraChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("order_extra_charge_id not between", value1, value2, "id");
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

        public Criteria andPayeeTypeIsNull() {
            addCriterion("payee_type is null");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeIsNotNull() {
            addCriterion("payee_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeEqualTo(Integer value) {
            addCriterion("payee_type =", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotEqualTo(Integer value) {
            addCriterion("payee_type <>", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeGreaterThan(Integer value) {
            addCriterion("payee_type >", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payee_type >=", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLessThan(Integer value) {
            addCriterion("payee_type <", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payee_type <=", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeLike(Integer value) {
            addCriterion("payee_type like", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotLike(Integer value) {
            addCriterion("payee_type not like", value, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeIn(List<Integer> values) {
            addCriterion("payee_type in", values, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotIn(List<Integer> values) {
            addCriterion("payee_type not in", values, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("payee_type between", value1, value2, "payeeType");
            return (Criteria) this;
        }

        public Criteria andPayeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payee_type not between", value1, value2, "payeeType");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdIsNull() {
            addCriterion("extra_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdIsNotNull() {
            addCriterion("extra_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdEqualTo(Long value) {
            addCriterion("extra_charge_id =", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdNotEqualTo(Long value) {
            addCriterion("extra_charge_id <>", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdGreaterThan(Long value) {
            addCriterion("extra_charge_id >", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("extra_charge_id >=", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdLessThan(Long value) {
            addCriterion("extra_charge_id <", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("extra_charge_id <=", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdLike(Long value) {
            addCriterion("extra_charge_id like", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdNotLike(Long value) {
            addCriterion("extra_charge_id not like", value, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdIn(List<Long> values) {
            addCriterion("extra_charge_id in", values, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdNotIn(List<Long> values) {
            addCriterion("extra_charge_id not in", values, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdBetween(Long value1, Long value2) {
            addCriterion("extra_charge_id between", value1, value2, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andExtraChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("extra_charge_id not between", value1, value2, "extraChargeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("charge_type like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("charge_type not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIsNull() {
            addCriterion("charge_fee is null");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIsNotNull() {
            addCriterion("charge_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFeeEqualTo(Integer value) {
            addCriterion("charge_fee =", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotEqualTo(Integer value) {
            addCriterion("charge_fee <>", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeGreaterThan(Integer value) {
            addCriterion("charge_fee >", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_fee >=", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeLessThan(Integer value) {
            addCriterion("charge_fee <", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_fee <=", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeLike(Integer value) {
            addCriterion("charge_fee like", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotLike(Integer value) {
            addCriterion("charge_fee not like", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIn(List<Integer> values) {
            addCriterion("charge_fee in", values, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotIn(List<Integer> values) {
            addCriterion("charge_fee not in", values, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeBetween(Integer value1, Integer value2) {
            addCriterion("charge_fee between", value1, value2, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_fee not between", value1, value2, "chargeFee");
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
     * This class corresponds to the database table tms_trans_order_extra_charge
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