
package Modelo;

public class ClienteEliminado {
    private String idClienteEliminado, dpiClienteEliminado, 
            nombresClienteEliminado, apellidosClienteEliminado, edadClienteEliminado, fecha, correo; 

    public ClienteEliminado() {
    }

    public ClienteEliminado(String idClienteEliminado, String dpiClienteEliminado, String nombresClienteEliminado, String apellidosClienteEliminado, String edadClienteEliminado, String fecha, String correo) {
        this.idClienteEliminado = idClienteEliminado;
        this.dpiClienteEliminado = dpiClienteEliminado;
        this.nombresClienteEliminado = nombresClienteEliminado;
        this.apellidosClienteEliminado = apellidosClienteEliminado;
        this.edadClienteEliminado = edadClienteEliminado;
        this.fecha = fecha;
        this.correo = correo;
    }

    public String getIdClienteEliminado() {
        return idClienteEliminado;
    }

    public void setIdClienteEliminado(String idClienteEliminado) {
        this.idClienteEliminado = idClienteEliminado;
    }

    public String getDpiClienteEliminado() {
        return dpiClienteEliminado;
    }

    public void setDpiClienteEliminado(String dpiClienteEliminado) {
        this.dpiClienteEliminado = dpiClienteEliminado;
    }

    public String getNombresClienteEliminado() {
        return nombresClienteEliminado;
    }

    public void setNombresClienteEliminado(String nombresClienteEliminado) {
        this.nombresClienteEliminado = nombresClienteEliminado;
    }

    public String getApellidosClienteEliminado() {
        return apellidosClienteEliminado;
    }

    public void setApellidosClienteEliminado(String apellidosClienteEliminado) {
        this.apellidosClienteEliminado = apellidosClienteEliminado;
    }

    public String getEdadClienteEliminado() {
        return edadClienteEliminado;
    }

    public void setEdadClienteEliminado(String edadClienteEliminado) {
        this.edadClienteEliminado = edadClienteEliminado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    
    
}
