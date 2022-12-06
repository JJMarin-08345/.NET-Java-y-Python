
package Controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
Es de recordar que este proyecto funciona con una base de datos la cual ya está 
creada localmente
*/

public class Conexion {
    //Atributos
    protected Connection con; //Almacenar una cadena de conexion
    protected PreparedStatement ps;//Almacenar sentencia sql
    protected ResultSet rs;//Almacenar retornos desde la base de datos
    
    //Metodos
    
    //Constructor x defecto
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//Maneja el dirver mySQL
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institucion","root","");
            //JOptionPane.showMessageDialog(null,"Conectado con exito");
            
        }catch (HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion con el servidor o servidor desconectado");
            this.con=null;
            //JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return this.con;
    }
}
