$(document).ready(function () {
    // muu.field.datetimepicker($(".js-pickDate"), {format: "YYYY-MM-DD HH:mm:ss"});
    var request = Common.urlParams();

    $('#showAddVINBtn').on('click', showAddVINModal);
    $('#checkVINBtn').on('click', checkVIN);
    $('#addVINSBtn').on('click', addVINs);
});

function showAddVINModal() {
    $('#addVinModal').modal('show');
}

function checkVIN() {
    muu.ajax.get('/vin_check/' + $('#vin').val(), function (data) {
        if(data) {
            alert("校验通过！");
        } else {
            alert("校验未通过！");
        }
    }, false);
}

function addVINs() {
    var params = {
        vins: $('#vins').val()
    };
    muu.ajax.waiting($('#addVinModal'));
    muu.ajax.post('/vin/vin_check', params, function () {
        alert("添加成功!");
        $('#addVinModal').modal('hide');
    });
}


