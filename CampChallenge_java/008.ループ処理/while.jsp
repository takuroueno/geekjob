<%-- 
    Document   : while
    Created on : 2017/11/21, 14:23:10
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

            long key = 1000;
            int count = 0;
            while (key>100) {
                key = key / 2;
                count++;

                out.println(key);
            }


        %>

    </body>
</html>
