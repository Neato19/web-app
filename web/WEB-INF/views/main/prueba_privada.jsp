<%-- 
    Document   : prueba
    Created on : 15 mar. 2022, 8:54:22
    Author     : Iván Martínez Sánchez -  ivanmasan@outlook.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WEB-APP-PRIVADA</title>
    </head>
    <body>
        <h1>Tsuchigomori</h1>
        <img src="public/<%= session.getId() %>/img/imagen1.jpg" alt="alt"/>
    </body>
</html>
