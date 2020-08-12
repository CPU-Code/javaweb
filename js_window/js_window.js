/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 10:06:39
 * @LastEditTime: 2020-08-12 10:09:50
 * @FilePath: \web\js_window\js_window.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
function window_show_href()
{
    //显示当前 URL
    alert(window.location.href);
}

function window_set_href()
{
    // //修改 href， 实现网页跳转
    window.location.href = "https://blog.csdn.net/qq_44226094"
}

function window_open()
{
    //打开一个新的窗口
    window.open("https://blog.csdn.net/qq_44226094");
}

function window_close()
{
    //关闭当前窗口
    window.close();
}