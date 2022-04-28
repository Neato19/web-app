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
        <title>Detail | Chevrolet</title>
        <link rel="stylesheet" href="public/css/detail/detail-general.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css"/>
        <link rel="stylesheet" href="public/css/partials/footer.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <%@include file="../partials/header.jspf" %>
        
        <div id="container">

            <div>
                <h1>Chevrolet</h1>
                <p>
                    Actualmente, Chevrolet incrementó su participación 
                    en el mercado mundial a partir de la implementación del 
                    nuevo concepto de diseño global llamado GPix o Global Pix, 
                    con el cual comenzó a presentar sus primeros vehículos 
                    denominados "globales", los cuales comenzaron a ser 
                    vendidos en Asia, Europa y América junto a los Estados 
                    Unidos. El primer vehículo presentado con esta 
                    característica fue el Chevrolet Aveo, presentado en el 
                    mercado de China. Más tarde, comenzaron a sucederse nuevas 
                    presentaciones, teniendo como protagonistas a los modelos 
                    Chevrolet Cruze, Chevrolet Impala y Chevrolet Captiva, 
                    quienes compartían rasgos de diseño con el Aveo. 
                </p>
            </div>
            
            <div id="chevrolet1"></div>
            <div>
                <p>
                  Esta política, además de renovar la cara de Chevrolet 
                  en el mundo, reafirmó su posición en diferentes mercados, 
                  donde la marca utilizaba modelos de otras marcas propiedad 
                  de General Motors para venderlos bajo la marca Chevrolet. 
                  Otro proyecto generado por esta nueva corriente de diseño 
                  es el denominado "Proyecto Viva", desarrollado en el Mercosur 
                  y del cual fueron concebidos los modelos Chevrolet Agile, 
                  Chevrolet Montana y la nueva generación del Chevrolet Cobalt, 
                  presentado el 16 de junio de 2011 en el Salón del Automóvil 
                  de Buenos Aires.  
                </p>
            </div>
            
            <div><a href="?cmd=main-basic">Volver</a></div>
            
        </div>
        
        <%@include file="../partials/footer.jspf" %>
    </body>
</html>
