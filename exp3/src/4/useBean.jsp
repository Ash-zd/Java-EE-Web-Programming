<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/2
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="personInfo" scope="page" class="Person">
    <% personInfo.setName("吴萌萌");
        personInfo.setAge(23);
    %>
</jsp:useBean>
<html>
<head>
    <title>useBean动作示例</title>
</head>
<body>
<h3 align="center">显示JavaBean中的信息</h3>
<hr>
<%=personInfo.getName()%>
<%=personInfo.getAge()%>
</body>
</html>
