package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 车辆附加费用明细表，一个车辆产生了哪些附加费用记录在这张表里。 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:48 
 * @since V1.0 
 */
public class TransCarExtraChargeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_trans_car_extra_charge.car_extra_charge_id
     */
    private Long carExtraChargeId;

    /**
     * database column tms_trans_car_extra_charge.transport_car_id
     * 商品车ID
     */
    private Long transportCarId;

    /**
     * database column tms_trans_car_extra_charge.transport_order_id
     * 运单ID
     */
    private Long transportOrderId;

    /**
     * database column tms_trans_car_extra_charge.payee_type
     * 收款人类型：1，承运商费用；2，客户费用
     */
    private Integer payeeType;

    /**
     * database column tms_trans_car_extra_charge.extra_charge_id
     * 附加费用规则ID，可能是carrier_extra_charge_id或transport_templet_charge_id，根据payee_type来区分。如果为空(0)，表示人工录入
     */
    private Long extraChargeId;

    /**
     * database column tms_trans_car_extra_charge.charge_type
     * 费用类型，冗余字段，参考配置表tms_system_config中的定义
     */
    private String chargeType;

    /**
     * database column tms_trans_car_extra_charge.charge_fee
     * 实际收取的该项附加费用，单位：分。
     */
    private Integer chargeFee;

    /**
     * database column tms_trans_car_extra_charge.is_valid
     * 是否有效（1: 有效；0:无效）
     */
    private Integer isValid;

    /**
     * database column tms_trans_car_extra_charge.status
     * 记录的状态：1-有效；0-失效
     */
    private Integer status;

    /**
     * database column tms_trans_car_extra_charge.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_trans_car_extra_charge.gmt_modified
     */
    private Date gmtModified;

    public Long getCarExtraChargeId() {
        return carExtraChargeId;
    }

    public void setCarExtraChargeId(Long carExtraChargeId) {
        this.carExtraChargeId = carExtraChargeId;
    }

    public Long getTransportCarId() {
        return transportCarId;
    }

    public void setTransportCarId(Long transportCarId) {
        this.transportCarId = transportCarId;
    }

    public Long getTransportOrderId() {
        return transportOrderId;
    }

    public void setTransportOrderId(Long transportOrderId) {
        this.transportOrderId = transportOrderId;
    }

    public Integer getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(Integer payeeType) {
        this.payeeType = payeeType;
    }

    public Long getExtraChargeId() {
        return extraChargeId;
    }

    public void setExtraChargeId(Long extraChargeId) {
        this.extraChargeId = extraChargeId;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(Integer chargeFee) {
        this.chargeFee = chargeFee;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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