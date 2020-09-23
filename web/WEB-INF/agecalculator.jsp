<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 3:55:41 PM
    Author     : 843827
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculatorServlet">
            <label>Enter your age:</label>
            <input type="text" name="age" value ="">
            <br>
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <h3>${message}</h3>
        </form>
    </body>
</html>
