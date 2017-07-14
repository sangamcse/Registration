<%-- 
    Document   : imageshow
    Created on : 2 Jul, 2017, 7:36:00 AM
    Author     : Amit
--%>

        <%@page import="java.sql.*"%>
<%
            
            String str = session.getAttribute("UserName").toString();
            
            try
                {
                    
            
                    Class.forName("com.mysql.jdbc.Driver");	
                    
                    ResultSet res=st.executeQuery("select * from img where email='"+str+"'");
                   
                    while(res.next())
                        {
                            
                            str=res.getString("str");
            %>
                <div>
                    <img src="image/<%=str%>">
                    <h2><%=str%></h2>
                </div>
            <%
                        }
                }
                    catch(Exception ex)
                        {
                            ex.printStackTrace();

                        }
            %>
    