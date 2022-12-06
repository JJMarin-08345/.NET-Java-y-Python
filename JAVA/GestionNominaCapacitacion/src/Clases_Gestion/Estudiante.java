
package Clases_Gestion;

public class Estudiante extends Persona{
    private String Curso;
    private float Nota1;
    private float Nota2;
    private float Nota3;
    private float Definitiva;
    private boolean Aprobado;

    public Estudiante() {
    }

    public Estudiante(String Curso, float Nota1, float Nota2, float Nota3, 
            String Documento, String Nombres, String Apellidos, String Genero) {
        super(Documento, Nombres, Apellidos, Genero);
        this.Curso = Curso;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public float getNota1() {
        return Nota1;
    }

    public void setNota1(float Nota1) {
        this.Nota1 = Nota1;
    }

    public float getNota2() {
        return Nota2;
    }

    public void setNota2(float Nota2) {
        this.Nota2 = Nota2;
    }

    public float getNota3() {
        return Nota3;
    }

    public void setNota3(float Nota3) {
        this.Nota3 = Nota3;
    }

    public float getDefinitiva() {
        return Definitiva;
    }
    
    public void CalcularDefinitiva(){
        this.Definitiva = (this.Nota1+this.Nota2+this.Nota3)/3;
    }

    public boolean isAprobado() {
        return Aprobado;
    }
    
    public void DefinirAprobado(){
        if (this.Definitiva>2.98){
            this.Aprobado=true;
        }else{
            this.Aprobado=false;
        }
    }
    
    
}
