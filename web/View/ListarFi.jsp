

<%@page import="java.util.Iterator"%>
<%@page import="modelo.Ficha"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.FichaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Ficha</title>
    </head>
    <body class="container">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <h1>FICHAS REGISTRADAS</h1>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th class="text-center">Codigo de la Ficha</th>
                    <th class="text-center">Cantidad de Aprendices</th>
                    <th class="text-center">Codigo del Programa</th>
                    <th class="text-center">Codigo del Aprendiz</th>
                </tr>
            </thead>
            
            <%
            FichaDao fidao=new FichaDao();
            List<Ficha>Listar=new FichaDao().listaFicha();
            Iterator<Ficha>it=Listar.iterator();
            Ficha fi=new Ficha();
            while(it.hasNext()){
                fi=it.next();
                
            
            %>
            
            <tbody>
                <tr>
            <td class="text-center"><%=fi.getCodFicha()%></td>
            <td class="text-center"><%=fi.getCantaprendices()%></td>
            <td class="text-center"><%=fi.getCodprograma()%></td>
            <td class="text-center"><%=fi.getCodaprendiz()%></td>
            
            <td class="text-center">
                <a class="btn btn-danger" href="ControladorFicha?accion=eliminarFicha&id=<%=fi.getCodFicha()%>">Eliminar</a>
                <a class="btn btn-warning" href="ControladorFicha?accion=editarFicha&id=<%=fi.getCodFicha()%>">Editar</a>
                
            </td>
                </tr>
                <%}%>
            </tbody>
        </table>
            <button onclick="location.href='../index.jsp'" class="btn btn-primary">Volver al inicio</button>
    </body>
</html>
