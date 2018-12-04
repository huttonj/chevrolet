package com.chevrolet.core.ao;

import com.chevrolet.api.dto.BaseCarDTO;

import java.util.List;

public interface CarSearchAO {

    List<BaseCarDTO> queryCarDetailPagination(List<Long> carIds, List<String> carUniques, String carUnique, String modelName,
                                              Long assetRight, Integer assetRightType, String fuzzyField, Integer pageSize, Integer pageOffset);

}
