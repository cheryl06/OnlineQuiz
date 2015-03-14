package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"include/json2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"quiz.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function EvalLogin(){\n");
      out.write("                //getting the username and password entered in the text box \n");
      out.write("        var userName = document.getElementById(\"user\").value;\n");
      out.write("        var userPass = document.getElementById(\"pass\").value;\n");
      out.write("       \n");
      out.write("        var logStr = \"'\"+userName +\", \"+ userPass+\"'\";\n");
      out.write("        \n");
      out.write("        var xmlhttp = new XMLHttpRequest();\n");
      out.write("        var url = \"ValidLogin\"; //targetted to ValidLogin.java\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        xmlhttp.onreadystatechange = function() {\n");
      out.write("           \n");
      out.write("            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\n");
      out.write("                  // this would deal with what was sent as a JSON object\n");
      out.write("                var myArr = JSON.parse(xmlhttp.responseText);\n");
      out.write("               \n");
      out.write("                myFunction(myArr);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        xmlhttp.open(\"POST\", url, true);\n");
      out.write("        var params = \"up=\" + logStr;\n");
      out.write("        \n");
      out.write("        xmlhttp.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\n");
      out.write("        xmlhttp.setRequestHeader(\"Content-length\", params.length);\n");
      out.write("        xmlhttp.setRequestHeader(\"Connection\", \"close\");        \n");
      out.write("\n");
      out.write("        xmlhttp.send(params);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("     function myFunction(arr) {\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("  if (arr.Addresses.length) {\n");
      out.write("           //if credentials match display showQuiz.jsp\n");
      out.write("                document.getElementById(\"result2\").innerHTML = \"\" ;\n");
      out.write("        window.location = \"showQuiz.jsp\" ;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("    else {\n");
      out.write("        //else would say Invalid credentials\n");
      out.write("        document.getElementById(\"result2\").innerHTML = \"Invalid credentials\" ;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        <h2>Please login to begin the test</h2>\n");
      out.write("        <form onSubmit=\"return false\" id=\"loginForm\">\n");
      out.write("                    \n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"result2\" style=\"color:red\"></div>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <strong> Username </strong>  \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    :\n");
      out.write("                </td>\n");
      out.write("                <td class=\"intro\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"user\" id=\"user\" />\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <strong>Password</strong>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    :\n");
      out.write("                </td>\n");
      out.write("                <td class=\"intro\">\n");
      out.write("                    <input class=\"form-control\"  type=\"password\" name=\"pass\" id=\"pass\" />\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td class=\"intro\">\n");
      out.write("                    <div id=\"button\">\n");
      out.write("                    <input type=\"button\" class=\"btn btn-primary\" name=\"sub\" value=\"Login\" id=\"sub\" onClick=\"EvalLogin();\" />\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
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
