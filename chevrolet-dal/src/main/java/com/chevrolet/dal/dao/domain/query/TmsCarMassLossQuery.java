package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsCarMassLossQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsCarMassLossQuery() {
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
     * This class corresponds to the database table tms_car_mass_loss
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

        public Criteria andCarMassLossIdIsNull() {
            addCriterion("car_mass_loss_id is null");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdIsNotNull() {
            addCriterion("car_mass_loss_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdEqualTo(Long value) {
            addCriterion("car_mass_loss_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdNotEqualTo(Long value) {
            addCriterion("car_mass_loss_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarMassLossIdGreaterThan(Long value) {
            addCriterion("car_mass_loss_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_mass_loss_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdLessThan(Long value) {
            addCriterion("car_mass_loss_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdLessThanOrEqualTo(Long value) {
            addCriterion("car_mass_loss_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdIn(List<Long> values) {
            addCriterion("car_mass_loss_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdNotIn(List<Long> values) {
            addCriterion("car_mass_loss_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdBetween(Long value1, Long value2) {
            addCriterion("car_mass_loss_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarMassLossIdNotBetween(Long value1, Long value2) {
            addCriterion("car_mass_loss_id not between", value1, value2, "id");
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

        public Criteria andImgMassLossIsNull() {
            addCriterion("img_mass_loss is null");
            return (Criteria) this;
        }

        public Criteria andImgMassLossIsNotNull() {
            addCriterion("img_mass_loss is not null");
            return (Criteria) this;
        }

        public Criteria andImgMassLossEqualTo(String value) {
            addCriterion("img_mass_loss =", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossNotEqualTo(String value) {
            addCriterion("img_mass_loss <>", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossGreaterThan(String value) {
            addCriterion("img_mass_loss >", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossGreaterThanOrEqualTo(String value) {
            addCriterion("img_mass_loss >=", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossLessThan(String value) {
            addCriterion("img_mass_loss <", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossLessThanOrEqualTo(String value) {
            addCriterion("img_mass_loss <=", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossLike(String value) {
            addCriterion("img_mass_loss like", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossNotLike(String value) {
            addCriterion("img_mass_loss not like", value, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossIn(List<String> values) {
            addCriterion("img_mass_loss in", values, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossNotIn(List<String> values) {
            addCriterion("img_mass_loss not in", values, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossBetween(String value1, String value2) {
            addCriterion("img_mass_loss between", value1, value2, "imgMassLoss");
            return (Criteria) this;
        }

        public Criteria andImgMassLossNotBetween(String value1, String value2) {
            addCriterion("img_mass_loss not between", value1, value2, "imgMassLoss");
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
     * This class corresponds to the database table tms_car_mass_loss
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