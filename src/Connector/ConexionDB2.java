
package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB2 {
        Connection con;
    public ConexionDB2() throws SQLException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/software_de_registro1", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("error: " + ex);
        }
        
    
    }
    

    public Connection getConection() {
       return con;
    }
}
