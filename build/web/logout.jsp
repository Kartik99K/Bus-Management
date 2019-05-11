<%-- 
    Document   : logout
    Created on : 30 Mar, 2019, 4:56:58 PM
    Author     : KARTIK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin: 0;
                background: #252525;
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
            }
            
            .p1{
                font-size: 30px;
                color: white;
            }
            .p2{
                font-size: 28px;
                color: red;
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <%     
            session.removeAttribute("userId");
            session.removeAttribute("password");
            session.invalidate();
         %>
         
         <p class="p1">You Have been Logged Out Successfully!</p>
         <a href="home.html" class="p2">Click Here to Login Again</a>
    </body>
</html>
