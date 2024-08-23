
package usuarios;

/*en esta clase se busca instanciar objetos de la clase usuario
e implementar el metodo inicarSesion para verificar las credenciales de acceso*/
public class serviceIniciarSesion {
    public static void main(String[] args){
     Usuarios usuario1= new Usuarios("Armando", "Casas", "Armando123@gmail.com", "contraseÑaSeGura123");
       
     String correoIngresado = usuario1.getCorreo();
String contrasenaIngresada = usuario1.getContraseña();

if (usuario1.iniciarSesion(correoIngresado, contrasenaIngresada)) {
    System.out.println("Inicio de sesión exitoso. ¡Bienvenido!" + usuario1.getNombre());
} else {
    System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
}
    
    }
    
}
