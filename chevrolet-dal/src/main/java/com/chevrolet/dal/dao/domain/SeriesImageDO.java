package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 车系图片 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午3:30
 * @since V1.0
 */
public class SeriesImageDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_series_image.color_id
     * 颜色ID
     */
    private Long colorId;

    /**
     * database column b2b_series_image.series_id
     * 车系ID
     */
    private Long seriesId;

    /**
     * database column b2b_series_image.color
     * 颜色名称
     */
    private String color;

    /**
     * database column b2b_series_image.color_url
     * 选色卡url
     */
    private String colorUrl;

    /**
     * database column b2b_series_image.car_url
     * 在线选车url
     */
    private String carUrl;

    /**
     * database column b2b_series_image.car_url_original
     * 在线选车url（不带水印）
     */
    private String carUrlOriginal;

    /**
     * database column b2b_series_image.detail_url
     * 详情url
     */
    private String detailUrl;

    /**
     * database column b2b_series_image.detail_url_original
     * 详情url（不带水印）
     */
    private String detailUrlOriginal;

    /**
     * database column b2b_series_image.center_url
     * 首页图片url
     */
    private String centerUrl;

    /**
     * database column b2b_series_image.type
     * 0为内饰，1为外观
     */
    private Integer type;

    /**
     * database column b2b_series_image.standard
     * 逗号隔开，0-国产，1-中规，2-美规，3-加规，4-中东，5-欧规，6-墨版
     */
    private String standard;

    /**
     * database column b2b_series_image.status
     */
    private Integer status;

    /**
     * database column b2b_series_image.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_series_image.gmt_modified
     */
    private Date gmtModified;

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorUrl() {
        return colorUrl;
    }

    public void setColorUrl(String colorUrl) {
        this.colorUrl = colorUrl;
    }

    public String getCarUrl() {
        return carUrl;
    }

    public void setCarUrl(String carUrl) {
        this.carUrl = carUrl;
    }

    public String getCarUrlOriginal() {
        return carUrlOriginal;
    }

    public void setCarUrlOriginal(String carUrlOriginal) {
        this.carUrlOriginal = carUrlOriginal;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getDetailUrlOriginal() {
        return detailUrlOriginal;
    }

    public void setDetailUrlOriginal(String detailUrlOriginal) {
        this.detailUrlOriginal = detailUrlOriginal;
    }

    public String getCenterUrl() {
        return centerUrl;
    }

    public void setCenterUrl(String centerUrl) {
        this.centerUrl = centerUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        if(gmtCreate == null){
            return null;
        }
        return (Date)gmtCreate.clone();
    }

    public void setGmtCreate(Date gmtCreate) {
        if(gmtCreate == null){
            this.gmtCreate = null;
        }else{
            this.gmtCreate = (Date)gmtCreate.clone();
        }
    }


    public Date getGmtModified() {
        if(gmtModified == null){
            return null;
        }
        return (Date)gmtModified.clone();
    }

    public void setGmtModified(Date gmtModified) {
        if(gmtModified == null){
            this.gmtModified = null;
        }else{
            this.gmtModified = (Date)gmtModified.clone();
        }
    }


}