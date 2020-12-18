<%--
  User: cpucode
  Date: 2020/12/18
  Time: 21:57
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="top.jsp"%>
<%--
include	： 页面包含的。导入页面的资源文件
--%>

<%--
内置对象:
    变量名		 真实类型					 作用
 pageContext	PageContext				当前页面共享数据，还可以获取其他八个内置对象
 request		HttpServletRequest		一次请求访问的多个资源(转发)
 session		HttpSession				一次会话的多个请求间
 application	ServletContext			所有用户间共享数据
 response		HttpServletResponse		响应对象
 page			Object					当前页面(Servlet)的对象  this
 out			JspWriter				输出对象，数据输出到页面上
 config			ServletConfig			Servlet的配置对象
 exception		Throwable				异常对象
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>cpucode</h1>

    <%
        System.out.println("system.out.println....");
    %>

    <input>

    <%--
    变量名			  真实类型			   作用
    pageContext		PageContext		当前页面共享数据，还可以获取其他八个内置对象
    --%>
    <%
        pageContext.setAttribute("msg", "cpu");
    %>

    <%=pageContext.getAttribute("msg")%>>
</body>
</html>
