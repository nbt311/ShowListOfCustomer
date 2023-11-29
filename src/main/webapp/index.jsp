<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Show List Of Customer</title>
</head>
<body>
<h3>Ấn vào nút ShowList để xem danh sách khách hàng</h3>
<form action="/listservlet" method="get">
  <input type="submit" value="ShowList">
</form>
</body>
</html>