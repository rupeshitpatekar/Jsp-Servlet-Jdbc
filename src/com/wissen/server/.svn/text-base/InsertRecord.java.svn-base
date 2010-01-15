package com.wissen.server;

/*
  MyWebApp
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Rupehsit Patekar
 * on 07-Jan-2010 4:19:29 PM
 *
 */

/**
 * @author Rupeshit Patekar
 * InsertRecord.java
 * 07-Jan-2010
 */
//import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@SuppressWarnings("serial")
public class InsertRecord extends HttpServlet {

    String            username = "root";

    String            password = "wissen";

    Connection        con      = null;

    ResultSet         rs       = null;

    PreparedStatement stmt     = null;

    String            url      = "jdbc:mysql://localhost:3306/northwind";

    PrintWriter       out      = null;

    /***
     * To establish connection
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
     * Insert record and call Insert.jsp page
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String fname = req.getParameter("firstname");
        String lname = req.getParameter("lastname");
        String uname = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String cpwd = req.getParameter("cpwd");

        try {
            out = resp.getWriter();
            stmt = con.prepareStatement("insert into Account values (?,?,?,?,?)");
            stmt.setString(1, fname);
            stmt.setString(2, lname);
            stmt.setString(3, uname);
            stmt.setString(4, pwd);
            stmt.setString(5, cpwd);

            int n = stmt.executeUpdate();
            if (n > 0) {
                RequestDispatcher rd = req.getRequestDispatcher("/Insert.jsp");
                rd.forward(req, resp);

                //resp.sendRedirect("Login.html");

                System.out.println("Inserted sucessfully!!!");
                System.out.println("First Name : " + fname);
                System.out.println("Last Name : " + lname);
                System.out.println("User Name: " + uname);
                System.out.println("Password : " + pwd);

            }
        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }

    public void destroy() {
        try {
            con.close();

            stmt.close();
        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }
}