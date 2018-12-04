package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class BrandQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public BrandQuery() {
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
     * This class corresponds to the database table b2b_brand
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "id");
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

        public Criteria andBrandLetterIsNull() {
            addCriterion("brand_letter is null");
            return (Criteria) this;
        }

        public Criteria andBrandLetterIsNotNull() {
            addCriterion("brand_letter is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLetterEqualTo(String value) {
            addCriterion("brand_letter =", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterNotEqualTo(String value) {
            addCriterion("brand_letter <>", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterGreaterThan(String value) {
            addCriterion("brand_letter >", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterGreaterThanOrEqualTo(String value) {
            addCriterion("brand_letter >=", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterLessThan(String value) {
            addCriterion("brand_letter <", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterLessThanOrEqualTo(String value) {
            addCriterion("brand_letter <=", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterLike(String value) {
            addCriterion("brand_letter like", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterNotLike(String value) {
            addCriterion("brand_letter not like", value, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterIn(List<String> values) {
            addCriterion("brand_letter in", values, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterNotIn(List<String> values) {
            addCriterion("brand_letter not in", values, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterBetween(String value1, String value2) {
            addCriterion("brand_letter between", value1, value2, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandLetterNotBetween(String value1, String value2) {
            addCriterion("brand_letter not between", value1, value2, "brandLetter");
            return (Criteria) this;
        }

        public Criteria andBrandPicIsNull() {
            addCriterion("brand_pic is null");
            return (Criteria) this;
        }

        public Criteria andBrandPicIsNotNull() {
            addCriterion("brand_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPicEqualTo(String value) {
            addCriterion("brand_pic =", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotEqualTo(String value) {
            addCriterion("brand_pic <>", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicGreaterThan(String value) {
            addCriterion("brand_pic >", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicGreaterThanOrEqualTo(String value) {
            addCriterion("brand_pic >=", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLessThan(String value) {
            addCriterion("brand_pic <", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLessThanOrEqualTo(String value) {
            addCriterion("brand_pic <=", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLike(String value) {
            addCriterion("brand_pic like", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotLike(String value) {
            addCriterion("brand_pic not like", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicIn(List<String> values) {
            addCriterion("brand_pic in", values, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotIn(List<String> values) {
            addCriterion("brand_pic not in", values, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicBetween(String value1, String value2) {
            addCriterion("brand_pic between", value1, value2, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotBetween(String value1, String value2) {
            addCriterion("brand_pic not between", value1, value2, "brandPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNull() {
            addCriterion("small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNotNull() {
            addCriterion("small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSmallPicEqualTo(String value) {
            addCriterion("small_pic =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThan(String value) {
            addCriterion("small_pic >", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic >=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThan(String value) {
            addCriterion("small_pic <", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLike(String value) {
            addCriterion("small_pic like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotLike(String value) {
            addCriterion("small_pic not like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIn(List<String> values) {
            addCriterion("small_pic in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotIn(List<String> values) {
            addCriterion("small_pic not in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "smallPic");
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

        public Criteria andBrandTypeIsNull() {
            addCriterion("brand_type is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNotNull() {
            addCriterion("brand_type is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeEqualTo(Integer value) {
            addCriterion("brand_type =", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotEqualTo(Integer value) {
            addCriterion("brand_type <>", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThan(Integer value) {
            addCriterion("brand_type >", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_type >=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThan(Integer value) {
            addCriterion("brand_type <", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThanOrEqualTo(Integer value) {
            addCriterion("brand_type <=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLike(Integer value) {
            addCriterion("brand_type like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotLike(Integer value) {
            addCriterion("brand_type not like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIn(List<Integer> values) {
            addCriterion("brand_type in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotIn(List<Integer> values) {
            addCriterion("brand_type not in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeBetween(Integer value1, Integer value2) {
            addCriterion("brand_type between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_type not between", value1, value2, "brandType");
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

        public Criteria andOuterIdEqualTo(String value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(String value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(String value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(String value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(String value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(String value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(String value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<String> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<String> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(String value1, String value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(String value1, String value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(Integer value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(Integer value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(Integer value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(Integer value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCarsNumberIsNull() {
            addCriterion("cars_number is null");
            return (Criteria) this;
        }

        public Criteria andCarsNumberIsNotNull() {
            addCriterion("cars_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarsNumberEqualTo(Long value) {
            addCriterion("cars_number =", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberNotEqualTo(Long value) {
            addCriterion("cars_number <>", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberGreaterThan(Long value) {
            addCriterion("cars_number >", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("cars_number >=", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberLessThan(Long value) {
            addCriterion("cars_number <", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberLessThanOrEqualTo(Long value) {
            addCriterion("cars_number <=", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberLike(Long value) {
            addCriterion("cars_number like", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberNotLike(Long value) {
            addCriterion("cars_number not like", value, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberIn(List<Long> values) {
            addCriterion("cars_number in", values, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberNotIn(List<Long> values) {
            addCriterion("cars_number not in", values, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberBetween(Long value1, Long value2) {
            addCriterion("cars_number between", value1, value2, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andCarsNumberNotBetween(Long value1, Long value2) {
            addCriterion("cars_number not between", value1, value2, "carsNumber");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(Integer value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(Integer value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table b2b_brand
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