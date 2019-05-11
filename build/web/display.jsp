<%-- 
    Document   : display
    Created on : 26 Mar, 2019, 9:27:41 AM
    Author     : KARTIK
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Id</th>
                <th>Marks</th>
            </tr>
            <% 
                List<Student> records = request.getAttribute("list");
                
                for(Student s : records){
                    
            %>
            <tr>
                <td><%= s.getName()%></td>
                <td><%= s.getId()%></td>
                <td><%= s.getMarks()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>

<% int x; x=10; out.println(x); %> <!--scriplet tag-->

<%= x%> <!-- expression tag (directly prints value)-->

<%! %> <!--Declaration tag used for declaring variables -->