<%-- 
    Document   : visita-landing
    Created on : 22 mar. 2022, 10:25:48
    Author     : Iván Martínez Sánchez - ivanmasan@outlook.com
--%>

<%@page import="org.japo.java.libraries.UtilesUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario | Login</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css"/>
        <link rel="stylesheet" href="public/css/partials/footer.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <%@include file="../partials/header.jspf" %>
        <div id="container">
            <form action="?cmd=usuario-login&op=proceso" method="POST" accept-charset="ISO-8859-1">
                <div class="fieldset">
                   <label for="user">User</label>
                   <input type="text" id="user" name="user" pattern="<%= UtilesUsuarios.REG_USER %>"> 
                </div>
                <div class="fieldset">
                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" pattern="<%= UtilesUsuarios.REG_PASS %>">  
                </div>
                <div class="buttonset">
                    <input type="submit" value="Enviar">
                    <input type="reset" value="Restaurar">
                </div>
            </form>
        </div>
        <%@include file="../partials/footer.jspf" %>
    </body>
</html>
