package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsWarehouseEntryNoticeQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsWarehouseEntryNoticeQuery() {
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
     * This class corresponds to the database table wms_warehouse_entry_notice
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Long value) {
            addCriterion("notice_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Long value) {
            addCriterion("notice_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anNoticeIdGreaterThan(Long value) {
            addCriterion("notice_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notice_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Long value) {
            addCriterion("notice_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Long value) {
            addCriterion("notice_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Long> values) {
            addCriterion("notice_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Long> values) {
            addCriterion("notice_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Long value1, Long value2) {
            addCriterion("notice_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Long value1, Long value2) {
            addCriterion("notice_id not between", value1, value2, "id");
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

        public Criteria andNoticeNoIsNull() {
            addCriterion("notice_no is null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIsNotNull() {
            addCriterion("notice_no is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoEqualTo(String value) {
            addCriterion("notice_no =", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotEqualTo(String value) {
            addCriterion("notice_no <>", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThan(String value) {
            addCriterion("notice_no >", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThanOrEqualTo(String value) {
            addCriterion("notice_no >=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThan(String value) {
            addCriterion("notice_no <", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThanOrEqualTo(String value) {
            addCriterion("notice_no <=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLike(String value) {
            addCriterion("notice_no like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotLike(String value) {
            addCriterion("notice_no not like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIn(List<String> values) {
            addCriterion("notice_no in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotIn(List<String> values) {
            addCriterion("notice_no not in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoBetween(String value1, String value2) {
            addCriterion("notice_no between", value1, value2, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotBetween(String value1, String value2) {
            addCriterion("notice_no not between", value1, value2, "noticeNo");
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

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(Integer value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(Integer value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdIsNull() {
            addCriterion("storage_type_id is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdIsNotNull() {
            addCriterion("storage_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdEqualTo(Long value) {
            addCriterion("storage_type_id =", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdNotEqualTo(Long value) {
            addCriterion("storage_type_id <>", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdGreaterThan(Long value) {
            addCriterion("storage_type_id >", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("storage_type_id >=", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdLessThan(Long value) {
            addCriterion("storage_type_id <", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("storage_type_id <=", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdLike(Long value) {
            addCriterion("storage_type_id like", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdNotLike(Long value) {
            addCriterion("storage_type_id not like", value, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdIn(List<Long> values) {
            addCriterion("storage_type_id in", values, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdNotIn(List<Long> values) {
            addCriterion("storage_type_id not in", values, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdBetween(Long value1, Long value2) {
            addCriterion("storage_type_id between", value1, value2, "storageTypeId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("storage_type_id not between", value1, value2, "storageTypeId");
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

        public Criteria andContactIdIsNull() {
            addCriterion("contact_id is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(Long value) {
            addCriterion("contact_id =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(Long value) {
            addCriterion("contact_id <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(Long value) {
            addCriterion("contact_id >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contact_id >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(Long value) {
            addCriterion("contact_id <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(Long value) {
            addCriterion("contact_id <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLike(Long value) {
            addCriterion("contact_id like", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotLike(Long value) {
            addCriterion("contact_id not like", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<Long> values) {
            addCriterion("contact_id in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<Long> values) {
            addCriterion("contact_id not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(Long value1, Long value2) {
            addCriterion("contact_id between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(Long value1, Long value2) {
            addCriterion("contact_id not between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
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

        public Criteria andExpectedWarehousingTimeIsNull() {
            addCriterion("expected_warehousing_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeIsNotNull() {
            addCriterion("expected_warehousing_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeEqualTo(Date value) {
            addCriterion("expected_warehousing_time =", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeNotEqualTo(Date value) {
            addCriterion("expected_warehousing_time <>", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeGreaterThan(Date value) {
            addCriterion("expected_warehousing_time >", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expected_warehousing_time >=", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeLessThan(Date value) {
            addCriterion("expected_warehousing_time <", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeLessThanOrEqualTo(Date value) {
            addCriterion("expected_warehousing_time <=", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeLike(Date value) {
            addCriterion("expected_warehousing_time like", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeNotLike(Date value) {
            addCriterion("expected_warehousing_time not like", value, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeIn(List<Date> values) {
            addCriterion("expected_warehousing_time in", values, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeNotIn(List<Date> values) {
            addCriterion("expected_warehousing_time not in", values, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeBetween(Date value1, Date value2) {
            addCriterion("expected_warehousing_time between", value1, value2, "expectedWarehousingTime");
            return (Criteria) this;
        }

        public Criteria andExpectedWarehousingTimeNotBetween(Date value1, Date value2) {
            addCriterion("expected_warehousing_time not between", value1, value2, "expectedWarehousingTime");
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

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(Date value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLike(Date value) {
            addCriterion("review_time like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotLike(Date value) {
            addCriterion("review_time not like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNull() {
            addCriterion("notice_status is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIsNotNull() {
            addCriterion("notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusEqualTo(Integer value) {
            addCriterion("notice_status =", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotEqualTo(Integer value) {
            addCriterion("notice_status <>", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThan(Integer value) {
            addCriterion("notice_status >", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_status >=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThan(Integer value) {
            addCriterion("notice_status <", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("notice_status <=", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusLike(Integer value) {
            addCriterion("notice_status like", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotLike(Integer value) {
            addCriterion("notice_status not like", value, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusIn(List<Integer> values) {
            addCriterion("notice_status in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotIn(List<Integer> values) {
            addCriterion("notice_status not in", values, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusBetween(Integer value1, Integer value2) {
            addCriterion("notice_status between", value1, value2, "noticeStatus");
            return (Criteria) this;
        }

        public Criteria andNoticeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_status not between", value1, value2, "noticeStatus");
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
     * This class corresponds to the database table wms_warehouse_entry_notice
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