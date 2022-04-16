package Modelo;
import Config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteEliminadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <ClienteEliminado>lista = new ArrayList<>();
        String sql="SELECT id_cliente_eliminado, dpi_cliente, nombres_cliente, apellidos_cliente, edad_cliente, to_char(fecha, 'DD/MM/YYYY HH:MI AM'), correo FROM cliente_eliminado";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                ClienteEliminado cliEliminado = new ClienteEliminado();
                cliEliminado.setIdClienteEliminado(rs.getString(1));
                cliEliminado.setDpiClienteEliminado(rs.getString(2));
                cliEliminado.setNombresClienteEliminado(rs.getString(3));
                cliEliminado.setApellidosClienteEliminado(rs.getString(4));
                cliEliminado.setEdadClienteEliminado(rs.getString(5));
                cliEliminado.setFecha(rs.getString(6));
                cliEliminado.setCorreo(rs.getString(7));
                lista.add(cliEliminado);
            }
        } catch (Exception e) {
        }
        return lista;
    }
  
    
    public List buscar(String texto){
        List <ClienteEliminado> lista = new ArrayList<>();
        String sql="SELECT * FROM cliente_eliminado WHERE id_cliente_eliminado LIKE '%"+texto+"%' OR dpi_cliente LIKE '%"+texto+"%' OR nombres_cliente LIKE '%"+texto+"%' OR apellidos_cliente LIKE '%"+texto+"%' OR edad_cliente LIKE '%"+texto+"%' OR fecha LIKE '%"+texto+"%' OR correo LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                ClienteEliminado cliEliminado = new ClienteEliminado();
                cliEliminado.setIdClienteEliminado(rs.getString("id_cliente_eliminado"));
                cliEliminado.setDpiClienteEliminado(rs.getString("dpi_cliente"));
                cliEliminado.setNombresClienteEliminado(rs.getString("nombres_cliente"));
                cliEliminado.setApellidosClienteEliminado(rs.getString("apellidos_cliente"));
                cliEliminado.setEdadClienteEliminado(rs.getString("edad_cliente"));
                cliEliminado.setFecha(rs.getString("fecha"));
                cliEliminado.setCorreo(rs.getString("correo"));
                lista.add(cliEliminado);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public void restaurar(String idClienteEliminado) {
        String sql="{call RESTAURA_CLIENTE_ELIMINADO (?)}";
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, idClienteEliminado);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
}
