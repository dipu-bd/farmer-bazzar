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
        </style>
        <title>Login Successful !!!</title>
    </head>
    <body style="overflow-y: auto;overflow-x: hidden">
        <nav>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div>
                <ul>
                    <li style="margin-top:40px"><a href="portfolio.html">Products</a></li>
                    <li style="margin-top:40px"><a id="loginnav" href="Login.jsp">Login</a></li>
                    <li style="margin-top:40px"><a id="signnav" href="CreateAccount.jsp">Sign Up</a></li>
                    <li style="margin-top:40px"><a id="homenav" href="HomePage.html">Home</a></li>
                </ul> <!-- /.nav -->
            </div><!-- /.navbar-collapse -->
        </nav>

        <%
            CurrentUser cu2 = (CurrentUser) session.getAttribute("cu");
        %>
        <h1 style="color: white;text-align: center" >Hello <%=cu2.getName()%></h1>
        <!--<table style="color: white;width :400px;margin-left: 445px" >
            <th>Product Category</th>
            <th>Search Bar</th>
        </table>-->
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

        <form method="post" action="ReceiveReqServlet" style="text-align: center">
            <input onclick="showVeg()" type="button" value="ShowVegetable" id="b2" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchVegTerm" class="search_box" onkeyup="doVegSearch()"/>
            <br>
            <table id="b1" style="display: none">

                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount(in kg)</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from vegetablelist");
                            while (rs.next()) {%> 



                <tr>
                    <td><input type="checkbox" name="vegitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><input type="text" name="vegamount" size="6" value="0" ></input></td>
                  <!-- <td>
                        <select name="vegamount">
                            <option value="0">0</option>
                            <option value=".250">.250</option>
                            <option value="0.5">0.5</option>
                            <option value="1">1</option>
                            <option value="5">5</option>
                            <option value="10">10</option>
                            <option value="15">15</option>
                        </select>
                    </td>-->
                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %>

            </table>
            <br>
            <input onclick="showGrocery()" type="button" value="ShowGrocery" id="b4" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchGroceryTerm" class="search_box" onkeyup="doGrocerySearch()" />
            <br>
            <table style="display: none" id="b3">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount(in kg)</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from grocerylist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="groceryitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><input type="text" name="groceryamount" size="6" value="0"></input></td>
                     <!--<td>
                        <select name="groceryamount">
                            <option value="0">0</option>
                            <option value=".250">.250</option>
                            <option value="0.5">0.5</option>
                            <option value="1">1</option>
                            <option value="5">5</option>
                            <option value="10">10</option>
                            <option value="15">15</option>
                        </select>
                    </td>-->
                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
            <br>
            <input onclick="showLiquids()" type="button" value="ShowLiquids" id="b6" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchLiquidsTerm" class="search_box" onkeyup="doLiquidsSearch()" />
            <br>
            <table style="display: none" id="b5">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount(in ltr)</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from liquidslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="liquidsitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="liquidsamount">
                            <option value="0">0</option>
                            <option value=".250">.250</option>
                            <option value="0.5">0.5</option>
                            <option value="1">1</option>
                            <option value="5">5</option>
                            <option value="10">10</option>
                            <option value="15">15</option>
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
            <br>
            <input onclick="showChockolates()" type="button" value="ShowChockolates" id="b8" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchChockolatesTerm" class="search_box" onkeyup="doChockolatesSearch()"/>
            <br>
            <table style="display: none" id="b7">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount(in pkg)</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from chockolateslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="chockolatesitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="chockolatesamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="10">10</option>
                            <option value="20">20</option>                            
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
            <br>
            <input onclick="showEggs()" type="button" value="ShowEggs" id="b10" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchEggsTerm" class="search_box" onkeyup="doEggsSearch()"/>
            <br>
            <table style="display: none" id="b9">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from eggslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="eggsitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="eggsamount">
                            <option value="0">0</option>
                            <option value="4">4</option>
                            <option value="8">8</option>
                            <option value="16">16</option>
                            <option value="32">32</option>
                            <option value="36">36</option>                        
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
             <br>
            <input onclick="showMeats()" type="button" value="ShowMeats" id="b12" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchMeatsTerm" class="search_box" onkeyup="doMeatsSearch()"/>
            <br>
            <table style="display: none" id="b11">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from meatslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="meatsitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="meatsamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>    
                            <option value="8">8</option>    
                            <option value="10">10</option>    
                            <option value="15">15</option>    
                            <option value="20">20</option>    
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
             <br>
            <input onclick="showFishes()" type="button" value="ShowFishes" id="b14" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchFishesTerm" class="search_box" onkeyup="doFishesSearch()"/>
            <br>
            <table style="display: none" id="b13">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from fisheslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="fishesitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="fishesamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>    
                            <option value="8">8</option>    
                            <option value="10">10</option>    
                            <option value="15">15</option>    
                            <option value="20">20</option>    
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
             <br>
            <input onclick="showColdDrinks()" type="button" value="ShowColdDrinks" id="b16" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchColdDrinksTerm" class="search_box" onkeyup="doColdDrinksSearch()"/>
            <br>
            <table style="display: none" id="b15">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from colddrinkslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="colddrinksitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="colddrinksamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>    
                            <option value="8">8</option>    
                            <option value="10">10</option>    
                            <option value="15">15</option>    
                            <option value="20">20</option>    
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
             <br>
            <input onclick="showCosmetics()" type="button" value="ShowCosmetics" id="b18" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchCosmeticsTerm" class="search_box" onkeyup="doCosmeticsSearch()"/>
            <br>
            <table style="display: none" id="b17">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from cosmeticslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="cosmeticsitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="cosmeticsamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>    
                            <option value="8">8</option>    
                            
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
             <br>
            <input onclick="showOthers()" type="button" value="ShowOthers" id="b20" style="height: 25px;width: 120px"></input>
            <input type="text" id="searchOthersTerm" class="search_box" onkeyup="doOthersSearch()"/>
            <br>
            <table style="display: none" id="b19">
                <th></th>
                <th>Item</th>
                <th>Price</th>
                <th>Amount</th>
                    <%
                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from otherslist");
                            while (rs.next()) {%>
                <tr>
                    <td><input type="checkbox" name="othersitems" value=<%=rs.getString(1)%>></input></td>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td>
                        <select name="othersamount">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>    
                            <option value="8">8</option>    
                            
                        </select>
                    </td>

                </tr>
                <%}
                    } catch (Exception e) {
                    }
                %> 
            </table>
            <input type="submit" value="generateBill" >
            <br>
        </form>

    </body>

    <script>
        var a = 0;
        var b = 0;
        var c = 0;
        var d = 0;
        var e = 0;
        var f = 0;
        var g = 0;
        var h = 0;
        var i = 0;
        var j = 0;
        function showVeg() {
            if (a === 0) {
                document.getElementById("b1").style.display = "block";
                document.getElementById("b2").value = "HideList";
                a = 1;
            }
            else {
                document.getElementById("b1").style.display = "none";
                document.getElementById("b2").value = "ShowVegetable";
                a = 0;
            }

        }
        function showGrocery() {
            if (b == 0) {
                document.getElementById("b3").style.display = "block";
                document.getElementById("b4").value = "HideList";
                b = 1;
            }
            else if (b == 1) {
                document.getElementById("b3").style.display = "none";
                document.getElementById("b4").value = "ShowGrocery";
                b = 0;
            }
        }
        function showLiquids() {
            if (c == 0) {
                document.getElementById("b5").style.display = "block";
                document.getElementById("b6").value = "HideList";
                c = 1;
            }
            else if (c == 1) {
                document.getElementById("b5").style.display = "none";
                document.getElementById("b6").value = "ShowLiquids";
                c = 0;
            }
        }
        function showChockolates() {
            if (d == 0) {
                document.getElementById("b7").style.display = "block";
                document.getElementById("b8").value = "HideList";
                d = 1;
            }
            else if (d == 1) {
                document.getElementById("b7").style.display = "none";
                document.getElementById("b8").value = "ShowChockolates";
                d = 0;
            }
        }
         function showEggs() {
            if (e == 0) {
                document.getElementById("b9").style.display = "block";
                document.getElementById("b10").value = "HideList";
                e = 1;
            }
            else if (e == 1) {
                document.getElementById("b9").style.display = "none";
                document.getElementById("b10").value = "ShowEggs";
                e = 0;
            }
        }
        function showMeats() {
            if (f == 0) {
                document.getElementById("b11").style.display = "block";
                document.getElementById("b12").value = "HideList";
                f = 1;
            }
            else if (f == 1) {
                document.getElementById("b11").style.display = "none";
                document.getElementById("b12").value = "ShowMeats";
                f = 0;
            }
        }
        function showFishes() {
            if (g == 0) {
                document.getElementById("b13").style.display = "block";
                document.getElementById("b14").value = "HideList";
                g = 1;
            }
            else if (g == 1) {
                document.getElementById("b13").style.display = "none";
                document.getElementById("b14").value = "ShowFishes";
                g = 0;
            }
        }
        function showColdDrinks() {
            if (h == 0) {
                document.getElementById("b15").style.display = "block";
                document.getElementById("b16").value = "HideList";
                h = 1;
            }
            else if (h == 1) {
                document.getElementById("b15").style.display = "none";
                document.getElementById("b16").value = "ShowColdDrinks";
                h = 0;
            }
        }
         function showCosmetics() {
            if (i == 0) {
                document.getElementById("b17").style.display = "block";
                document.getElementById("b18").value = "HideList";
                i = 1;
            }
            else if (i == 1) {
                document.getElementById("b17").style.display = "none";
                document.getElementById("b18").value = "ShowCosmetics";
                i = 0;
            }
        }
         function showOthers() {
            if (j == 0) {
                document.getElementById("b19").style.display = "block";
                document.getElementById("b20").value = "HideList";
                j = 1;
            }
            else if (j == 1) {
                document.getElementById("b19").style.display = "none";
                document.getElementById("b20").value = "ShowOthers";
                j = 0;
            }
        }
        function doVegSearch() {
            var searchText = document.getElementById('searchVegTerm').value;
            var targetTable = document.getElementById('b1');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doGrocerySearch() {
            var searchText = document.getElementById('searchGroceryTerm').value;
            var targetTable = document.getElementById('b3');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doLiquidsSearch() {
            var searchText = document.getElementById('searchLiquidsTerm').value;
            var targetTable = document.getElementById('b5');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doChockolatesSearch() {
            var searchText = document.getElementById('searchChockolatesTerm').value;
            var targetTable = document.getElementById('b7');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doEggsSearch() {
            var searchText = document.getElementById('searchEggsTerm').value;
            var targetTable = document.getElementById('b9');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doMeatsSearch() {
            var searchText = document.getElementById('searchMeatsTerm').value;
            var targetTable = document.getElementById('b11');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
         function doFishesSearch() {
            var searchText = document.getElementById('searchFishesTerm').value;
            var targetTable = document.getElementById('b13');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doColdDrinksSearch() {
            var searchText = document.getElementById('searchColdDrinksTerm').value;
            var targetTable = document.getElementById('b15');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
         function doCosmeticsSearch() {
            var searchText = document.getElementById('searchCosmeticsTerm').value;
            var targetTable = document.getElementById('b17');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
        function doOthersSearch() {
            var searchText = document.getElementById('searchOthersTerm').value;
            var targetTable = document.getElementById('b19');
            var targetTableColCount;

            //Loop through table rows
            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {
                var rowData = '';

                //Get column count from header row
                if (rowIndex == 0) {
                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;
                    continue; //do not execute further code for header row.
                }

                //Process data rows. (rowIndex >= 1)
                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {
                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;
                }

                //If search term is not found in row data
                //then hide the row, else show
                if (rowData.indexOf(searchText) == -1)
                    targetTable.rows.item(rowIndex).style.display = 'none';
                else
                    targetTable.rows.item(rowIndex).style.display = 'table-row';
            }
        }
    </script>
</html>    