﻿<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>vue.js带有星期日期的数字时钟代码</title>

<style>
html, body {
  height: 80%;
}

body {
  background: #0f3854;
  background: -webkit-radial-gradient(center ellipse, #0a2e38 0%, #000000 70%);
  background: radial-gradient(ellipse at center, #0a2e38 0%, #000000 70%);
  background-size: 80%;
}

p {
  margin: 0;
  padding: 0;
}

#clock {
  font-family: 'Share Tech Mono', monospace;
  color: #ffffff;
  text-align: center;
  position: absolute;
  left: 50%;
  top: 42%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  color: #daf6ff;
  text-shadow: 0 0 20px #0aafe6, 0 0 20px rgba(10, 175, 230, 0);
}
#clock .time {
  letter-spacing: 0.05em;
  font-size: 210px;
  padding: 25px 0;
}
#clock .date {
  letter-spacing: 0.1em;
  font-size: 30px;
}
#clock .text {
  letter-spacing: 0.1em;
  font-size: 12px;
  padding: 20px 0 0;
}
</style>

</head>
<body>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/vue.min.js"></script>

<div id="clock">
    <p class="date">{{ date }}</p>
    <p class="time">{{ time }}</p>
    <!-- <p class="text">数字时钟</p> -->
</div>

<script>
var clock = new Vue({
    el: '#clock',
    data: {
        time: '',
        date: ''
    }
});

var week = ['星期天', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];
var timerID = setInterval(updateTime, 1000);
updateTime();
function updateTime() {
    var cd = new Date();
    clock.time = zeroPadding(cd.getHours(), 2) + ':' + zeroPadding(cd.getMinutes(), 2) + ':' + zeroPadding(cd.getSeconds(), 2);
    clock.date = zeroPadding(cd.getFullYear(), 4) + '-' + zeroPadding(cd.getMonth()+1, 2) + '-' + zeroPadding(cd.getDate(), 2) + ' ' + week[cd.getDay()];
};

function zeroPadding(num, digit) {
    var zero = '';
    for(var i = 0; i < digit; i++) {
        zero += '0';
    }
    return (zero + num).slice(-digit);
}
</script>

<div style="text-align:center;margin:70px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#ffffff">
<h2><p>欢  迎  使  用</p></h2>
</div>
</body>
</html>