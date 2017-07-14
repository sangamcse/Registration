<%-- 
    Document   : student
    Created on : Jul 2, 2017, 1:07:01 PM
    Author     : sangamkumar
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
    
</head>

<body>
    
        
                <div>
                       <% if(session.getAttribute("UserName")!=null)
                        {
                            
                            String un =(String)session.getAttribute("UserName"); %>
                            <jsp:include page="dashboard.jsp" />
                       <%
                         }
                         else
                         {
                            response.sendRedirect("../login.jsp");
                         }
                    %>
                </div>

                    
           
</body>
</html>
