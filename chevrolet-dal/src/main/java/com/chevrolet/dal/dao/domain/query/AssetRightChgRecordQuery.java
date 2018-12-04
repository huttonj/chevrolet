package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class AssetRightChgRecordQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public AssetRightChgRecordQuery() {
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
     * This class corresponds to the database table cc_asset_right_chg_record
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

        public Criteria andAssetRightChgRecordIdIsNull() {
            addCriterion("asset_right_chg_record_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdIsNotNull() {
            addCriterion("asset_right_chg_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdEqualTo(Long value) {
            addCriterion("asset_right_chg_record_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdNotEqualTo(Long value) {
            addCriterion("asset_right_chg_record_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anAssetRightChgRecordIdGreaterThan(Long value) {
            addCriterion("asset_right_chg_record_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("asset_right_chg_record_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdLessThan(Long value) {
            addCriterion("asset_right_chg_record_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("asset_right_chg_record_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdIn(List<Long> values) {
            addCriterion("asset_right_chg_record_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdNotIn(List<Long> values) {
            addCriterion("asset_right_chg_record_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdBetween(Long value1, Long value2) {
            addCriterion("asset_right_chg_record_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetRightChgRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("asset_right_chg_record_id not between", value1, value2, "id");
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

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Long value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Long value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Long value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Long value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Long value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLike(Long value) {
            addCriterion("partner_id like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotLike(Long value) {
            addCriterion("partner_id not like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Long> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Long> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Long value1, Long value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Long value1, Long value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("partner_name is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("partner_name =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("partner_name <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("partner_name >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("partner_name >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("partner_name <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("partner_name <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("partner_name like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("partner_name not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("partner_name in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("partner_name not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("partner_name between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("partner_name not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(Long value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(Long value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyIsNull() {
            addCriterion("receive_key is null");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyIsNotNull() {
            addCriterion("receive_key is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyEqualTo(String value) {
            addCriterion("receive_key =", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyNotEqualTo(String value) {
            addCriterion("receive_key <>", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyGreaterThan(String value) {
            addCriterion("receive_key >", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyGreaterThanOrEqualTo(String value) {
            addCriterion("receive_key >=", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyLessThan(String value) {
            addCriterion("receive_key <", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyLessThanOrEqualTo(String value) {
            addCriterion("receive_key <=", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyLike(String value) {
            addCriterion("receive_key like", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyNotLike(String value) {
            addCriterion("receive_key not like", value, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyIn(List<String> values) {
            addCriterion("receive_key in", values, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyNotIn(List<String> values) {
            addCriterion("receive_key not in", values, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyBetween(String value1, String value2) {
            addCriterion("receive_key between", value1, value2, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andReceiveKeyNotBetween(String value1, String value2) {
            addCriterion("receive_key not between", value1, value2, "receiveKey");
            return (Criteria) this;
        }

        public Criteria andCarIdListIsNull() {
            addCriterion("car_id_list is null");
            return (Criteria) this;
        }

        public Criteria andCarIdListIsNotNull() {
            addCriterion("car_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdListEqualTo(String value) {
            addCriterion("car_id_list =", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListNotEqualTo(String value) {
            addCriterion("car_id_list <>", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListGreaterThan(String value) {
            addCriterion("car_id_list >", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListGreaterThanOrEqualTo(String value) {
            addCriterion("car_id_list >=", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListLessThan(String value) {
            addCriterion("car_id_list <", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListLessThanOrEqualTo(String value) {
            addCriterion("car_id_list <=", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListLike(String value) {
            addCriterion("car_id_list like", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListNotLike(String value) {
            addCriterion("car_id_list not like", value, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListIn(List<String> values) {
            addCriterion("car_id_list in", values, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListNotIn(List<String> values) {
            addCriterion("car_id_list not in", values, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListBetween(String value1, String value2) {
            addCriterion("car_id_list between", value1, value2, "carIdList");
            return (Criteria) this;
        }

        public Criteria andCarIdListNotBetween(String value1, String value2) {
            addCriterion("car_id_list not between", value1, value2, "carIdList");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(Long value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(Long value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLike(Integer value) {
            addCriterion("record_status like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotLike(Integer value) {
            addCriterion("record_status not like", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(Date value) {
            addCriterion("sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(Date value) {
            addCriterion("sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLike(Date value) {
            addCriterion("confirm_time like", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotLike(Date value) {
            addCriterion("confirm_time not like", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table cc_asset_right_chg_record
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