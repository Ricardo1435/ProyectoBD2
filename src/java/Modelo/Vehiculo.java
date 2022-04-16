
package Modelo;

/**
 *
 * @author Ricardo
 */
public class Vehiculo {
     private String idVehiculo, matricula, aliasVehiculo, cantidadAsientos, nombresConductor, apellidosConductor; 

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String matricula, String aliasVehiculo, String cantidadAsientos, String nombresConductor, String apellidosConductor) {
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.aliasVehiculo = aliasVehiculo;
        this.cantidadAsientos = cantidadAsientos;
        this.nombresConductor = nombresConductor;
        this.apellidosConductor = apellidosConductor;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAliasVehiculo() {
        return aliasVehiculo;
    }

    public void setAliasVehiculo(String aliasVehiculo) {
        this.aliasVehiculo = aliasVehiculo;
    }

    public String getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(String cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
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
     
     
}
