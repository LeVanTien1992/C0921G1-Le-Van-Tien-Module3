<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/24/2021
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>
    <form action="/student" method="post">
<%--        int id, String name, String gender, int age, String dob, String address, String grade--%>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Age</th>
            <th>Day Of Birth</th>
            <th>Address</th>
            <th>Grade</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listS}" var="s" varStatus="loop">
        <tr>
            <td>
                <c:out value="${s.id}"></c:out>
            </td>
            <td>
                <c:out value="${s.name}"></c:out>
            </td>
            <td>
                <c:if test="${s.gender==1}">
                    Nam
                </c:if>
                <c:if test="${s.gender==0}">
                    Nữ
                </c:if>
            </td>
            <td>
                <c:out value="${s.age}"></c:out>
            </td>
            <td>
                <c:out value="${s.dob}"></c:out>
            </td>
            <td>
                <c:out value="${s.address}"></c:out>
            </td>
            <td>
                <c:out value="${s.grade}"></c:out>
            </td>
            <td>
                <a href="#">Update</a>
                <a href="#" onclick="showMessage(${s.id})">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </form>
</table>
<a href="create.jsp">Create Student</a>
</body>
<script>
    function showMessage(id) {
        let opption = confirm("Bạn có chắc muốn xóa thèn sinh viên này không?");
        if(opption === true){
            window.location.href = "delete?sid=" +id;
        }
    }
</script>
</html>

