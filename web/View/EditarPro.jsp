

<%@page import="modelo.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        
        <div class="container"></div>
        <div class="col-lg-6">
        <h1>Editar Programa</h1>
        <%
        ProgramaDao prodao=new ProgramaDao();
        int id=Integer.parseInt(request.getParameter("id"));
        Programa pro= new Programa();
        pro=prodao.List(id);
        
        %>
        <form action="ControladorPrograma">
        <label>Codigo de programa</label>
        <input class="form-control" type="number" name="txtcod" value="<%=pro.getCodprograma()%>">
        <br>
        <label>Nombre del Programa</label>
        <input class="form-control" type="text" name="txtnompro" value="<%=pro.getNomprograma()%>">
        <br>
       
        <button class="btn btn-primary" type="submit" name="accion" value="ActualizarPro">Actualizar</button>
        </form>
        </div>
        </div>
    </body>
</html>
