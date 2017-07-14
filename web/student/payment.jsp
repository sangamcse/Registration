<%-- 
    Document   : payment
    Created on : Jul 6, 2017, 12:54:25 PM
    Author     : sangamkumar
--%>

<%@page import="java.sql.*"%>
                    <% 
                    
                        
                            String a=session.getAttribute("UserName").toString();
                   
                            String amount = request.getParameter("course");
                            

                            try{
                                        Class.forName("com.mysql.jdbc.Driver");	
                                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/payment","root","");
                                        Statement st=con.createStatement();
                                        String sql="insert into pay values('"+a+"','"+amount+"')";
                                        int res=st.executeUpdate(sql);
                                        if(res!=0)
                                                response.sendRedirect("pay.jsp");
                                        else
                                                response.sendRedirect("course.jsp");
                                }catch(Exception e)
                                {
                                        out.println(e.toString());
                                }
                
                    %> 
    