package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  物权变更DTO
 * @Package com.chevrolet.api.dto
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/8/22 上午9:56
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class TransferAssetDTO implements Serializable {
    private static final long serialVersionUID = -6306371909120044415L;

    /**
     * 车辆ID集合
     */
    private List<Long> carIds;

    /**
     * 原物权归属
     */
    private Long oldAssetRight;

    /**
     * 原物权归属类型
     */
    private AssetRightTypeEnum oldAssetRightType;

    /**
     * 新物权归属
     */
    private Long assetRight;

    /**
     * 新物权归属者名称
     */
    private String assetRightName;

    /**
     * 新物权归属类型
     */
    private AssetRightTypeEnum assetRightType;
}