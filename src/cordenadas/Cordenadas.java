package cordenadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cordenadas {

    public static void main(String[] args) {
        double Lat;
        double Long;
        String url = "jdbc2:mysql://localhost:3306/coordenadas";
        String usuario = "root";
        String clave = "mysql2017";
        Connection conexion;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.print("Por fin");


            for (int i=3;i<10;i++){
            String cadena = "INSERT INTO ejemplo(idEjemplo,dato) VALUES ("+i+",1)";
            
            // Crear un objeto sentencia.
            Statement sentencia;
            sentencia = conexion.createStatement();
            //Ejecutar sentencia.
            sentencia.execute(cadena);
            }

        } catch (SQLException ex) {
            System.out.print("No me conecte");
        }


    }

}
