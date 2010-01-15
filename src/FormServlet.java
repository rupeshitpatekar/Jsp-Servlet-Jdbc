/*
  MyWebApp
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Rupehsit Patekar
 * on 04-Jan-2010 3:51:30 PM
 *
 */

/**
 * @author Rupeshit Patekar
 * FormServlet.java
 * 04-Jan-2010
 */
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {

  response.setContentType("text/html");
  java.io.PrintWriter out = response.getWriter();
  out.println("<html><head>");

  RequestDispatcher dispatcher = request
      .getRequestDispatcher("/WEB-INF/validate.js");

  dispatcher.include(request, response);

  out.println("<title>Help Page</title></head><body>");
  out.println("<h2>Please submit your information</h2>");

  out.println("<form action =\"" + request.getContextPath()
      + "/displayHeaders.jsp\" onSubmit=\" return validate(this)\">");

  out.println("<table border=\"0\"><tr><td valign=\"top\">");
  out.println("Your name: </td>  <td valign=\"top\">");
  out.println("<input type=\"text\" name=\"username\" size=\"20\">");
  out.println("</td></tr><tr><td valign=\"top\">");
  out.println("Your email: </td>  <td valign=\"top\">");
  out.println("<input type=\"text\" name=\"email\" size=\"20\">");
  out.println("</td></tr><tr><td valign=\"top\">");

  out.println("<input type=\"submit\" value=\"Submit Info\"></td></tr>");
  out.println("</table></form>");
  out.println("</body></html>");
  out.close();
}
}
