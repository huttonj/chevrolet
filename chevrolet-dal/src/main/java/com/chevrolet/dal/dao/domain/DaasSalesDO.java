package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class DaasSalesDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_daas_sales.daas_sales_id
     */
    private Long daasSalesId;

    /**
     * database column cc_daas_sales.manf_id
     */
    private Long manfId;

    /**
     * database column cc_daas_sales.manf_name
     */
    private String manfName;

    /**
     * database column cc_daas_sales.brand_id
     */
    private Long brandId;

    /**
     * database column cc_daas_sales.brand_name
     */
    private String brandName;

    /**
     * database column cc_daas_sales.sub_model_id
     */
    private Long subModelId;

    /**
     * database column cc_daas_sales.sub_model_name
     */
    private String subModelName;

    /**
     * database column cc_daas_sales.segment_id
     */
    private Long segmentId;

    /**
     * database column cc_daas_sales.segment_name
     */
    private String segmentName;

    /**
     * database column cc_daas_sales.sales
     */
    private Long sales;

    /**
     * database column cc_daas_sales.data_year
     */
    private Integer dataYear;

    /**
     * database column cc_daas_sales.data_month
     */
    private Integer dataMonth;

    /**
     * database column cc_daas_sales.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_daas_sales.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_daas_sales.is_deleted
     */
    private Integer isDeleted;

    public Long getDaasSalesId() {
        return daasSalesId;
    }

    public void setDaasSalesId(Long daasSalesId) {
        this.daasSalesId = daasSalesId;
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

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
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