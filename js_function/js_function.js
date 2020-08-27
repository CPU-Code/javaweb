/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-27 15:05:18
 * @LastEditTime: 2020-08-27 15:28:07
 * @FilePath: \web\js_function\js_function.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
function calc(action)
{
    // isNaN检查是非为数字
    if( isNaN(document.getElementById("data1").value) || isNaN(document.getElementById("data2").value) )
    {
        alert("输入有效的数字");
        
        document.getElementById("data1").value = "";
        document.getElementById("data2").value = "";
    }
    else
    {
        if(0 == action)
        {
            // Number 把值转为数字
            document.getElementById("result").innerHTML = Number(document.getElementById("data1").value) + 
                                                          Number(document.getElementById("data2").value);

        }
        else if(1 == action)
        {
            document.getElementById("result").innerHTML = Number(document.getElementById("data1").value) - 
                                                          Number(document.getElementById("data2").value);
        }
    }
}