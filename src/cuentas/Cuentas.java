
package cuentas;
//paquetes para la conexion, e importaciones para conexion con otras clases 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import registrosIniciosDeSesion.RegistroInicios;
import tiposDeCuentas.TiposCuentas;

public class Cuentas {
    //atributos de la clase cuentas:
   private String nombreUsuario;
   private String CorreoElectronico;
   private String contraseña;
   private int id;
   private TiposCuentas tipos;
   private RegistroInicios nuevoInicio;
  
   
   //constructor principal de la clase cuentas:
        public Cuentas(String nombre, String correo, String contraseña, RegistroInicios nuevoInicio){
            this.nombreUsuario=nombre;
            this.CorreoElectronico=correo;
            this.contraseña=contraseña;
            this.nuevoInicio=nuevoInicio;
     
        }
        //metodo para registrar las cuentas de usuario
        public void registrarCuenta(){
            //conexion con base de datos
            String url="jdbc:mysql://localhost:3306/software_de_registro1";
            String usuarioDB="root";
            String contraseñaDB="";
            
           try(Connection conn= DriverManager.getConnection(url, usuarioDB, contraseñaDB)){
            //insercion de datos de la cuenta en base de datos
             String sql = "INSERT INTO cuentas (nombre, correo, contraseña) VALUES ('"+nombreUsuario+"', '"+ CorreoElectronico+"', '"+contraseña+"', '"+tipos+"')";
            try(PreparedStatement stmt = conn.prepareStatement(sql)){
                
                stmt.setString(1, this.nombreUsuario);
                stmt.setString(2, this.CorreoElectronico);
                stmt.setString(3, this.contraseña);
                stmt.setString(4, this.tipos.getTipo());
                stmt.executeUpdate();
            
            }
            System.out.println("Cuenta registrada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al registrar la cuenta.");
        }
            
        }
        //metodo para iniciar sesion con la cuenta de usuario:
        public boolean iniciarSesion(String nombreUsuario, String contrasena) {
       return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contrasena);
        }
        
        //metodo main de la clase, para que esta pueda ejecutarse.
      public static void main(String[] args){
          
      
      }
//atributo de tipo object para obtener datos sobre los registros de inicio de sesion,
      //relacionados con la clase RegistroInicios.
    public Object getRegistroInicios() {
    return nuevoInicio;
    
    }
        }
        
    
    
   
   
   
   
    
    
  
    
    
    
    

