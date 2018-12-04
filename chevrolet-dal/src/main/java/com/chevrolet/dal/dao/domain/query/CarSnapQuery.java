package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarSnapQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarSnapQuery() {
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
     * This class corresponds to the database table b2b_car_snap
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(Long value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(Long value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(Long value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(Long value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
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

        public Criteria andCarAreaIsNull() {
            addCriterion("car_area is null");
            return (Criteria) this;
        }

        public Criteria andCarAreaIsNotNull() {
            addCriterion("car_area is not null");
            return (Criteria) this;
        }

        public Criteria andCarAreaEqualTo(String value) {
            addCriterion("car_area =", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaNotEqualTo(String value) {
            addCriterion("car_area <>", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaGreaterThan(String value) {
            addCriterion("car_area >", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaGreaterThanOrEqualTo(String value) {
            addCriterion("car_area >=", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaLessThan(String value) {
            addCriterion("car_area <", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaLessThanOrEqualTo(String value) {
            addCriterion("car_area <=", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaLike(String value) {
            addCriterion("car_area like", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaNotLike(String value) {
            addCriterion("car_area not like", value, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaIn(List<String> values) {
            addCriterion("car_area in", values, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaNotIn(List<String> values) {
            addCriterion("car_area not in", values, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaBetween(String value1, String value2) {
            addCriterion("car_area between", value1, value2, "carArea");
            return (Criteria) this;
        }

        public Criteria andCarAreaNotBetween(String value1, String value2) {
            addCriterion("car_area not between", value1, value2, "carArea");
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

        public Criteria andReachDateIsNull() {
            addCriterion("reach_date is null");
            return (Criteria) this;
        }

        public Criteria andReachDateIsNotNull() {
            addCriterion("reach_date is not null");
            return (Criteria) this;
        }

        public Criteria andReachDateEqualTo(Date value) {
            addCriterion("reach_date =", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateNotEqualTo(Date value) {
            addCriterion("reach_date <>", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateGreaterThan(Date value) {
            addCriterion("reach_date >", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reach_date >=", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateLessThan(Date value) {
            addCriterion("reach_date <", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateLessThanOrEqualTo(Date value) {
            addCriterion("reach_date <=", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateLike(Date value) {
            addCriterion("reach_date like", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateNotLike(Date value) {
            addCriterion("reach_date not like", value, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateIn(List<Date> values) {
            addCriterion("reach_date in", values, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateNotIn(List<Date> values) {
            addCriterion("reach_date not in", values, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateBetween(Date value1, Date value2) {
            addCriterion("reach_date between", value1, value2, "reachDate");
            return (Criteria) this;
        }

        public Criteria andReachDateNotBetween(Date value1, Date value2) {
            addCriterion("reach_date not between", value1, value2, "reachDate");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusIsNull() {
            addCriterion("formalities_status is null");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusIsNotNull() {
            addCriterion("formalities_status is not null");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusEqualTo(Integer value) {
            addCriterion("formalities_status =", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusNotEqualTo(Integer value) {
            addCriterion("formalities_status <>", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusGreaterThan(Integer value) {
            addCriterion("formalities_status >", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("formalities_status >=", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusLessThan(Integer value) {
            addCriterion("formalities_status <", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusLessThanOrEqualTo(Integer value) {
            addCriterion("formalities_status <=", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusLike(Integer value) {
            addCriterion("formalities_status like", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusNotLike(Integer value) {
            addCriterion("formalities_status not like", value, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusIn(List<Integer> values) {
            addCriterion("formalities_status in", values, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusNotIn(List<Integer> values) {
            addCriterion("formalities_status not in", values, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusBetween(Integer value1, Integer value2) {
            addCriterion("formalities_status between", value1, value2, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFormalitiesStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("formalities_status not between", value1, value2, "formalitiesStatus");
            return (Criteria) this;
        }

        public Criteria andSellerPriceIsNull() {
            addCriterion("seller_price is null");
            return (Criteria) this;
        }

        public Criteria andSellerPriceIsNotNull() {
            addCriterion("seller_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPriceEqualTo(Long value) {
            addCriterion("seller_price =", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceNotEqualTo(Long value) {
            addCriterion("seller_price <>", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceGreaterThan(Long value) {
            addCriterion("seller_price >", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_price >=", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceLessThan(Long value) {
            addCriterion("seller_price <", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceLessThanOrEqualTo(Long value) {
            addCriterion("seller_price <=", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceLike(Long value) {
            addCriterion("seller_price like", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceNotLike(Long value) {
            addCriterion("seller_price not like", value, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceIn(List<Long> values) {
            addCriterion("seller_price in", values, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceNotIn(List<Long> values) {
            addCriterion("seller_price not in", values, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceBetween(Long value1, Long value2) {
            addCriterion("seller_price between", value1, value2, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andSellerPriceNotBetween(Long value1, Long value2) {
            addCriterion("seller_price not between", value1, value2, "sellerPrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNull() {
            addCriterion("invoice_price is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNotNull() {
            addCriterion("invoice_price is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceEqualTo(Long value) {
            addCriterion("invoice_price =", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotEqualTo(Long value) {
            addCriterion("invoice_price <>", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThan(Long value) {
            addCriterion("invoice_price >", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_price >=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThan(Long value) {
            addCriterion("invoice_price <", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThanOrEqualTo(Long value) {
            addCriterion("invoice_price <=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLike(Long value) {
            addCriterion("invoice_price like", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotLike(Long value) {
            addCriterion("invoice_price not like", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIn(List<Long> values) {
            addCriterion("invoice_price in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotIn(List<Long> values) {
            addCriterion("invoice_price not in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceBetween(Long value1, Long value2) {
            addCriterion("invoice_price between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotBetween(Long value1, Long value2) {
            addCriterion("invoice_price not between", value1, value2, "invoicePrice");
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
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

        public Criteria andInnerIdIsNull() {
            addCriterion("inner_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNotNull() {
            addCriterion("inner_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerIdEqualTo(Long value) {
            addCriterion("inner_id =", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotEqualTo(Long value) {
            addCriterion("inner_id <>", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThan(Long value) {
            addCriterion("inner_id >", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inner_id >=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThan(Long value) {
            addCriterion("inner_id <", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThanOrEqualTo(Long value) {
            addCriterion("inner_id <=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLike(Long value) {
            addCriterion("inner_id like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotLike(Long value) {
            addCriterion("inner_id not like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdIn(List<Long> values) {
            addCriterion("inner_id in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotIn(List<Long> values) {
            addCriterion("inner_id not in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdBetween(Long value1, Long value2) {
            addCriterion("inner_id between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotBetween(Long value1, Long value2) {
            addCriterion("inner_id not between", value1, value2, "innerId");
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

        public Criteria andOuterIdEqualTo(Long value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(Long value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(Long value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(Long value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(Long value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(Long value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(Long value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<Long> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<Long> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(Long value1, Long value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(Long value1, Long value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIsNull() {
            addCriterion("outer_color_name is null");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIsNotNull() {
            addCriterion("outer_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameEqualTo(String value) {
            addCriterion("outer_color_name =", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotEqualTo(String value) {
            addCriterion("outer_color_name <>", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameGreaterThan(String value) {
            addCriterion("outer_color_name >", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("outer_color_name >=", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLessThan(String value) {
            addCriterion("outer_color_name <", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLessThanOrEqualTo(String value) {
            addCriterion("outer_color_name <=", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLike(String value) {
            addCriterion("outer_color_name like", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotLike(String value) {
            addCriterion("outer_color_name not like", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIn(List<String> values) {
            addCriterion("outer_color_name in", values, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotIn(List<String> values) {
            addCriterion("outer_color_name not in", values, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameBetween(String value1, String value2) {
            addCriterion("outer_color_name between", value1, value2, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotBetween(String value1, String value2) {
            addCriterion("outer_color_name not between", value1, value2, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIsNull() {
            addCriterion("inner_color_name is null");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIsNotNull() {
            addCriterion("inner_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameEqualTo(String value) {
            addCriterion("inner_color_name =", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotEqualTo(String value) {
            addCriterion("inner_color_name <>", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameGreaterThan(String value) {
            addCriterion("inner_color_name >", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("inner_color_name >=", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLessThan(String value) {
            addCriterion("inner_color_name <", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLessThanOrEqualTo(String value) {
            addCriterion("inner_color_name <=", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLike(String value) {
            addCriterion("inner_color_name like", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotLike(String value) {
            addCriterion("inner_color_name not like", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIn(List<String> values) {
            addCriterion("inner_color_name in", values, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotIn(List<String> values) {
            addCriterion("inner_color_name not in", values, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameBetween(String value1, String value2) {
            addCriterion("inner_color_name between", value1, value2, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotBetween(String value1, String value2) {
            addCriterion("inner_color_name not between", value1, value2, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNull() {
            addCriterion("send_city is null");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNotNull() {
            addCriterion("send_city is not null");
            return (Criteria) this;
        }

        public Criteria andSendCityEqualTo(String value) {
            addCriterion("send_city =", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotEqualTo(String value) {
            addCriterion("send_city <>", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThan(String value) {
            addCriterion("send_city >", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThanOrEqualTo(String value) {
            addCriterion("send_city >=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThan(String value) {
            addCriterion("send_city <", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThanOrEqualTo(String value) {
            addCriterion("send_city <=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLike(String value) {
            addCriterion("send_city like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotLike(String value) {
            addCriterion("send_city not like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityIn(List<String> values) {
            addCriterion("send_city in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotIn(List<String> values) {
            addCriterion("send_city not in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityBetween(String value1, String value2) {
            addCriterion("send_city between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotBetween(String value1, String value2) {
            addCriterion("send_city not between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIsNull() {
            addCriterion("benchmark is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIsNotNull() {
            addCriterion("benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkEqualTo(Integer value) {
            addCriterion("benchmark =", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotEqualTo(Integer value) {
            addCriterion("benchmark <>", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkGreaterThan(Integer value) {
            addCriterion("benchmark >", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("benchmark >=", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLessThan(Integer value) {
            addCriterion("benchmark <", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLessThanOrEqualTo(Integer value) {
            addCriterion("benchmark <=", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLike(Integer value) {
            addCriterion("benchmark like", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotLike(Integer value) {
            addCriterion("benchmark not like", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIn(List<Integer> values) {
            addCriterion("benchmark in", values, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotIn(List<Integer> values) {
            addCriterion("benchmark not in", values, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkBetween(Integer value1, Integer value2) {
            addCriterion("benchmark between", value1, value2, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("benchmark not between", value1, value2, "benchmark");
            return (Criteria) this;
        }

        public Criteria andFuelIsNull() {
            addCriterion("fuel is null");
            return (Criteria) this;
        }

        public Criteria andFuelIsNotNull() {
            addCriterion("fuel is not null");
            return (Criteria) this;
        }

        public Criteria andFuelEqualTo(Integer value) {
            addCriterion("fuel =", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotEqualTo(Integer value) {
            addCriterion("fuel <>", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThan(Integer value) {
            addCriterion("fuel >", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuel >=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThan(Integer value) {
            addCriterion("fuel <", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThanOrEqualTo(Integer value) {
            addCriterion("fuel <=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLike(Integer value) {
            addCriterion("fuel like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotLike(Integer value) {
            addCriterion("fuel not like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelIn(List<Integer> values) {
            addCriterion("fuel in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotIn(List<Integer> values) {
            addCriterion("fuel not in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelBetween(Integer value1, Integer value2) {
            addCriterion("fuel between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotBetween(Integer value1, Integer value2) {
            addCriterion("fuel not between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(Integer value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(Integer value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSanbaoIsNull() {
            addCriterion("sanbao is null");
            return (Criteria) this;
        }

        public Criteria andSanbaoIsNotNull() {
            addCriterion("sanbao is not null");
            return (Criteria) this;
        }

        public Criteria andSanbaoEqualTo(Integer value) {
            addCriterion("sanbao =", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoNotEqualTo(Integer value) {
            addCriterion("sanbao <>", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoGreaterThan(Integer value) {
            addCriterion("sanbao >", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sanbao >=", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoLessThan(Integer value) {
            addCriterion("sanbao <", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoLessThanOrEqualTo(Integer value) {
            addCriterion("sanbao <=", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoLike(Integer value) {
            addCriterion("sanbao like", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoNotLike(Integer value) {
            addCriterion("sanbao not like", value, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoIn(List<Integer> values) {
            addCriterion("sanbao in", values, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoNotIn(List<Integer> values) {
            addCriterion("sanbao not in", values, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoBetween(Integer value1, Integer value2) {
            addCriterion("sanbao between", value1, value2, "sanbao");
            return (Criteria) this;
        }

        public Criteria andSanbaoNotBetween(Integer value1, Integer value2) {
            addCriterion("sanbao not between", value1, value2, "sanbao");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountIsNull() {
            addCriterion("tip_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountIsNotNull() {
            addCriterion("tip_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountEqualTo(Long value) {
            addCriterion("tip_loan_amount =", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountNotEqualTo(Long value) {
            addCriterion("tip_loan_amount <>", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountGreaterThan(Long value) {
            addCriterion("tip_loan_amount >", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("tip_loan_amount >=", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountLessThan(Long value) {
            addCriterion("tip_loan_amount <", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountLessThanOrEqualTo(Long value) {
            addCriterion("tip_loan_amount <=", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountLike(Long value) {
            addCriterion("tip_loan_amount like", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountNotLike(Long value) {
            addCriterion("tip_loan_amount not like", value, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountIn(List<Long> values) {
            addCriterion("tip_loan_amount in", values, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountNotIn(List<Long> values) {
            addCriterion("tip_loan_amount not in", values, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountBetween(Long value1, Long value2) {
            addCriterion("tip_loan_amount between", value1, value2, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipLoanAmountNotBetween(Long value1, Long value2) {
            addCriterion("tip_loan_amount not between", value1, value2, "tipLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountIsNull() {
            addCriterion("tip_margin_amount is null");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountIsNotNull() {
            addCriterion("tip_margin_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountEqualTo(Long value) {
            addCriterion("tip_margin_amount =", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountNotEqualTo(Long value) {
            addCriterion("tip_margin_amount <>", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountGreaterThan(Long value) {
            addCriterion("tip_margin_amount >", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("tip_margin_amount >=", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountLessThan(Long value) {
            addCriterion("tip_margin_amount <", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountLessThanOrEqualTo(Long value) {
            addCriterion("tip_margin_amount <=", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountLike(Long value) {
            addCriterion("tip_margin_amount like", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountNotLike(Long value) {
            addCriterion("tip_margin_amount not like", value, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountIn(List<Long> values) {
            addCriterion("tip_margin_amount in", values, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountNotIn(List<Long> values) {
            addCriterion("tip_margin_amount not in", values, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountBetween(Long value1, Long value2) {
            addCriterion("tip_margin_amount between", value1, value2, "tipMarginAmount");
            return (Criteria) this;
        }

        public Criteria andTipMarginAmountNotBetween(Long value1, Long value2) {
            addCriterion("tip_margin_amount not between", value1, value2, "tipMarginAmount");
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

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(Long value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(Long value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
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

        public Criteria andSeriesIdEqualTo(Long value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Long value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Long value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Long value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Long value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLike(Long value) {
            addCriterion("series_id like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotLike(Long value) {
            addCriterion("series_id not like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Long> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Long> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Long value1, Long value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Long value1, Long value2) {
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

        public Criteria andSpecIdIsNull() {
            addCriterion("spec_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecIdIsNotNull() {
            addCriterion("spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecIdEqualTo(Integer value) {
            addCriterion("spec_id =", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotEqualTo(Integer value) {
            addCriterion("spec_id <>", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThan(Integer value) {
            addCriterion("spec_id >", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec_id >=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThan(Integer value) {
            addCriterion("spec_id <", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("spec_id <=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLike(Integer value) {
            addCriterion("spec_id like", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotLike(Integer value) {
            addCriterion("spec_id not like", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdIn(List<Integer> values) {
            addCriterion("spec_id in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotIn(List<Integer> values) {
            addCriterion("spec_id not in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("spec_id between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spec_id not between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
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

        public Criteria andGuidePriceEqualTo(String value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(String value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(String value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(String value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(String value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(String value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLike(String value) {
            addCriterion("guide_price like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotLike(String value) {
            addCriterion("guide_price not like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<String> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<String> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(String value1, String value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(String value1, String value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
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

        public Criteria andEmissionIsNull() {
            addCriterion("emission is null");
            return (Criteria) this;
        }

        public Criteria andEmissionIsNotNull() {
            addCriterion("emission is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionEqualTo(String value) {
            addCriterion("emission =", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotEqualTo(String value) {
            addCriterion("emission <>", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThan(String value) {
            addCriterion("emission >", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThanOrEqualTo(String value) {
            addCriterion("emission >=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThan(String value) {
            addCriterion("emission <", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThanOrEqualTo(String value) {
            addCriterion("emission <=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLike(String value) {
            addCriterion("emission like", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotLike(String value) {
            addCriterion("emission not like", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionIn(List<String> values) {
            addCriterion("emission in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotIn(List<String> values) {
            addCriterion("emission not in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionBetween(String value1, String value2) {
            addCriterion("emission between", value1, value2, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotBetween(String value1, String value2) {
            addCriterion("emission not between", value1, value2, "emission");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeIsNull() {
            addCriterion("pro_submit_procedure_time is null");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeIsNotNull() {
            addCriterion("pro_submit_procedure_time is not null");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeEqualTo(Date value) {
            addCriterion("pro_submit_procedure_time =", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeNotEqualTo(Date value) {
            addCriterion("pro_submit_procedure_time <>", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeGreaterThan(Date value) {
            addCriterion("pro_submit_procedure_time >", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_submit_procedure_time >=", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeLessThan(Date value) {
            addCriterion("pro_submit_procedure_time <", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeLessThanOrEqualTo(Date value) {
            addCriterion("pro_submit_procedure_time <=", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeLike(Date value) {
            addCriterion("pro_submit_procedure_time like", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeNotLike(Date value) {
            addCriterion("pro_submit_procedure_time not like", value, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeIn(List<Date> values) {
            addCriterion("pro_submit_procedure_time in", values, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeNotIn(List<Date> values) {
            addCriterion("pro_submit_procedure_time not in", values, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeBetween(Date value1, Date value2) {
            addCriterion("pro_submit_procedure_time between", value1, value2, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andProSubmitProcedureTimeNotBetween(Date value1, Date value2) {
            addCriterion("pro_submit_procedure_time not between", value1, value2, "proSubmitProcedureTime");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(Integer value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(Integer value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(Integer value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(Integer value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(Integer value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(Integer value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(Integer value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(Integer value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<Integer> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<Integer> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(Integer value1, Integer value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(Integer value1, Integer value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andLoAmountIsNull() {
            addCriterion("lo_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoAmountIsNotNull() {
            addCriterion("lo_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoAmountEqualTo(Long value) {
            addCriterion("lo_amount =", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountNotEqualTo(Long value) {
            addCriterion("lo_amount <>", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountGreaterThan(Long value) {
            addCriterion("lo_amount >", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("lo_amount >=", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountLessThan(Long value) {
            addCriterion("lo_amount <", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountLessThanOrEqualTo(Long value) {
            addCriterion("lo_amount <=", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountLike(Long value) {
            addCriterion("lo_amount like", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountNotLike(Long value) {
            addCriterion("lo_amount not like", value, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountIn(List<Long> values) {
            addCriterion("lo_amount in", values, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountNotIn(List<Long> values) {
            addCriterion("lo_amount not in", values, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountBetween(Long value1, Long value2) {
            addCriterion("lo_amount between", value1, value2, "loAmount");
            return (Criteria) this;
        }

        public Criteria andLoAmountNotBetween(Long value1, Long value2) {
            addCriterion("lo_amount not between", value1, value2, "loAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountIsNull() {
            addCriterion("mar_amount is null");
            return (Criteria) this;
        }

        public Criteria andMarAmountIsNotNull() {
            addCriterion("mar_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMarAmountEqualTo(Long value) {
            addCriterion("mar_amount =", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountNotEqualTo(Long value) {
            addCriterion("mar_amount <>", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountGreaterThan(Long value) {
            addCriterion("mar_amount >", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("mar_amount >=", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountLessThan(Long value) {
            addCriterion("mar_amount <", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountLessThanOrEqualTo(Long value) {
            addCriterion("mar_amount <=", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountLike(Long value) {
            addCriterion("mar_amount like", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountNotLike(Long value) {
            addCriterion("mar_amount not like", value, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountIn(List<Long> values) {
            addCriterion("mar_amount in", values, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountNotIn(List<Long> values) {
            addCriterion("mar_amount not in", values, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountBetween(Long value1, Long value2) {
            addCriterion("mar_amount between", value1, value2, "marAmount");
            return (Criteria) this;
        }

        public Criteria andMarAmountNotBetween(Long value1, Long value2) {
            addCriterion("mar_amount not between", value1, value2, "marAmount");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoIsNull() {
            addCriterion("car_loan_no is null");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoIsNotNull() {
            addCriterion("car_loan_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoEqualTo(String value) {
            addCriterion("car_loan_no =", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoNotEqualTo(String value) {
            addCriterion("car_loan_no <>", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoGreaterThan(String value) {
            addCriterion("car_loan_no >", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_loan_no >=", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoLessThan(String value) {
            addCriterion("car_loan_no <", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoLessThanOrEqualTo(String value) {
            addCriterion("car_loan_no <=", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoLike(String value) {
            addCriterion("car_loan_no like", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoNotLike(String value) {
            addCriterion("car_loan_no not like", value, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoIn(List<String> values) {
            addCriterion("car_loan_no in", values, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoNotIn(List<String> values) {
            addCriterion("car_loan_no not in", values, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoBetween(String value1, String value2) {
            addCriterion("car_loan_no between", value1, value2, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andCarLoanNoNotBetween(String value1, String value2) {
            addCriterion("car_loan_no not between", value1, value2, "carLoanNo");
            return (Criteria) this;
        }

        public Criteria andUniqueNumIsNull() {
            addCriterion("unique_num is null");
            return (Criteria) this;
        }

        public Criteria andUniqueNumIsNotNull() {
            addCriterion("unique_num is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueNumEqualTo(Integer value) {
            addCriterion("unique_num =", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumNotEqualTo(Integer value) {
            addCriterion("unique_num <>", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumGreaterThan(Integer value) {
            addCriterion("unique_num >", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unique_num >=", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumLessThan(Integer value) {
            addCriterion("unique_num <", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumLessThanOrEqualTo(Integer value) {
            addCriterion("unique_num <=", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumLike(Integer value) {
            addCriterion("unique_num like", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumNotLike(Integer value) {
            addCriterion("unique_num not like", value, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumIn(List<Integer> values) {
            addCriterion("unique_num in", values, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumNotIn(List<Integer> values) {
            addCriterion("unique_num not in", values, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumBetween(Integer value1, Integer value2) {
            addCriterion("unique_num between", value1, value2, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andUniqueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("unique_num not between", value1, value2, "uniqueNum");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(Integer value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(Integer value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table b2b_car_snap
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