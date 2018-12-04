package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseAreaPositionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse_area_position.area_position_id
     */
    private Long areaPositionId;

    /**
     * database column wms_warehouse_area_position.warehouse_id
     */
    private Long warehouseId;

    /**
     * database column wms_warehouse_area_position.area_id
     */
    private Integer areaId;

    /**
     * database column wms_warehouse_area_position.area_name
     */
    private String areaName;

    /**
     * database column wms_warehouse_area_position.row_id
     */
    private Integer rowId;

    /**
     * database column wms_warehouse_area_position.row_name
     */
    private String rowName;

    /**
     * database column wms_warehouse_area_position.location_id
     */
    private Integer locationId;

    /**
     * database column wms_warehouse_area_position.location_name
     */
    private String locationName;

    /**
     * database column wms_warehouse_area_position.status
     */
    private Integer status;

    /**
     * database column wms_warehouse_area_position.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column wms_warehouse_area_position.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse_area_position.occupied
     */
    private Integer occupied;

    /**
     * database column wms_warehouse_area_position.graphic_x
     */
    private Integer graphicX;

    /**
     * database column wms_warehouse_area_position.graphic_y
     */
    private Integer graphicY;

    public Long getAreaPositionId() {
        return areaPositionId;
    }

    public void setAreaPositionId(Long areaPositionId) {
        this.areaPositionId = areaPositionId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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


    public Integer getOccupied() {
        return occupied;
    }

    public void setOccupied(Integer occupied) {
        this.occupied = occupied;
    }

    public Integer getGraphicX() {
        return graphicX;
    }

    public void setGraphicX(Integer graphicX) {
        this.graphicX = graphicX;
    }

    public Integer getGraphicY() {
        return graphicY;
    }

    public void setGraphicY(Integer graphicY) {
        this.graphicY = graphicY;
    }

}