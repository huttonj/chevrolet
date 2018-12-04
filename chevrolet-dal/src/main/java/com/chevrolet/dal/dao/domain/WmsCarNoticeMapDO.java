package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsCarNoticeMapDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_car_notice_map.map_id
     */
    private Long mapId;

    /**
     * database column wms_car_notice_map.car_id
     */
    private Long carId;

    /**
     * database column wms_car_notice_map.notice_id
     */
    private Long noticeId;

    /**
     * database column wms_car_notice_map.type
     */
    private Integer type;

    /**
     * database column wms_car_notice_map.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_car_notice_map.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_car_notice_map.status
     */
    private Integer status;

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}