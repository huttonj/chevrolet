package com.chevrolet.dal.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**  
 * <p> 品牌 </p>
 *  
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/6/20 上午11:23
 * @since V1.0
 */
public class BrandDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * database column b2b_brand.brand_id
     * 品牌ID
     */
    private Long brandId;

    /**
     * database column b2b_brand.brand_name
     * 品牌名称
     */
    private String brandName;

    /**
     * database column b2b_brand.brand_letter
     * 品牌首字母
     */
    private String brandLetter;

    /**
     * database column b2b_brand.brand_pic
     * 品牌图片163
     */
    private String brandPic;

    /**
     * database column b2b_brand.small_pic
     * 品牌小图90
     */
    private String smallPic;

    /**
     * database column b2b_brand.status
     * 品牌状态 (1是正常 其他是不正常)
     */
    private Integer status;

    /**
     * database column b2b_brand.brand_type
     * 按位判定有没有对应版本，第一位国产，第二位中规，第三位平行进口
     */
    private Integer brandType;

    /**
     * database column b2b_brand.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_brand.gmt_modified
     */
    private Date gmtModified;

    /**
     * database column b2b_brand.outer_id
     * 外部Id
     */
    private String outerId;

    /**
     * database column b2b_brand.source
     * 1:汽车之家 2:车行168
     */
    private Integer source;

    /**
     * database column b2b_brand.rank
     * 排名
     */
    private Integer rank;

    /**
     * database column b2b_brand.cars_number
     * 车源数
     */
    private Long carsNumber;

    /**
     * database column b2b_brand.priority
     * 优先级
     */
    private Integer priority;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLetter() {
        return brandLetter;
    }

    public void setBrandLetter(String brandLetter) {
        this.brandLetter = brandLetter;
    }

    public String getBrandPic() {
        return brandPic;
    }

    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBrandType() {
        return brandType;
    }

    public void setBrandType(Integer brandType) {
        this.brandType = brandType;
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Long getCarsNumber() {
        return carsNumber;
    }

    public void setCarsNumber(Long carsNumber) {
        this.carsNumber = carsNumber;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}