/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;   
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author uenotakuro
 */
public class Login extends HttpServlet {

    Connection db_con = null;

    // ログイン成功ページに forward する
    final String result_OK = "/inventoryform.jsp";
 /* 認証に失敗したら、ログイン画面に戻す */
    final String result_NG = "/loginform.jsp";

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String formuserID = request.getParameter("userID");
        String formpass = request.getParameter("pass");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            HttpSession session = request.getSession(true);

            boolean check = authUser(formuserID, formpass);
            if (check) {
                /* 認証済みにセット */
                session.setAttribute("login", "OK");
                 // ログイン成功ページに forward する
                RequestDispatcher rd = request.getRequestDispatcher(result_OK);
                rd.forward(request, response);

            } else {
                /* 認証に失敗したら、ログイン画面に戻す */
                session.setAttribute("status", "Not Auth");

                //ログイン失敗ページに forward する
                RequestDispatcher rd = request.getRequestDispatcher(result_NG);
                rd.forward(request, response);

            }
        } catch (Exception e) {
            // ログイン失敗ページに forward する
            RequestDispatcher rd = request.getRequestDispatcher(result_NG);
            rd.forward(request, response);
        }
    }

    protected boolean authUser(String user, String pass) throws Exception {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/inventory", "takuro", "ueno");

        //select
        PreparedStatement db_st = null;
        db_st = db_con.prepareStatement("select * from login where userID=? and pass=?");
        db_st.setString(1, user);
        db_st.setString(2, pass);

        ResultSet db_data = null;
        db_data = db_st.executeQuery();

        if (db_data.next()) {

            
        db_data.close();
        db_st.close();
        db_con.close();
            
            return true;

        } else {
            
        db_data.close();
        db_st.close();
        db_con.close();
            
            return false;
        }
        
   
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
