<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
    <%@include file="file/header.jsp" %>
        <script type="text/javascript">
		function tncaccept(v)
		{
			s=document.getElementById("sub");
			if (v==true){
				s.disabled=false;
			}
			else{
				s.disabled=true;
			}
		}
	</script>
        <style>
            .container{
                             
              font-size: 24;
            }
            
            
        </style>
</head>


<body>
    <%-- 
    Document   : nav
    Created on : Jul 2, 2017, 11:28:04 AM
    Author     : sangamkumar
--%>
<script src="js/bootstrap.min.js"></script>
    <nav id="topNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="index.jsp#first"><i class=""><img src="img/Welcome.png" height="25" width="auto"></i> (ES)<sup>2</sup>AD</a>
            </div>
            <div class="navbar-collapse collapse" id="bs-navbar">
                <ul class="nav navbar-nav">
                    <li>
                        <a class="page-scroll" href="index.jsp#aboutModal">Intro</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.jsp#gallery">Gallery</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.jsp#feature">Features</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="index.jsp#last">Contact</a>
                    </li>
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" title="Login" href="login.jsp">Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <%@include file="script.jsp" %>

    <br>
    <section id="last" >
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
                    <h2 class="margin-top-0 wow fadeIn">Forgot Password?</h2>
                    
                    
                </div>
                <div class="col-sm-8 col-lg-offset-1 text-center">
                    <form role="form" method="get" action="">
                      <div class="form-group" >
                       <div class="margin-top-0 wow fadeIn">
                          <label for="t1">User Name &nbsp&nbsp&nbsp&nbsp</label>
                        <input type="text" class="form-control" id="a1" name="a1" placeholder="Enter User Name">
                      </div>
                      </div>
                                <br>  <br><input type="submit" class="btn btn-primary" value="Submit" />
                                <%
                                    if(request.getParameter("a1")!=null)
                                    {
                                        String un=request.getParameter("a1");
                                        boolean flag=false;
                            try{
                                    Class.forName("com.mysql.jdbc.Driver");	
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                                    Statement st=con.createStatement();
                                    ResultSet rs=st.executeQuery("select * from xyz where email='"+un+"'");
                                    if(rs.next())
                                    {
                                        flag=true;
                                %>
                                <table>
                                        <tr>
                                            <td><%=rs.getString(17) %></td>
                                        </tr>
                                        </table>
                                <%
                                    }


                                    }
                        catch(Exception e)
                            {
                                    out.println(e.toString());
                            }
                                    }
                        %>
                    </form>
                    </div>
            </div>
        </div>
    </section>
                        <%@include file="script.jsp" %>
</body>
</html>

