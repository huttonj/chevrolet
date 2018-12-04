package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsCarDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_car.wms_car_id
     */
    private Long wmsCarId;

    /**
     * database column wms_car.car_status
     */
    private Integer carStatus;

    /**
     * database column wms_car.order_id
     */
    private Long orderId;

    /**
     * database column wms_car.notice_id
     */
    private Long noticeId;

    /**
     * database column wms_car.cc_car_id
     */
    private Long ccCarId;

    /**
     * database column wms_car.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_car.warehouse_fullname
     */
    private String warehouseFullname;

    /**
     * database column wms_car.warehouse_type
     */
    private Integer warehouseType;

    /**
     * database column wms_car.customer_id
     */
    private Long customerId;

    /**
     * database column wms_car.customer
     */
    private String customer;

    /**
     * database column wms_car.entry_date
     */
    private Date entryDate;

    /**
     * database column wms_car.delivery_date
     */
    private Date deliveryDate;

    /**
     * database column wms_car.key_number
     */
    private Integer keyNumber;

    /**
     * database column wms_car.odometer
     */
    private String odometer;

    /**
     * database column wms_car.customs_clearance_status
     */
    private Integer customsClearanceStatus;

    /**
     * database column wms_car.certificate_consistent_status
     */
    private Integer certificateConsistentStatus;

    /**
     * database column wms_car.checklist_status
     */
    private Integer checklistStatus;

    /**
     * database column wms_car.manual_status
     */
    private Integer manualStatus;

    /**
     * database column wms_car.payment_id
     */
    private Long paymentId;

    /**
     * database column wms_car.process_instance_id
     */
    private String processInstanceId;

    /**
     * database column wms_car.pay_off_status
     */
    private Integer payOffStatus;

    /**
     * database column wms_car.payment_status
     */
    private Integer paymentStatus;

    /**
     * database column wms_car.status
     */
    private Integer status;

    /**
     * database column wms_car.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_car.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_car.payment_no
     */
    private String paymentNo;

    /**
     * database column wms_car.store_status
     */
    private Integer storeStatus;

    /**
     * database column wms_car.is_checked
     */
    private Integer isChecked;

    /**
     * database column wms_car.deliverable
     */
    private Integer deliverable;

    /**
     * database column wms_car.check_date
     */
    private Date checkDate;

    /**
     * database column wms_car.car_storage_operator_id
     */
    private Long carStorageOperatorId;

    /**
     * database column wms_car.car_storage_operator_name
     */
    private String carStorageOperatorName;

    /**
     * database column wms_car.area_position_id
     */
    private Long areaPositionId;

    public Long getWmsCarId() {
        return wmsCarId;
    }

    public void setWmsCarId(Long wmsCarId) {
        this.wmsCarId = wmsCarId;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getCcCarId() {
        return ccCarId;
    }

    public void setCcCarId(Long ccCarId) {
        this.ccCarId = ccCarId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseFullname() {
        return warehouseFullname;
    }

    public void setWarehouseFullname(String warehouseFullname) {
        this.warehouseFullname = warehouseFullname;
    }

    public Integer getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(Integer warehouseType) {
        this.warehouseType = warehouseType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getEntryDate() {
        if(entryDate == null){
            return null;
        }
        return (Date)entryDate.clone();
    }

    public void setEntryDate(Date entryDate) {
        if(entryDate == null){
            this.entryDate = null;
        }else{
            this.entryDate = (Date)entryDate.clone();
        }
    }


    public Date getDeliveryDate() {
        if(deliveryDate == null){
            return null;
        }
        return (Date)deliveryDate.clone();
    }

    public void setDeliveryDate(Date deliveryDate) {
        if(deliveryDate == null){
            this.deliveryDate = null;
        }else{
            this.deliveryDate = (Date)deliveryDate.clone();
        }
    }


    public Integer getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(Integer keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public Integer getCustomsClearanceStatus() {
        return customsClearanceStatus;
    }

    public void setCustomsClearanceStatus(Integer customsClearanceStatus) {
        this.customsClearanceStatus = customsClearanceStatus;
    }

    public Integer getCertificateConsistentStatus() {
        return certificateConsistentStatus;
    }

    public void setCertificateConsistentStatus(Integer certificateConsistentStatus) {
        this.certificateConsistentStatus = certificateConsistentStatus;
    }

    public Integer getChecklistStatus() {
        return checklistStatus;
    }

    public void setChecklistStatus(Integer checklistStatus) {
        this.checklistStatus = checklistStatus;
    }

    public Integer getManualStatus() {
        return manualStatus;
    }

    public void setManualStatus(Integer manualStatus) {
        this.manualStatus = manualStatus;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Integer getPayOffStatus() {
        return payOffStatus;
    }

    public void setPayOffStatus(Integer payOffStatus) {
        this.payOffStatus = payOffStatus;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
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


    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public Integer getDeliverable() {
        return deliverable;
    }

    public void setDeliverable(Integer deliverable) {
        this.deliverable = deliverable;
    }

    public Date getCheckDate() {
        if(checkDate == null){
            return null;
        }
        return (Date)checkDate.clone();
    }

    public void setCheckDate(Date checkDate) {
        if(checkDate == null){
            this.checkDate = null;
        }else{
            this.checkDate = (Date)checkDate.clone();
        }
    }


    public Long getCarStorageOperatorId() {
        return carStorageOperatorId;
    }

    public void setCarStorageOperatorId(Long carStorageOperatorId) {
        this.carStorageOperatorId = carStorageOperatorId;
    }

    public String getCarStorageOperatorName() {
        return carStorageOperatorName;
    }

    public void setCarStorageOperatorName(String carStorageOperatorName) {
        this.carStorageOperatorName = carStorageOperatorName;
    }

    public Long getAreaPositionId() {
        return areaPositionId;
    }

    public void setAreaPositionId(Long areaPositionId) {
        this.areaPositionId = areaPositionId;
    }

}