<%-- 
    Document   : paying.jsp
    Created on : Jul 6, 2017, 1:38:09 PM
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
    <%@include file="connection.jsp" %>
<div class="wrapper">
    
    <div class="sidebar" data-color="purple" data-image="img/sidebar-5.jpg">
    <!--
        Tip 1: you can change the color of the side bar using: data-color="blue | azure | green | orange | red | purple"
        Tip 2: you can also add an image using data-image tag
    -->
    	<div class="sidebar-wrapper">
            <div class="logo">
               <a href="dashboard.jsp" class="simple-text">
                    HOME
                </a>
            </div>

            <ul class="nav">
                <li class="active">
                    <a href="dashboard.jsp">
                        <i class="pe-7s-graph"></i>
                        <p>Dashboard</p>
                    </a>
                </li>
                <li>
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
                  
                    <a class="navbar-brand" >Dashboard</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        
                       
                        
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                           <a href="dashboard.jsp">
                               <p>Account</p>
                            </a>
                        </li>
                        <li>
                           <a href="web/index.php">
                               <p>Chat Room</p>
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
                        <div class="card">
                            <div class="header">
                                <h4>Check Your Information..</h4>
                            
                            <div class="content">
                                <div class="header col-lg-8 center-block">
                                    <br/><br/>
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
                                            
                                            <%
                                                rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                                                while(rs.next()){
                                                %>
                                              <h4 class="title">User Name: <%=rs.getString("name") %><br />
                                                 <small>Email: <%=rs.getString("email") %></small><br />
                                                 <small>Designation: <%=rs.getString("designation") %> </small><br> <% } %>
                                                 </h4>
                                              <br/><br/>
                                                 <div class="col-md-4 center-block">
                                                     <a href="course.jsp"><button class="btn btn-danger">Cancel</button></a>
                                                 </div>
                                                 <div class="col-md-4 center-block">
                                                     <a href="payment.jsp"><button class="btn btn-success">Pay Now</button></a>
                                                     <% session.getAttribute("amount"); %>
                                                 </div>

                                        </div>
                                                 



                            </div>
                                    </div>
                                                 
                                </div>
                                
                            </div>
                            
                        </div>
                        
                    </div>
                                                 <br/><br/><br/>
                    <div class="col-md-12 text-center typo-line">
                    <span class="text-muted small">(ES)<sup>2</sup>AD | CSED, MNNIT Allahabad ©2017</span>

                    </div>

                </div>
            </div>
        </div>
       
   


    <%@include file="script.jsp" %>
        
 </body>
</html>
