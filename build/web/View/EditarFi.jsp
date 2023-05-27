

<%@page import="modelo.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="modelo.Programa"%>
<%@page import="modelo.Programa"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page import="modelo.Ficha"%>
<%@page import="modeldao.FichaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Ficha</title>
    </head>
    <body>
        <div class="container">
            <h1>Editar Ficha</h1>
            <%
            FichaDao fidao= new FichaDao();
            int id=Integer.parseInt((String)request.getParameter("id"));
            Ficha fi=new Ficha();
            fi=fidao.List(id);
            
            %>
            <form action="ControladorFicha">
        <label>Codigo de Ficha</label>
        <input class="form-control" type="number" name="txtcodfi" value="<%=fi.getCodFicha()%>">
        <br>
        <label>Cantidad de Aprendices</label>
        <input class="form-control" type="number" name="txtcantapre" value="<%=fi.getCantaprendices()%>">
        <br>  
        <div class="form-group">
            <label>Nombre Programa:</label>
            <select name="listapro" class="custom-select" value="<%=fi.getCodprograma()%>">
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
                   
            <select name="listapre" class="custom-select" value="<%=fi.getCodaprendiz()%>">
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
        
        
        <button class="btn btn-primary" type="submit" name="accion" value="ActualizarFicha">Actualizar</button>
        </form>
            
        </div>
    </body>
</html>
