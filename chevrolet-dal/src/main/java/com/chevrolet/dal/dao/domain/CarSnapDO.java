package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;


public class CarSnapDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_car_snap.id
     */
    private Long id;

    /**
     * database column b2b_car_snap.car_id
     */
    private Long carId;

    /**
     * database column b2b_car_snap.order_id
     */
    private Long orderId;

    /**
     * database column b2b_car_snap.loan_order_id
     */
    private Long loanOrderId;

    /**
     * database column b2b_car_snap.seller_id
     */
    private Long sellerId;

    /**
     * database column b2b_car_snap.model_id
     */
    private Long modelId;

    /**
     * database column b2b_car_snap.model_name
     */
    private String modelName;

    /**
     * database column b2b_car_snap.car_area
     */
    private String carArea;

    /**
     * database column b2b_car_snap.car_status
     */
    private Integer carStatus;

    /**
     * database column b2b_car_snap.reach_date
     */
    private Date reachDate;

    /**
     * database column b2b_car_snap.formalities_status
     */
    private Integer formalitiesStatus;

    /**
     * database column b2b_car_snap.seller_price
     */
    private Long sellerPrice;

    /**
     * database column b2b_car_snap.invoice_price
     */
    private Long invoicePrice;

    /**
     * database column b2b_car_snap.car_unique
     */
    private String carUnique;

    /**
     * database column b2b_car_snap.img_url
     */
    private String imgUrl;

    /**
     * database column b2b_car_snap.is_deleted
     */
    private Integer isDeleted;

    /**
     * database column b2b_car_snap.inner_id
     */
    private Long innerId;

    /**
     * database column b2b_car_snap.outer_id
     */
    private Long outerId;

    /**
     * database column b2b_car_snap.outer_color_name
     */
    private String outerColorName;

    /**
     * database column b2b_car_snap.inner_color_name
     */
    private String innerColorName;

    /**
     * database column b2b_car_snap.send_city
     */
    private String sendCity;

    /**
     * database column b2b_car_snap.benchmark
     */
    private Integer benchmark;

    /**
     * database column b2b_car_snap.fuel
     */
    private Integer fuel;

    /**
     * database column b2b_car_snap.quantity
     */
    private Integer quantity;

    /**
     * database column b2b_car_snap.insurance
     */
    private Integer insurance;

    /**
     * database column b2b_car_snap.configure
     */
    private String configure;

    /**
     * database column b2b_car_snap.remark
     */
    private String remark;

    /**
     * database column b2b_car_snap.sanbao
     */
    private Integer sanbao;

    /**
     * database column b2b_car_snap.tip_loan_amount
     */
    private Long tipLoanAmount;

    /**
     * database column b2b_car_snap.tip_margin_amount
     */
    private Long tipMarginAmount;

    /**
     * database column b2b_car_snap.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_car_snap.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_car_snap.brand_id
     */
    private Long brandId;

    /**
     * database column b2b_car_snap.brand_name
     */
    private String brandName;

    /**
     * database column b2b_car_snap.series_id
     */
    private Long seriesId;

    /**
     * database column b2b_car_snap.series_name
     */
    private String seriesName;

    /**
     * database column b2b_car_snap.spec_id
     */
    private Integer specId;

    /**
     * database column b2b_car_snap.spec_name
     */
    private String specName;

    /**
     * database column b2b_car_snap.guide_price
     */
    private String guidePrice;

    /**
     * database column b2b_car_snap.market_price
     */
    private String marketPrice;

    /**
     * database column b2b_car_snap.emission
     */
    private String emission;

    /**
     * database column b2b_car_snap.pro_submit_procedure_time
     */
    private Date proSubmitProcedureTime;

    /**
     * database column b2b_car_snap.attach
     */
    private Integer attach;

    /**
     * database column b2b_car_snap.lo_amount
     */
    private Long loAmount;

    /**
     * database column b2b_car_snap.mar_amount
     */
    private Long marAmount;

    /**
     * database column b2b_car_snap.car_loan_no
     */
    private String carLoanNo;

    /**
     * database column b2b_car_snap.unique_num
     */
    private Integer uniqueNum;

    /**
     * database column b2b_car_snap.order_type
     */
    private Integer orderType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getLoanOrderId() {
        return loanOrderId;
    }

    public void setLoanOrderId(Long loanOrderId) {
        this.loanOrderId = loanOrderId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarArea() {
        return carArea;
    }

    public void setCarArea(String carArea) {
        this.carArea = carArea;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Date getReachDate() {
        if(reachDate == null){
            return null;
        }
        return (Date)reachDate.clone();
    }

    public void setReachDate(Date reachDate) {
        if(reachDate == null){
            this.reachDate = null;
        }else{
            this.reachDate = (Date)reachDate.clone();
        }
    }


    public Integer getFormalitiesStatus() {
        return formalitiesStatus;
    }

    public void setFormalitiesStatus(Integer formalitiesStatus) {
        this.formalitiesStatus = formalitiesStatus;
    }

    public Long getSellerPrice() {
        return sellerPrice;
    }

    public void setSellerPrice(Long sellerPrice) {
        this.sellerPrice = sellerPrice;
    }

    public Long getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(Long invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public String getCarUnique() {
        return carUnique;
    }

    public void setCarUnique(String carUnique) {
        this.carUnique = carUnique;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getInnerId() {
        return innerId;
    }

    public void setInnerId(Long innerId) {
        this.innerId = innerId;
    }

    public Long getOuterId() {
        return outerId;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    public String getOuterColorName() {
        return outerColorName;
    }

    public void setOuterColorName(String outerColorName) {
        this.outerColorName = outerColorName;
    }

    public String getInnerColorName() {
        return innerColorName;
    }

    public void setInnerColorName(String innerColorName) {
        this.innerColorName = innerColorName;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public Integer getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Integer benchmark) {
        this.benchmark = benchmark;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSanbao() {
        return sanbao;
    }

    public void setSanbao(Integer sanbao) {
        this.sanbao = sanbao;
    }

    public Long getTipLoanAmount() {
        return tipLoanAmount;
    }

    public void setTipLoanAmount(Long tipLoanAmount) {
        this.tipLoanAmount = tipLoanAmount;
    }

    public Long getTipMarginAmount() {
        return tipMarginAmount;
    }

    public void setTipMarginAmount(Long tipMarginAmount) {
        this.tipMarginAmount = tipMarginAmount;
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


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public Date getProSubmitProcedureTime() {
        if(proSubmitProcedureTime == null){
            return null;
        }
        return (Date)proSubmitProcedureTime.clone();
    }

    public void setProSubmitProcedureTime(Date proSubmitProcedureTime) {
        if(proSubmitProcedureTime == null){
            this.proSubmitProcedureTime = null;
        }else{
            this.proSubmitProcedureTime = (Date)proSubmitProcedureTime.clone();
        }
    }


    public Integer getAttach() {
        return attach;
    }

    public void setAttach(Integer attach) {
        this.attach = attach;
    }

    public Long getLoAmount() {
        return loAmount;
    }

    public void setLoAmount(Long loAmount) {
        this.loAmount = loAmount;
    }

    public Long getMarAmount() {
        return marAmount;
    }

    public void setMarAmount(Long marAmount) {
        this.marAmount = marAmount;
    }

    public String getCarLoanNo() {
        return carLoanNo;
    }

    public void setCarLoanNo(String carLoanNo) {
        this.carLoanNo = carLoanNo;
    }

    public Integer getUniqueNum() {
        return uniqueNum;
    }

    public void setUniqueNum(Integer uniqueNum) {
        this.uniqueNum = uniqueNum;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

}