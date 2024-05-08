<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/24
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Random"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test2</title>
</head>
<body>
<h1>test2</h1>
<hr>
<%! Random r = new Random();%>
<%=r.nextInt(100 - 1 + 1) + 1%>
</body>
</html>
