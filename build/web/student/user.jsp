<%-- 
    Document   : pay.jsp
    Created on : Jul 6, 2017, 1:09:37 PM
    Author     : sangamkumar
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <%@include file="header.jsp" %>
</head>

<body>
                    <% 
                    String a=session.getAttribute("UserName").toString();
                    
                    try{ 
                        Class.forName("com.mysql.jdbc.Driver");
                    	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    while(rs.next()){
                    %>
<div class="wrapper">
    <div class="sidebar" data-color="azure" data-image="img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="dashboard.jsp" class="simple-text">
                    HOME
                </a>
            </div>

            <ul class="nav">
                <li>
                    <a href="dashboard.jsp">
                        <i class="pe-7s-graph"></i>
                        <p>Dashboard</p>
                    </a>
                </li>
                <li class="active">
                    <a href="user.jsp">
                        <i class="pe-7s-user"></i>
                        <p>User Profile</p>
                    </a>
                </li>
                <li>
                    <a href="table.jsp">
                        <i class="pe-7s-note2"></i>
                        <p>Table List</p>
                    </a>
                </li>
                <li>
                    <a href="test.jsp">
                        <i class="pe-7s-news-paper"></i>
                        <p>Skill-Test</p>
                    </a>
                </li>
                <li>
                    <a href="download.jsp">
                        <i class="pe-7s-albums"></i>
                        <p>Study Materials</p>
                    </a>
                </li>
                <li >
                    <a href="course.jsp">
                        <i class="pe-7s-science"></i>
                        <p>COURSE</p>
                    </a>
                </li>
                
            
				
            </ul>
    	</div>
    </div>

    <div class="main-panel">
		<nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" >User</a>
                </div>
                <div class="collapse navbar-collapse">
                    
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                           <a href="dashboard.jsp">
                               <p>Account</p>
                            </a>
                        </li>
                       
                        <li>
                            <a href="../Logout.jsp">
                                <p>Log out</p>
                            </a>
                        </li>
						<li class="separator hidden-lg hidden-md"></li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    
                    <div class="col-md-12">
                        <div class="card card-user">
                            <div class="image">
                                <img src="https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400" alt="..."/>
                            </div>
                            <div class="content">
                                <div class="author">
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
                                                
                                            
                                    <img class="avatar border-gray" src="image/<%=str%>" >
                                    <%
                                                        }
                                                }
                                                    catch(Exception ex)
                                                        {
                                                            ex.printStackTrace();

                                                        }
                                            %>
                                    <h4>Upload Photo</h4>
                                    <p class="description text-center"><%@include file="upload.jsp" %></p>
                                    <%
                                        rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                                        while(rs.next()){
                                        %>
                                      <h4 class="title">User Name: <%=rs.getString("name") %><br />
                                         <small>Email: <%=rs.getString("email") %></small><br />
                                         <small>Designation: <%=rs.getString("designation") %> </small><br> <% } %>
                                         <%con = DriverManager.getConnection("jdbc:mysql://localhost:3326/payment","root","");
                                            st=con.createStatement();

                                            rs = st.executeQuery("SELECT * FROM pay WHERE email='"+a+"'");
                                            while(rs.next()){
                                             %>
                                             <small>Paid: <%=rs.getString("payment") %></small><% } %>
                                      </h4>
                                    
                                </div>
                                
                                                 
                               
                            </div>
                            <hr>
                            
                        </div>
                    </div>

                </div>
            </div>
        </div>


      

    </div>
</div>

    <%@include file="script.jsp" %>
                    <% 
                    
                    }
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                    %>
                   
</body>

    

</html>
