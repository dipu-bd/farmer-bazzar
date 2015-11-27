package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import MyPack.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Successful !!!</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"overflow: auto\">\n");
      out.write("        ");

            CurrentUser cu2 = (CurrentUser) session.getAttribute("cu");
        
      out.write("\n");
      out.write("        <h1>Hello ");
      out.print(cu2.getName());
      out.write(" </h1>\n");
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
      out.write("        <form>\n");
      out.write("            <input onclick=\"showVeg()\" type=\"button\" value=\"ShowVegetable\" id=\"b2\" style=\"height: 25px;width: 120px\"></input>\n");
      out.write("            <input type=\"text\" id=\"searchVegTerm\" class=\"search_box\" onkeyup=\"doVegSearch()\" />\n");
      out.write("            <table id=\"b1\" style=\"display: none\" width=\"100%\">\n");
      out.write("\n");
      out.write("                <th width=\"10%\"></th>\n");
      out.write("                <th width=\"40%\" style=\"text-align: left\">Item</th>\n");
      out.write("                <th width=\"25%\" style=\"text-align: left\">Price</th>\n");
      out.write("                <th width=\"25%\">Amount(in kg)</th>\n");
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
      out.write("                    <td><input type=\"text\" name=\"vegamount\" size=\"6\" value=\"0\" style=\"float: right\"></input></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    } catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var a = 0;\n");
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
