<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  User: cpucode
  Date: 2020/12/18
  Time: 22:19
  Github: https://github.com/CPU-Code
  CSDN: https://blog.csdn.net/qq_44226094
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
概念 :Expression Language 表达式语言
用法：替换和简化jsp页面中java代码的编写
语法：${表达式}
--%>
<%--
jsp默认支持el表达式的。如果要忽略el表达式
    设置jsp中page指令中：isELIgnored="true" 忽略当前jsp页面中所有的el表达式
    \${表达式} ：忽略当前这个el表达式
--%>
<html>
<head>
    <title>运算符</title>
</head>
<body>

    <h3>算数运算符</h3>
    \${3 + 4} = ${3 + 4}
    <br>

    \${3 - 4} = ${3 - 4}
    <br>

    \${3 * 4} = ${3 * 4}
    <br>

    \${ 3 / 4} = ${3 / 4}
    <br>

    \${3 div 4} = ${3 div 4}
    <br>

    <%--取模--%>
    \${3 mod 4} = ${3 mod 4}
    <br>

    <h3>比较运算符</h3>
    \${3 == 4}= ${3 == 4}
    <br>

    \${3 != 4}= ${3 != 4}
    <br>

    \${6 > 6}= ${6 > 6}
    <br>

    \${6 < 6}= ${6 < 6}
    <br>

    \${6 >= 6}= ${6 >= 6}
    <br>

    \${6 <= 6}= ${6 <= 6}
    <br>

    <h3>逻辑运算符</h3>
    \${3 > 4 && 3 < 4} = ${3 > 4 && 3 < 4}
    <br>
    \${3 > 4 and 3 < 4} = ${3 > 4 and 3 < 4}
    <br>
    <br>

    \${3 > 4 || 3 < 4} = ${3 > 4 || 3 < 4}
    <br>
    \${3 > 4 or 3 < 4} = ${3 > 4 or 3 < 4}
    <br>
    <br>

    \${!(3 > 4)} = ${!(3 > 4)}
    <br>


    <%--空运算符： empty --%>
    <%-- 判断字符串、集合、数组对象是否为null或者长度是否为0 --%>
    <h3>empty运算符</h3>
    <%
        String str = "";
        request.setAttribute("str", str);

        List list = new ArrayList();
        request.setAttribute("list", list);
    %>

    <%--${empty list}:判断字符串、集合、数组对象是否为null或者长度为0 --%>
    <%-- ${not empty str}:表示判断字符串、集合、数组对象是否不为null 并且 长度>0 --%>
    \${empty str} = ${empty str}
    <br>
    \${not empty str} = ${not empty str}
    <br>

    \${empty list} = ${empty list}
    <br>
    \${not empty list} = ${not empty list}

</body>
</html>
