<!DOCTYPE html>
<!--[if IE 7 ]><html class="ie ie7 lte9 lte8 lte7" lang="en-US"><![endif]-->
<!--[if IE 8]><html class="ie ie8 lte9 lte8" lang="en-US">	<![endif]-->
<!--[if IE 9]><html class="ie ie9 lte9" lang="en-US"><![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html class="noIE" lang="en-US">
    <!--<![endif]-->
    <head>
        <!-- meta -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale = 1.0, maximum-scale=1.0, user-scalable=no"/>
        <title>Sign Up Form</title>

        
        <style>
            #loginbutton{
                background-color: Transparent;
                background-repeat:no-repeat;
                border: none;
                cursor:pointer;
                overflow: hidden;
                outline:none;
                height: 50px;
                width : 90px;
                font-size: 25px;
                color: black;
                text-align: center;
            }
            #loginbutton:hover{
                /*background-color: #a3a2a2;*/
                background-repeat:no-repeat;
                /*border: none;*/
                border: solid;
                border-color: black;
                border-width: 2px;
                cursor:pointer;
                overflow: hidden;
                outline:none;
            }
            #tabledata{
                margin-top: 20px;
                height: 50px;
                width: 50px;
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
                color: black;
                font-size: 20px;
                text-decoration: none;
            }
            body#home a#homenav,body#signup a#signnav,body#login a#loginnav{
                color: red;
            }
            body {
                /*background: url("assets/homepage/images/header.png");*/
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
        </style>
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
                <script src="assets/js/html5shiv.js"></script>
                <script src="assets/js/respond.js"></script>
        <![endif]-->

        <!--[if IE 8]>
        <script src="assets/js/selectivizr.js"></script>
    <![endif]-->
    </head>

    <body id="login">

        <!-- Home -->
        <section>

           
            <div>
                <div>
                    <div>
                        <h1 style="font-family: monospace;text-align: center;font-size: 40px;color: black">
                            Welcome to Online Farmer-Bazar
                        </h1>

                    </div> <!-- /.header-wrapper -->
                    <input onclick="showLoginForm()" type="button" value="Login" id="loginbutton" style="height: 35px;width: 120px;text-align: center"></input>
                    <input onclick="showSignupForm()" type="button" value="Signup" id="loginbutton" style="height: 35px;width: 120px;text-align: center"></input>
                    <div>
                        <form method="post" action="LoginServlet"  id="loginform" style="text-align: center;color: black">
                            <table style="margin-left: 550px" >

                                <th ></th>
                                <th  style="text-align: left"></th>

                                <tr id="tabledata">
                                    <td>UserID</td>
                                    <td style="color: black"><input name="UserID"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>Password</td>
                                    <td style="color: black"><input type="password" name="password"></td>
                                </tr>
                              
                            </table>
                           
                            <input type="submit" id="loginbutton" value="Login">
                        </form>
                         <form method="post" action="CreateAccountServlet" id="signupform" style="text-align: center;display: none">
                            <table width="100%">

                                <th width="50%"></th>
                                <th width="50%" style="text-align: left"></th>


                                <tr id="tabledata">
                                    <td>UserName</td>
                                    <td style="color: black"><input name="UserName"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>Password</td>
                                    <td style="color: black"><input type="password" name="ChoosePassword"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>Phone Number</td>
                                    <td style="color: black"><input name="PhoneNumber"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>City</td>
                                    <td style="color: black"><input name="City"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>Area</td>
                                    <td style="color: black"><input name="Area"></td>
                                </tr>
                                <tr id="tabledata">
                                    <td>House Number</td>
                                    <td style="color: black"><input name="HouseNumber"></td>
                                </tr>
                            </table>
                            <input type="submit" id="loginbutton">
                        </form>
                    </div>

                </div>
            </div> <!-- /.container -->
        </section> <!-- /#header -->

       <script>
         function showLoginForm() {
                document.getElementById("loginform").style.display = "block";
                document.getElementById("signupform").style.display = "none";
        }
        function showSignupForm() {
                document.getElementById("signupform").style.display = "block";
                document.getElementById("loginform").style.display = "none";
        }
           </script>
    </body>
</html>