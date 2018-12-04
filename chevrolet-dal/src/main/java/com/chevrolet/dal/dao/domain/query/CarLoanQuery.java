package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarLoanQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarLoanQuery() {
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
     * This class corresponds to the database table cc_car_loan
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

        public Criteria andCarLoanIdIsNull() {
            addCriterion("car_loan_id is null");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdIsNotNull() {
            addCriterion("car_loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdEqualTo(Long value) {
            addCriterion("car_loan_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdNotEqualTo(Long value) {
            addCriterion("car_loan_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarLoanIdGreaterThan(Long value) {
            addCriterion("car_loan_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_loan_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdLessThan(Long value) {
            addCriterion("car_loan_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdLessThanOrEqualTo(Long value) {
            addCriterion("car_loan_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdIn(List<Long> values) {
            addCriterion("car_loan_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdNotIn(List<Long> values) {
            addCriterion("car_loan_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdBetween(Long value1, Long value2) {
            addCriterion("car_loan_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarLoanIdNotBetween(Long value1, Long value2) {
            addCriterion("car_loan_id not between", value1, value2, "id");
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

        public Criteria andCarLoanOrderNoIsNull() {
            addCriterion("car_loan_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoIsNotNull() {
            addCriterion("car_loan_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoEqualTo(String value) {
            addCriterion("car_loan_order_no =", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoNotEqualTo(String value) {
            addCriterion("car_loan_order_no <>", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoGreaterThan(String value) {
            addCriterion("car_loan_order_no >", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_loan_order_no >=", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoLessThan(String value) {
            addCriterion("car_loan_order_no <", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoLessThanOrEqualTo(String value) {
            addCriterion("car_loan_order_no <=", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoLike(String value) {
            addCriterion("car_loan_order_no like", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoNotLike(String value) {
            addCriterion("car_loan_order_no not like", value, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoIn(List<String> values) {
            addCriterion("car_loan_order_no in", values, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoNotIn(List<String> values) {
            addCriterion("car_loan_order_no not in", values, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoBetween(String value1, String value2) {
            addCriterion("car_loan_order_no between", value1, value2, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanOrderNoNotBetween(String value1, String value2) {
            addCriterion("car_loan_order_no not between", value1, value2, "carLoanOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoIsNull() {
            addCriterion("split_order_no is null");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoIsNotNull() {
            addCriterion("split_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoEqualTo(String value) {
            addCriterion("split_order_no =", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoNotEqualTo(String value) {
            addCriterion("split_order_no <>", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoGreaterThan(String value) {
            addCriterion("split_order_no >", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("split_order_no >=", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoLessThan(String value) {
            addCriterion("split_order_no <", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoLessThanOrEqualTo(String value) {
            addCriterion("split_order_no <=", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoLike(String value) {
            addCriterion("split_order_no like", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoNotLike(String value) {
            addCriterion("split_order_no not like", value, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoIn(List<String> values) {
            addCriterion("split_order_no in", values, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoNotIn(List<String> values) {
            addCriterion("split_order_no not in", values, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoBetween(String value1, String value2) {
            addCriterion("split_order_no between", value1, value2, "splitOrderNo");
            return (Criteria) this;
        }

        public Criteria andSplitOrderNoNotBetween(String value1, String value2) {
            addCriterion("split_order_no not between", value1, value2, "splitOrderNo");
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

        public Criteria andLoanOrderTypeIsNull() {
            addCriterion("loan_order_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeIsNotNull() {
            addCriterion("loan_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeEqualTo(Integer value) {
            addCriterion("loan_order_type =", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeNotEqualTo(Integer value) {
            addCriterion("loan_order_type <>", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeGreaterThan(Integer value) {
            addCriterion("loan_order_type >", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_order_type >=", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeLessThan(Integer value) {
            addCriterion("loan_order_type <", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("loan_order_type <=", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeLike(Integer value) {
            addCriterion("loan_order_type like", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeNotLike(Integer value) {
            addCriterion("loan_order_type not like", value, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeIn(List<Integer> values) {
            addCriterion("loan_order_type in", values, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeNotIn(List<Integer> values) {
            addCriterion("loan_order_type not in", values, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("loan_order_type between", value1, value2, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andLoanOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_order_type not between", value1, value2, "loanOrderType");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstIsNull() {
            addCriterion("pricing_amount_first is null");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstIsNotNull() {
            addCriterion("pricing_amount_first is not null");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstEqualTo(Long value) {
            addCriterion("pricing_amount_first =", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstNotEqualTo(Long value) {
            addCriterion("pricing_amount_first <>", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstGreaterThan(Long value) {
            addCriterion("pricing_amount_first >", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstGreaterThanOrEqualTo(Long value) {
            addCriterion("pricing_amount_first >=", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstLessThan(Long value) {
            addCriterion("pricing_amount_first <", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstLessThanOrEqualTo(Long value) {
            addCriterion("pricing_amount_first <=", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstLike(Long value) {
            addCriterion("pricing_amount_first like", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstNotLike(Long value) {
            addCriterion("pricing_amount_first not like", value, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstIn(List<Long> values) {
            addCriterion("pricing_amount_first in", values, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstNotIn(List<Long> values) {
            addCriterion("pricing_amount_first not in", values, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstBetween(Long value1, Long value2) {
            addCriterion("pricing_amount_first between", value1, value2, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andPricingAmountFirstNotBetween(Long value1, Long value2) {
            addCriterion("pricing_amount_first not between", value1, value2, "pricingAmountFirst");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountIsNull() {
            addCriterion("single_loamount is null");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountIsNotNull() {
            addCriterion("single_loamount is not null");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountEqualTo(Long value) {
            addCriterion("single_loamount =", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountNotEqualTo(Long value) {
            addCriterion("single_loamount <>", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountGreaterThan(Long value) {
            addCriterion("single_loamount >", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountGreaterThanOrEqualTo(Long value) {
            addCriterion("single_loamount >=", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountLessThan(Long value) {
            addCriterion("single_loamount <", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountLessThanOrEqualTo(Long value) {
            addCriterion("single_loamount <=", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountLike(Long value) {
            addCriterion("single_loamount like", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountNotLike(Long value) {
            addCriterion("single_loamount not like", value, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountIn(List<Long> values) {
            addCriterion("single_loamount in", values, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountNotIn(List<Long> values) {
            addCriterion("single_loamount not in", values, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountBetween(Long value1, Long value2) {
            addCriterion("single_loamount between", value1, value2, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleLoamountNotBetween(Long value1, Long value2) {
            addCriterion("single_loamount not between", value1, value2, "singleLoamount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountIsNull() {
            addCriterion("single_maramount is null");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountIsNotNull() {
            addCriterion("single_maramount is not null");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountEqualTo(Long value) {
            addCriterion("single_maramount =", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountNotEqualTo(Long value) {
            addCriterion("single_maramount <>", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountGreaterThan(Long value) {
            addCriterion("single_maramount >", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountGreaterThanOrEqualTo(Long value) {
            addCriterion("single_maramount >=", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountLessThan(Long value) {
            addCriterion("single_maramount <", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountLessThanOrEqualTo(Long value) {
            addCriterion("single_maramount <=", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountLike(Long value) {
            addCriterion("single_maramount like", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountNotLike(Long value) {
            addCriterion("single_maramount not like", value, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountIn(List<Long> values) {
            addCriterion("single_maramount in", values, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountNotIn(List<Long> values) {
            addCriterion("single_maramount not in", values, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountBetween(Long value1, Long value2) {
            addCriterion("single_maramount between", value1, value2, "singleMaramount");
            return (Criteria) this;
        }

        public Criteria andSingleMaramountNotBetween(Long value1, Long value2) {
            addCriterion("single_maramount not between", value1, value2, "singleMaramount");
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

        public Criteria andPreWarehouseIdIsNull() {
            addCriterion("pre_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdIsNotNull() {
            addCriterion("pre_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdEqualTo(Long value) {
            addCriterion("pre_warehouse_id =", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdNotEqualTo(Long value) {
            addCriterion("pre_warehouse_id <>", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdGreaterThan(Long value) {
            addCriterion("pre_warehouse_id >", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_warehouse_id >=", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdLessThan(Long value) {
            addCriterion("pre_warehouse_id <", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("pre_warehouse_id <=", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdLike(Long value) {
            addCriterion("pre_warehouse_id like", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdNotLike(Long value) {
            addCriterion("pre_warehouse_id not like", value, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdIn(List<Long> values) {
            addCriterion("pre_warehouse_id in", values, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdNotIn(List<Long> values) {
            addCriterion("pre_warehouse_id not in", values, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("pre_warehouse_id between", value1, value2, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPreWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("pre_warehouse_id not between", value1, value2, "preWarehouseId");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIsNull() {
            addCriterion("logistics_mode is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIsNotNull() {
            addCriterion("logistics_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeEqualTo(Integer value) {
            addCriterion("logistics_mode =", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotEqualTo(Integer value) {
            addCriterion("logistics_mode <>", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeGreaterThan(Integer value) {
            addCriterion("logistics_mode >", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_mode >=", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeLessThan(Integer value) {
            addCriterion("logistics_mode <", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_mode <=", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeLike(Integer value) {
            addCriterion("logistics_mode like", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotLike(Integer value) {
            addCriterion("logistics_mode not like", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIn(List<Integer> values) {
            addCriterion("logistics_mode in", values, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotIn(List<Integer> values) {
            addCriterion("logistics_mode not in", values, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeBetween(Integer value1, Integer value2) {
            addCriterion("logistics_mode between", value1, value2, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_mode not between", value1, value2, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andHotModelIsNull() {
            addCriterion("hot_model is null");
            return (Criteria) this;
        }

        public Criteria andHotModelIsNotNull() {
            addCriterion("hot_model is not null");
            return (Criteria) this;
        }

        public Criteria andHotModelEqualTo(Integer value) {
            addCriterion("hot_model =", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelNotEqualTo(Integer value) {
            addCriterion("hot_model <>", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelGreaterThan(Integer value) {
            addCriterion("hot_model >", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot_model >=", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelLessThan(Integer value) {
            addCriterion("hot_model <", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelLessThanOrEqualTo(Integer value) {
            addCriterion("hot_model <=", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelLike(Integer value) {
            addCriterion("hot_model like", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelNotLike(Integer value) {
            addCriterion("hot_model not like", value, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelIn(List<Integer> values) {
            addCriterion("hot_model in", values, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelNotIn(List<Integer> values) {
            addCriterion("hot_model not in", values, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelBetween(Integer value1, Integer value2) {
            addCriterion("hot_model between", value1, value2, "hotModel");
            return (Criteria) this;
        }

        public Criteria andHotModelNotBetween(Integer value1, Integer value2) {
            addCriterion("hot_model not between", value1, value2, "hotModel");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(String value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(String value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(String value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(String value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(String value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLike(String value) {
            addCriterion("market_price like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotLike(String value) {
            addCriterion("market_price not like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<String> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<String> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(String value1, String value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(String value1, String value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdIsNull() {
            addCriterion("dest_province_id is null");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdIsNotNull() {
            addCriterion("dest_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdEqualTo(Integer value) {
            addCriterion("dest_province_id =", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdNotEqualTo(Integer value) {
            addCriterion("dest_province_id <>", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdGreaterThan(Integer value) {
            addCriterion("dest_province_id >", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dest_province_id >=", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdLessThan(Integer value) {
            addCriterion("dest_province_id <", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("dest_province_id <=", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdLike(Integer value) {
            addCriterion("dest_province_id like", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdNotLike(Integer value) {
            addCriterion("dest_province_id not like", value, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdIn(List<Integer> values) {
            addCriterion("dest_province_id in", values, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdNotIn(List<Integer> values) {
            addCriterion("dest_province_id not in", values, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("dest_province_id between", value1, value2, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dest_province_id not between", value1, value2, "destProvinceId");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameIsNull() {
            addCriterion("dest_province_name is null");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameIsNotNull() {
            addCriterion("dest_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameEqualTo(String value) {
            addCriterion("dest_province_name =", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameNotEqualTo(String value) {
            addCriterion("dest_province_name <>", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameGreaterThan(String value) {
            addCriterion("dest_province_name >", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("dest_province_name >=", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameLessThan(String value) {
            addCriterion("dest_province_name <", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("dest_province_name <=", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameLike(String value) {
            addCriterion("dest_province_name like", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameNotLike(String value) {
            addCriterion("dest_province_name not like", value, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameIn(List<String> values) {
            addCriterion("dest_province_name in", values, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameNotIn(List<String> values) {
            addCriterion("dest_province_name not in", values, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameBetween(String value1, String value2) {
            addCriterion("dest_province_name between", value1, value2, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestProvinceNameNotBetween(String value1, String value2) {
            addCriterion("dest_province_name not between", value1, value2, "destProvinceName");
            return (Criteria) this;
        }

        public Criteria andDestCityIdIsNull() {
            addCriterion("dest_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDestCityIdIsNotNull() {
            addCriterion("dest_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestCityIdEqualTo(Integer value) {
            addCriterion("dest_city_id =", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdNotEqualTo(Integer value) {
            addCriterion("dest_city_id <>", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdGreaterThan(Integer value) {
            addCriterion("dest_city_id >", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dest_city_id >=", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdLessThan(Integer value) {
            addCriterion("dest_city_id <", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("dest_city_id <=", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdLike(Integer value) {
            addCriterion("dest_city_id like", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdNotLike(Integer value) {
            addCriterion("dest_city_id not like", value, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdIn(List<Integer> values) {
            addCriterion("dest_city_id in", values, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdNotIn(List<Integer> values) {
            addCriterion("dest_city_id not in", values, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdBetween(Integer value1, Integer value2) {
            addCriterion("dest_city_id between", value1, value2, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dest_city_id not between", value1, value2, "destCityId");
            return (Criteria) this;
        }

        public Criteria andDestCityNameIsNull() {
            addCriterion("dest_city_name is null");
            return (Criteria) this;
        }

        public Criteria andDestCityNameIsNotNull() {
            addCriterion("dest_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andDestCityNameEqualTo(String value) {
            addCriterion("dest_city_name =", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameNotEqualTo(String value) {
            addCriterion("dest_city_name <>", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameGreaterThan(String value) {
            addCriterion("dest_city_name >", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("dest_city_name >=", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameLessThan(String value) {
            addCriterion("dest_city_name <", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameLessThanOrEqualTo(String value) {
            addCriterion("dest_city_name <=", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameLike(String value) {
            addCriterion("dest_city_name like", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameNotLike(String value) {
            addCriterion("dest_city_name not like", value, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameIn(List<String> values) {
            addCriterion("dest_city_name in", values, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameNotIn(List<String> values) {
            addCriterion("dest_city_name not in", values, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameBetween(String value1, String value2) {
            addCriterion("dest_city_name between", value1, value2, "destCityName");
            return (Criteria) this;
        }

        public Criteria andDestCityNameNotBetween(String value1, String value2) {
            addCriterion("dest_city_name not between", value1, value2, "destCityName");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNull() {
            addCriterion("repay_time is null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNotNull() {
            addCriterion("repay_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeEqualTo(Date value) {
            addCriterion("repay_time =", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotEqualTo(Date value) {
            addCriterion("repay_time <>", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThan(Date value) {
            addCriterion("repay_time >", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repay_time >=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThan(Date value) {
            addCriterion("repay_time <", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThanOrEqualTo(Date value) {
            addCriterion("repay_time <=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLike(Date value) {
            addCriterion("repay_time like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotLike(Date value) {
            addCriterion("repay_time not like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIn(List<Date> values) {
            addCriterion("repay_time in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotIn(List<Date> values) {
            addCriterion("repay_time not in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeBetween(Date value1, Date value2) {
            addCriterion("repay_time between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotBetween(Date value1, Date value2) {
            addCriterion("repay_time not between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(String value) {
            addCriterion("loan_rate =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(String value) {
            addCriterion("loan_rate <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(String value) {
            addCriterion("loan_rate >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(String value) {
            addCriterion("loan_rate >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(String value) {
            addCriterion("loan_rate <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(String value) {
            addCriterion("loan_rate <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLike(String value) {
            addCriterion("loan_rate like", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotLike(String value) {
            addCriterion("loan_rate not like", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<String> values) {
            addCriterion("loan_rate in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<String> values) {
            addCriterion("loan_rate not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(String value1, String value2) {
            addCriterion("loan_rate between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(String value1, String value2) {
            addCriterion("loan_rate not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andImgFormalityIsNull() {
            addCriterion("img_formality is null");
            return (Criteria) this;
        }

        public Criteria andImgFormalityIsNotNull() {
            addCriterion("img_formality is not null");
            return (Criteria) this;
        }

        public Criteria andImgFormalityEqualTo(String value) {
            addCriterion("img_formality =", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityNotEqualTo(String value) {
            addCriterion("img_formality <>", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityGreaterThan(String value) {
            addCriterion("img_formality >", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityGreaterThanOrEqualTo(String value) {
            addCriterion("img_formality >=", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityLessThan(String value) {
            addCriterion("img_formality <", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityLessThanOrEqualTo(String value) {
            addCriterion("img_formality <=", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityLike(String value) {
            addCriterion("img_formality like", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityNotLike(String value) {
            addCriterion("img_formality not like", value, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityIn(List<String> values) {
            addCriterion("img_formality in", values, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityNotIn(List<String> values) {
            addCriterion("img_formality not in", values, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityBetween(String value1, String value2) {
            addCriterion("img_formality between", value1, value2, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andImgFormalityNotBetween(String value1, String value2) {
            addCriterion("img_formality not between", value1, value2, "imgFormality");
            return (Criteria) this;
        }

        public Criteria andConfigureIsNull() {
            addCriterion("configure is null");
            return (Criteria) this;
        }

        public Criteria andConfigureIsNotNull() {
            addCriterion("configure is not null");
            return (Criteria) this;
        }

        public Criteria andConfigureEqualTo(String value) {
            addCriterion("configure =", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotEqualTo(String value) {
            addCriterion("configure <>", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureGreaterThan(String value) {
            addCriterion("configure >", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureGreaterThanOrEqualTo(String value) {
            addCriterion("configure >=", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLessThan(String value) {
            addCriterion("configure <", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLessThanOrEqualTo(String value) {
            addCriterion("configure <=", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureLike(String value) {
            addCriterion("configure like", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotLike(String value) {
            addCriterion("configure not like", value, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureIn(List<String> values) {
            addCriterion("configure in", values, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotIn(List<String> values) {
            addCriterion("configure not in", values, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureBetween(String value1, String value2) {
            addCriterion("configure between", value1, value2, "configure");
            return (Criteria) this;
        }

        public Criteria andConfigureNotBetween(String value1, String value2) {
            addCriterion("configure not between", value1, value2, "configure");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleIsNull() {
            addCriterion("confirm_vehicle is null");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleIsNotNull() {
            addCriterion("confirm_vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleEqualTo(Integer value) {
            addCriterion("confirm_vehicle =", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleNotEqualTo(Integer value) {
            addCriterion("confirm_vehicle <>", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleGreaterThan(Integer value) {
            addCriterion("confirm_vehicle >", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_vehicle >=", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleLessThan(Integer value) {
            addCriterion("confirm_vehicle <", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_vehicle <=", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleLike(Integer value) {
            addCriterion("confirm_vehicle like", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleNotLike(Integer value) {
            addCriterion("confirm_vehicle not like", value, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleIn(List<Integer> values) {
            addCriterion("confirm_vehicle in", values, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleNotIn(List<Integer> values) {
            addCriterion("confirm_vehicle not in", values, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleBetween(Integer value1, Integer value2) {
            addCriterion("confirm_vehicle between", value1, value2, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andConfirmVehicleNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_vehicle not between", value1, value2, "confirmVehicle");
            return (Criteria) this;
        }

        public Criteria andRetrofittingIsNull() {
            addCriterion("retrofitting is null");
            return (Criteria) this;
        }

        public Criteria andRetrofittingIsNotNull() {
            addCriterion("retrofitting is not null");
            return (Criteria) this;
        }

        public Criteria andRetrofittingEqualTo(Integer value) {
            addCriterion("retrofitting =", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingNotEqualTo(Integer value) {
            addCriterion("retrofitting <>", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingGreaterThan(Integer value) {
            addCriterion("retrofitting >", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingGreaterThanOrEqualTo(Integer value) {
            addCriterion("retrofitting >=", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingLessThan(Integer value) {
            addCriterion("retrofitting <", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingLessThanOrEqualTo(Integer value) {
            addCriterion("retrofitting <=", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingLike(Integer value) {
            addCriterion("retrofitting like", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingNotLike(Integer value) {
            addCriterion("retrofitting not like", value, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingIn(List<Integer> values) {
            addCriterion("retrofitting in", values, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingNotIn(List<Integer> values) {
            addCriterion("retrofitting not in", values, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingBetween(Integer value1, Integer value2) {
            addCriterion("retrofitting between", value1, value2, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andRetrofittingNotBetween(Integer value1, Integer value2) {
            addCriterion("retrofitting not between", value1, value2, "retrofitting");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoIsNull() {
            addCriterion("tms_payment_no is null");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoIsNotNull() {
            addCriterion("tms_payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoEqualTo(String value) {
            addCriterion("tms_payment_no =", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoNotEqualTo(String value) {
            addCriterion("tms_payment_no <>", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoGreaterThan(String value) {
            addCriterion("tms_payment_no >", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("tms_payment_no >=", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoLessThan(String value) {
            addCriterion("tms_payment_no <", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("tms_payment_no <=", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoLike(String value) {
            addCriterion("tms_payment_no like", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoNotLike(String value) {
            addCriterion("tms_payment_no not like", value, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoIn(List<String> values) {
            addCriterion("tms_payment_no in", values, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoNotIn(List<String> values) {
            addCriterion("tms_payment_no not in", values, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoBetween(String value1, String value2) {
            addCriterion("tms_payment_no between", value1, value2, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andTmsPaymentNoNotBetween(String value1, String value2) {
            addCriterion("tms_payment_no not between", value1, value2, "tmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoIsNull() {
            addCriterion("wms_payment_no is null");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoIsNotNull() {
            addCriterion("wms_payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoEqualTo(String value) {
            addCriterion("wms_payment_no =", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoNotEqualTo(String value) {
            addCriterion("wms_payment_no <>", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoGreaterThan(String value) {
            addCriterion("wms_payment_no >", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("wms_payment_no >=", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoLessThan(String value) {
            addCriterion("wms_payment_no <", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("wms_payment_no <=", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoLike(String value) {
            addCriterion("wms_payment_no like", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoNotLike(String value) {
            addCriterion("wms_payment_no not like", value, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoIn(List<String> values) {
            addCriterion("wms_payment_no in", values, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoNotIn(List<String> values) {
            addCriterion("wms_payment_no not in", values, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoBetween(String value1, String value2) {
            addCriterion("wms_payment_no between", value1, value2, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andWmsPaymentNoNotBetween(String value1, String value2) {
            addCriterion("wms_payment_no not between", value1, value2, "wmsPaymentNo");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceIsNull() {
            addCriterion("unit_contract_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceIsNotNull() {
            addCriterion("unit_contract_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceEqualTo(Long value) {
            addCriterion("unit_contract_price =", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceNotEqualTo(Long value) {
            addCriterion("unit_contract_price <>", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceGreaterThan(Long value) {
            addCriterion("unit_contract_price >", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_contract_price >=", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceLessThan(Long value) {
            addCriterion("unit_contract_price <", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceLessThanOrEqualTo(Long value) {
            addCriterion("unit_contract_price <=", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceLike(Long value) {
            addCriterion("unit_contract_price like", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceNotLike(Long value) {
            addCriterion("unit_contract_price not like", value, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceIn(List<Long> values) {
            addCriterion("unit_contract_price in", values, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceNotIn(List<Long> values) {
            addCriterion("unit_contract_price not in", values, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceBetween(Long value1, Long value2) {
            addCriterion("unit_contract_price between", value1, value2, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andUnitContractPriceNotBetween(Long value1, Long value2) {
            addCriterion("unit_contract_price not between", value1, value2, "unitContractPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdIsNull() {
            addCriterion("current_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdIsNotNull() {
            addCriterion("current_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdEqualTo(Long value) {
            addCriterion("current_operator_id =", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdNotEqualTo(Long value) {
            addCriterion("current_operator_id <>", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdGreaterThan(Long value) {
            addCriterion("current_operator_id >", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("current_operator_id >=", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdLessThan(Long value) {
            addCriterion("current_operator_id <", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("current_operator_id <=", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdLike(Long value) {
            addCriterion("current_operator_id like", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdNotLike(Long value) {
            addCriterion("current_operator_id not like", value, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdIn(List<Long> values) {
            addCriterion("current_operator_id in", values, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdNotIn(List<Long> values) {
            addCriterion("current_operator_id not in", values, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdBetween(Long value1, Long value2) {
            addCriterion("current_operator_id between", value1, value2, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("current_operator_id not between", value1, value2, "currentOperatorId");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameIsNull() {
            addCriterion("current_operator_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameIsNotNull() {
            addCriterion("current_operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameEqualTo(String value) {
            addCriterion("current_operator_name =", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameNotEqualTo(String value) {
            addCriterion("current_operator_name <>", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameGreaterThan(String value) {
            addCriterion("current_operator_name >", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_operator_name >=", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameLessThan(String value) {
            addCriterion("current_operator_name <", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("current_operator_name <=", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameLike(String value) {
            addCriterion("current_operator_name like", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameNotLike(String value) {
            addCriterion("current_operator_name not like", value, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameIn(List<String> values) {
            addCriterion("current_operator_name in", values, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameNotIn(List<String> values) {
            addCriterion("current_operator_name not in", values, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameBetween(String value1, String value2) {
            addCriterion("current_operator_name between", value1, value2, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andCurrentOperatorNameNotBetween(String value1, String value2) {
            addCriterion("current_operator_name not between", value1, value2, "currentOperatorName");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIsNull() {
            addCriterion("margin_ratio is null");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIsNotNull() {
            addCriterion("margin_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andMarginRatioEqualTo(String value) {
            addCriterion("margin_ratio =", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotEqualTo(String value) {
            addCriterion("margin_ratio <>", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioGreaterThan(String value) {
            addCriterion("margin_ratio >", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioGreaterThanOrEqualTo(String value) {
            addCriterion("margin_ratio >=", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioLessThan(String value) {
            addCriterion("margin_ratio <", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioLessThanOrEqualTo(String value) {
            addCriterion("margin_ratio <=", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioLike(String value) {
            addCriterion("margin_ratio like", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotLike(String value) {
            addCriterion("margin_ratio not like", value, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioIn(List<String> values) {
            addCriterion("margin_ratio in", values, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotIn(List<String> values) {
            addCriterion("margin_ratio not in", values, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioBetween(String value1, String value2) {
            addCriterion("margin_ratio between", value1, value2, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andMarginRatioNotBetween(String value1, String value2) {
            addCriterion("margin_ratio not between", value1, value2, "marginRatio");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailIsNull() {
            addCriterion("rule_calculation_bail is null");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailIsNotNull() {
            addCriterion("rule_calculation_bail is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailEqualTo(Long value) {
            addCriterion("rule_calculation_bail =", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailNotEqualTo(Long value) {
            addCriterion("rule_calculation_bail <>", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailGreaterThan(Long value) {
            addCriterion("rule_calculation_bail >", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailGreaterThanOrEqualTo(Long value) {
            addCriterion("rule_calculation_bail >=", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailLessThan(Long value) {
            addCriterion("rule_calculation_bail <", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailLessThanOrEqualTo(Long value) {
            addCriterion("rule_calculation_bail <=", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailLike(Long value) {
            addCriterion("rule_calculation_bail like", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailNotLike(Long value) {
            addCriterion("rule_calculation_bail not like", value, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailIn(List<Long> values) {
            addCriterion("rule_calculation_bail in", values, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailNotIn(List<Long> values) {
            addCriterion("rule_calculation_bail not in", values, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailBetween(Long value1, Long value2) {
            addCriterion("rule_calculation_bail between", value1, value2, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andRuleCalculationBailNotBetween(Long value1, Long value2) {
            addCriterion("rule_calculation_bail not between", value1, value2, "ruleCalculationBail");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagIsNull() {
            addCriterion("second_kill_flag is null");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagIsNotNull() {
            addCriterion("second_kill_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagEqualTo(Integer value) {
            addCriterion("second_kill_flag =", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagNotEqualTo(Integer value) {
            addCriterion("second_kill_flag <>", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagGreaterThan(Integer value) {
            addCriterion("second_kill_flag >", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_kill_flag >=", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagLessThan(Integer value) {
            addCriterion("second_kill_flag <", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagLessThanOrEqualTo(Integer value) {
            addCriterion("second_kill_flag <=", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagLike(Integer value) {
            addCriterion("second_kill_flag like", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagNotLike(Integer value) {
            addCriterion("second_kill_flag not like", value, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagIn(List<Integer> values) {
            addCriterion("second_kill_flag in", values, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagNotIn(List<Integer> values) {
            addCriterion("second_kill_flag not in", values, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagBetween(Integer value1, Integer value2) {
            addCriterion("second_kill_flag between", value1, value2, "secondKillFlag");
            return (Criteria) this;
        }

        public Criteria andSecondKillFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("second_kill_flag not between", value1, value2, "secondKillFlag");
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

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyIsNull() {
            addCriterion("is_wms_car_apply is null");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyIsNotNull() {
            addCriterion("is_wms_car_apply is not null");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyEqualTo(Integer value) {
            addCriterion("is_wms_car_apply =", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyNotEqualTo(Integer value) {
            addCriterion("is_wms_car_apply <>", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyGreaterThan(Integer value) {
            addCriterion("is_wms_car_apply >", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_wms_car_apply >=", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyLessThan(Integer value) {
            addCriterion("is_wms_car_apply <", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyLessThanOrEqualTo(Integer value) {
            addCriterion("is_wms_car_apply <=", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyLike(Integer value) {
            addCriterion("is_wms_car_apply like", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyNotLike(Integer value) {
            addCriterion("is_wms_car_apply not like", value, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyIn(List<Integer> values) {
            addCriterion("is_wms_car_apply in", values, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyNotIn(List<Integer> values) {
            addCriterion("is_wms_car_apply not in", values, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyBetween(Integer value1, Integer value2) {
            addCriterion("is_wms_car_apply between", value1, value2, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsWmsCarApplyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_wms_car_apply not between", value1, value2, "isWmsCarApply");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackIsNull() {
            addCriterion("is_buy_back is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackIsNotNull() {
            addCriterion("is_buy_back is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackEqualTo(Integer value) {
            addCriterion("is_buy_back =", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackNotEqualTo(Integer value) {
            addCriterion("is_buy_back <>", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackGreaterThan(Integer value) {
            addCriterion("is_buy_back >", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_buy_back >=", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackLessThan(Integer value) {
            addCriterion("is_buy_back <", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackLessThanOrEqualTo(Integer value) {
            addCriterion("is_buy_back <=", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackLike(Integer value) {
            addCriterion("is_buy_back like", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackNotLike(Integer value) {
            addCriterion("is_buy_back not like", value, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackIn(List<Integer> values) {
            addCriterion("is_buy_back in", values, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackNotIn(List<Integer> values) {
            addCriterion("is_buy_back not in", values, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackBetween(Integer value1, Integer value2) {
            addCriterion("is_buy_back between", value1, value2, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andIsBuyBackNotBetween(Integer value1, Integer value2) {
            addCriterion("is_buy_back not between", value1, value2, "isBuyBack");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeIsNull() {
            addCriterion("repurchase_time is null");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeIsNotNull() {
            addCriterion("repurchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeEqualTo(Date value) {
            addCriterion("repurchase_time =", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeNotEqualTo(Date value) {
            addCriterion("repurchase_time <>", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeGreaterThan(Date value) {
            addCriterion("repurchase_time >", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repurchase_time >=", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeLessThan(Date value) {
            addCriterion("repurchase_time <", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("repurchase_time <=", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeLike(Date value) {
            addCriterion("repurchase_time like", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeNotLike(Date value) {
            addCriterion("repurchase_time not like", value, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeIn(List<Date> values) {
            addCriterion("repurchase_time in", values, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeNotIn(List<Date> values) {
            addCriterion("repurchase_time not in", values, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("repurchase_time between", value1, value2, "repurchaseTime");
            return (Criteria) this;
        }

        public Criteria andRepurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("repurchase_time not between", value1, value2, "repurchaseTime");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_car_loan
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