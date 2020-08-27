function calc(action)
{
	if(isNaN(document.getElementById("data1").value) || isNaN(document.getElementById("data2").value))
	{
		alert("请输入有效的数字！");
		
		document.getElementById("data1").value='';
		document.getElementById("data2").value='';
	}
	else
	{
		var sendData = "";
		sendData += (document.getElementById("data1").value);//12

		if(0 == action)//+
		{
			sendData += "+";//12+
		}
		else if(1 == action)
		{
			sendData += "-";//12-
		}

		sendData += (document.getElementById("data2").value);//12+23    12-23
		loadData(sendData);
	}
}

function getXMLHttpRequest()
{
	var xmlhttp = null;

	if (window.XMLHttpRequest)//自动检测当前浏览器的版本，如果是IE5.0以上的高版本的浏览器
	{// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp=new XMLHttpRequest();//创建请求对象
	}
	else////如果浏览器是底版本的
	{// code for IE6, IE5
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");//创建请求对象
	}

	return xmlhttp;//返回请求对象
}

function loadData(sendData)//12+23
{
	var xmlhttp = null;
	//var url = "/cgi-bin/_cgi2.cgi?";
	var url = "/cgi-bin/_cgi3.cgi";
	//url += sendData;

	//第一步：创建 getXMLHttpRequest 对象
	xmlhttp = getXMLHttpRequest();
	
	//第二步：设置 XMLHttpRequest对象的回调函数
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			document.getElementById("result").innerHTML = xmlhttp.responseText;
		}
	}
	//第三步  用 open方法 创建POST请求
		xmlhttp.open("POST",url,true);
		//xmlhttp.send();
		xmlhttp.setRequestHeader("If-Modified-Since", "0");//清除缓存
	//第四步  发送数据
		xmlhttp.send(sendData);
}
