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
    <style>
        table {
            border-collapse: collapse;
            border: 1px solid black;
        }

        td {
            border: 1px solid black;
            padding: 7px;
            text-align: center;
        }

        th {
            background-color: #ff4765;
            border: 1px solid black;
            color: #1b2080;
            padding: 7px;
            text-align: center;
        }

        tr:nth-child(even) {
            background-color: #a9a9a9;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>x</th>
        <c:forEach begin="1" end="${cols}" varStatus="i">
            <th>${i.index}</th>
        </c:forEach>
    </tr>
    <c:forEach begin="1" end="${rows}" varStatus="i">
        <tr>
            <th>${i.index}</th>
            <c:forEach begin="1" end="${cols}" varStatus="j">
                <td>${i.index*j.index}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>
