<%-- 
    Document   : sisokuenzan
    Created on : 2017/11/16, 11:40:35
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

            final long BASE = 908;

            long num = 9023;
            long bom = 2328;

            out.println(num + bom);

            out.println(num * bom);

            out.println(num % bom);

            out.println(BASE + bom + num);

        %>  

    </body>
</html>

