$(function () {
    initTable();
    var baidu = {
        index: 1,
        level: '最强',
        a: 'https://www.baidu.com'
    };
    var www = {
        index: 2,
        level: '垃圾',
        a: 'https://avatars2.githubusercontent.com/u/18144538?s=400&v=4'
    }


    var data = new Array();
    data.push(www);
    data.push(baidu);
    for (var i = 0; i < data.length; i++) {
        $("#methods").bootstrapTable('insertRow', {
            index: i,
            row: data[i]
        });
    }

});

function initTable() {
    $("#methods").bootstrapTable({

        onClickRow: function (row, $element) {

            window.location.href = row.a;
        },
        columns: [{
            field: 'index',
            align: 'center',
            title: '序号',
            width: '5%'
        },
            {
                field: 'level',
                align: 'center',
                title: '变强等级参考',
                width: '40%'
            }]
    })
    ;

}