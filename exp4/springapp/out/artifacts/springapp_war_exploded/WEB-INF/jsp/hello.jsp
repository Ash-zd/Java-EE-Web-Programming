<%--
  Created by IntelliJ IDEA.
  User: Ash
  Date: 2018/11/16
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@include file="include.jsp"%>
<html>
<head>
    <title><fmt:message key="title"/></title>
</head>
<body>
<h1><fmt:message key="heading"/></h1>
<p><fmt:message key="greeting"/> <c:out value="${model.now}" /></p>
<h3>Products</h3>
<c:forEach items="${model.products}" var="prod">
    <c:out value="${prod.description}"/>
    <i>$<c:out value="${prod.price}" /> </i>
    <br><br>
</c:forEach>
<br>
<a href="<c:url value="/priceincrease"/> ">Increase Prices</a>
<br>
</body>
</html>
