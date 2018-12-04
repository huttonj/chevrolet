package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class DaasSalesQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public DaasSalesQuery() {
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
     * This class corresponds to the database table cc_daas_sales
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

        public Criteria andDaasSalesIdIsNull() {
            addCriterion("daas_sales_id is null");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdIsNotNull() {
            addCriterion("daas_sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdEqualTo(Long value) {
            addCriterion("daas_sales_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdNotEqualTo(Long value) {
            addCriterion("daas_sales_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anDaasSalesIdGreaterThan(Long value) {
            addCriterion("daas_sales_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("daas_sales_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdLessThan(Long value) {
            addCriterion("daas_sales_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdLessThanOrEqualTo(Long value) {
            addCriterion("daas_sales_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdIn(List<Long> values) {
            addCriterion("daas_sales_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdNotIn(List<Long> values) {
            addCriterion("daas_sales_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdBetween(Long value1, Long value2) {
            addCriterion("daas_sales_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDaasSalesIdNotBetween(Long value1, Long value2) {
            addCriterion("daas_sales_id not between", value1, value2, "id");
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

        public Criteria andManfIdIsNull() {
            addCriterion("manf_id is null");
            return (Criteria) this;
        }

        public Criteria andManfIdIsNotNull() {
            addCriterion("manf_id is not null");
            return (Criteria) this;
        }

        public Criteria andManfIdEqualTo(Long value) {
            addCriterion("manf_id =", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdNotEqualTo(Long value) {
            addCriterion("manf_id <>", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdGreaterThan(Long value) {
            addCriterion("manf_id >", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("manf_id >=", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdLessThan(Long value) {
            addCriterion("manf_id <", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdLessThanOrEqualTo(Long value) {
            addCriterion("manf_id <=", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdLike(Long value) {
            addCriterion("manf_id like", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdNotLike(Long value) {
            addCriterion("manf_id not like", value, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdIn(List<Long> values) {
            addCriterion("manf_id in", values, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdNotIn(List<Long> values) {
            addCriterion("manf_id not in", values, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdBetween(Long value1, Long value2) {
            addCriterion("manf_id between", value1, value2, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfIdNotBetween(Long value1, Long value2) {
            addCriterion("manf_id not between", value1, value2, "manfId");
            return (Criteria) this;
        }

        public Criteria andManfNameIsNull() {
            addCriterion("manf_name is null");
            return (Criteria) this;
        }

        public Criteria andManfNameIsNotNull() {
            addCriterion("manf_name is not null");
            return (Criteria) this;
        }

        public Criteria andManfNameEqualTo(String value) {
            addCriterion("manf_name =", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameNotEqualTo(String value) {
            addCriterion("manf_name <>", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameGreaterThan(String value) {
            addCriterion("manf_name >", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameGreaterThanOrEqualTo(String value) {
            addCriterion("manf_name >=", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameLessThan(String value) {
            addCriterion("manf_name <", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameLessThanOrEqualTo(String value) {
            addCriterion("manf_name <=", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameLike(String value) {
            addCriterion("manf_name like", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameNotLike(String value) {
            addCriterion("manf_name not like", value, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameIn(List<String> values) {
            addCriterion("manf_name in", values, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameNotIn(List<String> values) {
            addCriterion("manf_name not in", values, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameBetween(String value1, String value2) {
            addCriterion("manf_name between", value1, value2, "manfName");
            return (Criteria) this;
        }

        public Criteria andManfNameNotBetween(String value1, String value2) {
            addCriterion("manf_name not between", value1, value2, "manfName");
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

        public Criteria andSubModelIdIsNull() {
            addCriterion("sub_model_id is null");
            return (Criteria) this;
        }

        public Criteria andSubModelIdIsNotNull() {
            addCriterion("sub_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubModelIdEqualTo(Long value) {
            addCriterion("sub_model_id =", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdNotEqualTo(Long value) {
            addCriterion("sub_model_id <>", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdGreaterThan(Long value) {
            addCriterion("sub_model_id >", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sub_model_id >=", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdLessThan(Long value) {
            addCriterion("sub_model_id <", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdLessThanOrEqualTo(Long value) {
            addCriterion("sub_model_id <=", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdLike(Long value) {
            addCriterion("sub_model_id like", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdNotLike(Long value) {
            addCriterion("sub_model_id not like", value, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdIn(List<Long> values) {
            addCriterion("sub_model_id in", values, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdNotIn(List<Long> values) {
            addCriterion("sub_model_id not in", values, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdBetween(Long value1, Long value2) {
            addCriterion("sub_model_id between", value1, value2, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelIdNotBetween(Long value1, Long value2) {
            addCriterion("sub_model_id not between", value1, value2, "subModelId");
            return (Criteria) this;
        }

        public Criteria andSubModelNameIsNull() {
            addCriterion("sub_model_name is null");
            return (Criteria) this;
        }

        public Criteria andSubModelNameIsNotNull() {
            addCriterion("sub_model_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubModelNameEqualTo(String value) {
            addCriterion("sub_model_name =", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameNotEqualTo(String value) {
            addCriterion("sub_model_name <>", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameGreaterThan(String value) {
            addCriterion("sub_model_name >", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_model_name >=", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameLessThan(String value) {
            addCriterion("sub_model_name <", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameLessThanOrEqualTo(String value) {
            addCriterion("sub_model_name <=", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameLike(String value) {
            addCriterion("sub_model_name like", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameNotLike(String value) {
            addCriterion("sub_model_name not like", value, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameIn(List<String> values) {
            addCriterion("sub_model_name in", values, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameNotIn(List<String> values) {
            addCriterion("sub_model_name not in", values, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameBetween(String value1, String value2) {
            addCriterion("sub_model_name between", value1, value2, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSubModelNameNotBetween(String value1, String value2) {
            addCriterion("sub_model_name not between", value1, value2, "subModelName");
            return (Criteria) this;
        }

        public Criteria andSegmentIdIsNull() {
            addCriterion("segment_id is null");
            return (Criteria) this;
        }

        public Criteria andSegmentIdIsNotNull() {
            addCriterion("segment_id is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentIdEqualTo(Long value) {
            addCriterion("segment_id =", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdNotEqualTo(Long value) {
            addCriterion("segment_id <>", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdGreaterThan(Long value) {
            addCriterion("segment_id >", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("segment_id >=", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdLessThan(Long value) {
            addCriterion("segment_id <", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdLessThanOrEqualTo(Long value) {
            addCriterion("segment_id <=", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdLike(Long value) {
            addCriterion("segment_id like", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdNotLike(Long value) {
            addCriterion("segment_id not like", value, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdIn(List<Long> values) {
            addCriterion("segment_id in", values, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdNotIn(List<Long> values) {
            addCriterion("segment_id not in", values, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdBetween(Long value1, Long value2) {
            addCriterion("segment_id between", value1, value2, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentIdNotBetween(Long value1, Long value2) {
            addCriterion("segment_id not between", value1, value2, "segmentId");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIsNull() {
            addCriterion("segment_name is null");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIsNotNull() {
            addCriterion("segment_name is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentNameEqualTo(String value) {
            addCriterion("segment_name =", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotEqualTo(String value) {
            addCriterion("segment_name <>", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameGreaterThan(String value) {
            addCriterion("segment_name >", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("segment_name >=", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLessThan(String value) {
            addCriterion("segment_name <", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLessThanOrEqualTo(String value) {
            addCriterion("segment_name <=", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameLike(String value) {
            addCriterion("segment_name like", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotLike(String value) {
            addCriterion("segment_name not like", value, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameIn(List<String> values) {
            addCriterion("segment_name in", values, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotIn(List<String> values) {
            addCriterion("segment_name not in", values, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameBetween(String value1, String value2) {
            addCriterion("segment_name between", value1, value2, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSegmentNameNotBetween(String value1, String value2) {
            addCriterion("segment_name not between", value1, value2, "segmentName");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Long value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Long value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Long value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Long value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Long value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLike(Long value) {
            addCriterion("sales like", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotLike(Long value) {
            addCriterion("sales not like", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Long> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Long> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Long value1, Long value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Long value1, Long value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andDataYearIsNull() {
            addCriterion("data_year is null");
            return (Criteria) this;
        }

        public Criteria andDataYearIsNotNull() {
            addCriterion("data_year is not null");
            return (Criteria) this;
        }

        public Criteria andDataYearEqualTo(Integer value) {
            addCriterion("data_year =", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotEqualTo(Integer value) {
            addCriterion("data_year <>", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearGreaterThan(Integer value) {
            addCriterion("data_year >", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_year >=", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearLessThan(Integer value) {
            addCriterion("data_year <", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearLessThanOrEqualTo(Integer value) {
            addCriterion("data_year <=", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearLike(Integer value) {
            addCriterion("data_year like", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotLike(Integer value) {
            addCriterion("data_year not like", value, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearIn(List<Integer> values) {
            addCriterion("data_year in", values, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotIn(List<Integer> values) {
            addCriterion("data_year not in", values, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearBetween(Integer value1, Integer value2) {
            addCriterion("data_year between", value1, value2, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataYearNotBetween(Integer value1, Integer value2) {
            addCriterion("data_year not between", value1, value2, "dataYear");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNull() {
            addCriterion("data_month is null");
            return (Criteria) this;
        }

        public Criteria andDataMonthIsNotNull() {
            addCriterion("data_month is not null");
            return (Criteria) this;
        }

        public Criteria andDataMonthEqualTo(Integer value) {
            addCriterion("data_month =", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotEqualTo(Integer value) {
            addCriterion("data_month <>", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThan(Integer value) {
            addCriterion("data_month >", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_month >=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThan(Integer value) {
            addCriterion("data_month <", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLessThanOrEqualTo(Integer value) {
            addCriterion("data_month <=", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthLike(Integer value) {
            addCriterion("data_month like", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotLike(Integer value) {
            addCriterion("data_month not like", value, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthIn(List<Integer> values) {
            addCriterion("data_month in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotIn(List<Integer> values) {
            addCriterion("data_month not in", values, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthBetween(Integer value1, Integer value2) {
            addCriterion("data_month between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andDataMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("data_month not between", value1, value2, "dataMonth");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(Integer value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(Integer value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_daas_sales
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