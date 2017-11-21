<%-- 
    Document   : newjsp
    Created on : 2017/11/21, 10:39:22
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

            String hako = "A";

            for (int i = 1; i <= 30; i++) {
                hako = hako + "A";
            }
            out.println(hako);
        %>
    </body>
</html>
