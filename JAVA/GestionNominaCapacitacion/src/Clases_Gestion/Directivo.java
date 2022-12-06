
package Clases_Gestion;

public class Directivo extends Empleado{
    private Empleado Secretaria;
    private int PersonalACargo;

    public Directivo() {
    }

    public Directivo(Empleado Secretaria, int PersonalACargo) {
        this.Secretaria = Secretaria;
        this.PersonalACargo = PersonalACargo;
    }
    
    public Empleado getSecretaria() {
        return Secretaria;
    }

    public void setSecretaria(Empleado Secretaria) {
        this.Secretaria = Secretaria;
    }

    public int getPersonalACargo() {
        return PersonalACargo;
    }

    public void setPersonalACargo(int PersonalACargo) {
        this.PersonalACargo = PersonalACargo;
    }
    
    
    
    
    
}
