package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/student/header.jsp");
    _jspx_dependants.add("/student/script.jsp");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>ESAD</title>\n");
      out.write("    <link href=\"http://www.mnnit.ac.in/templates/favourite/favicon.ico\" rel=\"shortcut icon\" type=\"image/vnd.microsoft.icon\" />\n");
      out.write("    \n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"css/light-bootstrap-dashboard.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("                    ");
 
                    String a=session.getAttribute("UserName").toString();
       
                    Class.forName("com.mysql.jdbc.Driver");	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    
                    
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    \n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-image=\"img/sidebar-5.jpg\">\n");
      out.write("    <!--\n");
      out.write("        Tip 1: you can change the color of the side bar using: data-color=\"blue | azure | green | orange | red | purple\"\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("    -->\n");
      out.write("    \t<div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("               <a href=\"dashboard.jsp\" class=\"simple-text\">\n");
      out.write("                    HOME\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"dashboard.jsp\">\n");
      out.write("                        <i class=\"pe-7s-graph\"></i>\n");
      out.write("                        <p>Dashboard</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"user.jsp\">\n");
      out.write("                        <i class=\"pe-7s-user\"></i>\n");
      out.write("                        <p>User Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"table.jsp\">\n");
      out.write("                        <i class=\"pe-7s-note2\"></i>\n");
      out.write("                        <p>Table List</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"test.jsp\">\n");
      out.write("                        <i class=\"pe-7s-news-paper\"></i>\n");
      out.write("                        <p>Skill-Test</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("              <li >\n");
      out.write("                    <a href=\"course.jsp\">\n");
      out.write("                        <i class=\"pe-7s-science\"></i>\n");
      out.write("                        <p>COURSE</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\t\n");
      out.write("            </ul>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                  \n");
      out.write("                    <a class=\"navbar-brand\" >Dashboard</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"dashboard.jsp\">\n");
      out.write("                               <p>Account</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"web/index.php\">\n");
      out.write("                               <p>Chat Room</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"../Logout.jsp\">\n");
      out.write("                                <p>Log out</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\t\t\t\t\t\t<li class=\"separator hidden-lg hidden-md\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h3 class=\"title\">Summer Training Program - Enhancing Skill For Enterprise Scale Application Development</h3>\n");
      out.write("                                <p class=\"category\">Govt. added Plan [MNNIT]</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                <div class=\"typo-line\">\n");
      out.write("                                    <p><span class=\"category\">Contrast</span>The program tries to enhance the skill of graduating students to increase the chances of\n");
      out.write("\t\t\t\t\t\t\t\t\temployability which is very poor in India according to reports. Sangeeta Gupta, Senior Vice precident, \n");
      out.write("\t\t\t\t\t\t\t\t\tNASSCOM said, \"Our engineers are not unemployable, they just don't have industry-ready talent. In other words, they lack the\n");
      out.write("\t\t\t\t\t\t\t\t\tskills required for the jobs that are available to them.\" Our program ESAD is a step towards the enhancing skills for making newly \n");
      out.write("\t\t\t\t\t\t\t\t\tgraduated students industry ready. Program is expected to solve some of these concerns of the industry along with the small contribution \n");
      out.write("\t\t\t\t\t\t\t\t\ttowards \"Skill India Program\" of Government of India.\n");
      out.write("                                    We acknowledge all the organizations/persons who have provided valuable information /\n");
      out.write("                                    resources on the internet related to CSED-2017.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\t\t\t\t\t\t\t\t\n");
      out.write("                                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                      <!-- Indicators -->\n");
      out.write("                                      <ol class=\"carousel-indicators\">\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("\n");
      out.write("                                      </ol>\n");
      out.write("\n");
      out.write("                                      <!-- Wrapper for slides -->\n");
      out.write("                                      <div class=\"carousel-inner\">\n");
      out.write("                                        <div class=\"item active\">\n");
      out.write("                                          <img src=\"image/img1.jpg\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                          <img src=\"image/img2.jpg\" >\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                          <img src=\"image/img3.jpg\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                          <img src=\"image/img4.jpg\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                          <img src=\"image/img5.jpg\" >\n");
      out.write("                                        </div>\n");
      out.write("                                      </div>\n");
      out.write("\n");
      out.write("                                      <!-- Left and right controls -->\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("    \n");
      out.write("                                <div class=\"typo-line\">\n");
      out.write("                                    <p class=\"category\">Quote</p>\n");
      out.write("                                        <blockquote>\n");
      out.write("                                            <p>\n");
      out.write("                                                Great things in business are never done by one person. They're done by a team of people.\n");
      out.write("                                            </p>\n");
      out.write("                                            <small>\n");
      out.write("                                                Steve Jobs,X-CEO Apple\n");
      out.write("                                            </small>\n");
      out.write("                                        </blockquote>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"typo-line\">\n");
      out.write("                                    <p class=\"category\">Support</p>\n");
      out.write("                                        <p class=\"text-muted\">\n");
      out.write("                                            For any help and support, please e-mail to <a href=\"mailto:esad.mnnit@gmail.com\"> esad.mnnit@gmail.com</a>\n");
      out.write("                                        </p>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 text-center typo-line\">\n");
      out.write("                                    <span class=\"text-muted small\">(ES)<sup>2</sup>AD | CSED, MNNIT Allahabad ©2017</span>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Checkbox, Radio & Switch Plugins -->\n");
      out.write("\t<script src=\"js/bootstrap-checkbox-radio-switch.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"js/light-bootstrap-dashboard.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"js/demo.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("\n");
      out.write("        \tdemo.initChartist();\n");
      out.write("\n");
      out.write("        \t$.notify({\n");
      out.write("            \ticon: 'pe-7s-gift',\n");
      out.write("            \tmessage: \"Welcome to <b>ESAD Dashboard</b> - a beautiful Place for every developer.\"\n");
      out.write("    <!--@BY shrey01-->\n");
      out.write("            },{\n");
      out.write("                type: 'info',\n");
      out.write("                timer: 4000\n");
      out.write("            });\n");
      out.write("\n");
      out.write("    \t});\n");
      out.write("\t</script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
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
