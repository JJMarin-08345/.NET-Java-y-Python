
package Controlador;

import Model.*;
import PlaceHolder.TextPrompt;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO extends Conexion{
    //Atributos
    Conexion cn;
    public TextPrompt Holder;
    
    //Metodos
    //Constructor por defecto
    public DAO(){
        this.cn=new Conexion();
    }
    
    //Metodo Generico
    private boolean Ejecutar(String sql){
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La solucitud ha sido procesada con exito");
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    /*
    Esta es para eliminar, estoy analizando si se puede optimizar 
    esta con la de abajo para dejar solo una; no le veo viable por ahora.
    
    update: Logré optimizarla pidiendo como argumento un boolean
    */
    /*
    private boolean BuscadorEliminar(String accion,String select,String tipo){
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if (rs.next()){
                Ejecutar(accion);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, tipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    /*Funcion para detectar si existe ya un objeto con un mismo identificador
    unico, como el documento, el serial, etc, ahora también sirve para eliminar
    si de boolean se le envía un true
    */
    private boolean BuscarCrear_Eliminar(String accion,String select,String tipo,boolean ejecu){
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()==ejecu){
                Ejecutar(accion);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, tipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
        return false;
    }
    /*
    Funcion para agg o eliminar la cantidad de equipos a los cuentadantes
    aunque tambien se podria usar para otras cosas
    */
    private void CantidadDeEquiposCuentadante(String select,String update,String mssg){
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                ps=con.prepareStatement(update);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, mssg,"Actualizacion de cuentadante",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Metodos de calidad
    public boolean validarCel(String cel){
        boolean casteado;
        ArrayList<String> cadena = new ArrayList<>();
        try{
            Long.parseLong(cel);
            casteado=true;
        }catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null, "El celular solo debe contener digitos");
            return false;
        }
        if(casteado){
            for(int i=0;i<cel.length();i++){
                cadena.add(""+cel.charAt(i));
            }
            if(cadena.get(0).equals(cadena.get(1)) && cadena.get(1).equals(cadena.get(2)) &&
                    cadena.get(2).equals(cadena.get(3)) && cadena.get(3).equals(cadena.get(4))){
                JOptionPane.showMessageDialog(null, "El numero tiene muchos digitos repetidos",
                        "Numero invalido",JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        //JOptionPane.showMessageDialog(null, cadena);
        return true;
    }
    private boolean validarCorreo(String correo){
        if(correo.contains("@") && correo.contains(".")){
            String[] elArroba = correo.split("@");
            //System.out.println(elArroba[0]); resultado= todo lo que esta antes del arroba
            String[] elPunto = elArroba[1].split("\\.");

            if(elArroba[0].length()>=4 && elPunto[0].length()>=4 && elPunto[1].length()>=2){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Revise el campo 'Correo'",
                        "Correo invalido",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Falta un signo '@' o un '.' en el campo 'Correo'",
                    "Correo invalido",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    //Metodos para pantalla de acceso
    public int cantidadUsuario(){
        String select=" SELECT COUNT(*) AS cantidad FROM acceso ";
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                //JOptionPane.showMessageDialog(null,rs.getInt("cantidad"));
                return rs.getInt("cantidad");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return 0;
    }
    
    public boolean crearUsuario(String usu,String psw){
        String insert=" INSERT INTO acceso(usuario,clave) VALUES ('"+usu+"','"+psw+"') ";
        return Ejecutar(insert);
    }
    
    public boolean AccesoUsuario(String usu,String psw){
        String select=" SELECT * FROM acceso "
                + "\n WHERE usuario='"+usu+"' AND clave='"+psw+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Se ha concedido el acceso",
                        "Acceso Permitido",JOptionPane.DEFAULT_OPTION);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario y/o Clave incorrecta",
                        "Acceso Denegado",JOptionPane.DEFAULT_OPTION);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    //Metodos CRUD
    
    //METODOS EQUIPOCOMPUTO
    //Crear equipocomputo
    public boolean CrearEquipoComputo(EquipoComputo equipo){
        //JOptionPane.showMessageDialog(null, ""+equipo.getCuentadanteId());
        if(validarEquipoComputo(equipo)){
            Cuentadante cue = BuscarCuentadante(equipo.getCuentadanteId());
            String insert=" INSERT INTO equipocomputo (Serial,Marca,Modelo,Tipo,FechaCompra,"
                    + "vencimientoGarantia,cuentadanteId,UbicacionPCId,ProveedorId) "
                    + "VALUES ('"+equipo.getSerial()+"','"+equipo.getMarca()+"','"+equipo.getModelo()+"',"
                    + "'"+equipo.getTipo()+"','"+equipo.getFechaCompra()+"','"+equipo.getVencimientoGarantia()+"',"
                    + "'"+equipo.getCuentadanteId()+"','"+equipo.getUbicacionId()+"','"+equipo.getProveedorId()+"')";
            String select=" SELECT Serial FROM equipocomputo WHERE Serial='"+equipo.getSerial()+"' ";
            String tipo="Ya existe un equipo con este mismo numero serial";

            if(BuscarCrear_Eliminar (insert, select, tipo,false) ){
                int ce=cue.getCantidadEquipos();
                String selectCue=" SELECT cuentadanteId FROM cuentadante WHERE cuentadanteId='"+equipo.getCuentadanteId()+"' ";
                String updateCue=" UPDATE cuentadante SET CantidadEquipos='"+(++ce)+"' WHERE cuentadanteId='"+
                        equipo.getCuentadanteId()+"'";
                String mensaje= "El cuentadante "+cue.getNombres()+" "+cue.getApellidos()
                        +" ahora tiene "+ce+" equipos a cargo";
                CantidadDeEquiposCuentadante(selectCue, updateCue, mensaje);
                return true;
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo agregar el equipo, verifique los datos ingresados");
        }
        return false;
    }
    //Moficar equipocomputo
    public boolean ModificarEquipoComputo(EquipoComputo equipo){
        
        if(validarEquipoComputo(equipo)){
            
            EquipoComputo equipoOld=BuscarEquipoComputo(equipo.getEquipoId()); 
            int cueId_Old=equipoOld.getCuentadanteId();
            Cuentadante cueOld=BuscarCuentadante(cueId_Old);
            int CE_CueOld=cueOld.getCantidadEquipos();
            //JOptionPane.showMessageDialog(null, CE_CueOld);
            
            String update=" UPDATE equipocomputo SET Serial='"+equipo.getSerial()+
                    "', Marca='"+equipo.getMarca()+"', "+ "Modelo='"+equipo.getModelo()+
                    "',Tipo='"+equipo.getTipo()+"', FechaCompra='"+equipo.getFechaCompra()+"',"
                    + "vencimientoGarantia='"+equipo.getVencimientoGarantia()+"', "
                    + "cuentadanteId='"+equipo.getCuentadanteId()
                    +"',UbicacionPCId='"+equipo.getUbicacionId()+"', "
                    + "ProveedorId='"+equipo.getProveedorId()+"'"
                    + " WHERE EquipoId='"+equipo.getEquipoId()+"'";
            Ejecutar(update);
            
            Cuentadante cueNew=BuscarCuentadante(equipo.getCuentadanteId());
            int cueId_New=cueNew.getCueId();
            int CE_CueNew = cueNew.getCantidadEquipos();
            //JOptionPane.showMessageDialog(null, CE_CueNew);
            if(cueId_Old!=cueId_New){
                String select=" SELECT cuentadanteId FROM cuentadante "
                        + "\n WHERE cuentadanteId='"+cueId_Old+"' ";

                String updateCue=" UPDATE cuentadante SET CantidadEquipos='"+(--CE_CueOld)+"' "
                        + "\n WHERE cuentadanteId='"+cueId_Old+"' ";

                String msj=" Se actualizo el Cuentadante "+cueOld.getNombres()+" "+cueOld.getApellidos()
                        +" en una disminucion de equipos"
                        +" \n Ahora posee "+CE_CueOld+" equipos a cargo";

                String select2=" SELECT cuentadanteId FROM cuentadante "
                        + "\n WHERE cuentadanteId='"+cueId_New+"' ";

                String updateCue2=" UPDATE cuentadante SET CantidadEquipos='"+(++CE_CueNew)+"' "
                        + "\n WHERE cuentadanteId='"+cueId_New+"' ";

                String msj2=" Se actualizo el Cuentadante "+cueNew.getNombres()+" "+cueNew.getApellidos()
                        +" en un aumento de equipos"
                        +" \n Ahora posee "+CE_CueNew+" equipos a cargo";


                CantidadDeEquiposCuentadante(select, updateCue, msj);
                CantidadDeEquiposCuentadante(select2, updateCue2, msj2);
                return true;
            }
            
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo modificar el equipo, verifique los datos ingresados");
        }
        return false;
    }
    //Eliminar
    public boolean EliminarEquipoComputo(String DocCue, String Serial){
        Cuentadante cue = BuscarCuentadante(DocCue);
        String select=" SELECT Serial FROM equipocomputo WHERE Serial='"+Serial+"' ";
        String delete=" DELETE FROM equipocomputo WHERE Serial='"+Serial+"' ";
        String tipo="No existe un equipo con este numero serial";
        if(BuscarCrear_Eliminar(delete,select,tipo,true)){
            int CE=cue.getCantidadEquipos();
            String selectCue=" SELECT documento FROM cuentadante WHERE Documento='"+DocCue+"' ";
            String updateCue=" UPDATE cuentadante SET cantidadequipos='"+(--CE)+"' ";
            String mssg= "Se ha disminuido un equipo al cuentadante\n"
                            +cue.getNombres()+" "+cue.getApellidos()+". Ahora dispone de "+CE+" equipos";
            CantidadDeEquiposCuentadante(selectCue, updateCue, mssg);
        }
        return BuscarCrear_Eliminar(delete,select,tipo,true);
    }
    //Buscar equipocomputo
    public EquipoComputo BuscarEquipoComputo(int equipoId){
        EquipoComputo equipo=null;
        String select=" SELECT * FROM equipocomputo WHERE EquipoId='"+equipoId+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                equipo=new EquipoComputo();
                equipo.setEquipoId(rs.getInt("EquipoId"));
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setTipo(rs.getString("Tipo"));
                equipo.setFechaCompra(LocalDate.parse(rs.getString("FechaCompra")));
                equipo.setCuentadanteId(rs.getInt("cuentadanteId"));
                equipo.setUbicacionId(rs.getInt("UbicacionPCId"));
                equipo.setProveedorId(rs.getInt("ProveedorId"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return equipo;
    }
    
    public EquipoView BuscarEquipoComputo(String serial){
        EquipoView equipo=null;
        String innerjoin=" SELECT EquipoId,Serial,Marca,Modelo,Tipo,FechaCompra,"
                + "VencimientoGarantia,Documento,Descripcion,Apellidos,RazonSocial "
                + "\n FROM equipocomputo "
                + "\n INNER JOIN cuentadante"
                + "\n ON equipocomputo.cuentadanteId = cuentadante.cuentadanteId"
                +"\n INNER JOIN ubicacion_pc"
                +"\n ON equipocomputo.UbicacionPCId = ubicacion_pc.UbicacionPCId"
                + "\n INNER JOIN proveedor"
                + "\n ON equipocomputo.ProveedorId=proveedor.ProveedorId"
                + "\n WHERE equipocomputo.Serial='"+serial+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(innerjoin);
            rs=ps.executeQuery();
            if(rs.next()){
                equipo = new EquipoView();
                equipo.setEquipoViewId(rs.getInt("EquipoId"));
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setTipo(rs.getString("Tipo"));
                equipo.setFechaCompra(LocalDate.parse(rs.getString("FechaCompra")));
                equipo.setVencimientoGarantia(rs.getInt("VencimientoGarantia"));
                equipo.setDocYApeCuentadante("CC: "+rs.getString("Documento")+" || "+rs.getString("Apellidos"));
                equipo.setUbicacionPCId(rs.getString("Descripcion"));
                equipo.setRazonSocial(rs.getString("RazonSocial"));
            }else{
                JOptionPane.showMessageDialog(null,"No existe un equipo con ese numero serial");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return equipo;
    }
    //LISTAR EQUIPOCOMPUTO
    public ArrayList<EquipoComputo> ListarEquipoComputo(){
        ArrayList<EquipoComputo> lstEquipo = new ArrayList<>();
        EquipoComputo equipo=null;
        String select=" SELECT * FROM equipocomputo ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipo=new EquipoComputo();
                equipo.setEquipoId(rs.getInt("EquipoId"));
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setTipo(rs.getString("Tipo"));
                equipo.setFechaCompra(LocalDate.parse(rs.getString("FechaCompra")));
                equipo.setDocumentoCuentadante(rs.getString("cuentadanteId"));
                equipo.setUbicacionId(rs.getInt("UbicacionPCId"));
                equipo.setProveedorId(rs.getInt("ProveedorId"));
                lstEquipo.add(equipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lstEquipo;
    }
    
    //Metodos calidad equipocomputo
    private boolean validarEquipoComputo(EquipoComputo equipo){
        if(equipo.getSerial().length()>9){
            if(equipo.getModelo().length()>2){
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"El modelo minimo contiene 2 caracteres",
                    "Modelo invalido",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Un numero serial debe tener minimo 10 caracteres",
                    "Serial invalido",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    
    
    //METODOS CUENTADANTE
    //Crear
    public boolean CrearCuentadante(Cuentadante cue){
        if(validarCuentadante(cue)){
            String insert=" INSERT INTO cuentadante (Documento,Nombres,Apellidos,Correo,Telefono) "
                    + "VALUES ('"+cue.getDocumento()+"','"+cue.getNombres()+"','"+cue.getApellidos()+"',"
                    + "'"+cue.getCorreo()+"','"+cue.getTelefono()+"' )";
            String select=" SELECT Documento FROM cuentadante WHERE Documento='"+cue.getDocumento()+"'";
            String tipo="El funcionario ya se encuentra registrado";
            BuscarCrear_Eliminar(insert, select, tipo,false);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo crear, verifique los datos ingresados");
        }
        return false;
    }
    //Modificar
    public boolean ModificarCuentadante(Cuentadante cue){
        if(validarCuentadante(cue)){
            String update=" UPDATE cuentadante SET Documento='"+cue.getDocumento()+"',Nombres='"+cue.getNombres()
                    +"',Apellidos='"+cue.getApellidos()+"',Correo='"+cue.getCorreo()+"',"
                    + "Telefono='"+cue.getTelefono()+"' "
                    + "WHERE cuentadanteId='"+cue.getCueId()+"' ";
            Ejecutar(update);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo modificar, verifique los datos ingresados");
        }
        return false;
    }
    //Eliminar por documento
    public boolean EliminarCuentadante(String doc){
        String search=" SELECT Documento FROM cuentadante WHERE Documento='"+doc+"' ";
        String delete=" DELETE FROM cuentadante WHERE Documento='"+doc+"' ";
        String tipo="El cuentadante no esta registrado";
        return BuscarCrear_Eliminar(delete,search,tipo,true);
    }
    //Eliminar por Id
    //Sin usar
    public void EliminarCuentadante(int cueId){
        String delete=" DELETE FROM cuentadante WHERE cuentadanteId='"+cueId+"' ";
        Ejecutar(delete);
    }
    //Buscar por documento
    public Cuentadante BuscarCuentadante(String doc){
        Cuentadante cue=null;
        
        String select=" SELECT * FROM cuentadante WHERE Documento='"+doc+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                cue=new Cuentadante();
                cue.setCueId(rs.getInt("cuentadanteId"));
                cue.setDocumento(rs.getString("Documento"));
                cue.setNombres(rs.getString("Nombres"));
                cue.setApellidos(rs.getString("Apellidos"));
                cue.setCorreo(rs.getString("Correo"));
                cue.setTelefono(rs.getString("Telefono"));
                cue.setCantidadEquipos(rs.getInt("CantidadEquipos"));
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario no registrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cue;
    }
    //Buscar por id
    public Cuentadante BuscarCuentadante(int Cueid){
        Cuentadante cue=null;
        
        String select=" SELECT * FROM cuentadante WHERE cuentadanteId='"+Cueid+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                cue=new Cuentadante();
                cue.setCueId(rs.getInt("cuentadanteId"));
                cue.setDocumento(rs.getString("Documento"));
                cue.setNombres(rs.getString("Nombres"));
                cue.setApellidos(rs.getString("Apellidos"));
                cue.setCorreo(rs.getString("Correo"));
                cue.setTelefono(rs.getString("Telefono"));
                cue.setCantidadEquipos(rs.getInt("CantidadEquipos"));
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario no registrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cue;
    }
    //Listar Cuentadantes
    public ArrayList<Cuentadante> ListarCuentadante(){
        ArrayList<Cuentadante> cuentadantes = new ArrayList<>();
        Cuentadante cue=null;
        String select=" SELECT * FROM cuentadante";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                cue=new Cuentadante();
                cue.setCueId(rs.getInt("cuentadanteId"));
                cue.setDocumento(rs.getString("Documento"));
                cue.setNombres(rs.getString("Nombres"));
                cue.setApellidos(rs.getString("Apellidos"));
                cue.setCorreo(rs.getString("Correo"));
                cue.setTelefono(rs.getString("Telefono"));
                cue.setCantidadEquipos(rs.getShort("CantidadEquipos"));
                cuentadantes.add(cue);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return cuentadantes;
    }
    //Metodo de calidad cuentadante 
    private boolean validarCuentadante(Cuentadante cue){
        boolean aprobado;
        int CDigitos=cue.getTelefono().length();
        if(cue.getDocumento().length()>=6 && cue.getDocumento().length()<=15){
            try {
                Long.parseLong(cue.getDocumento());
                aprobado=true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo 'Documento' debe contener solo numeros");
                aprobado=false;
            }
            if(aprobado){
                if(cue.getNombres().length()>=3 && cue.getApellidos().length()>=3){ 
                    if(cue.getTelefono().length()==10){
                        aprobado=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "El formato de un celular en Colombia "
                                + "recibe 10 digitos"+
                                "\n el ingresado tiene "+CDigitos);
                        aprobado=false;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Verifique los nombres y apellidos");
                    aprobado=false;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "El Documento debe ser mayor a 5 y menor a 16 digitos");
            aprobado=false;
        }
        if(aprobado){
            aprobado = validarCorreo(cue.getCorreo());
            /*if(validarCorreo(cue.getCorreo())){
                aprobado=true;
            }else{
                aprobado=false;
            }*/
        }if(aprobado){
            aprobado = validarCel(cue.getTelefono());
        }
        
        return aprobado;
    }
    
    
    
    //METODOS PROVEEDOR
    //CREAR PROVEEDOR
    public void CrearProveedor(Proveedor pro){
        String insert=" INSERT INTO proveedor (NIT,RazonSocial,Direccion,Correo,Telefono)"
                +" VALUES ('"+pro.getNIT()+"','"+pro.getRazonSocial()+
                "','"+pro.getDireccion()+"','"+pro.getCorreo()+
                "','"+pro.getTelefono()+"')";
        String select=" SELECT NIT FROM proveedor WHERE NIT='"+pro.getNIT()+"' ";
        String tipo="Ya existe un proveedor con este mismo NIT";
        BuscarCrear_Eliminar(insert,select,tipo,false);
    }
    //MODIFICAR PROVEEDOR
    public void ModificarProveedor(Proveedor pro){
        String update=" UPDATE proveedor SET NIT='"+pro.getNIT()+"',RazonSocial='"+
                pro.getRazonSocial()+"',Direccion='"+pro.getDireccion()+"',Correo='"+
                pro.getCorreo()+"',Telefono='"+pro.getTelefono()+"' ";
        Ejecutar(update);
    }
    //ELIMINAR PROVEEDOR POR NIT
    public boolean EliminarProveedor(String NIT){
        String delete=" DELETE FROM proveedor WHERE NIT='"+NIT+"' ";
        String select=" SELECT NIT FROM proveedor WHERE NIT='"+NIT+"' ";
        String tipo="No existe un proveedor con dicho NIT";
        return BuscarCrear_Eliminar(delete, select, tipo,true);
    }
    //ELIMINAR PROVEEDOR POR ID
    public void EliminarProveedor(int proId){
        String delete=" DELETE FROM proveedor WHERE ProveedorId='"+proId+"' ";
        Ejecutar(delete);
    }
    //BUSCAR PROVEEDOR
    public Proveedor BuscarProveedor(String NIT){
        Proveedor searchPro=null;
        String select=" SELECT * FROM proveedor WHERE NIT='"+NIT+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                searchPro = new Proveedor();
                searchPro.setProveedorId(rs.getInt("ProveedorId"));
                searchPro.setNIT(rs.getString("NIT"));
                searchPro.setRazonSocial(rs.getString("RazonSocial"));
                searchPro.setDireccion(rs.getString("Direccion"));
                searchPro.setCorreo(rs.getString("Correo"));
                searchPro.setTelefono(rs.getString("Telefono"));
            }else{
                JOptionPane.showMessageDialog(null,"Proveedor no registrado, revise el NIT dado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return searchPro;
    }
    //LISTAR PROVEEDORES
    public ArrayList<Proveedor> ListarProveedores(){
        ArrayList<Proveedor> lstProveedor = new ArrayList<>();
        Proveedor pro=null;
        String select=" SELECT * FROM proveedor ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                pro=new Proveedor();
                pro.setProveedorId(rs.getInt("ProveedorId"));
                pro.setNIT(rs.getString("NIT"));
                pro.setRazonSocial(rs.getString("RazonSocial"));
                pro.setDireccion(rs.getString("Direccion"));
                pro.setCorreo(rs.getString("Correo"));
                pro.setTelefono(rs.getString("Telefono"));
                lstProveedor.add(pro);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lstProveedor;
    }
    
    //METODOS PARTESPC
    //CREAR PARTE PC
    public void CrearPartePc(PartesPC parte){
        String insert=" INSERT INTO partespc (Nombre,Serial,Partes_Marca,FechaCompraPartes,"
                + "GarantiaVencePartes,EquipoId,ProveedorId,Ubicacion_Partes) "
                + "\n VALUES('"+parte.getNombre()+"','"+parte.getSerial()+"','"+parte.getPartes_Marca()+"',"
                + "'"+parte.getFechaCompraPartes()+"','"+parte.getGarantiaVecnePartes()+"','"+parte.getEquipoId()+"',"
                + "'"+parte.getProveedorId()+"','"+parte.getUbiParteId()+"')";
        Ejecutar(insert);
    }
    //MODIFICAR PARTE PC
    public void ModificarPartePc(PartesPC parte){
        String update=" UPDATE partespc SET Nombre='"+parte.getNombre()+"',Serial='"+parte.getSerial()+"',"
                + "Partes_Marca='"+parte.getPartes_Marca()+"',FechaCompraPartes='"+parte.getFechaCompraPartes()+"',"
                + "GarantiaVenceParte='"+parte.getGarantiaVecnePartes()+"',EquipoId='"+parte.getEquipoId()+"',"
                + "ProveedorId='"+parte.getProveedorId()+"',Ubicacion_Partes='"+parte.getUbiParteId()+"' "
                + "\n WHERE PartesPCId= '"+parte.getPartesPCId()+"' ";
        Ejecutar(update);       
    }
    //ELIMINAR PARTE PC
    public void EliminarPartePc(int ParteId){
        String delete=" DELETE FROM partespc WHERE partesPcId='"+ParteId+"' ";
        Ejecutar(delete);
    }
    //BUSCAR PARTE PC
    public PartesPcView BuscarPartePC(String Serial){
        PartesPcView parte = null;
        String select=" SELECT * FROM partespc WHERE Serial = '"+Serial+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                parte= new PartesPcView();
                parte.setSerial(rs.getString("Serial"));
                parte.setNombre(rs.getString("Nombre"));
                parte.setPartes_Marca(rs.getString("Partes_Marca"));
                parte.setFechaCompraPartes(LocalDate.parse(rs.getString("FechaCompraPartes")));
                parte.setGarantiaVecnePartes(rs.getInt("GarantiaVencePartes"));
                
            }
        } catch (SQLException e) {
        }
        
        return parte;
    }
    
    //LISTAR PARTES PC
    public ArrayList<PartesPC> ListarPartesPc(){
        ArrayList<PartesPC> lstPartes=new ArrayList<>();
        PartesPC parte=null;
        String select=" SELECT * FROM partespc ";
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                parte = new PartesPC();
                parte.setPartesPCId(rs.getInt("PartesPCId"));
                parte.setSerial(rs.getString("Serial"));
                parte.setNombre(rs.getString("Nombre"));
                parte.setPartes_Marca(rs.getString("Partes_Marca"));
                parte.setFechaCompraPartes(LocalDate.parse(rs.getString("FechaCompraPartes")));
                parte.setGarantiaVecnePartes(rs.getInt("GarantiaVencePartes"));
                parte.setEquipoId(rs.getInt("EquipoId"));
                parte.setProveedorId(rs.getInt("ProveedorId"));
                parte.setUbiParteId(rs.getInt("Ubicacion_Partes"));
                
                lstPartes.add(parte);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lstPartes;
    }
    
    
    
    //METODOS SOFTWARE
    //CREAR SOFTWARE
    public void CrearSoftware(Software sfwe){
        String insert=" INSERT INTO software (Nombre,Version,InstalationKey,CantidadLicencias,Vigencia,ProveedorId) "
                + "VALUES ('"+sfwe.getNombre()+"','"+sfwe.getVersion()+"','"+sfwe.getInstalationKey()+
                "','"+sfwe.getCantidadLicencias()+"','"+sfwe.getVigencia()+"','"+sfwe.getProveedorId()+"')";
        Ejecutar(insert);
    }
    //MODIFICAR SOFTWARE 
    public void ModificarSoftware(Software sfwe){
        String update=" UPDATE software SET Nombre='"+sfwe.getNombre()+"',Version='"+sfwe.getVersion()+"',"
                + "InstalationKey='"+sfwe.getInstalationKey()+"',"
                + "CantidadLicencias='"+sfwe.getCantidadLicencias()+"',Vigencia='"+sfwe.getVigencia()+"',"
                + "ProveedorId='"+sfwe.getProveedorId()+"' WHERE SoftwareId='"+sfwe.getSoftwareId()+"'";
        Ejecutar(update);
    }
    //ELIMINAR SOFTWARE
    public void EliminarSoftware(int sfweid){
        String delete=" DELETE FROM software WHERE SoftwareId='"+sfweid+"' ";
        Ejecutar(delete);
    }
    //BUSCAR SOFTWARE POR NOMBRE
    public ArrayList<SoftwareView> BuscarSoftware(String Nombre){
        ArrayList<SoftwareView> lstSfweName=new ArrayList<>();
        SoftwareView sfwe=null;
        String select=" SELECT SoftwareId,Nombre,Version,InstalationKey,"
                + "CantidadLicencias,Vigencia,RazonSocial "
                + "\nFROM software "
                + "\n INNER JOIN proveedor"
                + "\n ON software.ProveedorId=proveedor.ProveedorId"
                + "\n WHERE software.Nombre='"+Nombre+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                sfwe=new SoftwareView();
                sfwe.setSoftwareId(rs.getInt("SoftwareId"));
                sfwe.setNombre(rs.getString("Nombre"));
                sfwe.setVersion(rs.getString("Version"));
                sfwe.setInstalationKey(rs.getString("InstalationKey"));
                sfwe.setCantidadLicencias(rs.getInt("CantidadLicencias"));
                sfwe.setVigencia(rs.getInt("Vigencia"));
                sfwe.setRazonSocial(rs.getString("RazonSocial"));
                lstSfweName.add(sfwe);
            }            
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lstSfweName;
    }
    //LISTAR SOFTWARE 
    public ArrayList<Software> ListarSoftware(){
        ArrayList<Software> lstSoftware = new ArrayList<>();
        Software sfwe=null;
        String select=" SELECT * FROM software ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                sfwe = new Software();
                sfwe.setSoftwareId(rs.getInt("SoftwareId"));
                sfwe.setNombre(rs.getString("Nombre"));
                sfwe.setVersion(rs.getString("Version"));
                sfwe.setCantidadLicencias(rs.getInt("CantidadLicencias"));
                sfwe.setInstalationKey(rs.getString("InstalationKey"));
                sfwe.setVigencia(rs.getInt("Vigencia"));
                sfwe.setProveedorId(rs.getInt("ProveedorId"));
                lstSoftware.add(sfwe);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lstSoftware;
    }
    
    
    
    //METODOS UBICACION_PC
    //CREAR UBICACION_PC
    public void CrearUbicacionPc (Ubicacion_Pc ubiPc){
        //Sirve 
        String insert=" INSERT INTO Ubicacion_Pc(Descripcion) "
                + "VALUES('"+ubiPc.getDescripcion()+"') ";
        Ejecutar(insert);
    }
    //MODIFICAR UBICACION_PC
    public void ModificarUbicacionPc(Ubicacion_Pc ubiPc){
      //  Ubicacion_Pc ubiPc;
      String update=" UPDATE ubicacion_pc SET Descripcion='"+ubiPc.getDescripcion()+"'"
                + "WHERE UbicacionPCId='"+ubiPc.getUbicacionPcId()+"' ";
      Ejecutar(update);
    }
    //ELIMINAR UBICACION_PC
    public void EliminarUbicacionPc(int UbiPcId){
        String delete=" DELETE FROM ubicacion_pc WHERE UbicacionPCId='"+UbiPcId+"' ";
        Ejecutar(delete);
    }
    //BUSCAR UBICACION_PC por DESCRIPCION
    public ArrayList<Ubicacion_Pc> BuscarUbicacionPc(String Descripcion){
        ArrayList<Ubicacion_Pc> lstUbiPc = new ArrayList<>();
        Ubicacion_Pc ubiPc=null;
        String select=" SELECT * FROM Ubicacion_Pc WHERE Descripcion='"+Descripcion+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                ubiPc=new Ubicacion_Pc();
                ubiPc.setUbicacionPcId(rs.getInt("UbicacionPCId"));
                ubiPc.setDescripcion(rs.getString("Descripcion"));
                lstUbiPc.add(ubiPc);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lstUbiPc;
    }
    //Listar Ubicacion_Pc 
    public ArrayList<Ubicacion_Pc> ListarUbicacionPc(){
        ArrayList<Ubicacion_Pc> UbicacionesPc = new ArrayList<>();
        Ubicacion_Pc  ubiPc=null;
        String select=" SELECT * FROM Ubicacion_Pc  ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                ubiPc=new Ubicacion_Pc(rs.getInt("UbicacionPCId"),
                       rs.getString("Descripcion"));
                UbicacionesPc.add(ubiPc);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return UbicacionesPc;
    }
    
    
    //METODOS UBICACIONPARTES
    //CREAR UBICACIONPARTE
    public void CrearUbicacionPartes(UbicacionPartes ubiPar){
        String insert=" INSERT INTO ubicacionpartes(Descripcion) "
                + "Values ('"+ ubiPar.getDescripcion()+"') ";
        Ejecutar(insert);
    }
    //MODIFICAR UBICACIONPARTE
    public void ModificarUbicacionPartes(UbicacionPartes ubiPar){
        String update=" UPDATE ubicacionpartes SET Descripcion='"+ubiPar.getDescripcion()+"' "
        + "\n WHERE UbicacionPartesId='"+ubiPar.getUbucacionPartesId()+"'";
        Ejecutar(update);
    }
    //ELIMINAR UBICACIONPARTE
    public void EliminarUbicacionPartes(int ubiParId){
        String delete=" DELETE FROM ubicacionpartes WHERE UbicacionPartesId='"+ubiParId+"' ";
        Ejecutar(delete);
    }
    //LISTAR UBICACIONPARTE
    public ArrayList<UbicacionPartes> ListarUbicacionPartes(){
        ArrayList<UbicacionPartes> lstUbiPartes = new ArrayList<>();
        UbicacionPartes ubiPar=null;
        
        String select=" SELECT * FROM ubicacionpartes ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                ubiPar=new UbicacionPartes();
                ubiPar.setUbucacionPartesId(rs.getInt("UbicacionPartesId"));
                ubiPar.setDescripcion(rs.getString("Descripcion"));
                lstUbiPartes.add(ubiPar);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lstUbiPartes;
    }
    
    //METODOS DE CONSULTA
    //Metodos para equipo computo
    //La cantidad de equipos de la institucion
    public int CantidadTotalEquiposComputo(){
        //int cantidad=0;
        String selectcantidad=" SELECT COUNT(*) AS Cantidad_Equipos FROM equipocomputo";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(selectcantidad);
            rs=ps.executeQuery();
            if(rs.next()){
                //cantidad=rs.getInt("Cantidad_Equipos");
                return rs.getInt("Cantidad_Equipos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //return cantidad;
        return 0;
    }
    //Equipos en garantia
    public ArrayList<EquipoGarantia> EquiposEnGarantia(){
        ArrayList<EquipoGarantia> lstEGarantia = new ArrayList<>();
        EquipoGarantia equipo=null;
        String select = " SELECT Serial,Marca,Modelo,FechaCompra,"
                + "date_add(FechaCompra, INTERVAL VencimientoGarantia month)as vence\n" +
                "\n FROM equipocomputo" +
                "\n WHERE date_add(FechaCompra, INTERVAL VencimientoGarantia month)>CURRENT_DATE ";
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipo=new EquipoGarantia();
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setFechaCompra(rs.getDate("FechaCompra"));
                equipo.setFechaVencimiento(rs.getDate("vence"));
                lstEGarantia.add(equipo);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error en la base de datos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return lstEGarantia;
    }
    //Equipos por ambiente de formacion
    public ArrayList<EquipoComputo> ListadoEquiposEstudiantil(){
        ArrayList<EquipoComputo> lstEquipoEst = new ArrayList<>();
        EquipoComputo equipo;
        String select=" SELECT Serial,Marca,Modelo,Tipo" 
                +"\nFROM equipocomputo" 
                +"\nWHERE tipo like '%Estu%'; ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipo=new EquipoComputo();
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setTipo(rs.getString("Tipo"));
                lstEquipoEst.add(equipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            
        return lstEquipoEst;
    }
    //Equipos por ambiente de oficina
    public ArrayList<EquipoComputo> ListadoEquiposOficina(){
        ArrayList<EquipoComputo> lstEquipoOfc = new ArrayList<>();
        EquipoComputo equipo;
        String select=" SELECT Serial,Marca,Modelo,Tipo" 
                +"\nFROM equipocomputo"
                +"\nWHERE tipo like '%Ofi%'; ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipo=new EquipoComputo();
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                equipo.setTipo(rs.getString("Tipo"));
                lstEquipoOfc.add(equipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            
        return lstEquipoOfc;
    }
    
    //Metodos consulta cuentadante
    //Listado cuentadantes activos
    public ArrayList<Cuentadante> ListadoCuentadantesActivos(){
        ArrayList<Cuentadante> lstCueActivaos=new ArrayList<>();
        Cuentadante cue=null;
        String select=" SELECT Documento,Nombres,Apellidos,CantidadEquipos FROM cuentadante"
                + "\n WHERE CantidadEquipos>0";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                cue=new Cuentadante();
                cue.setDocumento(rs.getString("Documento"));
                cue.setNombres(rs.getString("Nombres"));
                cue.setApellidos(rs.getString("Apellidos"));
                cue.setCantidadEquipos(rs.getInt("CantidadEquipos"));
                
                lstCueActivaos.add(cue);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error en la base de datos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return lstCueActivaos;
    }
    public ArrayList<EquipoXCuentadante> ListadoEquipoPorCuentadante(){
        ArrayList<EquipoXCuentadante> lstEquipoCue = new ArrayList<>();
        EquipoXCuentadante equipo;
        String select=" SELECT Documento,Nombres,Apellidos,Serial,Marca,Modelo \n" +
            "FROM cuentadante\n" +
            "INNER JOIN equipocomputo\n" +
            "ON cuentadante.cuentadanteId=equipocomputo.cuentadanteId ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipo = new EquipoXCuentadante();
                equipo.setDocumento(rs.getString("Documento"));
                equipo.setNombres(rs.getString("Nombres"));
                equipo.setApellidos(rs.getString("Apellidos"));
                equipo.setSerial(rs.getString("Serial"));
                equipo.setMarca(rs.getString("Marca"));
                equipo.setModelo(rs.getString("Modelo"));
                lstEquipoCue.add(equipo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lstEquipoCue;
    }
    
    //Metodos consulta Proveedor
    public ArrayList<EquipoCompradoProveedor> ListadoEquipoCompradoProveedor(){
        ArrayList<EquipoCompradoProveedor> lstEquipoComprado= new ArrayList<>();
        EquipoCompradoProveedor equipoComprao=null;
        
        String select=" SELECT RazonSocial,Correo,Serial,Marca,Modelo \n" +
            "\n FROM proveedor" +
            "\n INNER JOIN equipocomputo" +
            "\n ON proveedor.ProveedorId=equipocomputo.ProveedorId ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                equipoComprao=new EquipoCompradoProveedor();
                equipoComprao.setSerial(rs.getString("Serial"));
                equipoComprao.setMarca(rs.getString("Marca"));
                equipoComprao.setModelo(rs.getString("Modelo"));
                equipoComprao.setRazonSocial(rs.getString("RazonSocial"));
                equipoComprao.setCorreo(rs.getString("Correo"));
                
                lstEquipoComprado.add(equipoComprao);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        return lstEquipoComprado;
    }
    
    //Metodos consulta ubicacion de un equipo en especifico
    public String UbicacionEquipoEspecifico(int equipoId){
        String select=" SELECT Descripcion FROM ubicacion_pc"
                + "\n INNER JOIN equipocomputo"
                + "\n ON ubicacion_pc.UbicacionPCId=equipocomputo.UbicacionPCId"
                + "\n WHERE equipocomputo.EquipoId='"+equipoId+"' ";
        try {
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                return "Ubicacion del equipo: "+rs.getString("Descripcion");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),
                    "Error en la base de datos",JOptionPane.CLOSED_OPTION);
        }
        return "No se encontro la ubicacion del equipo";
    }
    
    public ArrayList<String> UbicacionParteEspecifica(int EquipoId){
        ArrayList<String> lstUbiParte=new ArrayList<>();
        String select=" SELECT equipocomputo.Serial, equipocomputo.Marca, equipocomputo.Modelo,Descripcion "
                + "\n FROM ubicacionpartes"
                + "\n INNER JOIN partespc"
                + "\n ON partespc.Ubicacion_Partes = ubicacionpartes.UbicacionPartesId"
                + "\n INNER JOIN equipocomputo"
                + "\n ON partespc.EquipoId = equipocomputo.EquipoId"
                + "\n WHERE equipocomputo.EquipoId = '"+EquipoId+"' ";
        try{
            con=this.cn.getConnection();
            ps=con.prepareStatement(select);
            rs=ps.executeQuery();
            if(rs.next()){
                lstUbiParte.add(rs.getString("Descripcion"));
                lstUbiParte.add(rs.getString("Serial")+" || "+rs.getString("Marca")+" || "+rs.getString("Modelo"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lstUbiParte;
    }
}

