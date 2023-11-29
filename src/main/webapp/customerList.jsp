<%--
  Created by IntelliJ IDEA.
  User: nbtru
  Date: 11/29/2023
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<table class="table">
    <tr><th colspan="3">Danh sách Khách Hàng</th></tr>
    <tr>
        <td>Tên</td>
        <td>Ngày Sinh</td>
        <td>Địa Chỉ</td>
    </tr>
    <c:forEach items="${customers}" var="customers">
        <tr>
            <td>${customers.getName()}</td>
            <td>${customers.getDateOfBirth()}</td>
            <td>${customers.getAddress()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
