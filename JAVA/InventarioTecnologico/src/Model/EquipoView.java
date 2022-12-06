package Model;

import java.time.LocalDate;

/**
 *
 * @author Juan Jose Marin
 */
public class EquipoView {
    //Atributoss
    private int EquipoViewId;
    private String Serial;
    private String Marca;
    private String Modelo;
    private String Tipo;
    private LocalDate FechaCompra;
    private int VencimientoGarantia;
    private String DocYApeCuentadante;
    private String UbicacionPCId;
    private String RazonSocial;
    
    //Constructores
    
    public EquipoView(){
    }
    
    public EquipoView(int EquipoViewId, String Serial, String Marca, String Modelo,
            String Tipo, LocalDate FechaCompra, int VencimientoGarantia, String DocYApeCuentadante,
            String UbicacionPCId, String RazonSocial) {
        this.EquipoViewId = EquipoViewId;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.FechaCompra = FechaCompra;
        this.VencimientoGarantia = VencimientoGarantia;
        this.DocYApeCuentadante = DocYApeCuentadante;
        this.UbicacionPCId=UbicacionPCId;
        this.RazonSocial=RazonSocial;
    }
    
    //Metodos

    public int getEquipoViewId() {
        return EquipoViewId;
    }

    public void setEquipoViewId(int EquipoViewId) {
        this.EquipoViewId = EquipoViewId;
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

    public String getDocYApeCuentadante() {
        return DocYApeCuentadante;
    }

    public void setDocYApeCuentadante(String DocYApeCuentadante) {
        this.DocYApeCuentadante = DocYApeCuentadante;
    }

    public String getUbicacionPCId() {
        return UbicacionPCId;
    }

    public void setUbicacionPCId(String UbicacionPCId) {
        this.UbicacionPCId = UbicacionPCId;
    }   

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }
    
}
