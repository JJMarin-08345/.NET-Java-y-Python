
package Model;

import java.time.LocalDate;
/**
@author Juan Jose Marin
**/
public class PartesPC {
    //Atributos
    protected int PartesPCId;
    protected String Nombre;
    protected String Serial;
    protected String Partes_Marca;
    protected LocalDate FechaCompraPartes;
    private int GarantiaVecnePartes;
    private int EquipoId;
    private int ProveedorId;
    private int UbiParteId;
    
    //Constructores

    public PartesPC() {
    }

    public PartesPC(int PartesPCId, String Nombre, String Serial, String Partes_Marca, LocalDate FechaCompraPartes) {
        this.PartesPCId = PartesPCId;
        this.Nombre = Nombre;
        this.Serial = Serial;
        this.Partes_Marca = Partes_Marca;
        this.FechaCompraPartes = FechaCompraPartes;
    }
    
    public PartesPC(String Nombre,String Serial, String Partes_Marca, LocalDate FechaCompraPartes,
            int GarantiaVecnePartes, int EquipoId, int ProveedorId, int UbiParteId) {
        this.Nombre=Nombre;
        this.Serial = Serial;
        this.Partes_Marca = Partes_Marca;
        this.FechaCompraPartes = FechaCompraPartes;
        this.GarantiaVecnePartes = GarantiaVecnePartes;
        this.EquipoId = EquipoId;
        this.ProveedorId = ProveedorId;
        this.UbiParteId=UbiParteId;
    }
    
    public PartesPC(int PartesPCId, String Serial, String Partes_Marca, LocalDate FechaCompraPartes,
            int GarantiaVecnePartes, int EquipoId, int ProveedorId, int UbiParteId) {
        this.PartesPCId = PartesPCId;
        this.Serial = Serial;
        this.Partes_Marca = Partes_Marca;
        this.FechaCompraPartes = FechaCompraPartes;
        this.GarantiaVecnePartes = GarantiaVecnePartes;
        this.EquipoId = EquipoId;
        this.ProveedorId = ProveedorId;
        this.UbiParteId=UbiParteId;
    }
    
    //Metodos
    
    public int getPartesPCId() {
        return PartesPCId;
    }
    
    public void setPartesPCId(int PartesPCId){
        this.PartesPCId=PartesPCId;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getPartes_Marca() {
        return Partes_Marca;
    }

    public void setPartes_Marca(String Partes_Marca) {
        this.Partes_Marca = Partes_Marca;
    }

    public LocalDate getFechaCompraPartes() {
        return FechaCompraPartes;
    }

    public void setFechaCompraPartes(LocalDate FechaCompraPartes) {
        this.FechaCompraPartes = FechaCompraPartes;
    }

    public int getGarantiaVecnePartes() {
        return GarantiaVecnePartes;
    }

    public void setGarantiaVecnePartes(int GarantiaVecnePartes) {
        this.GarantiaVecnePartes = GarantiaVecnePartes;
    }

    public int getEquipoId() {
        return EquipoId;
    }

    public void setEquipoId(int EquipoId) {
        this.EquipoId = EquipoId;
    }

    public int getProveedorId() {
        return ProveedorId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setProveedorId(int ProveedorId) {
        this.ProveedorId = ProveedorId;
    }
    
    public int getUbiParteId() {
        return UbiParteId;
    }

    public void setUbiParteId(int UbiParteId) {
        this.UbiParteId = UbiParteId;
    }
}
