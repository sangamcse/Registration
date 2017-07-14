<%-- 
    Document   : connection
    Created on : Jul 5, 2017, 11:00:02 AM
    Author     : sangamkumar
--%>

                  <%@page import="java.sql.*"%>
                    <% 
                    String a=session.getAttribute("UserName").toString();
                    
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    %>