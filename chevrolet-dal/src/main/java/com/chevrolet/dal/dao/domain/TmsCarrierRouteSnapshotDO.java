package com.chevrolet.dal.dao.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 运单路线信息快照表 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:11 
 * @since V1.0 
 */
@Data
public class TmsCarrierRouteSnapshotDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_carrier_route_snapshot.route_snapshot_id
     * 承运商路线快照主键Id
     */
    private Long routeSnapshotId;

    /**
     * database column tms_carrier_route_snapshot.route_id
     * 路线ID
     */
    private Long routeId;

    /**
     * database column tms_carrier_route_snapshot.transport_order_id
     * 运单ID
     */
    private Long transportOrderId;

    /**
     * database column tms_carrier_route_snapshot.start_city_id
     * 始发地城市ID
     */
    private Long startCityId;

    /**
     * database column tms_carrier_route_snapshot.start_city_name
     * 始发地城市名称
     */
    private String startCityName;

    /**
     * database column tms_carrier_route_snapshot.destination_city_id
     * 目的地城市ID
     */
    private Long destinationCityId;

    /**
     * database column tms_carrier_route_snapshot.destination_city_name
     * 目的地城市名称
     */
    private String destinationCityName;

    /**
     * 目的仓库ID
     * database column tms_carrier_route_snapshot.destination_warehouse_id
     */
    private Long destinationWarehouseId;

    /**
     * 目的仓库名称
     * database column tms_carrier_route_snapshot.destination_warehouse_name
     */
    private String destinationWarehouseName;

    /**
     * 目的仓库类型
     * database column tms_carrier_route_snapshot.destination_warehouse_type
     */
    private Integer destinationWarehouseType;

    /**
     * database column tms_carrier_route_snapshot.mileage
     * 里程数
     */
    private Integer mileage;

    /**
     * database column tms_carrier_route_snapshot.carrier_id
     * 承运商Id
     */
    private Long carrierId;

    /**
     * database column tms_carrier_route_snapshot.transport_type
     * 运输类型:1-大板车；2-小板车
     */
    private Integer transportType;

    /**
     * database column tms_carrier_route_snapshot.car_type
     * 车辆类型：1-标准车辆；2-标准suv；3-大型suv
     */
    private Integer carType;

    /**
     * database column tms_carrier_route_snapshot.transport_costs
     * 运输价格
     */
    private Integer transportCosts;

    /**
     * database column tms_carrier_route_snapshot.transport_time
     * 运输时间
     */
    private Integer transportTime;

    /**
     * database column tms_carrier_route_snapshot.route_status
     * 路线状态：1-正常；2-暂停；',
     */
    private Integer routeStatus;

    /**
     * database column tms_carrier_route_snapshot.remarks
     * 备注
     */
    private String remarks;

    /**
     * database column tms_carrier_route_snapshot.operate_user_id
     * 操作用户ID
     */
    private Long operateUserId;

    /**
     * database column tms_carrier_route_snapshot.operate_user_type
     * 操作用户的类型：1-后台系统用户；2-客户端承运商员工Id
     */
    private Integer operateUserType;

    /**
     * database column tms_carrier_route_snapshot.controlled_status
     * 监管状态：0，无监管；1，有监管
     */
    private Integer controlledStatus;

    /**
     * database column tms_carrier_route_snapshot.status
     * 记录状态：0-失效；1-有效
     */
    private Integer status;

    /**
     * database column tms_carrier_route_snapshot.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_carrier_route_snapshot.gmt_modified
     */
    private Date gmtModified;

    public Long getRouteSnapshotId() {
        return routeSnapshotId;
    }

    public void setRouteSnapshotId(Long routeSnapshotId) {
        this.routeSnapshotId = routeSnapshotId;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Long getTransportOrderId() {
        return transportOrderId;
    }

    public void setTransportOrderId(Long transportOrderId) {
        this.transportOrderId = transportOrderId;
    }

    public Long getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(Long startCityId) {
        this.startCityId = startCityId;
    }

    public String getStartCityName() {
        return startCityName;
    }

    public void setStartCityName(String startCityName) {
        this.startCityName = startCityName;
    }

    public Long getDestinationCityId() {
        return destinationCityId;
    }

    public void setDestinationCityId(Long destinationCityId) {
        this.destinationCityId = destinationCityId;
    }

    public String getDestinationCityName() {
        return destinationCityName;
    }

    public void setDestinationCityName(String destinationCityName) {
        this.destinationCityName = destinationCityName;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getTransportCosts() {
        return transportCosts;
    }

    public void setTransportCosts(Integer transportCosts) {
        this.transportCosts = transportCosts;
    }

    public Integer getTransportTime() {
        return transportTime;
    }

    public void setTransportTime(Integer transportTime) {
        this.transportTime = transportTime;
    }

    public Integer getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(Integer routeStatus) {
        this.routeStatus = routeStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Long operateUserId) {
        this.operateUserId = operateUserId;
    }

    public Integer getOperateUserType() {
        return operateUserType;
    }

    public void setOperateUserType(Integer operateUserType) {
        this.operateUserType = operateUserType;
    }

    public Integer getControlledStatus() {
        return controlledStatus;
    }

    public void setControlledStatus(Integer controlledStatus) {
        this.controlledStatus = controlledStatus;
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