
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeldao.FichaDao;
import modelo.Ficha;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorFicha", urlPatterns = {"/ControladorFicha"})
public class ControladorFicha extends HttpServlet {
    
    String agregar="View/FFicha.jsp";
    String editarficha="View/EditarFi.jsp";
    String listarficha="View/ListarFi.jsp";
    Ficha fi =new Ficha();
    FichaDao fidao=new FichaDao();
    int id;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorFicha</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorFicha at " + request.getContextPath() + "</h1>");
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
        
        
        if(action.equalsIgnoreCase("AgregarFicha")){
            int codficha=Integer.parseInt(request.getParameter("txtcodfi"));
            int cantapre=Integer.parseInt(request.getParameter("txtcantapre"));
            int codpro=Integer.parseInt(request.getParameter("listapro"));
            int codapre=Integer.parseInt(request.getParameter("listapre"));
            
            fi.setCodFicha(codficha);
            fi.setCantaprendices(cantapre);
            fi.setCodprograma(codpro);
            fi.setCodaprendiz(codapre);
            fidao.registrarFicha(fi);
            
            acceso=listarficha;
            
        }else if(action.equalsIgnoreCase("listarficha")){
            
            acceso=listarficha;
        
        }else if(action.equalsIgnoreCase("eliminarFicha")){
        id=Integer.parseInt(request.getParameter("id"));
        fi.setCodFicha(id);
        fidao.eliminarFicha(id);
        acceso=listarficha;
        
        
        } else if(action.equalsIgnoreCase("editarFicha")){
            request.setAttribute("id", request.getParameter("id"));
            acceso=editarficha;
        
        }else if(action.equalsIgnoreCase("ActualizarFicha")){
        int codficha=Integer.parseInt(request.getParameter("txtcodfi"));
        int cantapre=Integer.parseInt(request.getParameter("txtcantapre"));
        int codpro=Integer.parseInt(request.getParameter("listapro"));
        int codapre=Integer.parseInt(request.getParameter("listapre"));
        
        fi.setCodFicha(codficha);
        fi.setCantaprendices(cantapre);
        fi.setCodprograma(codpro);
        fi.setCodaprendiz(codapre);
        fidao.actualizarFicha(fi);
        acceso=listarficha;
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
