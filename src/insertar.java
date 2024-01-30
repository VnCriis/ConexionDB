import java.sql.*;

public class insertar {
    String nombre;
    String cedula;
    int calificacion1;
    int calificacion2;

    public insertar(String nombre, String cedula, int calificacion1, int calificacion2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }

    public insertar() {
    }
    public void ingresoDatos(String nombre, String cedula, int calificacion1, int calificacion2){
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes","root","")){
           String sql = "INSERT INTO calificaciones(nombre,cedula,calificacion1,calificacion2)values(?,?,?,?)";
           try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
               preparedStatement.setString(1,nombre);
               preparedStatement.setString(2,cedula);
               preparedStatement.setInt(3,calificacion1);
               preparedStatement.setInt(4,calificacion2);
               int filasAfectadas = preparedStatement.executeUpdate();
               if (filasAfectadas > 0){
                   System.out.println("Ingreso de datos exitoso");
               }
               else{
                   System.out.println("Ingreso fallido");
               }
           }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
