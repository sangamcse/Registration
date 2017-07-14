package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/student/header.jsp");
    _jspx_dependants.add("/student/connection.jsp");
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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                    ");
 
                    String a=session.getAttribute("UserName").toString();
                    
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    
      out.write("\n");
      out.write("    <section id=\"course\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"azure\" data-image=\"img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t<div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"dashboard.jsp\" class=\"simple-text\">\n");
      out.write("                    HOME\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li>\n");
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
      out.write("                <li>\n");
      out.write("                    <a href=\"download.jsp\">\n");
      out.write("                        <i class=\"pe-7s-albums\"></i>\n");
      out.write("                        <p>Study Materials</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"course.jsp\">\n");
      out.write("                        <i class=\"pe-7s-science\"></i>\n");
      out.write("                        <p>COURSE</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("\t\t\t\t\n");
      out.write("            </ul>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" >User</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"dashboard.jsp\">\n");
      out.write("                               <p>Account</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                       \n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-md-11\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("  <div class=\"panel panel-danger\">\n");
      out.write("    <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("          JAVA\n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("<h3>Core Java:</h3> Introduction to Object Oriented Software development through Java. Classes and Objects, Extending classes, Polymorphism, Interfaces, Nested classes and interfaces, Exceptions, Strings, Packages, The I/O Package. <br> <br><h3>Advanced Java:</h3> Event Handling, AWT, Swing, Applets, Multi Threading, The collection frameworks, Networking, Java Server Pages (JSP), Java Servlet, Enterprise Java Beans (EJB), Java Messaging Service (JMS), Java Database connectivity (JDBC). <br> <br><h3> Design patterns, frameworks & Web Design:</h3> Singleton, Factory Method, Builder, Adapter, Bridge, Composite, Proxy, Template Method, Iterator, Observer, Visitor etc. \n");
      out.write("Spring MVC, Struts 2, Hibernate, PHP, Java Script, Boot Strap, Ajax, AngularJS, Node.js, jQuery, Meteor, etc.<br> <br>\n");
      out.write("\t  Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use, particularly for client-server web applications, with a reported 9 million developers. Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.\n");
      out.write("\n");
      out.write("\t\t\tThe original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).\n");
      out.write("\n");
      out.write("\t\t\tThe latest version is Java 8 which is the only version currently supported for free by Oracle, although earlier versions are supported both by Oracle and other companies on a commercial basis.\n");
      out.write("\t\t\t\t <br><br>\n");
      out.write("\t\t\t\t The prospective participants are requested to submit their applications at the address for communication. The course fee will be as follows: Industry Persons/Faculty Rs. 9000=00 Students (from other institutions) Rs. 8000=00 Students (from MNNIT Allahabad) Rs. 7000=00\n");
      out.write("      <br>      <br>      <br>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-danger btn-lg\" role=\"button\" data-toggle=\"collapse\" href=\"#collapseExample\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  Proceed To Pay\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"collapse\" id=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  <div class=\"well\">\n");
      out.write("                     <!--  &nbsp Industry Persons/Faculty Rs. 9000=00  <br>\n");
      out.write("\t\t\t\t\t\t&nbsp Students (from other institutions) Rs. 8000=00 <br>\n");
      out.write("\t\t\t\t\t\t&nbsp Students (from MNNIT Allahabad) Rs. 7000=00 <br>\n");
      out.write("\t\t\t\t\t\t-->\n");
      out.write("                                                <form method=\"post\" action=\"paying.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <input type=\"radio\" name=\"course\" value=\"9000\" checked>Persons/Faculty <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <input type=\"radio\" name=\"course\" value=\"8000\">Students from other institutions  <input type=\"submit\" class=\"btn btn-success pull-right\" name=\"go\" value=\"Submit Button\"> <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <input type=\"radio\" name=\"course\" value=\"7000\">Students from MNNIT\n");
      out.write("                                                                                                                  ");

                                                                                                                      if(request.getParameter("go")!=null){
                                                                                                                          String amount = request.getParameter("course");
                                                                                                                          session.setAttribute("amount", amount);
                                                                                                                          response.sendRedirect("paying.jsp");
                                                                                                                      }
                                                                                                                  
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                        \n");
      out.write("                                                                                    </form> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t                     </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"panel panel-danger\">\n");
      out.write("    <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("           CISCO\n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("      The Cisco curriculum is a gateway to entry-level networking jobs and IT careers. The curriculum consists of 4, 70-hour courses: Introduction to Networks, Routing and Switching Essentials, Scaling Networks, and Connecting Networks. The first 2 courses prepare you for the Cisco CCENT certification exam or to study CCNA Security. All 4 courses are recommended before taking the Cisco CCNA Routing and Switching certification exam.\n");
      out.write("\n");
      out.write("    Develop a working knowledge of routing, switching, network applications, protocols, and services.\n");
      out.write("    Study with an instructor in the classroom and access expert content online anytime.\n");
      out.write("    Practice what you learn on both real equipment and Cisco Packet Tracer, a network configuration simulation tool.\n");
      out.write("    Get immediate feedback on your work through built-in quizzes and tests.\n");
      out.write("    Prepare for the workplace with collaborative projects and presentations.\n");
      out.write("    Connect with the global Cisco Networking Academy community.\n");
      out.write("\t\n");
      out.write("\t \n");
      out.write("\t  <br>      <br>      <br>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-danger btn-lg\" role=\"button\" data-toggle=\"collapse\" href=\"#collapseExample\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  Proceed To Pay\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"collapse\" id=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  <div class=\"well\">\n");
      out.write("\t\t\t\t\t\tDemo text.  Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text.\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t                     </div>\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"panel panel-danger\">\n");
      out.write("    <div class=\"panel-heading\" role=\"tab\" id=\"headingThree\">\n");
      out.write("      <h4 class=\"panel-title\">\n");
      out.write("        <a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("          \n");
      out.write("        LINUX/NETWORKING  \n");
      out.write("        </a>\n");
      out.write("      </h4>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThree\">\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("          Networking Essentials covers basic networking concepts within the context of the networks you encounter every day. In this course, students will develop hands-on networking skills and understand the role networks play in our lives. This course introduces students to networking careers and prepares them for further study.\n");
      out.write("\n");
      out.write("    Learn how to plan and install a network using real equipment and connect it to the Internet.\n");
      out.write("    Practice verifying and troubleshooting network and Internet connectivity.\n");
      out.write("    Learn how to recognize and mitigate security threats to a home network.\n");
      out.write("    Configure common Internet applications, set up sharing between computers, and configure basic IP services.\n");
      out.write("    Get immediate feedback on your work through built-in quizzes and tests.\n");
      out.write("    Connect with the global Cisco Networking Academy community.\n");
      out.write("\t\n");
      out.write("            <br>      <br>      <br>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-danger btn-lg\" role=\"button\" data-toggle=\"collapse\" href=\"#collapseExample\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  Proceed To Pay\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"collapse\" id=\"collapseExample\">\n");
      out.write("\t\t\t\t\t  <div class=\"well\">\n");
      out.write("\t\t\t\t\t\tDemo text.  Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text. Demo text.\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t                     </div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
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
