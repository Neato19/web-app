<%-- 
    Document   : visita-landing
    Created on : 22 mar. 2022, 10:25:48
    Author     : Iván Martínez Sánchez - ivanmasan@outlook.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail | Cadillac</title>
        <link rel="stylesheet" href="public/css/detail/detail-general.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css"/>
        <link rel="stylesheet" href="public/css/partials/footer.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <%@include file="../partials/header.jspf" %>
        
        <div id="container">

            <div>
                <h1>Cadillac</h1>
                <p>Cadillac es una marca de automóviles de lujo, 
                    fabricados y vendidos por la empresa estadounidense 
                    General Motors creada por William Murphy en 1902. 
                    El nombre fue tomado del fundador de la ciudad de Detroit, 
                    Míchigan, en 1701, el oficial del ejército francés, 
                    Antoine de la Mothe Cadillac. Se comercializa principalmente 
                    en los Estados Unidos, Canadá y México, con escaso calado en 
                    el mercado europeo, dado el tipo de automóvil que se produce, 
                    no adecuado para Europa. Los nuevos modelos Cadillac son 
                    ahora ensamblados en diferentes plantas de GM por todo el 
                    mundo permitiendo así usos específicos para las 
                    diferentes regiones.</p>
            </div>
            
            <div id="cadillac1"></div>
            <div>
                <p>La empresa Cadillac se formó desde los remanentes de la 
                empresa de Henry Ford (Detroit Automobile Company and The 
                Henry Ford Company). Cuando Henry Ford dejó su empresa, junto 
                con varios de sus socios, ésta se disolvió en marzo de 1902. 
                Los financiadores de Ford, William Murphy y Lemuel Bowen, 
                llamaron al ingeniero Henry M.<p></div>
            
            <div><a href="?cmd=main-basic">Volver</a></div>
            
        </div>
        
        <%@include file="../partials/footer.jspf" %>
    </body>
</html>
