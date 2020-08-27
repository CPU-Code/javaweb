/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-27 16:21:50
 * @LastEditTime: 2020-08-27 18:15:15
 * @FilePath: \web\ajax_demo\ajax_demo.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
function getXMLHttpRequest()
{
    var xmlhttp = null;

    //自动检测当前浏览器的版本，如果是IE5.0以上的高版本的浏览器
    if(window.XMLHttpRequest)
    {
        // code for IE7+, Firefox, Chrome, Opera, Safari
        //创建请求对象
        xmlhttp = new XMLHttpRequest();
    }
    else
    {
        //如果浏览器是底版本的

        // code for IE6, IE5
        //创建请求对象
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    //返回请求对象
    return xmlhttp;
}

function loadData()
{
    var xmlhttp;

    //第一步：创建请求对象
    xmlhttp = getXMLHttpRequest();

    // 每个状态改变时都会触发这个事件处理器
    xmlhttp.onreadystatechange = function()
    {
        // readyState : 请求的状态。 0 = 未初始化， 1 = 正在加载， 2 = 已加载， 3 = 交互中， 4 = 完成
        // status : 服务器的 HTTP 状态码（200 对应 OK， 404 对应 Not Found（未找到） ）
        if(xmlhttp.readState == 4 && xmlhttp.status == 200)
        {
            // 处理服务器应答
            // responseText 服务器的响应， 表示为一个字符串
            document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
        }
    }

    /*
     *	建立对服务器的请求
	 *	GET: 通过"GET"方法，还有"POST"
	 *	ajax_demo.txt: url路径，相对路径或者绝对路径
	 *	true,异步；false,同步
	 */
	//第三步：创建服务器请求 ，true为异步
    xmlhttp.open("GET", "ajax_demo.txt", true);

    //把指定首部设置为所提供的值。 在设置任何首部之前必须先调用 open()
    xmlhttp.setRequestHeader("If-Modified-Since", "0");

    //第四步：发送服务器请求
    // 向服务器发送请求，先open()，才能再调用send();
    xmlhttp.send();
}