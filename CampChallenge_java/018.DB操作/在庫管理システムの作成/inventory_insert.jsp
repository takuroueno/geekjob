    <%-- 
    Document   : inventory_insert
    Created on : 2018/01/11, 10:47:57
    Author     : uenotakuro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form action="/jdbc/inventory_insert" method="post">

            
            <big>  商品ID  </big> <input type="text" name="goodsID">
            <br>

            <big>  在庫  </big> <input type="text" name="inventory">
            <br>
            
            <big>  商品名  </big> <input type="text" name="goodsName">
            <br>
            
            <big>  価格  </big> <input type="text" name="goodsPrice">
            <br>
            
            <big>  <input type="submit" name="btnSubmit"> </big>
                       
            <input type="reset" VALUE="リセット">
            
            
            <p><a href="/jdbc/Logout">ログアウト</a></p>
            
            
        </form>    </body>
</html>
