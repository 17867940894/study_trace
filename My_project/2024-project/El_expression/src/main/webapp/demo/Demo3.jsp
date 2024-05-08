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
    pageContext.setAttribute("a", 1);
    request.setAttribute("b", 2);
    session.setAttribute("c", 3);
    application.setAttribute("d", 4);
%>
<%-- 写法一 --%>
<%--pageContext:${ pageScope.a }
<hr>
request:${ requestScope.b }
<hr>
session:${ sessionScope.c }
<hr>
application:${ applicationScope.d}
<hr>--%>
<%-- 写法二 --%>
pageContext:${ a }
<hr>
request:${ b }
<hr>
session:${ c }
<hr>
application:${ d }
<hr>
</body>
</html>
