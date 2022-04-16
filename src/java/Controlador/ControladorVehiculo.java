package Controlador;
import Modelo.Vehiculo;
import Modelo.VehiculoDAO;
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
@WebServlet(name = "ControladorVehiculo", urlPatterns = {"/ControladorVehiculo"})
public class ControladorVehiculo extends HttpServlet {
VehiculoDAO dao=new VehiculoDAO();
Vehiculo vehi = new Vehiculo();
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
            out.println("<title>Servlet ControladorVehiculo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorVehiculo at " + request.getContextPath() + "</h1>");
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
                List<Vehiculo>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("VehiculoIndex.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("AddVehiculo.jsp").forward(request, response);
                break;
            case "Guardar":
                String idVehiculo=request.getParameter("ingresoIdVehiculo");
                String matricula=request.getParameter("ingresoMatricula");
                String aliasVehiculo=request.getParameter("ingresoAliasVehiculo");
                String cantidadAsientos=request.getParameter("ingresoCantidadAsientos");
                String nombresConductor=request.getParameter("ingresoConductor");
                vehi.setIdVehiculo(idVehiculo);
                vehi.setMatricula(matricula);
                vehi.setAliasVehiculo(aliasVehiculo);
                vehi.setCantidadAsientos(cantidadAsientos);
                vehi.setNombresConductor(nombresConductor);
                dao.agregar(vehi);
                request.getRequestDispatcher("ControladorVehiculo?accion=Listar").forward(request, response);
                break;
            case "Editar":
                String idVehiculo2=request.getParameter("idVehiculo");
                Vehiculo ve=dao.listarID(idVehiculo2);
                request.setAttribute("vehiculo", ve);
                request.getRequestDispatcher("EditVehiculo.jsp").forward(request, response);
                break;
            case "Actualizar":
                String idVehiculo3=request.getParameter("ingresoIdVehiculo");
                String matricula2=request.getParameter("ingresoMatricula");
                String aliasVehiculo2=request.getParameter("ingresoAliasVehiculo");
                String cantidadAsientos2=request.getParameter("ingresoCantidadAsientos");
                String nombresConductor2=request.getParameter("ingresoConductor");
                vehi.setIdVehiculo(idVehiculo3);
                vehi.setMatricula(matricula2);
                vehi.setAliasVehiculo(aliasVehiculo2);
                vehi.setCantidadAsientos(cantidadAsientos2);
                vehi.setNombresConductor(nombresConductor2);
                dao.actualizar(vehi);
                request.getRequestDispatcher("ControladorVehiculo?accion=Listar").forward(request, response);
                break;
            case "Eliminar":
                String idVehiculo4=request.getParameter("idVehiculo");
                dao.eliminar(idVehiculo4);
                request.getRequestDispatcher("ControladorVehiculo?accion=Listar").forward(request, response);
                break;
            case "Buscar":
                String dato=request.getParameter("ingresoBuscar");
                List <Vehiculo> lista = dao.buscar(dato);
                request.setAttribute("datos", lista);
                request.getRequestDispatcher("VehiculoIndex.jsp").forward(request, response);
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
