package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车架号白名单 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:05 
 * @since V1.0 
 */
public class VinWhitelistDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_vin_whitelist.id
     */
    private Long id;

    /**
     * database column cc_vin_whitelist.vin
     * vin码
     */
    private String vin;

    /**
     * database column cc_vin_whitelist.brand_id
     * 品牌ID
     */
    private Long brandId;

    /**
     * database column cc_vin_whitelist.series_id
     * 车系ID
     */
    private Long seriesId;

    /**
     * database column cc_vin_whitelist.model_id
     * 车型ID
     */
    private Long modelId;

    /**
     * database column cc_vin_whitelist.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_vin_whitelist.gmt_modified
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
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