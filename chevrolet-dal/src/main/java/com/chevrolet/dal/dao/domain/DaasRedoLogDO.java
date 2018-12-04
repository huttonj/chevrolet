package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class DaasRedoLogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column cc_daas_redo_log.daas_redo_log_id
     */
    private Long daasRedoLogId;

    /**
     * database column cc_daas_redo_log.request_type
     */
    private Integer requestType;

    /**
     * database column cc_daas_redo_log.request_param
     */
    private String requestParam;

    /**
     * database column cc_daas_redo_log.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column cc_daas_redo_log.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column cc_daas_redo_log.is_deleted
     */
    private Integer isDeleted;

    public Long getDaasRedoLogId() {
        return daasRedoLogId;
    }

    public void setDaasRedoLogId(Long daasRedoLogId) {
        this.daasRedoLogId = daasRedoLogId;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
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