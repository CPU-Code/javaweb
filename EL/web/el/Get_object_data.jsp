<%@ page import="domain.User" %>
<%@ page import="java.util.*" %>
<%--
  User: cpucode
  Date: 2020/12/19
  Time: 16:56
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取对象数据</title>
</head>
<body>
    <%
        User user = new User();
        user.setId(1);
        user.setName("北鼻");
        user.setMoney(9999);
        user.setBirthday(new Date());

        request.setAttribute("u", user);

        List list = new ArrayList();
        list.add("cpu");
        list.add("cpucode");
        list.add(user);

        request.setAttribute("list", list);

        Map map = new HashMap();

        map.put("mname", "不知妻美");
        map.put("gender", "男");
        map.put("user", user);

        request.setAttribute("map", map);
    %>

    <%--
    * 通过的是对象的属性来获取
        * setter或getter方法，去掉set或get，在将剩余部分，首字母变为小写。
        * setName --> Name --> name
    --%>

    <h3>el获取对象中的值</h3>

    \${requestScope.u} = ${requestScope.u}
    <br>

    \${requestScope.u.id} = ${requestScope.u.id}
    <br>
    \${u.name} = ${u.name}
    <br>
    \${u.money} = ${u.money}
    <br>
    \${u.birthday} = ${u.birthday}
    <br>
    \${u.birStr} = ${u.birStr}
    <br>


    <h3>el获取List值</h3>
    \${list} = ${list}
    <br>
    \${list[0} = ${list[0]}
    <br>
    \${list[1} = ${list[1]}
    <br>
    \${list[2} = ${list[2]}
    <br>
    \${list[3} = ${list[3]}
    <br>

    \${list[2].id} = ${list[2].id}
    <br>
    \${list[2].name} = ${list[2].name}
    <br>
    \${list[2].money} = ${list[2].money}
    <br>
    \${list[2].birthday} = ${list[2].birthday}
    <br>
    \${list[2].birStr} = ${list[2].birStr}
    <br>

    <h3>el获取Map值</h3>
    \${map.mname} = ${map.mname}
    <br>
    \${map.gender} = ${map.gender}
    <br>
    \${map["geder"]} = ${map["geder"]}
    <br>
    \${map.user.id} = ${map.user.id}
    <br>
    \${map.user.name} = ${map.user.name}
    <br>
    \${map.user.money} = ${map.user.money}
    <br>
    \${map.user.birthday} = ${map.user.birthday}
    <br>
    \${map.user.birStr} = ${map.user.birStr}
    <br>

</body>
</html>
