package com.chevrolet.dal.dao.domain.query;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CarExtQuery implements Serializable{
    private List<Long> carIds;
    private String modelName;
    private String carUnique;
    private Long assetRight;
    private Integer assetRightType;
    private String fuzzyField;
    private Integer pageSize;
    private Integer pageOffset;
}
