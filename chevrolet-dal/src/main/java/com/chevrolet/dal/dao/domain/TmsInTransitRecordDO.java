package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;
/**   
 * <p> 在途信息记录 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午4:18 
 * @since V1.0 
 */
public class TmsInTransitRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column tms_in_transit_record.in_transit_record_id
     * 在途信息记录主键ID
     */
    private Long inTransitRecordId;

    /**
     * database column tms_in_transit_record.transport_car_id
     * 运输车辆ID
     */
    private Long transportCarId;

    /**
     * database column tms_in_transit_record.location
     * 地点
     */
    private String location;

    /**
     * database column tms_in_transit_record.record_time
     * 记录时间
     */
    private Date recordTime;

    /**
     * database column tms_in_transit_record.operate_user_id
     * 上传在途信息的用户Id
     */
    private Long operateUserId;

    /**
     * database column tms_in_transit_record.operate_user_type
     * 用户类型：1-tms后台；2-承运商客户端app
     */
    private Integer operateUserType;

    /**
     * database column tms_in_transit_record.remarks
     * 备注
     */
    private String remarks;

    /**
     * database column tms_in_transit_record.operate_status
     * 是否可以编辑：0，不可编辑；1，可编辑（因为目前有的记录是可以进行时间的修改的）
     */
    private Integer operateStatus;

    /**
     * database column tms_in_transit_record.status
     * 记录状态：0-失效；1-有效
     */
    private Integer status;

    /**
     * database column tms_in_transit_record.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column tms_in_transit_record.gmt_modified
     */
    private Date gmtModified;

    public Long getInTransitRecordId() {
        return inTransitRecordId;
    }

    public void setInTransitRecordId(Long inTransitRecordId) {
        this.inTransitRecordId = inTransitRecordId;
    }

    public Long getTransportCarId() {
        return transportCarId;
    }

    public void setTransportCarId(Long transportCarId) {
        this.transportCarId = transportCarId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getRecordTime() {
        if(recordTime == null){
            return null;
        }
        return (Date)recordTime.clone();
    }

    public void setRecordTime(Date recordTime) {
        if(recordTime == null){
            this.recordTime = null;
        }else{
            this.recordTime = (Date)recordTime.clone();
        }
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
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