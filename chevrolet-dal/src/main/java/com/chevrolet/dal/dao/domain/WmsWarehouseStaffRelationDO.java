package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseStaffRelationDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse_staff_relation.relation_id
     */
    private Long relationId;

    /**
     * database column wms_warehouse_staff_relation.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_warehouse_staff_relation.staff_id
     */
    private Long staffId;

    /**
     * database column wms_warehouse_staff_relation.staff_name
     */
    private String staffName;

    /**
     * database column wms_warehouse_staff_relation.staff_mobile
     */
    private String staffMobile;

    /**
     * database column wms_warehouse_staff_relation.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse_staff_relation.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_warehouse_staff_relation.status
     */
    private Integer status;

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffMobile() {
        return staffMobile;
    }

    public void setStaffMobile(String staffMobile) {
        this.staffMobile = staffMobile;
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

}