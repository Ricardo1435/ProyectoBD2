
package Modelo;

public class Devolucion {
    private String idDevolucion, idCliente, idDestino, cantidadDevolucion, cantidadPenalizacion, fecha,
            nombresCliente, apellidosCliente, nombreDestino;

    public Devolucion() {
    }

    public Devolucion(String idDevolucion, String idCliente, String idDestino, String cantidadDevolucion, String cantidadPenalizacion, String fecha, String nombresCliente, String apellidosCliente, String nombreDestino) {
        this.idDevolucion = idDevolucion;
        this.idCliente = idCliente;
        this.idDestino = idDestino;
        this.cantidadDevolucion = cantidadDevolucion;
        this.cantidadPenalizacion = cantidadPenalizacion;
        this.fecha = fecha;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.nombreDestino = nombreDestino;
    }

   
    public String getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(String idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(String idDestino) {
        this.idDestino = idDestino;
    }

    public String getCantidadDevolucion() {
        return cantidadDevolucion;
    }

    public void setCantidadDevolucion(String cantidadDevolucion) {
        this.cantidadDevolucion = cantidadDevolucion;
    }

    public String getCantidadPenalizacion() {
        return cantidadPenalizacion;
    }

    public void setCantidadPenalizacion(String cantidadPenalizacion) {
        this.cantidadPenalizacion = cantidadPenalizacion;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
