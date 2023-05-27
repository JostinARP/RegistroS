<%-- 
    Document   : ListarA
    Created on : 3/05/2023, 7:16:42 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <title>Lista</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="View/Css/newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <div class="container">
            <h1>APRENDICES REGISTRADOS EN EL SISTEMA</h1>
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Documento</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Numero de Contacto</th> 
                        
                        
                        
                    </tr>
                    
                </thead>
                
                <% 
                AprendizDao apdao=new AprendizDao();
                List<Aprendiz>Listar=apdao.listadoA();
                Iterator<Aprendiz>it=Listar.iterator();
                Aprendiz usu=null;
                while(it.hasNext()){
                    usu=it.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getId()%></td>
                        <td class="text-center"><%=usu.getDocuA()%></td>
                        <td class="text-center"><%=usu.getNombreA()%></td>
                        <td class="text-center"><%=usu.getApellidoA()%></td>
                        <td class="text-center"><%=usu.getCorreoA()%></td>
                        <td class="text-center"><%=usu.getTeleA()%></td>
                        
                        <td class="text-center">
                            
                            <a class="btn btn-warning" href= "ControladorAprendiz?accion=eliminar&id=<%=usu.getId()%>">Eliminar</a>
                            <a class="btn btn-warning" href= "ControladorAprendiz?accion=editar&id=<%=usu.getId()%>">Editar</a>
                        </td>
                        
                    </tr>
                    <%}%>
                    
                </tbody>
                
                
            </table>
            
        </div>
        <button onclick="location.href='../index.jsp'" class="btn btn-primary">Volver al inicio</button>
    </body>
</html>
