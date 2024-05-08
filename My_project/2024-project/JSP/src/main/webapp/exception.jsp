<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/29
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true"%>
<html>
<head>
    <title>exception</title>
</head>
<body>
<h1>exception</h1>
<%--故意导致的异常，测试是否会跳转到错误页面--%>
<%=
    1/0
%>
</body>
</html>
