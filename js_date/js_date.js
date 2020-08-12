/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 10:52:58
 * @LastEditTime: 2020-08-12 12:39:41
 * @FilePath: \web\js_date\js_date.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
var d = new Date();
var hour = d.setHours();

document.write("<br>");
document.write("现在时间 :");
//返回当前年份
document.write(d.getFullYear());
document.write("年");
// 返回当前月份， 0～11
document.write(d.getMonth() + 1);
document.write("月");
// 返回一月中的某一天
document.write(d.getDate());
document.write("日");

document.write(" 星期");
// 返回星期中的某一天， 0~6,0 表示周日
document.write(d.getDay() + " ");
// 返回当前时间的小时， 0～23
document.write(d.getHours());
document.write("点");
// 返回当前时间的分钟， 0～59
document.write(d.getMinutes());
document.write("分");
// 返回当前时间的秒， 0～59
document.write(d.getSeconds());
document.write("秒");
document.write("<br>");
document.write("<br>");

if(hour < 12)
{
    document.write("good morning");
}
else if(hour < 18)
{
    document.write("good afternoon");
}
else if(hour < 24)
{
    document.write("good nignt");
}