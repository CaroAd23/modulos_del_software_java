
package registrosIniciosDeSesion;

import cuentas.Cuentas;
import java.time.Duration;
import java.time.LocalDateTime;


public class AsignarRegistros {
    public static void main(String[] args){
        LocalDateTime fechaInicio= LocalDateTime.of(2024, 8, 22, 10, 30);
    Duration duracionSesion= Duration.ofMinutes(45);
    
    RegistroInicios nuevoInicio= new RegistroInicios(fechaInicio, duracionSesion);
    
    Cuentas miNuevaCuenta= new Cuentas("migel", "angel@gmail.com", "contraseñanew", nuevoInicio);
    
 
   
    
    }

   
    
    
    
    
}
