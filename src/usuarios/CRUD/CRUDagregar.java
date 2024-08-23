
package usuarios.CRUD;
/*Paquetes y componentes nesesarios para establecer la conexion y 
ejecutar la consulta*/
import Connector.ConexionDB2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUDagregar {
    /*metodo main, para definir la connexion con la base de datos, instanciando 
    la clase conexionDB2 que contiene todos los parametros para la conexion.*/
    
    public static void main(String[] args) throws SQLException{
        /*Instacia de la clase que contine los parametros de conexion*/
    ConexionDB2 crud = new ConexionDB2();
    Connection con;
    Statement st;
    ResultSet rs;
    
    /*Variables con los datos para enviar a la base de datos*/
    String nombre="Alejandro";
    String apellidos="Mendoza";
    String correo="almendz@feddw.com";
    String contraseña="12345678";
  
    String sql="INSERT INTO usuarios(nombre, apellidos, correo, contraseña ) values('"+nombre+"', '"+apellidos+"', '"+correo+"', '"+contraseña+"' )";
    
    /*identificacion del Driver*/
     try{
     Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException ex){
        Logger.getLogger(CRUDagregar.class.getName()).log(Level.SEVERE, null, ex);    
    }
     /*Ejecucion del Query*/
    try{
    con=crud.getConection();
    st=con.createStatement();
    st.executeUpdate(sql);
    rs=st.executeQuery("SELECT * FROM usuarios ");
    rs.next();
    
    do{
    System.out.println(rs.getString("nombre")+"-"+rs.getString("apellidos")+"-"+rs.getString("contraseña"));
    
    }while (rs.next());
    
    
    }catch (SQLException ex){
        Logger.getLogger(CRUDagregar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    
    
    
    
    
 
    }

}
