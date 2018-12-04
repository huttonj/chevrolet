package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsWarehouseBasicQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsWarehouseBasicQuery() {
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
     * This class corresponds to the database table wms_warehouse_basic
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

        public Criteria andInternalNameIsNull() {
            addCriterion("internal_name is null");
            return (Criteria) this;
        }

        public Criteria andInternalNameIsNotNull() {
            addCriterion("internal_name is not null");
            return (Criteria) this;
        }

        public Criteria andInternalNameEqualTo(String value) {
            addCriterion("internal_name =", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotEqualTo(String value) {
            addCriterion("internal_name <>", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameGreaterThan(String value) {
            addCriterion("internal_name >", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("internal_name >=", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLessThan(String value) {
            addCriterion("internal_name <", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLessThanOrEqualTo(String value) {
            addCriterion("internal_name <=", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLike(String value) {
            addCriterion("internal_name like", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotLike(String value) {
            addCriterion("internal_name not like", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameIn(List<String> values) {
            addCriterion("internal_name in", values, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotIn(List<String> values) {
            addCriterion("internal_name not in", values, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameBetween(String value1, String value2) {
            addCriterion("internal_name between", value1, value2, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotBetween(String value1, String value2) {
            addCriterion("internal_name not between", value1, value2, "internalName");
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

        public Criteria andRegionEqualTo(Long value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Long value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Long value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Long value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Long value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Long value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(Long value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(Long value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Long> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Long> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Long value1, Long value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Long value1, Long value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdIsNull() {
            addCriterion("prov_area_id is null");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdIsNotNull() {
            addCriterion("prov_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdEqualTo(Long value) {
            addCriterion("prov_area_id =", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdNotEqualTo(Long value) {
            addCriterion("prov_area_id <>", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdGreaterThan(Long value) {
            addCriterion("prov_area_id >", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prov_area_id >=", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdLessThan(Long value) {
            addCriterion("prov_area_id <", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("prov_area_id <=", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdLike(Long value) {
            addCriterion("prov_area_id like", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdNotLike(Long value) {
            addCriterion("prov_area_id not like", value, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdIn(List<Long> values) {
            addCriterion("prov_area_id in", values, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdNotIn(List<Long> values) {
            addCriterion("prov_area_id not in", values, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdBetween(Long value1, Long value2) {
            addCriterion("prov_area_id between", value1, value2, "provAreaId");
            return (Criteria) this;
        }

        public Criteria andProvAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("prov_area_id not between", value1, value2, "provAreaId");
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

        public Criteria andWarehouseStatusIsNull() {
            addCriterion("warehouse_status is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusIsNotNull() {
            addCriterion("warehouse_status is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusEqualTo(Integer value) {
            addCriterion("warehouse_status =", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotEqualTo(Integer value) {
            addCriterion("warehouse_status <>", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusGreaterThan(Integer value) {
            addCriterion("warehouse_status >", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_status >=", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusLessThan(Integer value) {
            addCriterion("warehouse_status <", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_status <=", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusLike(Integer value) {
            addCriterion("warehouse_status like", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotLike(Integer value) {
            addCriterion("warehouse_status not like", value, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusIn(List<Integer> values) {
            addCriterion("warehouse_status in", values, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotIn(List<Integer> values) {
            addCriterion("warehouse_status not in", values, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_status between", value1, value2, "warehouseStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_status not between", value1, value2, "warehouseStatus");
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

        public Criteria andUsePdaIsNull() {
            addCriterion("use_pda is null");
            return (Criteria) this;
        }

        public Criteria andUsePdaIsNotNull() {
            addCriterion("use_pda is not null");
            return (Criteria) this;
        }

        public Criteria andUsePdaEqualTo(Integer value) {
            addCriterion("use_pda =", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotEqualTo(Integer value) {
            addCriterion("use_pda <>", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaGreaterThan(Integer value) {
            addCriterion("use_pda >", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_pda >=", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLessThan(Integer value) {
            addCriterion("use_pda <", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLessThanOrEqualTo(Integer value) {
            addCriterion("use_pda <=", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaLike(Integer value) {
            addCriterion("use_pda like", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotLike(Integer value) {
            addCriterion("use_pda not like", value, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaIn(List<Integer> values) {
            addCriterion("use_pda in", values, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotIn(List<Integer> values) {
            addCriterion("use_pda not in", values, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaBetween(Integer value1, Integer value2) {
            addCriterion("use_pda between", value1, value2, "usePda");
            return (Criteria) this;
        }

        public Criteria andUsePdaNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUsePositionEqualTo(Integer value) {
            addCriterion("use_position =", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotEqualTo(Integer value) {
            addCriterion("use_position <>", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionGreaterThan(Integer value) {
            addCriterion("use_position >", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_position >=", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLessThan(Integer value) {
            addCriterion("use_position <", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLessThanOrEqualTo(Integer value) {
            addCriterion("use_position <=", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionLike(Integer value) {
            addCriterion("use_position like", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotLike(Integer value) {
            addCriterion("use_position not like", value, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionIn(List<Integer> values) {
            addCriterion("use_position in", values, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotIn(List<Integer> values) {
            addCriterion("use_position not in", values, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionBetween(Integer value1, Integer value2) {
            addCriterion("use_position between", value1, value2, "usePosition");
            return (Criteria) this;
        }

        public Criteria andUsePositionNotBetween(Integer value1, Integer value2) {
            addCriterion("use_position not between", value1, value2, "usePosition");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleIsNull() {
            addCriterion("notice_rule is null");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleIsNotNull() {
            addCriterion("notice_rule is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleEqualTo(String value) {
            addCriterion("notice_rule =", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleNotEqualTo(String value) {
            addCriterion("notice_rule <>", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleGreaterThan(String value) {
            addCriterion("notice_rule >", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_rule >=", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleLessThan(String value) {
            addCriterion("notice_rule <", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleLessThanOrEqualTo(String value) {
            addCriterion("notice_rule <=", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleLike(String value) {
            addCriterion("notice_rule like", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleNotLike(String value) {
            addCriterion("notice_rule not like", value, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleIn(List<String> values) {
            addCriterion("notice_rule in", values, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleNotIn(List<String> values) {
            addCriterion("notice_rule not in", values, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleBetween(String value1, String value2) {
            addCriterion("notice_rule between", value1, value2, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andNoticeRuleNotBetween(String value1, String value2) {
            addCriterion("notice_rule not between", value1, value2, "noticeRule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIsNull() {
            addCriterion("is_schedule is null");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIsNotNull() {
            addCriterion("is_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andIsScheduleEqualTo(Integer value) {
            addCriterion("is_schedule =", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotEqualTo(Integer value) {
            addCriterion("is_schedule <>", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleGreaterThan(Integer value) {
            addCriterion("is_schedule >", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_schedule >=", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLessThan(Integer value) {
            addCriterion("is_schedule <", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("is_schedule <=", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLike(Integer value) {
            addCriterion("is_schedule like", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotLike(Integer value) {
            addCriterion("is_schedule not like", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIn(List<Integer> values) {
            addCriterion("is_schedule in", values, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotIn(List<Integer> values) {
            addCriterion("is_schedule not in", values, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleBetween(Integer value1, Integer value2) {
            addCriterion("is_schedule between", value1, value2, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_schedule not between", value1, value2, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andMonitoringIsNull() {
            addCriterion("monitoring is null");
            return (Criteria) this;
        }

        public Criteria andMonitoringIsNotNull() {
            addCriterion("monitoring is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoringEqualTo(Integer value) {
            addCriterion("monitoring =", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringNotEqualTo(Integer value) {
            addCriterion("monitoring <>", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringGreaterThan(Integer value) {
            addCriterion("monitoring >", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitoring >=", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringLessThan(Integer value) {
            addCriterion("monitoring <", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringLessThanOrEqualTo(Integer value) {
            addCriterion("monitoring <=", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringLike(Integer value) {
            addCriterion("monitoring like", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringNotLike(Integer value) {
            addCriterion("monitoring not like", value, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringIn(List<Integer> values) {
            addCriterion("monitoring in", values, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringNotIn(List<Integer> values) {
            addCriterion("monitoring not in", values, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringBetween(Integer value1, Integer value2) {
            addCriterion("monitoring between", value1, value2, "monitoring");
            return (Criteria) this;
        }

        public Criteria andMonitoringNotBetween(Integer value1, Integer value2) {
            addCriterion("monitoring not between", value1, value2, "monitoring");
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
     * This class corresponds to the database table wms_warehouse_basic
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