package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <h2 class=\"margin-top-0 wow fadeIn cursive\">Registration form</h2>\n");
      out.write("                    <hr class=\"primary\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 col-lg-offset-1 text-center\">\n");
      out.write("                    \n");
      out.write("                    <form role=\"form\" method=\"post\">  \n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr >\n");
      out.write("                               <img src=\"img/registration.gif\"  alt=\"registration\" width=\"400px\" height=\"120px\" style=\" margin-left: 90px;\" >\n");
      out.write("                            </tr>\n");
      out.write("                            <tr></tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t1\" class=\"form-control\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Father Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t2\" class=\"form-control\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Mother Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t3\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Date of Birth</td>\n");
      out.write("                                <td><input type=\"date\" name=\"t4\" class=\"form-control\" placeholder=\"DD/MM/YYYY\"  required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"t5\" value=\"male\" checked=\"checked\" >M\n");
      out.write("                        <input type =\"radio\" name=\"t5\" value=\"female\">F\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Qualification</td>\n");
      out.write("                                <td>\n");
      out.write("                                        <select  class=\"form-control\" name=\"t6\">\n");
      out.write("                                            <option value=\"B.Tech.\">B.Tech</option>\n");
      out.write("                                            <option value=\"M.Tech.\">M.Tech</option>\n");
      out.write("                                            <option value=\"PHD\">PHD</option>\n");
      out.write("                                        </select>\n");
      out.write("                                </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Branch</td>\n");
      out.write("                                <td>\n");
      out.write("                                        <select  class=\"form-control\" name=\"t7\">\n");
      out.write("                                        <option value=\"CS\">Computer Science</option>\n");
      out.write("                                        <option value=\"IT\">Information Technology</option>\n");
      out.write("                                        <option value=\"EC\">Electronics and Communication Engg.</option>\n");
      out.write("                                        <option value=\"OS\">Other</option>\n");
      out.write("                                        </select>\n");
      out.write("                                </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td>Organization</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t8\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>AICTE Approved</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"t9\" value=\"Yes\" checked=\"checked\">Yes\n");
      out.write("                        <input type =\"radio\" name=\"t9\" value=\"No\">No\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Designation</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t10\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <td>Work Experience/Semester</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t11\" class=\"form-control\" /></td>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t12\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>City</td>\n");
      out.write("                                <td><input type=\"text\" name=\"t13\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Pin Code</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"t14\" class=\"form-control\" maxlength=\"6\" placeholder=\"Zip code\" pattern=\"[1-9]{1}[0-9]{5}\" title=\"Pin Code\" />\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Mobile Number</td>\n");
      out.write("                        <td><input type=\"text\" id=\"mob\"  name=\"t15\"  class=\"form-control\"  maxlength=\"10\" pattern=\"[1-9]{1}[0-9]{9}\" title=\"Enter Phone Number\" placeholder=\"Mobile Number\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" name=\"t16\" class=\"form-control\" placeholder=\"Email\" required  />\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                                <td><input type=\"password\" name=\"t17\" class=\"form-control\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Accommodation</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"t18\" value=\"Yes\" checked=\"checked\">Yes\n");
      out.write("                        <input type =\"radio\" name=\"t18\" value=\"No\">No\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Type</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"radio\" name =\"t19\" value=\"student\" checked=\"checked\">Student\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\"> <input type=\"checkbox\" onclick=\"tncaccept(this.checked);\" >I accept all the terms and condition</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                                <td colspan=\"2\" align=\"right\">\n");
      out.write("                                <input type=\"submit\" id=\"sub\" value=\"Register Me\" class=\"btn btn-success btn-lg\" name=\"btn_reg\" disabled />\n");
      out.write("                                <input type=\"reset\" value=\"Reset\" class=\"btn btn-danger btn-lg\" name=\"btn_reg\" />\n");
      out.write("                                </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </table>\n");
      out.write("                        ");

                        if(request.getParameter("btn_reg")!=null)
                        {
                                String name,fathername,mothername,dob,gender,qualification,branch,organisation,aicte,designation,workexperience,address,city,pincode,mobile,email,password,accomodation, utype;
                                name=request.getParameter("t1");
                                fathername=request.getParameter("t2");
                                mothername=request.getParameter("t3");
                                dob=request.getParameter("t4");
                                gender=request.getParameter("t5");
                                qualification=request.getParameter("t6");
                                branch=request.getParameter("t7");
                                organisation=request.getParameter("t8");
                                aicte=request.getParameter("t9");
                                designation=request.getParameter("t10");
                                workexperience=request.getParameter("t11");
                                address=request.getParameter("t12");
                                city=request.getParameter("t13");
                                pincode=request.getParameter("t14");
                                mobile=request.getParameter("t15");
                                email=request.getParameter("t16");
                                password=request.getParameter("t17");
                                accomodation=request.getParameter("t18");
                                utype=request.getParameter("t19");
                                try{
                                        Class.forName("com.mysql.jdbc.Driver");	
                                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                                        Statement st=con.createStatement();
                                        String sql="insert into xyz values('"+name+"','"+fathername+"','"+mothername+"','"+dob+"','"+gender+"','"+qualification+"','"+branch+"','"+organisation+"','"+aicte+"','"+designation+"','"+workexperience+"','"+address+"','"+city+"','"+pincode+"','"+mobile+"','"+email+"','"+password+"','"+accomodation+"','"+utype+"')";
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
                        
      out.write(" \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
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
