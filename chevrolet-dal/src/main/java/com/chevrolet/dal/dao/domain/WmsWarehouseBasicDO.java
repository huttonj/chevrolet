package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseBasicDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse_basic.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_warehouse_basic.warehouse_no
     */
    private String warehouseNo;

    /**
     * database column wms_warehouse_basic.name
     */
    private String name;

    /**
     * database column wms_warehouse_basic.internal_name
     */
    private String internalName;

    /**
     * database column wms_warehouse_basic.region
     */
    private Long region;

    /**
     * database column wms_warehouse_basic.prov_area_id
     */
    private Long provAreaId;

    /**
     * database column wms_warehouse_basic.province_id
     */
    private Long provinceId;

    /**
     * database column wms_warehouse_basic.city_id
     */
    private Long cityId;

    /**
     * database column wms_warehouse_basic.county_id
     */
    private Long countyId;

    /**
     * database column wms_warehouse_basic.address
     */
    private String address;

    /**
     * database column wms_warehouse_basic.type
     */
    private Integer type;

    /**
     * database column wms_warehouse_basic.warehouse_status
     */
    private Integer warehouseStatus;

    /**
     * database column wms_warehouse_basic.latitude
     */
    private java.math.BigDecimal latitude;

    /**
     * database column wms_warehouse_basic.longitude
     */
    private java.math.BigDecimal longitude;

    /**
     * database column wms_warehouse_basic.memo
     */
    private String memo;

    /**
     * database column wms_warehouse_basic.use_pda
     */
    private Integer usePda;

    /**
     * database column wms_warehouse_basic.use_position
     */
    private Integer usePosition;

    /**
     * database column wms_warehouse_basic.notice_rule
     */
    private String noticeRule;

    /**
     * database column wms_warehouse_basic.is_schedule
     */
    private Integer isSchedule;

    /**
     * database column wms_warehouse_basic.monitoring
     */
    private Integer monitoring;

    /**
     * database column wms_warehouse_basic.status
     */
    private Integer status;

    /**
     * database column wms_warehouse_basic.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse_basic.gmt_modified
     */
    private Date gmtModified;

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

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public Long getProvAreaId() {
        return provAreaId;
    }

    public void setProvAreaId(Long provAreaId) {
        this.provAreaId = provAreaId;
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

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWarehouseStatus() {
        return warehouseStatus;
    }

    public void setWarehouseStatus(Integer warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }

    public java.math.BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }

    public java.math.BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getUsePda() {
        return usePda;
    }

    public void setUsePda(Integer usePda) {
        this.usePda = usePda;
    }

    public Integer getUsePosition() {
        return usePosition;
    }

    public void setUsePosition(Integer usePosition) {
        this.usePosition = usePosition;
    }

    public String getNoticeRule() {
        return noticeRule;
    }

    public void setNoticeRule(String noticeRule) {
        this.noticeRule = noticeRule;
    }

    public Integer getIsSchedule() {
        return isSchedule;
    }

    public void setIsSchedule(Integer isSchedule) {
        this.isSchedule = isSchedule;
    }

    public Integer getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Integer monitoring) {
        this.monitoring = monitoring;
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