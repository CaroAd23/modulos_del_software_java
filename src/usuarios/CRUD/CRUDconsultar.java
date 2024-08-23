
package usuarios.CRUD;

import Connector.ConexionDB2;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUDconsultar {
    /*metodo main para la consulta de informacion*/
    public static void main(String[] args) throws SQLException{
        ConexionDB2 crud2= new ConexionDB2();
        Connection cn;
        Statement st;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDconsultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cn=crud2.getConection();
        st=cn.createStatement();
        rs=st.executeQuery("SELECT * FROM usuarios");
        rs.next();
        
        do{
            System.out.println(rs.getString("nombre")+ ": " + rs.getString("apellidos") + ": " + rs.getInt("idUsuarios"));
        
        }while(rs.next());
        
        
    
    }
    
    
}
