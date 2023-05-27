/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeldao.ProgramaDao;
import modelo.Programa;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorPrograma", urlPatterns = {"/ControladorPrograma"})
public class ControladorPrograma extends HttpServlet {

   String agregapro= "View/FPrograma.jsp";
   String Listapro="View/ListarPro.jsp";
   String editarprod="View/EditarPro.jsp";
   Programa p= new Programa();
   ProgramaDao pdao= new ProgramaDao();
   int id;
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPrograma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPrograma at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        
        if(action.equalsIgnoreCase("Listapro")){
        acceso=Listapro;
        }else if(action.equalsIgnoreCase("agregapro")){
        acceso=agregapro;
        }
        
        if(action.equalsIgnoreCase("AgregarPro")){
        int codp=Integer.parseInt(request.getParameter("txtcod"));
        String nompro= request.getParameter("txtnompro");
        p.setCodprograma(codp);
        p.setNomprograma(nompro);
        pdao.registrarpro(p);
        
       acceso=Listapro;
       
        }else if(action.equalsIgnoreCase("eliminarpro")){
            id=Integer.parseInt(request.getParameter("id"));
            p.setCodprograma(id);
            pdao.eliminarpro(id);
            acceso=Listapro;
            
             
        }else if(action.equalsIgnoreCase(("editarpro"))){
        
            request.setAttribute("codpro", request.getParameter("id"));
            acceso = editarprod;
            /*request.setAttribute("id", request.getParameter("id"));
        acceso=editarpro;*/
        
        }else if(action.equalsIgnoreCase(("ActualizarPro"))){
        int codpro=Integer.parseInt(request.getParameter("txtcod"));
        String nombrepro=request.getParameter("txtnompro");
        
        p.setCodprograma(codpro);
        p.setNomprograma(nombrepro);
        pdao.actualizarpro(p);
        acceso=Listapro;
                

                
        }
        RequestDispatcher view=request.getRequestDispatcher(acceso);
        view.forward(request, response);

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
