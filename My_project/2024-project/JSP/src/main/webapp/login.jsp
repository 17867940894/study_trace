<%@ page import="bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="/login" method="get">
    <label>
        <input type="text" name="username">
        <br>
        <input type="password" name="password">
    </label>
    <br>
    <%
        User user = (User) session.getAttribute("user");
    %>
    <span style="color: dodgerblue">
        <%=
            user == null ? session.getAttribute("error_massage"):""
        %>
    </span>
    <br>
    <button>登录</button>
</form>

<%
    session.setAttribute("error_massage", "");
%>
</body>
</html>