<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2020/11/8
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <h1>
        <%=
            request.getSession().getAttribute("user")
        %>
        , 欢迎你
    </h1>
</body>
</html>
