
package tiposDeCuentas;


public class TiposCuentas {
    //atributos que definen los posibles tipos de cuentas.
    private String tipo="";
    private String tipo1="cuenta personal";
    private String tipo2="cuenta estudiantil";
    private String tipo3="cuenta de empresa";
    //metodo constructor de la clase.
    public TiposCuentas(String tipo){
        this.tipo=tipo;
       
    }
//getters y setters para tipo:
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
//getters y setters para tipo1:
    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }
//getters y setters para tipo2:
    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
//getters y setters para tipo3:
    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }
    
    
    
    
    
    
    
}
