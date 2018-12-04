package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class TmsCarQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public TmsCarQuery() {
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
     * This class corresponds to the database table tms_car
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "id");
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

        public Criteria andCarUniqueIsNull() {
            addCriterion("car_unique is null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIsNotNull() {
            addCriterion("car_unique is not null");
            return (Criteria) this;
        }

        public Criteria andCarUniqueEqualTo(String value) {
            addCriterion("car_unique =", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotEqualTo(String value) {
            addCriterion("car_unique <>", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueGreaterThan(String value) {
            addCriterion("car_unique >", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("car_unique >=", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLessThan(String value) {
            addCriterion("car_unique <", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLessThanOrEqualTo(String value) {
            addCriterion("car_unique <=", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueLike(String value) {
            addCriterion("car_unique like", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotLike(String value) {
            addCriterion("car_unique not like", value, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueIn(List<String> values) {
            addCriterion("car_unique in", values, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotIn(List<String> values) {
            addCriterion("car_unique not in", values, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueBetween(String value1, String value2) {
            addCriterion("car_unique between", value1, value2, "carUnique");
            return (Criteria) this;
        }

        public Criteria andCarUniqueNotBetween(String value1, String value2) {
            addCriterion("car_unique not between", value1, value2, "carUnique");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(Long value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(Long value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNull() {
            addCriterion("inner_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNotNull() {
            addCriterion("inner_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerIdEqualTo(Long value) {
            addCriterion("inner_id =", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotEqualTo(Long value) {
            addCriterion("inner_id <>", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThan(Long value) {
            addCriterion("inner_id >", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inner_id >=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThan(Long value) {
            addCriterion("inner_id <", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThanOrEqualTo(Long value) {
            addCriterion("inner_id <=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLike(Long value) {
            addCriterion("inner_id like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotLike(Long value) {
            addCriterion("inner_id not like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdIn(List<Long> values) {
            addCriterion("inner_id in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotIn(List<Long> values) {
            addCriterion("inner_id not in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdBetween(Long value1, Long value2) {
            addCriterion("inner_id between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotBetween(Long value1, Long value2) {
            addCriterion("inner_id not between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNull() {
            addCriterion("outer_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNotNull() {
            addCriterion("outer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterIdEqualTo(Long value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(Long value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(Long value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(Long value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(Long value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(Long value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(Long value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<Long> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<Long> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(Long value1, Long value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(Long value1, Long value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIsNull() {
            addCriterion("outer_color_name is null");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIsNotNull() {
            addCriterion("outer_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameEqualTo(String value) {
            addCriterion("outer_color_name =", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotEqualTo(String value) {
            addCriterion("outer_color_name <>", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameGreaterThan(String value) {
            addCriterion("outer_color_name >", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("outer_color_name >=", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLessThan(String value) {
            addCriterion("outer_color_name <", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLessThanOrEqualTo(String value) {
            addCriterion("outer_color_name <=", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameLike(String value) {
            addCriterion("outer_color_name like", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotLike(String value) {
            addCriterion("outer_color_name not like", value, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameIn(List<String> values) {
            addCriterion("outer_color_name in", values, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotIn(List<String> values) {
            addCriterion("outer_color_name not in", values, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameBetween(String value1, String value2) {
            addCriterion("outer_color_name between", value1, value2, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andOuterColorNameNotBetween(String value1, String value2) {
            addCriterion("outer_color_name not between", value1, value2, "outerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIsNull() {
            addCriterion("inner_color_name is null");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIsNotNull() {
            addCriterion("inner_color_name is not null");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameEqualTo(String value) {
            addCriterion("inner_color_name =", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotEqualTo(String value) {
            addCriterion("inner_color_name <>", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameGreaterThan(String value) {
            addCriterion("inner_color_name >", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("inner_color_name >=", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLessThan(String value) {
            addCriterion("inner_color_name <", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLessThanOrEqualTo(String value) {
            addCriterion("inner_color_name <=", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameLike(String value) {
            addCriterion("inner_color_name like", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotLike(String value) {
            addCriterion("inner_color_name not like", value, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameIn(List<String> values) {
            addCriterion("inner_color_name in", values, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotIn(List<String> values) {
            addCriterion("inner_color_name not in", values, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameBetween(String value1, String value2) {
            addCriterion("inner_color_name between", value1, value2, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andInnerColorNameNotBetween(String value1, String value2) {
            addCriterion("inner_color_name not between", value1, value2, "innerColorName");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(Long value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(Long value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Long value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Long value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Long value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Long value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Long value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLike(Long value) {
            addCriterion("series_id like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotLike(Long value) {
            addCriterion("series_id not like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Long> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Long> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Long value1, Long value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Long value1, Long value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSpecIdIsNull() {
            addCriterion("spec_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecIdIsNotNull() {
            addCriterion("spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecIdEqualTo(Integer value) {
            addCriterion("spec_id =", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotEqualTo(Integer value) {
            addCriterion("spec_id <>", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThan(Integer value) {
            addCriterion("spec_id >", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec_id >=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThan(Integer value) {
            addCriterion("spec_id <", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("spec_id <=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLike(Integer value) {
            addCriterion("spec_id like", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotLike(Integer value) {
            addCriterion("spec_id not like", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdIn(List<Integer> values) {
            addCriterion("spec_id in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotIn(List<Integer> values) {
            addCriterion("spec_id not in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("spec_id between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spec_id not between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNull() {
            addCriterion("guide_price is null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNotNull() {
            addCriterion("guide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceEqualTo(String value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(String value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(String value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(String value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(String value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(String value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLike(String value) {
            addCriterion("guide_price like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotLike(String value) {
            addCriterion("guide_price not like", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<String> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<String> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(String value1, String value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(String value1, String value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(String value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(String value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(String value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(String value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(String value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLike(String value) {
            addCriterion("market_price like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotLike(String value) {
            addCriterion("market_price not like", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<String> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<String> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(String value1, String value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(String value1, String value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andEmissionIsNull() {
            addCriterion("emission is null");
            return (Criteria) this;
        }

        public Criteria andEmissionIsNotNull() {
            addCriterion("emission is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionEqualTo(String value) {
            addCriterion("emission =", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotEqualTo(String value) {
            addCriterion("emission <>", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThan(String value) {
            addCriterion("emission >", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThanOrEqualTo(String value) {
            addCriterion("emission >=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThan(String value) {
            addCriterion("emission <", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThanOrEqualTo(String value) {
            addCriterion("emission <=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLike(String value) {
            addCriterion("emission like", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotLike(String value) {
            addCriterion("emission not like", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionIn(List<String> values) {
            addCriterion("emission in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotIn(List<String> values) {
            addCriterion("emission not in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionBetween(String value1, String value2) {
            addCriterion("emission between", value1, value2, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotBetween(String value1, String value2) {
            addCriterion("emission not between", value1, value2, "emission");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(Integer value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(Integer value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(Integer value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(Integer value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(Integer value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(Integer value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(Integer value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(Integer value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<Integer> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<Integer> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(Integer value1, Integer value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(Integer value1, Integer value2) {
            addCriterion("attach not between", value1, value2, "attach");
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
     * This class corresponds to the database table tms_car
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