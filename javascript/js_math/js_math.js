/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 16:31:36
 * @LastEditTime: 2020-08-27 15:31:56
 * @FilePath: \web\js_math\js_math.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
function fun(deal_num)
{
    var num1 = document.getElementById("num1").value;
    var num2 = document.getElementById("num2").value;

    if(isNaN(num1) || isNaN(num2))
    {
        alert("输入数");

        document.getElementById("num1").value="";
        document.getElementById("num2").value='';
        document.getElementById("result").value='';
        
        return;
    }

    var dest;//存储处理结果
    switch(deal_num)
    {
        case 1:
            alert("求较大值");
            alert(Number(num1));
            alert(Number(num2));
            // 求最大值
            dest = Math.max(Number(num1), Number(num2));
            break;

        case 2:
            // 求和
            dest = Number(num1) + Number(num2);
            break;
    }

    document.getElementById("result").value = dest;//显示结果
}