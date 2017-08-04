<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-MX">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
    </head>
    <body>
        <h1>Encuesta</h1>
        <form action="ServletControlador">
            <label>  Nombre : <input type="text" name="nombre"/></label><br/>
            <p>¿Qué sistema operativo usa habitualmente?</p>
            <table>
                <tr>
                    <td>Windows :</td>
                    <td><input type="checkbox" name="opciones" value="Windows"/></td>
                </tr>
                <tr>
                    <td>Linux :</td>
                    <td><input type="checkbox" name="opciones" value="Linux"/></td>
                </tr>
                <tr>
                    <td>Mac :</td>
                    <td><input type="checkbox" name="opciones" value="Mac"/></td>
                </tr>
            </table>
            <input type="submit" value="Enviar"/>
        </form>
    </body>