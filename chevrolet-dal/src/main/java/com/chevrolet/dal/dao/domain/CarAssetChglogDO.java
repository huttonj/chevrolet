package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**   
 * <p> 物权变更记录 </p>
 *   
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午11:26 
 * @since V1.0 
 */
public class CarAssetChglogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_car_asset_chglog.chglog_id
     * 变更记录ID
     */
    private Long chglogId;

    /**
     * database column cc_car_asset_chglog.oid
     * 原归属
     */
    private Long oid;

    /**
     * database column cc_car_asset_chglog.o_type
     * 原归属类型
     */
    private Integer oType;

    /**
     * database column cc_car_asset_chglog.nid
     * 新归属
     */
    private Long nid;

    /**
     * database column cc_car_asset_chglog.n_type
     * 新归属类型
     */
    private Integer nType;

    /**
     * database column cc_car_asset_chglog.car_id
     * 关联car_id
     */
    private Long carId;

    /**
     * database column cc_car_asset_chglog.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_car_asset_chglog.gmt_modified
     */
    private Date gmtModified;

    public Long getChglogId() {
        return chglogId;
    }

    public void setChglogId(Long chglogId) {
        this.chglogId = chglogId;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Integer getOType() {
        return oType;
    }

    public void setOType(Integer oType) {
        this.oType = oType;
    }

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public Integer getNType() {
        return nType;
    }

    public void setNType(Integer nType) {
        this.nType = nType;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
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