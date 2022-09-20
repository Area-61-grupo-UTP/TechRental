package beans;
import java.sql.Date;

public class Renting {
    private int id;
    private String username;
    private Date fecha;
    private String tipo;
    private int equipos_disponibles;

    public Renting(int id, String username, Date fecha, String tipo, int equipos_disponibles) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.tipo = tipo;
        this.equipos_disponibles = equipos_disponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEquipos_disponibles() {
        return equipos_disponibles;
    }

    public void setEquipos_disponibles(int equipos_disponibles) {
        this.equipos_disponibles = equipos_disponibles;
    }

    @Override
    public String toString() {
        return "Renting{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", tipo=" + tipo + ", equipos_disponibles=" + equipos_disponibles + '}';
    }
    
    


}
