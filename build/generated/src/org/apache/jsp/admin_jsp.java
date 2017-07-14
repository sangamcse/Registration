package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/file/header.jsp");
    _jspx_dependants.add("/script.jsp");
  }

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
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>ESAD</title>\n");
      out.write("    <link href=\"http://www.mnnit.ac.in/templates/favourite/favicon.ico\" rel=\"shortcut icon\" type=\"image/vnd.microsoft.icon\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.1.1/animate.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 \">\n");
      out.write("                       ");
 if(session.getAttribute("UserName")!=null)
                        {
                            String un=(String)session.getAttribute("UserName"); 
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminmenu.jsp", out, false);
      out.write("\n");
      out.write("                       ");

                         }
                         else
                         {
                            response.sendRedirect("login.jsp");
                         }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.js'></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
