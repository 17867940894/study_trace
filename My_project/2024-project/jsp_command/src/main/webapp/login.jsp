<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/30
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<%
    String automaticLogin = (String) session.getAttribute("automatic_login");
    String errorMassage = (String) session.getAttribute("error_massage");
    if (automaticLogin != null){
        response.sendRedirect("/userhome.jsp");
        return;
    }
%>
<form action="${pageContext.request.contextPath}/login" method="get">
    <label>
        <input type="text" id="username" name="username" placeholder="请输入用户名">
        <br>
        <input type="password" id="password" name="password" placeholder="请输入密码">
        <br>
        <input type="checkbox" name="automatic_login">自动登录
    </label>
    <br>
    <button id="login">登录</button>
</form>
<br>
<span>
        <%=
        errorMassage==null?"":errorMassage
        %>
    </span>
</body>
</html>

<script>
    onload = function () {
        let username = document.getElementById("username");
        let password = document.getElementById("password");
        let login = document.getElementById("login");

        //校验用户输入是否为空值
        login.onclick = function () {
            <%
                session.removeAttribute("error_massage");
            %>
            let susername = username.value;
            let spassword = password.value;
            if (susername === '' || spassword === '') {
                alert('用户名或密码不能为空！');
                username.innerText = '';
                password.innerText = '';
            }
        }
    }

</script>
