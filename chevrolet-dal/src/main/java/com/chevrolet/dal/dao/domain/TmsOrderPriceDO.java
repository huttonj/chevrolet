package com.chevrolet.dal.dao.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 运单费用表 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:19
 * @since V1.0
 */
@Data
public class TmsOrderPriceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_order_price.id
     * 主键ID
     */
    private Long id;

    /**
     * database column tms_order_price.tms_order_id
     * 运单ID
     */
    private Long tmsOrderId;

    /**
     * database column tms_order_price.transport_price
     * 运费
     */
    private Integer transportPrice;

    /**
     * database column tms_order_price.service_price
     * 服务费
     */
    private Integer servicePrice;

    /**
     * database column tms_order_price.insurance_price
     * 保险费
     */
    private Integer insurancePrice;

    /**
     * database column tms_order_price.await_price
     * 等待费
     */
    private Integer awaitPrice;

    /**
     * database column tms_order_price.empty_run_price
     * 放空费
     */
    private Integer emptyRunPrice;

    /**
     * database column tms_order_price.delivery_price
     * 送车上门费用
     */
    private Integer deliveryPrice;

    /**
     * database column tms_order_price.pickup_price
     * 上门提车费用
     */
    private Integer pickupPrice;

    /**
     * database column tms_order_price.check_car_price
     * 验车费用
     */
    private Integer checkCarPrice;

    /**
     * database column tms_order_price.tax_price
     * 税费
     */
    private Integer taxPrice;

    /**
     * database column tms_order_price.old_transport_price
     * 修改前运费
     */
    private Integer oldTransportPrice;

    /**
     * database column tms_order_price.price_type
     * 费用类型：1，承运商费用；2，客户费用
     */
    private Integer priceType;

    /**
     * database column tms_order_price.status
     * 记录状态：0-失效；1-有效
     */
    private Integer status;

    /**
     * database column tms_order_price.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_order_price.gmt_modified
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTmsOrderId() {
        return tmsOrderId;
    }

    public void setTmsOrderId(Long tmsOrderId) {
        this.tmsOrderId = tmsOrderId;
    }

    public Integer getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(Integer transportPrice) {
        this.transportPrice = transportPrice;
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Integer getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(Integer insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Integer getAwaitPrice() {
        return awaitPrice;
    }

    public void setAwaitPrice(Integer awaitPrice) {
        this.awaitPrice = awaitPrice;
    }

    public Integer getEmptyRunPrice() {
        return emptyRunPrice;
    }

    public void setEmptyRunPrice(Integer emptyRunPrice) {
        this.emptyRunPrice = emptyRunPrice;
    }

    public Integer getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(Integer taxPrice) {
        this.taxPrice = taxPrice;
    }

    public Integer getOldTransportPrice() {
        return oldTransportPrice;
    }

    public void setOldTransportPrice(Integer oldTransportPrice) {
        this.oldTransportPrice = oldTransportPrice;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
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