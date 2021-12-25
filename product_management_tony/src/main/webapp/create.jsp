<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/25/2021
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <form action="/create" method="post">
        <table>
            <tr>
               <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><input type="radio" name="gender" value="1">Nam</td>
                <td><input type="radio" name="gender" value="0">Nữ</td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>Day Of Birth</td>
                <td><input type="text" name="dob"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>Grade</td>
                <td><input type="text" name="grade"></td>
            </tr>
            <tr>
                <button type="submit" >Create Student</button>
            </tr>
        </table>
    </form>
</body>
</html>
