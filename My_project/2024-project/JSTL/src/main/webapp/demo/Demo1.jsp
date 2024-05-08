<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL配置页面</title>
</head>
<%
    request.setAttribute("a", "a");
    int score = new Random().nextInt(101);
    request.setAttribute("score", score);
%>

<body>
<h1>JSTL配置页面</h1>
<%-- EL表达式中的内容最好不要有特殊字符，如`.空格等，让字母和逻辑，算数运算符等符号紧紧贴着 --%>
<c:if test="${requestScope.a==null}">
    request中没有a元素
</c:if>

<c:if test="${requestScope.a!=null}">
    嘿嘿
</c:if>
<hr>
<p>score:${score}</p>
<%--这里的score是EL直接从最小的域对象中找score这个键，相当于***.getAttribute(x,x)--%>
<c:if test="${score>=60}">
    合格
</c:if>

<c:if test="${score<60}">
    不合格
</c:if>
</body>
</html>
