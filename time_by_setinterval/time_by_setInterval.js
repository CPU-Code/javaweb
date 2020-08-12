/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 16:12:40
 * @LastEditTime: 2020-08-12 16:23:25
 * @FilePath: \web\time_by_setinterval\time_by_setInterval.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
var stop_flag = 0;

function time()
{
    var time = new Date();
    var h = time.getHours();
    var m = time.getMinutes();
    var s = time.getSeconds();

    document.getElementById("time").value = h + ":" + m + ":" + s;
}

function start_onload()
{
    //在指定的毫秒数后调用函数time()函数
    // 只需要设置一次， 就可以多次调用回调函数， 直到调用 clearInterval
    stop_flag = setInterval("time()" , 1000);
}

function stop1()
{
    //通过 setInterval() 返回值，停止调用
    clearInterval(stop_flag);
}