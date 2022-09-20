package test;
import beans.Equipo;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
        actualizarEquipo(1, "Laptop");
        listarEquipo();
        
    }
    
    public static void actualizarEquipo(int id, String tipo) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE equipo SET tipo ='"+ tipo +"'WHERE id="+ id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.descconectar();
        }
    
    }
    public static void listarEquipo(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM equipo";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                String marca = rs.getString("marca");
                int equipos_disponibles = rs.getInt("equipos_disponibles");
                
                Equipo equipos = new Equipo(id,descripcion,tipo,marca,equipos_disponibles);
                System.out.println(equipos.toString());   
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.descconectar();
        }
    }
}
