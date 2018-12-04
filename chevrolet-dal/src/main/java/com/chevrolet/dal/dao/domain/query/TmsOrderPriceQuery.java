package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsOrderPriceQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsOrderPriceQuery() {
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
     * This class corresponds to the database table tms_order_price
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

        public Criteria andTmsOrderIdIsNull() {
            addCriterion("tms_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdIsNotNull() {
            addCriterion("tms_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdEqualTo(Long value) {
            addCriterion("tms_order_id =", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdNotEqualTo(Long value) {
            addCriterion("tms_order_id <>", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdGreaterThan(Long value) {
            addCriterion("tms_order_id >", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tms_order_id >=", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdLessThan(Long value) {
            addCriterion("tms_order_id <", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("tms_order_id <=", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdLike(Long value) {
            addCriterion("tms_order_id like", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdNotLike(Long value) {
            addCriterion("tms_order_id not like", value, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdIn(List<Long> values) {
            addCriterion("tms_order_id in", values, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdNotIn(List<Long> values) {
            addCriterion("tms_order_id not in", values, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdBetween(Long value1, Long value2) {
            addCriterion("tms_order_id between", value1, value2, "tmsOrderId");
            return (Criteria) this;
        }

        public Criteria andTmsOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("tms_order_id not between", value1, value2, "tmsOrderId");
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

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(Integer value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(Integer value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(Integer value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(Integer value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(Integer value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLike(Integer value) {
            addCriterion("service_price like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotLike(Integer value) {
            addCriterion("service_price not like", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<Integer> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<Integer> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(Integer value1, Integer value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNull() {
            addCriterion("insurance_price is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNotNull() {
            addCriterion("insurance_price is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceEqualTo(Integer value) {
            addCriterion("insurance_price =", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotEqualTo(Integer value) {
            addCriterion("insurance_price <>", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThan(Integer value) {
            addCriterion("insurance_price >", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance_price >=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThan(Integer value) {
            addCriterion("insurance_price <", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThanOrEqualTo(Integer value) {
            addCriterion("insurance_price <=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLike(Integer value) {
            addCriterion("insurance_price like", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotLike(Integer value) {
            addCriterion("insurance_price not like", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIn(List<Integer> values) {
            addCriterion("insurance_price in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotIn(List<Integer> values) {
            addCriterion("insurance_price not in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceBetween(Integer value1, Integer value2) {
            addCriterion("insurance_price between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance_price not between", value1, value2, "insurancePrice");
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

        public Criteria andOldTransportPriceIsNull() {
            addCriterion("old_transport_price is null");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceIsNotNull() {
            addCriterion("old_transport_price is not null");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceEqualTo(Integer value) {
            addCriterion("old_transport_price =", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotEqualTo(Integer value) {
            addCriterion("old_transport_price <>", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceGreaterThan(Integer value) {
            addCriterion("old_transport_price >", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_transport_price >=", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLessThan(Integer value) {
            addCriterion("old_transport_price <", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLessThanOrEqualTo(Integer value) {
            addCriterion("old_transport_price <=", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceLike(Integer value) {
            addCriterion("old_transport_price like", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotLike(Integer value) {
            addCriterion("old_transport_price not like", value, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceIn(List<Integer> values) {
            addCriterion("old_transport_price in", values, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotIn(List<Integer> values) {
            addCriterion("old_transport_price not in", values, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceBetween(Integer value1, Integer value2) {
            addCriterion("old_transport_price between", value1, value2, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOldTransportPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("old_transport_price not between", value1, value2, "oldTransportPrice");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Integer value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Integer value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Integer value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Integer value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLike(Integer value) {
            addCriterion("price_type like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotLike(Integer value) {
            addCriterion("price_type not like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Integer> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Integer> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
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
     * This class corresponds to the database table tms_order_price
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