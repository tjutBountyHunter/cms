<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/17
  Time: 13:17
  To change this template use File | Settings | File Templates.
  用户数量监控
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<base href="<%=basePath%>"/>
<div id="myChart" style="height: 100% ;height:450px;">
</div>
<script type="text/javascript" src="<%=basePath%>js/echarts.js">
</script>
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js">
</script>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts图表
    var myChart = echarts.init(document.getElementById('myChart'));

    var app = {};
    var option = null;
    option = {
        title: {
            text: '用户数量变化',
        },
        color: {
            type: 'linear',
            x: 0,
            y: 0,
            x2: 0,
            y2: 1,
            colorStops: [{
                offset: 0, color: 'red' // 0% 处的颜色
            }, {
                offset: 1, color: 'yellow' // 100% 处的颜色
            }],
            globalCoord: false // 缺省为 false
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                label: {
                    backgroundColor: '#283b56'
                }
            }
        },
        legend: {
            data:['活跃性变化']
        },
        toolbox: {
            show: true,
            feature: {
                dataView: {readOnly: false},
                restore: {},
                saveAsImage: {}
            }
        },
        xAxis: [
            {
                type: 'category',
                boundaryGap: true,
                data: (function (){
                    var now = new Date();
                    var res = [];
                    var len = 10;
                    while (len--) {
                        res.unshift(now.toLocaleTimeString().replace(/^\D*/,''));   //时间推进
                        now = new Date(now - 1000);    //时间差
                    }
                    return res;
                })()
            }
        ],
        yAxis: [
            {
                type: 'value',
                scale: true,
                name: '数量/人',
                boundaryGap: [0, '50%']  //Y 一直处于y轴的一半
            }
        ],
        series: [     //添加数据
            {
                name:'数量变化',
                type:'line',
                smooth:true,
                areaStyle: {
                    normal: {}
                },
                symbol: 'none',
                data:(function (){
                    var res = [];
                    var len = 0;
                    while (len < 10) {
                        res.push(0);     //初始数据
                        len++;
                    }
                    return res;
                })()
            }
        ]
    };

    app.count = 11;
    setInterval(function (){
        axisData = (new Date()).toLocaleTimeString().replace(/^\D*/,'');

        var data0 = option.series[0].data;
        data0.shift();
        var mount;
        //ajax传值
        $.ajax({
            url:"monitor/user/mount",
            type:"post",
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function(data){
                data0.push(data);  //随着时间推进的数据
            }
        });

        option.xAxis[0].data.shift();
        option.xAxis[0].data.push(axisData);

        myChart.setOption(option);
    }, 1100);
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>