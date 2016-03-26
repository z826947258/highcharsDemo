<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/3/26
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Highcharts Example</title>

    <script type="text/javascript" src="static/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //加载数据
            $.ajax({
                type: "get",
                url: "charts/getData",
                dataType: "json",
                success : function(data){
                    loadCharts(data);
                }
            });

        });

        //渲染图表
        function loadCharts(dataResult) {
            $('#container').highcharts({
                chart: {
                    type: 'scatter',
                    zoomType: 'xy'
                },
                title: {
                    text: 'Height Versus Weight of 507 Individuals by Gender'
                },
                subtitle: {
                    text: 'Source: Heinz  2003'
                },
                xAxis: {
                    title: {
                        enabled: true,
                        text: 'Height (cm)'
                    },
                    startOnTick: true,
                    endOnTick: true,
                    showLastLabel: true
                },
                yAxis: {
                    title: {
                        text: 'Weight (kg)'
                    }
                },
                legend: {
                    layout: 'vertical',
                    align: 'left',
                    verticalAlign: 'top',
                    x: 100,
                    y: 70,
                    floating: true,
                    backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
                    borderWidth: 1
                },
                plotOptions: {
                    scatter: {
                        marker: {
                            radius: 5,
                            states: {
                                hover: {
                                    enabled: true,
                                    lineColor: 'rgb(100,100,100)'
                                }
                            }
                        },
                        states: {
                            hover: {
                                marker: {
                                    enabled: false
                                }
                            }
                        },
                        tooltip: {
                            headerFormat: '<b>{series.name}</b><br>',
                            pointFormat: '{point.x} cm, {point.y} kg'
                        }
                    }
                },
                series: [{
                    name: 'Female',
                    color: 'rgba(223, 83, 83, .5)',
                    data: dataResult
                }, {
                    name: 'Male',
                    color: 'rgba(119, 152, 191, .5)',
                    data: dataResult
                }]
            });
        }
    </script>
</head>
<body>
<script src="static/js/highcharts.js"></script>
<script src="static/js/exporting.js"></script>

<div id="container" style="min-width: 310px; height: 400px; max-width: 800px; margin: 0 auto"></div>

</body>
</html>
