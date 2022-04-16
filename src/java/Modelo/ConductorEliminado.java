
package Modelo;

public class ConductorEliminado {
    private String idConductorEliminado, dpiConductorEliminado, 
            nombresConductorEliminado, apellidosConductorEliminado, edadConductorEliminado, fecha, correo; 

    public ConductorEliminado() {
    }

    public ConductorEliminado(String idConductorEliminado, String dpiConductorEliminado, String nombresConductorEliminado, String apellidosConductorEliminado, String edadConductorEliminado, String fecha, String correo) {
        this.idConductorEliminado = idConductorEliminado;
        this.dpiConductorEliminado = dpiConductorEliminado;
        this.nombresConductorEliminado = nombresConductorEliminado;
        this.apellidosConductorEliminado = apellidosConductorEliminado;
        this.edadConductorEliminado = edadConductorEliminado;
        this.fecha = fecha;
        this.correo = correo;
    }

    public String getIdConductorEliminado() {
        return idConductorEliminado;
    }

    public void setIdConductorEliminado(String idConductorEliminado) {
        this.idConductorEliminado = idConductorEliminado;
    }

    public String getDpiConductorEliminado() {
        return dpiConductorEliminado;
    }

    public void setDpiConductorEliminado(String dpiConductorEliminado) {
        this.dpiConductorEliminado = dpiConductorEliminado;
    }

    public String getNombresConductorEliminado() {
        return nombresConductorEliminado;
    }

    public void setNombresConductorEliminado(String nombresConductorEliminado) {
        this.nombresConductorEliminado = nombresConductorEliminado;
    }

    public String getApellidosConductorEliminado() {
        return apellidosConductorEliminado;
    }

    public void setApellidosConductorEliminado(String apellidosConductorEliminado) {
        this.apellidosConductorEliminado = apellidosConductorEliminado;
    }

    public String getEdadConductorEliminado() {
        return edadConductorEliminado;
    }

    public void setEdadConductorEliminado(String edadConductorEliminado) {
        this.edadConductorEliminado = edadConductorEliminado;
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
