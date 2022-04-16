package Modelo;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DestinoDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <Destino>lista = new ArrayList<>();
        String sql="SELECT destino.id_destino, destino.nombre_destino, destino.precio_boleto, destino.id_vehiculo, vehiculo.matricula, vehiculo.alias_vehiculo FROM destino, vehiculo WHERE destino.id_vehiculo=vehiculo.id_vehiculo ORDER BY destino.id_destino";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Destino des = new Destino();
                des.setIdDestino(rs.getString(1));
                des.setNombreDestino(rs.getString(2));
                des.setPrecioBoleto(rs.getString(3));
                des.setIdVehiculo(rs.getString(4));
                des.setMatricula(rs.getString(5));
                des.setAliasVehiculo(rs.getString(6));
                lista.add(des);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int agregar(Destino des){
        int r=0;
        String sql="INSERT INTO destino(id_destino, nombre_destino, precio_boleto, id_vehiculo) VALUES(?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, des.getIdDestino());
            ps.setString(2, des.getNombreDestino());
            ps.setString(3, des.getPrecioBoleto());
            ps.setString(4, des.getIdVehiculo());
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
    
    public Destino listarID(String idDestino){
        Destino des = new Destino();
        String sql= ("SELECT * FROM destino WHERE (id_destino = '"+idDestino+"')");
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                des.setIdDestino(rs.getString(1));
                des.setNombreDestino(rs.getString(2));
                des.setPrecioBoleto(rs.getString(3));
                des.setIdVehiculo(rs.getString(4));
            }
        } catch (Exception e) {
        }
        return des;
    }
    
    public int actualizar(Destino des){
        int r=0;
        String sql="UPDATE destino SET nombre_destino=?, precio_boleto=?, id_vehiculo=? WHERE (id_destino=?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, des.getNombreDestino());
            ps.setString(2, des.getPrecioBoleto());
            ps.setString(3, des.getIdVehiculo());
            ps.setString(4, des.getIdDestino());
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
    
    public void eliminar(String idDestino){
        String sql="DELETE FROM destino WHERE (id_destino = '"+idDestino+"')";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
     public List buscar(String texto){
        List <Destino> lista = new ArrayList<>();
        String sql="SELECT destino.id_destino, destino.nombre_destino, destino.precio_boleto, destino.id_vehiculo, vehiculo.matricula, vehiculo.alias_vehiculo FROM destino, vehiculo WHERE destino.id_vehiculo=vehiculo.id_vehiculo AND destino.nombre_destino LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Destino dest = new Destino();
                dest.setIdDestino(rs.getString("id_destino"));
                dest.setNombreDestino(rs.getString("nombre_destino"));
                dest.setPrecioBoleto(rs.getString("precio_boleto"));
                dest.setIdVehiculo(rs.getString("id_vehiculo"));
                dest.setMatricula(rs.getString("matricula"));
                dest.setAliasVehiculo(rs.getString("alias_vehiculo"));
                lista.add(dest);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
