<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");

    String search = request.getParameter("search");
    String result = dic.get(search);

    PrintWriter writer = response.getWriter();
    writer.println("<html>");

    if(result != null){
        writer.println("Word: " + search);
        writer.println("Result: " + result);
    } else {
        writer.println("Not found");
    }

    writer.println("</html>");

%>

</body>
</html>