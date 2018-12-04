package com.chevrolet.web.controller.vin;

import com.chevrolet.api.service.CarToolBoxService;
import com.chevrolet.core.ao.VinWhitelistAO;
import com.chevrolet.dal.dao.domain.VinWhitelistDO;
import com.mhc.subaru.validation.annotations.NoLogin;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description:
 */
@Slf4j
@RestController
public class CheckVinController {

    @Autowired
    private CarToolBoxService carToolBoxService;

    @Autowired
    private VinWhitelistAO vinWhitelistAO;

    /**
     * restful风格
     * @param vin 车架号
     * @return 是否校验通过 true false 字符串
     */
    @NoLogin
    @RequestMapping(value = "/vin_check/{vin}", method = RequestMethod.GET)
    public boolean checkPath(@PathVariable String vin) {
        try {
            BizResult<Boolean> re = carToolBoxService.verifyVIN(vin);
            return re.isSuccess() && re.getData();
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * 常规风格
     * @param vin 车架号
     * @return 是否校验通过 true false 字符串
     */
    @NoLogin
    @RequestMapping(value = "/vin_check", method = RequestMethod.GET)
    public boolean check(@RequestParam String vin) {
        try {
            BizResult<Boolean> re = carToolBoxService.verifyVIN(vin);
            return re.isSuccess() && re.getData();
        } catch (Exception e) {
        }
        return false;
    }


    /**
     * 返回json
     * @param vin 车架号
     * @return 是否校验通过 true false json 串
     */
    @NoLogin
    @RequestMapping(value = "/vin_check.json", method = RequestMethod.GET)
    public Object checkJson(@RequestParam String vin) {
        try {
            BizResult<Boolean> re = carToolBoxService.verifyVIN(vin);
            if(re.isSuccess() && re.getData()) {
                return com.chevrolet.web.controller.dto.BizResult.create(true);
            }
        } catch (Exception e) {
        }
        return com.chevrolet.web.controller.dto.BizResult.create(false);

    }


    @RequestMapping(value = "/vin/vin_check", method = RequestMethod.POST)
    public Object addVINs(@Param(value = "vins") String vins) {

        if(StringUtils.isEmpty(vins)) {
            return com.chevrolet.web.controller.dto.BizResult.create("车架号不能为空！");
        }

        String splitor = "\n";
        if(vins.contains(",")) {
            splitor = ",";
        } else if(vins.contains(";")) {
            splitor = ";";
        } else if(vins.contains("，")) {
            splitor = "，";
        } else if(vins.contains("；")) {
            splitor = "；";
        }
        try {
            String[] vinarr = vins.split(splitor);
            for (int i = 0; i < vinarr.length; i++) {
                VinWhitelistDO vinWhitelistDO = null;
                boolean result = false;
                try {
                    vinWhitelistDO = new VinWhitelistDO();
                    vinWhitelistDO.setVin(vinarr[i]);
                    result = vinWhitelistAO.addWhitelistVIN(vinWhitelistDO);
                } catch (Exception e) {
                    log.error("insert vin whitelist error: {}", e);
                }
                log.info("insert vin white list {}, result : {}", vinWhitelistDO, result);
            }
            com.chevrolet.web.controller.dto.BizResult re = new com.chevrolet.web.controller.dto.BizResult();
            re.setSuccess(true);
            re.setData(true);
            re.setMessage("成功添加" + vinarr.length + "条车架号信息！");
            return re;
        } catch (Exception e) {
            log.error("add vin error : {}", e.getLocalizedMessage());
        }
        return com.chevrolet.web.controller.dto.BizResult.create(false);
    }

}
