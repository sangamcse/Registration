package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class last_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <h2 class=\"margin-top-0 wow fadeIn\">Get in Touch</h2>\n");
      out.write("                    <hr class=\"primary\">\n");
      out.write("                    <p>We love feedback. Fill out the form below and we'll get back to you as soon as possible.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-1 text-center\">\n");
      out.write("                    <form class=\"contact-form row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"n1\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Email\" name=\"n2\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <label></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Phone\" name=\"n3\" maxlength=\"10\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <label></label>\n");
      out.write("                            <textarea class=\"form-control\" rows=\"9\" placeholder=\"Your message here..\" name=\"n4\" maxlength=\"300\" required></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                            <label></label>\n");
      out.write("                            <input type=\"submit\" data-toggle=\"modal\" class=\"btn btn-primary btn-block btn-lg\" value=\"Send\" name=\"send\">Send <i class=\"ion-android-arrow-forward\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            if(request.getParameter("send")!=null){
                                String name, email, phone, msg;
                                name=request.getParameter("n1");
                                email=request.getParameter("n2");
                                phone=request.getParameter("n3");
                                msg=request.getParameter("n4");
                                if(msg.length() >300){
                                    try{
                                        Class.forName("com.mysql.jdbc.Driver");	
                                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                                        Statement st=con.createStatement();
                                        String sql="insert into feed values('"+name+"','"+email+"','"+phone+"','"+msg+"')";
                                        int res=st.executeUpdate(sql);
                                        if(res!=0)
                                                out.println("<br>Record Inserted");
                                        else
                                                out.println("<br>Record Not Inserted");
                                }catch(Exception e)
                                {
                                        out.println(e.toString());
                                }
                                }
                            }

                        
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
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
