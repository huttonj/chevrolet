package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 城市表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:27 
 * @since V1.0 
 */
public class MhcCityDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_mhc_city.city_id
     */
    private Long cityId;

    /**
     * database column b2b_mhc_city.city_name
     */
    private String cityName;

    /**
     * database column b2b_mhc_city.city_short_name
     */
    private String cityShortName;

    /**
     * database column b2b_mhc_city.city_sort
     */
    private Integer citySort;

    /**
     * database column b2b_mhc_city.prov_id
     */
    private Long provId;

    /**
     * database column b2b_mhc_city.city_index
     */
    private String cityIndex;

    /**
     * database column b2b_mhc_city.status
     */
    private Integer status;

    /**
     * database column b2b_mhc_city.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_mhc_city.gmt_modified
     */
    private Date gmtModified;

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

    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
    }

    public Integer getCitySort() {
        return citySort;
    }

    public void setCitySort(Integer citySort) {
        this.citySort = citySort;
    }

    public Long getProvId() {
        return provId;
    }

    public void setProvId(Long provId) {
        this.provId = provId;
    }

    public String getCityIndex() {
        return cityIndex;
    }

    public void setCityIndex(String cityIndex) {
        this.cityIndex = cityIndex;
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