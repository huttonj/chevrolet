package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class DaasOnlinePriceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_daas_online_price.daas_online_price_id
     */
    private Long daasOnlinePriceId;

    /**
     * database column cc_daas_online_price.version_id
     */
    private Long versionId;

    /**
     * database column cc_daas_online_price.version_full_name
     */
    private String versionFullName;

    /**
     * database column cc_daas_online_price.brand_id
     */
    private Long brandId;

    /**
     * database column cc_daas_online_price.brand_name
     */
    private String brandName;

    /**
     * database column cc_daas_online_price.sub_model_id
     */
    private Long subModelId;

    /**
     * database column cc_daas_online_price.sub_model_name
     */
    private String subModelName;

    /**
     * database column cc_daas_online_price.manf_id
     */
    private Long manfId;

    /**
     * database column cc_daas_online_price.manf_name
     */
    private String manfName;

    /**
     * database column cc_daas_online_price.engine_type_id
     */
    private Long engineTypeId;

    /**
     * database column cc_daas_online_price.engine_type_name
     */
    private String engineTypeName;

    /**
     * database column cc_daas_online_price.tran_type_id
     */
    private Long tranTypeId;

    /**
     * database column cc_daas_online_price.tran_type_name
     */
    private String tranTypeName;

    /**
     * database column cc_daas_online_price.model_year
     */
    private String modelYear;

    /**
     * database column cc_daas_online_price.province_id
     */
    private Long provinceId;

    /**
     * database column cc_daas_online_price.province_name
     */
    private String provinceName;

    /**
     * database column cc_daas_online_price.city_id
     */
    private Long cityId;

    /**
     * database column cc_daas_online_price.city_name
     */
    private String cityName;

    /**
     * database column cc_daas_online_price.msrp
     */
    private String msrp;

    /**
     * database column cc_daas_online_price.sale_price
     */
    private String salePrice;

    /**
     * database column cc_daas_online_price.data_year
     */
    private Integer dataYear;

    /**
     * database column cc_daas_online_price.data_month
     */
    private Integer dataMonth;

    /**
     * database column cc_daas_online_price.data_week
     */
    private Integer dataWeek;

    /**
     * database column cc_daas_online_price.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_daas_online_price.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_daas_online_price.is_deleted
     */
    private Integer isDeleted;

    public Long getDaasOnlinePriceId() {
        return daasOnlinePriceId;
    }

    public void setDaasOnlinePriceId(Long daasOnlinePriceId) {
        this.daasOnlinePriceId = daasOnlinePriceId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getVersionFullName() {
        return versionFullName;
    }

    public void setVersionFullName(String versionFullName) {
        this.versionFullName = versionFullName;
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

    public Long getSubModelId() {
        return subModelId;
    }

    public void setSubModelId(Long subModelId) {
        this.subModelId = subModelId;
    }

    public String getSubModelName() {
        return subModelName;
    }

    public void setSubModelName(String subModelName) {
        this.subModelName = subModelName;
    }

    public Long getManfId() {
        return manfId;
    }

    public void setManfId(Long manfId) {
        this.manfId = manfId;
    }

    public String getManfName() {
        return manfName;
    }

    public void setManfName(String manfName) {
        this.manfName = manfName;
    }

    public Long getEngineTypeId() {
        return engineTypeId;
    }

    public void setEngineTypeId(Long engineTypeId) {
        this.engineTypeId = engineTypeId;
    }

    public String getEngineTypeName() {
        return engineTypeName;
    }

    public void setEngineTypeName(String engineTypeName) {
        this.engineTypeName = engineTypeName;
    }

    public Long getTranTypeId() {
        return tranTypeId;
    }

    public void setTranTypeId(Long tranTypeId) {
        this.tranTypeId = tranTypeId;
    }

    public String getTranTypeName() {
        return tranTypeName;
    }

    public void setTranTypeName(String tranTypeName) {
        this.tranTypeName = tranTypeName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getDataYear() {
        return dataYear;
    }

    public void setDataYear(Integer dataYear) {
        this.dataYear = dataYear;
    }

    public Integer getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(Integer dataMonth) {
        this.dataMonth = dataMonth;
    }

    public Integer getDataWeek() {
        return dataWeek;
    }

    public void setDataWeek(Integer dataWeek) {
        this.dataWeek = dataWeek;
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

}