package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsCarInsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_car_ins.id
     */
    private Long id;

    /**
     * database column wms_car_ins.car_id
     */
    private Long carId;

    /**
     * database column wms_car_ins.store_type
     */
    private Integer storeType;

    /**
     * database column wms_car_ins.car_id_store_type
     */
    private String carIdStoreType;

    /**
     * database column wms_car_ins.category
     */
    private Integer category;

    /**
     * database column wms_car_ins.status
     */
    private Integer status;

    /**
     * database column wms_car_ins.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_car_ins.gmt_modified
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String getCarIdStoreType() {
        return carIdStoreType;
    }

    public void setCarIdStoreType(String carIdStoreType) {
        this.carIdStoreType = carIdStoreType;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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