<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-MX">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1>Resultados</h1>
        <p>Muchas gracias <b><%=request.getParameter("nombre")%></b>, por responder nuestra encuesta.</p>
        <p>La opción que usted marcó fue: <br/>
            <b><%=request.getParameter("opciones")%></b>
        </p>
    </body>
</html>