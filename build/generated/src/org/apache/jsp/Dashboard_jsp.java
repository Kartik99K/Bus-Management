package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bms1.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <a href=\"a.html\">Home</a>\n");
      out.write("                <a href=\"b.html\">Bus-Info</a>\n");
      out.write("                <a href=\"c.html\">Driver-Info</a>\n");
      out.write("                <a href=\"#\">Contact Us</a>\n");
      out.write("                <a href=\"#\">About Us</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"profile\">\n");
      out.write("                <fieldset class=\"d1\">\n");
      out.write("                    <legend><img src=\"images/images (3).png\" class=\"img-src\"></legend>\n");
      out.write("                    ");
User u = (User)(session.getAttribute("u"));
      out.write("\n");
      out.write("                    <pre>Name: </pre>\n");
      out.write("                    <pre>Date Of Birth: ..........</pre>\n");
      out.write("                    <pre>Email: iamironman@gmail.com</pre>\n");
      out.write("                    <pre>Current Route: CHD-101</pre>\n");
      out.write("                    <pre>..............</pre>\n");
      out.write("                    <pre>..............</pre>\n");
      out.write("                    <pre>..............</pre>\n");
      out.write("                    <pre>..............</pre>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"pp\">\n");
      out.write("                    <p style=\"color: white;font-size: 20px;\">Our Social Media Links: </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"social-links\">      \n");
      out.write("                    <a href=\"#\"><img src=\"images/images.png\" class=\"social-img\"></a>\n");
      out.write("                    <a href=\"#\"><img src=\"images/images (1).png\" class=\"social-img\"></a>\n");
      out.write("                    <a href=\"#\"><img src=\"images/images (2).png\" class=\"social-img\"></a>\n");
      out.write("                    <a href=\"#\"><img src=\"images/images.jpg\" class=\"social-img\"></a>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"links\">\n");
      out.write("                    <p class=\"p1\"><a href=\"#\" class=\"p1\">Contact </a>|<a href=\"#\" class=\"p1\"> Blog </a>|<a href=\"#\" class=\"p1\"> Help </a>|\n");
      out.write("                    <a href=\"#\" class=\"p1\"> Feedback</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
