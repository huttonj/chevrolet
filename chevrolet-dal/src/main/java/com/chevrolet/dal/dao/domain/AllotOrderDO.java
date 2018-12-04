package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 调拨单 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午10:50
 * @since V1.0
 */
public class AllotOrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column allot_order.allot_order_id
     * 调拨单ID
     */
    private Long allotOrderId;

    /**
     * database column allot_order.allot_order_no
     * 调拨单号（自动生成，唯一）
     */
    private String allotOrderNo;

    /**
     * database column allot_order.allot_order_type
     * 调拨类型:1 人为调拨,2 系统调拨,3 订单调拨
     */
    private Integer allotOrderType;

    /**
     * database column allot_order.start_address
     * 始发地
     */
    private String startAddress;

    /**
     * database column allot_order.destination_address
     * 目的地
     */
    private String destinationAddress;

    /**
     * database column allot_order.start_warehouse_id
     * 始发仓库id
     */
    private Long startWarehouseId;

    /**
     * database column allot_order.destination_warehouse_id
     * 目的仓库id
     */
    private Long destinationWarehouseId;

    /**
     * database column allot_order.customer_id
     * 调拨发起方id
     */
    private Long customerId;

    /**
     * database column allot_order.customer_name
     * 调拨发起方
     */
    private String customerName;

    /**
     * database column allot_order.user_id
     * 发起方联系人id
     */
    private Long userId;

    /**
     * database column allot_order.user_name
     * 发起方联系人
     */
    private String userName;

    /**
     * database column allot_order.phonenumber
     * 发起方联系电话
     */
    private String phonenumber;

    /**
     * database column allot_order.allot_status
     * 调拨单状态（1 待付款 10 待执行 20 进行中 30 已完成 40 已关闭）
     */
    private Integer allotStatus;

    /**
     * database column allot_order.status
     * 状态（0 无效 1 有效）
     */
    private Integer status;

    /**
     * database column allot_order.operator_id
     * 创建人ID
     */
    private Long operatorId;

    /**
     * database column allot_order.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column allot_order.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column allot_order.remarks
     */
    private String remarks;

    /**
     * database column allot_order.operator_name
     * 操作人
     */
    private String operatorName;

    public Long getAllotOrderId() {
        return allotOrderId;
    }

    public void setAllotOrderId(Long allotOrderId) {
        this.allotOrderId = allotOrderId;
    }

    public String getAllotOrderNo() {
        return allotOrderNo;
    }

    public void setAllotOrderNo(String allotOrderNo) {
        this.allotOrderNo = allotOrderNo;
    }

    public Integer getAllotOrderType() {
        return allotOrderType;
    }

    public void setAllotOrderType(Integer allotOrderType) {
        this.allotOrderType = allotOrderType;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Long getStartWarehouseId() {
        return startWarehouseId;
    }

    public void setStartWarehouseId(Long startWarehouseId) {
        this.startWarehouseId = startWarehouseId;
    }

    public Long getDestinationWarehouseId() {
        return destinationWarehouseId;
    }

    public void setDestinationWarehouseId(Long destinationWarehouseId) {
        this.destinationWarehouseId = destinationWarehouseId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getAllotStatus() {
        return allotStatus;
    }

    public void setAllotStatus(Integer allotStatus) {
        this.allotStatus = allotStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
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


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

}