<%--
  User: cpucode
  Date: 2020/12/19
  Time: 16:21
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
    <%
        //在域中存储数据
        session.setAttribute("name", "cpu");
        request.setAttribute("name", "cpucode");

        session.setAttribute("age", "24");
        request.setAttribute("age", "22");


        request.setAttribute("str", "");
    %>

    <h3>el获取值</h3>
    \${requestScope.name} = ${requestScope.name}
    <br>
    \${sessionScope.name} = ${sessionScope.name}
    <br>
    <br>

    \${requestScope.age} = ${requestScope.age}
    <br>
    \${sessionScope.age} = ${sessionScope.age}
    <br>
    <br>

    \${requestScope.str} = ${requestScope.str}
    <br>
    \${sessionScope.str} = ${sessionScope.str}
    <br>
    <br>

    \${name} = ${name}
    <br>
    \${age} = ${age}
    <br>
    \${str} = ${str}

</body>
</html>
