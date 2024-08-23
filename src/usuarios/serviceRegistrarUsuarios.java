
package usuarios;

/*en esta clase se busca instanciar objetos del tipo usuarios
e implementar el metodo registrar usuarios, para almacenar sus 
credenciales en bases de datos.*/
public class serviceRegistrarUsuarios {
    public static void main(String[] args){
      Usuarios nuevoUsuario = new Usuarios("Juan", "Pérez", "juan@example.com", "secreto123");
       nuevoUsuario.registrarUsuarios();
    
    }
}
