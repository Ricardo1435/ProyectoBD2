package Modelo;
import Config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ConductorDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <Conductor>lista = new ArrayList<>();
        String sql="SELECT id_conductor, dpi_conductor, nombres_conductor, apellidos_conductor, edad_conductor, sueldo, to_char(fecha_ingreso, 'DD/MM/YYYY HH:MI AM'), disponibilidad FROM conductor ORDER BY id_conductor";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Conductor cond = new Conductor();
                cond.setIdConductor(rs.getString(1));
                cond.setDpiConductor(rs.getString(2));
                cond.setNombresConductor(rs.getString(3));
                cond.setApellidosConductor(rs.getString(4));
                cond.setEdadConductor(rs.getString(5));
                cond.setSueldo(rs.getString(6));
                cond.setFechaIngreso(rs.getString(7));
                cond.setDisponibilidad(rs.getString(8));
                lista.add(cond);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public void agregar(String dpiConductor, String nombresConductor, String apellidosConductor, String edadConductor) {
        String sql="{call ingreso_conductor (?,?,?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, dpiConductor);
            cs.setString(2, nombresConductor);
            cs.setString(3, apellidosConductor);
            cs.setString(4, edadConductor );
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
     public Conductor listarID(String idConductor){
        Conductor cond = new Conductor();
        String sql= ("SELECT id_conductor, dpi_conductor, nombres_conductor, apellidos_conductor, edad_conductor, sueldo, to_char(fecha_ingreso, 'DD/MM/YYYY HH:MI AM'), disponibilidad FROM conductor WHERE (id_conductor = '"+idConductor+"')");
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                cond.setIdConductor(rs.getString(1));
                cond.setDpiConductor(rs.getString(2));
                cond.setNombresConductor(rs.getString(3));
                cond.setApellidosConductor(rs.getString(4));
                cond.setEdadConductor(rs.getString(5));
                cond.setSueldo(rs.getString(6));
                cond.setFechaIngreso(rs.getString(7));
                cond.setDisponibilidad(rs.getString(8));
            }
        } catch (Exception e) {
        }
        return cond;
    }
     
     public int actualizar(Conductor cond){
        int r=0;
        String sql="UPDATE conductor SET dpi_conductor=?, nombres_conductor=?, apellidos_conductor=?, edad_conductor=?, sueldo=?, fecha_ingreso=TO_DATE(?, 'DD/MM/YYYY HH12:MI AM'), disponibilidad=? WHERE (id_conductor=?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, cond.getDpiConductor());
            ps.setString(2, cond.getNombresConductor());
            ps.setString(3, cond.getApellidosConductor());
            ps.setString(4, cond.getEdadConductor());
            ps.setString(5, cond.getSueldo());
            ps.setString(6, cond.getFechaIngreso());
            ps.setString(7, cond.getDisponibilidad());
            ps.setString(8, cond.getIdConductor());
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
     
     public void eliminar(String idConductor, String correo) {
        String sql="{call elimina_conductor (?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, idConductor);
            cs.setString(2, correo);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
     
     public List buscar(String texto){
        List <Conductor> lista = new ArrayList<>();
        String sql="SELECT * FROM conductor WHERE id_conductor LIKE '%"+texto+"%' OR dpi_conductor LIKE '%"+texto+"%' OR nombres_conductor LIKE '%"+texto+"%' OR apellidos_conductor LIKE '%"+texto+"%' OR edad_conductor LIKE '%"+texto+"%' OR sueldo LIKE '%"+texto+"%' OR fecha_ingreso LIKE '%"+texto+"%' OR disponibilidad LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Conductor cond = new Conductor();
                cond.setIdConductor(rs.getString(1));
                cond.setDpiConductor(rs.getString(2));
                cond.setNombresConductor(rs.getString(3));
                cond.setApellidosConductor(rs.getString(4));
                cond.setEdadConductor(rs.getString(5));
                cond.setSueldo(rs.getString(6));
                cond.setFechaIngreso(rs.getString(7));
                cond.setDisponibilidad(rs.getString(8));
                lista.add(cond);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
