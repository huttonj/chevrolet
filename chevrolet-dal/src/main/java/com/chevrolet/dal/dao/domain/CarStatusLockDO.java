package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;
/**  
 * <p> 车辆锁 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:17
 * @since V1.0
 */
public class CarStatusLockDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car_status_lock.car_status_lock_id
     * 主键ID
     */
    private Long carStatusLockId;

    /**
     * database column cc_car_status_lock.car_id
     * 车辆ID
     */
    private Long carId;

    /**
     * database column cc_car_status_lock.biz_type
     * 业务类型CarLockBizTypeEnum
     */
    private Integer bizType;

    /**
     * database column cc_car_status_lock.biz_no
     * 业务单号
     */
    private String bizNo;

    /**
     * database column cc_car_status_lock.locked
     * 0非冻结 1冻结
     */
    private Integer locked;

    /**
     * database column cc_car_status_lock.ext_1
     * 订单宝转库融宝
     */
    private Integer ext1;

    /**
     * database column cc_car_status_lock.expire_time
     * 过期时间
     */
    private Date expireTime;

    /**
     * database column cc_car_status_lock.gmt_create
     * 添加时间
     */
    private Date gmtCreate;

    /**
     * database column cc_car_status_lock.gmt_modified
     * 修改时间
     */
    private Date gmtModified;

    /**
     * database column cc_car_status_lock.is_deleted
     * 有效字段
     */
    private Integer isDeleted;

    public Long getCarStatusLockId() {
        return carStatusLockId;
    }

    public void setCarStatusLockId(Long carStatusLockId) {
        this.carStatusLockId = carStatusLockId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getExt1() {
        return ext1;
    }

    public void setExt1(Integer ext1) {
        this.ext1 = ext1;
    }

    public Date getExpireTime() {
        if(expireTime == null){
            return null;
        }
        return (Date)expireTime.clone();
    }

    public void setExpireTime(Date expireTime) {
        if(expireTime == null){
            this.expireTime = null;
        }else{
            this.expireTime = (Date)expireTime.clone();
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


    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}