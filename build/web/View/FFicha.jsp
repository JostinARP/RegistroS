<%-- 
    Document   : FFicha
    Created on : 15/05/2023, 7:05:12 p. m.
    Author     : APRENDIZ
--%>

<%@page import="modelo.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="modelo.Programa"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
         <div id="formulario">
        <h1>Formulario Ficha</h1>
        <form action="../ControladorFicha">
        <label>Codigo de Ficha</label>
        <input class="form-control" type="number" name="txtcodfi">
        <br>
        <label>Cantidad de Aprendices</label>
        <input class="form-control" type="number" name="txtcantapre">
        <br>  
        <div class="form-group">
            <label>Nombre Programa:</label>
            <select name="listapro" class="custom-select">
                <option value="0">
                    
                </option>
                
                <% 
                ProgramaDao pro=new ProgramaDao();
                List<Programa> lista= pro.listadopro();
                %>
                <% 
                for(Programa li:lista){%>
                <option value="<%=li.getCodprograma()%>">
                    <%=li.getNomprograma()%>
                </option>
                    <%}%>
            </select>
            <br>
                    
            <label>Nombre Aprendiz</label>
                   
            <select name="listapre" class="custom-select">
                <option value="0"></option>
                
                <%
                AprendizDao apdao=new AprendizDao();
                List<Aprendiz>listapre=apdao.listadoA();
                %>
                <%
                for(Aprendiz lia:listapre){%>
                <option value="<%=lia.getId()%>">
                    <%=lia.getNombreA()%>,
                    <%=lia.getApellidoA()%>,
                    <%=lia.getDocuA()%>
                </option>
                <%}%>
            </select>
            
        </div>
        
        
        <button class="btn btn-primary" type="submit" name="accion" value="AgregarFicha">Guardar</button>
        </form>
        </div>
</html>
