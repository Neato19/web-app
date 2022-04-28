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
        <title>Detail | Ford</title>
        <link rel="stylesheet" href="public/css/detail/detail-general.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css"/>
        <link rel="stylesheet" href="public/css/partials/footer.css"/>
        <link rel="icon" type="image/ico" href="public/img/favicon.ico"/>
    </head>
    <body>
        <%@include file="../partials/header.jspf" %>
        
        <div id="container">

            <div>
                <h1>Ford</h1>
                <p> 
                    Con su sede central ubicada en Dearborn, Estado de 
                    Míchigan, la empresa se expandió a nivel mundial 
                    destacándose principalmente por la producción de 
                    automóviles, vehículos comerciales y automóviles de 
                    carreras. La compañía tiene presencia a nivel mundial, 
                    gracias a sus filiales ubicadas en Alemania, Argentina, 
                    Canadá, Chile, España, India, México, Reino Unido y 
                    Tailandia, entre otros. Al mismo tiempo, fundó en Europa 
                    la división Premier Automotive Group, a través de la 
                    cual controlaba las acciones de las marcas británicas 
                    Aston Martin (hoy una compañía independiente), Jaguar 
                    Cars y Land Rover (hoy convertidos en la división 
                    Jaguar Land Rover del consorcio hindú Tata Motors) 
                    y la sueca Volvo Cars (hoy propiedad del grupo chino Geely).
                </p>
            </div>
            
            <div id="ford1"></div>
            <div> 
                <p>
                    Fundada por Henry Ford y se incorporó el 16 de junio de 
                    1903. La compañía vende automóviles y vehículos comerciales 
                    bajo la marca Ford y la mayoría de autos de lujo bajo la 
                    marca Lincoln. Ford también posee el fabricante brasileño 
                    de SUV's Troller, y el australiano FPV. En el pasado, 
                    también se han producido tractores y componentes de 
                    automoción.
                </p>
            </div>
            
            <div><a href="?cmd=main-basic">Volver</a></div>
            
        </div>
        
        <%@include file="../partials/footer.jspf" %>
    </body>
</html>
