package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class PaymentApplyQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public PaymentApplyQuery() {
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
     * This class corresponds to the database table b2b_payment_apply
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andPaymentApplyNoIsNull() {
            addCriterion("payment_apply_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoIsNotNull() {
            addCriterion("payment_apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoEqualTo(String value) {
            addCriterion("payment_apply_no =", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoNotEqualTo(String value) {
            addCriterion("payment_apply_no <>", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoGreaterThan(String value) {
            addCriterion("payment_apply_no >", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_apply_no >=", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoLessThan(String value) {
            addCriterion("payment_apply_no <", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoLessThanOrEqualTo(String value) {
            addCriterion("payment_apply_no <=", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoLike(String value) {
            addCriterion("payment_apply_no like", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoNotLike(String value) {
            addCriterion("payment_apply_no not like", value, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoIn(List<String> values) {
            addCriterion("payment_apply_no in", values, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoNotIn(List<String> values) {
            addCriterion("payment_apply_no not in", values, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoBetween(String value1, String value2) {
            addCriterion("payment_apply_no between", value1, value2, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andPaymentApplyNoNotBetween(String value1, String value2) {
            addCriterion("payment_apply_no not between", value1, value2, "paymentApplyNo");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Long value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Long value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Long value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Long value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Long value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLike(Long value) {
            addCriterion("dealer_id like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotLike(Long value) {
            addCriterion("dealer_id not like", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Long> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Long> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Long value1, Long value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Long value1, Long value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdIsNull() {
            addCriterion("loan_order_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdIsNotNull() {
            addCriterion("loan_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdEqualTo(Long value) {
            addCriterion("loan_order_id =", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdNotEqualTo(Long value) {
            addCriterion("loan_order_id <>", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdGreaterThan(Long value) {
            addCriterion("loan_order_id >", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("loan_order_id >=", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdLessThan(Long value) {
            addCriterion("loan_order_id <", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("loan_order_id <=", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdLike(Long value) {
            addCriterion("loan_order_id like", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdNotLike(Long value) {
            addCriterion("loan_order_id not like", value, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdIn(List<Long> values) {
            addCriterion("loan_order_id in", values, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdNotIn(List<Long> values) {
            addCriterion("loan_order_id not in", values, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdBetween(Long value1, Long value2) {
            addCriterion("loan_order_id between", value1, value2, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andLoanOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("loan_order_id not between", value1, value2, "loanOrderId");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsIsNull() {
            addCriterion("car_unique_ids is null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsIsNotNull() {
            addCriterion("car_unique_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsEqualTo(String value) {
            addCriterion("car_unique_ids =", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsNotEqualTo(String value) {
            addCriterion("car_unique_ids <>", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsGreaterThan(String value) {
            addCriterion("car_unique_ids >", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsGreaterThanOrEqualTo(String value) {
            addCriterion("car_unique_ids >=", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsLessThan(String value) {
            addCriterion("car_unique_ids <", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsLessThanOrEqualTo(String value) {
            addCriterion("car_unique_ids <=", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsLike(String value) {
            addCriterion("car_unique_ids like", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsNotLike(String value) {
            addCriterion("car_unique_ids not like", value, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsIn(List<String> values) {
            addCriterion("car_unique_ids in", values, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsNotIn(List<String> values) {
            addCriterion("car_unique_ids not in", values, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsBetween(String value1, String value2) {
            addCriterion("car_unique_ids between", value1, value2, "carUniqueIds");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIdsNotBetween(String value1, String value2) {
            addCriterion("car_unique_ids not between", value1, value2, "carUniqueIds");
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

        public Criteria andPlanPaymentTimeIsNull() {
            addCriterion("plan_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeIsNotNull() {
            addCriterion("plan_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeEqualTo(Date value) {
            addCriterion("plan_payment_time =", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeNotEqualTo(Date value) {
            addCriterion("plan_payment_time <>", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeGreaterThan(Date value) {
            addCriterion("plan_payment_time >", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_payment_time >=", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeLessThan(Date value) {
            addCriterion("plan_payment_time <", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_payment_time <=", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeLike(Date value) {
            addCriterion("plan_payment_time like", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeNotLike(Date value) {
            addCriterion("plan_payment_time not like", value, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeIn(List<Date> values) {
            addCriterion("plan_payment_time in", values, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeNotIn(List<Date> values) {
            addCriterion("plan_payment_time not in", values, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("plan_payment_time between", value1, value2, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andPlanPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_payment_time not between", value1, value2, "planPaymentTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeIsNull() {
            addCriterion("last_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeIsNotNull() {
            addCriterion("last_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeEqualTo(Date value) {
            addCriterion("last_apply_time =", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeNotEqualTo(Date value) {
            addCriterion("last_apply_time <>", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeGreaterThan(Date value) {
            addCriterion("last_apply_time >", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_apply_time >=", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeLessThan(Date value) {
            addCriterion("last_apply_time <", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_apply_time <=", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeLike(Date value) {
            addCriterion("last_apply_time like", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeNotLike(Date value) {
            addCriterion("last_apply_time not like", value, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeIn(List<Date> values) {
            addCriterion("last_apply_time in", values, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeNotIn(List<Date> values) {
            addCriterion("last_apply_time not in", values, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeBetween(Date value1, Date value2) {
            addCriterion("last_apply_time between", value1, value2, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andLastApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_apply_time not between", value1, value2, "lastApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(String value) {
            addCriterion("settlement_time =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(String value) {
            addCriterion("settlement_time <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(String value) {
            addCriterion("settlement_time >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_time >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(String value) {
            addCriterion("settlement_time <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(String value) {
            addCriterion("settlement_time <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLike(String value) {
            addCriterion("settlement_time like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotLike(String value) {
            addCriterion("settlement_time not like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<String> values) {
            addCriterion("settlement_time in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<String> values) {
            addCriterion("settlement_time not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(String value1, String value2) {
            addCriterion("settlement_time between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(String value1, String value2) {
            addCriterion("settlement_time not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountIsNull() {
            addCriterion("combined_service_amount is null");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountIsNotNull() {
            addCriterion("combined_service_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountEqualTo(Long value) {
            addCriterion("combined_service_amount =", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountNotEqualTo(Long value) {
            addCriterion("combined_service_amount <>", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountGreaterThan(Long value) {
            addCriterion("combined_service_amount >", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("combined_service_amount >=", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountLessThan(Long value) {
            addCriterion("combined_service_amount <", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountLessThanOrEqualTo(Long value) {
            addCriterion("combined_service_amount <=", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountLike(Long value) {
            addCriterion("combined_service_amount like", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountNotLike(Long value) {
            addCriterion("combined_service_amount not like", value, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountIn(List<Long> values) {
            addCriterion("combined_service_amount in", values, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountNotIn(List<Long> values) {
            addCriterion("combined_service_amount not in", values, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountBetween(Long value1, Long value2) {
            addCriterion("combined_service_amount between", value1, value2, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andCombinedServiceAmountNotBetween(Long value1, Long value2) {
            addCriterion("combined_service_amount not between", value1, value2, "combinedServiceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIsNull() {
            addCriterion("total_payment is null");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIsNotNull() {
            addCriterion("total_payment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentEqualTo(Long value) {
            addCriterion("total_payment =", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotEqualTo(Long value) {
            addCriterion("total_payment <>", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentGreaterThan(Long value) {
            addCriterion("total_payment >", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("total_payment >=", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentLessThan(Long value) {
            addCriterion("total_payment <", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentLessThanOrEqualTo(Long value) {
            addCriterion("total_payment <=", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentLike(Long value) {
            addCriterion("total_payment like", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotLike(Long value) {
            addCriterion("total_payment not like", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIn(List<Long> values) {
            addCriterion("total_payment in", values, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotIn(List<Long> values) {
            addCriterion("total_payment not in", values, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentBetween(Long value1, Long value2) {
            addCriterion("total_payment between", value1, value2, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotBetween(Long value1, Long value2) {
            addCriterion("total_payment not between", value1, value2, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountIsNull() {
            addCriterion("car_uniques_amount is null");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountIsNotNull() {
            addCriterion("car_uniques_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountEqualTo(Long value) {
            addCriterion("car_uniques_amount =", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountNotEqualTo(Long value) {
            addCriterion("car_uniques_amount <>", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountGreaterThan(Long value) {
            addCriterion("car_uniques_amount >", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("car_uniques_amount >=", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountLessThan(Long value) {
            addCriterion("car_uniques_amount <", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountLessThanOrEqualTo(Long value) {
            addCriterion("car_uniques_amount <=", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountLike(Long value) {
            addCriterion("car_uniques_amount like", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountNotLike(Long value) {
            addCriterion("car_uniques_amount not like", value, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountIn(List<Long> values) {
            addCriterion("car_uniques_amount in", values, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountNotIn(List<Long> values) {
            addCriterion("car_uniques_amount not in", values, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountBetween(Long value1, Long value2) {
            addCriterion("car_uniques_amount between", value1, value2, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesAmountNotBetween(Long value1, Long value2) {
            addCriterion("car_uniques_amount not between", value1, value2, "carUniquesAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountIsNull() {
            addCriterion("car_uniques_mara_amount is null");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountIsNotNull() {
            addCriterion("car_uniques_mara_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountEqualTo(Long value) {
            addCriterion("car_uniques_mara_amount =", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountNotEqualTo(Long value) {
            addCriterion("car_uniques_mara_amount <>", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountGreaterThan(Long value) {
            addCriterion("car_uniques_mara_amount >", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("car_uniques_mara_amount >=", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountLessThan(Long value) {
            addCriterion("car_uniques_mara_amount <", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountLessThanOrEqualTo(Long value) {
            addCriterion("car_uniques_mara_amount <=", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountLike(Long value) {
            addCriterion("car_uniques_mara_amount like", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountNotLike(Long value) {
            addCriterion("car_uniques_mara_amount not like", value, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountIn(List<Long> values) {
            addCriterion("car_uniques_mara_amount in", values, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountNotIn(List<Long> values) {
            addCriterion("car_uniques_mara_amount not in", values, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountBetween(Long value1, Long value2) {
            addCriterion("car_uniques_mara_amount between", value1, value2, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andCarUniquesMaraAmountNotBetween(Long value1, Long value2) {
            addCriterion("car_uniques_mara_amount not between", value1, value2, "carUniquesMaraAmount");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysIsNull() {
            addCriterion("rate_payment_days is null");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysIsNotNull() {
            addCriterion("rate_payment_days is not null");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysEqualTo(Integer value) {
            addCriterion("rate_payment_days =", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysNotEqualTo(Integer value) {
            addCriterion("rate_payment_days <>", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysGreaterThan(Integer value) {
            addCriterion("rate_payment_days >", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_payment_days >=", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysLessThan(Integer value) {
            addCriterion("rate_payment_days <", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysLessThanOrEqualTo(Integer value) {
            addCriterion("rate_payment_days <=", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysLike(Integer value) {
            addCriterion("rate_payment_days like", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysNotLike(Integer value) {
            addCriterion("rate_payment_days not like", value, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysIn(List<Integer> values) {
            addCriterion("rate_payment_days in", values, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysNotIn(List<Integer> values) {
            addCriterion("rate_payment_days not in", values, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysBetween(Integer value1, Integer value2) {
            addCriterion("rate_payment_days between", value1, value2, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_payment_days not between", value1, value2, "ratePaymentDays");
            return (Criteria) this;
        }

        public Criteria andRatePaymentIsNull() {
            addCriterion("rate_payment is null");
            return (Criteria) this;
        }

        public Criteria andRatePaymentIsNotNull() {
            addCriterion("rate_payment is not null");
            return (Criteria) this;
        }

        public Criteria andRatePaymentEqualTo(Long value) {
            addCriterion("rate_payment =", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentNotEqualTo(Long value) {
            addCriterion("rate_payment <>", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentGreaterThan(Long value) {
            addCriterion("rate_payment >", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("rate_payment >=", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentLessThan(Long value) {
            addCriterion("rate_payment <", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentLessThanOrEqualTo(Long value) {
            addCriterion("rate_payment <=", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentLike(Long value) {
            addCriterion("rate_payment like", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentNotLike(Long value) {
            addCriterion("rate_payment not like", value, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentIn(List<Long> values) {
            addCriterion("rate_payment in", values, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentNotIn(List<Long> values) {
            addCriterion("rate_payment not in", values, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentBetween(Long value1, Long value2) {
            addCriterion("rate_payment between", value1, value2, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andRatePaymentNotBetween(Long value1, Long value2) {
            addCriterion("rate_payment not between", value1, value2, "ratePayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysIsNull() {
            addCriterion("first_payment_days is null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysIsNotNull() {
            addCriterion("first_payment_days is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysEqualTo(Integer value) {
            addCriterion("first_payment_days =", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysNotEqualTo(Integer value) {
            addCriterion("first_payment_days <>", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysGreaterThan(Integer value) {
            addCriterion("first_payment_days >", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_payment_days >=", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysLessThan(Integer value) {
            addCriterion("first_payment_days <", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysLessThanOrEqualTo(Integer value) {
            addCriterion("first_payment_days <=", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysLike(Integer value) {
            addCriterion("first_payment_days like", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysNotLike(Integer value) {
            addCriterion("first_payment_days not like", value, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysIn(List<Integer> values) {
            addCriterion("first_payment_days in", values, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysNotIn(List<Integer> values) {
            addCriterion("first_payment_days not in", values, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysBetween(Integer value1, Integer value2) {
            addCriterion("first_payment_days between", value1, value2, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("first_payment_days not between", value1, value2, "firstPaymentDays");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentIsNull() {
            addCriterion("first_payment is null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentIsNotNull() {
            addCriterion("first_payment is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentEqualTo(Long value) {
            addCriterion("first_payment =", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentNotEqualTo(Long value) {
            addCriterion("first_payment <>", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentGreaterThan(Long value) {
            addCriterion("first_payment >", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("first_payment >=", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentLessThan(Long value) {
            addCriterion("first_payment <", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentLessThanOrEqualTo(Long value) {
            addCriterion("first_payment <=", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentLike(Long value) {
            addCriterion("first_payment like", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentNotLike(Long value) {
            addCriterion("first_payment not like", value, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentIn(List<Long> values) {
            addCriterion("first_payment in", values, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentNotIn(List<Long> values) {
            addCriterion("first_payment not in", values, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentBetween(Long value1, Long value2) {
            addCriterion("first_payment between", value1, value2, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andFirstPaymentNotBetween(Long value1, Long value2) {
            addCriterion("first_payment not between", value1, value2, "firstPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysIsNull() {
            addCriterion("secend_payment_days is null");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysIsNotNull() {
            addCriterion("secend_payment_days is not null");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysEqualTo(Integer value) {
            addCriterion("secend_payment_days =", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysNotEqualTo(Integer value) {
            addCriterion("secend_payment_days <>", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysGreaterThan(Integer value) {
            addCriterion("secend_payment_days >", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("secend_payment_days >=", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysLessThan(Integer value) {
            addCriterion("secend_payment_days <", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysLessThanOrEqualTo(Integer value) {
            addCriterion("secend_payment_days <=", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysLike(Integer value) {
            addCriterion("secend_payment_days like", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysNotLike(Integer value) {
            addCriterion("secend_payment_days not like", value, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysIn(List<Integer> values) {
            addCriterion("secend_payment_days in", values, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysNotIn(List<Integer> values) {
            addCriterion("secend_payment_days not in", values, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysBetween(Integer value1, Integer value2) {
            addCriterion("secend_payment_days between", value1, value2, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("secend_payment_days not between", value1, value2, "secendPaymentDays");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentIsNull() {
            addCriterion("secend_payment is null");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentIsNotNull() {
            addCriterion("secend_payment is not null");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentEqualTo(Long value) {
            addCriterion("secend_payment =", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentNotEqualTo(Long value) {
            addCriterion("secend_payment <>", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentGreaterThan(Long value) {
            addCriterion("secend_payment >", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("secend_payment >=", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentLessThan(Long value) {
            addCriterion("secend_payment <", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentLessThanOrEqualTo(Long value) {
            addCriterion("secend_payment <=", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentLike(Long value) {
            addCriterion("secend_payment like", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentNotLike(Long value) {
            addCriterion("secend_payment not like", value, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentIn(List<Long> values) {
            addCriterion("secend_payment in", values, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentNotIn(List<Long> values) {
            addCriterion("secend_payment not in", values, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentBetween(Long value1, Long value2) {
            addCriterion("secend_payment between", value1, value2, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andSecendPaymentNotBetween(Long value1, Long value2) {
            addCriterion("secend_payment not between", value1, value2, "secendPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysIsNull() {
            addCriterion("third_payment_days is null");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysIsNotNull() {
            addCriterion("third_payment_days is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysEqualTo(Integer value) {
            addCriterion("third_payment_days =", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysNotEqualTo(Integer value) {
            addCriterion("third_payment_days <>", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysGreaterThan(Integer value) {
            addCriterion("third_payment_days >", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_payment_days >=", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysLessThan(Integer value) {
            addCriterion("third_payment_days <", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysLessThanOrEqualTo(Integer value) {
            addCriterion("third_payment_days <=", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysLike(Integer value) {
            addCriterion("third_payment_days like", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysNotLike(Integer value) {
            addCriterion("third_payment_days not like", value, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysIn(List<Integer> values) {
            addCriterion("third_payment_days in", values, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysNotIn(List<Integer> values) {
            addCriterion("third_payment_days not in", values, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysBetween(Integer value1, Integer value2) {
            addCriterion("third_payment_days between", value1, value2, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("third_payment_days not between", value1, value2, "thirdPaymentDays");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentIsNull() {
            addCriterion("third_payment is null");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentIsNotNull() {
            addCriterion("third_payment is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentEqualTo(Long value) {
            addCriterion("third_payment =", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentNotEqualTo(Long value) {
            addCriterion("third_payment <>", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentGreaterThan(Long value) {
            addCriterion("third_payment >", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("third_payment >=", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentLessThan(Long value) {
            addCriterion("third_payment <", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentLessThanOrEqualTo(Long value) {
            addCriterion("third_payment <=", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentLike(Long value) {
            addCriterion("third_payment like", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentNotLike(Long value) {
            addCriterion("third_payment not like", value, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentIn(List<Long> values) {
            addCriterion("third_payment in", values, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentNotIn(List<Long> values) {
            addCriterion("third_payment not in", values, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentBetween(Long value1, Long value2) {
            addCriterion("third_payment between", value1, value2, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andThirdPaymentNotBetween(Long value1, Long value2) {
            addCriterion("third_payment not between", value1, value2, "thirdPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentIsNull() {
            addCriterion("has_payment is null");
            return (Criteria) this;
        }

        public Criteria andHasPaymentIsNotNull() {
            addCriterion("has_payment is not null");
            return (Criteria) this;
        }

        public Criteria andHasPaymentEqualTo(Long value) {
            addCriterion("has_payment =", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentNotEqualTo(Long value) {
            addCriterion("has_payment <>", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentGreaterThan(Long value) {
            addCriterion("has_payment >", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("has_payment >=", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentLessThan(Long value) {
            addCriterion("has_payment <", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentLessThanOrEqualTo(Long value) {
            addCriterion("has_payment <=", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentLike(Long value) {
            addCriterion("has_payment like", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentNotLike(Long value) {
            addCriterion("has_payment not like", value, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentIn(List<Long> values) {
            addCriterion("has_payment in", values, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentNotIn(List<Long> values) {
            addCriterion("has_payment not in", values, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentBetween(Long value1, Long value2) {
            addCriterion("has_payment between", value1, value2, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andHasPaymentNotBetween(Long value1, Long value2) {
            addCriterion("has_payment not between", value1, value2, "hasPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentIsNull() {
            addCriterion("need_payment is null");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentIsNotNull() {
            addCriterion("need_payment is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentEqualTo(Long value) {
            addCriterion("need_payment =", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotEqualTo(Long value) {
            addCriterion("need_payment <>", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentGreaterThan(Long value) {
            addCriterion("need_payment >", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("need_payment >=", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentLessThan(Long value) {
            addCriterion("need_payment <", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentLessThanOrEqualTo(Long value) {
            addCriterion("need_payment <=", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentLike(Long value) {
            addCriterion("need_payment like", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotLike(Long value) {
            addCriterion("need_payment not like", value, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentIn(List<Long> values) {
            addCriterion("need_payment in", values, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotIn(List<Long> values) {
            addCriterion("need_payment not in", values, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentBetween(Long value1, Long value2) {
            addCriterion("need_payment between", value1, value2, "needPayment");
            return (Criteria) this;
        }

        public Criteria andNeedPaymentNotBetween(Long value1, Long value2) {
            addCriterion("need_payment not between", value1, value2, "needPayment");
            return (Criteria) this;
        }

        public Criteria andRateRuleIsNull() {
            addCriterion("rate_rule is null");
            return (Criteria) this;
        }

        public Criteria andRateRuleIsNotNull() {
            addCriterion("rate_rule is not null");
            return (Criteria) this;
        }

        public Criteria andRateRuleEqualTo(String value) {
            addCriterion("rate_rule =", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleNotEqualTo(String value) {
            addCriterion("rate_rule <>", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleGreaterThan(String value) {
            addCriterion("rate_rule >", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleGreaterThanOrEqualTo(String value) {
            addCriterion("rate_rule >=", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleLessThan(String value) {
            addCriterion("rate_rule <", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleLessThanOrEqualTo(String value) {
            addCriterion("rate_rule <=", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleLike(String value) {
            addCriterion("rate_rule like", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleNotLike(String value) {
            addCriterion("rate_rule not like", value, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleIn(List<String> values) {
            addCriterion("rate_rule in", values, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleNotIn(List<String> values) {
            addCriterion("rate_rule not in", values, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleBetween(String value1, String value2) {
            addCriterion("rate_rule between", value1, value2, "rateRule");
            return (Criteria) this;
        }

        public Criteria andRateRuleNotBetween(String value1, String value2) {
            addCriterion("rate_rule not between", value1, value2, "rateRule");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentIsNull() {
            addCriterion("rete_rule_payment is null");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentIsNotNull() {
            addCriterion("rete_rule_payment is not null");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentEqualTo(Long value) {
            addCriterion("rete_rule_payment =", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentNotEqualTo(Long value) {
            addCriterion("rete_rule_payment <>", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentGreaterThan(Long value) {
            addCriterion("rete_rule_payment >", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("rete_rule_payment >=", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentLessThan(Long value) {
            addCriterion("rete_rule_payment <", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentLessThanOrEqualTo(Long value) {
            addCriterion("rete_rule_payment <=", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentLike(Long value) {
            addCriterion("rete_rule_payment like", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentNotLike(Long value) {
            addCriterion("rete_rule_payment not like", value, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentIn(List<Long> values) {
            addCriterion("rete_rule_payment in", values, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentNotIn(List<Long> values) {
            addCriterion("rete_rule_payment not in", values, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentBetween(Long value1, Long value2) {
            addCriterion("rete_rule_payment between", value1, value2, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andReteRulePaymentNotBetween(Long value1, Long value2) {
            addCriterion("rete_rule_payment not between", value1, value2, "reteRulePayment");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("discount_code is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("discount_code is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(String value) {
            addCriterion("discount_code =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(String value) {
            addCriterion("discount_code <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(String value) {
            addCriterion("discount_code >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("discount_code >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(String value) {
            addCriterion("discount_code <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(String value) {
            addCriterion("discount_code <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLike(String value) {
            addCriterion("discount_code like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotLike(String value) {
            addCriterion("discount_code not like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<String> values) {
            addCriterion("discount_code in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<String> values) {
            addCriterion("discount_code not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(String value1, String value2) {
            addCriterion("discount_code between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(String value1, String value2) {
            addCriterion("discount_code not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(java.math.BigDecimal value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(java.math.BigDecimal value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(java.math.BigDecimal value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(java.math.BigDecimal value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLike(java.math.BigDecimal value) {
            addCriterion("discount_rate like", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotLike(java.math.BigDecimal value) {
            addCriterion("discount_rate not like", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<java.math.BigDecimal> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<java.math.BigDecimal> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(Long value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(Long value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(Long value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(Long value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(Long value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLike(Long value) {
            addCriterion("discount_amount like", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotLike(Long value) {
            addCriterion("discount_amount not like", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<Long> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<Long> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(Long value1, Long value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(Long value1, Long value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(Long value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(Long value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(Long value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(Long value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(Long value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLike(Long value) {
            addCriterion("coupon_amount like", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotLike(Long value) {
            addCriterion("coupon_amount not like", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<Long> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<Long> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(Long value1, Long value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(Long value1, Long value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLike(Integer value) {
            addCriterion("coupon_type like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotLike(Integer value) {
            addCriterion("coupon_type not like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkIsNull() {
            addCriterion("coupon_amount_remark is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkIsNotNull() {
            addCriterion("coupon_amount_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkEqualTo(String value) {
            addCriterion("coupon_amount_remark =", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkNotEqualTo(String value) {
            addCriterion("coupon_amount_remark <>", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkGreaterThan(String value) {
            addCriterion("coupon_amount_remark >", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_amount_remark >=", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkLessThan(String value) {
            addCriterion("coupon_amount_remark <", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkLessThanOrEqualTo(String value) {
            addCriterion("coupon_amount_remark <=", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkLike(String value) {
            addCriterion("coupon_amount_remark like", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkNotLike(String value) {
            addCriterion("coupon_amount_remark not like", value, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkIn(List<String> values) {
            addCriterion("coupon_amount_remark in", values, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkNotIn(List<String> values) {
            addCriterion("coupon_amount_remark not in", values, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkBetween(String value1, String value2) {
            addCriterion("coupon_amount_remark between", value1, value2, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andCouponAmountRemarkNotBetween(String value1, String value2) {
            addCriterion("coupon_amount_remark not between", value1, value2, "couponAmountRemark");
            return (Criteria) this;
        }

        public Criteria andShippingAmountIsNull() {
            addCriterion("shipping_amount is null");
            return (Criteria) this;
        }

        public Criteria andShippingAmountIsNotNull() {
            addCriterion("shipping_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAmountEqualTo(Long value) {
            addCriterion("shipping_amount =", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountNotEqualTo(Long value) {
            addCriterion("shipping_amount <>", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountGreaterThan(Long value) {
            addCriterion("shipping_amount >", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("shipping_amount >=", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountLessThan(Long value) {
            addCriterion("shipping_amount <", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountLessThanOrEqualTo(Long value) {
            addCriterion("shipping_amount <=", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountLike(Long value) {
            addCriterion("shipping_amount like", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountNotLike(Long value) {
            addCriterion("shipping_amount not like", value, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountIn(List<Long> values) {
            addCriterion("shipping_amount in", values, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountNotIn(List<Long> values) {
            addCriterion("shipping_amount not in", values, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountBetween(Long value1, Long value2) {
            addCriterion("shipping_amount between", value1, value2, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andShippingAmountNotBetween(Long value1, Long value2) {
            addCriterion("shipping_amount not between", value1, value2, "shippingAmount");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Integer value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Integer value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Integer value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Integer value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLike(Integer value) {
            addCriterion("apply_status like", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotLike(Integer value) {
            addCriterion("apply_status not like", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Integer> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Integer> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
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

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andTmsVersionIsNull() {
            addCriterion("tms_version is null");
            return (Criteria) this;
        }

        public Criteria andTmsVersionIsNotNull() {
            addCriterion("tms_version is not null");
            return (Criteria) this;
        }

        public Criteria andTmsVersionEqualTo(Integer value) {
            addCriterion("tms_version =", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionNotEqualTo(Integer value) {
            addCriterion("tms_version <>", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionGreaterThan(Integer value) {
            addCriterion("tms_version >", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("tms_version >=", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionLessThan(Integer value) {
            addCriterion("tms_version <", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionLessThanOrEqualTo(Integer value) {
            addCriterion("tms_version <=", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionLike(Integer value) {
            addCriterion("tms_version like", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionNotLike(Integer value) {
            addCriterion("tms_version not like", value, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionIn(List<Integer> values) {
            addCriterion("tms_version in", values, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionNotIn(List<Integer> values) {
            addCriterion("tms_version not in", values, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionBetween(Integer value1, Integer value2) {
            addCriterion("tms_version between", value1, value2, "tmsVersion");
            return (Criteria) this;
        }

        public Criteria andTmsVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("tms_version not between", value1, value2, "tmsVersion");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table b2b_payment_apply
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