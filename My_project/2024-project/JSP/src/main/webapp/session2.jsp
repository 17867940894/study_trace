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
    <title>session2.jsp</title>
</head>
<body>
<h1>session2</h1>
<%
    User user = (User)session.getAttribute("user");
    out.write(user.getId() + "<hr>");
    out.write(user.getUsername() + "<hr>");
    out.write(user.getPassword() + "<hr>");
%>
</body>
</html>
