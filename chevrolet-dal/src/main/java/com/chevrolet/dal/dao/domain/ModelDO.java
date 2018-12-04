package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 车型表 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 下午2:27
 * @since V1.0
 */
public class ModelDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_model.model_id
     * 型号ID
     */
    private Long modelId;

    /**
     * database column b2b_model.model_name
     * 型号名称
     */
    private String modelName;

    /**
     * database column b2b_model.series_id
     * 车系ID
     */
    private Long seriesId;

    /**
     * database column b2b_model.brand_id
     * 品牌ID
     */
    private Long brandId;

    /**
     * database column b2b_model.standard
     * 车规，0-国产，1-中规，2-美规，3-加规，4-中东，5-欧规，6-墨西哥版，7-平行进口
     */
    private Integer standard;

    /**
     * database column b2b_model.year
     * 年款
     */
    private String year;

    /**
     * database column b2b_model.status
     * 状态 1-在售，2-即将在售，3-停售
     */
    private Integer status;

    /**
     * database column b2b_model.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_model.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_model.displacement
     * 排量
     */
    private String displacement;

    /**
     * database column b2b_model.drive
     * 驱动
     */
    private String drive;

    /**
     * database column b2b_model.fuel
     * 燃油形式
     */
    private String fuel;

    /**
     * database column b2b_model.seat
     * 座位
     */
    private String seat;

    /**
     * database column b2b_model.guide_price
     * 指导价
     */
    private String guidePrice;

    /**
     * database column b2b_model.wap_name
     * web端显示名称
     */
    private String wapName;

    /**
     * database column b2b_model.outer_id
     * 外部ID
     */
    private String outerId;

    /**
     * database column b2b_model.source
     * 1: 汽车之家 2车行168
     */
    private Integer source;

    /**
     * database column b2b_model.rank
     * 排位
     */
    private Integer rank;

    /**
     * database column b2b_model.sell_price_status
     * 是否生成行情价，0没有行情价，1有行情价
     */
    private Integer sellPriceStatus;

    /**
     * database column b2b_model.length
     */
    private Integer length;

    /**
     * database column b2b_model.width
     */
    private Integer width;

    /**
     * database column b2b_model.height
     */
    private Integer height;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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


    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getWapName() {
        return wapName;
    }

    public void setWapName(String wapName) {
        this.wapName = wapName;
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getSellPriceStatus() {
        return sellPriceStatus;
    }

    public void setSellPriceStatus(Integer sellPriceStatus) {
        this.sellPriceStatus = sellPriceStatus;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}