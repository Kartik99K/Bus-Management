<%-- 
    Document   : BusAdmin
    Created on : 31 Mar, 2019, 6:06:01 PM
    Author     : KARTIK
--%>

<%@page import="java.util.List"%>
<%@page import="model.BusInfoDao"%>
<%@page import="model.BusInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bms1.css">
        

        <style type="text/css">

        body{
            background: -webkit-linear-gradient(left, #ff4d88, #ff8c1a);
            height: 100vh;
            display: flex;
            justify-content: center;
            margin-top: 10px;
            
        }

        .menu{
            display: flex;      
            align-items: center;
            flex-direction: column;
        }

        .menu-row{
            display: flex;
            flex-direction: row;
        }

        .menu-icons{
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .sub{
            color: white;
            height: 50px;
            width: 150px;
            background: -webkit-linear-gradient(left, #ff4d88, #ff8c1a);
            display: flex;
            justify-content: center;
            align-items: center;
            border:2px solid #111;
            flex-direction: column;
        }

        .sub:hover{
            background: transparent;
            color: #aaa;  
            transition: 0.5s all ;
            -webkit-transition: 0.5s all;
            -moz-transition: 0.5s all;
            -o-transition: 0.5s all;
            -ms-transition: 0.5s all;
        }

        .admin-pages{
            
            height: 550px;
            width: 850px;
        }

        .del-btn{
            border: 0;
            background-color: #cc0000;
            color: white;
            padding: 10px;
            cursor: pointer;
        }

        .upt-btn{
            border: 0;
            background-color: #29a329;
            color: white;
            padding: 10px;
            cursor: pointer;
        }

        a{
            text-decoration: none; 
        }
        
        .btn1{
            background-color: #00cc00;
            border: 0;
            color: white;
            padding: 10px;
            cursor: pointer;
            width: 300px;
            border-radius: 20px;
            font-size: 20px;
        }
        
        .btn1:hover{
            background-color: transparent;
            color: #fff;
            border: solid 2px #00cc00;
        }
        
        
        .cr{
            color: white;
            text-decoration: none;
        }
        
        .d11{
            display: flex;
            justify-content: center;
            align-content: center;
            
        }
        
        
        .buttons{
            display: flex;
            flex-direction: column;
        }
        
        .inner-addon {
            position: relative;
	}

        
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
            <div class="menu">
                <div class="menu-row">
                    <div class="menu-icons">
                        <a href="admin.html">
                            <div class="sub">
                                <button class="sub">Home</button>
                            </div>
                        </a>            
                    </div>
                    <div class="menu-icons" id="">
                        <a href="UserAdmin.jsp">
                            <div class="sub">
                                <button class="sub">Users</button>
                            </div>
                        </a>            
                    </div>
                    <div class="menu-icons">
                        <a href="BusAdmin.jsp">    
                                <div class="sub" id="bus"> 
                                <button class="sub">Buses</button>     
                            </div>
                        </a>    
                    </div>  
                    <div class="menu-icons">
                        <a href="DriverAdmin.jsp">
                            <div class="sub">
                                <button class="sub">Driver</button>
                            </div>
                        </a>            
                    </div>
                    <div class="menu-icons">
                        <a href="RoutesAdmin.jsp">   
                            <div class="sub">
                                <button class="sub">Routes</button>
                            </div>
                        </a>    
                    </div>    
                </div>
            </div>
            <br>
            
            <div class="d11">
                <div class="buttons">
                    <a href="CreateBus.jsp" class="cr"><button class="btn1">Create</button></a><br>
                    <div class="srach">	
                        <input type="submit"  value="Search" class="srch-btn">
                        <input type="text" id="srch" name="search1" class="srch" placeholder="Search The Data">
                        
			<br>
                    </div>
                    

                </div>    
            </div>
            <br>
            <br>
            <div class="admin-pages">
                <div class="route">
                    <table class="tbl1">
                        <tr>
                            <th>Bus No.</th>
                            <th>Driver Name</th>
                            <th>Routes</th>
                            <th>Admin</th>
                        </tr>
                        <tbody id="tbl">
                        <tr>
                        <% 
                            BusInfoDao b1 = new BusInfoDao();
                            List<BusInfo> list = BusInfoDao.getListOfBusInfo();
                            for(BusInfo b : list){
                        %>
                            <td><%=b.getBusId()%></td>
                            <td><%=b.getDriverName()%></td>
                            <td><%=b.getRoutes()%></td>
                            <td> 
                                <form action="DeleteServlet">
                                    <button type="submit" class="del-btn" name="dlt" value="<%=b.getBusId()%>" >Delete</button>
                                </form>                                
                            </td>    
                        </tr>
                        <%}%>
                        </tbody>
                    </table>
                </div>
            </div>    
        </div>   
    </body>
</html>