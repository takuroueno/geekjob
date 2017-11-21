<%-- 
    Document   : for3
    Created on : 2017/11/21, 10:55:50
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
        <%
            
            int number =0;

            for (int i = 0; i < 100; i++) {
                number = i + number;
                
                
            out.println(number);
            }

        %>
    </body>
</html>
