package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;
/**  
 * <p> 厂商 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:20
 * @since V1.0
 */
public class FactoryDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_factory.factory_id
     * 主键ID
     */
    private Long factoryId;

    /**
     * database column b2b_factory.factory_name
     * 厂商名称
     */
    private String factoryName;

    /**
     * database column b2b_factory.factory_type
     * 厂商类型(国产 1 中规 10 平行进口100)
     */
    private Integer factoryType;

    /**
     * database column b2b_factory.status
     * 厂商状态
     */
    private Integer status;

    /**
     * database column b2b_factory.gmt_create
     *
     */
    private Date gmtCreate;

    /**
     * database column b2b_factory.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_factory.outer_id
     * 外部ID
     */
    private String outerId;

    /**
     * database column b2b_factory.source
     * 1:汽车之家 2:陈行168
     */
    private Integer source;

    /**
     * database column b2b_factory.standard
     * 车规
     */
    private Integer standard;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Integer getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(Integer factoryType) {
        this.factoryType = factoryType;
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


    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

}