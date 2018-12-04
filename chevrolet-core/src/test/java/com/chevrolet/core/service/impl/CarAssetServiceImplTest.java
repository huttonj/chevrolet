package com.chevrolet.core.service.impl;

import com.chevrolet.api.dto.TransferAssetDTO;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.manager.impl.CarAssetChglogManagerImpl;
import com.subaru.common.entity.BizResult;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarAssetServiceImplTest {

    private CarDO carDO;

    private TransferAssetDTO transferAssetDTO = new TransferAssetDTO();

    private CarAssetServiceImpl carAssetService;

    @Mock
    private CarAO carAO;

    @Mock
    private CarAssetChglogManagerImpl carAssetChglogManager;

    @Before
    public void init() {
        carDO = new CarDO();
        carDO.setCarId(1l);
        carDO.setAssetRight(-2l);
//
//        transferAssetDTO.setCcCarId(1l);
//        transferAssetDTO.setAssetRight(2l);
//        transferAssetDTO.setMessage("test transfer");
//
//        carAssetService = new CarAssetServiceImpl();
//        carAssetService.setCarAO(carAO);
//        carAssetService.setCarAssetChglogManager(carAssetChglogManager);
    }

    @Test
    public void testTransferCar() {
        when(carAO.getCarById(any(Long.class))).thenReturn(carDO);
        BizResult<Boolean> result = carAssetService.transferAsset(transferAssetDTO);
        assertTrue(result.getData());
    }

    @Test
    public void testTransferFailOnMissingCar() {
        when(carAO.getCarById(any(Long.class))).thenReturn(null);
        BizResult<Boolean> result = carAssetService.transferAsset(transferAssetDTO);
        assertFalse(result.isSuccess());
    }

    @Test
    public void testTransferCarOnAddingLog() {
        carDO.setAssetRight(2l);

        when(carAO.getCarById(any(Long.class))).thenReturn(carDO);
        carAssetService.transferAsset(transferAssetDTO);
        Mockito.verify(carAssetChglogManager,atLeastOnce()).insertSelective(any(CarAssetChglogDO.class));
    }

}
