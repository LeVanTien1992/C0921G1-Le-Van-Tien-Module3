<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2021
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new student</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new student</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/student">Back to student list</a>
</p>
<form method="post" action="/student?action=edit">

    <%--            int id, String name, String gender, int age, String dob, String address, String grade--%>
        <tr>
            <td>Id: </td>
            <td><input type="text" name="id" value="${st.id} " readonly></td>
        </tr>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name" value="${st.name}"></td>
    </tr>
    <tr>
        <td>Gender: </td>
        <td>
            <input type="radio" name="gender" value="1" ${st.gender == 1?"checked":""}>Male
            <input type="radio" name="gender" value="0" ${st.gender == 0?"checked":""}>Female
        </td>
    </tr>
    <tr>
        <td>Address: </td>
        <td><input type="text" name="address" value="${st.address}"></td>
    </tr>
    <tr>
        <td>Age: </td>
        <td><input type="text" name="age" value="${st.age}"></td>
    </tr>
    <tr>
        <td>Dob: </td>
        <td><input type="text" name="dob" value="${st.dob}"></td>
    </tr>
    <tr>
        <td>Grade: </td>
        <td><input type="text" name="grade" value="${st.grade}"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Update product"></td>
    </tr>


</form>
</body>
</html>
