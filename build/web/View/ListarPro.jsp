

<%@page import="java.util.Iterator"%>
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
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <div class="container">
            <h1>Programas Registrados</h1>
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">Codigo Del Programa</th>
                        <th class="text-center">Nombre Del Programa</th>
                        
                    </tr>
                    
                </thead>
                
                <%
                ProgramaDao prodao=new ProgramaDao();
                List<Programa>Listar=prodao.listadopro();
                Iterator<Programa>it=Listar.iterator();
                Programa pro=null;
                while(it.hasNext()){
                    pro=it.next();
                    
                
                
                
                
                
                
                
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=pro.getCodprograma()%></td>
                        <td class="text-center"><%=pro.getNomprograma()%></td>
                        
                        <td class="text-center">
                            <a class="btn btn-danger" href="../ControladorPrograma?accion=editarpro&id=<%=pro.getCodprograma()%>">Editar</a>
                            <a class="btn btn-warning" href="ControladorPrograma?accion=eliminarpro&id=<%=pro.getCodprograma()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                        <%}%>
                    
                </tbody>
                
                
            </table>
            
            
        </div>
        
        <button onclick="location.href='../index.jsp'" class="btn btn-primary">Volver al inicio</button>
    </body>
</html>
