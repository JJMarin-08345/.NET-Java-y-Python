
package Model;

public class UbicacionPartes {
    private int UbucacionPartesId;
    private String Descripcion;
    
    //Constructores

    public UbicacionPartes() {
    }

    public UbicacionPartes(int UbucacionPartesId, String Descripcion) {
        this.UbucacionPartesId = UbucacionPartesId;
        this.Descripcion = Descripcion;
    }
    public UbicacionPartes(String Descripcion){
        this.Descripcion=Descripcion;
    }
    
    //Metodos

    public int getUbucacionPartesId() {
        return UbucacionPartesId;
    }

    public void setUbucacionPartesId(int UbucacionPartesId) {
        this.UbucacionPartesId = UbucacionPartesId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
