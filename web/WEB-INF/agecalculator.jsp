<%-- 
    Document   : agecalculator
    Created on : 13-Sep-2018, 12:18:07 PM
    Author     : 763198
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week2Lab_Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form method="post" action="AgeCalculatorServlet">
                Enter your age: <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age Next Birthday">
            </form>
        </div>
        <div>
            ${message}
        </div>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
