package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**  
 * <p> 车辆质损信息 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:10
 * @since V1.0
 */
public class TmsCarMassLossDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_car_mass_loss.car_mass_loss_id
     */
    private Long carMassLossId;

    /**
     * database column tms_car_mass_loss.transport_car_id
     * 运输车辆ID
     */
    private Long transportCarId;

    /**
     * database column tms_car_mass_loss.img_mass_loss
     * 车辆质损照片
     */
    private String imgMassLoss;

    /**
     * database column tms_car_mass_loss.remarks
     * 备注
     */
    private String remarks;

    /**
     * database column tms_car_mass_loss.status
     * 记录状态：1-有效；0-失效
     */
    private Integer status;

    /**
     * database column tms_car_mass_loss.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_car_mass_loss.gmt_modified
     */
    private Date gmtModified;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCarMassLossId() {
        return carMassLossId;
    }

    public void setCarMassLossId(Long carMassLossId) {
        this.carMassLossId = carMassLossId;
    }

    public Long getTransportCarId() {
        return transportCarId;
    }

    public void setTransportCarId(Long transportCarId) {
        this.transportCarId = transportCarId;
    }

    public String getImgMassLoss() {
        return imgMassLoss;
    }

    public void setImgMassLoss(String imgMassLoss) {
        this.imgMassLoss = imgMassLoss;
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