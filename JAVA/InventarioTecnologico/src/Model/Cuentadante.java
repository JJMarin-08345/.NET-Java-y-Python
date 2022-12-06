
package Model;

public class Cuentadante {
    //Atributos
    private int CueId;
    private String Documento;
    private String Nombres;
    private String Apellidos;
    private String Correo;
    private String Telefono;
    private int CantidadEquipos;
    
    //Constructores

    public Cuentadante() {
    }

    public Cuentadante(String Documento, String Nombres, String Apellidos, String Correo, String Telefono) {
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Cuentadante(int CueId, String Documento, String Nombres, String Apellidos, 
            String Correo, String Telefono, int CantidadEquipos) {
        this.CueId = CueId;
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.CantidadEquipos = CantidadEquipos;
    }
    
    
    
    //Metodos
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getCantidadEquipos() {
        return CantidadEquipos;
    }

    public void setCantidadEquipos(int CantidadEquipos) {
        this.CantidadEquipos = CantidadEquipos;
    }

    public int getCueId() {
        return CueId;
    }

    public void setCueId(int CueId) {
        this.CueId = CueId;
    }
    
    
}
