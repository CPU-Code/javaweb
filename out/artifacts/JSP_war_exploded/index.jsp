<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
import：导包
--%>
<%--
  User: cpucode
  Date: 2020/12/18
  Time: 19:52
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="500.jsp" buffer="16kb" language="java" %>
<%--
<%@ 指令名称 属性名1=属性值1 属性名2=属性值2 ... %>
--%>
<%--
变量名	真实类型	    作用
page    Object    当前页面(Servlet)的对象  this
--%>
<%--
contentType：等同于response.setContentType()
    1. 设置响应体的mime类型以及字符集
    2. 设置当前jsp页面的编码（只能是高级的IDE才能生效，如果使用低级工具，则需要设置pageEncoding属性设置当前页面的字符集）
--%>
<%--
errorPage：当前页面发生异常后，会自动跳转到指定的错误页面
--%>
<%--
注释:
    1. html注释：
        <!-- -->:只能注释html代码片段
    2. jsp注释：推荐使用
--%>
<%-- ：可以注释所有 --%>


<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
        List list = new ArrayList();

        int i = 2/0;
    %>
  </body>
</html>
