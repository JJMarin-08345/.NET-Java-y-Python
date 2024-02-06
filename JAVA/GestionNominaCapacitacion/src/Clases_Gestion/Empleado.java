package Clases_Gestion;

import Vista_frm.frmEmpleado;
import javax.swing.JOptionPane;

public class Empleado extends Persona{
    
    protected String Cargo;
    protected String Tipo;
    protected int HorasTrabajadas;
    protected int ValorHora;
    protected int Salario; //ojo, no tiene metodo set 

    public Empleado() {
    }
    
    public Empleado(String Cargo, String Tipo, int HorasTrabajadas,int ValorHora,
           String Documento, String Nombres, String Apellidos, String Genero) {
        super(Documento, Nombres, Apellidos, Genero);
        this.Cargo = Cargo;
        this.Tipo = Tipo;
        this.HorasTrabajadas = HorasTrabajadas;
        this.ValorHora = ValorHora;
    }
    
    //Cargo
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    //Tipo
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    //Horas Trabajadas
    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }
    
    //Valor Hora
    public int getValorHora() {
        return ValorHora;
    }

    public void setValorHora(int ValorHora) {
        this.ValorHora = ValorHora;
    }
    
    //get de Salario
    public int getSalario(){
        return Salario;
    }
    
    public void CalcularSalario(){
        
        if(this.HorasTrabajadas<=40){
            this.Salario = this.HorasTrabajadas * this.ValorHora;
            
        }else{
            int HorasExtras = this.HorasTrabajadas-40;
            /*
            En el reto dice que el salario se le aumenta un 50% cuando se superan las 40 horas
            Se multiplica por 1.5 porque es para no hacer lo siguiente
            .... + this.ValorHora*HorasExtras + (this.ValorHora*HorasExtras)*0.5
            */
            this.Salario = (int)(40*this.ValorHora + (this.ValorHora*HorasExtras)*1.5);
        }
    }
    
    public void IncrementoSalario(float porcentajeAumento){
        
        this.ValorHora = (int)(this.ValorHora+(this.ValorHora*(porcentajeAumento/100)));
    }
    
    public boolean validarEmpleado(Empleado emp){
        //Esta funcion retorna verdadero solo si todo esta consistente
        boolean validado=true;
        if(emp.getDocumento().length()<6){
            JOptionPane.showMessageDialog(null, "El campo Documento debe tener mínimo 7 caracteres", 
                    "Datos Inconsistentes", JOptionPane.OK_CANCEL_OPTION);
            frmEmpleado.txtDocumento.requestFocus();
            validado=false;
        }
        if(emp.getNombres().length()<3){
            JOptionPane.showMessageDialog(null, "El campo nombres debe tener mínimo 3 caracteres", 
                    "Datos Inconsistentes", JOptionPane.OK_CANCEL_OPTION);
            frmEmpleado.txtNombres.requestFocus();
            validado=false;
        }if(emp.getApellidos().length()<3){
            JOptionPane.showMessageDialog(null, "El campo apellidos debe tener mínimo 3 caracteres", 
                    "Datos Inconsistentes", JOptionPane.OK_CANCEL_OPTION);
            frmEmpleado.txtApellidos.requestFocus();
            validado=false;
        }if(emp.getCargo().length()>0){
            validado=false;
        }
        return validado;
    }
    
}
