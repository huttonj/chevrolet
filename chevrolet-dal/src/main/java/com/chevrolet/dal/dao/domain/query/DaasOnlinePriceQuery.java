package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class DaasOnlinePriceQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public DaasOnlinePriceQuery() {
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
     * This class corresponds to the database table cc_daas_online_price
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

        public Criteria andDaasOnlinePriceIdIsNull() {
            addCriterion("daas_online_price_id is null");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdIsNotNull() {
            addCriterion("daas_online_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdEqualTo(Long value) {
            addCriterion("daas_online_price_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdNotEqualTo(Long value) {
            addCriterion("daas_online_price_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anDaasOnlinePriceIdGreaterThan(Long value) {
            addCriterion("daas_online_price_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("daas_online_price_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdLessThan(Long value) {
            addCriterion("daas_online_price_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdLessThanOrEqualTo(Long value) {
            addCriterion("daas_online_price_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdIn(List<Long> values) {
            addCriterion("daas_online_price_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdNotIn(List<Long> values) {
            addCriterion("daas_online_price_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdBetween(Long value1, Long value2) {
            addCriterion("daas_online_price_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDaasOnlinePriceIdNotBetween(Long value1, Long value2) {
            addCriterion("daas_online_price_id not between", value1, value2, "id");
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

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Long value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Long value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Long value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Long value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Long value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLike(Long value) {
            addCriterion("version_id like", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotLike(Long value) {
            addCriterion("version_id not like", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Long> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Long> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Long value1, Long value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Long value1, Long value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameIsNull() {
            addCriterion("version_full_name is null");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameIsNotNull() {
            addCriterion("version_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameEqualTo(String value) {
            addCriterion("version_full_name =", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameNotEqualTo(String value) {
            addCriterion("version_full_name <>", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameGreaterThan(String value) {
            addCriterion("version_full_name >", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("version_full_name >=", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameLessThan(String value) {
            addCriterion("version_full_name <", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameLessThanOrEqualTo(String value) {
            addCriterion("version_full_name <=", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameLike(String value) {
            addCriterion("version_full_name like", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameNotLike(String value) {
            addCriterion("version_full_name not like", value, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameIn(List<String> values) {
            addCriterion("version_full_name in", values, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameNotIn(List<String> values) {
            addCriterion("version_full_name not in", values, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameBetween(String value1, String value2) {
            addCriterion("version_full_name between", value1, value2, "versionFullName");
            return (Criteria) this;
        }

        public Criteria andVersionFullNameNotBetween(String value1, String value2) {
            addCriterion("version_full_name not between", value1, value2, "versionFullName");
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

        public Criteria andEngineTypeIdIsNull() {
            addCriterion("engine_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdIsNotNull() {
            addCriterion("engine_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdEqualTo(Long value) {
            addCriterion("engine_type_id =", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdNotEqualTo(Long value) {
            addCriterion("engine_type_id <>", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdGreaterThan(Long value) {
            addCriterion("engine_type_id >", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("engine_type_id >=", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdLessThan(Long value) {
            addCriterion("engine_type_id <", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("engine_type_id <=", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdLike(Long value) {
            addCriterion("engine_type_id like", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdNotLike(Long value) {
            addCriterion("engine_type_id not like", value, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdIn(List<Long> values) {
            addCriterion("engine_type_id in", values, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdNotIn(List<Long> values) {
            addCriterion("engine_type_id not in", values, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdBetween(Long value1, Long value2) {
            addCriterion("engine_type_id between", value1, value2, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("engine_type_id not between", value1, value2, "engineTypeId");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameIsNull() {
            addCriterion("engine_type_name is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameIsNotNull() {
            addCriterion("engine_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameEqualTo(String value) {
            addCriterion("engine_type_name =", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameNotEqualTo(String value) {
            addCriterion("engine_type_name <>", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameGreaterThan(String value) {
            addCriterion("engine_type_name >", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("engine_type_name >=", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameLessThan(String value) {
            addCriterion("engine_type_name <", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameLessThanOrEqualTo(String value) {
            addCriterion("engine_type_name <=", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameLike(String value) {
            addCriterion("engine_type_name like", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameNotLike(String value) {
            addCriterion("engine_type_name not like", value, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameIn(List<String> values) {
            addCriterion("engine_type_name in", values, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameNotIn(List<String> values) {
            addCriterion("engine_type_name not in", values, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameBetween(String value1, String value2) {
            addCriterion("engine_type_name between", value1, value2, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNameNotBetween(String value1, String value2) {
            addCriterion("engine_type_name not between", value1, value2, "engineTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdIsNull() {
            addCriterion("tran_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdIsNotNull() {
            addCriterion("tran_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdEqualTo(Long value) {
            addCriterion("tran_type_id =", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdNotEqualTo(Long value) {
            addCriterion("tran_type_id <>", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdGreaterThan(Long value) {
            addCriterion("tran_type_id >", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tran_type_id >=", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdLessThan(Long value) {
            addCriterion("tran_type_id <", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("tran_type_id <=", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdLike(Long value) {
            addCriterion("tran_type_id like", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdNotLike(Long value) {
            addCriterion("tran_type_id not like", value, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdIn(List<Long> values) {
            addCriterion("tran_type_id in", values, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdNotIn(List<Long> values) {
            addCriterion("tran_type_id not in", values, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdBetween(Long value1, Long value2) {
            addCriterion("tran_type_id between", value1, value2, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("tran_type_id not between", value1, value2, "tranTypeId");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameIsNull() {
            addCriterion("tran_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameIsNotNull() {
            addCriterion("tran_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameEqualTo(String value) {
            addCriterion("tran_type_name =", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameNotEqualTo(String value) {
            addCriterion("tran_type_name <>", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameGreaterThan(String value) {
            addCriterion("tran_type_name >", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("tran_type_name >=", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameLessThan(String value) {
            addCriterion("tran_type_name <", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameLessThanOrEqualTo(String value) {
            addCriterion("tran_type_name <=", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameLike(String value) {
            addCriterion("tran_type_name like", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameNotLike(String value) {
            addCriterion("tran_type_name not like", value, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameIn(List<String> values) {
            addCriterion("tran_type_name in", values, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameNotIn(List<String> values) {
            addCriterion("tran_type_name not in", values, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameBetween(String value1, String value2) {
            addCriterion("tran_type_name between", value1, value2, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andTranTypeNameNotBetween(String value1, String value2) {
            addCriterion("tran_type_name not between", value1, value2, "tranTypeName");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNull() {
            addCriterion("model_year is null");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNotNull() {
            addCriterion("model_year is not null");
            return (Criteria) this;
        }

        public Criteria andModelYearEqualTo(String value) {
            addCriterion("model_year =", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotEqualTo(String value) {
            addCriterion("model_year <>", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThan(String value) {
            addCriterion("model_year >", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThanOrEqualTo(String value) {
            addCriterion("model_year >=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThan(String value) {
            addCriterion("model_year <", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThanOrEqualTo(String value) {
            addCriterion("model_year <=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLike(String value) {
            addCriterion("model_year like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotLike(String value) {
            addCriterion("model_year not like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearIn(List<String> values) {
            addCriterion("model_year in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotIn(List<String> values) {
            addCriterion("model_year not in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearBetween(String value1, String value2) {
            addCriterion("model_year between", value1, value2, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotBetween(String value1, String value2) {
            addCriterion("model_year not between", value1, value2, "modelYear");
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

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
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

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andMsrpIsNull() {
            addCriterion("msrp is null");
            return (Criteria) this;
        }

        public Criteria andMsrpIsNotNull() {
            addCriterion("msrp is not null");
            return (Criteria) this;
        }

        public Criteria andMsrpEqualTo(String value) {
            addCriterion("msrp =", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotEqualTo(String value) {
            addCriterion("msrp <>", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpGreaterThan(String value) {
            addCriterion("msrp >", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpGreaterThanOrEqualTo(String value) {
            addCriterion("msrp >=", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpLessThan(String value) {
            addCriterion("msrp <", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpLessThanOrEqualTo(String value) {
            addCriterion("msrp <=", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpLike(String value) {
            addCriterion("msrp like", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotLike(String value) {
            addCriterion("msrp not like", value, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpIn(List<String> values) {
            addCriterion("msrp in", values, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotIn(List<String> values) {
            addCriterion("msrp not in", values, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpBetween(String value1, String value2) {
            addCriterion("msrp between", value1, value2, "msrp");
            return (Criteria) this;
        }

        public Criteria andMsrpNotBetween(String value1, String value2) {
            addCriterion("msrp not between", value1, value2, "msrp");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(String value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(String value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(String value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(String value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(String value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLike(String value) {
            addCriterion("sale_price like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotLike(String value) {
            addCriterion("sale_price not like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<String> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<String> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(String value1, String value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(String value1, String value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
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

        public Criteria andDataWeekIsNull() {
            addCriterion("data_week is null");
            return (Criteria) this;
        }

        public Criteria andDataWeekIsNotNull() {
            addCriterion("data_week is not null");
            return (Criteria) this;
        }

        public Criteria andDataWeekEqualTo(Integer value) {
            addCriterion("data_week =", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekNotEqualTo(Integer value) {
            addCriterion("data_week <>", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekGreaterThan(Integer value) {
            addCriterion("data_week >", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_week >=", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekLessThan(Integer value) {
            addCriterion("data_week <", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekLessThanOrEqualTo(Integer value) {
            addCriterion("data_week <=", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekLike(Integer value) {
            addCriterion("data_week like", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekNotLike(Integer value) {
            addCriterion("data_week not like", value, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekIn(List<Integer> values) {
            addCriterion("data_week in", values, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekNotIn(List<Integer> values) {
            addCriterion("data_week not in", values, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekBetween(Integer value1, Integer value2) {
            addCriterion("data_week between", value1, value2, "dataWeek");
            return (Criteria) this;
        }

        public Criteria andDataWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("data_week not between", value1, value2, "dataWeek");
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
     * This class corresponds to the database table cc_daas_online_price
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