
package Modelo;

public class Conductor {
    private String idConductor, dpiConductor, nombresConductor, apellidosConductor, edadConductor, sueldo, fechaIngreso,
    disponibilidad;

    public Conductor() {
    }

    public Conductor(String idConductor, String dpiConductor, String nombresConductor, String apellidosConductor, String edadConductor, String sueldo, String fechaIngreso, String disponibilidad) {
        this.idConductor = idConductor;
        this.dpiConductor = dpiConductor;
        this.nombresConductor = nombresConductor;
        this.apellidosConductor = apellidosConductor;
        this.edadConductor = edadConductor;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.disponibilidad = disponibilidad;
    }

    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public String getDpiConductor() {
        return dpiConductor;
    }

    public void setDpiConductor(String dpiConductor) {
        this.dpiConductor = dpiConductor;
    }

    public String getNombresConductor() {
        return nombresConductor;
    }

    public void setNombresConductor(String nombresConductor) {
        this.nombresConductor = nombresConductor;
    }

    public String getApellidosConductor() {
        return apellidosConductor;
    }

    public void setApellidosConductor(String apellidosConductor) {
        this.apellidosConductor = apellidosConductor;
    }

    public String getEdadConductor() {
        return edadConductor;
    }

    public void setEdadConductor(String edadConductor) {
        this.edadConductor = edadConductor;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
