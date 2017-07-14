package org.apache.jsp.file;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feature_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4\">\n");
      out.write("                <h2 class=\"text-center text-primary\">Features</h2>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"media wow fadeInRight\">\n");
      out.write("                    <h3 class=\"text-primary\" style=\"border-bottom: 2px solid #555;\">Core Java</h3>\n");
      out.write("                 \n");
      out.write("                    <div class=\"media-body media-middle\">\n");
      out.write("                        <p>Introduction to Object Oriented Software development through Java. Classes and \n");
      out.write("                            Objects, Extending classes, Polymorphism, Interfaces, Nested classes and interfaces,\n");
      out.write("                            Exceptions, Strings, Packages, The I/O Package.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-right\">\n");
      out.write("                        <i class=\"icon-lg ion-ios-bolt-outline\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"media wow fadeIn\">\n");
      out.write("                    <h3 class=\"text-primary\" style=\"border-bottom: 2px solid #555;\">Advanced Java</h3>\n");
      out.write("                    \n");
      out.write("                    <div class=\"media-left\">\n");
      out.write("                        <i class=\"icon-lg ion-ios-cloud-download-outline\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-body media-middle\">\n");
      out.write("                        <p>Event Handling, AWT, Swing, Applets, Multi Threading, The collection frameworks, Networking,\n");
      out.write("                            Java Server Pages (JSP), Java Servlet, Enterprise Java Beans(EJB), Java Messaging Service (JMS), \n");
      out.write("                            Java Database connectivity (JDBC)</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"media wow fadeInRight\">\n");
      out.write("                    <h3 class=\"text-primary\" style=\"border-bottom: 2px solid #555;\">Design patterns, frameworks & Web Design</h3>\n");
      out.write("                    \n");
      out.write("                    <div class=\"media-body media-middle\">\n");
      out.write("                        <p>Singleton, Factory Method, Builder, Adapter, Bridge, Composite, Proxy, Template Method, \n");
      out.write("                            Iterator, Observer, Visitor etc. Spring MVC, Struts 2, Hibernate, PHP, Java Script, BootStrap, \n");
      out.write("                            Ajax, AngularJS, Node.js, jQuery, Meteor, etc. </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-right\">\n");
      out.write("                        <i class=\"icon-lg ion-ios-snowy\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM feed WHERE email='ksangam68@gmail.com'");
                    while(rs.next()){
                        
                    
            
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"header-content text-center text-primary\" >\n");
      out.write("                <div class=\"inner\" style=\"border-bottom: 1px solid #555;\">\n");
      out.write("                <h3 class=\"cursive\">\n");
      out.write("                    Review\n");
      out.write("                </h3>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"col-md-4 column text-center margin-top\">\n");
      out.write("                    <p class=\"text-faded\" style=\"text-align: justify;\">\n");
      out.write("                        ");
      out.print(rs.getString("msg")  );
      out.write(' ');
 } 
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 column text-center\">\n");
      out.write("                    ");
 rs = st.executeQuery("SELECT * FROM feed WHERE email='amit@gmail.com'");  while(rs.next()){ 
      out.write(' ');
      out.print(rs.getString("msg")  );
      out.write(' ');
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 column text-center\">\n");
      out.write("                    ");
 rs = st.executeQuery("SELECT * FROM feed WHERE email='am@gmail.com'");  while(rs.next()){ 
      out.write(' ');
      out.print(rs.getString("msg")  );
      out.write(' ');
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                        ");

                            }
                       
                        catch(Exception e){
                        out.println(e.toString());
                        }

                        
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
