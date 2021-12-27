
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <c:forEach items="${requestScope['listS']}" var="s" >
            <tr>
                <td>
                    <c:out value="${s.id}"/>
                </td>
                <td>
                    <a href="/product?action=view&id=${s.id}"><c:out value="${s.name}" />
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
                    <c:out value="${s.age}"/>
                </td>
                <td>
                    <c:out value="${s.dob}"/>
                </td>
                <td>
                    <c:out value="${s.address}"/>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${s.grade < 5}">
                            Poor
                        </c:when>

                        <c:when test="${s.grade < 8}">
                            Good
                        </c:when>
                        <c:otherwise>
                            Excellent
                        </c:otherwise>
                    </c:choose>

                </td>
                <td>
                    <a href="/student?action=edit&uid=${s.id}">Update</a>
                    <a href="/student?action=delete&sid=${s.id}">Delete</a>
                </td>

            </tr>
        </c:forEach>

</table>
<a href="create.jsp">Create Student</a>
<form action="/student" >
    <p>Search: </p>
    <input type="hidden" value="search" name="action">
    <input type="text" name="search" placeholder="Enter Keyword">
    <input type="submit" value="Search">
</form>
</body>

</html>