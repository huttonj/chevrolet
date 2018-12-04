/**
 * Created by yang on 17/6/29.
 */
$(document).ready(function () {
    // muu.field.datetimepicker($(".js-pickDate"), {format: "YYYY-MM-DD HH:mm:ss"});
    var request = Common.urlParams();
    // initDateTimePicker();
    tableInit();
});


function initDateTimePicker() {
    var $picker = $(".js-pickDateTime");

    $picker.on({
        "dp.change": function dpChange(evt) {
            $("input[name='" + $picker.attr("data-to") + "']", $picker.closest("form")).val(moment(evt.date).format("YYYY-MM-DD"));
        },
        "dp.hide": function dpHide(evt) {
            var date = moment(evt.date).format("YYYY-MM-DD");
            var $ipt = $("input[name='" + $picker.attr("data-to") + "']", $picker.closest("form"));

            if (date && $ipt.val() === "") {
                $ipt.val(date);
            }
        }
    });

    muu.field.datetimepicker($picker, {format: "L", defaultDate: new Date()});
}

function tableInit() {
    var columns = [{
        field: 'carId',
        title: '车辆id'
    },{
        field: 'carLoanOrderNo',
        title: '订单号'
    }, {
        field: 'carUnique',
        title: '车架号',
        formatter: function (value, row) {
            return "<input style='width:160px' id='carUnique"+ row.carId +"' value='" + value + "'/>";
        }
    },{
        field: 'outerColorId',
        title: '外观id',
        formatter: function (value, row) {
            return "<input style='width:160px' id='outerColorId"+ row.carId +"' value='" + value + "'/>";
        }
    },{
        field: 'outerColorName',
        title: '外观name',
        formatter: function (value, row) {
            return "<input style='width:160px' id='outerColorName"+ row.carId +"' value='" + value + "'/>";
        }
    },{
        field: 'innerColorId',
        title: '内饰id',
        formatter: function (value, row) {
            return "<input style='width:160px' id='innerColorId"+ row.carId +"' value='" + value + "'/>";
        }
    },{
        field: 'innerColorName',
        title: '内饰name',
        formatter: function (value, row) {
            return "<input style='width:160px' id='innerColorName"+ row.carId +"' value='" + value + "'/>";
        }
    },{
        field: 'carStatus',
        title: '车辆状态',
        formatter: function (value, row) {
            return "<input id='carStatus"+ row.carId +"' value='" + value + "'/>";
        }
    }, {
        field: 'isDeleted',
        title: '是否删除',
        formatter: function (value, row) {
            return "<input id='isDeleted"+ row.carId +"' value='" + value + "'/>";
        }
    }, {
        field: 'operation',
        title: '操作',
        formatter: function () {
            var buttons = [{
                text: '修改',
                action: 'modifyCarInfo',
                icon: 'comments-o',
                isCoexisted: true
            }];
            return muu.generate.action(buttons, true);
        },
        events: {
            'click .js-modifyCarInfo': function (evt, val, row) {
                var carLoanId = row.carLoanId;
                var carId = row.carId;
                var carUnique = $('#carUnique' + row.carId).val();
                var innerColorId = $('#innerColorId' + row.carId).val();
                var innerColorName = $('#innerColorName' + row.carId).val();
                var outerColorId = $('#outerColorId' + row.carId).val();
                var outerColorName = $('#outerColorName' + row.carId).val();
                var carStatus = $('#carStatus' + row.carId).val();
                var isDeleted = $('#isDeleted' + row.carId).val();
                modifyCarInfo(carLoanId,carId,carUnique,innerColorId,innerColorName,outerColorId,outerColorName,carStatus,isDeleted);
            }
        }
    }];
    //table初始化
    muu.table.init({
        url: Url.LIST_CAR,
        columns: columns,
        paginationVAlign: 'top'
    });

    function modifyCarInfo(carLoanId,carId,carUnique,innerColorId,innerColorName,outerColorId,outerColorName,carStatus,isDeleted) {
        var params = {
            carLoanId : carLoanId,
            carId: carId,
            carUnique : carUnique,
            innerColorId:innerColorId,
            innerColorName:innerColorName,
            outerColorId: outerColorId,
            outerColorName: outerColorName,
            carStatus : carStatus,
            isDeleted : isDeleted
        };
        muu.ajax.get(Url.UPDATE_CAR_INFO, params, function (data) {
            if(data){
                alert("更新成功")
            }
        });
    }
}