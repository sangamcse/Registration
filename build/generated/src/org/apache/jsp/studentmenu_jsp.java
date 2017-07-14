package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/file/header.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>ESAD</title>\n");
      out.write("    <link href=\"http://www.mnnit.ac.in/templates/favourite/favicon.ico\" rel=\"shortcut icon\" type=\"image/vnd.microsoft.icon\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.1.1/animate.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav id=\"topNav\" class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-navbar\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#first\"><i class=\"ion-ios-analytics-outline\"></i> (ES)<sup>2</sup>AD</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navbar-collapse collapse\" id=\"bs-navbar\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"student.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Information</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">My Details</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Classroom Solution</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Test Solution</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Logout.jsp\">Logout</a>\r\n");
      out.write("                        \r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h2>\r\n");
      out.write("            ");
 
                String a=session.getAttribute("UserName").toString();
                out.println("Hello "+a);
                
      out.write("\r\n");
      out.write("            </h2>\r\n");
      out.write("            <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr bgcolor=\"#A52A2A\">\r\n");
      out.write("                <td><b>id</b></td>\r\n");
      out.write("                <td><b>user_id</b></td>\r\n");
      out.write("                <td><b>Password</b></td>\r\n");
      out.write("                <td><b>Name</b></td>\r\n");
      out.write("                <td><b>Email</b></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            ");

                try{ 
                    Class.forName("com.mysql.jdbc.Driver");	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    while(rs.next()){
                    
      out.write("\r\n");
      out.write("                    <tr bgcolor=\"#DEB887\">\r\n");
      out.write("\r\n");
      out.write("                    <td>");
      out.print(rs.getString("name") );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("dob") );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("gender") );
      out.write("</td>\r\n");
      out.write("                    \r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
 
                    }

                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                    
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
