<%--
  User: cpucode
  Date: 2020/12/20
  Time: 15:02
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>隐式对象</title>
</head>
<body>
    <%--
    隐式对象：
        * el表达式中有11个隐式对象
        * pageContext：
            * 获取jsp其他八个内置对象
                * ${pageContext.request.contextPath}：动态获取虚拟目录
    --%>

    \${pageContext.request} = ${pageContext.request}
    <br>

    <h4>在jsp页面动态获取虚拟目录</h4>

    \${pageContext.request.contextPath} = ${pageContext.request.contextPath}
</body>
</html>
