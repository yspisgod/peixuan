//定义产生的圆球数量
var count =10;
// 获取界面宽度和高度
var bodyWidth = $(window).width();
var bodyHeight = $( window ).height();
//加载后运行
$(function () {

    //定义寻找不到使用的图像

    //生产圆球
    for(var i=0;i<count;i++){
        var size=Math.floor((Math.random() * 200) + 50)+"px";
        //创建一个圆球
        $("#404body").append("<div id=\""+"circle"+i+"\" class='container'><img width=\""+size+"\" height=\""+size+"\" class=\"rounded-circle\" style=\"background-color: red;position: absolute;\"  src=\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1539336866676&di=42d4a1cedd082354a7074cd29a7ae562&imgtype=0&src=http%3A%2F%2Fww1.sinaimg.cn%2Flarge%2F85d77acdgw1f4hqkshvw6g20dw0741k8.jpg\" '/><div class='icon-font text-right' style='position: absolute;font-size: 30px;color: white;'>无法找到</div></div>");
        //获取随机值
        var x = Math.floor((Math.random()*bodyWidth)+1);
        var y = Math.floor((Math.random()*bodyHeight)+1);
        console.log("I am working" + x+" ----  "+y+"    "+bodyWidth+"-----"+bodyHeight);
        var temp="#circle"+i;
        $(temp).css({
            'left':x+'px',
            'position': 'absolute',
            'display':'none'
        });
        loopAnimate();

    }

    //监控鼠标移动
    // $(document).bind("mousemove", function(e) {
    //     console.log("mouseposition"+event.pageX+"   "+event.pageY);
    //     for(var i=0;i<count;i++){
    //         //停止动画
    //         $("#circle"+i).stop();
    //         //获取子节点位置
    //         var offset=$("#circle"+i).offset();
    //         //向左移动
    //         var leftdistance=e.pageX-offset.left;
    //         $("#circle"+i).animate({
    //             left:"+="+leftdistance
    //         },5000,function () {
    //             this.stop();
    //         })
    //         //向上移动
    //         var topdistance=e.pageY-offset.top;
    //         $("#circle"+i).animate({
    //             top:"+="+topdistance
    //         },5000,function () {
    //
    //         })
    //     }
    //
    // } )

});

//下表情包函数
function loopAnimate() {
    //获取随机一个雨点
    var randomNumber = Math.floor((Math.random()*9)+1);
    //让雨点下落时间随机
    var downtime = Math.floor((Math.random()*6000)+1000);
    var temp="#circle"+randomNumber;
    console.log(randomNumber+"===="+$(temp).css('display'));
    if($(temp).css('display')=="block"){
        loopAnimate();
        return;
    }
    //让其显现

    $(temp).css({
        'display':'inline'
    });
    $(temp).animate({
        top:"+="+bodyHeight
    },downtime,function () {
        // 完成后让其消失并复归原位
        $(temp).css({
            'top':'0px',
            'display':'none'
        });
        loopAnimate();
    });

}