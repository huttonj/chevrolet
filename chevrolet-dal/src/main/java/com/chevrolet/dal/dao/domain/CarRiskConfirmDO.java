package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车辆风险确认(胜胜) </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:17
 * @since V1.0 
 */
public class CarRiskConfirmDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car_risk_confirm.car_risk_confirm_id
     * 主键ID
     */
    private Long carRiskConfirmId;

    /**
     * database column cc_car_risk_confirm.car_id
     * 车辆ID
     */
    private Long carId;

    /**
     * database column cc_car_risk_confirm.confirm_pic
     * 现场照片
     */
    private Long confirmPic;

    /**
     * database column cc_car_risk_confirm.confirm_desc
     * 现场描述
     */
    private String confirmDesc;

    /**
     * database column cc_car_risk_confirm.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_car_risk_confirm.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_car_risk_confirm.is_deleted
     */
    private Integer isDeleted;

    public Long getCarRiskConfirmId() {
        return carRiskConfirmId;
    }

    public void setCarRiskConfirmId(Long carRiskConfirmId) {
        this.carRiskConfirmId = carRiskConfirmId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getConfirmPic() {
        return confirmPic;
    }

    public void setConfirmPic(Long confirmPic) {
        this.confirmPic = confirmPic;
    }

    public String getConfirmDesc() {
        return confirmDesc;
    }

    public void setConfirmDesc(String confirmDesc) {
        this.confirmDesc = confirmDesc;
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