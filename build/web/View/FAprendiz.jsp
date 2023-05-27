<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <div id="formulario">
        <h1>Buenas noches</h1>
        <form action="../ControladorAprendiz">
        <label>Numero de Documento</label>
        <input class="form-control" type="number" name="txtdoc">
        <br>
        <label>Nombre</label>
        <input class="form-control" type="text" name="txtNom">
        <br>        
        <label>Apellido</label>
        <input class="form-control" type="text" name="txtApe">
        <br>
        <label>Correo</label>
        <input class="form-control" type="email" name="txtCor">
        <br>
        <label>Numero de Contacto</label>
        <input class="form-control" type="number" name="txtNum">
        <br>
        <button class="btn btn-primary" type="submit" name="accion" value="Agregar">Guardar</button>
        </form>
        </div>
        
    </body>
</html>
