package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 结算申请单 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:33 
 * @since V1.0 
 */
public class PaymentApplyDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_payment_apply.id
     */
    private Long id;

    /**
     * database column b2b_payment_apply.payment_apply_no
     * 申请单号
     */
    private String paymentApplyNo;

    /**
     * database column b2b_payment_apply.dealer_id
     * 经销商ID
     */
    private Long dealerId;

    /**
     * database column b2b_payment_apply.loan_order_id
     * 订单宝ID
     */
    private Long loanOrderId;

    /**
     * database column b2b_payment_apply.car_unique_ids
     * 无效地段，修改为payment_apply_car_list表
     */
    private String carUniqueIds;

    /**
     * database column b2b_payment_apply.shipping_order_id
     * 物流ID
     */
    private Long shippingOrderId;

    /**
     * database column b2b_payment_apply.plan_payment_time
     * 结算日期
     */
    private Date planPaymentTime;

    /**
     * database column b2b_payment_apply.last_apply_time
     * 最后一次打款操作时间
     */
    private Date lastApplyTime;

    /**
     * database column b2b_payment_apply.settlement_time
     * 实际结算日期(大于17点钟，算为明天)
     */
    private String settlementTime;

    /**
     * database column b2b_payment_apply.combined_service_amount
     * 综合服务费用
     */
    private Long combinedServiceAmount;

    /**
     * database column b2b_payment_apply.total_payment
     * 总还款额
     */
    private Long totalPayment;

    /**
     * database column b2b_payment_apply.car_uniques_amount
     * 本结算单的所有车架的垫资总额
     */
    private Long carUniquesAmount;

    /**
     * database column b2b_payment_apply.car_uniques_mara_amount
     * 本结算单的所有车架的保证金总额
     */
    private Long carUniquesMaraAmount;

    /**
     * database column b2b_payment_apply.rate_payment_days
     * 基础费率的收费天数
     */
    private Integer ratePaymentDays;

    /**
     * database column b2b_payment_apply.rate_payment
     * 基础费率对应的应付金额
     */
    private Long ratePayment;

    /**
     * database column b2b_payment_apply.first_payment_days
     * 一阶段费率的收费天数
     */
    private Integer firstPaymentDays;

    /**
     * database column b2b_payment_apply.first_payment
     * 一阶段计费天数
     */
    private Long firstPayment;

    /**
     * database column b2b_payment_apply.secend_payment_days
     * 二阶段费率的收费天数
     */
    private Integer secendPaymentDays;

    /**
     * database column b2b_payment_apply.secend_payment
     * 二阶段计费天数
     */
    private Long secendPayment;

    /**
     * database column b2b_payment_apply.third_payment_days
     * 三阶段费率的收费天数
     */
    private Integer thirdPaymentDays;

    /**
     * database column b2b_payment_apply.third_payment
     * 三阶段计费天数
     */
    private Long thirdPayment;

    /**
     * database column b2b_payment_apply.has_payment
     * 已经还款
     */
    private Long hasPayment;

    /**
     * database column b2b_payment_apply.need_payment
     * 待还款
     */
    private Long needPayment;

    /**
     * database column b2b_payment_apply.rate_rule
     * 费率规则
     */
    private String rateRule;

    /**
     * database column b2b_payment_apply.rete_rule_payment
     * 超期费率计算得出的应付金额:被 first_payment secend_payment third_payment替代
     */
    private Long reteRulePayment;

    /**
     * database column b2b_payment_apply.discount_code
     * 优惠码
     */
    private String discountCode;

    /**
     * database column b2b_payment_apply.discount_rate
     * 优惠汇率
     */
    private java.math.BigDecimal discountRate;

    /**
     * database column b2b_payment_apply.discount_amount
     * 优惠金额:由优惠利率discount_rate计算得来
     */
    private Long discountAmount;

    /**
     * database column b2b_payment_apply.coupon_amount
     * 优惠券金额:直接后台录入,单位:分
     */
    private Long couponAmount;

    /**
     * database column b2b_payment_apply.coupon_type
     * 优惠类型：1其他  2线下优惠券
     */
    private Integer couponType;

    /**
     * database column b2b_payment_apply.coupon_amount_remark
     * 优惠金额coupon_amount的备注
     */
    private String couponAmountRemark;

    /**
     * database column b2b_payment_apply.shipping_amount
     * 物流运费金额
     */
    private Long shippingAmount;

    /**
     * database column b2b_payment_apply.apply_status
     * 结算单状态: 0-待确认, 1-已确认, 2-审核通, 3-审核驳回，4-审核中
     */
    private Integer applyStatus;

    /**
     * database column b2b_payment_apply.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_payment_apply.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_payment_apply.status
     */
    private Integer status;

    /**
     * database column b2b_payment_apply.is_deleted
     */
    private Integer isDeleted;

    /**
     * database column b2b_payment_apply.memo
     * 备注(可用于驳回理由)
     */
    private String memo;

    /**
     * database column b2b_payment_apply.tms_version
     * 物流信息是否存在tms，1为是，0为否，默认为0
     */
    private Integer tmsVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentApplyNo() {
        return paymentApplyNo;
    }

    public void setPaymentApplyNo(String paymentApplyNo) {
        this.paymentApplyNo = paymentApplyNo;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Long getLoanOrderId() {
        return loanOrderId;
    }

    public void setLoanOrderId(Long loanOrderId) {
        this.loanOrderId = loanOrderId;
    }

    public String getCarUniqueIds() {
        return carUniqueIds;
    }

    public void setCarUniqueIds(String carUniqueIds) {
        this.carUniqueIds = carUniqueIds;
    }

    public Long getShippingOrderId() {
        return shippingOrderId;
    }

    public void setShippingOrderId(Long shippingOrderId) {
        this.shippingOrderId = shippingOrderId;
    }

    public Date getPlanPaymentTime() {
        if(planPaymentTime == null){
            return null;
        }
        return (Date)planPaymentTime.clone();
    }

    public void setPlanPaymentTime(Date planPaymentTime) {
        if(planPaymentTime == null){
            this.planPaymentTime = null;
        }else{
            this.planPaymentTime = (Date)planPaymentTime.clone();
        }
    }


    public Date getLastApplyTime() {
        if(lastApplyTime == null){
            return null;
        }
        return (Date)lastApplyTime.clone();
    }

    public void setLastApplyTime(Date lastApplyTime) {
        if(lastApplyTime == null){
            this.lastApplyTime = null;
        }else{
            this.lastApplyTime = (Date)lastApplyTime.clone();
        }
    }


    public String getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(String settlementTime) {
        this.settlementTime = settlementTime;
    }

    public Long getCombinedServiceAmount() {
        return combinedServiceAmount;
    }

    public void setCombinedServiceAmount(Long combinedServiceAmount) {
        this.combinedServiceAmount = combinedServiceAmount;
    }

    public Long getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Long totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Long getCarUniquesAmount() {
        return carUniquesAmount;
    }

    public void setCarUniquesAmount(Long carUniquesAmount) {
        this.carUniquesAmount = carUniquesAmount;
    }

    public Long getCarUniquesMaraAmount() {
        return carUniquesMaraAmount;
    }

    public void setCarUniquesMaraAmount(Long carUniquesMaraAmount) {
        this.carUniquesMaraAmount = carUniquesMaraAmount;
    }

    public Integer getRatePaymentDays() {
        return ratePaymentDays;
    }

    public void setRatePaymentDays(Integer ratePaymentDays) {
        this.ratePaymentDays = ratePaymentDays;
    }

    public Long getRatePayment() {
        return ratePayment;
    }

    public void setRatePayment(Long ratePayment) {
        this.ratePayment = ratePayment;
    }

    public Integer getFirstPaymentDays() {
        return firstPaymentDays;
    }

    public void setFirstPaymentDays(Integer firstPaymentDays) {
        this.firstPaymentDays = firstPaymentDays;
    }

    public Long getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(Long firstPayment) {
        this.firstPayment = firstPayment;
    }

    public Integer getSecendPaymentDays() {
        return secendPaymentDays;
    }

    public void setSecendPaymentDays(Integer secendPaymentDays) {
        this.secendPaymentDays = secendPaymentDays;
    }

    public Long getSecendPayment() {
        return secendPayment;
    }

    public void setSecendPayment(Long secendPayment) {
        this.secendPayment = secendPayment;
    }

    public Integer getThirdPaymentDays() {
        return thirdPaymentDays;
    }

    public void setThirdPaymentDays(Integer thirdPaymentDays) {
        this.thirdPaymentDays = thirdPaymentDays;
    }

    public Long getThirdPayment() {
        return thirdPayment;
    }

    public void setThirdPayment(Long thirdPayment) {
        this.thirdPayment = thirdPayment;
    }

    public Long getHasPayment() {
        return hasPayment;
    }

    public void setHasPayment(Long hasPayment) {
        this.hasPayment = hasPayment;
    }

    public Long getNeedPayment() {
        return needPayment;
    }

    public void setNeedPayment(Long needPayment) {
        this.needPayment = needPayment;
    }

    public String getRateRule() {
        return rateRule;
    }

    public void setRateRule(String rateRule) {
        this.rateRule = rateRule;
    }

    public Long getReteRulePayment() {
        return reteRulePayment;
    }

    public void setReteRulePayment(Long reteRulePayment) {
        this.reteRulePayment = reteRulePayment;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public java.math.BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(java.math.BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponAmountRemark() {
        return couponAmountRemark;
    }

    public void setCouponAmountRemark(String couponAmountRemark) {
        this.couponAmountRemark = couponAmountRemark;
    }

    public Long getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(Long shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getTmsVersion() {
        return tmsVersion;
    }

    public void setTmsVersion(Integer tmsVersion) {
        this.tmsVersion = tmsVersion;
    }

}