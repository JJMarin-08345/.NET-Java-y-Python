/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Producto;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Jose Marin
 */
public class GestionProductos {

    private int Fila;
    private int EliminarFila;
    private int cantidadProductos;
    private Long PrecioTotal;
    private Long PrecioConIva;
    private final String[] NuevaFila = new String[3];//El final es para evitar que se
    //cambie su valor

    public GestionProductos() {
        this.Fila = 0;
        this.EliminarFila = 0;
        this.cantidadProductos = 0;
        this.PrecioTotal = Long.parseLong("" + 0);
        this.PrecioConIva = Long.parseLong("" + 0);
    }
    
    //Esta funcion es la encargada de llenar la tabla de 3 columnas,
    public void CantidadProductosSeleccionados(JCheckBox jCheck, JTable jTable, JTextField txtField, Producto producto) {
        //Esta tabla que recibe (en este caso) no tiene filas creadas, se van creando según el sistema las requiera
        if (jCheck.isSelected()) {
            ((DefaultTableModel) jTable.getModel()).addRow(NuevaFila);
            //Agregamos una nueva fila si el JCheckBox es seleccionado
            this.cantidadProductos++;
            txtField.setText("" + this.cantidadProductos);

            jTable.setValueAt(producto.getMarca(), this.Fila, 0);//Enviamos Marca en la columna 0 que es Marca
            jTable.setValueAt(producto.getNombre(), this.Fila, 1);//Enviamos Marca en la columna 1 que es Producto
            jTable.setValueAt(producto.getPrecio(), this.Fila, 2);//Enviamos Marca en la columna 2 que es Precio

            this.Fila++;
        } else {
            this.cantidadProductos--;
            txtField.setText("" + this.cantidadProductos);
            this.EliminarFila = EliminarFilaDeJTable(jTable, producto);
            ((DefaultTableModel) jTable.getModel()).removeRow(this.EliminarFila);
            //Eliminamos de la tabla, con el indice que retorne la funcion EliminarFIleDeJTable(...)
            this.Fila--;
        }
    }

    //Funcion para eliminar una fila completa de un JTable
    private int EliminarFilaDeJTable(JTable tabla, Producto producto) {
        int posicion = tabla.getRowCount();
        String NombreProducto = "";
        for (int i = 0; i <= posicion; i++) {
            NombreProducto = tabla.getValueAt(i, 1).toString();
            if (NombreProducto.equals(producto.getNombre())) {
                return i;
            }
        }
        return -12;
    }

    public Long TotalPagar(JCheckBox jCheck, JTextField txtPrecioSinIva,JTextField txtPrecioTotal, JTextField txtIvaProductos, Long PreciosProductos) {

        if (jCheck.isSelected()) {//Si el checBox es seleccionado, le sumamos a nuestra variable local el Precio que nos llega
            this.PrecioTotal += PreciosProductos;
            System.out.println("Nuevo producto agregado a la canasta: " + PrecioTotal);

        } else {//En caso de que se deseleccione, le restamos el valor
            this.PrecioTotal -= PreciosProductos;
            System.out.println("Un producto quitado de la canasta: " + PrecioTotal);
        }
        
        Long Iva = EnvioIva(txtIvaProductos);//Llamamos a la función, la cual es encargada de obtener
        //el IVA según nuestra variable local PrecioTotal, si hay algo, operara, de lo contrario, NO
        
        this.PrecioConIva = PrecioTotal + Iva;
        //A nuestra variable local que suma todo junto el IVA, le damos como valores el PrecioTotal, 
        //y el IVA capturado en la variable temporal (Iva)

        System.out.println("El IVA de todos los productos: "+Iva);
        System.out.println("Precio total con el IVA: "+(this.PrecioConIva));
        
        txtPrecioSinIva.setText("$"+this.PrecioTotal);//Enviamos el precio SIN IVA al JTextField
        txtPrecioTotal.setText("$" + this.PrecioConIva);//Enviamos el precio TOTAL CON IVA al JTextField
        
        System.out.println("\n\n");
        return this.PrecioConIva;
    }

    /*Funcion para obtener el iva, le pedimos el txt a donde se va a enviar para usarlo en otra función
    y evitar alargar el codigo*/
    private Long EnvioIva(JTextField txtField) {
        int IVA_Int = (int) (this.PrecioTotal * 0.19);
        Long IVA = Long.parseLong("" + IVA_Int);
        txtField.setText("$" + IVA);

        return IVA;
    }
}
