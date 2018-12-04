package com.mhc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.chevrolet.api.dto.CarLoanOrderDTO;
import com.chevrolet.api.dto.financing.FinancingBatchDTO;
import com.chevrolet.api.dto.request.CarLockReq;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.chevrolet.api.service.*;
import com.mhc.spring.boot.annotation.EnableDubboConfiguration;
import com.subaru.common.entity.BizResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.chevrolet.api.enums.lock.CarLockBizTypeEnum.CAR_LOA_PICK_UP;

@SpringBootApplication
@EnableDubboConfiguration
public class ChevroletDemoClientApplication {

    //    @Autowired
//    private CarToolBoxService carToolBoxService;
    @Autowired
    private WmsCarService wmsCarService;
    @Autowired
    private TmsCarService tmsCarService;
    @Autowired
    private CarLoanOrderService carLoanOrderService;
    @Autowired
    private CarAssetService carAssetService;
    @Autowired
    private CarSearchService carSearchService;
    @Autowired
    private CarStatusLockService carStatusLockService;

    @Autowired
    private FinancingCarService financingCarService;


    public static void main(String[] args) {
        SpringApplication.run(ChevroletDemoClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner testHealth() {
        return (args) -> {
//
//            AssetRightChgApplyDTO assetRightChgApplyDTO = new AssetRightChgApplyDTO();
//            assetRightChgApplyDTO.setAssetRight(123L);
//            assetRightChgApplyDTO.setAssetRightName("发起人自测");
//            assetRightChgApplyDTO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE);
//            assetRightChgApplyDTO.setPartnerId(456L);
//            assetRightChgApplyDTO.setPartnerName("企业接收人");
//            assetRightChgApplyDTO.setCarIds(Arrays.asList(608L));
//            BizResult result = carAssetService.applyAssetRightChg(assetRightChgApplyDTO);
//            System.out.println();
//
//            AssetRightChgDTO assetRightChgDTO = new AssetRightChgDTO();
//            assetRightChgDTO.setAssetRightChgRecordId(2L);
//            BizResult result = carAssetService.signChgRecord(assetRightChgDTO);
//            BizResult result = carAssetService.confirmChgRecord(assetRightChgDTO);
//            BizResult result = carAssetService.cancelChgRecord(assetRightChgDTO);
//            AssetRightChgQueryDTO assetRightChgQueryDTO = new AssetRightChgQueryDTO();
//            assetRightChgQueryDTO.setAssetRightChgRecordId(1L);
//            assetRightChgQueryDTO.setAssetRight(123L);
//            assetRightChgQueryDTO.setAssetRightType(AssetRightTypeEnum.ENTERPRISE);
//            BizResult result = carAssetService.queryAssetRightChgRecords(assetRightChgQueryDTO);
//            assetRightChgDTO.setAssetRight(111L);
//            assetRightChgDTO.setAssetRightName("测试初始化");
//            assetRightChgDTO.setAssetRightType(AssetRightTypeEnum.PERSONAL);
//            assetRightChgDTO.setReceiveTel("17681801700");
//            assetRightChgDTO.setReceiveName("何天骄");
//            assetRightChgDTO.setReceiveCertNo("321321199210015871");
//            BizResult result = carAssetService.initAssetRight(assetRightChgDTO);
            CarLockReq carLockReq = new CarLockReq();
            carLockReq.setCarIds(Arrays.asList(11l));
            carLockReq.setBizType(CAR_LOA_PICK_UP);
            carLockReq.setBizNo("123456");
            carLockReq.setExpireTime(new Date());
            carLockReq.setExt1(CarLockExtStatusEnum.CLOSED);
//            carStatusLockService.allowLoanCar(Arrays.asList(11l),CarLockExtStatusEnum.OPEN);
            carLockReq = new CarLockReq();
            carLockReq.setCarIds(Arrays.asList(11l,22l,33l));
            carLockReq.setBizType(CAR_LOA_PICK_UP);
            carLockReq.setBizNo("123456");
//            carStatusLockService.unlock(carLockReq);
//            BizResult result = carStatusLockService.queryCarLocks(Arrays.asList(11l),Arrays.asList(CAR_LOA_PICK_UP.getCode()));
            BizResult<List<FinancingBatchDTO>> result = financingCarService.queryCarBatch(Arrays.asList("LFV2A21KXE4176550","LSJZ14C30DS044123"));



            String content = "{\n" +
                    "  \"carLoanDetails\": [\n" +
                    "    {\n" +
                    "      \"assetRight\": 100008319,\n" +
                    "      \"assetRightName\": \"飞 虎 队 公 司\",\n" +
                    "      \"assetRightType\": 2,\n" +
                    "      \"brandId\": 6,\n" +
                    "      \"brandName\": \"宝骏\",\n" +
                    "      \"carLoanOrderNo\": \"G20180425109185\",\n" +
                    "      \"carNumber\": 2,\n" +
                    "      \"carSource\": 199,\n" +
                    "      \"carStatus\": 20,\n" +
                    "      \"metaCarId\": 1111,\n" +
                    "      \"metaCarUnique\": \"W2JTDMAT9NBHR7N2U\",\n" +
                    "      \"hotModel\": 1,\n" +
                    "      \"innerColorId\": 4470,\n" +
                    "      \"innerColorName\": \"黑色\",\n" +
                    "      \"modelId\": 23494,\n" +
                    "      \"modelName\": \"宝骏610 2014款 1.5L 手动标准型\",\n" +
                    "      \"outerColorId\": 4462,\n" +
                    "      \"outerColorName\": \"大地棕\",\n" +
                    "      \"pricingAmountFirst\": 100000,\n" +
                    "      \"ruleCalculationBail\": 15000,\n" +
                    "      \"seriesId\": 78,\n" +
                    "      \"seriesName\": \"宝骏610\",\n" +
                    "      \"singleLoamount\": 60000,\n" +
                    "      \"singleMaramount\": 15000,\n" +
                    "      \"specId\": 0,\n" +
                    "      \"specName\": \"中规/国产\",\n" +
                    "      \"unitContractPrice\": 75000\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"carLoanOrderNo\": \"G20180425109185\",\n" +
                    "  \"loanOrderType\": 0\n" +
                    "}";
            CarLoanOrderDTO carLoanOrderDTO = JSON.parseObject(content,new TypeReference<CarLoanOrderDTO>(){});
//            BizResult result = financingCarService.createCarLoanOrderInfo(carLoanOrderDTO);

            System.out.println();

        };
    }
}
