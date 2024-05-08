<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/5/7
  Time: 下午7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取请求头中的值</title>
</head>
<body>
<%
    Cookie c1 = new Cookie("Cookie1","1");
    Cookie c2 = new Cookie("Cookie2","2");
    Cookie c3 = new Cookie("Cookie3","3");
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
%>
${ cookie.Cookie1 }
<br>
${ cookie.Cookie2.value }
<br>
${ cookie.Cookie3.value }
</body>
</html>     
