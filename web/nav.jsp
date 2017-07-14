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
                <a class="navbar-brand page-scroll" href="#first"><i class=""><img src="img/Welcome.png" height="25" width="auto"></i> (ES)<sup>2</sup>AD</a>
            </div>
            <div class="navbar-collapse collapse" id="bs-navbar">
                <ul class="nav navbar-nav">
                    <li>
                        <a class="page-scroll" href="#aboutModal">Intro</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#gallery">Gallery</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#feature">Features</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#last">Contact</a>
                    </li>
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" data-toggle="modal" title="Login" href="#login">Register/Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
<%@include file="script.jsp" %>
