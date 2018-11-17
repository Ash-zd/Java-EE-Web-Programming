<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/2
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp:param 动作示例forward1</title>
</head>
<body>
<jsp:forward page="forward2.jsp">
    <jsp:param name="param2" value="world"></jsp:param>
</jsp:forward>
</body>
</html>
