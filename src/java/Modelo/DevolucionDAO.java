package Modelo;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DevolucionDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <Devolucion>lista = new ArrayList<>();
        String sql="SELECT devolucion.id_devolucion, devolucion.id_cliente, devolucion.id_destino, devolucion.cantidad_devolucion, devolucion.cantidad_penalizacion, devolucion.fecha, cliente.nombres_cliente, cliente.apellidos_cliente, destino.nombre_destino FROM devolucion, cliente, destino WHERE devolucion.id_cliente=cliente.id_cliente AND devolucion.id_destino=destino.id_destino";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Devolucion dev = new Devolucion();
                dev.setIdDevolucion(rs.getString(1));
                dev.setIdCliente(rs.getString(2));
                dev.setIdDestino(rs.getString(3));
                dev.setCantidadDevolucion(rs.getString(4));
                dev.setCantidadPenalizacion(rs.getString(5));
                dev.setFecha(rs.getString(6));
                dev.setNombresCliente(rs.getString(7));
                dev.setApellidosCliente(rs.getString(8));
                dev.setNombreDestino(rs.getString(9));
                lista.add(dev);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public List buscar(String texto){
        List <Devolucion> lista = new ArrayList<>();
        String sql="SELECT devolucion.id_devolucion, devolucion.id_cliente, devolucion.id_destino, devolucion.cantidad_devolucion, devolucion.cantidad_penalizacion, devolucion.fecha, cliente.nombres_cliente, cliente.apellidos_cliente, destino.nombre_destino FROM devolucion, cliente, destino WHERE devolucion.id_cliente=cliente.id_cliente AND devolucion.id_destino=destino.id_destino AND cliente.nombres_cliente LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Devolucion dev = new Devolucion();
                dev.setIdDevolucion(rs.getString(1));
                dev.setIdCliente(rs.getString(2));
                dev.setIdDestino(rs.getString(3));
                dev.setCantidadDevolucion(rs.getString(4));
                dev.setCantidadPenalizacion(rs.getString(5));
                dev.setFecha(rs.getString(6));
                dev.setNombresCliente(rs.getString(7));
                dev.setApellidosCliente(rs.getString(8));
                dev.setNombreDestino(rs.getString(9));
                lista.add(dev);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
