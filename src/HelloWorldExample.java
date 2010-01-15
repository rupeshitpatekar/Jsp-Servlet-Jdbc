import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorldExample extends HttpServlet {
/***
 * Basic Servlet implemented
 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        out.println("<html>");
        out.println("<head>");
        out.println("HTML to Servlet");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("Thanks  Mr." + "  " + name + "  " + "for visiting india<br>");
        out.println("Now you can see your password : " + "  " + pass + "<br>");
        String Name = request.getParameter("Name");
        out.println("Hi from servlet");
        out.println(Name);
        out.println("</body>");
        out.println("</html>");
    }
}