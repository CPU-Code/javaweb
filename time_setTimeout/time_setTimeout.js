/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 12:43:29
 * @LastEditTime: 2020-08-12 15:45:45
 * @FilePath: \web\time_setTimeout\time_setTimeout.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
var stop_flag = 0;

function timeout()
{
    var time = new Date();

    var h = time.getHours();
    var m = time.getMinutes();
    var s = time.getSeconds();

    document.getElementById("time").value = h+":"+m+":"+s;
    //指定的毫秒数后调用函数timeout
    stop_flag = setTimeout("timeout()", 1000);
}


function start_onload()
{
    timeout();
}

function stop()
{
    //通过setTimeout返回值，停止定时
    clearTimeout(stop_flag);
}

function start()
{
    timeout();
}
