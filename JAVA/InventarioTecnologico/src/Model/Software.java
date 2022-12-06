package Model;

public class Software {
    //Atributes
    private int SoftwareId;
    private String Nombre;
    private String Version;
    private String InstalationKey;
    private int CantidadLicencias;
    private int Vigencia;
    private int ProveedorId;
    
    //Constructors
    public Software(){
    }
    
    public Software(String Nombre,String Version,String InstalationKey,
            int CantidadLicencias,int Vigencia,int ProveedorId){
        this.Nombre=Nombre;
        this.Version=Version;
        this.InstalationKey=InstalationKey;
        this.CantidadLicencias=CantidadLicencias;
        this.Vigencia=Vigencia;
        this.ProveedorId=ProveedorId;
    }

    public Software(int SoftwareId, String Nombre, String Version, String InstalationKey,
            int CantidadLicencias, int Vigencia, int ProveedorId){
        this.SoftwareId = SoftwareId;
        this.Nombre = Nombre;
        this.Version = Version;
        this.InstalationKey = InstalationKey;
        this.CantidadLicencias = CantidadLicencias;
        this.Vigencia = Vigencia;
        this.ProveedorId = ProveedorId;
    }

    //Metodos
    public int getSoftwareId() {
        return SoftwareId;
    }
    
    public void setSoftwareId(int SoftwareId){
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

    public int getProveedorId() {
        return ProveedorId;
    }

    public void setProveedorId(int ProveedorId) {
        this.ProveedorId = ProveedorId;
    }
    
}
