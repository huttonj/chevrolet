package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class BlockInsuranceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column block_insurance.insurance_id
     */
    private Long insuranceId;

    /**
     * database column block_insurance.block_id
     */
    private Long blockId;

    /**
     * database column block_insurance.insurance_cost
     */
    private Long insuranceCost;

    /**
     * database column block_insurance.insurance_effective_time
     */
    private java.sql.Date insuranceEffectiveTime;

    /**
     * database column block_insurance.insurance_expiry_time
     */
    private java.sql.Date insuranceExpiryTime;

    /**
     * database column block_insurance.status
     */
    private Integer status;

    /**
     * database column block_insurance.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column block_insurance.gmt_modified
     */
    private Date gmtModified;

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Long getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Long insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public java.sql.Date getInsuranceEffectiveTime() {
        return insuranceEffectiveTime;
    }

    public void setInsuranceEffectiveTime(java.sql.Date insuranceEffectiveTime) {
        this.insuranceEffectiveTime = insuranceEffectiveTime;
    }

    public java.sql.Date getInsuranceExpiryTime() {
        return insuranceExpiryTime;
    }

    public void setInsuranceExpiryTime(java.sql.Date insuranceExpiryTime) {
        this.insuranceExpiryTime = insuranceExpiryTime;
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