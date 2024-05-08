<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取请求参数</title>
</head>
<body>
<form action="Demo6.jsp">
    <label>
        <input type="text" name="username">
        <br>
        <input type="password" name="password">
        <br>
        <input type="checkbox" name="hobby" value="1">
        <input type="checkbox" name="hobby" value="2">
        <input type="checkbox" name="hobby" value="3">
        <input type="checkbox" name="hobby" value="4">
        <br>
        <input type="submit" value="提交">
    </label>
    <hr>
    ${ param.username }
    <br>
    ${ param.password }
    <br>
    ${ param.hobby }
    <br>
    1:${ paramValues.hobby[0] }
    <br>
    2:${ paramValues.hobby[1] }
    <br>
    3:${ paramValues.hobby[2] }
    <br>
    4:${ paramValues.hobby[3] }

</form>
<hr>
</body>
</html>
