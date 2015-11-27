<%-- 
    Document   : newjsp
    Created on : Oct 22, 2015, 10:07:30 AM
    Author     : DELL
--%>
<%@page import="java.sql.*"%>
<%@page import="MyPack.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .search_box {
                height: 17px;
                width: 150px;
                background-image: url("assets/homepage/images/Search_back.png");
                 -webkit-background-size: cover;
               
                background-size: cover;
            }
            table {
                width: 800px;
                margin-left: 250px;
            }
            th {
                width: 200px;
            }
            #b1,#b3,#b5,#b7,#b9,#b11,#b13,#b15,#b17,#b19 {
                color: white;
            }
            #b2,#b4,#b6,#b8,#b10,#b12,#b14,#b16,#b18,#b20 {
                margin-right: 60px;
            }
            ul {
                list-style-type: none;
                padding: 0;
                overflow: hidden;
            }
            li{
                float: right;
            }
            nav a {
                display: block;
                width: 100px;
                height: 30px;
                color: white;
                font-size: 20px;
                text-decoration: none;
            }
            body#home a#homenav,body#signup a#signnav,body#login a#loginnav{
                color: red;
            }
            body {
                /*background: url("assets/homepage/images/header.png");*/
                background-color: black;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
            #left{
                float: left;
            }
            #right{
                float: right;
            }
        </style>
        <title>Login Successful !!!</title>
    </head>
    <body style="overflow-y: auto;overflow-x: hidden">

       
       <div id="left" >
           <input onclick="showInfo()" type="button" value="showinfo" id="loginbutton" style="height: 35px;width: 120px;text-align: center"></input>
           <input onclick="showLoginForm()" type="button" value="showproducts" id="loginbutton" style="height: 35px;width: 120px;text-align: center"></input>
       </div>
        <div id="right" >
            
        </div>
        <br>
        <%
            Connection conn = null;
            conn = null;
            try {
                String driverName = "oracle.jdbc.driver.OracleDriver";
                Class.forName(driverName);
                String serverName = "localhost";
                String serverPort = "1521";
                String sid = "orcl";
                String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
                String username = "SuperStoreDatabase";
                String password = "1234";
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("ALHAMDULILLAH");
            } catch (Exception e) {
                System.out.println("error rror ttor");
            }%>

       

    </body>

    
</html>    