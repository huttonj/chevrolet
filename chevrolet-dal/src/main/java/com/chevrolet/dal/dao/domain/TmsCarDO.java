package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车辆信息 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:53
 * @since V1.0 
 */
public class TmsCarDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_car.car_id
     */
    private Long carId;

    /**
     * database column tms_car.car_unique
     */
    private String carUnique;

    /**
     * database column tms_car.model_id
     */
    private Long modelId;

    /**
     * database column tms_car.model_name
     */
    private String modelName;

    /**
     * database column tms_car.inner_id
     */
    private Long innerId;

    /**
     * database column tms_car.outer_id
     */
    private Long outerId;

    /**
     * database column tms_car.outer_color_name
     */
    private String outerColorName;

    /**
     * database column tms_car.inner_color_name
     */
    private String innerColorName;

    /**
     * database column tms_car.brand_id
     */
    private Long brandId;

    /**
     * database column tms_car.brand_name
     */
    private String brandName;

    /**
     * database column tms_car.series_id
     */
    private Long seriesId;

    /**
     * database column tms_car.series_name
     */
    private String seriesName;

    /**
     * database column tms_car.spec_id
     */
    private Integer specId;

    /**
     * database column tms_car.spec_name
     */
    private String specName;

    /**
     * database column tms_car.guide_price
     */
    private String guidePrice;

    /**
     * database column tms_car.market_price
     */
    private String marketPrice;

    /**
     * database column tms_car.emission
     */
    private String emission;

    /**
     * database column tms_car.attach
     */
    private Integer attach;

    /**
     * database column tms_car.status
     */
    private Integer status;

    /**
     * database column tms_car.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column tms_car.gmt_create
     */
    private Date gmtCreate;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarUnique() {
        return carUnique;
    }

    public void setCarUnique(String carUnique) {
        this.carUnique = carUnique;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getInnerId() {
        return innerId;
    }

    public void setInnerId(Long innerId) {
        this.innerId = innerId;
    }

    public Long getOuterId() {
        return outerId;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    public String getOuterColorName() {
        return outerColorName;
    }

    public void setOuterColorName(String outerColorName) {
        this.outerColorName = outerColorName;
    }

    public String getInnerColorName() {
        return innerColorName;
    }

    public void setInnerColorName(String innerColorName) {
        this.innerColorName = innerColorName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public Integer getAttach() {
        return attach;
    }

    public void setAttach(Integer attach) {
        this.attach = attach;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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


}