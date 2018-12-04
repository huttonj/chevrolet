package com.chevrolet.core.service.impl;

import com.chevrolet.ChevroletCoreApplication;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.service.BaseCarService;
import com.google.common.collect.Lists;
import com.subaru.common.entity.APIResult;
import com.subaru.common.entity.ErrorCodeEnum;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * <p> 车辆基础服务测试</p>
 *
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/6/25 上午11:16
 * @since V1.1.0-SNAPSHOT
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ChevroletCoreApplication.class)
public class BaseCarServiceImplTest {
    @Autowired
    private BaseCarService baseCarService;


    @Test
    public void getCarByids(){
        List<Long> ids = new ArrayList<>();
        ids.add(523964L);
        APIResult<List<BaseCarDTO>>  result = baseCarService.getCarsByCarIds(ids);
        System.out.println(result.toString());
    }

    @Test
    public void getCarsByCarIdsIncludeDeleted_SUCCESS(){
        //1.测试数据准备
        List<Long> sourceCarIds = Lists.newArrayList(1L,2L,3L);
        //2.调用待测试方法
        APIResult<List<BaseCarDTO>> apiResult = baseCarService.getCarsByCarIdsIncludeDeleted(sourceCarIds);
        //3.断言
        assertTrue(apiResult.isSuccess());
        assertTrue(CollectionUtils.isNotEmpty(apiResult.getData()));
        assertTrue(apiResult.getData().size() == sourceCarIds.size());
        List<Long> targetCarIds = apiResult.getData().stream().map(dto -> dto.getCarId()).collect(Collectors.toList());
        assertTrue(CollectionUtils.isEqualCollection(sourceCarIds,targetCarIds));
    }

    @Test
    public void getCarsByCarIdsIncludeDeleted_ERROR_EMPTY_INPUT(){
        List<Long> sourceCarIds = Lists.newArrayList();
        APIResult<List<BaseCarDTO>> apiResult = baseCarService.getCarsByCarIdsIncludeDeleted(sourceCarIds);
        assertFalse(apiResult.isSuccess());
        assertTrue(Objects.equals(ErrorCodeEnum.PARAM_ERROR.getErrCode(),apiResult.getCode()));
        assertTrue(Objects.equals(ErrorCodeEnum.PARAM_ERROR.getErrMsg(),apiResult.getMessage()));
        assertFalse(CollectionUtils.isNotEmpty(apiResult.getData()));
    }

    @Test
    public void getCarsByCarUniquesIncludeDeleted_SUCCESS(){
        List<String> sourceCarUniques = Lists.newArrayList("VNNBC24G0EML6D2B3","7PV4G894XBBJG0PLZ");
        APIResult<List<BaseCarDTO>> apiResult = baseCarService.getCarsByCarUniquesIncludeDeleted(sourceCarUniques);
        assertTrue(apiResult.isSuccess());
        assertTrue(CollectionUtils.isNotEmpty(apiResult.getData()));
        assertTrue(apiResult.getData().size() >= sourceCarUniques.size());
        List<String> targetCarUnigues = apiResult.getData().stream().map(dto -> dto.getCarUnique()).distinct().collect(Collectors.toList());
        assertTrue(CollectionUtils.isEqualCollection(sourceCarUniques,targetCarUnigues));
    }

    @Test
    public void getCarsByCarUniquesIncludeDeleted_ERROR_EMPTY_INPUT(){
        List<String> sourceCarUniques = Lists.newArrayList();
        APIResult<List<BaseCarDTO>> apiResult = baseCarService.getCarsByCarUniquesIncludeDeleted(sourceCarUniques);
        assertFalse(apiResult.isSuccess());
        assertTrue(Objects.equals(ErrorCodeEnum.PARAM_ERROR.getErrCode(),apiResult.getCode()));
        assertTrue(Objects.equals("carUniques不能为空",apiResult.getMessage()));
        assertFalse(CollectionUtils.isNotEmpty(apiResult.getData()));
    }
}
