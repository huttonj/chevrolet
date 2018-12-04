package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;
/**  
 * <p> 车辆在贷表 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午1:52
 * @since V1.0
 */
public class CarLoanDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car_loan.car_loan_id
     * 主键ID
     */
    private Long carLoanId;

    /**
     * database column cc_car_loan.car_id
     * 车辆ID
     */
    private Long carId;

    /**
     * database column cc_car_loan.car_loan_order_no
     * 车押贷订单编号
     */
    private String carLoanOrderNo;

    /**
     * database column cc_car_loan.split_order_no
     * 拆单批次号
     */
    private String splitOrderNo;

    /**
     * database column cc_car_loan.car_status
     * 车辆状态 -1仓库拒收,0未入库，1待验车，3待发车，5待核价，10待手续确认，15运输中，20监管中，30回款中，40退款中，50待提车，100已完成
     */
    private Integer carStatus;

    /**
     * database column cc_car_loan.loan_order_type
     * 订单类型
     */
    private Integer loanOrderType;

    /**
     * database column cc_car_loan.pricing_amount_first
     * 首期核价金额
     */
    private Long pricingAmountFirst;

    /**
     * database column cc_car_loan.single_loamount
     * 单辆车的垫资金额(分/辆)
     */
    private Long singleLoamount;

    /**
     * database column cc_car_loan.single_maramount
     * 单辆车的保证金（分/辆）已废弃
     */
    private Long singleMaramount;

    /**
     * database column cc_car_loan.warehouse_id
     * 仓库id 已废弃
     */
    private Long warehouseId;

    /**
     * database column cc_car_loan.pre_warehouse_id
     * 预存仓库id
     */
    private Long preWarehouseId;

    /**
     * database column cc_car_loan.logistics_mode
     * 物流模式
     */
    private Integer logisticsMode;

    /**
     * database column cc_car_loan.hot_model
     * 是否热门车型 0 否 1是
     */
    private Integer hotModel;

    /**
     * database column cc_car_loan.market_price
     * 行情单价
     */
    private String marketPrice;

    /**
     * database column cc_car_loan.dest_province_id
     * 目的地省份id 已废弃
     */
    private Integer destProvinceId;

    /**
     * database column cc_car_loan.dest_province_name
     * 目的地省份name 已废弃
     */
    private String destProvinceName;

    /**
     * database column cc_car_loan.dest_city_id
     * 目的地城市id 已废弃
     */
    private Integer destCityId;

    /**
     * database column cc_car_loan.dest_city_name
     * 目的地城市name 已废弃
     */
    private String destCityName;

    /**
     * database column cc_car_loan.repay_time
     * 结算日期
     */
    private Date repayTime;

    /**
     * database column cc_car_loan.loan_rate
     * 质押率
     */
    private String loanRate;

    /**
     * database column cc_car_loan.img_formality
     * 手续照片
     */
    private String imgFormality;

    /**
     * database column cc_car_loan.configure
     */
    private String configure;

    /**
     * database column cc_car_loan.confirm_vehicle
     * 异常照片验车结果 -1不接受 0待确认 1接受
     */
    private Integer confirmVehicle;

    /**
     * database column cc_car_loan.retrofitting
     * 是否加装 0否 1是
     */
    private Integer retrofitting;

    /**
     * database column cc_car_loan.tms_payment_no
     * 物流结算单 已废弃
     */
    private String tmsPaymentNo;

    /**
     * database column cc_car_loan.wms_payment_no
     * 仓储结算单 已废弃
     */
    private String wmsPaymentNo;

    /**
     * database column cc_car_loan.unit_contract_price
     * 每辆车的合同单价
     */
    private Long unitContractPrice;

    /**
     * database column cc_car_loan.current_operator_id
     * 当前操作人员id
     */
    private Long currentOperatorId;

    /**
     * database column cc_car_loan.current_operator_name
     * 当前操作人员name
     */
    private String currentOperatorName;

    /**
     * database column cc_car_loan.margin_ratio
     * 保证金比率
     */
    private String marginRatio;

    /**
     * database column cc_car_loan.rule_calculation_bail
     * 规则保证金
     */
    private Long ruleCalculationBail;

    /**
     * database column cc_car_loan.second_kill_flag
     * 是否加装 0默认 1标记
     */
    private Integer secondKillFlag;

    /**
     * database column cc_car_loan.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_car_loan.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_car_loan.is_deleted
     */
    private Integer isDeleted;

    /**
     * database column cc_car_loan.comment
     * 评论
     */
    private String comment;

    /**
     * database column cc_car_loan.is_wms_car_apply
     * 是否在库车发起 0否 1是
     */
    private Integer isWmsCarApply;

    /**
     * database column cc_car_loan.is_buy_back
     */
    private Integer isBuyBack;

    /**
     * database column cc_car_loan.repurchase_time
     */
    private Date repurchaseTime;

    public Long getCarLoanId() {
        return carLoanId;
    }

    public void setCarLoanId(Long carLoanId) {
        this.carLoanId = carLoanId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarLoanOrderNo() {
        return carLoanOrderNo;
    }

    public void setCarLoanOrderNo(String carLoanOrderNo) {
        this.carLoanOrderNo = carLoanOrderNo;
    }

    public String getSplitOrderNo() {
        return splitOrderNo;
    }

    public void setSplitOrderNo(String splitOrderNo) {
        this.splitOrderNo = splitOrderNo;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Integer getLoanOrderType() {
        return loanOrderType;
    }

    public void setLoanOrderType(Integer loanOrderType) {
        this.loanOrderType = loanOrderType;
    }

    public Long getPricingAmountFirst() {
        return pricingAmountFirst;
    }

    public void setPricingAmountFirst(Long pricingAmountFirst) {
        this.pricingAmountFirst = pricingAmountFirst;
    }

    public Long getSingleLoamount() {
        return singleLoamount;
    }

    public void setSingleLoamount(Long singleLoamount) {
        this.singleLoamount = singleLoamount;
    }

    public Long getSingleMaramount() {
        return singleMaramount;
    }

    public void setSingleMaramount(Long singleMaramount) {
        this.singleMaramount = singleMaramount;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getPreWarehouseId() {
        return preWarehouseId;
    }

    public void setPreWarehouseId(Long preWarehouseId) {
        this.preWarehouseId = preWarehouseId;
    }

    public Integer getLogisticsMode() {
        return logisticsMode;
    }

    public void setLogisticsMode(Integer logisticsMode) {
        this.logisticsMode = logisticsMode;
    }

    public Integer getHotModel() {
        return hotModel;
    }

    public void setHotModel(Integer hotModel) {
        this.hotModel = hotModel;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getDestProvinceId() {
        return destProvinceId;
    }

    public void setDestProvinceId(Integer destProvinceId) {
        this.destProvinceId = destProvinceId;
    }

    public String getDestProvinceName() {
        return destProvinceName;
    }

    public void setDestProvinceName(String destProvinceName) {
        this.destProvinceName = destProvinceName;
    }

    public Integer getDestCityId() {
        return destCityId;
    }

    public void setDestCityId(Integer destCityId) {
        this.destCityId = destCityId;
    }

    public String getDestCityName() {
        return destCityName;
    }

    public void setDestCityName(String destCityName) {
        this.destCityName = destCityName;
    }

    public Date getRepayTime() {
        if(repayTime == null){
            return null;
        }
        return (Date)repayTime.clone();
    }

    public void setRepayTime(Date repayTime) {
        if(repayTime == null){
            this.repayTime = null;
        }else{
            this.repayTime = (Date)repayTime.clone();
        }
    }


    public String getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(String loanRate) {
        this.loanRate = loanRate;
    }

    public String getImgFormality() {
        return imgFormality;
    }

    public void setImgFormality(String imgFormality) {
        this.imgFormality = imgFormality;
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure;
    }

    public Integer getConfirmVehicle() {
        return confirmVehicle;
    }

    public void setConfirmVehicle(Integer confirmVehicle) {
        this.confirmVehicle = confirmVehicle;
    }

    public Integer getRetrofitting() {
        return retrofitting;
    }

    public void setRetrofitting(Integer retrofitting) {
        this.retrofitting = retrofitting;
    }

    public String getTmsPaymentNo() {
        return tmsPaymentNo;
    }

    public void setTmsPaymentNo(String tmsPaymentNo) {
        this.tmsPaymentNo = tmsPaymentNo;
    }

    public String getWmsPaymentNo() {
        return wmsPaymentNo;
    }

    public void setWmsPaymentNo(String wmsPaymentNo) {
        this.wmsPaymentNo = wmsPaymentNo;
    }

    public Long getUnitContractPrice() {
        return unitContractPrice;
    }

    public void setUnitContractPrice(Long unitContractPrice) {
        this.unitContractPrice = unitContractPrice;
    }

    public Long getCurrentOperatorId() {
        return currentOperatorId;
    }

    public void setCurrentOperatorId(Long currentOperatorId) {
        this.currentOperatorId = currentOperatorId;
    }

    public String getCurrentOperatorName() {
        return currentOperatorName;
    }

    public void setCurrentOperatorName(String currentOperatorName) {
        this.currentOperatorName = currentOperatorName;
    }

    public String getMarginRatio() {
        return marginRatio;
    }

    public void setMarginRatio(String marginRatio) {
        this.marginRatio = marginRatio;
    }

    public Long getRuleCalculationBail() {
        return ruleCalculationBail;
    }

    public void setRuleCalculationBail(Long ruleCalculationBail) {
        this.ruleCalculationBail = ruleCalculationBail;
    }

    public Integer getSecondKillFlag() {
        return secondKillFlag;
    }

    public void setSecondKillFlag(Integer secondKillFlag) {
        this.secondKillFlag = secondKillFlag;
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


    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getIsWmsCarApply() {
        return isWmsCarApply;
    }

    public void setIsWmsCarApply(Integer isWmsCarApply) {
        this.isWmsCarApply = isWmsCarApply;
    }

    public Integer getIsBuyBack() {
        return isBuyBack;
    }

    public void setIsBuyBack(Integer isBuyBack) {
        this.isBuyBack = isBuyBack;
    }

    public Date getRepurchaseTime() {
        if(repurchaseTime == null){
            return null;
        }
        return (Date)repurchaseTime.clone();
    }

    public void setRepurchaseTime(Date repurchaseTime) {
        if(repurchaseTime == null){
            this.repurchaseTime = null;
        }else{
            this.repurchaseTime = (Date)repurchaseTime.clone();
        }
    }

}