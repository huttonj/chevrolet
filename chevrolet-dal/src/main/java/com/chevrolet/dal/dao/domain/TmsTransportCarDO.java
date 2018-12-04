package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 运输车辆表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:23 
 * @since V1.0 
 */
public class TmsTransportCarDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_transport_car.transport_car_id
     * 运输车辆ID
     */
    private Long transportCarId;

    /**
     * database column tms_transport_car.car_id
     * 该字段以废弃（原为tms_car的主键Id）
     */
    private Long carId;

    /**
     * database column tms_transport_car.cc_car_id
     * 车辆中心car_id
     */
    private Long ccCarId;

    /**
     * database column tms_transport_car.transport_order_id
     * 运单Id
     */
    private Long transportOrderId;

    /**
     * database column tms_transport_car.car_type
     * 车辆的类型：1-标准轿车；2-标准SUV;3-大型SUV；4-特殊车型
     */
    private Integer carType;

    /**
     * database column tms_transport_car.guide_price
     * 指导价(以分为单位存储)
     */
    private Long guidePrice;

    /**
     * database column tms_transport_car.transport_price
     * 运价(以分单位存储)
     */
    private Integer transportPrice;

    /**
     * database column tms_transport_car.service_charge
     * 服务费(在tms2.0已经去除该字段
     */
    private Integer serviceCharge;

    /**
     * database column tms_transport_car.insurance
     * 保险费（以分为单位存储）
     */
    private Integer insurance;

    /**
     * database column tms_transport_car.await_price
     * 等待费
     */
    private Integer awaitPrice;

    /**
     * database column tms_transport_car.empty_run_price
     * 放空费
     */
    private Integer emptyRunPrice;

    /**
     * database column tms_transport_car.tax_price
     * 税费
     */
    private Integer taxPrice;

    /**
     * database column tms_transport_car.start_city_id
     * 始发地城市ID
     */
    private Long startCityId;

    /**
     * database column tms_transport_car.destination_city_id
     * 目的地城市ID
     */
    private Long destinationCityId;

    /**
     * database column tms_transport_car.warehouse_id
     * 停放仓库Id
     */
    private Long warehouseId;

    /**
     * database column tms_transport_car.warehouse_fullname
     * 停放仓库全名（编号+名称）
     */
    private String warehouseFullname;

    /**
     * database column tms_transport_car.warehouse_type
     * 仓库类型
     */
    private Integer warehouseType;

    /**
     * database column tms_transport_car.inspection_time
     * 通知承运商去验车的时间
     */
    private Date inspectionTime;

    /**
     * database column tms_transport_car.shipping_time
     * 车辆实际的发运时间（2018年6月4日修改为提车时间）
     */
    private Date shippingTime;

    /**
     * database column tms_transport_car.predict_arrival_time
     * 预计到达时间
     */
    private Date predictArrivalTime;

    /**
     * database column tms_transport_car.arrival_time
     * 该辆车实际到达的时间
     */
    private Date arrivalTime;

    /**
     * database column tms_transport_car.delivery_time
     * 交车时间
     */
    private Date deliveryTime;

    /**
     * database column tms_transport_car.img_policy
     * 保单照片
     */
    private String imgPolicy;

    /**
     * database column tms_transport_car.img_delivery
     * 交车单
     */
    private String imgDelivery;

    /**
     * database column tms_transport_car.img_pick_letter
     * 提车函
     */
    private String imgPickLetter;

    /**
     * database column tms_transport_car.img_front
     * 前45度角的照片
     */
    private String imgFront;

    /**
     * database column tms_transport_car.img_behind
     * 后45度角的照片
     */
    private String imgBehind;

    /**
     * database column tms_transport_car.img_inner
     * 内饰图片
     */
    private String imgInner;

    /**
     * database column tms_transport_car.img_odometer
     * 里程图片
     */
    private String imgOdometer;

    /**
     * database column tms_transport_car.img_nameplate
     * 铭牌照片
     */
    private String imgNameplate;

    /**
     * database column tms_transport_car.car_transport_status
     * 车辆运输状态：1-待收费；2-待验车；3-可验车；4-待发车；5-可发车；6-在途；7-到达不可放车；8-到达可放车；9-已完成；10-作废
     */
    private Integer carTransportStatus;

    /**
     * database column tms_transport_car.payment_status
     * 回款状态0-该车辆未回款；1-该车辆已经回款
     */
    private Integer paymentStatus;

    /**
     * database column tms_transport_car.remarks
     * 备注
     */
    private String remarks;

    /**
     * database column tms_transport_car.status
     * 记录状态：1-有效；0-失效
     */
    private Integer status;

    /**
     * database column tms_transport_car.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_transport_car.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column tms_transport_car.settlement_status
     * 车辆运费的结算状态（0：未结清，1：已结算，2：结算中）
     */
    private Integer settlementStatus;

    /**
     * database column tms_transport_car.settlement_no
     * 结算单编号（对接新订单贷）
     */
    private String settlementNo;

    /**
     * database column tms_transport_car.examine_status
     * 审核状态：针对救援车的价格审核，即是否录入了该车辆的价格;0:未审核，1:已审核
     */
    private Integer examineStatus;

    /**
     * database column tms_transport_car.odometer
     * 发车时的车辆公里数
     */
    private String odometer;

    /**
     * database column tms_transport_car.notice_delivery_time
     * 通知放车时间
     */
    private Date noticeDeliveryTime;

    public Long getTransportCarId() {
        return transportCarId;
    }

    public void setTransportCarId(Long transportCarId) {
        this.transportCarId = transportCarId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCcCarId() {
        return ccCarId;
    }

    public void setCcCarId(Long ccCarId) {
        this.ccCarId = ccCarId;
    }

    public Long getTransportOrderId() {
        return transportOrderId;
    }

    public void setTransportOrderId(Long transportOrderId) {
        this.transportOrderId = transportOrderId;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Long getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(Long guidePrice) {
        this.guidePrice = guidePrice;
    }

    public Integer getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(Integer transportPrice) {
        this.transportPrice = transportPrice;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
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

    public Long getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(Long startCityId) {
        this.startCityId = startCityId;
    }

    public Long getDestinationCityId() {
        return destinationCityId;
    }

    public void setDestinationCityId(Long destinationCityId) {
        this.destinationCityId = destinationCityId;
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

    public Date getInspectionTime() {
        if(inspectionTime == null){
            return null;
        }
        return (Date)inspectionTime.clone();
    }

    public void setInspectionTime(Date inspectionTime) {
        if(inspectionTime == null){
            this.inspectionTime = null;
        }else{
            this.inspectionTime = (Date)inspectionTime.clone();
        }
    }


    public Date getShippingTime() {
        if(shippingTime == null){
            return null;
        }
        return (Date)shippingTime.clone();
    }

    public void setShippingTime(Date shippingTime) {
        if(shippingTime == null){
            this.shippingTime = null;
        }else{
            this.shippingTime = (Date)shippingTime.clone();
        }
    }


    public Date getPredictArrivalTime() {
        if(predictArrivalTime == null){
            return null;
        }
        return (Date)predictArrivalTime.clone();
    }

    public void setPredictArrivalTime(Date predictArrivalTime) {
        if(predictArrivalTime == null){
            this.predictArrivalTime = null;
        }else{
            this.predictArrivalTime = (Date)predictArrivalTime.clone();
        }
    }


    public Date getArrivalTime() {
        if(arrivalTime == null){
            return null;
        }
        return (Date)arrivalTime.clone();
    }

    public void setArrivalTime(Date arrivalTime) {
        if(arrivalTime == null){
            this.arrivalTime = null;
        }else{
            this.arrivalTime = (Date)arrivalTime.clone();
        }
    }


    public Date getDeliveryTime() {
        if(deliveryTime == null){
            return null;
        }
        return (Date)deliveryTime.clone();
    }

    public void setDeliveryTime(Date deliveryTime) {
        if(deliveryTime == null){
            this.deliveryTime = null;
        }else{
            this.deliveryTime = (Date)deliveryTime.clone();
        }
    }


    public String getImgPolicy() {
        return imgPolicy;
    }

    public void setImgPolicy(String imgPolicy) {
        this.imgPolicy = imgPolicy;
    }

    public String getImgDelivery() {
        return imgDelivery;
    }

    public void setImgDelivery(String imgDelivery) {
        this.imgDelivery = imgDelivery;
    }

    public String getImgPickLetter() {
        return imgPickLetter;
    }

    public void setImgPickLetter(String imgPickLetter) {
        this.imgPickLetter = imgPickLetter;
    }

    public String getImgFront() {
        return imgFront;
    }

    public void setImgFront(String imgFront) {
        this.imgFront = imgFront;
    }

    public String getImgBehind() {
        return imgBehind;
    }

    public void setImgBehind(String imgBehind) {
        this.imgBehind = imgBehind;
    }

    public String getImgInner() {
        return imgInner;
    }

    public void setImgInner(String imgInner) {
        this.imgInner = imgInner;
    }

    public String getImgOdometer() {
        return imgOdometer;
    }

    public void setImgOdometer(String imgOdometer) {
        this.imgOdometer = imgOdometer;
    }

    public String getImgNameplate() {
        return imgNameplate;
    }

    public void setImgNameplate(String imgNameplate) {
        this.imgNameplate = imgNameplate;
    }

    public Integer getCarTransportStatus() {
        return carTransportStatus;
    }

    public void setCarTransportStatus(Integer carTransportStatus) {
        this.carTransportStatus = carTransportStatus;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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


    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public Integer getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(Integer examineStatus) {
        this.examineStatus = examineStatus;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public Date getNoticeDeliveryTime() {
        if(noticeDeliveryTime == null){
            return null;
        }
        return (Date)noticeDeliveryTime.clone();
    }

    public void setNoticeDeliveryTime(Date noticeDeliveryTime) {
        if(noticeDeliveryTime == null){
            this.noticeDeliveryTime = null;
        }else{
            this.noticeDeliveryTime = (Date)noticeDeliveryTime.clone();
        }
    }


}