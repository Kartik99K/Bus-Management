<%-- 
    Document   : User
    Created on : 28 Mar, 2019, 11:12:04 AM
    Author     : KARTIK
--%>

<%@page import="java.util.List"%>
<%@page import="model.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="model.User"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bms1.css">
        <style>
            .log-out{
                border: none;
                padding: 20px;
                width: 150px;
                background-color: red;
                color: white;
                cursor: pointer;
            }
            .log-out:hover{
                background-color: transparent;
                color: red;
                border: solid 1px;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <div class="nav">
                <a href="Dashboard.jsp">Home</a>
                <a href="Buses.jsp">Driver-Info</a>
                <a href="BusInfo.jsp">Buses-Info</a>
                <a href="Routes.jsp">Routes-Info</a>
                <a href="#">About Us</a>
            </div>
            <div class="profile">
                <fieldset class="d1">
                    <legend><img src="images/images (3).png" class="img-src"></legend>
                    <%
                        User u = (User)(session.getAttribute("currentSessionUser"));    
                    %>
                    
                    <pre>Name: <%=u.getName()  %></pre>
                    <pre>Date Of Birth: <%=u.getDob()%></pre>
                    <pre>Email: <%=u.getEmail()%></pre>
                    <pre>Current Route: <%=u.getCurrent_route()%></pre>
                    <pre>..............</pre>
                    <pre>..............</pre>
                    <pre>..............</pre>
                    <pre>..............</pre>
                </fieldset><br><br>
                <a href="logout.jsp" style="text-decoration:none;"><button class="log-out">Logout</button></a>
            </div>
            <div class="footer">
                <div class="pp">
                    <p style="color: white;font-size: 20px;">Our Social Media Links: </p>
                </div>
                <div class="social-links">      
                    <a href="#"><img src="images/images.png" class="social-img"></a>
                    <a href="#"><img src="images/images (1).png" class="social-img"></a>
                    <a href="#"><img src="images/images (2).png" class="social-img"></a>
                    <a href="#"><img src="images/images.jpg" class="social-img"></a>
                </div> 
                <div class="links">
                    <p class="p1"><a href="#" class="p1">Contact </a>|<a href="#" class="p1"> Blog </a>|<a href="#" class="p1"> Help </a>|
                    <a href="#" class="p1"> Feedback</a></p>
                </div>
            </div>
        </div>
    </body>
</html>

