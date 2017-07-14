<%-- 
    Document   : index
    Created on : Jul 1, 2017, 8:57:20 PM
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
    <%@include file="nav.jsp" %>
    <header id="first">
        <div class="header-content">
            <div class="inner">
                <h1 class="cursive">Summer Training Program</h1>
                <h4>Enhancing Skill For Enterprise Scale Application Development</h4>
                <hr>
                <a href="register.jsp" class="btn btn-primary btn-xl page-scroll">Register Now</a>
            </div>
        </div>
    </header>
    <section class="bg-primary" id="aboutModal">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 text-center" >
                    <h2 class="margin-top-0 text-primary">Core Java, Advanced Java, Design patterns,  Frameworks and Web Design</h2>
                    <br>
                    <p class="text-faded" style="text-align: justify;">
                        The training program is about making students learn developing software in Object 
                        Oriented way using Java Technology. Some features that are expected of object 
                        oriented development is flexibility, reusability, scalability, evolvability and 
                        maintainability of the applications. The training emphasizes at enhancing skill for 
                        developing web based applications modularized through the use of object oriented 
                        principles. The course will be taught through running examples and expected to culminate 
                        into developing a good enterprise scale application by students on their own. 
                    </p>
                    <a href="#brochure" data-toggle="modal" data-target="#brochure" class="btn btn-primary btn-xl page-scroll">View more</a>
                    
                </div>
            </div>
        </div>
    </section>
    <section id="gallery" class="no-padding">
        <%@include file="file/gallery.jsp" %>
    </section>
    <section class="container-fluid" id="feature">
        <%@include file="file/feature.jsp" %>
    </section>
    
    <section id="last">
        <%@include file="last.jsp" %>
    </section>
    
    
    <footer id="footer">
        <%@include file="footer.jsp" %>
    </footer>
    
    
        <%@include file="galleryModal.jsp" %>
    <%@include file="popup.jsp" %>
    <%@include file="alertModal.jsp" %>
    
    <%@include file="brochure.jsp" %>
        <%@include file="script.jsp" %>

</body>
</html>

