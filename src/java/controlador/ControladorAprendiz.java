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
import javax.swing.JOptionPane;
import modeldao.AprendizDao;
import modelo.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorAprendiz", urlPatterns = {"/ControladorAprendiz"})
public class ControladorAprendiz extends HttpServlet {

   String agregar="View/FAprendiz.jsp";
   String listarapre="View/ListarA.jsp";
   String editarapre="View/EditarA.jsp";
    Aprendiz ap= new Aprendiz();
    AprendizDao apdao=new AprendizDao();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAprendiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAprendiz at " + request.getContextPath() + "</h1>");
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
        if(action.equalsIgnoreCase("listarapre")){
        acceso=listarapre;
        }     
        else if(action.equalsIgnoreCase("Agregar")){
        
            int documento=Integer.parseInt(request.getParameter("txtdoc"));
            String nombre=request.getParameter("txtNom");
            String apellido=request.getParameter("txtApe");
            String correo=request.getParameter("txtCor");
            int telefono=Integer.parseInt(request.getParameter("txtNum"));
            
            
            ap.setDocuA(documento);
             ap.setNombreA(nombre);
            ap.setApellidoA(apellido);
            ap.setCorreoA(correo);
            ap.setTeleA(telefono);
            apdao.registrarA(ap);
            
            acceso=listarapre;
            
             /*JOptionPane.showMessageDialog(null, "Usuario Registrado");*/
        }else if(action.equalsIgnoreCase("eliminar")){
        id=Integer.parseInt(request.getParameter("id"));
        ap.setId(id);
        apdao.eliminarA(id);
        acceso=listarapre;
        
        
       
    }else if(action.equalsIgnoreCase("editar")){
        request.setAttribute("id", request.getParameter("id"));
        acceso=editarapre;
        
    }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
           int documento = Integer.parseInt(request.getParameter("txtDocu"));
            String nombre=request.getParameter("txtNom");
            String apellido=request.getParameter("txtApe");
            String correo=request.getParameter("txtCor");
            int telefono=Integer.parseInt(request.getParameter("txtNum"));
            ap.setId(id);
            ap.setDocuA(documento);
            ap.setNombreA(nombre);
            ap.setApellidoA(apellido);
            ap.setCorreoA(correo);
            ap.setTeleA(telefono);
            apdao.actualizarA(ap);
            acceso=listarapre;
            
    
        
    
    }
        
        RequestDispatcher view=request.getRequestDispatcher(acceso);
        view.forward(request,response);
    }


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
