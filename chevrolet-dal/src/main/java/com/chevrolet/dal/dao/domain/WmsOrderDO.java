package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsOrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_order.order_id
     */
    private Long orderId;

    /**
     * database column wms_order.order_no
     */
    private String orderNo;

    /**
     * database column wms_order.order_type
     */
    private Integer orderType;

    /**
     * database column wms_order.salesman
     */
    private String salesman;

    /**
     * database column wms_order.salesman_phone
     */
    private String salesmanPhone;

    /**
     * database column wms_order.customer
     */
    private String customer;

    /**
     * database column wms_order.customer_contact
     */
    private String customerContact;

    /**
     * database column wms_order.customer_phone
     */
    private String customerPhone;

    /**
     * database column wms_order.destination
     */
    private String destination;

    /**
     * database column wms_order.logistics_company
     */
    private String logisticsCompany;

    /**
     * database column wms_order.logistics_contact
     */
    private String logisticsContact;

    /**
     * database column wms_order.logistics_contact_phone
     */
    private String logisticsContactPhone;

    /**
     * database column wms_order.receive_city
     */
    private String receiveCity;

    /**
     * database column wms_order.out_order_id
     */
    private Long outOrderId;

    /**
     * database column wms_order.transactor_id
     */
    private Long transactorId;

    /**
     * database column wms_order.transactor_name
     */
    private String transactorName;

    /**
     * database column wms_order.order_status
     */
    private Integer orderStatus;

    /**
     * database column wms_order.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_order.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_order.status
     */
    private Integer status;

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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsContact() {
        return logisticsContact;
    }

    public void setLogisticsContact(String logisticsContact) {
        this.logisticsContact = logisticsContact;
    }

    public String getLogisticsContactPhone() {
        return logisticsContactPhone;
    }

    public void setLogisticsContactPhone(String logisticsContactPhone) {
        this.logisticsContactPhone = logisticsContactPhone;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
    }

    public Long getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(Long outOrderId) {
        this.outOrderId = outOrderId;
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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

}