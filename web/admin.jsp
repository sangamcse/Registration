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
    <%@include file="file/header.jsp" %>
</head>

<body>
    
        <div class="container">
            <div class="row">
                <div class="col-md-12 ">
                       <% if(session.getAttribute("UserName")!=null)
                        {
                            String un=(String)session.getAttribute("UserName"); %>
                            <jsp:include page="adminmenu.jsp" />
                       <%
                         }
                         else
                         {
                            response.sendRedirect("login.jsp");
                         }
                    %>
                </div>

                    
            </div>
        </div>
                
                        <%@include file="script.jsp" %>
</body>
</html>
