<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <div id="container">
            <h1>Login</h1>
            <form>
                <label for="usuario">Usuario</label>
                <input id="usuario" type="text">
                <label for="password">Contraseña</label>
                <input id="password" type="password">
                <a href="?cmd=main-usuario">Enviar</a>
            </form>
        </div>
    </body>
</html>
