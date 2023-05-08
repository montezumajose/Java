package Conector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conector {
    public static final String URL = "jdbc:mysql://localhost:3306/colegio";
    public static final String USER = "root";
    public static final String CLAVE = "montezuma29@";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
