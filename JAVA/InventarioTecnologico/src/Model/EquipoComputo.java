
package Model;

import java.time.LocalDate;

/**
 @author Juan Jose Marin
 **/

public class EquipoComputo {
    //Atributos
    private int EquipoId; 
    private String Serial;
    private String Marca;
    private String Modelo;
    private String Tipo;
    private LocalDate FechaCompra;
    private int VencimientoGarantia;
    private String DocumentoCuentadante;
    private  int CuentadanteId;
    private int UbicacionId;
    private int ProveedorId;
    
    //Constructores

    public EquipoComputo() {
    }

    public EquipoComputo(int EquipoId,String Serial, String Marca, String Modelo, String Tipo, LocalDate FechaCompra,
        int VencimientoGarantia, String DocumentoCuentadante,int UbicacionId,int ProveedorId) {
        this.EquipoId=EquipoId;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.FechaCompra = FechaCompra;
        this.VencimientoGarantia = VencimientoGarantia;
        this.DocumentoCuentadante = DocumentoCuentadante;
        this.UbicacionId=UbicacionId;
        this.ProveedorId=ProveedorId;
    }
    
    public EquipoComputo(String Serial, String Marca, String Modelo, String Tipo, LocalDate FechaCompra,
            int VencimientoGarantia, String DocumentoCuentadante,int UbicacionId,int ProveedorId) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.FechaCompra = FechaCompra;
        this.VencimientoGarantia = VencimientoGarantia;
        this.DocumentoCuentadante = DocumentoCuentadante;
        this.UbicacionId=UbicacionId;
        this.ProveedorId=ProveedorId;
    }
    
    public EquipoComputo(String Serial, String Marca, String Modelo, String Tipo, LocalDate FechaCompra,
            int VencimientoGarantia, int CuentadanteId,int UbicacionId,int ProveedorId) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.FechaCompra = FechaCompra;
        this.VencimientoGarantia = VencimientoGarantia;
        this.CuentadanteId = CuentadanteId;
        this.UbicacionId=UbicacionId;
        this.ProveedorId=ProveedorId;
    }
    
    //Metodos
    public int getEquipoId() {
        return EquipoId;
    }
    
    public void setEquipoId(int EquipoId){
        this.EquipoId=EquipoId;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public LocalDate getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(LocalDate FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getVencimientoGarantia() {
        return VencimientoGarantia;
    }

    public void setVencimientoGarantia(int VencimientoGarantia) {
        this.VencimientoGarantia = VencimientoGarantia;
    }

    public String getDocumentoCuentadante() {
        return DocumentoCuentadante;
    }

    public void setDocumentoCuentadante(String DocumentoCuentadante) {
        this.DocumentoCuentadante = DocumentoCuentadante;
    }

    public int getUbicacionId() {
        return UbicacionId;
    }

    public void setUbicacionId(int UbicacionId) {
        this.UbicacionId = UbicacionId;
    }

    public int getCuentadanteId() {
        return CuentadanteId;
    }

    public void setCuentadanteId(int CuentadanteId) {
        this.CuentadanteId = CuentadanteId;
    }

    public int getProveedorId() {
        return ProveedorId;
    }

    public void setProveedorId(int ProveedorId) {
        this.ProveedorId = ProveedorId;
    }
}
