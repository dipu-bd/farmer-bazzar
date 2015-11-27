package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import MyPack.*;

public final class LoginSuccessfull_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                width: 800px;\n");
      out.write("                margin-left: 250px;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("            #b1,#b3,#b5,#b7 {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            li{\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            nav a {\n");
      out.write("                display: block;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 30px;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            body#home a#homenav,body#signup a#signnav,body#login a#loginnav{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                /*background: url(\"assets/homepage/images/header.png\");*/\n");
      out.write("                background-color: black;\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Login Successful !!!</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"overflow-y: auto;overflow-x: hidden\">\n");
      out.write("        <nav>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li style=\"margin-top:40px\"><a href=\"portfolio.html\">Products</a></li>\n");
      out.write("                    <li style=\"margin-top:40px\"><a id=\"loginnav\" href=\"Login.jsp\">Login</a></li>\n");
      out.write("                    <li style=\"margin-top:40px\"><a id=\"signnav\" href=\"CreateAccount.jsp\">Sign Up</a></li>\n");
      out.write("                    <li style=\"margin-top:40px\"><a id=\"homenav\" href=\"HomePage.html\">Home</a></li>\n");
      out.write("                </ul> <!-- /.nav -->\n");
      out.write("            </div><!-- /.navbar-collapse -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");

            CurrentUser cu2 = (CurrentUser) session.getAttribute("cu");
        
      out.write("\n");
      out.write("        <h1 style=\"color: white;text-align: center\" >Hello ");
      out.print(cu2.getName());
      out.write("</h1>\n");
      out.write("        <br>\n");
      out.write("        ");

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
            }
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"ReceiveReqServlet\" style=\"text-align: center\">\n");
      out.write("            <input onclick=\"showVeg()\" type=\"button\" value=\"ShowVegetable\" id=\"b2\" style=\"height: 25px;width: 120px\"></input>\n");
      out.write("            <input type=\"text\" id=\"searchVegTerm\" class=\"search_box\" onkeyup=\"doVegSearch()\"  />\n");
      out.write("            <br>\n");
      out.write("            <table id=\"b1\" style=\"display: none\">\n");
      out.write("\n");
      out.write("                <th></th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Amount(in kg)</th>\n");
      out.write("                    ");

                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from vegetablelist");
                            while (rs.next()) {
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"vegitems\" value=");
      out.print(rs.getString(1));
      out.write("></input></td>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                   <!-- <td><input type=\"text\" name=\"vegamount\" size=\"6\" value=\"0\" ></input></td>-->\n");
      out.write("                   <td>\n");
      out.write("                        <select name=\"vegamount\">\n");
      out.write("                            <option value=\"0\">0</option>\n");
      out.write("                            <option value=\".250\">.250</option>\n");
      out.write("                            <option value=\"0.5\">0.5</option>\n");
      out.write("                            <option value=\"1\">1</option>\n");
      out.write("                            <option value=\"5\">5</option>\n");
      out.write("                            <option value=\"10\">10</option>\n");
      out.write("                            <option value=\"15\">15</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    } catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <input onclick=\"showGrocery()\" type=\"button\" value=\"ShowGrocery\" id=\"b4\" style=\"height: 25px;width: 120px\"></input>\n");
      out.write("            <input type=\"text\" id=\"searchGroceryTerm\" class=\"search_box\" onkeyup=\"doGrocerySearch()\" />\n");
      out.write("            <br>\n");
      out.write("            <table style=\"display: none\" id=\"b3\">\n");
      out.write("                <th></th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Amount(in kg)</th>\n");
      out.write("                    ");

                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from grocerylist");
                            while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"groceryitems\" value=");
      out.print(rs.getString(1));
      out.write("></input></td>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <!--<td><input type=\"text\" name=\"groceryamount\" size=\"6\" value=\"0\"></input></td>-->\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"groceryamount\">\n");
      out.write("                            <option value=\"0\">0</option>\n");
      out.write("                            <option value=\".250\">.250</option>\n");
      out.write("                            <option value=\"0.5\">0.5</option>\n");
      out.write("                            <option value=\"1\">1</option>\n");
      out.write("                            <option value=\"5\">5</option>\n");
      out.write("                            <option value=\"10\">10</option>\n");
      out.write("                            <option value=\"15\">15</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    } catch (Exception e) {
                    }
                
      out.write(" \n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <input onclick=\"showLiquids()\" type=\"button\" value=\"ShowLiquids\" id=\"b6\" style=\"height: 25px;width: 120px\"></input>\n");
      out.write("            <input type=\"text\" id=\"searchLiquidsTerm\" class=\"search_box\" onkeyup=\"doLiquidsSearch()\" />\n");
      out.write("            <br>\n");
      out.write("            <table style=\"display: none\" id=\"b5\">\n");
      out.write("                <th></th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Amount(in ltr)</th>\n");
      out.write("                    ");

                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from liquidslist");
                            while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"liquidsitems\" value=");
      out.print(rs.getString(1));
      out.write("></input></td>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"liquidsamount\">\n");
      out.write("                            <option value=\"0\">0</option>\n");
      out.write("                            <option value=\".250\">.250</option>\n");
      out.write("                            <option value=\"0.5\">0.5</option>\n");
      out.write("                            <option value=\"1\">1</option>\n");
      out.write("                            <option value=\"5\">5</option>\n");
      out.write("                            <option value=\"10\">10</option>\n");
      out.write("                            <option value=\"15\">15</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    } catch (Exception e) {
                    }
                
      out.write(" \n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <input onclick=\"showChockolates()\" type=\"button\" value=\"ShowChockolates\" id=\"b8\" style=\"height: 25px;width: 120px\"></input>\n");
      out.write("            <input type=\"text\" id=\"searchChockolatesTerm\" class=\"search_box\" onkeyup=\"doChockolatesSearch()\"/>\n");
      out.write("            <br>\n");
      out.write("            <table style=\"display: none\" id=\"b7\">\n");
      out.write("                <th></th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Amount(in pkg)</th>\n");
      out.write("                    ");

                        try {
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery("select name,price from chockolateslist");
                            while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"chockolatesitems\" value=");
      out.print(rs.getString(1));
      out.write("></input></td>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"chockolatesamount\">\n");
      out.write("                            <option value=\"0\">0</option>\n");
      out.write("                            <option value=\"1\">1</option>\n");
      out.write("                            <option value=\"2\">2</option>\n");
      out.write("                            <option value=\"3\">3</option>\n");
      out.write("                            <option value=\"4\">4</option>\n");
      out.write("                            <option value=\"5\">5</option>\n");
      out.write("                            <option value=\"10\">10</option>\n");
      out.write("                            <option value=\"20\">20</option>                            \n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    } catch (Exception e) {
                    }
                
      out.write(" \n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"generateBill\" >\n");
      out.write("            <br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var a = 0;\n");
      out.write("        var b = 0;\n");
      out.write("        var c = 0;\n");
      out.write("        var d = 0;\n");
      out.write("        function showVeg() {\n");
      out.write("            if (a === 0) {\n");
      out.write("                document.getElementById(\"b1\").style.display = \"block\";\n");
      out.write("                document.getElementById(\"b2\").value = \"HideList\";\n");
      out.write("                a = 1;\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                document.getElementById(\"b1\").style.display = \"none\";\n");
      out.write("                document.getElementById(\"b2\").value = \"ShowVegetable\";\n");
      out.write("                a = 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        function showGrocery() {\n");
      out.write("            if (b == 0) {\n");
      out.write("                document.getElementById(\"b3\").style.display = \"block\";\n");
      out.write("                document.getElementById(\"b4\").value = \"HideList\";\n");
      out.write("                b = 1;\n");
      out.write("            }\n");
      out.write("            else if (b == 1) {\n");
      out.write("                document.getElementById(\"b3\").style.display = \"none\";\n");
      out.write("                document.getElementById(\"b4\").value = \"ShowGrocery\";\n");
      out.write("                b = 0;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function showLiquids() {\n");
      out.write("            if (c == 0) {\n");
      out.write("                document.getElementById(\"b5\").style.display = \"block\";\n");
      out.write("                document.getElementById(\"b6\").value = \"HideList\";\n");
      out.write("                c = 1;\n");
      out.write("            }\n");
      out.write("            else if (c == 1) {\n");
      out.write("                document.getElementById(\"b5\").style.display = \"none\";\n");
      out.write("                document.getElementById(\"b6\").value = \"ShowLiquids\";\n");
      out.write("                c = 0;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function showChockolates() {\n");
      out.write("            if (d == 0) {\n");
      out.write("                document.getElementById(\"b7\").style.display = \"block\";\n");
      out.write("                document.getElementById(\"b8\").value = \"HideList\";\n");
      out.write("                d = 1;\n");
      out.write("            }\n");
      out.write("            else if (d == 1) {\n");
      out.write("                document.getElementById(\"b7\").style.display = \"none\";\n");
      out.write("                document.getElementById(\"b8\").value = \"ShowChockolates\";\n");
      out.write("                d = 0;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doVegSearch() {\n");
      out.write("            var searchText = document.getElementById('searchVegTerm').value;\n");
      out.write("            var targetTable = document.getElementById('b1');\n");
      out.write("            var targetTableColCount;\n");
      out.write("\n");
      out.write("            //Loop through table rows\n");
      out.write("            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {\n");
      out.write("                var rowData = '';\n");
      out.write("\n");
      out.write("                //Get column count from header row\n");
      out.write("                if (rowIndex == 0) {\n");
      out.write("                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;\n");
      out.write("                    continue; //do not execute further code for header row.\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //Process data rows. (rowIndex >= 1)\n");
      out.write("                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {\n");
      out.write("                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //If search term is not found in row data\n");
      out.write("                //then hide the row, else show\n");
      out.write("                if (rowData.indexOf(searchText) == -1)\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'none';\n");
      out.write("                else\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'table-row';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doGrocerySearch() {\n");
      out.write("            var searchText = document.getElementById('searchGroceryTerm').value;\n");
      out.write("            var targetTable = document.getElementById('b3');\n");
      out.write("            var targetTableColCount;\n");
      out.write("\n");
      out.write("            //Loop through table rows\n");
      out.write("            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {\n");
      out.write("                var rowData = '';\n");
      out.write("\n");
      out.write("                //Get column count from header row\n");
      out.write("                if (rowIndex == 0) {\n");
      out.write("                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;\n");
      out.write("                    continue; //do not execute further code for header row.\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //Process data rows. (rowIndex >= 1)\n");
      out.write("                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {\n");
      out.write("                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //If search term is not found in row data\n");
      out.write("                //then hide the row, else show\n");
      out.write("                if (rowData.indexOf(searchText) == -1)\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'none';\n");
      out.write("                else\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'table-row';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doLiquidsSearch() {\n");
      out.write("            var searchText = document.getElementById('searchLiquidsTerm').value;\n");
      out.write("            var targetTable = document.getElementById('b5');\n");
      out.write("            var targetTableColCount;\n");
      out.write("\n");
      out.write("            //Loop through table rows\n");
      out.write("            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {\n");
      out.write("                var rowData = '';\n");
      out.write("\n");
      out.write("                //Get column count from header row\n");
      out.write("                if (rowIndex == 0) {\n");
      out.write("                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;\n");
      out.write("                    continue; //do not execute further code for header row.\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //Process data rows. (rowIndex >= 1)\n");
      out.write("                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {\n");
      out.write("                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //If search term is not found in row data\n");
      out.write("                //then hide the row, else show\n");
      out.write("                if (rowData.indexOf(searchText) == -1)\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'none';\n");
      out.write("                else\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'table-row';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doChockolatesSearch() {\n");
      out.write("            var searchText = document.getElementById('searchChockolatesTerm').value;\n");
      out.write("            var targetTable = document.getElementById('b7');\n");
      out.write("            var targetTableColCount;\n");
      out.write("\n");
      out.write("            //Loop through table rows\n");
      out.write("            for (var rowIndex = 0; rowIndex < targetTable.rows.length; rowIndex++) {\n");
      out.write("                var rowData = '';\n");
      out.write("\n");
      out.write("                //Get column count from header row\n");
      out.write("                if (rowIndex == 0) {\n");
      out.write("                    targetTableColCount = targetTable.rows.item(rowIndex).cells.length;\n");
      out.write("                    continue; //do not execute further code for header row.\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //Process data rows. (rowIndex >= 1)\n");
      out.write("                for (var colIndex = 0; colIndex < targetTableColCount; colIndex++) {\n");
      out.write("                    rowData += targetTable.rows.item(rowIndex).cells.item(colIndex).textContent;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //If search term is not found in row data\n");
      out.write("                //then hide the row, else show\n");
      out.write("                if (rowData.indexOf(searchText) == -1)\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'none';\n");
      out.write("                else\n");
      out.write("                    targetTable.rows.item(rowIndex).style.display = 'table-row';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
