package com.wissen.server;
/*
  MyWebApp
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Rupehsit Patekar
 * on 08-Jan-2010 5:39:48 PM
 *
 */

/**
 * @author Rupeshit Patekar
 * DeleteServlet.java
 * 08-Jan-2010
 */
import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DeleteServlet extends HttpServlet {

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
     * To retrieve data from database and send it to DeleteInfo.jsp or DeleteError.jsp page
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("username");

        try {
            //TO get one record from db
            String query = "delete from Account where uname='" + uname + "'";
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate(query);

            if (i > 0) {
                req.setAttribute("uname", uname);

                RequestDispatcher rd = req.getRequestDispatcher("/DeleteInfo.jsp");
                rd.forward(req, resp);
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("/DeleteError.jsp");
                rd.forward(req, resp);
            }

        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }
}
