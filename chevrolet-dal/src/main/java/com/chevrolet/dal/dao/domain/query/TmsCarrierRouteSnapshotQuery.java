package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsCarrierRouteSnapshotQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsCarrierRouteSnapshotQuery() {
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
     * This class corresponds to the database table tms_carrier_route_snapshot
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

        public Criteria andRouteSnapshotIdIsNull() {
            addCriterion("route_snapshot_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdIsNotNull() {
            addCriterion("route_snapshot_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdEqualTo(Long value) {
            addCriterion("route_snapshot_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdNotEqualTo(Long value) {
            addCriterion("route_snapshot_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anRouteSnapshotIdGreaterThan(Long value) {
            addCriterion("route_snapshot_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdGreaterThanOrEqualTo(Long value) {
            addCriterion("route_snapshot_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdLessThan(Long value) {
            addCriterion("route_snapshot_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdLessThanOrEqualTo(Long value) {
            addCriterion("route_snapshot_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdIn(List<Long> values) {
            addCriterion("route_snapshot_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdNotIn(List<Long> values) {
            addCriterion("route_snapshot_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdBetween(Long value1, Long value2) {
            addCriterion("route_snapshot_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRouteSnapshotIdNotBetween(Long value1, Long value2) {
            addCriterion("route_snapshot_id not between", value1, value2, "id");
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Long value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Long value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Long value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Long value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Long value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(Long value) {
            addCriterion("route_id like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(Long value) {
            addCriterion("route_id not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Long> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Long> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Long value1, Long value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Long value1, Long value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIsNull() {
            addCriterion("transport_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIsNotNull() {
            addCriterion("transport_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdEqualTo(Long value) {
            addCriterion("transport_order_id =", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotEqualTo(Long value) {
            addCriterion("transport_order_id <>", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdGreaterThan(Long value) {
            addCriterion("transport_order_id >", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_order_id >=", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThan(Long value) {
            addCriterion("transport_order_id <", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_order_id <=", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdLike(Long value) {
            addCriterion("transport_order_id like", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotLike(Long value) {
            addCriterion("transport_order_id not like", value, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdIn(List<Long> values) {
            addCriterion("transport_order_id in", values, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotIn(List<Long> values) {
            addCriterion("transport_order_id not in", values, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdBetween(Long value1, Long value2) {
            addCriterion("transport_order_id between", value1, value2, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andTransportOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_order_id not between", value1, value2, "transportOrderId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIsNull() {
            addCriterion("start_city_id is null");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIsNotNull() {
            addCriterion("start_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartCityIdEqualTo(Long value) {
            addCriterion("start_city_id =", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotEqualTo(Long value) {
            addCriterion("start_city_id <>", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdGreaterThan(Long value) {
            addCriterion("start_city_id >", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("start_city_id >=", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLessThan(Long value) {
            addCriterion("start_city_id <", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLessThanOrEqualTo(Long value) {
            addCriterion("start_city_id <=", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdLike(Long value) {
            addCriterion("start_city_id like", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotLike(Long value) {
            addCriterion("start_city_id not like", value, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdIn(List<Long> values) {
            addCriterion("start_city_id in", values, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotIn(List<Long> values) {
            addCriterion("start_city_id not in", values, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdBetween(Long value1, Long value2) {
            addCriterion("start_city_id between", value1, value2, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityIdNotBetween(Long value1, Long value2) {
            addCriterion("start_city_id not between", value1, value2, "startCityId");
            return (Criteria) this;
        }

        public Criteria andStartCityNameIsNull() {
            addCriterion("start_city_name is null");
            return (Criteria) this;
        }

        public Criteria andStartCityNameIsNotNull() {
            addCriterion("start_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andStartCityNameEqualTo(String value) {
            addCriterion("start_city_name =", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameNotEqualTo(String value) {
            addCriterion("start_city_name <>", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameGreaterThan(String value) {
            addCriterion("start_city_name >", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("start_city_name >=", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameLessThan(String value) {
            addCriterion("start_city_name <", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameLessThanOrEqualTo(String value) {
            addCriterion("start_city_name <=", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameLike(String value) {
            addCriterion("start_city_name like", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameNotLike(String value) {
            addCriterion("start_city_name not like", value, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameIn(List<String> values) {
            addCriterion("start_city_name in", values, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameNotIn(List<String> values) {
            addCriterion("start_city_name not in", values, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameBetween(String value1, String value2) {
            addCriterion("start_city_name between", value1, value2, "startCityName");
            return (Criteria) this;
        }

        public Criteria andStartCityNameNotBetween(String value1, String value2) {
            addCriterion("start_city_name not between", value1, value2, "startCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIsNull() {
            addCriterion("destination_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIsNotNull() {
            addCriterion("destination_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdEqualTo(Long value) {
            addCriterion("destination_city_id =", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotEqualTo(Long value) {
            addCriterion("destination_city_id <>", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdGreaterThan(Long value) {
            addCriterion("destination_city_id >", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("destination_city_id >=", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLessThan(Long value) {
            addCriterion("destination_city_id <", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLessThanOrEqualTo(Long value) {
            addCriterion("destination_city_id <=", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdLike(Long value) {
            addCriterion("destination_city_id like", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotLike(Long value) {
            addCriterion("destination_city_id not like", value, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdIn(List<Long> values) {
            addCriterion("destination_city_id in", values, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotIn(List<Long> values) {
            addCriterion("destination_city_id not in", values, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdBetween(Long value1, Long value2) {
            addCriterion("destination_city_id between", value1, value2, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityIdNotBetween(Long value1, Long value2) {
            addCriterion("destination_city_id not between", value1, value2, "destinationCityId");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameIsNull() {
            addCriterion("destination_city_name is null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameIsNotNull() {
            addCriterion("destination_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameEqualTo(String value) {
            addCriterion("destination_city_name =", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameNotEqualTo(String value) {
            addCriterion("destination_city_name <>", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameGreaterThan(String value) {
            addCriterion("destination_city_name >", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("destination_city_name >=", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameLessThan(String value) {
            addCriterion("destination_city_name <", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameLessThanOrEqualTo(String value) {
            addCriterion("destination_city_name <=", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameLike(String value) {
            addCriterion("destination_city_name like", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameNotLike(String value) {
            addCriterion("destination_city_name not like", value, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameIn(List<String> values) {
            addCriterion("destination_city_name in", values, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameNotIn(List<String> values) {
            addCriterion("destination_city_name not in", values, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameBetween(String value1, String value2) {
            addCriterion("destination_city_name between", value1, value2, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andDestinationCityNameNotBetween(String value1, String value2) {
            addCriterion("destination_city_name not between", value1, value2, "destinationCityName");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Integer value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Integer value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Integer value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Integer value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Integer value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(Integer value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(Integer value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Integer> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Integer> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Integer value1, Integer value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("carrier_id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("carrier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(Long value) {
            addCriterion("carrier_id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(Long value) {
            addCriterion("carrier_id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(Long value) {
            addCriterion("carrier_id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("carrier_id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(Long value) {
            addCriterion("carrier_id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(Long value) {
            addCriterion("carrier_id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLike(Long value) {
            addCriterion("carrier_id like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotLike(Long value) {
            addCriterion("carrier_id not like", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<Long> values) {
            addCriterion("carrier_id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<Long> values) {
            addCriterion("carrier_id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(Long value1, Long value2) {
            addCriterion("carrier_id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(Long value1, Long value2) {
            addCriterion("carrier_id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(Integer value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(Integer value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(Integer value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(Integer value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(Integer value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(Integer value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<Integer> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<Integer> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(Integer value1, Integer value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(Integer value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(Integer value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andTransportCostsIsNull() {
            addCriterion("transport_costs is null");
            return (Criteria) this;
        }

        public Criteria andTransportCostsIsNotNull() {
            addCriterion("transport_costs is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCostsEqualTo(Integer value) {
            addCriterion("transport_costs =", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsNotEqualTo(Integer value) {
            addCriterion("transport_costs <>", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsGreaterThan(Integer value) {
            addCriterion("transport_costs >", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_costs >=", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsLessThan(Integer value) {
            addCriterion("transport_costs <", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsLessThanOrEqualTo(Integer value) {
            addCriterion("transport_costs <=", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsLike(Integer value) {
            addCriterion("transport_costs like", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsNotLike(Integer value) {
            addCriterion("transport_costs not like", value, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsIn(List<Integer> values) {
            addCriterion("transport_costs in", values, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsNotIn(List<Integer> values) {
            addCriterion("transport_costs not in", values, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsBetween(Integer value1, Integer value2) {
            addCriterion("transport_costs between", value1, value2, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportCostsNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_costs not between", value1, value2, "transportCosts");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIsNull() {
            addCriterion("transport_time is null");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIsNotNull() {
            addCriterion("transport_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTimeEqualTo(Integer value) {
            addCriterion("transport_time =", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotEqualTo(Integer value) {
            addCriterion("transport_time <>", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeGreaterThan(Integer value) {
            addCriterion("transport_time >", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_time >=", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeLessThan(Integer value) {
            addCriterion("transport_time <", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeLessThanOrEqualTo(Integer value) {
            addCriterion("transport_time <=", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeLike(Integer value) {
            addCriterion("transport_time like", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotLike(Integer value) {
            addCriterion("transport_time not like", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIn(List<Integer> values) {
            addCriterion("transport_time in", values, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotIn(List<Integer> values) {
            addCriterion("transport_time not in", values, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeBetween(Integer value1, Integer value2) {
            addCriterion("transport_time between", value1, value2, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_time not between", value1, value2, "transportTime");
            return (Criteria) this;
        }

        public Criteria andRouteStatusIsNull() {
            addCriterion("route_status is null");
            return (Criteria) this;
        }

        public Criteria andRouteStatusIsNotNull() {
            addCriterion("route_status is not null");
            return (Criteria) this;
        }

        public Criteria andRouteStatusEqualTo(Integer value) {
            addCriterion("route_status =", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusNotEqualTo(Integer value) {
            addCriterion("route_status <>", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusGreaterThan(Integer value) {
            addCriterion("route_status >", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_status >=", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusLessThan(Integer value) {
            addCriterion("route_status <", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("route_status <=", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusLike(Integer value) {
            addCriterion("route_status like", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusNotLike(Integer value) {
            addCriterion("route_status not like", value, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusIn(List<Integer> values) {
            addCriterion("route_status in", values, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusNotIn(List<Integer> values) {
            addCriterion("route_status not in", values, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusBetween(Integer value1, Integer value2) {
            addCriterion("route_status between", value1, value2, "routeStatus");
            return (Criteria) this;
        }

        public Criteria andRouteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("route_status not between", value1, value2, "routeStatus");
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

        public Criteria andControlledStatusIsNull() {
            addCriterion("controlled_status is null");
            return (Criteria) this;
        }

        public Criteria andControlledStatusIsNotNull() {
            addCriterion("controlled_status is not null");
            return (Criteria) this;
        }

        public Criteria andControlledStatusEqualTo(Integer value) {
            addCriterion("controlled_status =", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotEqualTo(Integer value) {
            addCriterion("controlled_status <>", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusGreaterThan(Integer value) {
            addCriterion("controlled_status >", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("controlled_status >=", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLessThan(Integer value) {
            addCriterion("controlled_status <", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLessThanOrEqualTo(Integer value) {
            addCriterion("controlled_status <=", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusLike(Integer value) {
            addCriterion("controlled_status like", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotLike(Integer value) {
            addCriterion("controlled_status not like", value, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusIn(List<Integer> values) {
            addCriterion("controlled_status in", values, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotIn(List<Integer> values) {
            addCriterion("controlled_status not in", values, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusBetween(Integer value1, Integer value2) {
            addCriterion("controlled_status between", value1, value2, "controlledStatus");
            return (Criteria) this;
        }

        public Criteria andControlledStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("controlled_status not between", value1, value2, "controlledStatus");
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
     * This class corresponds to the database table tms_carrier_route_snapshot
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