<%-- 
    Document   : test
    Created on : Jul 4, 2017, 8:50:31 AM
    Author     : sangamkumar
--%>


<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
    </head>
    <body>
        <form>
            <button type="submit" name="b1"> Click me</button>
            <% 
                if(request.getParameter("b1")!=null){
                out.println("<input type='submit' name='t1'/>");
            }
            %>
            <input type ="file" name="picture">
        </form>
    </body>
</html>