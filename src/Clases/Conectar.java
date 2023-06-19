package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection cn;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/crudjava", "root", "1234");
            System.out.println("conectado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    }
}
