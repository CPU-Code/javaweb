/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-27 14:28:01
 * @LastEditTime: 2020-08-27 14:51:54
 * @FilePath: \web\js_printer\js_printer.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
var str = "成功人士<br><br>\
            专家正在讲课：什么是成功人士你们知道吗？<br><br>\
            成功人士就是：一、不给别人发名片; <br><br>\
            二、自己不开车；三、衣服没logo；<br><br>\
            四、住的是小独院；五、每天有时间午睡；<br><br>\
            六、经常在郊区户外活动；七、包里现金很少；<br><br>\
            八、可以生两个以上孩子……<br><br>\
            你们中间，谁是？<br><br>\
            旁边一位cpucode兴奋地打断他：这种人，那边写代码的都是！<br><br>\
            点评：所有程序员都是成功人士！";

var index = 0;
var timer;

function printer()
{
    if(index == str.length)
    {
        clearInterval(timer)
    }
    else
    {
        document.getElementById("content").innerHTML = str.substring(0, index);

        index++;
    }
}

function start_printer()
{
    timer = setInterval("printer()", 100);
}

