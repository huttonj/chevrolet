package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 车辆中心 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午11:27
 * @since V1.0
 */
public class CarDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car.car_id
     * 主键ID
     */
    private Long carId;

    /**
     * database column cc_car.brand_id
     * 品牌ID
     */
    private Long brandId;

    /**
     * database column cc_car.brand_name
     * 品牌名称
     */
    private String brandName;

    /**
     * database column cc_car.car_unique
     * 车架号
     */
    private String carUnique;

    /**
     * database column cc_car.emission
     * 排放量
     */
    private String emission;

    /**
     * database column cc_car.img_behind
     * 后45度照片
     */
    private String imgBehind;

    /**
     * database column cc_car.img_damage
     * 损伤照片
     */
    private String imgDamage;

    /**
     * database column cc_car.img_front
     * 前45度照片
     */
    private String imgFront;

    /**
     * database column cc_car.img_interior
     * 内饰照片
     */
    private String imgInterior;

    /**
     * database column cc_car.img_mileage
     * 里程照片
     */
    private String imgMileage;

    /**
     * database column cc_car.img_nameplate
     * 铭牌照片
     */
    private String imgNameplate;

    /**
     * database column cc_car.inner_color_id
     * 内饰ID
     */
    private Long innerColorId;

    /**
     * database column cc_car.inner_color_name
     * 内饰名称
     */
    private String innerColorName;

    /**
     * database column cc_car.model_id
     * 车型ID
     */
    private Long modelId;

    /**
     * database column cc_car.model_name
     * 车型名称
     */
    private String modelName;

    /**
     * database column cc_car.odometer
     * 车辆里程
     */
    private String odometer;

    /**
     * database column cc_car.outer_color_id
     * 外饰ID
     */
    private Long outerColorId;

    /**
     * database column cc_car.outer_color_name
     * 外饰名称
     */
    private String outerColorName;

    /**
     * database column cc_car.production_date
     * 生产日期
     */
    private String productionDate;

    /**
     * database column cc_car.series_id
     * 车系ID
     */
    private Long seriesId;

    /**
     * database column cc_car.series_name
     * 车系名称
     */
    private String seriesName;

    /**
     * database column cc_car.spec_id
     * 车规ID
     */
    private Integer specId;

    /**
     * database column cc_car.spec_name
     * 车规名称
     */
    private String specName;

    /**
     * database column cc_car.car_desc
     * 车辆描述
     */
    private String carDesc;

    /**
     * database column cc_car.guide_price
     * 厂方指导价(单位：万元)
     */
    private String guidePrice;

    /**
     * database column cc_car.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_car.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_car.is_deleted
     * 有效字段
     */
    private Integer isDeleted;

    /**
     * database column cc_car.car_source
     * 车辆来源
     */
    private Integer carSource;

    /**
     * database column cc_car.asset_right
     * 物权归属 -1：平台 ，-2：未知，其余为partner表主键
     */
    private Long assetRight;

    /**
     * database column cc_car.asset_right_name
     * 物权归属名或者备注
     */
    private String assetRightName;

    /**
     * database column cc_car.asset_right_type
     * 物权归属类型：1 个人 2企业
     */
    private Integer assetRightType;

    /**
     * database column cc_car.asset_right_in_change
     * 物权变更状态：0非变更中  1物权变更中
     */
    private Integer assetRightInChange;

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

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public String getImgBehind() {
        return imgBehind;
    }

    public void setImgBehind(String imgBehind) {
        this.imgBehind = imgBehind;
    }

    public String getImgDamage() {
        return imgDamage;
    }

    public void setImgDamage(String imgDamage) {
        this.imgDamage = imgDamage;
    }

    public String getImgFront() {
        return imgFront;
    }

    public void setImgFront(String imgFront) {
        this.imgFront = imgFront;
    }

    public String getImgInterior() {
        return imgInterior;
    }

    public void setImgInterior(String imgInterior) {
        this.imgInterior = imgInterior;
    }

    public String getImgMileage() {
        return imgMileage;
    }

    public void setImgMileage(String imgMileage) {
        this.imgMileage = imgMileage;
    }

    public String getImgNameplate() {
        return imgNameplate;
    }

    public void setImgNameplate(String imgNameplate) {
        this.imgNameplate = imgNameplate;
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

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
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

    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
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


    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getCarSource() {
        return carSource;
    }

    public void setCarSource(Integer carSource) {
        this.carSource = carSource;
    }

    public Long getAssetRight() {
        return assetRight;
    }

    public void setAssetRight(Long assetRight) {
        this.assetRight = assetRight;
    }

    public String getAssetRightName() {
        return assetRightName;
    }

    public void setAssetRightName(String assetRightName) {
        this.assetRightName = assetRightName;
    }

    public Integer getAssetRightType() {
        return assetRightType;
    }

    public void setAssetRightType(Integer assetRightType) {
        this.assetRightType = assetRightType;
    }

    public Integer getAssetRightInChange() {
        return assetRightInChange;
    }

    public void setAssetRightInChange(Integer assetRightInChange) {
        this.assetRightInChange = assetRightInChange;
    }

}