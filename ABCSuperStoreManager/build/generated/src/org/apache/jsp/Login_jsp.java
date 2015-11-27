package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7 lte9 lte8 lte7\" lang=\"en-US\"><![endif]-->\n");
      out.write("<!--[if IE 8]><html class=\"ie ie8 lte9 lte8\" lang=\"en-US\">\t<![endif]-->\n");
      out.write("<!--[if IE 9]><html class=\"ie ie9 lte9\" lang=\"en-US\"><![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("<html class=\"noIE\" lang=\"en-US\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <!-- meta -->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale = 1.0, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <title>Sign Up Form</title>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            #loginbutton{\n");
      out.write("                background-color: Transparent;\n");
      out.write("                background-repeat:no-repeat;\n");
      out.write("                border: none;\n");
      out.write("                cursor:pointer;\n");
      out.write("                overflow: hidden;\n");
      out.write("                outline:none;\n");
      out.write("                height: 50px;\n");
      out.write("                width : 90px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #loginbutton:hover{\n");
      out.write("                /*background-color: #a3a2a2;*/\n");
      out.write("                background-repeat:no-repeat;\n");
      out.write("                /*border: none;*/\n");
      out.write("                border: solid;\n");
      out.write("                border-color: white;\n");
      out.write("                border-width: 2px;\n");
      out.write("                cursor:pointer;\n");
      out.write("                overflow: hidden;\n");
      out.write("                outline:none;\n");
      out.write("            }\n");
      out.write("            #tabledata{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50px;\n");
      out.write("            }\n");
      out.write("             ul {\n");
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
      out.write("                background: url(\"assets/homepage/images/header.png\");\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                <script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("                <script src=\"assets/js/respond.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--[if IE 8]>\n");
      out.write("        <script src=\"assets/js/selectivizr.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"login\">\n");
      out.write("\n");
      out.write("        <!-- Home -->\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                        <li style=\"margin-top:40px\"><a href=\"portfolio.html\">Products</a></li>\n");
      out.write("                        <li style=\"margin-top:40px\"><a id=\"loginnav\" href=\"Login.jsp\">Login</a></li>\n");
      out.write("                        <li style=\"margin-top:40px\"><a id=\"signnav\" href=\"CreateAccount.jsp\">Sign Up</a></li>\n");
      out.write("                        <li style=\"margin-top:40px\"><a id=\"homenav\" href=\"HomePage.html\">Home</a></li>\n");
      out.write("                    </ul> <!-- /.nav -->\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <div>\n");
      out.write("                        <h1 style=\"font-family: monospace;text-align: center;font-size: 40px;color: #FFF\">\n");
      out.write("                            Please provide the following info to Login\n");
      out.write("                        </h1>\n");
      out.write("\n");
      out.write("                    </div> <!-- /.header-wrapper -->\n");
      out.write("                    <div>\n");
      out.write("                        <form method=\"post\" action=\"LoginServlet\" style=\"text-align: center;color: whitesmoke\">\n");
      out.write("                            <table width=\"100%\">\n");
      out.write("\n");
      out.write("                                <th width=\"50%\"></th>\n");
      out.write("                                <th width=\"50%\" style=\"text-align: left\"></th>\n");
      out.write("\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>UserID</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"UserID\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>Password</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input type=\"password\" name=\"password\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                              \n");
      out.write("                            </table>\n");
      out.write("                            <input type=\"submit\" id=\"loginbutton\" value=\"Login\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </section> <!-- /#header -->\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>");
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
