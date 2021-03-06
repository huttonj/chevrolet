package com.chevrolet.api.dto.request;

import com.mhc.bs.common.base.BaseDTO;
import lombok.Data;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api.dto.request
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/16 下午7:20
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class CheckConfRequest extends BaseDTO {
    /**
     * 验车资源文件类型
     */
    Integer resourceType;
}
