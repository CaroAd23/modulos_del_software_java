
package usuarios;

import cuentas.Cuentas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import registrosIniciosDeSesion.RegistroInicios;

public class Usuarios {
   
    /*atributos de la clase:*/
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    /*Con el fin de asociar las clases cuentas y usuarios se crea 
    un atributo del tipo cuentas dentro de la clase usuarios*/
    private Cuentas cuenta;
  private RegistroInicios nuevoInicio;
    
    /*metodos constructores de la clase:*/
  
  public Usuarios(){
  
  }
    public Usuarios( String nombre, String apellidos, String correo, String contraseña){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correo=correo;
        this.contraseña=contraseña;
        /*Con esta instancia de la clase cuenta se guardan los datos 
        de la cuenta juntamente con los del usuario.*/
        this.cuenta =new Cuentas(nombre, correo, contraseña,nuevoInicio);
    }
    /*metodos setters y getters de la clase, para que los atributos 
    de la misma puedan ser accedidos desde otras clases dentro o fuera del mismo paquete.
    */
    //setters y getters para el nombre:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //setters y getters para el apellido:
      public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //seters y geters para el correo:
     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //seters y geters para la contraseña:

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    //metodos de la clase usuario:
    /*Dado que este es un software de registro de usuarios
    su funcionalidad principal deberá ser permitir a usuarios registrarse
    e iniciar sesion.*/
    
    public void registrarUsuarios(){
        /*Para empezar se debe establecer la conexion con la base de datos para 
        lograr registrar los datos del usuario en la base de datos. */
         String url = "jdbc:mysql://localhost:3306/software_de_registro1";
        String usuario = "root";
        String contraseñaBD = "";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseñaBD)) {
            // Preparar la sentencia SQL para insertar el usuario
            String sql = "INSERT INTO usuarios (nombre, apellidos, correo, contraseña) VALUES ('"+nombre+"', '"+apellidos+"', '"+correo+"', '"+contraseña+"')";
            try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setString(3, correo);
                ps.setString(4, contraseña);

                // Ejecutar la sentencia
                ps.executeUpdate();
                System.out.println("Usuario registrado correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al registrar el usuario.");
        }
    }
    
    /*metodo iniciarSesion el cual verifica que el correo electonico,
    y la contraseña ingresados coinsidan con los datos guardados.*/
    public boolean iniciarSesion(String _correo, String _contraseña){
    return this.correo.equals(_correo) && this.contraseña.equals(_contraseña);
    }
    
     public static void main(String[] args) {
        // Ejemplo de uso del metodo registrarUsuarios
        Usuarios nuevoUsuario = new Usuarios("Juan", "Pérez", "juan@example.com", "secreto123");
        nuevoUsuario.registrarUsuarios();
    }

   
    
    }
    
 
   
   
  
      


    
    

