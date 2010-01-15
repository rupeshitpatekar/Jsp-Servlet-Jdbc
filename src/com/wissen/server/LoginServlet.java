package com.wissen.server;
/*
  MyWebApp
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Rupehsit Patekar
 * on 08-Jan-2010 12:34:52 PM
 *
 */

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Rupeshit
 * 
 *         Create Date : 09-Jan-2010
 */
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

    String            username = "root";

    String            password = "wissen";

    Connection        con      = null;

    ResultSet         rs       = null;

    PreparedStatement stmt     = null;

    String            url      = "jdbc:mysql://localhost:3306/northwind";

    PrintWriter       out      = null;

    /***
     * This method establish connection with database
     * 
     * @see javax.servlet.GenericServlet#init()
     */

    public void init() throws ServletException {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Connection Established");
            }
        } catch (Exception e) {
            System.out.println("Err" + e);
        }
    }

    /***
     * To retrieve data from database and send it to Update.jsp page
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("email");
        String pwd = req.getParameter("password");
        try {
            //TO get one record from db
            String query = "select * from Account where uname=" + uname + " and pwd=" + pwd;
            System.out.println(query);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                //	Store all content into the string
                String fname = rs.getString(1);
                String lname = rs.getString(2);
                String username = rs.getString(3);
                String userpwd = rs.getString(4);

                //To send request to jsp
                req.setAttribute("fname", fname);
                req.setAttribute("lname", lname);
                req.setAttribute("username", username);
                req.setAttribute("userpwd", userpwd);
                RequestDispatcher rd = req.getRequestDispatcher("/Update.jsp");
                rd.forward(req, resp);

            } else {
                resp.setContentType("text/html");
                PrintWriter out = resp.getWriter();
                out.println("<html>");
                out.println("<head><title>User not found</title></head>");
                out.println("<body>");
                out.println("<h1>Error :: User does not exists</h1>");
                out.print("<br><a href=Login.jsp>Home Page</a>");
                out.println("</body></html>");
            }

        } catch (Exception e) {
            System.out.println("Err : " + e.getMessage());
        }
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        super.destroy();
        try {
            con.close();

            stmt.close();
        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }

}
