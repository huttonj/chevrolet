package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 调拨车辆 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午10:47 
 * @since V1.0 
 */
public class AllotCarDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column allot_car.allot_car_id
     * 主键ID
     */
    private Long allotCarId;

    /**
     * database column allot_car.allot_order_id
     * 调拨单ID
     */
    private Long allotOrderId;

    /**
     * database column allot_car.allot_car_status
     * 调拨车辆状态（0-待支付 1待执行 10 待出库 20 已出库（在途）30 已到达已入库 40 已到达已中途入库 50 已关闭)
     */
    private Integer allotCarStatus;

    /**
     * database column allot_car.status
     * 状态(0 无效，1 有效)
     */
    private Integer status;

    /**
     * database column allot_car.wms_car_id
     * 仓库车辆ID
     */
    private Long wmsCarId;

    /**
     * database column allot_car.transport_order_id
     * 运单ID
     */
    private Long transportOrderId;

    /**
     * database column allot_car.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column allot_car.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column allot_car.transport_order_no
     * 运单单号
     */
    private String transportOrderNo;

    /**
     * database column allot_car.new_wms_car_id
     * 调拨目的仓库入库wms_car
     */
    private Long newWmsCarId;

    public Long getAllotCarId() {
        return allotCarId;
    }

    public void setAllotCarId(Long allotCarId) {
        this.allotCarId = allotCarId;
    }

    public Long getAllotOrderId() {
        return allotOrderId;
    }

    public void setAllotOrderId(Long allotOrderId) {
        this.allotOrderId = allotOrderId;
    }

    public Integer getAllotCarStatus() {
        return allotCarStatus;
    }

    public void setAllotCarStatus(Integer allotCarStatus) {
        this.allotCarStatus = allotCarStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getWmsCarId() {
        return wmsCarId;
    }

    public void setWmsCarId(Long wmsCarId) {
        this.wmsCarId = wmsCarId;
    }

    public Long getTransportOrderId() {
        return transportOrderId;
    }

    public void setTransportOrderId(Long transportOrderId) {
        this.transportOrderId = transportOrderId;
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


    public String getTransportOrderNo() {
        return transportOrderNo;
    }

    public void setTransportOrderNo(String transportOrderNo) {
        this.transportOrderNo = transportOrderNo;
    }

    public Long getNewWmsCarId() {
        return newWmsCarId;
    }

    public void setNewWmsCarId(Long newWmsCarId) {
        this.newWmsCarId = newWmsCarId;
    }

}