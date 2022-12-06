
package Model;

import java.time.LocalDate;

/**
@author Juan Jose Marin
**/
public class PartesPcView extends PartesPC{
    //
    private String Equipo;
    private String Proveedor; 
    private String UbiParte;
    
    //Constructores
    public PartesPcView() {
    }

    public PartesPcView(String Equipo, String Proveedor, String UbiParte, int PartesPCId, String Nombre, String Serial, String Partes_Marca, LocalDate FechaCompraPartes) {
        super(PartesPCId, Nombre, Serial, Partes_Marca, FechaCompraPartes);
        this.Equipo = Equipo;
        this.Proveedor = Proveedor;
        this.UbiParte = UbiParte;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getUbiParte() {
        return UbiParte;
    }

    public void setUbiParte(String UbiParte) {
        this.UbiParte = UbiParte;
    }
}
