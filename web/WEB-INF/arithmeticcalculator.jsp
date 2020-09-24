<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 4:20:32 PM
    Author     : 843827
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ARITHMETIC Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic ">
            <label>First:</label>
            <input type="text" name="first" value ="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value ="${second}">
            <br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
            <br>
            <h3>Result: ${message}</h3>
            </form>
         <a href="./age">Age Calculator</a>
    </body>
</html>
