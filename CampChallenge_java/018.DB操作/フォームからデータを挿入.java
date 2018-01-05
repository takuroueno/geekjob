/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author uenotakuro
 */
public class JDBC9 extends HttpServlet {

    Connection db_con = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");

            String formID = request.getParameter("ID");
            String formname = request.getParameter("name");
            String formtel = request.getParameter("tel");
            String formage = request.getParameter("age");
            String formbirthday = request.getParameter("birthday");

            int formI = Integer.parseInt(formID);
            int forma = Integer.parseInt(formage);

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JDBC9</title>");
            out.println("</head>");
            out.println("<body>");

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "takuro", "ueno");

            //insert
            PreparedStatement db_st = null;
            db_st = db_con.prepareStatement("insert into profiles(profileID,name,tel,age,birthday) values(?,?,?,?,?)");
            db_st.setInt(1, formI);
            db_st.setString(2, formname);
            db_st.setInt(3, forma);
            db_st.setString(4, formtel);
            db_st.setString(5, formbirthday);

            int num = db_st.executeUpdate();

            db_st.close();

            
            //select
            db_st = db_con.prepareStatement("select * from profiles");

            ResultSet db_data = null;
            db_data = db_st.executeQuery();

            while (db_data.next()) {
                int profileID = db_data.getInt("profileID");
                String name = db_data.getString("name");
                int age = db_data.getInt("age");
                String tel = db_data.getString("tel");
                String birthday = db_data.getString("birthday");

                String total = profileID + name + tel + age + birthday;
                out.println(total);
            }

            db_data.close();
            db_st.close();
            db_con.close();

            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (SQLException e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
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
