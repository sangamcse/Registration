package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forget_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.1.1/animate.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\tfunction tncaccept(v)\n");
      out.write("\t\t{\n");
      out.write("\t\t\ts=document.getElementById(\"sub\");\n");
      out.write("\t\t\tif (v==true){\n");
      out.write("\t\t\t\ts.disabled=false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse{\n");
      out.write("\t\t\t\ts.disabled=true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("        <style>\n");
      out.write("            .container{\n");
      out.write("                             \n");
      out.write("              font-size: 24;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <nav id=\"topNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-navbar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"index.jsp#first\"><i class=\"\"><img src=\"img/Welcome.png\" height=\"25\" width=\"auto\"></i> (ES)<sup>2</sup>AD</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse\" id=\"bs-navbar\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.jsp#aboutModal\">Intro</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.jsp#gallery\">Gallery</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.jsp#feature\">Features</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"index.jsp#last\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" title=\"Login\" href=\"login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.js'></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <section id=\"last\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4\">\n");
      out.write("                    <h2 class=\"margin-top-0 wow fadeIn\">Forgot Password?</h2>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 col-lg-offset-1 text-center\">\n");
      out.write("                    <form role=\"form\" method=\"get\" action=\"\">\n");
      out.write("                      <div class=\"form-group\" >\n");
      out.write("                       <div class=\"margin-top-0 wow fadeIn\">\n");
      out.write("                          <label for=\"t1\">User Name &nbsp&nbsp&nbsp&nbsp</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"a1\" name=\"a1\" placeholder=\"Enter User Name\">\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                                <br>  <br><input type=\"submit\" class=\"btn btn-primary\" value=\"Submit\" />\n");
      out.write("                                ");

                                    if(request.getParameter("a1")!=null)
                                    {
                                        String un=request.getParameter("a1");
                                        boolean flag=false;
                            try{
                                    Class.forName("com.mysql.jdbc.Driver");	
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                                    Statement st=con.createStatement();
                                    ResultSet rs=st.executeQuery("select * from xyz where email='"+un+"'");
                                    if(rs.next())
                                    {
                                        flag=true;
                                
      out.write("\n");
      out.write("                                <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(rs.getString(17) );
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                ");

                                    }


                                    }
                        catch(Exception e)
                            {
                                    out.println(e.toString());
                            }
                                    }
                        
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
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
      out.write("\n");
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
