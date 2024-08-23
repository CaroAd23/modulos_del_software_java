/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.CRUD;

import Connector.ConexionDB2;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USUARIO
 */
public class CRUDeditar {
    public static void main(String[] args) throws SQLException{
        ConexionDB2 crud3= new ConexionDB2();
        
        Connection cn;
        Statement st;
        ResultSet rs;
        
        int id_new= 10;
        String _nombre="caro";
        String _apellido="david";
        String _correo="weirueoih ";
        String _contraseña="78901";
        String sql="UPDATE usuarios SET nombre='"+_nombre+"', apellidos='"+_apellido+"', correo='"+_correo+"', contraseña='"+_contraseña+"' where idUsuarios='"+id_new+"'";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDeditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cn=crud3.getConection();
        st=cn.createStatement();
        st.executeUpdate(sql);
        rs=st.executeQuery("SELECT * FROM usuarios");
        rs.next();
        
        do{
            System.out.println(rs.getString("nombre")+ ":" + rs.getString("apellidos") + ": " +rs.getInt("idUsuarios"));
        
        }while(rs.next());
        
        
        
    
    }
}
