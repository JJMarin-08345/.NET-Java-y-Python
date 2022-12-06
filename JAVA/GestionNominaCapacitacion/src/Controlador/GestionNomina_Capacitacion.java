package Controlador;

import java.util.ArrayList;
import Clases_Gestion.*;
import javax.swing.JOptionPane;

public class GestionNomina_Capacitacion {
    //Atributos
    private String Nit;
    private String Nombre;
    private String Direccion;
    private  ArrayList<Empleado> lstEmpleado;
    private ArrayList<Estudiante> lstEstudiante;
    private ArrayList<Directivo> lstDirectivo;
    
    //Metodos
    public int CantidadEmpleados(){
        int Cemp=this.lstEmpleado.size();
        return Cemp;
    }
    public GestionNomina_Capacitacion() {
        this.lstEmpleado=new ArrayList<>();
        this.lstEstudiante=new ArrayList<>();
    }
    
    public boolean GuardarEmpleado(Empleado emp){
        boolean existencia=false;
        
        for (Empleado buscador:this.lstEmpleado){
            if(emp.getDocumento().equals(buscador.getDocumento())){
                existencia=true;
                break;
            }
        }
        if(existencia==false && validarEmpleado(emp)){
            JOptionPane.showMessageDialog(null,"El empleado ha sido guardado con exito");
            this.lstEmpleado.add(emp);
            
        }else{
            JOptionPane.showMessageDialog(null,"Ya existe un empleado con este mismo documento: "+emp.getDocumento());
        }
        return existencia;
    }
    //Buscar empleado por Documento
    public Empleado BuscarEmpleadoDocumento(String doc,boolean apareceJOption){
        Empleado empDoc=null;
        
        for (Empleado buscador:this.lstEmpleado){
            if(buscador.getDocumento().equals(doc)){
                empDoc=buscador;
                break;
            }
        }
        if(empDoc==null){
            if(apareceJOption){
                JOptionPane.showMessageDialog(null, "No se encontró el empleado con el documento: " 
                        +doc);
            }
        }
        return empDoc;
    }
    //Buscar empleado por nombre
    public ArrayList<Empleado> BuscarEmpleadoNombre(String nombre){
        ArrayList<Empleado> empNom=new ArrayList<>();
        
        for (Empleado buscador:this.lstEmpleado){
            if(buscador.getNombres().contains(nombre)){
                empNom.add(buscador);
            }
        }
        if(empNom.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay ningun empleado con el nombre "+nombre);
        }
        
        return empNom;
    }
    //Buscar empleado por Apellido
    public ArrayList<Empleado> BuscarEmpleadoApe(String apellio){
        ArrayList<Empleado> empApe=new ArrayList<>();
        
        for(Empleado buscador:this.lstEmpleado){
            if(buscador.getApellidos().contains(apellio)){
                empApe.add(buscador);
            }
        }
        if(empApe.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay ningun empleado con el apellido "+apellio);
        }
        return empApe;
    }
    
    //Eliminar empleado
    public void EliminarEmpleado(String doc){
        boolean existe=false;
        for(Empleado eliminador:this.lstEmpleado){
            if(eliminador.getDocumento().equals(doc)){
                existe=true;
                this.lstEmpleado.remove(eliminador);
                JOptionPane.showMessageDialog(null,"Eliminacion completada");
                break;
            }
        }if(existe==false){
            JOptionPane.showMessageDialog(null,"No se encontro el empleado");
        }
    }
    
    public void ModificarEmpleado(Empleado emp){//Pendiente de revisión
        for (int buscador=0; buscador<this.lstEmpleado.size(); buscador++){
            if(validarEmpleado(emp)){
                this.lstEmpleado.set(buscador, emp);
                JOptionPane.showMessageDialog(null,"Modificado con exito");
                break;
            }
        }
    }
    //Listar empleado
    public ArrayList<Empleado> ListarEmpleado(){
        if(lstEmpleado.size()<0){
            JOptionPane.showMessageDialog(null,"No hay ningún empleado registrado");
        }
        return lstEmpleado;
    }
    //Validacion de empleados
    private boolean validarEmpleado(Empleado emp){
        if(emp.getDocumento().length()<6){
                JOptionPane.showMessageDialog(null, "El documento debe tener mínimo 7 caracteres");
                if(emp.getNombres().length()<2){
                    
                }
            return false;
        }
        return true;
    }
    
