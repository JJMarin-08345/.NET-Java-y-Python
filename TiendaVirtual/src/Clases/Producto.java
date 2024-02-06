package Clases;

/**
 *
 * @author Juan Jose Marin
 */
public class Producto {

    private String Marca;
    private String Nombre;
    private String Precio;
    private Long Valor;

    public Producto() {
    }

    public Producto(String Marca, String Nombre, String Precio) {
        this.Marca = Marca;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public Producto(String Marca, String Nombre, String Precio, Long Valor) {
        this.Marca = Marca;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Valor = Valor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public Long getValor() {
        return this.Valor;
    }

    public void setValor(Long Valor) {
        this.Valor = Valor;
    }

}
