<%-- 
    Document   : CreateBus
    Created on : 2 Apr, 2019, 2:01:29 PM
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
                background: -webkit-linear-gradient(left, #ff4d88, #ff8c1a);
                height: 100vh;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                margin-top: 10px;
            }
            .para{
                color: white;
                font-size: 50px;
            }
            
            .form1{
                height: 400px;
		width: 300px;
		padding: 25px;
		background: transparent;
		display: flex;
		align-items: center;
		flex-direction: column;
		box-shadow: 2px 2px 22px 8px #000;
            }
            
            .ip1{
                outline: none;
                font-size: 1em;
                color: #000;
                padding: .3em;
                margin: 0;
                width: 100%;
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
            
            .ip1:focus {
               
                padding: 10px;
		box-shadow: 10px 10px 10px #00cc00;
		
		/*transform:translate(0px,-10px);*/
            }
            
            .btn1{
                font-size: 1em;
                color: #fff;
                background: #00cc00;
                border: 1px solid #00cc00;
                outline: none;
                cursor: pointer;
                padding: 8px;
                width: 50%;
            }
            
            .btn2{
		font-size: 1em;
                color: #fff;
                background: #ff1a1a;
                border: 1px solid #ff1a1a;
                outline: none;
                cursor: pointer;
                padding: 8px;
                width: 50%;
            }
            
            .btn1:hover {
                background: transparent;
                color: #00cc00;  
		transition: 0.5s all ;
                -webkit-transition: 0.5s all;
                -moz-transition: 0.5s all;
                -o-transition: 0.5s all;
                -ms-transition: 0.5s all;
            }
            
            .btn2:hover {
                background: transparent;
                color: #ff1a1a;  
		transition: 0.5s all ;
                -webkit-transition: 0.5s all;
                -moz-transition: 0.5s all;
                -o-transition: 0.5s all;
                -ms-transition: 0.5s all;
            }    
        </style>
    </head>
    
    <body>
        <div>
            <p class="para">Add Data</p></div>
        <div class="form1">
            <form action="ServletLogin" method="POST">
                <p>Bus-Id:
                    <input type="text" name="b" class="ip1">
                </p>    
                    
                <p>Driver Name:
                    <input type="text" name="dn" class="ip1">
                </p>
                    
                <p>
                    Driver Number:
                    <input type="text" name="dno" class="ip1">
                </p>    
                 
                <p>
                    Routes:
                    <input type="text" name="r" class="ip1"> 
                </p>    
                    
                <p>
                   Pick-Up points:
                   <input type="text" name="p" class="ip1">    
                </p>    
                <input type="submit" value="Submit" class="btn1"><input type="reset" value="Reset" class="btn2">
            </form>    
        </div>            
    </body>
</html>
