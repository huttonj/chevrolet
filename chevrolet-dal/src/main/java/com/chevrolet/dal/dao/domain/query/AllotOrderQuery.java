package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class AllotOrderQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public AllotOrderQuery() {
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
     * This class corresponds to the database table allot_order
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

        public Criteria andAllotOrderIdIsNull() {
            addCriterion("allot_order_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdIsNotNull() {
            addCriterion("allot_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdEqualTo(Long value) {
            addCriterion("allot_order_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotEqualTo(Long value) {
            addCriterion("allot_order_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anAllotOrderIdGreaterThan(Long value) {
            addCriterion("allot_order_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("allot_order_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdLessThan(Long value) {
            addCriterion("allot_order_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("allot_order_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdIn(List<Long> values) {
            addCriterion("allot_order_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotIn(List<Long> values) {
            addCriterion("allot_order_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdBetween(Long value1, Long value2) {
            addCriterion("allot_order_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAllotOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("allot_order_id not between", value1, value2, "id");
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

        public Criteria andAllotOrderNoIsNull() {
            addCriterion("allot_order_no is null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoIsNotNull() {
            addCriterion("allot_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoEqualTo(String value) {
            addCriterion("allot_order_no =", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoNotEqualTo(String value) {
            addCriterion("allot_order_no <>", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoGreaterThan(String value) {
            addCriterion("allot_order_no >", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("allot_order_no >=", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoLessThan(String value) {
            addCriterion("allot_order_no <", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoLessThanOrEqualTo(String value) {
            addCriterion("allot_order_no <=", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoLike(String value) {
            addCriterion("allot_order_no like", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoNotLike(String value) {
            addCriterion("allot_order_no not like", value, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoIn(List<String> values) {
            addCriterion("allot_order_no in", values, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoNotIn(List<String> values) {
            addCriterion("allot_order_no not in", values, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoBetween(String value1, String value2) {
            addCriterion("allot_order_no between", value1, value2, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderNoNotBetween(String value1, String value2) {
            addCriterion("allot_order_no not between", value1, value2, "allotOrderNo");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeIsNull() {
            addCriterion("allot_order_type is null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeIsNotNull() {
            addCriterion("allot_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeEqualTo(Integer value) {
            addCriterion("allot_order_type =", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeNotEqualTo(Integer value) {
            addCriterion("allot_order_type <>", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeGreaterThan(Integer value) {
            addCriterion("allot_order_type >", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_order_type >=", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeLessThan(Integer value) {
            addCriterion("allot_order_type <", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("allot_order_type <=", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeLike(Integer value) {
            addCriterion("allot_order_type like", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeNotLike(Integer value) {
            addCriterion("allot_order_type not like", value, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeIn(List<Integer> values) {
            addCriterion("allot_order_type in", values, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeNotIn(List<Integer> values) {
            addCriterion("allot_order_type not in", values, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("allot_order_type between", value1, value2, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andAllotOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_order_type not between", value1, value2, "allotOrderType");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNull() {
            addCriterion("start_address is null");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNotNull() {
            addCriterion("start_address is not null");
            return (Criteria) this;
        }

        public Criteria andStartAddressEqualTo(String value) {
            addCriterion("start_address =", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotEqualTo(String value) {
            addCriterion("start_address <>", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThan(String value) {
            addCriterion("start_address >", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("start_address >=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThan(String value) {
            addCriterion("start_address <", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThanOrEqualTo(String value) {
            addCriterion("start_address <=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLike(String value) {
            addCriterion("start_address like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotLike(String value) {
            addCriterion("start_address not like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressIn(List<String> values) {
            addCriterion("start_address in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotIn(List<String> values) {
            addCriterion("start_address not in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressBetween(String value1, String value2) {
            addCriterion("start_address between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotBetween(String value1, String value2) {
            addCriterion("start_address not between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressIsNull() {
            addCriterion("destination_address is null");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressIsNotNull() {
            addCriterion("destination_address is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressEqualTo(String value) {
            addCriterion("destination_address =", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressNotEqualTo(String value) {
            addCriterion("destination_address <>", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressGreaterThan(String value) {
            addCriterion("destination_address >", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("destination_address >=", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressLessThan(String value) {
            addCriterion("destination_address <", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressLessThanOrEqualTo(String value) {
            addCriterion("destination_address <=", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressLike(String value) {
            addCriterion("destination_address like", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressNotLike(String value) {
            addCriterion("destination_address not like", value, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressIn(List<String> values) {
            addCriterion("destination_address in", values, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressNotIn(List<String> values) {
            addCriterion("destination_address not in", values, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressBetween(String value1, String value2) {
            addCriterion("destination_address between", value1, value2, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andDestinationAddressNotBetween(String value1, String value2) {
            addCriterion("destination_address not between", value1, value2, "destinationAddress");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdIsNull() {
            addCriterion("start_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdIsNotNull() {
            addCriterion("start_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdEqualTo(Long value) {
            addCriterion("start_warehouse_id =", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdNotEqualTo(Long value) {
            addCriterion("start_warehouse_id <>", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdGreaterThan(Long value) {
            addCriterion("start_warehouse_id >", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("start_warehouse_id >=", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdLessThan(Long value) {
            addCriterion("start_warehouse_id <", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("start_warehouse_id <=", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdLike(Long value) {
            addCriterion("start_warehouse_id like", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdNotLike(Long value) {
            addCriterion("start_warehouse_id not like", value, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdIn(List<Long> values) {
            addCriterion("start_warehouse_id in", values, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdNotIn(List<Long> values) {
            addCriterion("start_warehouse_id not in", values, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("start_warehouse_id between", value1, value2, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andStartWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("start_warehouse_id not between", value1, value2, "startWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdIsNull() {
            addCriterion("destination_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdIsNotNull() {
            addCriterion("destination_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdEqualTo(Long value) {
            addCriterion("destination_warehouse_id =", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdNotEqualTo(Long value) {
            addCriterion("destination_warehouse_id <>", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdGreaterThan(Long value) {
            addCriterion("destination_warehouse_id >", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("destination_warehouse_id >=", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdLessThan(Long value) {
            addCriterion("destination_warehouse_id <", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("destination_warehouse_id <=", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdLike(Long value) {
            addCriterion("destination_warehouse_id like", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdNotLike(Long value) {
            addCriterion("destination_warehouse_id not like", value, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdIn(List<Long> values) {
            addCriterion("destination_warehouse_id in", values, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdNotIn(List<Long> values) {
            addCriterion("destination_warehouse_id not in", values, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("destination_warehouse_id between", value1, value2, "destinationWarehouseId");
            return (Criteria) this;
        }

        public Criteria andDestinationWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("destination_warehouse_id not between", value1, value2, "destinationWarehouseId");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(Long value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(Long value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNull() {
            addCriterion("allot_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNotNull() {
            addCriterion("allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusEqualTo(Integer value) {
            addCriterion("allot_status =", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotEqualTo(Integer value) {
            addCriterion("allot_status <>", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThan(Integer value) {
            addCriterion("allot_status >", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_status >=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThan(Integer value) {
            addCriterion("allot_status <", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThanOrEqualTo(Integer value) {
            addCriterion("allot_status <=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLike(Integer value) {
            addCriterion("allot_status like", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotLike(Integer value) {
            addCriterion("allot_status not like", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIn(List<Integer> values) {
            addCriterion("allot_status in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotIn(List<Integer> values) {
            addCriterion("allot_status not in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusBetween(Integer value1, Integer value2) {
            addCriterion("allot_status between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_status not between", value1, value2, "allotStatus");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(Long value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(Long value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table allot_order
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