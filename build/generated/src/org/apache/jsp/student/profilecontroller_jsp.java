package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import org.apache.commons.fileupload.FileItem;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.io.File;

public final class profilecontroller_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

 
        
            String str = session.getAttribute("UserName").toString();
            String email = session.getAttribute("UserName").toString();
            Connection con;
            Statement stm;
        File file;
        int maxSize=300000;
        int maxFactSize=300000;
        String path="/Users/sangamkumar/Desktop/java/Registration/web/student/image";
        
      out.write("\n");
      out.write("        ");

        String type = request.getContentType();
        out.println(type);
        if(type.indexOf("multipart/form-data")>=0)
        {
        out.print("its a multipart data");
        DiskFileItemFactory disFact=new DiskFileItemFactory();
        disFact.setSizeThreshold(maxFactSize);
        disFact.setRepository(new File("/Users/sangamkumar/Desktop/java/Registration/web/student/image"));
        ServletFileUpload upload=new ServletFileUpload(disFact);
        upload.setSizeMax(maxSize);
        List lis=upload.parseRequest(request);
        Iterator itr=lis.iterator();
        while(itr.hasNext())
        {
           
            FileItem item=(FileItem)itr.next();
            out.println(item.isFormField());
            if(!item.isFormField()){
                str=item.getName();
            str=str+(str.substring(str.indexOf(".")));
            out.print(str);
            file=new File(path,str);
            item.write(file);
            out.println("Uploaded");
        }
        }
        }
        
        
            try
                {
                   
                    Class.forName("com.mysql.jdbc.Driver");	
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    stm=con.createStatement();
                    String query="insert into img values('"+email+"','"+str+"')";
                  int res=stm.executeUpdate(query);
		if(res!=0)
			out.println("<br>Record Inserted");
		else
			out.println("<br>Record Not Inserted");
}
catch(Exception e)
{
e.printStackTrace();
}
   
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
