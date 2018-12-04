package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 结算申请车辆 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:48 
 * @since V1.0 
 */
public class PaymentApplyCarListDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_payment_apply_car_list.id
     */
    private Long id;

    /**
     * database column b2b_payment_apply_car_list.payment_apply_id
     * 申请单ID
     */
    private Long paymentApplyId;

    /**
     * database column b2b_payment_apply_car_list.car_unique_id
     * 车架ID
     */
    private Long carUniqueId;

    /**
     * database column b2b_payment_apply_car_list.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_payment_apply_car_list.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_payment_apply_car_list.status
     */
    private Integer status;

    /**
     * database column b2b_payment_apply_car_list.is_deleted
     */
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentApplyId() {
        return paymentApplyId;
    }

    public void setPaymentApplyId(Long paymentApplyId) {
        this.paymentApplyId = paymentApplyId;
    }

    public Long getCarUniqueId() {
        return carUniqueId;
    }

    public void setCarUniqueId(Long carUniqueId) {
        this.carUniqueId = carUniqueId;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}