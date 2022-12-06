
package Model;

public class Ubicacion_Pc {
    //Atributos
    private int UbicacionPcId;
    private String Descripcion;
    
    //Metodos
    public Ubicacion_Pc(){
    }
    
    public Ubicacion_Pc(int UbicacionPcId, String Descripcion) {
        this.UbicacionPcId = UbicacionPcId;
        this.Descripcion = Descripcion;
    }

    public int getUbicacionPcId() {
        return UbicacionPcId;
    }

    public void setUbicacionPcId(int UbicacionPcId) {
        this.UbicacionPcId = UbicacionPcId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
