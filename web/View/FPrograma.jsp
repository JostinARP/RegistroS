

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        
                <div class="container"></div>
        <div class="col-lg-6">
        <h1>Registrar Estudiante</h1>
        <form action="../ControladorPrograma">
        <label>Codigo de programa</label>
        <input class="form-control" type="number" name="txtcod">
        <br>
        <label>Nombre del Programa</label>
        <input class="form-control" type="text" name="txtnompro">
        <br>
       
        <button class="btn btn-primary" type="submit" name="accion" value="AgregarPro">Guardar</button>
        </form>
        </div>
        </div>
    </body>
</html>
