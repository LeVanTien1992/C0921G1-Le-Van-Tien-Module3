<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/24/2021
  Time: 10:25 AM
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
<form method="post" action="/student?action=create">

<%--            int id, String name, String gender, int age, String dob, String address, String grade--%>

            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>
                    <input type="radio" name="gender" value="1">Male
                    <input type="radio" name="gender" value="0">Female
                </td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><input type="text" name="age" id="age"></td>
            </tr>
            <tr>
                <td>Dob: </td>
            <td><input type="text" name="dob" id="dob"></td>
            </tr>
            <tr>
                <td>Grade: </td>
                <td><input type="text" name="grade" id="grade"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>


</form>
</body>
</html>
