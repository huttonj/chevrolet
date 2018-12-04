var Url = {
    // 车辆信息管理
    LIST_CAR: '/carManage/carList.json',
    UPDATE_CAR_INFO: '/carManage/updateCarInfo.json'
};

var Common = {
    urlParams: function () {
        var url = location.href;
        var requestParams = {};
        var index = url.indexOf("?");
        if (index !== -1) {
            var paramsStr = url.substr(index + 1);
            var params = paramsStr.split("&");
            for (var i = 0; i < params.length; i++) {
                requestParams[params[i].split("=")[0]] = decodeURI(params[i].split("=")[1]);
            }
        }
        return requestParams;
    }
};

/**
 * 替换所有匹配exp的字符串为指定字符串
 * @param exp 被替换部分的正则
 * @param newStr 替换成的字符串
 */
String.prototype.replaceAll = function (exp, newStr) {
    return this.replace(new RegExp(exp, "gm"), newStr);
};

/**
 * 原型：字符串格式化
 * @param args 格式化参数值
 */
String.prototype.format = function(args) {
    var result = this;
    if (arguments.length < 1) {
        return result;
    }

    var data = arguments; // 如果模板参数是数组
    if (arguments.length == 1 && typeof (args) == "object") {
        // 如果模板参数是对象
        data = args;
    }
    for ( var key in data) {
        var value = data[key];
        if (undefined != value) {
            result = result.replaceAll("\\{" + key + "\\}", value);
        }
    }
    return result;
}