    //Guardar estudiante verificando su Documento
    //Si este se repite, NO se guarda, de lo contrario, SI
    public void guardarEstudiante(Estudiante student){
        boolean existe=false;
        for(Estudiante buscador:this.lstEstudiante){    
            if(buscador.getDocumento().equals(student.getDocumento())){
                existe=true;
                break;
            }
        }
        if(existe==false){
                this.lstEstudiante.add(student);
                JOptionPane.showMessageDialog(null,"El estudiante ha sido guardado con exito");
        }else{
            JOptionPane.showMessageDialog(null,"Ya hay un estudiante con este mismo documento: "+student.getDocumento());
        }
    }
    
    //Buscar estudiante por documento
    public Estudiante BuscarEstudianteDocumento(String doc){
        Estudiante estDoc=null;
        
        for (Estudiante buscador:this.lstEstudiante){
            if(buscador.getDocumento().equals(doc)){
                estDoc=buscador;
            }
        }
        if (estDoc==null){
            JOptionPane.showMessageDialog(null, "No se encontro el estudiante con el documento "+doc);
        }
        return estDoc;
    }
    
    //Eliminar estudiante
    public void EliminarEstudiante(String doc){
        boolean existencia=false;
        for (Estudiante eliminador:this.lstEstudiante){
            if(eliminador.getDocumento().equals(doc)){
                existencia=true;
                this.lstEstudiante.remove(eliminador);
                JOptionPane.showMessageDialog(null,"El estudiante ha sido eliminado con exito");
                break;
            }
        }
        if (existencia==false){
            JOptionPane.showMessageDialog(null, "No se encontro el estudiante con el documento: "+doc);
        }
    }
    //Modificar Estudiante
    public void ModificarEstudiante(Estudiante estd){
        boolean existe=false;
        for (int i=0; i<this.lstEstudiante.size();i++){
            if(this.lstEstudiante.get(i).getDocumento().equals(estd.getDocumento())){
                existe=true;
                this.lstEstudiante.set(i, estd);
                JOptionPane.showMessageDialog(null, "Modificado con exito");
                break;
            }
        }
        if(existe==false){
            JOptionPane.showMessageDialog(null,"El estudiante con el documento "+estd.getDocumento()
                    + "\n no se encuentra registrado");
        }
    }
    
    public ArrayList<Estudiante> ListarEstudiantes(){
        if(this.lstEstudiante.size()<0){
            JOptionPane.showMessageDialog(null, "No hay ningun estudiante registrado",
                    "Sin estudiantes para mostrar",JOptionPane.OK_OPTION);
        }
        return this.lstEstudiante;
    }
    
    public ArrayList<Empleado> BuscarSecretarias(){
        ArrayList<Empleado> secretarias=new ArrayList<>();
        
        for (Empleado buscarSe:this.lstEmpleado){
            if(buscarSe.getCargo().equals("SECRETARIA")){
                secretarias.add(buscarSe);
            }
        }
        return secretarias;
    }
    
    public void GuardarDirectivo(Directivo dir){
        boolean ciclo=false;
        for(Empleado ite:this.lstEmpleado){
            if(ite.getDocumento().equals(dir.getDocumento()) && ite.getTipo().equals("Directivo")){
                this.lstDirectivo.add(dir);
                JOptionPane.showMessageDialog(null, "Directivo guardado");
                ciclo=true;
                break;
            }
        }
        if (ciclo==false){
            JOptionPane.showMessageDialog(null, "No se encontro el usuario con el documento "+dir.getDocumento()+
                    "\n o el empleado no es de tipo directivo");
        }
    }
    
    public void Nomina(){
        int salario=0;
        if(this.lstEmpleado.size()>0){
            for (int i=0;i<this.lstEmpleado.size();i++){
                this.lstEmpleado.get(i).CalcularSalario();
                salario+=this.lstEmpleado.get(i).getSalario()-0.04;
            }
            JOptionPane.showMessageDialog(null, "La nomina total de los empleados es: "+salario,
                    "Nomina de Empleados",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay ningún empleado registrado, por ende, la nomina es 0$",
                    "Nomina de Empleados",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
