
package Modelo;

public class ConductorEliminado {
    private String idConductorEliminado, dpiConductorEliminado, 
            nombresConductorEliminado, apellidosConductorEliminado, edadConductorEliminado, sueldoConductorEliminado, fechaIngresoConductorEliminado, fechaEliminacion, correo; 

    public ConductorEliminado() {
    }

    public ConductorEliminado(String idConductorEliminado, String dpiConductorEliminado, String nombresConductorEliminado, String apellidosConductorEliminado, String edadConductorEliminado, String sueldoConductorEliminado, String fechaIngresoConductorEliminado, String fechaEliminacion, String correo) {
        this.idConductorEliminado = idConductorEliminado;
        this.dpiConductorEliminado = dpiConductorEliminado;
        this.nombresConductorEliminado = nombresConductorEliminado;
        this.apellidosConductorEliminado = apellidosConductorEliminado;
        this.edadConductorEliminado = edadConductorEliminado;
        this.sueldoConductorEliminado = sueldoConductorEliminado;
        this.fechaIngresoConductorEliminado = fechaIngresoConductorEliminado;
        this.fechaEliminacion = fechaEliminacion;
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

    public String getSueldoConductorEliminado() {
        return sueldoConductorEliminado;
    }

    public void setSueldoConductorEliminado(String sueldoConductorEliminado) {
        this.sueldoConductorEliminado = sueldoConductorEliminado;
    }

    public String getFechaIngresoConductorEliminado() {
        return fechaIngresoConductorEliminado;
    }

    public void setFechaIngresoConductorEliminado(String fechaIngresoConductorEliminado) {
        this.fechaIngresoConductorEliminado = fechaIngresoConductorEliminado;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    
}
