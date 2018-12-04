package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class WmsWarehouseCarMoveRecordQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public WmsWarehouseCarMoveRecordQuery() {
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
     * This class corresponds to the database table wms_warehouse_car_move_record
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("record_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("record_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anRecordIdGreaterThan(Long value) {
            addCriterion("record_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("record_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("record_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("record_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("record_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("record_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("record_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("record_id not between", value1, value2, "id");
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

        public Criteria andOldCarIdIsNull() {
            addCriterion("old_car_id is null");
            return (Criteria) this;
        }

        public Criteria andOldCarIdIsNotNull() {
            addCriterion("old_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldCarIdEqualTo(Long value) {
            addCriterion("old_car_id =", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdNotEqualTo(Long value) {
            addCriterion("old_car_id <>", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdGreaterThan(Long value) {
            addCriterion("old_car_id >", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("old_car_id >=", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdLessThan(Long value) {
            addCriterion("old_car_id <", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdLessThanOrEqualTo(Long value) {
            addCriterion("old_car_id <=", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdLike(Long value) {
            addCriterion("old_car_id like", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdNotLike(Long value) {
            addCriterion("old_car_id not like", value, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdIn(List<Long> values) {
            addCriterion("old_car_id in", values, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdNotIn(List<Long> values) {
            addCriterion("old_car_id not in", values, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdBetween(Long value1, Long value2) {
            addCriterion("old_car_id between", value1, value2, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andOldCarIdNotBetween(Long value1, Long value2) {
            addCriterion("old_car_id not between", value1, value2, "oldCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdIsNull() {
            addCriterion("new_car_id is null");
            return (Criteria) this;
        }

        public Criteria andNewCarIdIsNotNull() {
            addCriterion("new_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewCarIdEqualTo(Long value) {
            addCriterion("new_car_id =", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdNotEqualTo(Long value) {
            addCriterion("new_car_id <>", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdGreaterThan(Long value) {
            addCriterion("new_car_id >", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("new_car_id >=", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdLessThan(Long value) {
            addCriterion("new_car_id <", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdLessThanOrEqualTo(Long value) {
            addCriterion("new_car_id <=", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdLike(Long value) {
            addCriterion("new_car_id like", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdNotLike(Long value) {
            addCriterion("new_car_id not like", value, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdIn(List<Long> values) {
            addCriterion("new_car_id in", values, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdNotIn(List<Long> values) {
            addCriterion("new_car_id not in", values, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdBetween(Long value1, Long value2) {
            addCriterion("new_car_id between", value1, value2, "newCarId");
            return (Criteria) this;
        }

        public Criteria andNewCarIdNotBetween(Long value1, Long value2) {
            addCriterion("new_car_id not between", value1, value2, "newCarId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdIsNull() {
            addCriterion("old_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdIsNotNull() {
            addCriterion("old_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdEqualTo(Long value) {
            addCriterion("old_warehouse_id =", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdNotEqualTo(Long value) {
            addCriterion("old_warehouse_id <>", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdGreaterThan(Long value) {
            addCriterion("old_warehouse_id >", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("old_warehouse_id >=", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdLessThan(Long value) {
            addCriterion("old_warehouse_id <", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("old_warehouse_id <=", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdLike(Long value) {
            addCriterion("old_warehouse_id like", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdNotLike(Long value) {
            addCriterion("old_warehouse_id not like", value, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdIn(List<Long> values) {
            addCriterion("old_warehouse_id in", values, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdNotIn(List<Long> values) {
            addCriterion("old_warehouse_id not in", values, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("old_warehouse_id between", value1, value2, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOldWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("old_warehouse_id not between", value1, value2, "oldWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdIsNull() {
            addCriterion("new_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdIsNotNull() {
            addCriterion("new_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdEqualTo(Long value) {
            addCriterion("new_warehouse_id =", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdNotEqualTo(Long value) {
            addCriterion("new_warehouse_id <>", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdGreaterThan(Long value) {
            addCriterion("new_warehouse_id >", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("new_warehouse_id >=", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdLessThan(Long value) {
            addCriterion("new_warehouse_id <", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("new_warehouse_id <=", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdLike(Long value) {
            addCriterion("new_warehouse_id like", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdNotLike(Long value) {
            addCriterion("new_warehouse_id not like", value, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdIn(List<Long> values) {
            addCriterion("new_warehouse_id in", values, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdNotIn(List<Long> values) {
            addCriterion("new_warehouse_id not in", values, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("new_warehouse_id between", value1, value2, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andNewWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("new_warehouse_id not between", value1, value2, "newWarehouseId");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveIsNull() {
            addCriterion("car_status_before_move is null");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveIsNotNull() {
            addCriterion("car_status_before_move is not null");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveEqualTo(Integer value) {
            addCriterion("car_status_before_move =", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveNotEqualTo(Integer value) {
            addCriterion("car_status_before_move <>", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveGreaterThan(Integer value) {
            addCriterion("car_status_before_move >", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_status_before_move >=", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveLessThan(Integer value) {
            addCriterion("car_status_before_move <", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveLessThanOrEqualTo(Integer value) {
            addCriterion("car_status_before_move <=", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveLike(Integer value) {
            addCriterion("car_status_before_move like", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveNotLike(Integer value) {
            addCriterion("car_status_before_move not like", value, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveIn(List<Integer> values) {
            addCriterion("car_status_before_move in", values, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveNotIn(List<Integer> values) {
            addCriterion("car_status_before_move not in", values, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveBetween(Integer value1, Integer value2) {
            addCriterion("car_status_before_move between", value1, value2, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andCarStatusBeforeMoveNotBetween(Integer value1, Integer value2) {
            addCriterion("car_status_before_move not between", value1, value2, "carStatusBeforeMove");
            return (Criteria) this;
        }

        public Criteria andMoveStatusIsNull() {
            addCriterion("move_status is null");
            return (Criteria) this;
        }

        public Criteria andMoveStatusIsNotNull() {
            addCriterion("move_status is not null");
            return (Criteria) this;
        }

        public Criteria andMoveStatusEqualTo(Integer value) {
            addCriterion("move_status =", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusNotEqualTo(Integer value) {
            addCriterion("move_status <>", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusGreaterThan(Integer value) {
            addCriterion("move_status >", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("move_status >=", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusLessThan(Integer value) {
            addCriterion("move_status <", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("move_status <=", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusLike(Integer value) {
            addCriterion("move_status like", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusNotLike(Integer value) {
            addCriterion("move_status not like", value, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusIn(List<Integer> values) {
            addCriterion("move_status in", values, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusNotIn(List<Integer> values) {
            addCriterion("move_status not in", values, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusBetween(Integer value1, Integer value2) {
            addCriterion("move_status between", value1, value2, "moveStatus");
            return (Criteria) this;
        }

        public Criteria andMoveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("move_status not between", value1, value2, "moveStatus");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table wms_warehouse_car_move_record
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