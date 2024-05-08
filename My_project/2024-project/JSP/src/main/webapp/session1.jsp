<%@ page import="bean.User" %><%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/27
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session1.jsp</title>
</head>
<body>
<h1>session1</h1>
<%!
    User user = new User(30,"zhangSan","123456");
%>

<%
    session.setAttribute("user",user);
%>

</body>
</html>
