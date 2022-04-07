<%-- 
    Document   : visita-landing
    Created on : 22 mar. 2022, 10:25:48
    Author     : Iván Martínez Sánchez -  ivanmasan@outlook.com
--%>

<%@page import="org.japo.java.libraries.UtilesEntidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario | Login</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <div id="container">
            <h1>Login</h1>
            <form action="?cmd=usuario-login&op=proceso" method="POST" accept-charset="ISO-8859-1">
                <div class="fieldset">
                   <label for="user">User</label>
                   <input type="text" id="user" name="user" pattern="<%= UtilesEntidad.REG_USER %>"> 
                </div>
                <div class="fieldset">
                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" pattern="<%= UtilesEntidad.REG_PASS %>">  
                </div>
                <div class="buttonset">
                    <input type="submit" value="Enviar">
                    <input type="reset" value="Restaurar">
                </div>
            </form>
        </div>
    </body>
</html>
