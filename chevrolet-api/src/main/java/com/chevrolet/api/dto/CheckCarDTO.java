package com.chevrolet.api.dto;

import com.mhc.bs.common.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api.dto
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/12 下午5:05
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CheckCarDTO extends BaseDTO {

    /**
     * 验车单ID
     */
    private Long checkIssueId;
    /**
     * 车辆中心car_id
     */
    private Long ccCarId;
    /**
     * 业务来源
     */
    private Integer bizSource;
    /**
     * 业务类型
     */
    private Integer bizType;
    /**
     * 关联金融订单
     */
    private String financeOderNo;
    /**
     * 关联的业务单号
     */
    private String bizOrderNo;
    /**
     * 用什么端完成的验车
     */
    private Integer checkTerminal;
    /**
     * 验车开始时间
     */
    private Date checkBeginDate;
    ;
    /**
     * 验车结束时间
     */
    private Date checkEndDate;
    /**
     * 验车人讴歌用户ID
     */
    private String checkerStaffId;
    /**
     * 验车人姓名
     */
    private String checkerName;
    /**
     * 生产日期
     */
    private String productionDate;
    /**
     * 里程数
     */
    private Double odometer;
    /**
     * 钥匙数量
     */
    private Integer keyCount;
    /**
     * 是否有关单
     */
    private Integer customsClearanceStatus;
    /**
     * 一致性证书
     */
    private Integer hasCertificateConformity;
    /**
     * 商检单
     */
    private Integer hasCommodityInspection;
    /**
     * 是否有说明书
     */
    private Integer hasInstructionBook;
    /**
     * 外部系统记录ID
     */
    private Long outId;
    /**
     * 说明书
     */
    private String remark;
    /**
     * 是否已删除
     */
    private Integer isDeleted;
    /**
     * 验车资源列表
     */
    private List<CheckResourceDTO> checkResourceList;
    /**
     * 记录操作人员ID
     */
    private Integer operatorId;
    /**
     * 记录操作人员姓名
     */
    private String operatorName;

    public static void main(String[] args) throws IOException {
        String input = "carIds\t车辆中心car_id集合\tList<Long>\t对应车辆中心表cc_car里面的car_id\t是\t \n" +
                "bizSource\t业务来源集合\tList<Integer>\t \t是\t \n" +
                "bizOrderNos\t关联的业务单号集合\tList<String>\ttms对应到运单号，wms对应到入库通知单号\t是\t \n" +
                "checkTerminal\t终端类型集合\tList<Integer>\t \t是\t \n" +
                "checkBeginDate\t验车开始时间集合\tList<Date>\t \t是\t \n" +
                "checkEndDate\t验车结束时间集合\tList<Date>\t \t是\t \n" +
                "isDeleted\t是否有效集合\tList<Integer>\t \t是\t ";

        try (BufferedReader br = new BufferedReader(new StringReader(input))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split("\\t");
                System.out.println("/** \n  *" + split[1] + "\n */\n private " + split[2] + " " + split[0] + ";");
            }
        }
    }

}
