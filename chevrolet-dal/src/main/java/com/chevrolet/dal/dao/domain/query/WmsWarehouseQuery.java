package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsWarehouseQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsWarehouseQuery() {
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
     * This class corresponds to the database table wms_warehouse
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Long value) {
            addCriterion("warehouse_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Long value) {
            addCriterion("warehouse_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anWarehouseIdGreaterThan(Long value) {
            addCriterion("warehouse_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouse_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Long value) {
            addCriterion("warehouse_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("warehouse_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Long> values) {
            addCriterion("warehouse_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Long> values) {
            addCriterion("warehouse_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("warehouse_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("warehouse_id not between", value1, value2, "id");
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

        public Criteria andWarehouseNoIsNull() {
            addCriterion("warehouse_no is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIsNotNull() {
            addCriterion("warehouse_no is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoEqualTo(String value) {
            addCriterion("warehouse_no =", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotEqualTo(String value) {
            addCriterion("warehouse_no <>", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThan(String value) {
            addCriterion("warehouse_no >", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_no >=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThan(String value) {
            addCriterion("warehouse_no <", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThanOrEqualTo(String value) {
            addCriterion("warehouse_no <=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLike(String value) {
            addCriterion("warehouse_no like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotLike(String value) {
            addCriterion("warehouse_no not like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIn(List<String> values) {
            addCriterion("warehouse_no in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotIn(List<String> values) {
            addCriterion("warehouse_no not in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoBetween(String value1, String value2) {
            addCriterion("warehouse_no between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotBetween(String value1, String value2) {
            addCriterion("warehouse_no not between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Long value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Long value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Long value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(Long value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(Long value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Long> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(Long value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(Long value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Long value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Long value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Long value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Long value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Long value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Long value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLike(Long value) {
            addCriterion("capacity like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotLike(Long value) {
            addCriterion("capacity not like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Long> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Long> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Long value1, Long value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Long value1, Long value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNull() {
            addCriterion("used_capacity is null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNotNull() {
            addCriterion("used_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityEqualTo(Long value) {
            addCriterion("used_capacity =", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotEqualTo(Long value) {
            addCriterion("used_capacity <>", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThan(Long value) {
            addCriterion("used_capacity >", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThanOrEqualTo(Long value) {
            addCriterion("used_capacity >=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThan(Long value) {
            addCriterion("used_capacity <", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThanOrEqualTo(Long value) {
            addCriterion("used_capacity <=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLike(Long value) {
            addCriterion("used_capacity like", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotLike(Long value) {
            addCriterion("used_capacity not like", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIn(List<Long> values) {
            addCriterion("used_capacity in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotIn(List<Long> values) {
            addCriterion("used_capacity not in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityBetween(Long value1, Long value2) {
            addCriterion("used_capacity between", value1, value2, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotBetween(Long value1, Long value2) {
            addCriterion("used_capacity not between", value1, value2, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(Integer value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(Integer value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andSupervisionRuleIdIsNull() {
            addCriterion("supervision_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdIsNotNull() {
            addCriterion("supervision_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdEqualTo(Long value) {
            addCriterion("supervision_rule_id =", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdNotEqualTo(Long value) {
            addCriterion("supervision_rule_id <>", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdGreaterThan(Long value) {
            addCriterion("supervision_rule_id >", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supervision_rule_id >=", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdLessThan(Long value) {
            addCriterion("supervision_rule_id <", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("supervision_rule_id <=", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdLike(Long value) {
            addCriterion("supervision_rule_id like", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdNotLike(Long value) {
            addCriterion("supervision_rule_id not like", value, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdIn(List<Long> values) {
            addCriterion("supervision_rule_id in", values, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdNotIn(List<Long> values) {
            addCriterion("supervision_rule_id not in", values, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdBetween(Long value1, Long value2) {
            addCriterion("supervision_rule_id between", value1, value2, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andSupervisionRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("supervision_rule_id not between", value1, value2, "supervisionRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdIsNull() {
            addCriterion("service_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdIsNotNull() {
            addCriterion("service_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdEqualTo(Long value) {
            addCriterion("service_rule_id =", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdNotEqualTo(Long value) {
            addCriterion("service_rule_id <>", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdGreaterThan(Long value) {
            addCriterion("service_rule_id >", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_rule_id >=", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdLessThan(Long value) {
            addCriterion("service_rule_id <", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("service_rule_id <=", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdLike(Long value) {
            addCriterion("service_rule_id like", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdNotLike(Long value) {
            addCriterion("service_rule_id not like", value, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdIn(List<Long> values) {
            addCriterion("service_rule_id in", values, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdNotIn(List<Long> values) {
            addCriterion("service_rule_id not in", values, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdBetween(Long value1, Long value2) {
            addCriterion("service_rule_id between", value1, value2, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andServiceRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("service_rule_id not between", value1, value2, "serviceRuleId");
            return (Criteria) this;
        }

        public Criteria andUsePdaIsNull() {
            addCriterion("use_pda is null");
            return (Criteria) this;
        }

        public Criteria andUsePdaIsNotNull() {
            addCriterion("use_pda is not null");
            return (Criteria) this;
        }

        public Criteria andUsePdaEqualTo(Boolean value) {
            addCriterion("use_pda =", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotEqualTo(Boolean value) {
            addCriterion("use_pda <>", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaGreaterThan(Boolean value) {
            addCriterion("use_pda >", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("use_pda >=", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLessThan(Boolean value) {
            addCriterion("use_pda <", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLessThanOrEqualTo(Boolean value) {
            addCriterion("use_pda <=", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLike(Boolean value) {
            addCriterion("use_pda like", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotLike(Boolean value) {
            addCriterion("use_pda not like", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaIn(List<Boolean> values) {
            addCriterion("use_pda in", values, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotIn(List<Boolean> values) {
            addCriterion("use_pda not in", values, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaBetween(Boolean value1, Boolean value2) {
            addCriterion("use_pda between", value1, value2, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("use_pda not between", value1, value2, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePositionIsNull() {
            addCriterion("use_position is null");
            return (Criteria) this;
        }

        public Criteria andUsePositionIsNotNull() {
            addCriterion("use_position is not null");
            return (Criteria) this;
        }

        public Criteria andUsePositionEqualTo(Boolean value) {
            addCriterion("use_position =", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotEqualTo(Boolean value) {
            addCriterion("use_position <>", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionGreaterThan(Boolean value) {
            addCriterion("use_position >", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("use_position >=", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLessThan(Boolean value) {
            addCriterion("use_position <", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLessThanOrEqualTo(Boolean value) {
            addCriterion("use_position <=", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLike(Boolean value) {
            addCriterion("use_position like", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotLike(Boolean value) {
            addCriterion("use_position not like", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionIn(List<Boolean> values) {
            addCriterion("use_position in", values, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotIn(List<Boolean> values) {
            addCriterion("use_position not in", values, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionBetween(Boolean value1, Boolean value2) {
            addCriterion("use_position between", value1, value2, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("use_position not between", value1, value2, "usePosition");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseIsNull() {
            addCriterion("img_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseIsNotNull() {
            addCriterion("img_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseEqualTo(String value) {
            addCriterion("img_warehouse =", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseNotEqualTo(String value) {
            addCriterion("img_warehouse <>", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseGreaterThan(String value) {
            addCriterion("img_warehouse >", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("img_warehouse >=", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseLessThan(String value) {
            addCriterion("img_warehouse <", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseLessThanOrEqualTo(String value) {
            addCriterion("img_warehouse <=", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseLike(String value) {
            addCriterion("img_warehouse like", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseNotLike(String value) {
            addCriterion("img_warehouse not like", value, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseIn(List<String> values) {
            addCriterion("img_warehouse in", values, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseNotIn(List<String> values) {
            addCriterion("img_warehouse not in", values, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseBetween(String value1, String value2) {
            addCriterion("img_warehouse between", value1, value2, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andImgWarehouseNotBetween(String value1, String value2) {
            addCriterion("img_warehouse not between", value1, value2, "imgWarehouse");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIsNull() {
            addCriterion("rental_agreement is null");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIsNotNull() {
            addCriterion("rental_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementEqualTo(String value) {
            addCriterion("rental_agreement =", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotEqualTo(String value) {
            addCriterion("rental_agreement <>", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementGreaterThan(String value) {
            addCriterion("rental_agreement >", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("rental_agreement >=", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLessThan(String value) {
            addCriterion("rental_agreement <", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLessThanOrEqualTo(String value) {
            addCriterion("rental_agreement <=", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementLike(String value) {
            addCriterion("rental_agreement like", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotLike(String value) {
            addCriterion("rental_agreement not like", value, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementIn(List<String> values) {
            addCriterion("rental_agreement in", values, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotIn(List<String> values) {
            addCriterion("rental_agreement not in", values, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementBetween(String value1, String value2) {
            addCriterion("rental_agreement between", value1, value2, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentalAgreementNotBetween(String value1, String value2) {
            addCriterion("rental_agreement not between", value1, value2, "rentalAgreement");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeIsNull() {
            addCriterion("rent_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeIsNotNull() {
            addCriterion("rent_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeEqualTo(java.sql.Date value) {
            addCriterion("rent_start_time =", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeNotEqualTo(java.sql.Date value) {
            addCriterion("rent_start_time <>", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeGreaterThan(java.sql.Date value) {
            addCriterion("rent_start_time >", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_start_time >=", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeLessThan(java.sql.Date value) {
            addCriterion("rent_start_time <", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_start_time <=", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeLike(java.sql.Date value) {
            addCriterion("rent_start_time like", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeNotLike(java.sql.Date value) {
            addCriterion("rent_start_time not like", value, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeIn(List<java.sql.Date> values) {
            addCriterion("rent_start_time in", values, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeNotIn(List<java.sql.Date> values) {
            addCriterion("rent_start_time not in", values, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_start_time between", value1, value2, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentStartTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_start_time not between", value1, value2, "rentStartTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeIsNull() {
            addCriterion("rent_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeIsNotNull() {
            addCriterion("rent_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeEqualTo(java.sql.Date value) {
            addCriterion("rent_end_time =", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeNotEqualTo(java.sql.Date value) {
            addCriterion("rent_end_time <>", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeGreaterThan(java.sql.Date value) {
            addCriterion("rent_end_time >", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_end_time >=", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeLessThan(java.sql.Date value) {
            addCriterion("rent_end_time <", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_end_time <=", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeLike(java.sql.Date value) {
            addCriterion("rent_end_time like", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeNotLike(java.sql.Date value) {
            addCriterion("rent_end_time not like", value, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeIn(List<java.sql.Date> values) {
            addCriterion("rent_end_time in", values, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeNotIn(List<java.sql.Date> values) {
            addCriterion("rent_end_time not in", values, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_end_time between", value1, value2, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentEndTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_end_time not between", value1, value2, "rentEndTime");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(Long value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(Long value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(Long value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(Long value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(Long value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(Long value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLike(Long value) {
            addCriterion("rent like", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotLike(Long value) {
            addCriterion("rent not like", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<Long> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<Long> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(Long value1, Long value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(Long value1, Long value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andHostingCostIsNull() {
            addCriterion("hosting_cost is null");
            return (Criteria) this;
        }

        public Criteria andHostingCostIsNotNull() {
            addCriterion("hosting_cost is not null");
            return (Criteria) this;
        }

        public Criteria andHostingCostEqualTo(Long value) {
            addCriterion("hosting_cost =", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostNotEqualTo(Long value) {
            addCriterion("hosting_cost <>", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostGreaterThan(Long value) {
            addCriterion("hosting_cost >", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostGreaterThanOrEqualTo(Long value) {
            addCriterion("hosting_cost >=", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostLessThan(Long value) {
            addCriterion("hosting_cost <", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostLessThanOrEqualTo(Long value) {
            addCriterion("hosting_cost <=", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostLike(Long value) {
            addCriterion("hosting_cost like", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostNotLike(Long value) {
            addCriterion("hosting_cost not like", value, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostIn(List<Long> values) {
            addCriterion("hosting_cost in", values, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostNotIn(List<Long> values) {
            addCriterion("hosting_cost not in", values, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostBetween(Long value1, Long value2) {
            addCriterion("hosting_cost between", value1, value2, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andHostingCostNotBetween(Long value1, Long value2) {
            addCriterion("hosting_cost not between", value1, value2, "hostingCost");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeIsNull() {
            addCriterion("rent_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeIsNotNull() {
            addCriterion("rent_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("rent_expiry_time =", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("rent_expiry_time <>", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("rent_expiry_time >", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_expiry_time >=", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("rent_expiry_time <", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("rent_expiry_time <=", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeLike(java.sql.Date value) {
            addCriterion("rent_expiry_time like", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("rent_expiry_time not like", value, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("rent_expiry_time in", values, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("rent_expiry_time not in", values, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_expiry_time between", value1, value2, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRentExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("rent_expiry_time not between", value1, value2, "rentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeIsNull() {
            addCriterion("cost_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeIsNotNull() {
            addCriterion("cost_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeEqualTo(java.sql.Date value) {
            addCriterion("cost_effective_time =", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeNotEqualTo(java.sql.Date value) {
            addCriterion("cost_effective_time <>", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeGreaterThan(java.sql.Date value) {
            addCriterion("cost_effective_time >", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("cost_effective_time >=", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeLessThan(java.sql.Date value) {
            addCriterion("cost_effective_time <", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("cost_effective_time <=", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeLike(java.sql.Date value) {
            addCriterion("cost_effective_time like", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeNotLike(java.sql.Date value) {
            addCriterion("cost_effective_time not like", value, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeIn(List<java.sql.Date> values) {
            addCriterion("cost_effective_time in", values, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeNotIn(List<java.sql.Date> values) {
            addCriterion("cost_effective_time not in", values, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("cost_effective_time between", value1, value2, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostEffectiveTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("cost_effective_time not between", value1, value2, "costEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeIsNull() {
            addCriterion("cost_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeIsNotNull() {
            addCriterion("cost_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("cost_expiry_time =", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("cost_expiry_time <>", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("cost_expiry_time >", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("cost_expiry_time >=", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("cost_expiry_time <", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("cost_expiry_time <=", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeLike(java.sql.Date value) {
            addCriterion("cost_expiry_time like", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("cost_expiry_time not like", value, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("cost_expiry_time in", values, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("cost_expiry_time not in", values, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("cost_expiry_time between", value1, value2, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCostExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("cost_expiry_time not between", value1, value2, "costExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyIsNull() {
            addCriterion("insurance_policy is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyIsNotNull() {
            addCriterion("insurance_policy is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyEqualTo(String value) {
            addCriterion("insurance_policy =", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNotEqualTo(String value) {
            addCriterion("insurance_policy <>", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyGreaterThan(String value) {
            addCriterion("insurance_policy >", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_policy >=", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyLessThan(String value) {
            addCriterion("insurance_policy <", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyLessThanOrEqualTo(String value) {
            addCriterion("insurance_policy <=", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyLike(String value) {
            addCriterion("insurance_policy like", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNotLike(String value) {
            addCriterion("insurance_policy not like", value, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyIn(List<String> values) {
            addCriterion("insurance_policy in", values, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNotIn(List<String> values) {
            addCriterion("insurance_policy not in", values, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyBetween(String value1, String value2) {
            addCriterion("insurance_policy between", value1, value2, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsurancePolicyNotBetween(String value1, String value2) {
            addCriterion("insurance_policy not between", value1, value2, "insurancePolicy");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIsNull() {
            addCriterion("insurance_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIsNotNull() {
            addCriterion("insurance_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time =", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time <>", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeGreaterThan(java.sql.Date value) {
            addCriterion("insurance_effective_time >", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time >=", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLessThan(java.sql.Date value) {
            addCriterion("insurance_effective_time <", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_effective_time <=", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeLike(java.sql.Date value) {
            addCriterion("insurance_effective_time like", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotLike(java.sql.Date value) {
            addCriterion("insurance_effective_time not like", value, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeIn(List<java.sql.Date> values) {
            addCriterion("insurance_effective_time in", values, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotIn(List<java.sql.Date> values) {
            addCriterion("insurance_effective_time not in", values, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_effective_time between", value1, value2, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEffectiveTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_effective_time not between", value1, value2, "insuranceEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIsNull() {
            addCriterion("insurance_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIsNotNull() {
            addCriterion("insurance_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time =", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time <>", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("insurance_expiry_time >", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time >=", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("insurance_expiry_time <", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("insurance_expiry_time <=", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeLike(java.sql.Date value) {
            addCriterion("insurance_expiry_time like", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("insurance_expiry_time not like", value, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("insurance_expiry_time in", values, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("insurance_expiry_time not in", values, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_expiry_time between", value1, value2, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("insurance_expiry_time not between", value1, value2, "insuranceExpiryTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("insurance_cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("insurance_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(Long value) {
            addCriterion("insurance_cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(Long value) {
            addCriterion("insurance_cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(Long value) {
            addCriterion("insurance_cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance_cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(Long value) {
            addCriterion("insurance_cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(Long value) {
            addCriterion("insurance_cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLike(Long value) {
            addCriterion("insurance_cost like", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotLike(Long value) {
            addCriterion("insurance_cost not like", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<Long> values) {
            addCriterion("insurance_cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<Long> values) {
            addCriterion("insurance_cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(Long value1, Long value2) {
            addCriterion("insurance_cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(Long value1, Long value2) {
            addCriterion("insurance_cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andBulidDealerIsNull() {
            addCriterion("bulid_dealer is null");
            return (Criteria) this;
        }

        public Criteria andBulidDealerIsNotNull() {
            addCriterion("bulid_dealer is not null");
            return (Criteria) this;
        }

        public Criteria andBulidDealerEqualTo(String value) {
            addCriterion("bulid_dealer =", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerNotEqualTo(String value) {
            addCriterion("bulid_dealer <>", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerGreaterThan(String value) {
            addCriterion("bulid_dealer >", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerGreaterThanOrEqualTo(String value) {
            addCriterion("bulid_dealer >=", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerLessThan(String value) {
            addCriterion("bulid_dealer <", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerLessThanOrEqualTo(String value) {
            addCriterion("bulid_dealer <=", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerLike(String value) {
            addCriterion("bulid_dealer like", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerNotLike(String value) {
            addCriterion("bulid_dealer not like", value, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerIn(List<String> values) {
            addCriterion("bulid_dealer in", values, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerNotIn(List<String> values) {
            addCriterion("bulid_dealer not in", values, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerBetween(String value1, String value2) {
            addCriterion("bulid_dealer between", value1, value2, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andBulidDealerNotBetween(String value1, String value2) {
            addCriterion("bulid_dealer not between", value1, value2, "bulidDealer");
            return (Criteria) this;
        }

        public Criteria andDealerTypeIsNull() {
            addCriterion("dealer_type is null");
            return (Criteria) this;
        }

        public Criteria andDealerTypeIsNotNull() {
            addCriterion("dealer_type is not null");
            return (Criteria) this;
        }

        public Criteria andDealerTypeEqualTo(String value) {
            addCriterion("dealer_type =", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeNotEqualTo(String value) {
            addCriterion("dealer_type <>", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeGreaterThan(String value) {
            addCriterion("dealer_type >", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_type >=", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeLessThan(String value) {
            addCriterion("dealer_type <", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeLessThanOrEqualTo(String value) {
            addCriterion("dealer_type <=", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeLike(String value) {
            addCriterion("dealer_type like", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeNotLike(String value) {
            addCriterion("dealer_type not like", value, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeIn(List<String> values) {
            addCriterion("dealer_type in", values, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeNotIn(List<String> values) {
            addCriterion("dealer_type not in", values, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeBetween(String value1, String value2) {
            addCriterion("dealer_type between", value1, value2, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerTypeNotBetween(String value1, String value2) {
            addCriterion("dealer_type not between", value1, value2, "dealerType");
            return (Criteria) this;
        }

        public Criteria andDealerBrandIsNull() {
            addCriterion("dealer_brand is null");
            return (Criteria) this;
        }

        public Criteria andDealerBrandIsNotNull() {
            addCriterion("dealer_brand is not null");
            return (Criteria) this;
        }

        public Criteria andDealerBrandEqualTo(String value) {
            addCriterion("dealer_brand =", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandNotEqualTo(String value) {
            addCriterion("dealer_brand <>", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandGreaterThan(String value) {
            addCriterion("dealer_brand >", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_brand >=", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandLessThan(String value) {
            addCriterion("dealer_brand <", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandLessThanOrEqualTo(String value) {
            addCriterion("dealer_brand <=", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandLike(String value) {
            addCriterion("dealer_brand like", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandNotLike(String value) {
            addCriterion("dealer_brand not like", value, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandIn(List<String> values) {
            addCriterion("dealer_brand in", values, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandNotIn(List<String> values) {
            addCriterion("dealer_brand not in", values, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandBetween(String value1, String value2) {
            addCriterion("dealer_brand between", value1, value2, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDealerBrandNotBetween(String value1, String value2) {
            addCriterion("dealer_brand not between", value1, value2, "dealerBrand");
            return (Criteria) this;
        }

        public Criteria andDockPersonIsNull() {
            addCriterion("dock_person is null");
            return (Criteria) this;
        }

        public Criteria andDockPersonIsNotNull() {
            addCriterion("dock_person is not null");
            return (Criteria) this;
        }

        public Criteria andDockPersonEqualTo(String value) {
            addCriterion("dock_person =", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonNotEqualTo(String value) {
            addCriterion("dock_person <>", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonGreaterThan(String value) {
            addCriterion("dock_person >", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonGreaterThanOrEqualTo(String value) {
            addCriterion("dock_person >=", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonLessThan(String value) {
            addCriterion("dock_person <", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonLessThanOrEqualTo(String value) {
            addCriterion("dock_person <=", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonLike(String value) {
            addCriterion("dock_person like", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonNotLike(String value) {
            addCriterion("dock_person not like", value, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonIn(List<String> values) {
            addCriterion("dock_person in", values, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonNotIn(List<String> values) {
            addCriterion("dock_person not in", values, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonBetween(String value1, String value2) {
            addCriterion("dock_person between", value1, value2, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonNotBetween(String value1, String value2) {
            addCriterion("dock_person not between", value1, value2, "dockPerson");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneIsNull() {
            addCriterion("dock_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneIsNotNull() {
            addCriterion("dock_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneEqualTo(String value) {
            addCriterion("dock_person_phone =", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneNotEqualTo(String value) {
            addCriterion("dock_person_phone <>", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneGreaterThan(String value) {
            addCriterion("dock_person_phone >", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dock_person_phone >=", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneLessThan(String value) {
            addCriterion("dock_person_phone <", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("dock_person_phone <=", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneLike(String value) {
            addCriterion("dock_person_phone like", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneNotLike(String value) {
            addCriterion("dock_person_phone not like", value, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneIn(List<String> values) {
            addCriterion("dock_person_phone in", values, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneNotIn(List<String> values) {
            addCriterion("dock_person_phone not in", values, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneBetween(String value1, String value2) {
            addCriterion("dock_person_phone between", value1, value2, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andDockPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("dock_person_phone not between", value1, value2, "dockPersonPhone");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeIsNull() {
            addCriterion("regulatory_type is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeIsNotNull() {
            addCriterion("regulatory_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeEqualTo(String value) {
            addCriterion("regulatory_type =", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeNotEqualTo(String value) {
            addCriterion("regulatory_type <>", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeGreaterThan(String value) {
            addCriterion("regulatory_type >", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("regulatory_type >=", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeLessThan(String value) {
            addCriterion("regulatory_type <", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeLessThanOrEqualTo(String value) {
            addCriterion("regulatory_type <=", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeLike(String value) {
            addCriterion("regulatory_type like", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeNotLike(String value) {
            addCriterion("regulatory_type not like", value, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeIn(List<String> values) {
            addCriterion("regulatory_type in", values, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeNotIn(List<String> values) {
            addCriterion("regulatory_type not in", values, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeBetween(String value1, String value2) {
            addCriterion("regulatory_type between", value1, value2, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryTypeNotBetween(String value1, String value2) {
            addCriterion("regulatory_type not between", value1, value2, "regulatoryType");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementIsNull() {
            addCriterion("regulatory_agreement is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementIsNotNull() {
            addCriterion("regulatory_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementEqualTo(String value) {
            addCriterion("regulatory_agreement =", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementNotEqualTo(String value) {
            addCriterion("regulatory_agreement <>", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementGreaterThan(String value) {
            addCriterion("regulatory_agreement >", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("regulatory_agreement >=", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementLessThan(String value) {
            addCriterion("regulatory_agreement <", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementLessThanOrEqualTo(String value) {
            addCriterion("regulatory_agreement <=", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementLike(String value) {
            addCriterion("regulatory_agreement like", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementNotLike(String value) {
            addCriterion("regulatory_agreement not like", value, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementIn(List<String> values) {
            addCriterion("regulatory_agreement in", values, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementNotIn(List<String> values) {
            addCriterion("regulatory_agreement not in", values, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementBetween(String value1, String value2) {
            addCriterion("regulatory_agreement between", value1, value2, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryAgreementNotBetween(String value1, String value2) {
            addCriterion("regulatory_agreement not between", value1, value2, "regulatoryAgreement");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(java.sql.Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(java.sql.Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(java.sql.Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(java.sql.Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(java.sql.Date value) {
            addCriterion("sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(java.sql.Date value) {
            addCriterion("sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<java.sql.Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<java.sql.Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeIsNull() {
            addCriterion("regulatory_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeIsNotNull() {
            addCriterion("regulatory_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("regulatory_expiry_time =", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("regulatory_expiry_time <>", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("regulatory_expiry_time >", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_expiry_time >=", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("regulatory_expiry_time <", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_expiry_time <=", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeLike(java.sql.Date value) {
            addCriterion("regulatory_expiry_time like", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("regulatory_expiry_time not like", value, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("regulatory_expiry_time in", values, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("regulatory_expiry_time not in", values, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_expiry_time between", value1, value2, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_expiry_time not between", value1, value2, "regulatoryExpiryTime");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementIsNull() {
            addCriterion("business_agreement is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementIsNotNull() {
            addCriterion("business_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementEqualTo(String value) {
            addCriterion("business_agreement =", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementNotEqualTo(String value) {
            addCriterion("business_agreement <>", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementGreaterThan(String value) {
            addCriterion("business_agreement >", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("business_agreement >=", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementLessThan(String value) {
            addCriterion("business_agreement <", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementLessThanOrEqualTo(String value) {
            addCriterion("business_agreement <=", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementLike(String value) {
            addCriterion("business_agreement like", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementNotLike(String value) {
            addCriterion("business_agreement not like", value, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementIn(List<String> values) {
            addCriterion("business_agreement in", values, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementNotIn(List<String> values) {
            addCriterion("business_agreement not in", values, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementBetween(String value1, String value2) {
            addCriterion("business_agreement between", value1, value2, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andBusinessAgreementNotBetween(String value1, String value2) {
            addCriterion("business_agreement not between", value1, value2, "businessAgreement");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostIsNull() {
            addCriterion("regulatory_cost is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostIsNotNull() {
            addCriterion("regulatory_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEqualTo(Long value) {
            addCriterion("regulatory_cost =", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostNotEqualTo(Long value) {
            addCriterion("regulatory_cost <>", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostGreaterThan(Long value) {
            addCriterion("regulatory_cost >", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostGreaterThanOrEqualTo(Long value) {
            addCriterion("regulatory_cost >=", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostLessThan(Long value) {
            addCriterion("regulatory_cost <", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostLessThanOrEqualTo(Long value) {
            addCriterion("regulatory_cost <=", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostLike(Long value) {
            addCriterion("regulatory_cost like", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostNotLike(Long value) {
            addCriterion("regulatory_cost not like", value, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostIn(List<Long> values) {
            addCriterion("regulatory_cost in", values, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostNotIn(List<Long> values) {
            addCriterion("regulatory_cost not in", values, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostBetween(Long value1, Long value2) {
            addCriterion("regulatory_cost between", value1, value2, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostNotBetween(Long value1, Long value2) {
            addCriterion("regulatory_cost not between", value1, value2, "regulatoryCost");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeIsNull() {
            addCriterion("regulatory_cost_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeIsNotNull() {
            addCriterion("regulatory_cost_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time =", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeNotEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time <>", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeGreaterThan(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time >", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time >=", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeLessThan(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time <", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time <=", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeLike(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time like", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeNotLike(java.sql.Date value) {
            addCriterion("regulatory_cost_effective_time not like", value, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeIn(List<java.sql.Date> values) {
            addCriterion("regulatory_cost_effective_time in", values, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeNotIn(List<java.sql.Date> values) {
            addCriterion("regulatory_cost_effective_time not in", values, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_cost_effective_time between", value1, value2, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostEffectiveTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_cost_effective_time not between", value1, value2, "regulatoryCostEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeIsNull() {
            addCriterion("regulatory_cost_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeIsNotNull() {
            addCriterion("regulatory_cost_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time =", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeNotEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time <>", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeGreaterThan(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time >", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeGreaterThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time >=", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeLessThan(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time <", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeLessThanOrEqualTo(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time <=", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeLike(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time like", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeNotLike(java.sql.Date value) {
            addCriterion("regulatory_cost_expiry_time not like", value, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeIn(List<java.sql.Date> values) {
            addCriterion("regulatory_cost_expiry_time in", values, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeNotIn(List<java.sql.Date> values) {
            addCriterion("regulatory_cost_expiry_time not in", values, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_cost_expiry_time between", value1, value2, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andRegulatoryCostExpiryTimeNotBetween(java.sql.Date value1, java.sql.Date value2) {
            addCriterion("regulatory_cost_expiry_time not between", value1, value2, "regulatoryCostExpiryTime");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherIsNull() {
            addCriterion("margin_voucher is null");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherIsNotNull() {
            addCriterion("margin_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherEqualTo(String value) {
            addCriterion("margin_voucher =", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherNotEqualTo(String value) {
            addCriterion("margin_voucher <>", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherGreaterThan(String value) {
            addCriterion("margin_voucher >", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("margin_voucher >=", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherLessThan(String value) {
            addCriterion("margin_voucher <", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherLessThanOrEqualTo(String value) {
            addCriterion("margin_voucher <=", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherLike(String value) {
            addCriterion("margin_voucher like", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherNotLike(String value) {
            addCriterion("margin_voucher not like", value, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherIn(List<String> values) {
            addCriterion("margin_voucher in", values, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherNotIn(List<String> values) {
            addCriterion("margin_voucher not in", values, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherBetween(String value1, String value2) {
            addCriterion("margin_voucher between", value1, value2, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andMarginVoucherNotBetween(String value1, String value2) {
            addCriterion("margin_voucher not between", value1, value2, "marginVoucher");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(java.math.BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(java.math.BigDecimal value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(java.math.BigDecimal value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(java.math.BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(java.math.BigDecimal value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(java.math.BigDecimal value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Long value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Long value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Long value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Long value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Long value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(Long value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(Long value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Long> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Long> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Long value1, Long value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Long value1, Long value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table wms_warehouse
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