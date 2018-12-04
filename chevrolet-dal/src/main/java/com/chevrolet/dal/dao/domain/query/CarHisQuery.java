package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarHisQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarHisQuery() {
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
     * This class corresponds to the database table cc_car_his
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

        public Criteria andCarHisIdIsNull() {
            addCriterion("car_his_id is null");
            return (Criteria) this;
        }

        public Criteria andCarHisIdIsNotNull() {
            addCriterion("car_his_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarHisIdEqualTo(Long value) {
            addCriterion("car_his_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdNotEqualTo(Long value) {
            addCriterion("car_his_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anCarHisIdGreaterThan(Long value) {
            addCriterion("car_his_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_his_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdLessThan(Long value) {
            addCriterion("car_his_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdLessThanOrEqualTo(Long value) {
            addCriterion("car_his_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdIn(List<Long> values) {
            addCriterion("car_his_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdNotIn(List<Long> values) {
            addCriterion("car_his_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdBetween(Long value1, Long value2) {
            addCriterion("car_his_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarHisIdNotBetween(Long value1, Long value2) {
            addCriterion("car_his_id not between", value1, value2, "id");
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(Long value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(Long value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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

        public Criteria andInnerColorIdIsNull() {
            addCriterion("inner_color_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdIsNotNull() {
            addCriterion("inner_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdEqualTo(Long value) {
            addCriterion("inner_color_id =", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdNotEqualTo(Long value) {
            addCriterion("inner_color_id <>", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdGreaterThan(Long value) {
            addCriterion("inner_color_id >", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inner_color_id >=", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdLessThan(Long value) {
            addCriterion("inner_color_id <", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdLessThanOrEqualTo(Long value) {
            addCriterion("inner_color_id <=", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdLike(Long value) {
            addCriterion("inner_color_id like", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdNotLike(Long value) {
            addCriterion("inner_color_id not like", value, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdIn(List<Long> values) {
            addCriterion("inner_color_id in", values, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdNotIn(List<Long> values) {
            addCriterion("inner_color_id not in", values, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdBetween(Long value1, Long value2) {
            addCriterion("inner_color_id between", value1, value2, "innerColorId");
            return (Criteria) this;
        }

        public Criteria andInnerColorIdNotBetween(Long value1, Long value2) {
            addCriterion("inner_color_id not between", value1, value2, "innerColorId");
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

        public Criteria andOdometerIsNull() {
            addCriterion("odometer is null");
            return (Criteria) this;
        }

        public Criteria andOdometerIsNotNull() {
            addCriterion("odometer is not null");
            return (Criteria) this;
        }

        public Criteria andOdometerEqualTo(String value) {
            addCriterion("odometer =", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotEqualTo(String value) {
            addCriterion("odometer <>", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThan(String value) {
            addCriterion("odometer >", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerGreaterThanOrEqualTo(String value) {
            addCriterion("odometer >=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThan(String value) {
            addCriterion("odometer <", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLessThanOrEqualTo(String value) {
            addCriterion("odometer <=", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerLike(String value) {
            addCriterion("odometer like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotLike(String value) {
            addCriterion("odometer not like", value, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerIn(List<String> values) {
            addCriterion("odometer in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotIn(List<String> values) {
            addCriterion("odometer not in", values, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerBetween(String value1, String value2) {
            addCriterion("odometer between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andOdometerNotBetween(String value1, String value2) {
            addCriterion("odometer not between", value1, value2, "odometer");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdIsNull() {
            addCriterion("outer_color_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdIsNotNull() {
            addCriterion("outer_color_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdEqualTo(Long value) {
            addCriterion("outer_color_id =", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdNotEqualTo(Long value) {
            addCriterion("outer_color_id <>", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdGreaterThan(Long value) {
            addCriterion("outer_color_id >", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("outer_color_id >=", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdLessThan(Long value) {
            addCriterion("outer_color_id <", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdLessThanOrEqualTo(Long value) {
            addCriterion("outer_color_id <=", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdLike(Long value) {
            addCriterion("outer_color_id like", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdNotLike(Long value) {
            addCriterion("outer_color_id not like", value, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdIn(List<Long> values) {
            addCriterion("outer_color_id in", values, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdNotIn(List<Long> values) {
            addCriterion("outer_color_id not in", values, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdBetween(Long value1, Long value2) {
            addCriterion("outer_color_id between", value1, value2, "outerColorId");
            return (Criteria) this;
        }

        public Criteria andOuterColorIdNotBetween(Long value1, Long value2) {
            addCriterion("outer_color_id not between", value1, value2, "outerColorId");
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

        public Criteria andInterfaceNameIsNull() {
            addCriterion("interface_name is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIsNotNull() {
            addCriterion("interface_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameEqualTo(String value) {
            addCriterion("interface_name =", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotEqualTo(String value) {
            addCriterion("interface_name <>", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThan(String value) {
            addCriterion("interface_name >", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("interface_name >=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThan(String value) {
            addCriterion("interface_name <", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("interface_name <=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLike(String value) {
            addCriterion("interface_name like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotLike(String value) {
            addCriterion("interface_name not like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIn(List<String> values) {
            addCriterion("interface_name in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotIn(List<String> values) {
            addCriterion("interface_name not in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameBetween(String value1, String value2) {
            addCriterion("interface_name between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("interface_name not between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIsNull() {
            addCriterion("remote_address is null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIsNotNull() {
            addCriterion("remote_address is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressEqualTo(String value) {
            addCriterion("remote_address =", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotEqualTo(String value) {
            addCriterion("remote_address <>", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressGreaterThan(String value) {
            addCriterion("remote_address >", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressGreaterThanOrEqualTo(String value) {
            addCriterion("remote_address >=", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLessThan(String value) {
            addCriterion("remote_address <", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLessThanOrEqualTo(String value) {
            addCriterion("remote_address <=", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressLike(String value) {
            addCriterion("remote_address like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotLike(String value) {
            addCriterion("remote_address not like", value, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressIn(List<String> values) {
            addCriterion("remote_address in", values, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotIn(List<String> values) {
            addCriterion("remote_address not in", values, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressBetween(String value1, String value2) {
            addCriterion("remote_address between", value1, value2, "remoteAddress");
            return (Criteria) this;
        }

        public Criteria andRemoteAddressNotBetween(String value1, String value2) {
            addCriterion("remote_address not between", value1, value2, "remoteAddress");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_car_his
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