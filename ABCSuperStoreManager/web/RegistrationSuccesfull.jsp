<%-- 
    Document   : RegistrationSuccesfull
    Created on : Sep 24, 2015, 9:59:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="MyPack.CreateAccountServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registration Successful!</h1>
        <% 
           out.println("Your UserID is : "+CreateAccountServlet.userID);
        %>
        <h1>Please use this to sign in</h1>
    </body>
</html>
