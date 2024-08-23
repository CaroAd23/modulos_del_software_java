
package registrosIniciosDeSesion;
//paquetes para la definicion de fecha, hora y duracion.
import java.time.Duration;
import java.time.LocalDateTime;


public class RegistroInicios {
    private LocalDateTime fecha;
    private Duration duracion;
    
    //metodo constructor de la clase.
    public RegistroInicios(LocalDateTime _fecha, Duration _duracion){
    this.fecha=_fecha;
    this.duracion=_duracion;
    
    }
    //metodos accesores para la fecha y la duracion de las sesiones.
    public LocalDateTime getFecha(){
        return fecha;
    
    }
    public Duration getDuracion(){
        return duracion;
    
    }
    
    
    
}
