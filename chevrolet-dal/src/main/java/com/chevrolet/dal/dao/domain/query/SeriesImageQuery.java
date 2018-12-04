package com.chevrolet.dal.dao.domain.query;


import com.subaru.common.query.BaseCriteria;
import com.subaru.common.query.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class SeriesImageQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public SeriesImageQuery() {
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
     * This class corresponds to the database table b2b_series_image
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

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Long value) {
            addCriterion("color_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Long value) {
            addCriterion("color_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anColorIdGreaterThan(Long value) {
            addCriterion("color_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("color_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Long value) {
            addCriterion("color_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Long value) {
            addCriterion("color_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Long> values) {
            addCriterion("color_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Long> values) {
            addCriterion("color_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Long value1, Long value2) {
            addCriterion("color_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Long value1, Long value2) {
            addCriterion("color_id not between", value1, value2, "id");
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

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorUrlIsNull() {
            addCriterion("color_url is null");
            return (Criteria) this;
        }

        public Criteria andColorUrlIsNotNull() {
            addCriterion("color_url is not null");
            return (Criteria) this;
        }

        public Criteria andColorUrlEqualTo(String value) {
            addCriterion("color_url =", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlNotEqualTo(String value) {
            addCriterion("color_url <>", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlGreaterThan(String value) {
            addCriterion("color_url >", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("color_url >=", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlLessThan(String value) {
            addCriterion("color_url <", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlLessThanOrEqualTo(String value) {
            addCriterion("color_url <=", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlLike(String value) {
            addCriterion("color_url like", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlNotLike(String value) {
            addCriterion("color_url not like", value, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlIn(List<String> values) {
            addCriterion("color_url in", values, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlNotIn(List<String> values) {
            addCriterion("color_url not in", values, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlBetween(String value1, String value2) {
            addCriterion("color_url between", value1, value2, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andColorUrlNotBetween(String value1, String value2) {
            addCriterion("color_url not between", value1, value2, "colorUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlIsNull() {
            addCriterion("car_url is null");
            return (Criteria) this;
        }

        public Criteria andCarUrlIsNotNull() {
            addCriterion("car_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarUrlEqualTo(String value) {
            addCriterion("car_url =", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlNotEqualTo(String value) {
            addCriterion("car_url <>", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlGreaterThan(String value) {
            addCriterion("car_url >", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("car_url >=", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlLessThan(String value) {
            addCriterion("car_url <", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlLessThanOrEqualTo(String value) {
            addCriterion("car_url <=", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlLike(String value) {
            addCriterion("car_url like", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlNotLike(String value) {
            addCriterion("car_url not like", value, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlIn(List<String> values) {
            addCriterion("car_url in", values, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlNotIn(List<String> values) {
            addCriterion("car_url not in", values, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlBetween(String value1, String value2) {
            addCriterion("car_url between", value1, value2, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlNotBetween(String value1, String value2) {
            addCriterion("car_url not between", value1, value2, "carUrl");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalIsNull() {
            addCriterion("car_url_original is null");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalIsNotNull() {
            addCriterion("car_url_original is not null");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalEqualTo(String value) {
            addCriterion("car_url_original =", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalNotEqualTo(String value) {
            addCriterion("car_url_original <>", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalGreaterThan(String value) {
            addCriterion("car_url_original >", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("car_url_original >=", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalLessThan(String value) {
            addCriterion("car_url_original <", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalLessThanOrEqualTo(String value) {
            addCriterion("car_url_original <=", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalLike(String value) {
            addCriterion("car_url_original like", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalNotLike(String value) {
            addCriterion("car_url_original not like", value, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalIn(List<String> values) {
            addCriterion("car_url_original in", values, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalNotIn(List<String> values) {
            addCriterion("car_url_original not in", values, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalBetween(String value1, String value2) {
            addCriterion("car_url_original between", value1, value2, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCarUrlOriginalNotBetween(String value1, String value2) {
            addCriterion("car_url_original not between", value1, value2, "carUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNull() {
            addCriterion("detail_url is null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNotNull() {
            addCriterion("detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlEqualTo(String value) {
            addCriterion("detail_url =", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotEqualTo(String value) {
            addCriterion("detail_url <>", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThan(String value) {
            addCriterion("detail_url >", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url >=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThan(String value) {
            addCriterion("detail_url <", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("detail_url <=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLike(String value) {
            addCriterion("detail_url like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotLike(String value) {
            addCriterion("detail_url not like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIn(List<String> values) {
            addCriterion("detail_url in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotIn(List<String> values) {
            addCriterion("detail_url not in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlBetween(String value1, String value2) {
            addCriterion("detail_url between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotBetween(String value1, String value2) {
            addCriterion("detail_url not between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalIsNull() {
            addCriterion("detail_url_original is null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalIsNotNull() {
            addCriterion("detail_url_original is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalEqualTo(String value) {
            addCriterion("detail_url_original =", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalNotEqualTo(String value) {
            addCriterion("detail_url_original <>", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalGreaterThan(String value) {
            addCriterion("detail_url_original >", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url_original >=", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalLessThan(String value) {
            addCriterion("detail_url_original <", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalLessThanOrEqualTo(String value) {
            addCriterion("detail_url_original <=", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalLike(String value) {
            addCriterion("detail_url_original like", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalNotLike(String value) {
            addCriterion("detail_url_original not like", value, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalIn(List<String> values) {
            addCriterion("detail_url_original in", values, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalNotIn(List<String> values) {
            addCriterion("detail_url_original not in", values, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalBetween(String value1, String value2) {
            addCriterion("detail_url_original between", value1, value2, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andDetailUrlOriginalNotBetween(String value1, String value2) {
            addCriterion("detail_url_original not between", value1, value2, "detailUrlOriginal");
            return (Criteria) this;
        }

        public Criteria andCenterUrlIsNull() {
            addCriterion("center_url is null");
            return (Criteria) this;
        }

        public Criteria andCenterUrlIsNotNull() {
            addCriterion("center_url is not null");
            return (Criteria) this;
        }

        public Criteria andCenterUrlEqualTo(String value) {
            addCriterion("center_url =", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlNotEqualTo(String value) {
            addCriterion("center_url <>", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlGreaterThan(String value) {
            addCriterion("center_url >", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("center_url >=", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlLessThan(String value) {
            addCriterion("center_url <", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlLessThanOrEqualTo(String value) {
            addCriterion("center_url <=", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlLike(String value) {
            addCriterion("center_url like", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlNotLike(String value) {
            addCriterion("center_url not like", value, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlIn(List<String> values) {
            addCriterion("center_url in", values, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlNotIn(List<String> values) {
            addCriterion("center_url not in", values, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlBetween(String value1, String value2) {
            addCriterion("center_url between", value1, value2, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andCenterUrlNotBetween(String value1, String value2) {
            addCriterion("center_url not between", value1, value2, "centerUrl");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(Integer value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(Integer value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
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
     * This class corresponds to the database table b2b_series_image
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