<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28.08.2020
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Gargoyle</h1>
    <p>

        <%@ page import="java.util.Date, helpers.TestClass"%>

        <%= new Date() %>
        <% TestClass tc = new TestClass("Joseph"); %>
        <%= "<p>" + tc.getWriting() + "</p>" %>

    </p>
</body>
</html>
