<%-- 
    Document   : invntory_select
    Created on : 2018/01/11, 10:47:26
    Author     : uenotakuro
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="JDBC.Goods"%>
<%@page import="JDBC.inventory_select"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ArrayList<Goods> Goodslist = (ArrayList<Goods>) request.getAttribute("DATA");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/jdbc/inventory_select" method="post">

            <table>
                <caption>商品一覧</caption>
                <thead style="background:#ffccff">
                    <tr>
                        <th><big>商品ID</big></th>
                <th><big>在庫</big></th>
                <th><big>商品名</big></th>
                <th><big>価格</big></th>
                </tr>
                </thead>
               
                    <%
                        
                        for(int i=0; i<Goodslist.size(); i++ ) {
                        out.print("<tr>");     
                        out.print("<td> " + Goodslist.get(i).getGoodsID() + "</td>");
                        out.print("<td>" + Goodslist.get(i).getInventory() + "</td>");
                        out.print("<td>" + Goodslist.get(i).getGoodsName()+ "</td>");
                        out.print("<td>" + Goodslist.get(i).getGoodsPrice()+ "</td>");
                        out.print("</tr>");  
                        }
                        
                    %>
               
            </table>

            <p><a href="/jdbc/Logout">ログアウト</a></p>

        </form>
    </body>
</html>
