package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车系表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:49 
 * @since V1.0 
 */
public class SeriesDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_series.series_id
     */
    private Long seriesId;

    /**
     * database column b2b_series.series_name
     */
    private String seriesName;

    /**
     * database column b2b_series.factory_id
     */
    private Long factoryId;

    /**
     * database column b2b_series.brand_id
     */
    private Long brandId;

    /**
     * database column b2b_series.level
     */
    private String level;

    /**
     * database column b2b_series.price_range
     */
    private String priceRange;

    /**
     * database column b2b_series.status
     */
    private Integer status;

    /**
     * database column b2b_series.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_series.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_series.outer_id
     */
    private String outerId;

    /**
     * database column b2b_series.source
     */
    private Integer source;

    /**
     * database column b2b_series.standard
     */
    private Integer standard;

    /**
     * database column b2b_series.rank
     */
    private Integer rank;

    /**
     * database column b2b_series.cars_number
     */
    private Long carsNumber;

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

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
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


    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Long getCarsNumber() {
        return carsNumber;
    }

    public void setCarsNumber(Long carsNumber) {
        this.carsNumber = carsNumber;
    }

}