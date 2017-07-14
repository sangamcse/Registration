<%-- 
    Document   : newjsp
    Created on : 1 Jul, 2017, 11:28:51 PM
    Author     : Amit
--%>
<%@ page import="java.sql.*" %>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
 
        
            String str = session.getAttribute("UserName").toString();
            String email = str;
            Connection con;
            Statement stm;
        File file;
        int maxSize=300000;
        int maxFactSize=300000;
        String path="/Users/sangamkumar/Desktop/java/Registration/web/student/image";
        %>
        <%
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
            str=email+(str.substring(str.indexOf(".")));
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
   
        %>
        
    </body>
</html>
