package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 运单表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:37 
 * @since V1.0 
 */
public class TmsTransportOrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_transport_order.transport_order_id
     * 运单ID
     */
    private Long transportOrderId;

    /**
     * database column tms_transport_order.order_no
     * 运单编号
     */
    private String orderNo;

    /**
     * database column tms_transport_order.biz_id
     * 业务订单Id，如果未绑定，则为null，已废弃
     */
    private Long bizId;

    /**
     * database column tms_transport_order.biz_order_no
     * 业务订单编号
     */
    private String bizOrderNo;

    /**
     * database column tms_transport_order.biz_order_name
     * 业务订单名称
     */
    private String bizOrderName;

    /**
     * database column tms_transport_order.biz_type
     * 业务类型：1-业外运单；2-业内运单
     */
    private Integer bizType;

    /**
     * database column tms_transport_order.source_type
     * 运单的来源类型：0-未知；1-订单宝；2-纯业外物流；3-wms调拨；4-lincoln；5-秒车库
     */
    private Integer sourceType;

    /**
     * database column tms_transport_order.carrier_id
     * 承运商Id，如果是非tms系统中的承运商，就设置为0
     */
    private Long carrierId;

    /**
     * database column tms_transport_order.carrier_name
     * 承运商名称
     */
    private String carrierName;

    /**
     * database column tms_transport_order.carrier_staff_id
     * 承运商人员Id
     */
    private Long carrierStaffId;

    /**
     * database column tms_transport_order.staff_name
     * 承运商人员名字（筋斗云并不提供这个信息）
     */
    private String staffName;

    /**
     * database column tms_transport_order.staff_phone_number
     * 承运商人员电话号码（筋斗云并不提供这个信息）
     */
    private String staffPhoneNumber;

    /**
     * database column tms_transport_order.client_id
     * 客户公司Id，来源于CRM的经销商ID
     */
    private Long clientId;

    /**
     * database column tms_transport_order.client_name
     * 客户公司名称，来源于CRM的经销商名称
     */
    private String clientName;

    /**
     * database column tms_transport_order.client_contact_id
     * 客户联系人Id，数据来源于CRM的Person表
     */
    private Long clientContactId;

    /**
     * database column tms_transport_order.client_contact
     * 客户联系人姓名
     */
    private String clientContact;

    /**
     * database column tms_transport_order.client_contact_phone
     * 客户联系人电话号码
     */
    private String clientContactPhone;

    /**
     * database column tms_transport_order.img_transport_contract
     * 运输合同（当合同有多张图片的时候，需要以''|''字符分割）
     */
    private String imgTransportContract;

    /**
     * database column tms_transport_order.shipment_time
     * 客户预计的发运时间
     */
    private Date shipmentTime;

    /**
     * database column tms_transport_order.payment_time
     * 支付时间
     */
    private Date paymentTime;

    /**
     * database column tms_transport_order.has_invoice
     * 是否开具发票：0-无发票；1-有发票；2-开具普通服务性发票
     */
    private Integer hasInvoice;

    /**
     * database column tms_transport_order.transport_price
     * 运价（以分为单位进行存储），已废弃
     */
    private Integer transportPrice;

    /**
     * database column tms_transport_order.service_price
     * 服务费（以分为单位进行存储），已废弃
     */
    private Integer servicePrice;

    /**
     * database column tms_transport_order.insurance
     * 保险费（以分为单位进行存储），已废弃
     */
    private Integer insurance;

    /**
     * database column tms_transport_order.consignee
     * 提车联系人
     */
    private String consignee;

    /**
     * database column tms_transport_order.consignee_phone
     * 提车人联系方式
     */
    private String consigneePhone;

    /**
     * database column tms_transport_order.consignee_address
     * 提车的详细地址
     */
    private String consigneeAddress;

    /**
     * database column tms_transport_order.order_status
     * 运单的状态：1-待收款；2-进行中；3-已完成；4-失效
     */
    private Integer orderStatus;

    /**
     * database column tms_transport_order.carrier_source_type
     * 承运商来源表：1-系统运单；2-筋斗云，已废弃
     */
    private Integer carrierSourceType;

    /**
     * database column tms_transport_order.out_transport_order_no
     * 外部承运商运单编号
     */
    private String outTransportOrderNo;

    /**
     * database column tms_transport_order.client_remarks
     * 客户备注
     */
    private String clientRemarks;

    /**
     * database column tms_transport_order.dispatcher_remarks
     * 调度员备注
     */
    private String dispatcherRemarks;

    /**
     * database column tms_transport_order.commissioner
     * 物流专员（编辑后台运单信息的时候，进行记录该员工姓名）
     */
    private String commissioner;

    /**
     * database column tms_transport_order.controlled_status
     * 路线的监管状态：0，无监管；1，可监管
     */
    private Integer controlledStatus;

    /**
     * database column tms_transport_order.qr_code
     * 二维码（微信小程序验车）
     */
    private String qrCode;

    /**
     * database column tms_transport_order.status
     * 记录的状态：1-有效；0-失效
     */
    private Integer status;

    /**
     * database column tms_transport_order.old_transport_price
     *修改前运费，已废弃
     */
    private Integer oldTransportPrice;

    /**
     * database column tms_transport_order.transport_type
     * 运输类型: 1 卖好车大板车;2 卖好车救援车; 99 厂家包邮
     */
    private Integer transportType;

    /**
     * database column tms_transport_order.examine_status
     * 审核状态：针对救援车的价格审核，即是否录入了运单下所有车辆的价格;0:未审核，1:已审核
     */
    private Integer examineStatus;

    /**
     * database column tms_transport_order.finance_review_status
     * 财务审核状态:对于金融的运单，财务审核的状态，控制是否可以通知验车--0:未审核，1:已审核
     */
    private Integer financeReviewStatus;

    /**
     * database column tms_transport_order.finance_loan_status
     * 财务放款状态:金融运单的财务放款状态，用来控制是否可以通知发运--0:未放款，1:已放款
     */
    private Integer financeLoanStatus;

    /**
     * database column tms_transport_order.distribute_model
     * 分配模式：1-承包模式；2-抢单模式
     */
    private Integer distributeModel;

    /**
     * database column tms_transport_order.distribute_status
     * 分配状态：1 报价中；2-待分配；3-已分配完成
     */
    private Integer distributeStatus;

    /**
     * database column tms_transport_order.distribute_time
     * 分配时间
     */
    private Date distributeTime;

    /**
     * database column tms_transport_order.allot_price_status
     * 0-无需确认运费；10-未确认运费；20-已经确认过运费
     */
    private Integer allotPriceStatus;

    /**
     * database column tms_transport_order.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_transport_order.gmt_modified
     */
    private Date gmtModified;

    public Long getTransportOrderId() {
        return transportOrderId;
    }

    public void setTransportOrderId(Long transportOrderId) {
        this.transportOrderId = transportOrderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public String getBizOrderNo() {
        return bizOrderNo;
    }

    public void setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
    }

    public String getBizOrderName() {
        return bizOrderName;
    }

    public void setBizOrderName(String bizOrderName) {
        this.bizOrderName = bizOrderName;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Long getCarrierStaffId() {
        return carrierStaffId;
    }

    public void setCarrierStaffId(Long carrierStaffId) {
        this.carrierStaffId = carrierStaffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhoneNumber() {
        return staffPhoneNumber;
    }

    public void setStaffPhoneNumber(String staffPhoneNumber) {
        this.staffPhoneNumber = staffPhoneNumber;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getClientContactId() {
        return clientContactId;
    }

    public void setClientContactId(Long clientContactId) {
        this.clientContactId = clientContactId;
    }

    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public String getClientContactPhone() {
        return clientContactPhone;
    }

    public void setClientContactPhone(String clientContactPhone) {
        this.clientContactPhone = clientContactPhone;
    }

    public String getImgTransportContract() {
        return imgTransportContract;
    }

    public void setImgTransportContract(String imgTransportContract) {
        this.imgTransportContract = imgTransportContract;
    }

    public Date getShipmentTime() {
        if(shipmentTime == null){
            return null;
        }
        return (Date)shipmentTime.clone();
    }

    public void setShipmentTime(Date shipmentTime) {
        if(shipmentTime == null){
            this.shipmentTime = null;
        }else{
            this.shipmentTime = (Date)shipmentTime.clone();
        }
    }


    public Date getPaymentTime() {
        if(paymentTime == null){
            return null;
        }
        return (Date)paymentTime.clone();
    }

    public void setPaymentTime(Date paymentTime) {
        if(paymentTime == null){
            this.paymentTime = null;
        }else{
            this.paymentTime = (Date)paymentTime.clone();
        }
    }


    public Integer getHasInvoice() {
        return hasInvoice;
    }

    public void setHasInvoice(Integer hasInvoice) {
        this.hasInvoice = hasInvoice;
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

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCarrierSourceType() {
        return carrierSourceType;
    }

    public void setCarrierSourceType(Integer carrierSourceType) {
        this.carrierSourceType = carrierSourceType;
    }

    public String getOutTransportOrderNo() {
        return outTransportOrderNo;
    }

    public void setOutTransportOrderNo(String outTransportOrderNo) {
        this.outTransportOrderNo = outTransportOrderNo;
    }

    public String getClientRemarks() {
        return clientRemarks;
    }

    public void setClientRemarks(String clientRemarks) {
        this.clientRemarks = clientRemarks;
    }

    public String getDispatcherRemarks() {
        return dispatcherRemarks;
    }

    public void setDispatcherRemarks(String dispatcherRemarks) {
        this.dispatcherRemarks = dispatcherRemarks;
    }

    public String getCommissioner() {
        return commissioner;
    }

    public void setCommissioner(String commissioner) {
        this.commissioner = commissioner;
    }

    public Integer getControlledStatus() {
        return controlledStatus;
    }

    public void setControlledStatus(Integer controlledStatus) {
        this.controlledStatus = controlledStatus;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOldTransportPrice() {
        return oldTransportPrice;
    }

    public void setOldTransportPrice(Integer oldTransportPrice) {
        this.oldTransportPrice = oldTransportPrice;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(Integer examineStatus) {
        this.examineStatus = examineStatus;
    }

    public Integer getFinanceReviewStatus() {
        return financeReviewStatus;
    }

    public void setFinanceReviewStatus(Integer financeReviewStatus) {
        this.financeReviewStatus = financeReviewStatus;
    }

    public Integer getFinanceLoanStatus() {
        return financeLoanStatus;
    }

    public void setFinanceLoanStatus(Integer financeLoanStatus) {
        this.financeLoanStatus = financeLoanStatus;
    }

    public Integer getDistributeModel() {
        return distributeModel;
    }

    public void setDistributeModel(Integer distributeModel) {
        this.distributeModel = distributeModel;
    }

    public Integer getDistributeStatus() {
        return distributeStatus;
    }

    public void setDistributeStatus(Integer distributeStatus) {
        this.distributeStatus = distributeStatus;
    }

    public Date getDistributeTime() {
        if(distributeTime == null){
            return null;
        }
        return (Date)distributeTime.clone();
    }

    public void setDistributeTime(Date distributeTime) {
        if(distributeTime == null){
            this.distributeTime = null;
        }else{
            this.distributeTime = (Date)distributeTime.clone();
        }
    }


    public Integer getAllotPriceStatus() {
        return allotPriceStatus;
    }

    public void setAllotPriceStatus(Integer allotPriceStatus) {
        this.allotPriceStatus = allotPriceStatus;
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