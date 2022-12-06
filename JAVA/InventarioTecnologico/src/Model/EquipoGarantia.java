
package Model;

import java.util.Date;

public class EquipoGarantia {
    //Atrinutos
    private String Serial;
    private String Marca;
    private String Modelo;
    private Date FechaCompra;
    private Date FechaVencimiento;
    
    //Metodo constructor
    public EquipoGarantia() {
    }

    public EquipoGarantia(String Serial, String Marca, String Modelo, Date FechaCompra, Date FechaVencimiento) {
        this.Serial = Serial;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.FechaCompra = FechaCompra;
        this.FechaVencimiento = FechaVencimiento;
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

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }
    
    
}
