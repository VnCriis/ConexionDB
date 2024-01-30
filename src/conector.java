import java.sql.*;

public class conector {
    String dbHost = "jdbc:mysql://localhost:3306/estudiantes";
    String dbuserName = "root";
    String dbPassword = "";


    String mensaje;

    public conector(String dbHost, String dbuserName, String dbPassword) {
        this.dbHost = dbHost;
        this.dbuserName = dbuserName;
        this.dbPassword = dbPassword;
    }

    public conector() {

    }

    public void conexionLocal(String dbHost, String dbuserName, String dbPassword){
        try(Connection connection = DriverManager.getConnection(dbHost,dbuserName,dbPassword)) {
            if (connection != null){
                mensaje = "Conexion correcta";
                System.out.println("Conexion correcta");
            }
        }
        catch (SQLException e){
            mensaje = "Conexion Fallida";
            System.out.println("Error en la conexion");
        }
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
