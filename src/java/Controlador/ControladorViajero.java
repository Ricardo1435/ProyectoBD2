package Controlador;
import Modelo.Viajero;
import Modelo.ViajeroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ControladorViajero", urlPatterns = {"/ControladorViajero"})
public class ControladorViajero extends HttpServlet {
Viajero via = new Viajero();
ViajeroDAO dao = new ViajeroDAO();
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
            out.println("<title>Servlet ControladorViajero</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorViajero at " + request.getContextPath() + "</h1>");
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
                List<Viajero>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("ViajeroIndex.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("AddViajero.jsp").forward(request, response);
                break;
            case "Guardar":
                String idCliente=request.getParameter("ingresoCliente");
                String idDestino=request.getParameter("ingresoDestino");
                String asiento=request.getParameter("ingresoAsiento");
                String pesoEquipaje=request.getParameter("ingresoPesoEquipaje");
                String fechaViaje=request.getParameter("ingresoFechaViaje");
                String correo = request.getParameter("ingresoCorreo");
                via.setIdCliente(idCliente);
                via.setIdDestino(idDestino);
                via.setAsiento(asiento);
                via.setPesoEquipaje(pesoEquipaje);
                via.setFechaViaje(fechaViaje);
                via.setCorreo(correo);
                dao.agregar(via);
                request.getRequestDispatcher("ControladorViajero?accion=Listar").forward(request, response);
                break;
            case "Editar":
                String idViajero=request.getParameter("idViajero");
                Viajero vi=dao.listarID(idViajero);
                request.setAttribute("viajero", vi);
                request.getRequestDispatcher("EditViajero.jsp").forward(request, response);
                break;
            case "Actualizar":
                String idViajero2=request.getParameter("ingresoRowId");
                String idCliente3=request.getParameter("ingresoCliente");
                String idDestino3=request.getParameter("ingresoDestino");
                String asiento3=request.getParameter("ingresoAsiento");
                String pesoEquipaje3=request.getParameter("ingresoPesoEquipaje");
                String fechaViaje3=request.getParameter("ingresoFechaViaje");
                String correo3=request.getParameter("ingresoCorreo");
                via.setRowId(idViajero2);
                via.setIdCliente(idCliente3);
                via.setIdDestino(idDestino3);
                via.setAsiento(asiento3);
                via.setPesoEquipaje(pesoEquipaje3);
                via.setFechaViaje(fechaViaje3);
                via.setCorreo(correo3);
                dao.actualizar(via);
                request.getRequestDispatcher("ControladorViajero?accion=Listar").forward(request, response);
                break;
            case "Buscar":
                String dato=request.getParameter("ingresoBuscar");
                List <Viajero> lista = dao.buscar(dato);
                request.setAttribute("datos", lista);
                request.getRequestDispatcher("ViajeroIndex.jsp").forward(request, response);
                break;
           case "PrepararDevolucion":
                String idViajero4=request.getParameter("idViajero");
                Viajero via=dao.preparoDev(idViajero4);
                request.setAttribute("viajero", via);
                request.getRequestDispatcher("PrepararDevolucion.jsp").forward(request, response);
                break;  
           case "Devolucion":
               String idCli=request.getParameter("ingresoIdCliente");
               String idDes=request.getParameter("ingresoIdDestino");
               dao.devolucion(idCli, idDes);
               request.getRequestDispatcher("ControladorViajero?accion=Listar").forward(request, response);
               break;
           case "Devoluciones":
               request.getRequestDispatcher("ControladorDevolucion?accion=Listar").forward(request, response);
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
