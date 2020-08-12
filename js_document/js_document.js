/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 10:26:56
 * @LastEditTime: 2020-08-12 10:45:17
 * @FilePath: \web\js_document\js_document.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */

// 获取当前文档的标题
alert("title:"+document.title);

// 获取 URL 信息
alert("URL:"+document.URL);

// 在 HTML 页面中写入 HTML 表达式
document.write("<hl> hello world </hl>");

function change_label()
{
    // 根据对应的 ID 号去访问、 控制 HTML 页面中的标签元素
    document.getElementById("label2").innerHTML="name";
}

function change_input()
{
    document.getElementById("input2").value="cpucode";
}

function change_img()
{
    document.getElementById("img2").src = "./img/change.png";
}