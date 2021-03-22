<%--
  User: cpucode
  Date: 2020/12/18
  Time: 19:55
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<%--
isErrorPage：标识当前也是是否是错误页面。
    true：是，可以使用内置对象exception
    false：否。默认值。不可以使用内置对象exception
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>服务器正忙...</h1>
    <%--
        变量名		 真实类型		   作用
        exception	 hrowable	  异常对象
    --%>

    <%
        String message = exception.getMessage();

        //变量名	  真实类型		作用
        //out	   JspWriter	输出对象，数据输出到页面上
        out.print(message);
    %>
</body>
</html>
