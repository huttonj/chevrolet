package com.chevrolet.api.service;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.dto.request.BaseCarQueryReq;
import com.chevrolet.api.dto.request.BaseCarReq;
import com.subaru.common.entity.APIResult;
import com.subaru.common.entity.BizResult;

import java.util.List;
import java.util.Map;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.service
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/8/14 上午10:23
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public interface BaseCarService {

    /**
     * <p> 根据车辆ID返回未删除的车辆基本信息，组装车辆物权信息 </p>
     * @param carId
     * @return APIResult<BaseCarDTO>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午2:10
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<BaseCarDTO> getCarById(Long carId);

    /**
     * <p> 批量根据车辆ID返回未删除的车辆基本信息，组装车辆物权信息 </p>
     * @param carIds
     * @return APIResult<Map<Long, BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:15 
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<Map<Long, BaseCarDTO>> getCarsByIds(List<Long> carIds);

    /**
     * <p> 添加基础车辆信息，关联物权信息，返回车辆ID </p>
     * @param baseCarDTO
     * @return APIResult<Long>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:18
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<Long> addBaseCar(BaseCarDTO baseCarDTO);

    /**
     * <p> 批量保存基础车辆信息，关联物权信息，返回车辆ID集合 </p>
     * @param baseCarDTO 车辆信息
     * @param carNumber 要保存的车辆数量
     * @return APIResult<List<Long>> 车辆ID列表
     * @throws       
     * @author 绪超 (xuchao@maihaoche.com)
     * @date 2018/6/26 下午1:47
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<Long>> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber);

    /**
     * <p> 更新基础车辆信息和物权信息，返回boolean结果 </p>
     * @param baseCarDTO
     * @return APIResult<Boolean>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:23 
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<Boolean> updateBaseCar(BaseCarDTO baseCarDTO);

    /**
     * <p> 根据车辆ID集合，分页查询modelId为-1的车辆信息，不知道哪来的傻逼接口，方法名如此晦涩,MLGB </p>
     * @param req
     * @return BizResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:30 
     * @since V1.1.0-SNAPSHOT
     * 
     */
    BizResult<List<BaseCarDTO>> diyCarView(BaseCarReq req);

    /**
     * <p> 根据carUnique返回车辆信息，查询走infiniti搜索引擎 </p>
     * @param carUnique
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:37
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUnique(String carUnique);

    /**
     * <p> 根据carUniques返回车辆信息，包含物权信息 </p>
     * @param carUniques
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:39
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUniques(List<String> carUniques);

    /**
     * <p> 批量根据车辆ID返回未删除的车辆基本信息，组装车辆物权信息 </p>
     * @param carIds
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:45
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<BaseCarDTO>> getCarsByCarIds(List<Long> carIds);

    /**
     * <p> 根据车架号模糊查询车辆，走infiniti搜索引擎 </p>
     * @param fuzzyCarUnique
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:46 
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<List<BaseCarDTO>> getCarsByFuzzyCarUnique(String fuzzyCarUnique);


    /**
     * <p> 分页查询车辆信息，组装物权信息，支持车辆ID集合，车架号模糊匹配，车型名称模糊匹配 </p>
     * @param baseCarQueryReq
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午5:52
     * @since V1.1.0-SNAPSHOT
     */
    APIResult<List<BaseCarDTO>> queryCarsByQueryReq(BaseCarQueryReq baseCarQueryReq);

    /**
     * <p> 根据车辆ID集合批量更新车辆基本信息 </p>
     * @param baseCarDTO,carIds
     * @return APIResult<Boolean>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午6:02
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<Boolean> batchUpdateByCarIds(BaseCarDTO baseCarDTO, List<Long> carIds);

    /**
     * <p> 获取从fromCarId开始的n条记录 </p>
     * @param
     * @return null
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午6:15
     * @since V1.1.0-SNAPSHOT
     * FIXME 待验证
     */
    APIResult<List<Long>> queryLimitCar(LimitCarQuery carQuery);

    /**
     * <p> 根据carIds返回车辆信息,包括已删除的车辆，组装物权信息 </p>
     * @param carIds
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午6:18
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<List<BaseCarDTO>> getCarsByCarIdsIncludeDeleted(List<Long> carIds);

    /**
     * <p> 根据carUniques返回车辆信息,包括已删除的，组装物权信息 </p>
     * @param carUniques
     * @return APIResult<List<BaseCarDTO>>
     * @author 文远（wenyuan@maihaoche.com）
     * @date 2018/8/21 下午6:21 
     * @since V1.1.0-SNAPSHOT
     * 
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUniquesIncludeDeleted(List<String> carUniques);

}
