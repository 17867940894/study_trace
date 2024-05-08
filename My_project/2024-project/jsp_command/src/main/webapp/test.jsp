<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/30
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test" method="get">
    <label>
        <input type="text" id="username" name="username" placeholder="请输入用户名">
        <br>
        <input type="password" id="password" name="password" placeholder="请输入密码">
        <br>
        <input type="checkbox" name="automatic_login">自动登录
    </label>
    <br>
    <button id="login" onclick="function x() {
      <%
        response.sendRedirect("/userhome.jsp");
      %>
    }">登录</button>
</form>
</body>
</html>

<script>

</script>
