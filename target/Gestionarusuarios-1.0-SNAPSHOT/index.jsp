<%-- 
    Document   : index
    Created on : 20/04/2023, 9:04:42 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="formulario">
        <h1>Buenas noches</h1>
        <form action="ControladorAprendiz">
        <label>Nombre</label>
        <input class="form-control" type="text" name="txtNom">
        <br>
        <label>Numero de Documento</label>
        <input class="form-control" type="number" name="txtdoc">
        <br>
        <label>Apellido</label>
        <input class="form-control" type="text" name="txtApe">
        <br>
        <label>Numero de Contacto</label>
        <input class="form-control" type="number" name="txtNum">
        <br>
        <label>Correo</label>
        <input class="form-control" type="email" name="txtCor">
        <br>
        <button class="btn btn-primary" type="submit" name="accion" value="Agregar">Guardar</button>
        </form>
        </div>
    </body>
</html>
