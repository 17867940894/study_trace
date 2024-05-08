<%--
  Created by IntelliJ IDEA.
  User: 3167918581
  Date: 2024/4/24
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>测试的JSP页面</h1>
<hr>
<h1>测试不同格式的块中代码的范围及其作用</h1>


<%= "参数代码" %>

<% String s1 = "service方法中的代码"; %>

<%! String s2 = "Servlet中的成员代码"; %>

<%-- 无感叹号的注释 --%>
<!-- 有感叹号的注释 -->
</body>
</html>
