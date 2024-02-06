
package Model;

/**
 *
 * @author Juan Jose Marin
 */
public class EquipoXCuentadante {
    //Atributos
    private String Documento;
    private String Nombres;
    private String Apellidos;
    private String Serial;
    private String Marca;
    private String Modelo;
    
    //Metodos
    //Constructores
    public EquipoXCuentadante() {
    }

    public EquipoXCuentadante(String Documento, String Nombres, String Apellidos, String Serial, String Marca, String Modelo) {
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    //Getter && Seter

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

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
    
}
