package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CarQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public CarQuery() {
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
     * This class corresponds to the database table cc_car
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

        public Criteria andImgBehindIsNull() {
            addCriterion("img_behind is null");
            return (Criteria) this;
        }

        public Criteria andImgBehindIsNotNull() {
            addCriterion("img_behind is not null");
            return (Criteria) this;
        }

        public Criteria andImgBehindEqualTo(String value) {
            addCriterion("img_behind =", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotEqualTo(String value) {
            addCriterion("img_behind <>", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindGreaterThan(String value) {
            addCriterion("img_behind >", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindGreaterThanOrEqualTo(String value) {
            addCriterion("img_behind >=", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLessThan(String value) {
            addCriterion("img_behind <", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLessThanOrEqualTo(String value) {
            addCriterion("img_behind <=", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindLike(String value) {
            addCriterion("img_behind like", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotLike(String value) {
            addCriterion("img_behind not like", value, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindIn(List<String> values) {
            addCriterion("img_behind in", values, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotIn(List<String> values) {
            addCriterion("img_behind not in", values, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindBetween(String value1, String value2) {
            addCriterion("img_behind between", value1, value2, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgBehindNotBetween(String value1, String value2) {
            addCriterion("img_behind not between", value1, value2, "imgBehind");
            return (Criteria) this;
        }

        public Criteria andImgDamageIsNull() {
            addCriterion("img_damage is null");
            return (Criteria) this;
        }

        public Criteria andImgDamageIsNotNull() {
            addCriterion("img_damage is not null");
            return (Criteria) this;
        }

        public Criteria andImgDamageEqualTo(String value) {
            addCriterion("img_damage =", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageNotEqualTo(String value) {
            addCriterion("img_damage <>", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageGreaterThan(String value) {
            addCriterion("img_damage >", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageGreaterThanOrEqualTo(String value) {
            addCriterion("img_damage >=", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageLessThan(String value) {
            addCriterion("img_damage <", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageLessThanOrEqualTo(String value) {
            addCriterion("img_damage <=", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageLike(String value) {
            addCriterion("img_damage like", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageNotLike(String value) {
            addCriterion("img_damage not like", value, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageIn(List<String> values) {
            addCriterion("img_damage in", values, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageNotIn(List<String> values) {
            addCriterion("img_damage not in", values, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageBetween(String value1, String value2) {
            addCriterion("img_damage between", value1, value2, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgDamageNotBetween(String value1, String value2) {
            addCriterion("img_damage not between", value1, value2, "imgDamage");
            return (Criteria) this;
        }

        public Criteria andImgFrontIsNull() {
            addCriterion("img_front is null");
            return (Criteria) this;
        }

        public Criteria andImgFrontIsNotNull() {
            addCriterion("img_front is not null");
            return (Criteria) this;
        }

        public Criteria andImgFrontEqualTo(String value) {
            addCriterion("img_front =", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotEqualTo(String value) {
            addCriterion("img_front <>", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontGreaterThan(String value) {
            addCriterion("img_front >", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontGreaterThanOrEqualTo(String value) {
            addCriterion("img_front >=", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLessThan(String value) {
            addCriterion("img_front <", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLessThanOrEqualTo(String value) {
            addCriterion("img_front <=", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontLike(String value) {
            addCriterion("img_front like", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotLike(String value) {
            addCriterion("img_front not like", value, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontIn(List<String> values) {
            addCriterion("img_front in", values, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotIn(List<String> values) {
            addCriterion("img_front not in", values, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontBetween(String value1, String value2) {
            addCriterion("img_front between", value1, value2, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgFrontNotBetween(String value1, String value2) {
            addCriterion("img_front not between", value1, value2, "imgFront");
            return (Criteria) this;
        }

        public Criteria andImgInteriorIsNull() {
            addCriterion("img_interior is null");
            return (Criteria) this;
        }

        public Criteria andImgInteriorIsNotNull() {
            addCriterion("img_interior is not null");
            return (Criteria) this;
        }

        public Criteria andImgInteriorEqualTo(String value) {
            addCriterion("img_interior =", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorNotEqualTo(String value) {
            addCriterion("img_interior <>", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorGreaterThan(String value) {
            addCriterion("img_interior >", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorGreaterThanOrEqualTo(String value) {
            addCriterion("img_interior >=", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorLessThan(String value) {
            addCriterion("img_interior <", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorLessThanOrEqualTo(String value) {
            addCriterion("img_interior <=", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorLike(String value) {
            addCriterion("img_interior like", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorNotLike(String value) {
            addCriterion("img_interior not like", value, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorIn(List<String> values) {
            addCriterion("img_interior in", values, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorNotIn(List<String> values) {
            addCriterion("img_interior not in", values, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorBetween(String value1, String value2) {
            addCriterion("img_interior between", value1, value2, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgInteriorNotBetween(String value1, String value2) {
            addCriterion("img_interior not between", value1, value2, "imgInterior");
            return (Criteria) this;
        }

        public Criteria andImgMileageIsNull() {
            addCriterion("img_mileage is null");
            return (Criteria) this;
        }

        public Criteria andImgMileageIsNotNull() {
            addCriterion("img_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andImgMileageEqualTo(String value) {
            addCriterion("img_mileage =", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageNotEqualTo(String value) {
            addCriterion("img_mileage <>", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageGreaterThan(String value) {
            addCriterion("img_mileage >", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageGreaterThanOrEqualTo(String value) {
            addCriterion("img_mileage >=", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageLessThan(String value) {
            addCriterion("img_mileage <", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageLessThanOrEqualTo(String value) {
            addCriterion("img_mileage <=", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageLike(String value) {
            addCriterion("img_mileage like", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageNotLike(String value) {
            addCriterion("img_mileage not like", value, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageIn(List<String> values) {
            addCriterion("img_mileage in", values, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageNotIn(List<String> values) {
            addCriterion("img_mileage not in", values, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageBetween(String value1, String value2) {
            addCriterion("img_mileage between", value1, value2, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgMileageNotBetween(String value1, String value2) {
            addCriterion("img_mileage not between", value1, value2, "imgMileage");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIsNull() {
            addCriterion("img_nameplate is null");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIsNotNull() {
            addCriterion("img_nameplate is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameplateEqualTo(String value) {
            addCriterion("img_nameplate =", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotEqualTo(String value) {
            addCriterion("img_nameplate <>", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateGreaterThan(String value) {
            addCriterion("img_nameplate >", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateGreaterThanOrEqualTo(String value) {
            addCriterion("img_nameplate >=", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLessThan(String value) {
            addCriterion("img_nameplate <", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLessThanOrEqualTo(String value) {
            addCriterion("img_nameplate <=", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateLike(String value) {
            addCriterion("img_nameplate like", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotLike(String value) {
            addCriterion("img_nameplate not like", value, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateIn(List<String> values) {
            addCriterion("img_nameplate in", values, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotIn(List<String> values) {
            addCriterion("img_nameplate not in", values, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateBetween(String value1, String value2) {
            addCriterion("img_nameplate between", value1, value2, "imgNameplate");
            return (Criteria) this;
        }

        public Criteria andImgNameplateNotBetween(String value1, String value2) {
            addCriterion("img_nameplate not between", value1, value2, "imgNameplate");
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

        public Criteria andProductionDateIsNull() {
            addCriterion("production_date is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("production_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(String value) {
            addCriterion("production_date =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(String value) {
            addCriterion("production_date <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(String value) {
            addCriterion("production_date >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(String value) {
            addCriterion("production_date >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(String value) {
            addCriterion("production_date <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(String value) {
            addCriterion("production_date <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLike(String value) {
            addCriterion("production_date like", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotLike(String value) {
            addCriterion("production_date not like", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<String> values) {
            addCriterion("production_date in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<String> values) {
            addCriterion("production_date not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(String value1, String value2) {
            addCriterion("production_date between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(String value1, String value2) {
            addCriterion("production_date not between", value1, value2, "productionDate");
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

        public Criteria andCarDescIsNull() {
            addCriterion("car_desc is null");
            return (Criteria) this;
        }

        public Criteria andCarDescIsNotNull() {
            addCriterion("car_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCarDescEqualTo(String value) {
            addCriterion("car_desc =", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescNotEqualTo(String value) {
            addCriterion("car_desc <>", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescGreaterThan(String value) {
            addCriterion("car_desc >", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescGreaterThanOrEqualTo(String value) {
            addCriterion("car_desc >=", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescLessThan(String value) {
            addCriterion("car_desc <", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescLessThanOrEqualTo(String value) {
            addCriterion("car_desc <=", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescLike(String value) {
            addCriterion("car_desc like", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescNotLike(String value) {
            addCriterion("car_desc not like", value, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescIn(List<String> values) {
            addCriterion("car_desc in", values, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescNotIn(List<String> values) {
            addCriterion("car_desc not in", values, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescBetween(String value1, String value2) {
            addCriterion("car_desc between", value1, value2, "carDesc");
            return (Criteria) this;
        }

        public Criteria andCarDescNotBetween(String value1, String value2) {
            addCriterion("car_desc not between", value1, value2, "carDesc");
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

        public Criteria andCarSourceIsNull() {
            addCriterion("car_source is null");
            return (Criteria) this;
        }

        public Criteria andCarSourceIsNotNull() {
            addCriterion("car_source is not null");
            return (Criteria) this;
        }

        public Criteria andCarSourceEqualTo(Integer value) {
            addCriterion("car_source =", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceNotEqualTo(Integer value) {
            addCriterion("car_source <>", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceGreaterThan(Integer value) {
            addCriterion("car_source >", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_source >=", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceLessThan(Integer value) {
            addCriterion("car_source <", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceLessThanOrEqualTo(Integer value) {
            addCriterion("car_source <=", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceLike(Integer value) {
            addCriterion("car_source like", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceNotLike(Integer value) {
            addCriterion("car_source not like", value, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceIn(List<Integer> values) {
            addCriterion("car_source in", values, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceNotIn(List<Integer> values) {
            addCriterion("car_source not in", values, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceBetween(Integer value1, Integer value2) {
            addCriterion("car_source between", value1, value2, "carSource");
            return (Criteria) this;
        }

        public Criteria andCarSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("car_source not between", value1, value2, "carSource");
            return (Criteria) this;
        }

        public Criteria andAssetRightIsNull() {
            addCriterion("asset_right is null");
            return (Criteria) this;
        }

        public Criteria andAssetRightIsNotNull() {
            addCriterion("asset_right is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRightEqualTo(Long value) {
            addCriterion("asset_right =", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightNotEqualTo(Long value) {
            addCriterion("asset_right <>", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightGreaterThan(Long value) {
            addCriterion("asset_right >", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightGreaterThanOrEqualTo(Long value) {
            addCriterion("asset_right >=", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightLessThan(Long value) {
            addCriterion("asset_right <", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightLessThanOrEqualTo(Long value) {
            addCriterion("asset_right <=", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightLike(Long value) {
            addCriterion("asset_right like", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightNotLike(Long value) {
            addCriterion("asset_right not like", value, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightIn(List<Long> values) {
            addCriterion("asset_right in", values, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightNotIn(List<Long> values) {
            addCriterion("asset_right not in", values, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightBetween(Long value1, Long value2) {
            addCriterion("asset_right between", value1, value2, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightNotBetween(Long value1, Long value2) {
            addCriterion("asset_right not between", value1, value2, "assetRight");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameIsNull() {
            addCriterion("asset_right_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameIsNotNull() {
            addCriterion("asset_right_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameEqualTo(String value) {
            addCriterion("asset_right_name =", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameNotEqualTo(String value) {
            addCriterion("asset_right_name <>", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameGreaterThan(String value) {
            addCriterion("asset_right_name >", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("asset_right_name >=", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameLessThan(String value) {
            addCriterion("asset_right_name <", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameLessThanOrEqualTo(String value) {
            addCriterion("asset_right_name <=", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameLike(String value) {
            addCriterion("asset_right_name like", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameNotLike(String value) {
            addCriterion("asset_right_name not like", value, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameIn(List<String> values) {
            addCriterion("asset_right_name in", values, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameNotIn(List<String> values) {
            addCriterion("asset_right_name not in", values, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameBetween(String value1, String value2) {
            addCriterion("asset_right_name between", value1, value2, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightNameNotBetween(String value1, String value2) {
            addCriterion("asset_right_name not between", value1, value2, "assetRightName");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeIsNull() {
            addCriterion("asset_right_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeIsNotNull() {
            addCriterion("asset_right_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeEqualTo(Integer value) {
            addCriterion("asset_right_type =", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeNotEqualTo(Integer value) {
            addCriterion("asset_right_type <>", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeGreaterThan(Integer value) {
            addCriterion("asset_right_type >", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_right_type >=", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeLessThan(Integer value) {
            addCriterion("asset_right_type <", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeLessThanOrEqualTo(Integer value) {
            addCriterion("asset_right_type <=", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeLike(Integer value) {
            addCriterion("asset_right_type like", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeNotLike(Integer value) {
            addCriterion("asset_right_type not like", value, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeIn(List<Integer> values) {
            addCriterion("asset_right_type in", values, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeNotIn(List<Integer> values) {
            addCriterion("asset_right_type not in", values, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeBetween(Integer value1, Integer value2) {
            addCriterion("asset_right_type between", value1, value2, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_right_type not between", value1, value2, "assetRightType");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeIsNull() {
            addCriterion("asset_right_in_change is null");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeIsNotNull() {
            addCriterion("asset_right_in_change is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeEqualTo(Integer value) {
            addCriterion("asset_right_in_change =", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeNotEqualTo(Integer value) {
            addCriterion("asset_right_in_change <>", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeGreaterThan(Integer value) {
            addCriterion("asset_right_in_change >", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_right_in_change >=", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeLessThan(Integer value) {
            addCriterion("asset_right_in_change <", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeLessThanOrEqualTo(Integer value) {
            addCriterion("asset_right_in_change <=", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeLike(Integer value) {
            addCriterion("asset_right_in_change like", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeNotLike(Integer value) {
            addCriterion("asset_right_in_change not like", value, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeIn(List<Integer> values) {
            addCriterion("asset_right_in_change in", values, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeNotIn(List<Integer> values) {
            addCriterion("asset_right_in_change not in", values, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeBetween(Integer value1, Integer value2) {
            addCriterion("asset_right_in_change between", value1, value2, "assetRightInChange");
            return (Criteria) this;
        }

        public Criteria andAssetRightInChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_right_in_change not between", value1, value2, "assetRightInChange");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_car
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