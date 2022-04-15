package Modelo;
import Config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <Cliente>lista = new ArrayList<>();
        String sql="SELECT * FROM CLIENTE ORDER BY id_cliente";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getString(1));
                cli.setDpiCliente(rs.getString(2));
                cli.setNombresCliente(rs.getString(3));
                cli.setApellidosCliente(rs.getString(4));
                cli.setEdadCliente(rs.getString(5));
                lista.add(cli);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int agregar(Cliente cli){
        int r=0;
     String sql="INSERT INTO CLIENTE(id_cliente, dpi_cliente, nombres_cliente, apellidos_cliente, edad_cliente) VALUES(?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getIdCliente());
            ps.setString(2, cli.getDpiCliente());
            ps.setString(3, cli.getNombresCliente());
            ps.setString(4, cli.getApellidosCliente());
            ps.setString(5, cli.getEdadCliente());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e) {
        }
        return r;
    }
    
   public Cliente listarID(String idCliente){
        Cliente cli = new Cliente();
        String sql= ("SELECT * FROM cliente WHERE (id_cliente = '"+idCliente+"')");
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cli.setIdCliente(rs.getString(1));
                cli.setDpiCliente(rs.getString(2));
                cli.setNombresCliente(rs.getString(3));
                cli.setApellidosCliente(rs.getString(4));
                cli.setEdadCliente(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return cli;
    }
    
   public int actualizar(Cliente cli){
        int r=0;
        String sql="UPDATE cliente SET dpi_cliente=?, nombres_cliente=?, apellidos_cliente=?, edad_cliente=? WHERE (id_cliente=?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getDpiCliente());
            ps.setString(2, cli.getNombresCliente());
            ps.setString(3, cli.getApellidosCliente());
            ps.setString(4, cli.getEdadCliente());
            ps.setString(5, cli.getIdCliente());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e) {
        }
        return r;
    }
   
   
   public List buscar(String texto){
        List <Cliente> lista = new ArrayList<>();
        String sql="SELECT * FROM CLIENTE WHERE id_cliente LIKE '%"+texto+"%' OR dpi_cliente LIKE '%"+texto+"%' OR nombres_cliente LIKE '%"+texto+"%' OR apellidos_cliente LIKE '%"+texto+"%' OR edad_cliente LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setIdCliente(rs.getString("id_cliente"));
                cl.setDpiCliente(rs.getString("dpi_cliente"));
                cl.setNombresCliente(rs.getString("nombres_cliente"));
                cl.setApellidosCliente(rs.getString("apellidos_cliente"));
                cl.setEdadCliente(rs.getString("edad_cliente"));
                lista.add(cl);
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
   public void eliminar(String idCliente, String correo) {
        String sql="{call elimina_cliente (?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, idCliente);
            cs.setString(2, correo);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
   
   /*
   public void eliminar(String idCliente, String correo) {
        String sql="{call elimina_cliente (?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            ps=con.prepareCall(sql);
            cs.setString(1, idCliente);
            cs.setString(2, correo);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
   */
}
