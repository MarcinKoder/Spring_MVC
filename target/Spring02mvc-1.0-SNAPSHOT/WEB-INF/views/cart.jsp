<%--
  Created by IntelliJ IDEA.
  User: XxX
  Date: 17.01.2019
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${carts}" var="cart">
    Product: ${cart.product.name}<br>
    Price: ${cart.product.price}<br>
    Quantity: ${cart.quantity}<br>
    <hr/>
</c:forEach>
<p>Ilosc pozycji w koszyku: ${cartSize}</p><br>
<p>Ilosc produktow w koszyku: ${quantity}</p><br>
<p>Laczny koszt: ${sum}</p>
</body>
</html>
