/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;


import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author uenotakuro
 */
public class inventory_select extends HttpServlet {
   
    Connection db_con = null;
    //link url
    final String result = "/inventory_select.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");
            

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/inventory", "takuro", "ueno");

           
            //select
            PreparedStatement db_st = null;
            db_st = db_con.prepareStatement("select * from inventory");
                

            ResultSet db_data = null;
            db_data = db_st.executeQuery();

            
            ArrayList<Goods> Goodslist = new ArrayList<Goods>();

            

            
            while (db_data.next()) {
                int goodsID = db_data.getInt("goodsID");
                int inventory = db_data.getInt("inventory");
                String goodsName = db_data.getString("goodsName");
                int goodsPrice = db_data.getInt("goodsPrice");

                String total = goodsID + inventory + goodsName + goodsPrice;
    
                // リクエストスコープへの値の格納
                //  1つ目の引数：格納する値につけた名前
                //  2つ目の引数：実際に格納する値
                
                Goods data = new Goods();
                data.setGoodsID(goodsID);
                data.setInventory(inventory);
                data.setGoodsName(goodsName);
                data.setGoodsPrice(goodsPrice);
                
                Goodslist.add(data);
            }
            
                request.setAttribute("DATA",Goodslist);
            
                RequestDispatcher rd = request.getRequestDispatcher(result);
                rd.forward(request, response);
                        
            
            
            db_data.close();
            db_st.close();
            db_con.close();
            
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
