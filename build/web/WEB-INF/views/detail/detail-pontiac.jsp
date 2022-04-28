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
        <title>Detail | Pontiac</title>
        <link rel="stylesheet" href="public/css/detail/detail-general.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css"/>
        <link rel="stylesheet" href="public/css/partials/footer.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <%@include file="../partials/header.jspf" %>
        
        <div id="container">

            <div>
                <h1>Pontiac</h1>
                <p>
                    Pontiac fue una marca de automóviles producida por 
                    General Motors y vendida en los Estados Unidos, Canadá 
                    y México desde 1926 hasta 2010. En la línea de marcas de 
                    GM, Pontiac era una marca intermedia con un enfoque hacia 
                    los modelos deportivos y de rendimiento a un precio 
                    razonable. La marca Pontiac fue introducida en 1926 
                    como la subsidiaria Oakland Motor Car de General Motors. 
                    El nombre Pontiac ya había sido usado por otro fabricante 
                    en 1906, pero este desapareció. El lunes 27 de abril de 
                    2009 el presidente de General Motors anunció que la venta 
                    de los vehículos Pontiac se detendría en 2010 
                    (como efectivamente ocurrió), como parte de una estrategia 
                    encaminada a obtener mayores recursos del gobierno federal.
                </p>
            </div>
            
            <div id="pontiac1"></div>
            <div>
                <p>
                    El primer Pontiac de GM fue concebido como un modelo 
                    asequible de seis cilindros para competir con otros 
                    modelos más caros de cuatro cilindros. Después de meses 
                    de producción Pontiac sobrepasó en ventas a Oakland. 
                    Debido a que las ventas de Pontiac subían y las de 
                    Oakland continuaban cayendo, Pontiac se convirtió en la 
                    única subsidiaria en sobrevivir a su compañía madre.
                    El logotipo original, que fue usado hasta 1956, fue 
                    sustituido por el actual, que originalmente quería 
                    representar la cabeza de una flecha nativa.
                </p>
            </div>
            
            <div><a href="?cmd=main-basic">Volver</a></div>
            
        </div>
        
        <%@include file="../partials/footer.jspf" %>
    </body>
</html>
