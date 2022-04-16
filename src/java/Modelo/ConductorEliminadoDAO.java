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
public class ConductorEliminadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar(){
        List <ConductorEliminado>lista = new ArrayList<>();
        String sql="SELECT id_conductor_eliminado, dpi_conductor, nombres_conductor, apellidos_conductor, edad_conductor, sueldo, to_char(fecha_ingreso, 'DD/MM/YYYY HH:MI AM'), to_char(fecha_eliminacion, 'DD/MM/YYYY HH:MI AM'), correo FROM conductor_eliminado";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                ConductorEliminado condEli = new ConductorEliminado();
                condEli.setIdConductorEliminado(rs.getString(1));
                condEli.setDpiConductorEliminado(rs.getString(2));
                condEli.setNombresConductorEliminado(rs.getString(3));
                condEli.setApellidosConductorEliminado(rs.getString(4));
                condEli.setEdadConductorEliminado(rs.getString(5));
                condEli.setSueldoConductorEliminado(rs.getString(6));
                condEli.setFechaIngresoConductorEliminado(rs.getString(7));
                condEli.setFechaEliminacion(rs.getString(8));
                condEli.setCorreo(rs.getString(9));
                lista.add(condEli);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
     
    public List buscar(String texto){
        List <ConductorEliminado> lista = new ArrayList<>();
        String sql="SELECT * FROM conductor_eliminado WHERE dpi_conductor LIKE '%"+texto+"%' OR nombres_conductor LIKE '%"+texto+"%' OR apellidos_conductor LIKE '%"+texto+"%' OR edad_conductor LIKE '%"+texto+"%' OR fecha_ingreso LIKE '%"+texto+"%' OR fecha_eliminacion LIKE '%"+texto+"%' OR correo LIKE '%"+texto+"%'";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                ConductorEliminado condEli = new ConductorEliminado();
                condEli.setIdConductorEliminado(rs.getString(1));
                condEli.setDpiConductorEliminado(rs.getString(2));
                condEli.setNombresConductorEliminado(rs.getString(3));
                condEli.setApellidosConductorEliminado(rs.getString(4));
                condEli.setEdadConductorEliminado(rs.getString(5));
                condEli.setSueldoConductorEliminado(rs.getString(6));
                condEli.setFechaIngresoConductorEliminado(rs.getString(7));
                condEli.setFechaEliminacion(rs.getString(8));
                condEli.setCorreo(rs.getString(9));
                lista.add(condEli);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public void restaurar(String idConductorEliminado) {
        String sql="{call RESTAURA_CONDUCTOR_ELIMINADO (?)}";
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, idConductorEliminado);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
}
