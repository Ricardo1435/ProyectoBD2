
package Modelo;

public class Viajero {
    private String rowId, idCliente, idDestino, asiento, pesoEquipaje, fechaViaje, 
    cobroEquipaje, descuento, pagoTotal, correo, nombresCliente, apellidosCliente, nombreDestino, precioBoleto; 

    public Viajero() {
    }

    public Viajero(String rowId, String idCliente, String idDestino, String asiento, String pesoEquipaje, String fechaViaje, String cobroEquipaje, String descuento, String pagoTotal, String correo, String nombresCliente, String apellidosCliente, String nombreDestino, String precioBoleto) {
        this.rowId = rowId;
        this.idCliente = idCliente;
        this.idDestino = idDestino;
        this.asiento = asiento;
        this.pesoEquipaje = pesoEquipaje;
        this.fechaViaje = fechaViaje;
        this.cobroEquipaje = cobroEquipaje;
        this.descuento = descuento;
        this.pagoTotal = pagoTotal;
        this.correo = correo;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.nombreDestino = nombreDestino;
        this.precioBoleto = precioBoleto;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
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

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(String pesoEquipaje) {
        this.pesoEquipaje = pesoEquipaje;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getCobroEquipaje() {
        return cobroEquipaje;
    }

    public void setCobroEquipaje(String cobroEquipaje) {
        this.cobroEquipaje = cobroEquipaje;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(String pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(String precioBoleto) {
        this.precioBoleto = precioBoleto;
    }
    
}
