package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"include/json2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"quiz.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"includes/quiz_ajax_json.js\"></script>\n");
      out.write("             \n");
      out.write("  \n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"cherylname\">Welcome ");
      out.print(session.getAttribute("userName"));
      out.write(" !!!</h1>\n");
      out.write("        <form onSubmit=\"return false\" id=\"quizForm\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("<div class=\"WholeQuestion\">\n");
      out.write("\t<div class=\"Question\">\n");
      out.write("          1. At the end of a banquet 10 people shake hands with each other. How many handshakes will there be in total?  \n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ans\">\n");
      out.write("\t\t<input type=\"radio\" name=\"question1\" value=\"1\" /> 100\n");
      out.write("\t\t<input type=\"radio\" name=\"question1\" value=\"2\" /> 20\n");
      out.write("\t\t<input type=\"radio\" name=\"question1\" value=\"3\" /> 45\n");
      out.write("                <input type=\"radio\" name=\"question1\" value=\"4\" /> 50\n");
      out.write("                <input type=\"radio\" name=\"question1\" value=\"5\" /> 90\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"Result\" id=\"q1Result\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"WholeQuestion\">\n");
      out.write("\t<div class=\"Question\">\n");
      out.write("            2. The day before the day before yesterday is three days after Saturday. What day is it today?\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ans\">\n");
      out.write("\t\t<input type=\"radio\" name=\"question2\" value=\"1\" /> Monday\n");
      out.write("\t\t<input type=\"radio\" name=\"question2\" value=\"2\" /> Tuesday\n");
      out.write("\t\t<input type=\"radio\" name=\"question2\" value=\"3\" /> Wednesday\n");
      out.write("                <input type=\"radio\" name=\"question2\" value=\"4\" /> Thursday\n");
      out.write("                <input type=\"radio\" name=\"question2\" value=\"5\" /> Friday\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"Result\" id=\"q2Result\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"WholeQuestion\">\n");
      out.write("\t<div class=\"Question\">\n");
      out.write("            3. Select the number that best completes the analogy\n");
      out.write("            10 : 6 :: 3 : ?\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ans\">\n");
      out.write("\t\t<input type=\"radio\" name=\"question3\" value=\"1\" /> 2\n");
      out.write("\t\t<input type=\"radio\" name=\"question3\" value=\"2\" /> 1\n");
      out.write("\t\t<input type=\"radio\" name=\"question3\" value=\"3\" /> -1\n");
      out.write("                <input type=\"radio\" name=\"question3\" value=\"4\" /> 12\n");
      out.write("                <input type=\"radio\" name=\"question3\" value=\"5\" /> 4\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"Result\" id=\"q3Result\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"WholeQuestion\">\n");
      out.write("\t<div class=\"Question\">\n");
      out.write("            4. Which number should come next in the series?\n");
      out.write("            1, 3, 6, 10, 15,\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ans\">\n");
      out.write("\t\t<input type=\"radio\" name=\"question4\" value=\"1\" /> 8\n");
      out.write("\t\t<input type=\"radio\" name=\"question4\" value=\"2\" /> 11\n");
      out.write("\t\t<input type=\"radio\" name=\"question4\" value=\"3\" /> 24\n");
      out.write("                <input type=\"radio\" name=\"question4\" value=\"4\" /> 21\n");
      out.write("                <input type=\"radio\" name=\"question4\" value=\"5\" /> 27\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"Result\" id=\"q4Result\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"WholeQuestion\">\n");
      out.write("\t<div class=\"Question\">\n");
      out.write("            5. Library is to book as book is to\n");
      out.write("                Binding, Copy, Page, Cover\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ans\">\n");
      out.write("\t\t<input type=\"radio\" name=\"question5\" value=\"1\" /> page\n");
      out.write("\t\t<input type=\"radio\" name=\"question5\" value=\"2\" /> copy\n");
      out.write("\t\t<input type=\"radio\" name=\"question5\" value=\"3\" /> binding\n");
      out.write("                <input type=\"radio\" name=\"question5\" value=\"4\" /> cover\n");
      out.write("                <input type=\"radio\" name=\"question5\" value=\"5\" /> book\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"Result\" id=\"q5Result\"></div>\n");
      out.write("        \n");
      out.write("</div>  \n");
      out.write("            <div class=\"score\" id=\"score\"></div>\n");
      out.write("    <br />\n");
      out.write("    \n");
      out.write("    <div class=\"chkanswer\">   \n");
      out.write("        <input type=\"button\" class=\"btn btn-success\" name=\"Submit\" value=\"Check Answers\" onClick=\"EvalQuiz();\" /></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
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
