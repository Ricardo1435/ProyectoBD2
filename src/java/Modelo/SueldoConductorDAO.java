package Modelo;
import Config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SueldoConductorDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
     public void aumentoSueldoLabor(String anio, String cantidadAumentoUno) {
        String sql="{call AUMENTA_SUELDO_LABOR (?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, anio);
            cs.setString(2, cantidadAumentoUno);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
     
       public void aumentoSueldoEdad(String edad, String cantidadAumentoDos) {
        String sql="{call AUMENTA_SUELDO_EDAD (?,?)}";
        
        try {
            con=c.conectar();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, edad);
            cs.setString(2, cantidadAumentoDos);
            cs.executeUpdate();
        } catch (Exception e) {
            
        }
    }
}
