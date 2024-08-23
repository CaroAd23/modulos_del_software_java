
package usuarios.CRUD;

import Connector.ConexionDB2;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUDeliminar {
    public static void main(String[] args) throws SQLException{
        ConexionDB2 crud4 = new ConexionDB2();
        
        Connection cn;
        Statement st;
        ResultSet rs;
        
        int id_delete=5;
        
        String sql="DELETE FROM usuarios where idUsuarios='"+id_delete+"'";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDeliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cn=crud4.getConection();
        st=cn.createStatement();
        st.executeUpdate(sql);
        rs=st.executeQuery("SELECT *FROM usuarios");
        rs.next();
        
        do{
            System.out.println(rs.getString("nombre") +":"+rs.getString("apellidos")+":"+rs.getInt("idUsuarios"));
        
        }while(rs.next());
        
        
    
    }
}
