<%--
  Created by IntelliJ IDEA.
  User: cpucode
  Date: 2020/10/31
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <br/>
  hello cpu_code
  <br/>

  <!--定义的java代码，在service方法中。service方法中可以定义什么，该脚本中就可以定义什么-->
  <%
    System.out.println("hello jsp");
    int i = 5;

    String contextPath = request.getContextPath();

    //字符输出流对象。可以将数据输出到页面上
    out.println(contextPath);
  %>

  <!--定义的java代码，在jsp转换后的java类的成员位置-->
  <%!
    int i = 3;
  %>

  <!--定义的java代码，会输出到页面上。输出语句中可以定义什么，该脚本中就可以定义什么-->
  <%=
    "i = " + i
  %>

  <h1>hello------ jsp</h1>

  <!-- 在tomcat服务器真正给客户端做出响应之前，会先找response缓冲区数据，再找out缓冲区数据。
        response.getWriter()数据输出永远在out.write()之前-->
  <%
    response.getWriter().write("response------------\n");
  %>

  </body>
</html>
