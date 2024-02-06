
package Model;

public class Proveedor {
    //Atributes
    private int ProveedorId;
    private String NIT;
    private String RazonSocial;
    private String Direccion;
    private String Correo;
    private  String Telefono;

    //Constructors
    public Proveedor() {
    }
    
    //SIn el ProveedorId
    public Proveedor(String NIT, String RazonSocial, String Direccion, String Correo, String Telefono) {
        this.NIT = NIT;
        this.RazonSocial = RazonSocial;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
    
    //Con el ProovedorId
    public Proveedor(int ProveedorId, String NIT, String RazonSocial, String Direccion, String Correo, String Telefono) {
        this.ProveedorId = ProveedorId;
        this.NIT = NIT;
        this.RazonSocial = RazonSocial;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
    
    //Metodos
    public int getProveedorId() {
        return ProveedorId;
    }
    public void setProveedorId(int ProveedorId){
        this.ProveedorId=ProveedorId;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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
    
    
}
