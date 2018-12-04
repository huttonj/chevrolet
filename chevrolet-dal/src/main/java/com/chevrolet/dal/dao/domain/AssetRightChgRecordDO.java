package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 物权变更记录 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午11:06
 * @since V1.0
 */
public class AssetRightChgRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_asset_right_chg_record.asset_right_chg_record_id
     * 主键ID
     */
    private Long assetRightChgRecordId;

    /**
     * database column cc_asset_right_chg_record.asset_right
     * 发起人id
     */
    private Long assetRight;

    /**
     * database column cc_asset_right_chg_record.asset_right_name
     * 发起人名称
     */
    private String assetRightName;

    /**
     * database column cc_asset_right_chg_record.asset_right_type
     * 发起人身份类型
     */
    private Integer assetRightType;

    /**
     * database column cc_asset_right_chg_record.partner_id
     * 接收人所在企业ID
     */
    private Long partnerId;

    /**
     * database column cc_asset_right_chg_record.partner_name
     * 接收人所在企业name
     */
    private String partnerName;

    /**
     * database column cc_asset_right_chg_record.user_id
     * 用户ID
     */
    private Long userId;

    /**
     * database column cc_asset_right_chg_record.user_name
     * 用户名称
     */
    private String userName;

    /**
     * database column cc_asset_right_chg_record.receive_key
     * '接收人key:手机号_姓名_身份证号
     */
    private String receiveKey;

    /**
     * database column cc_asset_right_chg_record.car_id_list
     * 关联car_id
     */
    private String carIdList;

    /**
     * database column cc_asset_right_chg_record.contract_id
     * 合同id
     */
    private Long contractId;

    /**
     * database column cc_asset_right_chg_record.record_status
     * 变更单状态 1待签章 2待接收确认 3已完成 4已取消 5已废弃
     */
    private Integer recordStatus;

    /**
     * database column cc_asset_right_chg_record.sign_time
     * 签章时间
     */
    private Date signTime;

    /**
     * database column cc_asset_right_chg_record.confirm_time
     * 接收人确认时间
     */
    private Date confirmTime;

    /**
     * database column cc_asset_right_chg_record.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_asset_right_chg_record.gmt_modified
     */
    private Date gmtModified;

    public Long getAssetRightChgRecordId() {
        return assetRightChgRecordId;
    }

    public void setAssetRightChgRecordId(Long assetRightChgRecordId) {
        this.assetRightChgRecordId = assetRightChgRecordId;
    }

    public Long getAssetRight() {
        return assetRight;
    }

    public void setAssetRight(Long assetRight) {
        this.assetRight = assetRight;
    }

    public String getAssetRightName() {
        return assetRightName;
    }

    public void setAssetRightName(String assetRightName) {
        this.assetRightName = assetRightName;
    }

    public Integer getAssetRightType() {
        return assetRightType;
    }

    public void setAssetRightType(Integer assetRightType) {
        this.assetRightType = assetRightType;
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReceiveKey() {
        return receiveKey;
    }

    public void setReceiveKey(String receiveKey) {
        this.receiveKey = receiveKey;
    }

    public String getCarIdList() {
        return carIdList;
    }

    public void setCarIdList(String carIdList) {
        this.carIdList = carIdList;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getSignTime() {
        if(signTime == null){
            return null;
        }
        return (Date)signTime.clone();
    }

    public void setSignTime(Date signTime) {
        if(signTime == null){
            this.signTime = null;
        }else{
            this.signTime = (Date)signTime.clone();
        }
    }


    public Date getConfirmTime() {
        if(confirmTime == null){
            return null;
        }
        return (Date)confirmTime.clone();
    }

    public void setConfirmTime(Date confirmTime) {
        if(confirmTime == null){
            this.confirmTime = null;
        }else{
            this.confirmTime = (Date)confirmTime.clone();
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