package org.apache.jsp.file;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row no-gutter\">\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"..img/img1.jpg\">\n");
      out.write("                        <img src=\"..img/img1.jpg\" class=\"img-responsive\" alt=\"Image 1\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"//splashbase.s3.amazonaws.com/getrefe/regular/tumblr_nqune4OGHl1slhhf0o1_1280.jpg\">\n");
      out.write("                        <img src=\"//splashbase.s3.amazonaws.com/getrefe/regular/tumblr_nqune4OGHl1slhhf0o1_1280.jpg\" class=\"img-responsive\" alt=\"Image 2\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"//splashbase.s3.amazonaws.com/unsplash/regular/photo-1433959352364-9314c5b6eb0b%3Fq%3D75%26fm%3Djpg%26w%3D1080%26fit%3Dmax%26s%3D3b9bc6caa190332e91472b6828a120a4\">\n");
      out.write("                        <img src=\"//splashbase.s3.amazonaws.com/unsplash/regular/photo-1433959352364-9314c5b6eb0b%3Fq%3D75%26fm%3Djpg%26w%3D1080%26fit%3Dmax%26s%3D3b9bc6caa190332e91472b6828a120a4\" class=\"img-responsive\" alt=\"Image 3\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-moto-drawing-illusion-nabeel-1440x960.jpg\">\n");
      out.write("                        <img src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-moto-drawing-illusion-nabeel-1440x960.jpg\" class=\"img-responsive\" alt=\"Image 4\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-new-york-crosswalk-nabeel-1440x960.jpg\">\n");
      out.write("                        <img src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-new-york-crosswalk-nabeel-1440x960.jpg\" class=\"img-responsive\" alt=\"Image 5\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                    <a href=\"#galleryModal\" class=\"gallery-box\" data-toggle=\"modal\" data-src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-clothes-exotic-travel-nabeel-1440x960.jpg\">\n");
      out.write("                        <img src=\"//splashbase.s3.amazonaws.com/lifeofpix/regular/Life-of-Pix-free-stock-photos-clothes-exotic-travel-nabeel-1440x960.jpg\" class=\"img-responsive\" alt=\"Image 6\">\n");
      out.write("                        <div class=\"gallery-box-caption\">\n");
      out.write("                            <div class=\"gallery-box-content\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"icon-lg ion-ios-search\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
