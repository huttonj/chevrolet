package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 区域表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:27 
 * @since V1.0 
 */
public class MhcCountyDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_mhc_county.id
     */
    private Long id;

    /**
     * database column b2b_mhc_county.county_id
     */
    private Long countyId;

    /**
     * database column b2b_mhc_county.county_name
     */
    private String countyName;

    /**
     * database column b2b_mhc_county.county_short_name
     */
    private String countyShortName;

    /**
     * database column b2b_mhc_county.county_sort
     */
    private Integer countySort;

    /**
     * database column b2b_mhc_county.province_id
     */
    private Long provinceId;

    /**
     * database column b2b_mhc_county.city_id
     */
    private Long cityId;

    /**
     * database column b2b_mhc_county.county_index
     */
    private String countyIndex;

    /**
     * database column b2b_mhc_county.status
     */
    private Integer status;

    /**
     * database column b2b_mhc_county.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_mhc_county.gmt_modified
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyShortName() {
        return countyShortName;
    }

    public void setCountyShortName(String countyShortName) {
        this.countyShortName = countyShortName;
    }

    public Integer getCountySort() {
        return countySort;
    }

    public void setCountySort(Integer countySort) {
        this.countySort = countySort;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCountyIndex() {
        return countyIndex;
    }

    public void setCountyIndex(String countyIndex) {
        this.countyIndex = countyIndex;
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