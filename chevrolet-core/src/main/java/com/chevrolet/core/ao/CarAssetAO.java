package com.chevrolet.core.ao;

import com.chevrolet.api.dto.*;

import java.util.List;
import java.util.Map;

/**
 * @author maihe
 */
public interface CarAssetAO {

    //物权转移
    //1.原物权对的上 2.车辆状态为非变更中
    int transferAsset(TransferAssetDTO transferAssetDTO);

    Map<Long,List<CarAssetChgLogDTO>> queryAssetTransferLog(List<Long> carIds);

    //发起物权变更
    Long applyAssetRightChg(AssetRightChgApplyDTO assetRightChgApplyDTO);

    //发起人签章
    Integer signChgRecord(AssetRightChgDTO assetRightChgDTO);

    //确认
    Integer confirmChgRecord(AssetRightChgDTO assetRightChgDTO);

    //物权初始化
    Boolean initAssetRight(AssetRightChgDTO assetRightChgDTO);

    //取消
    Integer cancelChgRecord(AssetRightChgDTO assetRightChgDTO);

    List<AssetRightChgResultDTO> queryAssetRightChgRecords(AssetRightChgQueryDTO assetRightChgQueryDTO);
}
