package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseEntryNoticeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse_entry_notice.notice_id
     */
    private Long noticeId;

    /**
     * database column wms_warehouse_entry_notice.notice_no
     */
    private String noticeNo;

    /**
     * database column wms_warehouse_entry_notice.order_id
     */
    private Long orderId;

    /**
     * database column wms_warehouse_entry_notice.order_no
     */
    private String orderNo;

    /**
     * database column wms_warehouse_entry_notice.source_type
     */
    private Integer sourceType;

    /**
     * database column wms_warehouse_entry_notice.storage_type_id
     */
    private Long storageTypeId;

    /**
     * database column wms_warehouse_entry_notice.transactor_id
     */
    private Long transactorId;

    /**
     * database column wms_warehouse_entry_notice.transactor_name
     */
    private String transactorName;

    /**
     * database column wms_warehouse_entry_notice.customer_id
     */
    private Long customerId;

    /**
     * database column wms_warehouse_entry_notice.customer
     */
    private String customer;

    /**
     * database column wms_warehouse_entry_notice.contact_id
     */
    private Long contactId;

    /**
     * database column wms_warehouse_entry_notice.contact_name
     */
    private String contactName;

    /**
     * database column wms_warehouse_entry_notice.contact_phone
     */
    private String contactPhone;

    /**
     * database column wms_warehouse_entry_notice.salesman
     */
    private String salesman;

    /**
     * database column wms_warehouse_entry_notice.salesman_phone
     */
    private String salesmanPhone;

    /**
     * database column wms_warehouse_entry_notice.transport_order_no
     */
    private String transportOrderNo;

    /**
     * database column wms_warehouse_entry_notice.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_warehouse_entry_notice.warehouse_fullname
     */
    private String warehouseFullname;

    /**
     * database column wms_warehouse_entry_notice.expected_warehousing_time
     */
    private Date expectedWarehousingTime;

    /**
     * database column wms_warehouse_entry_notice.memo
     */
    private String memo;

    /**
     * database column wms_warehouse_entry_notice.review_time
     */
    private Date reviewTime;

    /**
     * database column wms_warehouse_entry_notice.notice_status
     */
    private Integer noticeStatus;

    /**
     * database column wms_warehouse_entry_notice.status
     */
    private Integer status;

    /**
     * database column wms_warehouse_entry_notice.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse_entry_notice.gmt_modified
     */
    private Date gmtModified;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Long getStorageTypeId() {
        return storageTypeId;
    }

    public void setStorageTypeId(Long storageTypeId) {
        this.storageTypeId = storageTypeId;
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

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getSalesmanPhone() {
        return salesmanPhone;
    }

    public void setSalesmanPhone(String salesmanPhone) {
        this.salesmanPhone = salesmanPhone;
    }

    public String getTransportOrderNo() {
        return transportOrderNo;
    }

    public void setTransportOrderNo(String transportOrderNo) {
        this.transportOrderNo = transportOrderNo;
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

    public Date getExpectedWarehousingTime() {
        if(expectedWarehousingTime == null){
            return null;
        }
        return (Date)expectedWarehousingTime.clone();
    }

    public void setExpectedWarehousingTime(Date expectedWarehousingTime) {
        if(expectedWarehousingTime == null){
            this.expectedWarehousingTime = null;
        }else{
            this.expectedWarehousingTime = (Date)expectedWarehousingTime.clone();
        }
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getReviewTime() {
        if(reviewTime == null){
            return null;
        }
        return (Date)reviewTime.clone();
    }

    public void setReviewTime(Date reviewTime) {
        if(reviewTime == null){
            this.reviewTime = null;
        }else{
            this.reviewTime = (Date)reviewTime.clone();
        }
    }


    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
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