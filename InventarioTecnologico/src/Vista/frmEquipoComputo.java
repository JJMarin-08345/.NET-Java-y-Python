
package Vista;

import Controlador.DAO;
import Model.Cuentadante;
import Model.Ubicacion_Pc;
import Model.Proveedor;
import Model.EquipoComputo;
import Model.EquipoView;
import java.time.LocalDate;
import PlaceHolder.TextPrompt;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class frmEquipoComputo extends javax.swing.JInternalFrame {
    DAO objDAO = new DAO();
    ArrayList<Cuentadante> lstCuentadante;
    ArrayList<Ubicacion_Pc> lstUbiPc;
    ArrayList<Proveedor> lstProveedor;
    int cbxCue=0;
    int PosUbi=0;
    int PosPro=0;
    public frmEquipoComputo() {
        initComponents();
        objDAO.Holder = new TextPrompt("0000-0000-0000", txtSerialEquipo);
        objDAO.Holder = new TextPrompt("Valor en meses", txtVencimientoEquipo);
        objDAO.Holder = new TextPrompt("ASUS/LG/DELL/HP...", txtMarcaEquipo);  
        objDAO.Holder = new TextPrompt("M545X", txtModeloEquipo);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEquipoId = new javax.swing.JTextField();
        txtSerialEquipo = new javax.swing.JTextField();
        txtModeloEquipo = new javax.swing.JTextField();
        cbxTipoEquipo = new javax.swing.JComboBox<>();
        txtVencimientoEquipo = new javax.swing.JTextField();
        txtMarcaEquipo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCuentadante = new javax.swing.JComboBox<>();
        cbxDiaCompra = new javax.swing.JComboBox<>();
        cbxMesCompra = new javax.swing.JComboBox<>();
        cbxYearCompra = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbxUbiPC = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Equipos de la institucion");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Equipo Computo ID:");

        jLabel2.setText("Serial:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Clasificacion:");

        jLabel6.setText("Fecha de Compra:");

        jLabel7.setText("Garantia:");

        jLabel8.setText("Cuentadante encargado:");

        txtEquipoId.setEditable(false);

        txtSerialEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialEquipoActionPerformed(evt);
            }
        });

        cbxTipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Oficina", "Estudiantil" }));

        btnAgregar.setText("Agregar Equipo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar Equipo");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Equipo");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Equipo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbxCuentadante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxCuentadante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCuentadanteActionPerformed(evt);
            }
        });

        cbxDiaCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Dia--" }));

        cbxMesCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Mes--" }));

        cbxYearCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Año--" }));

        jLabel9.setText("Ubicacion:");

        cbxUbiPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUbiPCActionPerformed(evt);
            }
        });

        jLabel10.setText("Proveedor:");

        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVencimientoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbxTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtEquipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxDiaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxMesCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxYearCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnModificar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxCuentadante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUbiPC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMarcaEquipo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtModeloEquipo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSerialEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addComponent(btnBuscar)))
                        .addGap(71, 71, 71)
                        .addComponent(btnLimpiar)))
                .addGap(66, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEquipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSerialEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarcaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModeloEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxDiaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMesCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxYearCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVencimientoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxCuentadante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbxUbiPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        AgregarEquipo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarEquipo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbxCuentadanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCuentadanteActionPerformed
        // TODO add your handling code here:
        cbxCue=cbxCuentadante.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxCuentadanteActionPerformed

    private void txtSerialEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialEquipoActionPerformed
        // TODO add your handling code here:
        //txtSerialEquipo.requestFocus();
    }//GEN-LAST:event_txtSerialEquipoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarEquipo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BuscarEquipo();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxUbiPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbiPCActionPerformed
        // TODO add your handling code here:
        PosUbi = cbxUbiPC.getSelectedIndex();
    }//GEN-LAST:event_cbxUbiPCActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
        PosPro = cbxProveedor.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxProveedorActionPerformed

    //Faltan, crear,modificar,buscar,eliminar,limpiar,validar 
    private void AgregarEquipo(){
        if (valCampos()==false){
            int year=Integer.parseInt(""+cbxYearCompra.getSelectedItem());
            int mes= Integer.parseInt(""+cbxMesCompra.getSelectedItem());
            int dia= Integer.parseInt(""+cbxDiaCompra.getSelectedItem());
            LocalDate FechaCompraEquipo = LocalDate.of(year, mes, dia);
            
            int ProveedorId = lstProveedor.get(PosPro).getProveedorId();
            int CuentadanteId = lstCuentadante.get(cbxCue).getCueId();
            int UbicacionId = lstUbiPc.get(PosUbi).getUbicacionPcId();
            
            EquipoComputo equipo = new EquipoComputo(txtSerialEquipo.getText(), txtMarcaEquipo.getText(),
                    txtModeloEquipo.getText(), ""+cbxTipoEquipo.getSelectedItem(),FechaCompraEquipo ,
                    Integer.parseInt((txtVencimientoEquipo.getText())),
                    CuentadanteId, UbicacionId, ProveedorId);
            objDAO.CrearEquipoComputo(equipo);
        }
    }
    
    private void ModificarEquipo(){
        if(valCampos()==false){
            int ProveedorId = lstProveedor.get(PosPro).getProveedorId();
            int CuentadanteId = lstCuentadante.get(cbxCue).getCueId();
            int UbicacionId = lstUbiPc.get(PosUbi).getUbicacionPcId();
            
            int year=Integer.parseInt(""+cbxYearCompra.getSelectedItem());
            int mes= Integer.parseInt(""+cbxMesCompra.getSelectedItem());
            int dia= Integer.parseInt(""+cbxDiaCompra.getSelectedItem());
            LocalDate FechaCompraEquipo= LocalDate.of(year, mes, dia);
            
            EquipoComputo equipo = new EquipoComputo();
            equipo.setEquipoId(Integer.parseInt(txtEquipoId.getText()));
            equipo.setFechaCompra(FechaCompraEquipo);
            equipo.setMarca(txtMarcaEquipo.getText());
            equipo.setTipo(""+cbxTipoEquipo.getSelectedItem());
            equipo.setModelo(txtModeloEquipo.getText());
            equipo.setSerial(txtSerialEquipo.getText());
            equipo.setVencimientoGarantia(Integer.parseInt(txtVencimientoEquipo.getText()));
            
            equipo.setCuentadanteId(CuentadanteId);
            equipo.setUbicacionId(UbicacionId);
            equipo.setProveedorId(ProveedorId);
            
            if(objDAO.ModificarEquipoComputo(equipo)){
                Limpiar();
            }
            
        }
    }
    
    private void EliminarEquipo(){
        if(valCampos()==false){
            int con=JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
                    "Eliminar",JOptionPane.OK_CANCEL_OPTION);
            if(con==0){
                if(objDAO.EliminarEquipoComputo(lstCuentadante.get(cbxCue).getDocumento(),txtSerialEquipo.getText())){
                    Limpiar();
                }else{
                    txtSerialEquipo.requestFocus();
                }
            }
        }
    }
    
    private void BuscarEquipo(){
        if(!txtSerialEquipo.getText().isEmpty()){
            EquipoView equipo=objDAO.BuscarEquipoComputo(txtSerialEquipo.getText());
            if(equipo!=null){
                //int year=equipo.getFechaCompra().getYear()-2009;
                int year=equipo.getFechaCompra().getYear();
                int mes=equipo.getFechaCompra().getMonthValue();
                int dia=equipo.getFechaCompra().getDayOfMonth();
                //JOptionPane.showMessageDialog(this, equipo.getFechaCompra().getYear());
                //JOptionPane.showMessageDialog(this, equipo.getFechaCompra().getMonthValue());
                //JOptionPane.showMessageDialog(this, equipo.getFechaCompra().getDayOfMonth());
                txtEquipoId.setText(""+equipo.getEquipoViewId());
                txtMarcaEquipo.setText(equipo.getMarca());
                txtModeloEquipo.setText(equipo.getModelo());
                cbxTipoEquipo.setSelectedItem(equipo.getTipo());
                txtVencimientoEquipo.setText(""+equipo.getVencimientoGarantia());
                cbxYearCompra.setSelectedItem(""+year);
                //cbxYearCompra.setSelectedIndex(year);
                cbxMesCompra.setSelectedItem(""+mes);
                cbxDiaCompra.setSelectedItem(""+dia);
                cbxCuentadante.setSelectedItem(equipo.getDocYApeCuentadante());
                txtVencimientoEquipo.setText(""+equipo.getVencimientoGarantia());
                cbxUbiPC.setSelectedItem(equipo.getUbicacionPCId());
                cbxProveedor.setSelectedItem(equipo.getRazonSocial());
                
            }
        }else{
            JOptionPane.showMessageDialog(this, "El campo 'Serial' esta vacio");
            txtSerialEquipo.requestFocus();
        }
    }
    
    //Metodos Calidad
    private void Limpiar(){
        int confirm = JOptionPane.showConfirmDialog(this,"¿Desea limpiar el formulario?",
                "Limpiar Formulario",JOptionPane.OK_CANCEL_OPTION);
        if(confirm==0){
            //El txtcuentadante cambiara
            cbxUbiPC.setSelectedIndex(0);
            cbxCuentadante.setSelectedIndex(0);
            cbxProveedor.setSelectedIndex(0);
            txtEquipoId.setText("");
            cbxDiaCompra.setSelectedIndex(0);
            cbxMesCompra.setSelectedIndex(0);
            cbxYearCompra.setSelectedIndex(0);
            txtVencimientoEquipo.setText("");
            txtMarcaEquipo.setText("");
            txtModeloEquipo.setText("");
            txtSerialEquipo.setText("");
            txtSerialEquipo.requestFocus();
        }
    }
    private boolean valCampos(){
        boolean lleno=false;
        if(txtMarcaEquipo.getText().isEmpty()
                || txtModeloEquipo.getText().isEmpty() || cbxYearCompra.getSelectedIndex()==0 
                || cbxMesCompra.getSelectedIndex()==0 || cbxDiaCompra.getSelectedIndex()==0
                || txtVencimientoEquipo.getText().isEmpty() || txtSerialEquipo.getText().isEmpty()
                || cbxCuentadante.getSelectedIndex()==0 || cbxProveedor.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos");
            lleno=true;
        }else{
            if(!valVencimiento()){
              lleno=true;
            }
        }
        return lleno;
    }
    private boolean valVencimiento(){
        try {
            Integer.parseInt(txtVencimientoEquipo.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite solo numeros en el campo 'Garantia'",
                    "Garantia invalida",JOptionPane.WARNING_MESSAGE);
            txtVencimientoEquipo.requestFocus();
        }
        return false;
    }
    
    //Metodos Aparte
    private void llenarCbx(){
        LocalDate year=LocalDate.now();
        //Listas 
        lstCuentadante=objDAO.ListarCuentadante();
        lstUbiPc=objDAO.ListarUbicacionPc();
        lstProveedor=objDAO.ListarProveedores();
        
        for(int dia=1;dia<32;dia++){
            cbxDiaCompra.addItem(""+dia);
        }
        for(int mes=1;mes<13;mes++){
            cbxMesCompra.addItem(""+mes);
        }
        for(int i=2010;i<year.getYear()+1;i++){
            cbxYearCompra.addItem(""+i);
        }
        
        for(Cuentadante c:lstCuentadante){
            cbxCuentadante.addItem("CC: "+c.getDocumento()+" || "+c.getApellidos());
        }
        
        for(Ubicacion_Pc ubi:lstUbiPc){
            cbxUbiPC.addItem(ubi.getDescripcion());
        }
        
        for(Proveedor pr:lstProveedor){
            cbxProveedor.addItem(pr.getRazonSocial());
        }
        /*

        lstProveedor.forEach((pr) -> {
            cbxProveedor.addItem(pr.getRazonSocial());
        });
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxCuentadante;
    private javax.swing.JComboBox<String> cbxDiaCompra;
    private javax.swing.JComboBox<String> cbxMesCompra;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxTipoEquipo;
    private javax.swing.JComboBox<String> cbxUbiPC;
    private javax.swing.JComboBox<String> cbxYearCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEquipoId;
    private javax.swing.JTextField txtMarcaEquipo;
    private javax.swing.JTextField txtModeloEquipo;
    private javax.swing.JTextField txtSerialEquipo;
    private javax.swing.JTextField txtVencimientoEquipo;
    // End of variables declaration//GEN-END:variables
}
