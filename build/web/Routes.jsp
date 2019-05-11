<%-- 
    Document   : Routes
    Created on : 31 Mar, 2019, 3:54:16 PM
    Author     : KARTIK
--%>

<%@page import="model.Routes"%>
<%@page import="java.util.List"%>
<%@page import="model.RoutesDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bms1.css">
        <style type="text/css">
            .srch{
            outline: none;
            font-size: 1em;
            color: #000;
            padding: .6em;
            margin: 0;
            width: 80%;
            border: none;
            -webkit-appearance: none;
            display: block;
            background: #fff;
            -webkit-border-radius: 2px;
            -moz-border-radius: 2px;
            -o-border-radius: 2px;
            -ms-border-radius: 2px;
            border-radius: 2px;
        }
        
        .srch-btn{
            border: 0;
            background-color: dodgerblue;
            color: white;
            cursor: pointer;
        }
        
        .srach{
            display: flex;
            flex-direction: row;
        }
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
        $(document).ready(function(){
          $("#srch").on("keyup", function() {
            var value = $(this).val().toLowerCase();
            $("#tbl tr").filter(function() {
              $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
          });
        });
        </script>
    </head>
    <body>
        <div class="main">
            <div class="nav">
                <a href="Dashboard.jsp">Home</a>
                <a href="Buses.jsp">Driver-Info</a>
                <a href="BusInfo.jsp">Buses-Info</a>
                <a href="Routes.jsp">Routes-Info</a>
                <a href="#">About Us</a>
            </div><br>
            <div class="profile">
            <div class="d11">
                <div class="buttons">
                    <div class="srach">	
                        <input type="submit"  value="Search" class="srch-btn">
                        <input type="text" id="srch" name="search1" class="srch" placeholder="Search The Data">
			<br>
                    </div>
                </div>    
            </div>
                <fieldset class="d1" style="background-color: #ccc;height: 318px;">
                    <table class="tbl1">
                        <tr>
                            <th>Bus No.</th>
                            <th>Routes</th>
                            <th>Pick-Up Points</th>
                        </tr>
                        <tbody id="tbl">
                        <% 
                            RoutesDao b1 = new RoutesDao();
                            List<Routes> list = RoutesDao.getListOfRoutes();
                            for(Routes r : list){
                        %>
                        <tr>
                            <td><%=r.getBusId()%></td>
                            <td><%=r.getRoutes()%></td>
                            <td><%=r.getPickuppoint()%></td>
                        </tr>
                        <%}%>    
                    </table>
                </fieldset>    
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
                    <a href="#"class="p1"> Feedback</a></p>
                </div>
            </div>
        </div>
    </body>
</html>