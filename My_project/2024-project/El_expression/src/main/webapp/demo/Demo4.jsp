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
    <title>Demo3</title>
</head>
<body>
<%
    request.setAttribute("a", 2);
    session.setAttribute("a", 3);
    pageContext.setAttribute("a", 9);
    application.setAttribute("a", 4);
%>
<hr>
${ a }
<hr>
</body>
</html>
