<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/30
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bean.User" %>
<html>
<head>
    <title>用户页面</title>
</head>
<body>
<%
    String automaticLogin = (String) session.getAttribute("automatic_login");
    User user = (User)session.getAttribute("user");
    if (automaticLogin == null && user == null){
        response.sendRedirect("/login.jsp");
        return;
    }
%>

<%=
    "欢迎您" + user.getUsername()
%>
<a href="${pageContext.request.contextPath}/close">退出</a>
</body>
</html>
