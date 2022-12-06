
package Model;

/**
@author Juan Jose Marin
 **/
public class SoftwareView {
    //Atributes
    private int SoftwareId;
    private String Nombre;
    private String Version;
    private String InstalationKey;
    private int CantidadLicencias;
    private int Vigencia;
    private String RazonSocial;
    
    //Contructors brum brum
    public SoftwareView(){
    }

    public SoftwareView(int SoftwareId, String Nombre, String Version, String InstalationKey, int CantidadLicencias, int Vigencia, String RazonSocial) {
        this.SoftwareId = SoftwareId;
        this.Nombre = Nombre;
        this.Version = Version;
        this.InstalationKey = InstalationKey;
        this.CantidadLicencias = CantidadLicencias;
        this.Vigencia = Vigencia;
        this.RazonSocial = RazonSocial;
    }
    
    //Methods

    public int getSoftwareId() {
        return SoftwareId;
    }

    public void setSoftwareId(int SoftwareId) {
        this.SoftwareId = SoftwareId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getInstalationKey() {
        return InstalationKey;
    }

    public void setInstalationKey(String InstalationKey) {
        this.InstalationKey = InstalationKey;
    }

    public int getCantidadLicencias() {
        return CantidadLicencias;
    }

    public void setCantidadLicencias(int CantidadLicencias) {
        this.CantidadLicencias = CantidadLicencias;
    }

    public int getVigencia() {
        return Vigencia;
    }

    public void setVigencia(int Vigencia) {
        this.Vigencia = Vigencia;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }
    
}
