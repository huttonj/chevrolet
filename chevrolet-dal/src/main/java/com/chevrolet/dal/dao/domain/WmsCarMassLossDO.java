package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsCarMassLossDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_car_mass_loss.mass_loss_id
     */
    private Long massLossId;

    /**
     * database column wms_car_mass_loss.wms_car_id
     */
    private Long wmsCarId;

    /**
     * database column wms_car_mass_loss.type
     */
    private Integer type;

    /**
     * database column wms_car_mass_loss.img_mass_loss
     */
    private String imgMassLoss;

    /**
     * database column wms_car_mass_loss.transactor_id
     */
    private Long transactorId;

    /**
     * database column wms_car_mass_loss.transactor_name
     */
    private String transactorName;

    /**
     * database column wms_car_mass_loss.remarks
     */
    private String remarks;

    /**
     * database column wms_car_mass_loss.status
     */
    private Integer status;

    /**
     * database column wms_car_mass_loss.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_car_mass_loss.gmt_modified
     */
    private Date gmtModified;

    public Long getMassLossId() {
        return massLossId;
    }

    public void setMassLossId(Long massLossId) {
        this.massLossId = massLossId;
    }

    public Long getWmsCarId() {
        return wmsCarId;
    }

    public void setWmsCarId(Long wmsCarId) {
        this.wmsCarId = wmsCarId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgMassLoss() {
        return imgMassLoss;
    }

    public void setImgMassLoss(String imgMassLoss) {
        this.imgMassLoss = imgMassLoss;
    }

    public Long getTransactorId() {
        return transactorId;
    }

    public void setTransactorId(Long transactorId) {
        this.transactorId = transactorId;
    }

    public String getTransactorName() {
        return transactorName;
    }

    public void setTransactorName(String transactorName) {
        this.transactorName = transactorName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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