package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsInTransitRecordQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsInTransitRecordQuery() {
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
     * This class corresponds to the database table tms_in_transit_record
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

        public Criteria andInTransitRecordIdIsNull() {
            addCriterion("in_transit_record_id is null");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdIsNotNull() {
            addCriterion("in_transit_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdEqualTo(Long value) {
            addCriterion("in_transit_record_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdNotEqualTo(Long value) {
            addCriterion("in_transit_record_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anInTransitRecordIdGreaterThan(Long value) {
            addCriterion("in_transit_record_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_transit_record_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdLessThan(Long value) {
            addCriterion("in_transit_record_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("in_transit_record_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdIn(List<Long> values) {
            addCriterion("in_transit_record_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdNotIn(List<Long> values) {
            addCriterion("in_transit_record_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdBetween(Long value1, Long value2) {
            addCriterion("in_transit_record_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInTransitRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("in_transit_record_id not between", value1, value2, "id");
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

        public Criteria andTransportCarIdIsNull() {
            addCriterion("transport_car_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIsNotNull() {
            addCriterion("transport_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdEqualTo(Long value) {
            addCriterion("transport_car_id =", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotEqualTo(Long value) {
            addCriterion("transport_car_id <>", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdGreaterThan(Long value) {
            addCriterion("transport_car_id >", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_car_id >=", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThan(Long value) {
            addCriterion("transport_car_id <", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_car_id <=", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLike(Long value) {
            addCriterion("transport_car_id like", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotLike(Long value) {
            addCriterion("transport_car_id not like", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIn(List<Long> values) {
            addCriterion("transport_car_id in", values, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotIn(List<Long> values) {
            addCriterion("transport_car_id not in", values, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdBetween(Long value1, Long value2) {
            addCriterion("transport_car_id between", value1, value2, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_car_id not between", value1, value2, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLike(Date value) {
            addCriterion("record_time like", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotLike(Date value) {
            addCriterion("record_time not like", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNull() {
            addCriterion("operate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNotNull() {
            addCriterion("operate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdEqualTo(Long value) {
            addCriterion("operate_user_id =", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotEqualTo(Long value) {
            addCriterion("operate_user_id <>", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThan(Long value) {
            addCriterion("operate_user_id >", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operate_user_id >=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThan(Long value) {
            addCriterion("operate_user_id <", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("operate_user_id <=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLike(Long value) {
            addCriterion("operate_user_id like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotLike(Long value) {
            addCriterion("operate_user_id not like", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIn(List<Long> values) {
            addCriterion("operate_user_id in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotIn(List<Long> values) {
            addCriterion("operate_user_id not in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdBetween(Long value1, Long value2) {
            addCriterion("operate_user_id between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("operate_user_id not between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeIsNull() {
            addCriterion("operate_user_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeIsNotNull() {
            addCriterion("operate_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeEqualTo(Integer value) {
            addCriterion("operate_user_type =", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeNotEqualTo(Integer value) {
            addCriterion("operate_user_type <>", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeGreaterThan(Integer value) {
            addCriterion("operate_user_type >", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_user_type >=", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeLessThan(Integer value) {
            addCriterion("operate_user_type <", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("operate_user_type <=", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeLike(Integer value) {
            addCriterion("operate_user_type like", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeNotLike(Integer value) {
            addCriterion("operate_user_type not like", value, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeIn(List<Integer> values) {
            addCriterion("operate_user_type in", values, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeNotIn(List<Integer> values) {
            addCriterion("operate_user_type not in", values, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("operate_user_type between", value1, value2, "operateUserType");
            return (Criteria) this;
        }

        public Criteria andOperateUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_user_type not between", value1, value2, "operateUserType");
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

        public Criteria andOperateStatusIsNull() {
            addCriterion("operate_status is null");
            return (Criteria) this;
        }

        public Criteria andOperateStatusIsNotNull() {
            addCriterion("operate_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperateStatusEqualTo(Integer value) {
            addCriterion("operate_status =", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusNotEqualTo(Integer value) {
            addCriterion("operate_status <>", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusGreaterThan(Integer value) {
            addCriterion("operate_status >", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_status >=", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusLessThan(Integer value) {
            addCriterion("operate_status <", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("operate_status <=", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusLike(Integer value) {
            addCriterion("operate_status like", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusNotLike(Integer value) {
            addCriterion("operate_status not like", value, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusIn(List<Integer> values) {
            addCriterion("operate_status in", values, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusNotIn(List<Integer> values) {
            addCriterion("operate_status not in", values, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusBetween(Integer value1, Integer value2) {
            addCriterion("operate_status between", value1, value2, "operateStatus");
            return (Criteria) this;
        }

        public Criteria andOperateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_status not between", value1, value2, "operateStatus");
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
     * This class corresponds to the database table tms_in_transit_record
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