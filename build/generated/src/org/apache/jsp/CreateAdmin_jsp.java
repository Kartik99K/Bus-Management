package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: -webkit-linear-gradient(left, #ff4d88, #ff8c1a);\n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .para{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 50px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form1{\n");
      out.write("                height: 400px;\n");
      out.write("\t\twidth: 300px;\n");
      out.write("\t\tpadding: 25px;\n");
      out.write("\t\tbackground: transparent;\n");
      out.write("\t\tdisplay: flex;\n");
      out.write("\t\talign-items: center;\n");
      out.write("\t\tflex-direction: column;\n");
      out.write("\t\tbox-shadow: 2px 2px 22px 8px #000;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .ip1{\n");
      out.write("                outline: none;\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: #000;\n");
      out.write("                padding: .3em;\n");
      out.write("                margin: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                border: none;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                display: block;\n");
      out.write("                background: #fff;\n");
      out.write("                -webkit-border-radius: 2px;\n");
      out.write("                -moz-border-radius: 2px;\n");
      out.write("\t\t-o-border-radius: 2px;\n");
      out.write("\t\t-ms-border-radius: 2px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .ip1:focus {\n");
      out.write("               \n");
      out.write("                padding: 10px;\n");
      out.write("\t\tbox-shadow: 10px 10px 10px #00cc00;\n");
      out.write("\t\t\n");
      out.write("\t\t/*transform:translate(0px,-10px);*/\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn1{\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: #fff;\n");
      out.write("                background: #00cc00;\n");
      out.write("                border: 1px solid #00cc00;\n");
      out.write("                outline: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 8px;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn2{\n");
      out.write("\t\tfont-size: 1em;\n");
      out.write("                color: #fff;\n");
      out.write("                background: #ff1a1a;\n");
      out.write("                border: 1px solid #ff1a1a;\n");
      out.write("                outline: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 8px;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn1:hover {\n");
      out.write("                background: transparent;\n");
      out.write("                color: #00cc00;  \n");
      out.write("\t\ttransition: 0.5s all ;\n");
      out.write("                -webkit-transition: 0.5s all;\n");
      out.write("                -moz-transition: 0.5s all;\n");
      out.write("                -o-transition: 0.5s all;\n");
      out.write("                -ms-transition: 0.5s all;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn2:hover {\n");
      out.write("                background: transparent;\n");
      out.write("                color: #ff1a1a;  \n");
      out.write("\t\ttransition: 0.5s all ;\n");
      out.write("                -webkit-transition: 0.5s all;\n");
      out.write("                -moz-transition: 0.5s all;\n");
      out.write("                -o-transition: 0.5s all;\n");
      out.write("                -ms-transition: 0.5s all;\n");
      out.write("            }    \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <p class=\"para\">Add Data</p></div>\n");
      out.write("        <div class=\"form1\">\n");
      out.write("            <form action=\"ServletLogin\" method=\"POST\">\n");
      out.write("                <p>Bus-Id:\n");
      out.write("                    <input type=\"text\" name=\"b\" class=\"ip1\">\n");
      out.write("                </p>    \n");
      out.write("                    \n");
      out.write("                <p>Driver Name:\n");
      out.write("                    <input type=\"text\" name=\"dn\" class=\"ip1\">\n");
      out.write("                </p>\n");
      out.write("                    \n");
      out.write("                <p>\n");
      out.write("                    Driver Number:\n");
      out.write("                    <input type=\"text\" name=\"dno\" class=\"ip1\">\n");
      out.write("                </p>    \n");
      out.write("                 \n");
      out.write("                <p>\n");
      out.write("                    Routes:\n");
      out.write("                    <input type=\"text\" name=\"r\" class=\"ip1\"> \n");
      out.write("                </p>    \n");
      out.write("                    \n");
      out.write("                <p>\n");
      out.write("                   Pick-Up points:\n");
      out.write("                   <input type=\"text\" name=\"p\" class=\"ip1\">    \n");
      out.write("                </p>    \n");
      out.write("                <input type=\"submit\" value=\"Submit\" class=\"btn1\"><input type=\"reset\" value=\"Reset\" class=\"btn2\">\n");
      out.write("        </div>    \n");
      out.write("                \n");
      out.write("    </form>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
