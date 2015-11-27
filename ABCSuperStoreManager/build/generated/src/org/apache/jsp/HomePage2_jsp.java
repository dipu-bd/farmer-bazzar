package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--<![endif]-->\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- meta -->\n");
      out.write("\t\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("\t\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale = 1.0, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("\t\t<title>HomePage</title>\n");
      out.write("\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/homepage/css/bootstrap.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/homepage/css/ionicons.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/homepage/css/owl.carousel.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/homepage/css/owl.theme.css\">\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"assets/homepage/css/main.css\">\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"assets/homepage/css/one-page.css\">\n");
      out.write("\t    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\t\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t\t<script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("\t\t\t\t<script src=\"assets/js/respond.js\"></script>\n");
      out.write("\t\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t\t<!--[if IE 8]>\n");
      out.write("\t\t    \t<script src=\"assets/js/selectivizr.js\"></script>\n");
      out.write("\t\t    <![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Home -->\n");
      out.write("\t<section class=\"header\" id=\"header\">\n");
      out.write("\t\t\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"HomePage2.jsp\">home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">products</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"service.html\">login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"CreateAccount2.jsp\">sign up</a></li>\n");
      out.write("\t\t\t\t\t</ul> <!-- /.nav -->\n");
      out.write("\t\t\t    </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t  \t</div><!-- /.container -->\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-table\">\n");
      out.write("\t\t\t\t<div class=\"header-wrapper\">\n");
      out.write("\t\t\t\t\t<h1 class=\"header-title\">\n");
      out.write("\t\t\t\t\t\tWelcome to ABC Online Store\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<p class=\"header-subtitle\">\n");
      out.write("\t\t\t\t\t\tsince 2013\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div> <!-- /.header-wrapper -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div> <!-- /.container -->\n");
      out.write("\t</section> <!-- /#header -->\n");
      out.write("\t\n");
      out.write("<!-- Footer -->\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"copy\">\n");
      out.write("\t\t\t\t\t\tCopyright &copy; 2015 ABC Online Store\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"social-icon\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon fb\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-social-facebook\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon twitter\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-social-twitter\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon google\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-social-googleplus\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon rss\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ion-social-rss\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 text-right\">\n");
      out.write("\t\t\t\t\t<div class=\"copy\">\n");
      out.write("\t\t\t\t\t\tTheme by <a href=\"http://www.themewagon.com\">themewagon.com</a>. All Rights Reserved\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> <!-- /.row -->\n");
      out.write("\t\t</div> <!-- /.container -->\n");
      out.write("\t</footer>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/jquery-1.11.2.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/contact.js\"></script>\n");
      out.write("\t<!-- // <script src=\"assets/js/smoothscroll.js\"></script> -->\n");
      out.write("\t<script src=\"assets/js/script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
