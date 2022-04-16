
package Modelo;

public class SueldoConductor {
    private String anio, cantidadAumentoUno, edad, cantidadAumentoDos;

    public SueldoConductor() {
    }

    public SueldoConductor(String anio, String cantidadAumentoUno, String edad, String cantidadAumentoDos) {
        this.anio = anio;
        this.cantidadAumentoUno = cantidadAumentoUno;
        this.edad = edad;
        this.cantidadAumentoDos = cantidadAumentoDos;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCantidadAumentoUno() {
        return cantidadAumentoUno;
    }

    public void setCantidadAumentoUno(String cantidadAumentoUno) {
        this.cantidadAumentoUno = cantidadAumentoUno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCantidadAumentoDos() {
        return cantidadAumentoDos;
    }

    public void setCantidadAumentoDos(String cantidadAumentoDos) {
        this.cantidadAumentoDos = cantidadAumentoDos;
    }
    
    
}
