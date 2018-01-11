<%-- 
    Document   : inventory
    Created on : 2018/01/10, 15:44:24
    Author     : uenotakuro
--%>

<%@page import="JDBC.Login"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="/jdbc/inventory" method="post">
            
            
            <p><a href="/jdbc/inventory_select">商品一覧</a></p>

            
            <p><a href="/jdbc/inventory_insert.jsp">商品の追加</a></p>
            
       
            <p><a href="/jdbc/Logout">ログアウト</a></p>
            
         </form>
  
    </body>
</html>
