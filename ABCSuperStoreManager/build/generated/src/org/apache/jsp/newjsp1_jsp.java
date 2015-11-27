package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/owl.theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/homepage/css/one-page.css\">\n");
      out.write("        <style>\n");
      out.write("            #submitbutton{\n");
      out.write("                background-color: Transparent;\n");
      out.write("                background-repeat:no-repeat;\n");
      out.write("                border: none;\n");
      out.write("                cursor:pointer;\n");
      out.write("                overflow: hidden;\n");
      out.write("                outline:none;\n");
      out.write("                height: 50px;\n");
      out.write("                width : 90px;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            #submitbutton:hover{\n");
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
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Home -->\n");
      out.write("        <section class=\"header\" id=\"header\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <!-- <a class=\"navbar-brand\" href=\"index-multipage.html\">SIGHT</a> -->\n");
      out.write("                    </div> <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"HomePage.html\">Home</a></li>\n");
      out.write("                            <li><a href=\"about.html\">Products</a></li>\n");
      out.write("                            <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                            <li><a href=\"CreateAccount.jsp\">Sign Up</a></li>\n");
      out.write("                        </ul> <!-- /.nav -->\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("                </div><!-- /.container -->\n");
      out.write("            </nav>\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <div>\n");
      out.write("                        <h1 style=\"font-family: monospace;text-align: center;font-size: 40px;color: #FFF\">\n");
      out.write("                            Please Fill Up The Form\n");
      out.write("                        </h1>\n");
      out.write("\n");
      out.write("                    </div> <!-- /.header-wrapper -->\n");
      out.write("                    <div>\n");
      out.write("                        <form method=\"post\" action=\"CreateAccountServlet\" style=\"text-align: center\">\n");
      out.write("                            <table width=\"100%\">\n");
      out.write("\n");
      out.write("                                <th width=\"50%\"></th>\n");
      out.write("                                <th width=\"50%\" style=\"text-align: left\"></th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>UserName</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"UserName\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>Password</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input type=\"password\" name=\"ChoosePassword\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>Phone Number</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"PhoneNumber\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>City</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"City\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>Area</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"Area\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr id=\"tabledata\">\n");
      out.write("                                    <td>House Number</td>\n");
      out.write("                                    <td style=\"color: #a3a2a2\"><input name=\"HouseNumber\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                            <input type=\"submit\" id=\"submitbutton\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </section> <!-- /#header -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <div class=\"copy\">\n");
      out.write("                            Copyright &copy; 2015 ABC SUPER STORE\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 text-center\">\n");
      out.write("                        <div class=\"social-icon\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"icon fb\">\n");
      out.write("                                    <i class=\"ion-social-facebook\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"icon twitter\">\n");
      out.write("                                    <i class=\"ion-social-twitter\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"icon google\">\n");
      out.write("                                    <i class=\"ion-social-googleplus\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"icon rss\">\n");
      out.write("                                    <i class=\"ion-social-rss\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 text-right\">\n");
      out.write("                        <div class=\"copy\">\n");
      out.write("                            Theme by <a href=\"http://www.themewagon.com\">themewagon.com</a>. All Rights Reserved\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- /.row -->\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"assets/homepage/js/jquery-1.11.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/homepage/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/homepage/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"assets/homepage/js/contact.js\"></script>\n");
      out.write("        <!-- // <script src=\"assets/js/smoothscroll.js\"></script> -->\n");
      out.write("        <script src=\"assets/homepage/js/script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
