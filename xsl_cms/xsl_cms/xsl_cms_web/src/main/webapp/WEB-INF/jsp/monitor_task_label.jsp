<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/18
  Time: 15:33
  To change this template use File | Settings | File Templates.
  任务标签监控
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
    <base href="<%=basePath%>"/>
    <meta charset="utf-8">
</head>
<body>
<!-- 写一个表格的名字 -->
<div id="myChart" style="height: 100% ;height:450px;">
</div>
<script type="text/javascript" src="<%=basePath%>js/echarts.min.js">
</script>
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js">
</script>

<script type="text/javascript">
    // 基于准备好的dom，初始化echarts图表
    var myChart = echarts.init(document.getElementById('myChart'));
    //实时更新
    window.setInterval(function () {
        //json数据传值，每次过来传输一个值就可以了，因为这是实时监控的
        $.ajax({
            url:"monitor/tag/mount",
            type:"post",
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function(data){
                if(data != null){
                    //json数据转换成字符串
                    refreshData(data);
                }
            }
        });
    },500);

    //数据的更新
    function refreshData(data){
        var lengnth = [];
        for(var i = 0 ; i < data.length ; i ++){
            lengnth[i] = data[i].name;
        }
        if(!myChart){
            return;
        }
        //数量的更新
        myChart.setOption({
            legend: {
                left:"5%",
                icon:"pin",
                orient: 'vertical', // 纵向
                selected: {
                    '标签使用情况' : true
                },
                data: lengnth
            },
            tooltip : {   //鼠标经过显示的数据格式
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            labelLine: {
                normal: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255, 0.5)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                }
            },
            series : [
                {
                    name: '标签使用情况',
                    type: 'pie',
                    radius: '80%',   //半径，改变图的大小
                    minAngle:5,
                    center: ['50%', '50%'],
                    data:data.sort(function (a, b) { return a.value - b.value; }), //进行排序从小到大
                    roseType: 'angle',
                    itemStyle: {
                        normal: {
                            shadowBlur: 200,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        });
    }
</script>
</body>
</html>