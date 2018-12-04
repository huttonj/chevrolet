package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车辆信息接口调用历史 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午1:49 
 * @since V1.0 
 */
public class CarHisDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car_his.car_his_id
     * 主键ID
     */
    private Long carHisId;

    /**
     * database column cc_car_his.car_id
     * 车辆ID
     */
    private Long carId;

    /**
     * database column cc_car_his.brand_id
     * 品牌ID
     */
    private Long brandId;

    /**
     * database column cc_car_his.brand_name
     * 品牌名称
     */
    private String brandName;

    /**
     * database column cc_car_his.car_unique
     * 车架号
     */
    private String carUnique;

    /**
     * database column cc_car_his.inner_color_id
     * 内饰ID
     */
    private Long innerColorId;

    /**
     * database column cc_car_his.inner_color_name
     * 内饰名称
     */
    private String innerColorName;

    /**
     * database column cc_car_his.model_id
     * 车型ID
     */
    private Long modelId;

    /**
     * database column cc_car_his.model_name
     * 车型名称
     */
    private String modelName;

    /**
     * database column cc_car_his.odometer
     * 车辆里程
     */
    private String odometer;

    /**
     * database column cc_car_his.outer_color_id
     * 外饰ID
     */
    private Long outerColorId;

    /**
     * database column cc_car_his.outer_color_name
     * 外饰名称
     */
    private String outerColorName;

    /**
     * database column cc_car_his.series_id
     * 车系ID
     */
    private Long seriesId;

    /**
     * database column cc_car_his.series_name
     * 车系名称
     */
    private String seriesName;

    /**
     * database column cc_car_his.spec_id
     * 车规ID
     */
    private Integer specId;

    /**
     * database column cc_car_his.spec_name
     * 车规名称
     */
    private String specName;

    /**
     * database column cc_car_his.interface_name
     * 接口名称
     */
    private String interfaceName;

    /**
     * database column cc_car_his.remote_address
     * 调用方IP
     */
    private String remoteAddress;

    /**
     * database column cc_car_his.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_car_his.gmt_modified
     */
    private Date gmtModified;

    public Long getCarHisId() {
        return carHisId;
    }

    public void setCarHisId(Long carHisId) {
        this.carHisId = carHisId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
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

    public String getCarUnique() {
        return carUnique;
    }

    public void setCarUnique(String carUnique) {
        this.carUnique = carUnique;
    }

    public Long getInnerColorId() {
        return innerColorId;
    }

    public void setInnerColorId(Long innerColorId) {
        this.innerColorId = innerColorId;
    }

    public String getInnerColorName() {
        return innerColorName;
    }

    public void setInnerColorName(String innerColorName) {
        this.innerColorName = innerColorName;
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

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public Long getOuterColorId() {
        return outerColorId;
    }

    public void setOuterColorId(Long outerColorId) {
        this.outerColorId = outerColorId;
    }

    public String getOuterColorName() {
        return outerColorName;
    }

    public void setOuterColorName(String outerColorName) {
        this.outerColorName = outerColorName;
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

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
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