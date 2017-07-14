package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class record_005fupdate_005fquery1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <script src=\"script/jquery.min.js\"></script>\r\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-2 \">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-8 \">\r\n");

	String id=request.getParameter("id");
	try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("select * from xyz where email='"+id+"'");
	rs.next();
	
      out.write("\r\n");
      out.write("\t<form action=\"\" method=\"post\"  role=\"form\" >\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>email</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("                    <input type=\"text\" name=\"t1\" value=\"");
      out.print(rs.getString(16) );
      out.write("\" readonly=\"true\" />\r\n");
      out.write("                </td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t2\" value=\"");
      out.print(rs.getString(1) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Father Name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t3\" value=\"");
      out.print(rs.getString(2) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Mother Name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t4\" value=\"");
      out.print(rs.getString(3) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Date of Birth</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t5\" value=\"");
      out.print(rs.getString(4) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Gender</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t6\" value=\"");
      out.print(rs.getString(5) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Qualification</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t7\" value=\"");
      out.print(rs.getString(6) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Branch</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t8\" value=\"");
      out.print(rs.getString(7) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Organisation</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t9\" value=\"");
      out.print(rs.getString(8) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>AICTE Approved</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t10\" value=\"");
      out.print(rs.getString(9) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Designation</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t11\" value=\"");
      out.print(rs.getString(10) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Work Experience</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t12\" value=\"");
      out.print(rs.getString(11) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Address</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t13\" value=\"");
      out.print(rs.getString(12) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>City</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t14\" value=\"");
      out.print(rs.getString(13) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Pincode</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t15\" value=\"");
      out.print(rs.getString(14) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Mobile Number</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t16\" value=\"");
      out.print(rs.getString(15) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Password</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t17\" value=\"");
      out.print(rs.getString(17) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Accomodation</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t18\" value=\"");
      out.print(rs.getString(18) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>User Type</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t19\" value=\"");
      out.print(rs.getString(19) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td><input type=\"submit\" value=\"Update\" name=\"btn_update\" class=\"btn btn-success\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td cospan=\"2\">\r\n");
      out.write("\t");

	if(request.getParameter("btn_update")!=null)
	{
		Class.forName("com.mysql.jdbc.Driver");	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","");
		st=con.createStatement();
		String name,fathername,mothername,dob,gender,qualification,branch,organisation,aicte,designation,workexperience,address,city,pincode,mobile,email,password,accomodation,stud;
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
        stud=request.getParameter("t19");
		String sq="update xyz set name='"+name+"',fathername='"+fathername+"',mothername='"+mothername+"',dob='"+dob+"',gender='"+gender+"',qualification='"+qualification+"',branch='"+branch+"',organisaton='"+organisation+"',aicte='"+aicte+"',designation='"+designation+"',workexperience='"+workexperience+"',address='"+address+"',city='"+city+"',pincode='"+pincode+"',mobile='"+mobile+"',email='"+email+"',password='"+password+"',accomodation='"+accomodation+"',stud='"+stud+"')";
              int res=st.executeUpdate(sq);
		if(res!=0)
			response.sendRedirect("update.jsp");
	}		
	
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</form>\t\t\t\r\n");
      out.write("\t");

	}catch(Exception e)
	{
		out.println(e.toString());
	}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-2 \">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
