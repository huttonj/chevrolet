package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class WmsWarehouseCarMoveRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column wms_warehouse_car_move_record.record_id
     */
    private Long recordId;

    /**
     * database column wms_warehouse_car_move_record.old_car_id
     */
    private Long oldCarId;

    /**
     * database column wms_warehouse_car_move_record.new_car_id
     */
    private Long newCarId;

    /**
     * database column wms_warehouse_car_move_record.old_warehouse_id
     */
    private Long oldWarehouseId;

    /**
     * database column wms_warehouse_car_move_record.new_warehouse_id
     */
    private Long newWarehouseId;

    /**
     * database column wms_warehouse_car_move_record.car_status_before_move
     */
    private Integer carStatusBeforeMove;

    /**
     * database column wms_warehouse_car_move_record.move_status
     */
    private Integer moveStatus;

    /**
     * database column wms_warehouse_car_move_record.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column wms_warehouse_car_move_record.gmt_modified
     */
    private Date gmtModified;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getOldCarId() {
        return oldCarId;
    }

    public void setOldCarId(Long oldCarId) {
        this.oldCarId = oldCarId;
    }

    public Long getNewCarId() {
        return newCarId;
    }

    public void setNewCarId(Long newCarId) {
        this.newCarId = newCarId;
    }

    public Long getOldWarehouseId() {
        return oldWarehouseId;
    }

    public void setOldWarehouseId(Long oldWarehouseId) {
        this.oldWarehouseId = oldWarehouseId;
    }

    public Long getNewWarehouseId() {
        return newWarehouseId;
    }

    public void setNewWarehouseId(Long newWarehouseId) {
        this.newWarehouseId = newWarehouseId;
    }

    public Integer getCarStatusBeforeMove() {
        return carStatusBeforeMove;
    }

    public void setCarStatusBeforeMove(Integer carStatusBeforeMove) {
        this.carStatusBeforeMove = carStatusBeforeMove;
    }

    public Integer getMoveStatus() {
        return moveStatus;
    }

    public void setMoveStatus(Integer moveStatus) {
        this.moveStatus = moveStatus;
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