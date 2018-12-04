package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsCarInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_car_info.car_id
     */
    private Long carId;

    /**
     * database column wms_car_info.car_status
     */
    private Integer carStatus;

    /**
     * database column wms_car_info.order_id
     */
    private Long orderId;

    /**
     * database column wms_car_info.shipping_order_id
     */
    private Long shippingOrderId;

    /**
     * database column wms_car_info.notice_id
     */
    private Long noticeId;

    /**
     * database column wms_car_info.out_car_id
     */
    private Long outCarId;

    /**
     * database column wms_car_info.car_source_type
     */
    private Integer carSourceType;

    /**
     * database column wms_car_info.car_snap_id
     */
    private Long carSnapId;

    /**
     * database column wms_car_info.spec
     */
    private Integer spec;

    /**
     * database column wms_car_info.brand_id
     */
    private Integer brandId;

    /**
     * database column wms_car_info.brand_name
     */
    private String brandName;

    /**
     * database column wms_car_info.series_id
     */
    private Integer seriesId;

    /**
     * database column wms_car_info.series_name
     */
    private String seriesName;

    /**
     * database column wms_car_info.model_id
     */
    private Integer modelId;

    /**
     * database column wms_car_info.model_name
     */
    private String modelName;

    /**
     * database column wms_car_info.outer_id
     */
    private Integer outerId;

    /**
     * database column wms_car_info.outer_name
     */
    private String outerName;

    /**
     * database column wms_car_info.inner_id
     */
    private Integer innerId;

    /**
     * database column wms_car_info.inner_name
     */
    private String innerName;

    /**
     * database column wms_car_info.car_unique
     */
    private String carUnique;

    /**
     * database column wms_car_info.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_car_info.warehouse_fullname
     */
    private String warehouseFullname;

    /**
     * database column wms_car_info.car_data
     */
    private String carData;

    /**
     * database column wms_car_info.car_accessory
     */
    private String carAccessory;

    /**
     * database column wms_car_info.key_number
     */
    private Integer keyNumber;

    /**
     * database column wms_car_info.odometer
     */
    private java.lang.Float odometer;

    /**
     * database column wms_car_info.parking_space
     */
    private String parkingSpace;

    /**
     * database column wms_car_info.entry_date
     */
    private Date entryDate;

    /**
     * database column wms_car_info.img_entry_mass_loss
     */
    private String imgEntryMassLoss;

    /**
     * database column wms_car_info.entry_mass_loss_memo
     */
    private String entryMassLossMemo;

    /**
     * database column wms_car_info.entry_mass_loss_date
     */
    private Date entryMassLossDate;

    /**
     * database column wms_car_info.entry_mass_loss_transactor
     */
    private String entryMassLossTransactor;

    /**
     * database column wms_car_info.img_repertory_mass_loss
     */
    private String imgRepertoryMassLoss;

    /**
     * database column wms_car_info.repertory_mass_loss_memo
     */
    private String repertoryMassLossMemo;

    /**
     * database column wms_car_info.repertory_mass_loss_date
     */
    private Date repertoryMassLossDate;

    /**
     * database column wms_car_info.repertory_mass_loss_transactor
     */
    private String repertoryMassLossTransactor;

    /**
     * database column wms_car_info.delivery_date
     */
    private Date deliveryDate;

    /**
     * database column wms_car_info.status
     */
    private Integer status;

    /**
     * database column wms_car_info.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_car_info.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_car_info.payment_id
     */
    private Long paymentId;

    /**
     * database column wms_car_info.warehouse_type
     */
    private Integer warehouseType;

    /**
     * database column wms_car_info.process_instance_id
     */
    private String processInstanceId;

    /**
     * database column wms_car_info.pay_off_status
     */
    private Integer payOffStatus;

    /**
     * database column wms_car_info.customer_id
     */
    private Long customerId;

    /**
     * database column wms_car_info.customer
     */
    private String customer;

    /**
     * database column wms_car_info.customs_clearance_status
     */
    private Integer customsClearanceStatus;

    /**
     * database column wms_car_info.certificate_status
     */
    private Integer certificateStatus;

    /**
     * database column wms_car_info.certificate_consistent_status
     */
    private Integer certificateConsistentStatus;

    /**
     * database column wms_car_info.checklist_status
     */
    private Integer checklistStatus;

    /**
     * database column wms_car_info.manual_status
     */
    private Integer manualStatus;

    /**
     * database column wms_car_info.payment_status
     */
    private Integer paymentStatus;

    /**
     * database column wms_car_info.payment_type
     */
    private Integer paymentType;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
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

    public Long getShippingOrderId() {
        return shippingOrderId;
    }

    public void setShippingOrderId(Long shippingOrderId) {
        this.shippingOrderId = shippingOrderId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Long getOutCarId() {
        return outCarId;
    }

    public void setOutCarId(Long outCarId) {
        this.outCarId = outCarId;
    }

    public Integer getCarSourceType() {
        return carSourceType;
    }

    public void setCarSourceType(Integer carSourceType) {
        this.carSourceType = carSourceType;
    }

    public Long getCarSnapId() {
        return carSnapId;
    }

    public void setCarSnapId(Long carSnapId) {
        this.carSnapId = carSnapId;
    }

    public Integer getSpec() {
        return spec;
    }

    public void setSpec(Integer spec) {
        this.spec = spec;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getOuterId() {
        return outerId;
    }

    public void setOuterId(Integer outerId) {
        this.outerId = outerId;
    }

    public String getOuterName() {
        return outerName;
    }

    public void setOuterName(String outerName) {
        this.outerName = outerName;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getInnerName() {
        return innerName;
    }

    public void setInnerName(String innerName) {
        this.innerName = innerName;
    }

    public String getCarUnique() {
        return carUnique;
    }

    public void setCarUnique(String carUnique) {
        this.carUnique = carUnique;
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

    public String getCarData() {
        return carData;
    }

    public void setCarData(String carData) {
        this.carData = carData;
    }

    public String getCarAccessory() {
        return carAccessory;
    }

    public void setCarAccessory(String carAccessory) {
        this.carAccessory = carAccessory;
    }

    public Integer getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(Integer keyNumber) {
        this.keyNumber = keyNumber;
    }

    public java.lang.Float getOdometer() {
        return odometer;
    }

    public void setOdometer(java.lang.Float odometer) {
        this.odometer = odometer;
    }

    public String getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(String parkingSpace) {
        this.parkingSpace = parkingSpace;
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


    public String getImgEntryMassLoss() {
        return imgEntryMassLoss;
    }

    public void setImgEntryMassLoss(String imgEntryMassLoss) {
        this.imgEntryMassLoss = imgEntryMassLoss;
    }

    public String getEntryMassLossMemo() {
        return entryMassLossMemo;
    }

    public void setEntryMassLossMemo(String entryMassLossMemo) {
        this.entryMassLossMemo = entryMassLossMemo;
    }

    public Date getEntryMassLossDate() {
        if(entryMassLossDate == null){
            return null;
        }
        return (Date)entryMassLossDate.clone();
    }

    public void setEntryMassLossDate(Date entryMassLossDate) {
        if(entryMassLossDate == null){
            this.entryMassLossDate = null;
        }else{
            this.entryMassLossDate = (Date)entryMassLossDate.clone();
        }
    }


    public String getEntryMassLossTransactor() {
        return entryMassLossTransactor;
    }

    public void setEntryMassLossTransactor(String entryMassLossTransactor) {
        this.entryMassLossTransactor = entryMassLossTransactor;
    }

    public String getImgRepertoryMassLoss() {
        return imgRepertoryMassLoss;
    }

    public void setImgRepertoryMassLoss(String imgRepertoryMassLoss) {
        this.imgRepertoryMassLoss = imgRepertoryMassLoss;
    }

    public String getRepertoryMassLossMemo() {
        return repertoryMassLossMemo;
    }

    public void setRepertoryMassLossMemo(String repertoryMassLossMemo) {
        this.repertoryMassLossMemo = repertoryMassLossMemo;
    }

    public Date getRepertoryMassLossDate() {
        if(repertoryMassLossDate == null){
            return null;
        }
        return (Date)repertoryMassLossDate.clone();
    }

    public void setRepertoryMassLossDate(Date repertoryMassLossDate) {
        if(repertoryMassLossDate == null){
            this.repertoryMassLossDate = null;
        }else{
            this.repertoryMassLossDate = (Date)repertoryMassLossDate.clone();
        }
    }


    public String getRepertoryMassLossTransactor() {
        return repertoryMassLossTransactor;
    }

    public void setRepertoryMassLossTransactor(String repertoryMassLossTransactor) {
        this.repertoryMassLossTransactor = repertoryMassLossTransactor;
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


    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(Integer warehouseType) {
        this.warehouseType = warehouseType;
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

    public Integer getCustomsClearanceStatus() {
        return customsClearanceStatus;
    }

    public void setCustomsClearanceStatus(Integer customsClearanceStatus) {
        this.customsClearanceStatus = customsClearanceStatus;
    }

    public Integer getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(Integer certificateStatus) {
        this.certificateStatus = certificateStatus;
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

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

}