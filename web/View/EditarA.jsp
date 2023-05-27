<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:42:43 p. m.
    Author     : APRENDIZ
--%>

<%@page import="modelo.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Aprendiz</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <div class="container">
            <div class="col-lg-6">
        <h1>Editar Aprendiz</h1>
        <% 
        AprendizDao ape=new AprendizDao();
        int id= Integer.parseInt((String)request.getAttribute(("id")));
        Aprendiz ap= new Aprendiz();
        ap=ape.list(id);
            
        %>
        <form action="ControladorAprendiz">
      
        <label>Documento</label>
        <input class="form-control" type="text" name="txtDocu" value="<%=ap.getDocuA()%>">
        <br>  
        <label>Nombre</label>
        <input class="form-control" type="text" name="txtNom" value="<%=ap.getNombreA()%>">
        <br>
        <label>Apellido</label>
        <input class="form-control" type="text" name="txtApe" value="<%=ap.getApellidoA()%>">
        <br>
        <label>Correo</label>
        <input class="form-control" type="email" name="txtCor" value="<%=ap.getCorreoA()%>">
        <br>
        <label>Numero de Contacto</label>
        <input class="form-control" type="number" name="txtNum" value="<%=ap.getTeleA()%>">
        <br>
        <input class="form-control" type="number" name="txtid" value="<%=ap.getId() %>">
        <button class="btn btn-primary" type="submit" name="accion" value="Actualizar">Actualizar</button>
        </form>
        </div>
        </div>
        
    </body>
</html>
