package com.chevrolet.core.ao;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.dal.dao.domain.CarDO;

import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/5/25.
 */
public interface CarAO {

    /**
     * 根据carDTO报错CarDO
     * @param baseCarDTO
     * @return
     */
    Long saveCarDTO(BaseCarDTO baseCarDTO);

    /**
     * 根据carDTO报错CarDO
     * @param baseCarDTO
     * @return
     */
    List<Long> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber);

    /**
     * 根据id获取DTO
     *
     * @param carId
     * @return
     */
    BaseCarDTO getCarDTOById(Long carId);

    /**
     * 获取CarDOMap,以carId为key
     *
     * @param carIdList
     * @return
     */
    Map<Long,CarDO> getCarDOMapByCarIdList(List<Long> carIdList);

    /**
     * 查询对应id的carDOList
     *
     * @param carIdList
     * @return
     */
    List<CarDO> getCarDOListByCarIdList(List<Long> carIdList);

    /**
     * 根据车架号获取车辆信息
     * 支持模糊查询
     *
     * @param carUnique
     * @return
     */
    List<CarDO> getCarDOsByCarUnique(String carUnique);

    /**
     * 根据车架号获取车辆信息
     * 不支持模糊查询
     *
     * @param carUniques
     * @return
     */
    List<CarDO> getCarDOsByCarUniques(List<String> carUniques);
     /**
     * 根据Id获取车辆
     *
     * @param carId
     * @return
     */
    CarDO getCarById(Long carId);

    /**
     * 根据Id获取车辆
     *
     * @param carIds
     * @return
     */
    List<CarDO> getCarsByIds(List<Long> carIds);


    /**
     * 根据Id获取车辆,不过滤delete
     *
     * @param carIds
     * @return
     */
    List<CarDO> getAllCarsByIds(List<Long> carIds);

    /**
     * 根据车架号获取车辆ID
     *
     * @param carUnique
     * @return
     *
     */
    List<Long> getCarIdsByCarUnique(String carUnique);


    /**
     * 根据carIds，改变车物权变更状态
     */
    Integer alterCarAssetRightInChange(Integer inChangeStatus, List<Long> carIds);

    List<BaseCarDTO> queryCarsByQueryReq(List<Long> carIds);

    List<BaseCarDTO> queryCarsByQueryReq(Long assetRight, Integer assetRightType);


    List<BaseCarDTO> queryCarsByQueryReq(List<Long> carIds, Long assetRight, Integer assetRightType,String fuzzyCarUnique, String fuzzyModelName, Integer pageSize, Integer pageOffset);

    //物权变更通用方法，勿重写类似功能
    Integer updateAssetRightByCarIds(CarDO carDO, List<Long> carIds, Long oldAssetRight, Integer oldAssetRightType);

    Boolean existCarInChange(List<Long> carIds);

    Boolean batchUpdateByCarIds(CarDO carDO, List<Long> carIds);

    /**
     * 获取n条记录
     * @param carQuery
     * @return
     */
    List<Long> queryLimitCar(LimitCarQuery carQuery);
}
