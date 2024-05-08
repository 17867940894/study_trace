<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/5/5
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo2</title>
</head>
<body>
<%
    request.setAttribute("a", 22);
%>

${ requestScope.a }
</body>
</html>
