package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsOrderQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsOrderQuery() {
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
     * This class corresponds to the database table wms_order
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "id");
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

        public Criteria andSalesmanIsNull() {
            addCriterion("salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("salesman not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIsNull() {
            addCriterion("salesman_phone is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIsNotNull() {
            addCriterion("salesman_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneEqualTo(String value) {
            addCriterion("salesman_phone =", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotEqualTo(String value) {
            addCriterion("salesman_phone <>", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneGreaterThan(String value) {
            addCriterion("salesman_phone >", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_phone >=", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLessThan(String value) {
            addCriterion("salesman_phone <", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("salesman_phone <=", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneLike(String value) {
            addCriterion("salesman_phone like", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotLike(String value) {
            addCriterion("salesman_phone not like", value, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneIn(List<String> values) {
            addCriterion("salesman_phone in", values, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotIn(List<String> values) {
            addCriterion("salesman_phone not in", values, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneBetween(String value1, String value2) {
            addCriterion("salesman_phone between", value1, value2, "salesmanPhone");
            return (Criteria) this;
        }

        public Criteria andSalesmanPhoneNotBetween(String value1, String value2) {
            addCriterion("salesman_phone not between", value1, value2, "salesmanPhone");
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

        public Criteria andCustomerContactIsNull() {
            addCriterion("customer_contact is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNotNull() {
            addCriterion("customer_contact is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEqualTo(String value) {
            addCriterion("customer_contact =", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotEqualTo(String value) {
            addCriterion("customer_contact <>", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThan(String value) {
            addCriterion("customer_contact >", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact >=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThan(String value) {
            addCriterion("customer_contact <", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThanOrEqualTo(String value) {
            addCriterion("customer_contact <=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLike(String value) {
            addCriterion("customer_contact like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotLike(String value) {
            addCriterion("customer_contact not like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIn(List<String> values) {
            addCriterion("customer_contact in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotIn(List<String> values) {
            addCriterion("customer_contact not in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactBetween(String value1, String value2) {
            addCriterion("customer_contact between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotBetween(String value1, String value2) {
            addCriterion("customer_contact not between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactIsNull() {
            addCriterion("logistics_contact is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactIsNotNull() {
            addCriterion("logistics_contact is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactEqualTo(String value) {
            addCriterion("logistics_contact =", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactNotEqualTo(String value) {
            addCriterion("logistics_contact <>", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactGreaterThan(String value) {
            addCriterion("logistics_contact >", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_contact >=", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactLessThan(String value) {
            addCriterion("logistics_contact <", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactLessThanOrEqualTo(String value) {
            addCriterion("logistics_contact <=", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactLike(String value) {
            addCriterion("logistics_contact like", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactNotLike(String value) {
            addCriterion("logistics_contact not like", value, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactIn(List<String> values) {
            addCriterion("logistics_contact in", values, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactNotIn(List<String> values) {
            addCriterion("logistics_contact not in", values, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactBetween(String value1, String value2) {
            addCriterion("logistics_contact between", value1, value2, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactNotBetween(String value1, String value2) {
            addCriterion("logistics_contact not between", value1, value2, "logisticsContact");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneIsNull() {
            addCriterion("logistics_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneIsNotNull() {
            addCriterion("logistics_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneEqualTo(String value) {
            addCriterion("logistics_contact_phone =", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneNotEqualTo(String value) {
            addCriterion("logistics_contact_phone <>", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneGreaterThan(String value) {
            addCriterion("logistics_contact_phone >", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_contact_phone >=", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneLessThan(String value) {
            addCriterion("logistics_contact_phone <", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("logistics_contact_phone <=", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneLike(String value) {
            addCriterion("logistics_contact_phone like", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneNotLike(String value) {
            addCriterion("logistics_contact_phone not like", value, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneIn(List<String> values) {
            addCriterion("logistics_contact_phone in", values, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneNotIn(List<String> values) {
            addCriterion("logistics_contact_phone not in", values, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneBetween(String value1, String value2) {
            addCriterion("logistics_contact_phone between", value1, value2, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andLogisticsContactPhoneNotBetween(String value1, String value2) {
            addCriterion("logistics_contact_phone not between", value1, value2, "logisticsContactPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNull() {
            addCriterion("receive_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNotNull() {
            addCriterion("receive_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityEqualTo(String value) {
            addCriterion("receive_city =", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotEqualTo(String value) {
            addCriterion("receive_city <>", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThan(String value) {
            addCriterion("receive_city >", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThanOrEqualTo(String value) {
            addCriterion("receive_city >=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThan(String value) {
            addCriterion("receive_city <", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThanOrEqualTo(String value) {
            addCriterion("receive_city <=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLike(String value) {
            addCriterion("receive_city like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotLike(String value) {
            addCriterion("receive_city not like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIn(List<String> values) {
            addCriterion("receive_city in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotIn(List<String> values) {
            addCriterion("receive_city not in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityBetween(String value1, String value2) {
            addCriterion("receive_city between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotBetween(String value1, String value2) {
            addCriterion("receive_city not between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIsNull() {
            addCriterion("out_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIsNotNull() {
            addCriterion("out_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdEqualTo(Long value) {
            addCriterion("out_order_id =", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotEqualTo(Long value) {
            addCriterion("out_order_id <>", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdGreaterThan(Long value) {
            addCriterion("out_order_id >", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("out_order_id >=", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLessThan(Long value) {
            addCriterion("out_order_id <", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("out_order_id <=", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdLike(Long value) {
            addCriterion("out_order_id like", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotLike(Long value) {
            addCriterion("out_order_id not like", value, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdIn(List<Long> values) {
            addCriterion("out_order_id in", values, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotIn(List<Long> values) {
            addCriterion("out_order_id not in", values, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdBetween(Long value1, Long value2) {
            addCriterion("out_order_id between", value1, value2, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andOutOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("out_order_id not between", value1, value2, "outOrderId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdIsNull() {
            addCriterion("transactor_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactorIdIsNotNull() {
            addCriterion("transactor_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorIdEqualTo(Long value) {
            addCriterion("transactor_id =", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdNotEqualTo(Long value) {
            addCriterion("transactor_id <>", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdGreaterThan(Long value) {
            addCriterion("transactor_id >", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transactor_id >=", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdLessThan(Long value) {
            addCriterion("transactor_id <", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdLessThanOrEqualTo(Long value) {
            addCriterion("transactor_id <=", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdLike(Long value) {
            addCriterion("transactor_id like", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdNotLike(Long value) {
            addCriterion("transactor_id not like", value, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdIn(List<Long> values) {
            addCriterion("transactor_id in", values, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdNotIn(List<Long> values) {
            addCriterion("transactor_id not in", values, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdBetween(Long value1, Long value2) {
            addCriterion("transactor_id between", value1, value2, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorIdNotBetween(Long value1, Long value2) {
            addCriterion("transactor_id not between", value1, value2, "transactorId");
            return (Criteria) this;
        }

        public Criteria andTransactorNameIsNull() {
            addCriterion("transactor_name is null");
            return (Criteria) this;
        }

        public Criteria andTransactorNameIsNotNull() {
            addCriterion("transactor_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorNameEqualTo(String value) {
            addCriterion("transactor_name =", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameNotEqualTo(String value) {
            addCriterion("transactor_name <>", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameGreaterThan(String value) {
            addCriterion("transactor_name >", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameGreaterThanOrEqualTo(String value) {
            addCriterion("transactor_name >=", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameLessThan(String value) {
            addCriterion("transactor_name <", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameLessThanOrEqualTo(String value) {
            addCriterion("transactor_name <=", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameLike(String value) {
            addCriterion("transactor_name like", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameNotLike(String value) {
            addCriterion("transactor_name not like", value, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameIn(List<String> values) {
            addCriterion("transactor_name in", values, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameNotIn(List<String> values) {
            addCriterion("transactor_name not in", values, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameBetween(String value1, String value2) {
            addCriterion("transactor_name between", value1, value2, "transactorName");
            return (Criteria) this;
        }

        public Criteria andTransactorNameNotBetween(String value1, String value2) {
            addCriterion("transactor_name not between", value1, value2, "transactorName");
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
     * This class corresponds to the database table wms_order
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