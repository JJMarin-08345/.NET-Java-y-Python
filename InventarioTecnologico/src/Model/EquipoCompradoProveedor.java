
package Model;

/**
@author Juan Jose Marin
**/
//Se usara esta clase para el Listado de Equipos comprados a cada proveedor

public class EquipoCompradoProveedor {
    
    //Atributos
    private String Serial;
    private String Marca;
    private String Modelo;
    private String RazonSocial;
    private String Correo;
    
    //Constructores
    public EquipoCompradoProveedor(){
    }
    
    public EquipoCompradoProveedor(String Serial,String Marca,String Modelo,
            String RazonSocial,String Correo){
        this.Serial=Serial;
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.RazonSocial=RazonSocial;
        this.Correo=Correo;
    }
    
    //Metodos getter and setter

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
