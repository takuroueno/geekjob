<%-- 
    Document   : login form
    Created on : 2018/01/09, 20:53:49
    Author     : uenotakuro
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログインページ</title>
    </head>
    <body>

        <form action="/jdbc/Login" method="post">
            
            <big>  ユーザーID  </big> <input type="text" name="userID">
            <br>

            <big>  パスワード  </big> <input type="text" name="pass">
            <br>

            <big>  <input type="submit" name="btnSubmit"> </big>
         
            <input type="reset" VALUE="リセット">
            
            <p><a href="/jdbc/Logout">ログアウト</a></p>

        </form>

    </body>
</html>
