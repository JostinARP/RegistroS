<%-- 
    Document   : index
    Created on : 26/05/2023, 6:59:32 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <h1>¿Cual formulario quiere usar?</h1>
        <div class="boton">
        <button onclick="location.href='View/FAprendiz.jsp'" class="btn btn-primary" > Formulario Aprendiz</button>
        <button onclick="location.href='View/FPrograma.jsp'" class="btn btn-primary"> Formulario Programa</button>
        <button onclick="location.href='View/FFicha.jsp'" class="btn btn-primary"> Formulario Ficha</button>
        </div>
    </body>
</html>
