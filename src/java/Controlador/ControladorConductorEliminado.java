package Controlador;
import Modelo.ConductorEliminado;
import Modelo.ConductorEliminadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "ControladorConductorEliminado", urlPatterns = {"/ControladorConductorEliminado"})
public class ControladorConductorEliminado extends HttpServlet {
ConductorEliminadoDAO dao=new ConductorEliminadoDAO();
ConductorEliminado condEli = new ConductorEliminado();
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorConductorEliminado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorConductorEliminado at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String accion=request.getParameter("accion");
       switch (accion){
           case "Listar":
                List<ConductorEliminado>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("ConductorEliminadoIndex.jsp").forward(request, response);
                break;
            case "Buscar":
                String dato=request.getParameter("ingresoBuscar");
                List <ConductorEliminado> lista = dao.buscar(dato);
                request.setAttribute("datos", lista);
                request.getRequestDispatcher("ConductorEliminadoIndex.jsp").forward(request, response);
                break;
            case "Restaurar":
                String idCond=request.getParameter("idConductorEliminado");
                dao.restaurar(idCond);
                request.getRequestDispatcher("ControladorConductorEliminado?accion=Listar").forward(request, response);
                break;
            case "Volver":
                request.getRequestDispatcher("ControladorConductor?accion=Listar").forward(request, response);
                break;
            default: throw new AssertionError();
       }
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
