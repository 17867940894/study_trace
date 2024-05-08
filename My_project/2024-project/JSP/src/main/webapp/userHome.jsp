<%@ page import="bean.User" %><%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/27
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户主页</title>
</head>
<body>
<h1>
    <%
        User user = (User) session.getAttribute("user");
    %>
    <%=
    user==null?"登录信息过期，请重新登录":"欢迎您" + user.getUsername()
    %>
</h1>
</body>
</html>
