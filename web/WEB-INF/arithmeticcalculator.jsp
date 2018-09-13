<%-- 
    Document   : arithmeticcalculator
    Created on : 13-Sep-2018, 12:47:07 PM
    Author     : 763198
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <div>
            <form method="post" action="arithmetic">
                First: <input type="text" name="first" value="${first}">
                <br>
                Second: <input type="text" name="second" value="${second}">
                <br>
                <input type="submit" name="submit" value="+">
                <input type="submit" name="submit" value="-">
                <input type="submit" name="submit" value="*">
                <input type="submit" name="submit" value="%">
            </form>
        </div>
        <br>
        <div>
            Result: ${message}
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>
