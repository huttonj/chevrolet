package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WarehouseBlockDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column warehouse_block.block_id
     */
    private Long blockId;

    /**
     * database column warehouse_block.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column warehouse_block.capacity
     */
    private Long capacity;

    /**
     * database column warehouse_block.area
     */
    private java.math.BigDecimal area;

    /**
     * database column warehouse_block.is_default
     */
    private Integer isDefault;

    /**
     * database column warehouse_block.status
     */
    private Integer status;

    /**
     * database column warehouse_block.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column warehouse_block.gmt_modified
     */
    private Date gmtModified;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public java.math.BigDecimal getArea() {
        return area;
    }

    public void setArea(java.math.BigDecimal area) {
        this.area = area;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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