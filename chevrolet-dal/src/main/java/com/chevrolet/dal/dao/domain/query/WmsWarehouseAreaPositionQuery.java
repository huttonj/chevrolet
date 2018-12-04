package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsWarehouseAreaPositionQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsWarehouseAreaPositionQuery() {
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
     * This class corresponds to the database table wms_warehouse_area_position
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

        public Criteria andAreaPositionIdIsNull() {
            addCriterion("area_position_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdIsNotNull() {
            addCriterion("area_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdEqualTo(Long value) {
            addCriterion("area_position_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotEqualTo(Long value) {
            addCriterion("area_position_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anAreaPositionIdGreaterThan(Long value) {
            addCriterion("area_position_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_position_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdLessThan(Long value) {
            addCriterion("area_position_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdLessThanOrEqualTo(Long value) {
            addCriterion("area_position_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdIn(List<Long> values) {
            addCriterion("area_position_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotIn(List<Long> values) {
            addCriterion("area_position_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdBetween(Long value1, Long value2) {
            addCriterion("area_position_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaPositionIdNotBetween(Long value1, Long value2) {
            addCriterion("area_position_id not between", value1, value2, "id");
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(Integer value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(Integer value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andRowIdIsNull() {
            addCriterion("row_id is null");
            return (Criteria) this;
        }

        public Criteria andRowIdIsNotNull() {
            addCriterion("row_id is not null");
            return (Criteria) this;
        }

        public Criteria andRowIdEqualTo(Integer value) {
            addCriterion("row_id =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Integer value) {
            addCriterion("row_id <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Integer value) {
            addCriterion("row_id >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_id >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Integer value) {
            addCriterion("row_id <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Integer value) {
            addCriterion("row_id <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLike(Integer value) {
            addCriterion("row_id like", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotLike(Integer value) {
            addCriterion("row_id not like", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Integer> values) {
            addCriterion("row_id in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Integer> values) {
            addCriterion("row_id not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Integer value1, Integer value2) {
            addCriterion("row_id between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("row_id not between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowNameIsNull() {
            addCriterion("row_name is null");
            return (Criteria) this;
        }

        public Criteria andRowNameIsNotNull() {
            addCriterion("row_name is not null");
            return (Criteria) this;
        }

        public Criteria andRowNameEqualTo(String value) {
            addCriterion("row_name =", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameNotEqualTo(String value) {
            addCriterion("row_name <>", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameGreaterThan(String value) {
            addCriterion("row_name >", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameGreaterThanOrEqualTo(String value) {
            addCriterion("row_name >=", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameLessThan(String value) {
            addCriterion("row_name <", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameLessThanOrEqualTo(String value) {
            addCriterion("row_name <=", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameLike(String value) {
            addCriterion("row_name like", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameNotLike(String value) {
            addCriterion("row_name not like", value, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameIn(List<String> values) {
            addCriterion("row_name in", values, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameNotIn(List<String> values) {
            addCriterion("row_name not in", values, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameBetween(String value1, String value2) {
            addCriterion("row_name between", value1, value2, "rowName");
            return (Criteria) this;
        }

        public Criteria andRowNameNotBetween(String value1, String value2) {
            addCriterion("row_name not between", value1, value2, "rowName");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLike(Integer value) {
            addCriterion("location_id like", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotLike(Integer value) {
            addCriterion("location_id not like", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNull() {
            addCriterion("location_name is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNotNull() {
            addCriterion("location_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEqualTo(String value) {
            addCriterion("location_name =", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotEqualTo(String value) {
            addCriterion("location_name <>", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThan(String value) {
            addCriterion("location_name >", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("location_name >=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThan(String value) {
            addCriterion("location_name <", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThanOrEqualTo(String value) {
            addCriterion("location_name <=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLike(String value) {
            addCriterion("location_name like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotLike(String value) {
            addCriterion("location_name not like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameIn(List<String> values) {
            addCriterion("location_name in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotIn(List<String> values) {
            addCriterion("location_name not in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameBetween(String value1, String value2) {
            addCriterion("location_name between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotBetween(String value1, String value2) {
            addCriterion("location_name not between", value1, value2, "locationName");
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

        public Criteria andOccupiedIsNull() {
            addCriterion("occupied is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedIsNotNull() {
            addCriterion("occupied is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedEqualTo(Integer value) {
            addCriterion("occupied =", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotEqualTo(Integer value) {
            addCriterion("occupied <>", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedGreaterThan(Integer value) {
            addCriterion("occupied >", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupied >=", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedLessThan(Integer value) {
            addCriterion("occupied <", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedLessThanOrEqualTo(Integer value) {
            addCriterion("occupied <=", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedLike(Integer value) {
            addCriterion("occupied like", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotLike(Integer value) {
            addCriterion("occupied not like", value, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedIn(List<Integer> values) {
            addCriterion("occupied in", values, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotIn(List<Integer> values) {
            addCriterion("occupied not in", values, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedBetween(Integer value1, Integer value2) {
            addCriterion("occupied between", value1, value2, "occupied");
            return (Criteria) this;
        }

        public Criteria andOccupiedNotBetween(Integer value1, Integer value2) {
            addCriterion("occupied not between", value1, value2, "occupied");
            return (Criteria) this;
        }

        public Criteria andGraphicXIsNull() {
            addCriterion("graphic_x is null");
            return (Criteria) this;
        }

        public Criteria andGraphicXIsNotNull() {
            addCriterion("graphic_x is not null");
            return (Criteria) this;
        }

        public Criteria andGraphicXEqualTo(Integer value) {
            addCriterion("graphic_x =", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXNotEqualTo(Integer value) {
            addCriterion("graphic_x <>", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXGreaterThan(Integer value) {
            addCriterion("graphic_x >", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXGreaterThanOrEqualTo(Integer value) {
            addCriterion("graphic_x >=", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXLessThan(Integer value) {
            addCriterion("graphic_x <", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXLessThanOrEqualTo(Integer value) {
            addCriterion("graphic_x <=", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXLike(Integer value) {
            addCriterion("graphic_x like", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXNotLike(Integer value) {
            addCriterion("graphic_x not like", value, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXIn(List<Integer> values) {
            addCriterion("graphic_x in", values, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXNotIn(List<Integer> values) {
            addCriterion("graphic_x not in", values, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXBetween(Integer value1, Integer value2) {
            addCriterion("graphic_x between", value1, value2, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicXNotBetween(Integer value1, Integer value2) {
            addCriterion("graphic_x not between", value1, value2, "graphicX");
            return (Criteria) this;
        }

        public Criteria andGraphicYIsNull() {
            addCriterion("graphic_y is null");
            return (Criteria) this;
        }

        public Criteria andGraphicYIsNotNull() {
            addCriterion("graphic_y is not null");
            return (Criteria) this;
        }

        public Criteria andGraphicYEqualTo(Integer value) {
            addCriterion("graphic_y =", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYNotEqualTo(Integer value) {
            addCriterion("graphic_y <>", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYGreaterThan(Integer value) {
            addCriterion("graphic_y >", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYGreaterThanOrEqualTo(Integer value) {
            addCriterion("graphic_y >=", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYLessThan(Integer value) {
            addCriterion("graphic_y <", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYLessThanOrEqualTo(Integer value) {
            addCriterion("graphic_y <=", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYLike(Integer value) {
            addCriterion("graphic_y like", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYNotLike(Integer value) {
            addCriterion("graphic_y not like", value, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYIn(List<Integer> values) {
            addCriterion("graphic_y in", values, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYNotIn(List<Integer> values) {
            addCriterion("graphic_y not in", values, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYBetween(Integer value1, Integer value2) {
            addCriterion("graphic_y between", value1, value2, "graphicY");
            return (Criteria) this;
        }

        public Criteria andGraphicYNotBetween(Integer value1, Integer value2) {
            addCriterion("graphic_y not between", value1, value2, "graphicY");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table wms_warehouse_area_position
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