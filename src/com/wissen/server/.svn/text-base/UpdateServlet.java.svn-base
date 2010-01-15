package com.wissen.server;
/*
  MyWebApp
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Rupehsit Patekar
 * on 08-Jan-2010 12:34:52 PM
 *
 */

/**
 * @author Rupeshit Patekar
 * LoginServlet.java
 * 08-Jan-2010
 */
import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet {

    String            username = "root";

    String            password = "wissen";

    Connection        con      = null;

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
     * To retrieve data from database and send it to UpdateInfo.jsp or UpdateError.jsp page
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        String lname = req.getParameter("lname");
        String fname = req.getParameter("fname");
        try {
            //TO get one record from db
            String query = "update Account set fname='" + fname + "',lname='" + lname + "',pwd='" + pwd + "',cpwd='" + pwd + "' where uname='"
                    + uname + "'";
            System.out.println(query);
            PreparedStatement stmt = con.prepareStatement(query);
            int i = stmt.executeUpdate(query);

            if (i > 0) {

                req.setAttribute("fname", fname);

                RequestDispatcher rd = req.getRequestDispatcher("/UpdateInfo.jsp");
                rd.forward(req, resp);

            } else {
                RequestDispatcher rd = req.getRequestDispatcher("/UpdateError.jsp");
                rd.forward(req, resp);
            }

        } catch (Exception e) {
            System.out.println("Err : " + e);
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
