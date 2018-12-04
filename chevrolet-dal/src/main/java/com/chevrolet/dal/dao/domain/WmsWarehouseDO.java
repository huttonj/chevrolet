package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_warehouse.warehouse_no
     */
    private String warehouseNo;

    /**
     * database column wms_warehouse.name
     */
    private String name;

    /**
     * database column wms_warehouse.address
     */
    private String address;

    /**
     * database column wms_warehouse.province_id
     */
    private Long provinceId;

    /**
     * database column wms_warehouse.city_id
     */
    private Long cityId;

    /**
     * database column wms_warehouse.capacity
     */
    private Long capacity;

    /**
     * database column wms_warehouse.used_capacity
     */
    private Long usedCapacity;

    /**
     * database column wms_warehouse.type
     */
    private Integer type;

    /**
     * database column wms_warehouse.status
     */
    private Integer status;

    /**
     * database column wms_warehouse.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_warehouse.memo
     */
    private String memo;

    /**
     * database column wms_warehouse.supervision_rule_id
     */
    private Long supervisionRuleId;

    /**
     * database column wms_warehouse.service_rule_id
     */
    private Long serviceRuleId;

    /**
     * database column wms_warehouse.use_pda
     */
    private Boolean usePda;

    /**
     * database column wms_warehouse.use_position
     */
    private Boolean usePosition;

    /**
     * database column wms_warehouse.img_warehouse
     */
    private String imgWarehouse;

    /**
     * database column wms_warehouse.rental_agreement
     */
    private String rentalAgreement;

    /**
     * database column wms_warehouse.rent_start_time
     */
    private java.sql.Date rentStartTime;

    /**
     * database column wms_warehouse.rent_end_time
     */
    private java.sql.Date rentEndTime;

    /**
     * database column wms_warehouse.rent
     */
    private Long rent;

    /**
     * database column wms_warehouse.hosting_cost
     */
    private Long hostingCost;

    /**
     * database column wms_warehouse.rent_expiry_time
     */
    private java.sql.Date rentExpiryTime;

    /**
     * database column wms_warehouse.cost_effective_time
     */
    private java.sql.Date costEffectiveTime;

    /**
     * database column wms_warehouse.cost_expiry_time
     */
    private java.sql.Date costExpiryTime;

    /**
     * database column wms_warehouse.insurance_policy
     */
    private String insurancePolicy;

    /**
     * database column wms_warehouse.insurance_effective_time
     */
    private java.sql.Date insuranceEffectiveTime;

    /**
     * database column wms_warehouse.insurance_expiry_time
     */
    private java.sql.Date insuranceExpiryTime;

    /**
     * database column wms_warehouse.insurance_cost
     */
    private Long insuranceCost;

    /**
     * database column wms_warehouse.region
     */
    private String region;

    /**
     * database column wms_warehouse.bulid_dealer
     */
    private String bulidDealer;

    /**
     * database column wms_warehouse.dealer_type
     */
    private String dealerType;

    /**
     * database column wms_warehouse.dealer_brand
     */
    private String dealerBrand;

    /**
     * database column wms_warehouse.dock_person
     */
    private String dockPerson;

    /**
     * database column wms_warehouse.dock_person_phone
     */
    private String dockPersonPhone;

    /**
     * database column wms_warehouse.regulatory_type
     */
    private String regulatoryType;

    /**
     * database column wms_warehouse.regulatory_agreement
     */
    private String regulatoryAgreement;

    /**
     * database column wms_warehouse.sign_time
     */
    private java.sql.Date signTime;

    /**
     * database column wms_warehouse.regulatory_expiry_time
     */
    private java.sql.Date regulatoryExpiryTime;

    /**
     * database column wms_warehouse.business_agreement
     */
    private String businessAgreement;

    /**
     * database column wms_warehouse.regulatory_cost
     */
    private Long regulatoryCost;

    /**
     * database column wms_warehouse.regulatory_cost_effective_time
     */
    private java.sql.Date regulatoryCostEffectiveTime;

    /**
     * database column wms_warehouse.regulatory_cost_expiry_time
     */
    private java.sql.Date regulatoryCostExpiryTime;

    /**
     * database column wms_warehouse.margin_voucher
     */
    private String marginVoucher;

    /**
     * database column wms_warehouse.longitude
     */
    private java.math.BigDecimal longitude;

    /**
     * database column wms_warehouse.latitude
     */
    private java.math.BigDecimal latitude;

    /**
     * database column wms_warehouse.county_id
     */
    private Long countyId;

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getSupervisionRuleId() {
        return supervisionRuleId;
    }

    public void setSupervisionRuleId(Long supervisionRuleId) {
        this.supervisionRuleId = supervisionRuleId;
    }

    public Long getServiceRuleId() {
        return serviceRuleId;
    }

    public void setServiceRuleId(Long serviceRuleId) {
        this.serviceRuleId = serviceRuleId;
    }

    public Boolean getUsePda() {
        return usePda;
    }

    public void setUsePda(Boolean usePda) {
        this.usePda = usePda;
    }

    public Boolean getUsePosition() {
        return usePosition;
    }

    public void setUsePosition(Boolean usePosition) {
        this.usePosition = usePosition;
    }

    public String getImgWarehouse() {
        return imgWarehouse;
    }

    public void setImgWarehouse(String imgWarehouse) {
        this.imgWarehouse = imgWarehouse;
    }

    public String getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(String rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public java.sql.Date getRentStartTime() {
        return rentStartTime;
    }

    public void setRentStartTime(java.sql.Date rentStartTime) {
        this.rentStartTime = rentStartTime;
    }

    public java.sql.Date getRentEndTime() {
        return rentEndTime;
    }

    public void setRentEndTime(java.sql.Date rentEndTime) {
        this.rentEndTime = rentEndTime;
    }

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public Long getHostingCost() {
        return hostingCost;
    }

    public void setHostingCost(Long hostingCost) {
        this.hostingCost = hostingCost;
    }

    public java.sql.Date getRentExpiryTime() {
        return rentExpiryTime;
    }

    public void setRentExpiryTime(java.sql.Date rentExpiryTime) {
        this.rentExpiryTime = rentExpiryTime;
    }

    public java.sql.Date getCostEffectiveTime() {
        return costEffectiveTime;
    }

    public void setCostEffectiveTime(java.sql.Date costEffectiveTime) {
        this.costEffectiveTime = costEffectiveTime;
    }

    public java.sql.Date getCostExpiryTime() {
        return costExpiryTime;
    }

    public void setCostExpiryTime(java.sql.Date costExpiryTime) {
        this.costExpiryTime = costExpiryTime;
    }

    public String getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(String insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
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

    public Long getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Long insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBulidDealer() {
        return bulidDealer;
    }

    public void setBulidDealer(String bulidDealer) {
        this.bulidDealer = bulidDealer;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public String getDealerBrand() {
        return dealerBrand;
    }

    public void setDealerBrand(String dealerBrand) {
        this.dealerBrand = dealerBrand;
    }

    public String getDockPerson() {
        return dockPerson;
    }

    public void setDockPerson(String dockPerson) {
        this.dockPerson = dockPerson;
    }

    public String getDockPersonPhone() {
        return dockPersonPhone;
    }

    public void setDockPersonPhone(String dockPersonPhone) {
        this.dockPersonPhone = dockPersonPhone;
    }

    public String getRegulatoryType() {
        return regulatoryType;
    }

    public void setRegulatoryType(String regulatoryType) {
        this.regulatoryType = regulatoryType;
    }

    public String getRegulatoryAgreement() {
        return regulatoryAgreement;
    }

    public void setRegulatoryAgreement(String regulatoryAgreement) {
        this.regulatoryAgreement = regulatoryAgreement;
    }

    public java.sql.Date getSignTime() {
        return signTime;
    }

    public void setSignTime(java.sql.Date signTime) {
        this.signTime = signTime;
    }

    public java.sql.Date getRegulatoryExpiryTime() {
        return regulatoryExpiryTime;
    }

    public void setRegulatoryExpiryTime(java.sql.Date regulatoryExpiryTime) {
        this.regulatoryExpiryTime = regulatoryExpiryTime;
    }

    public String getBusinessAgreement() {
        return businessAgreement;
    }

    public void setBusinessAgreement(String businessAgreement) {
        this.businessAgreement = businessAgreement;
    }

    public Long getRegulatoryCost() {
        return regulatoryCost;
    }

    public void setRegulatoryCost(Long regulatoryCost) {
        this.regulatoryCost = regulatoryCost;
    }

    public java.sql.Date getRegulatoryCostEffectiveTime() {
        return regulatoryCostEffectiveTime;
    }

    public void setRegulatoryCostEffectiveTime(java.sql.Date regulatoryCostEffectiveTime) {
        this.regulatoryCostEffectiveTime = regulatoryCostEffectiveTime;
    }

    public java.sql.Date getRegulatoryCostExpiryTime() {
        return regulatoryCostExpiryTime;
    }

    public void setRegulatoryCostExpiryTime(java.sql.Date regulatoryCostExpiryTime) {
        this.regulatoryCostExpiryTime = regulatoryCostExpiryTime;
    }

    public String getMarginVoucher() {
        return marginVoucher;
    }

    public void setMarginVoucher(String marginVoucher) {
        this.marginVoucher = marginVoucher;
    }

    public java.math.BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }

    public java.math.BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

}