
package Vista;

/**
@author Juan Jose Marin
**/
import Model.PartesPC;
import Model.Proveedor;
import Model.EquipoComputo;
import Model.UbicacionPartes;
import Controlador.DAO;
import Model.PartesPcView;
import PlaceHolder.TextPrompt;
import java.util.ArrayList;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class frmPartesPC extends javax.swing.JInternalFrame {
    
    DAO objDAO = new DAO();
    ArrayList<Proveedor> lstProveedor;
    ArrayList<EquipoComputo> lstEquipos;
    ArrayList<UbicacionPartes> lstUbiPartes;
    //Para manejar posiciones de los combobox
    int PosProveedor=0;
    int PosEquipo=0;
    int PosUbicacionParte=0;
    
    public frmPartesPC() {
        initComponents();
              objDAO.Holder = new TextPrompt("JAD67083KIDL90PBV5",txtSerialParte);
        objDAO.Holder = new TextPrompt("AMD Dual Core A9",txtNombreParte);
        objDAO.Holder = new TextPrompt("AMD",txtMarcaParte);
        objDAO.Holder = new TextPrompt("24",txtVencimientoParte);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtSerialParte = new javax.swing.JTextField();
        txtMarcaParte = new javax.swing.JTextField();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxYear = new javax.swing.JComboBox<>();
        txtVencimientoParte = new javax.swing.JTextField();
        cbxEquipo = new javax.swing.JComboBox<>();
        cbxProveedor = new javax.swing.JComboBox<>();
        cbxUbiParte = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNombreParte = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Partes para instalar a un PC");
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

        jLabel2.setText("Serial:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Fecha Compra:");

        jLabel5.setText("Vencimiento:");

        jLabel6.setText("Equipo a instalr piezas:");

        jLabel7.setText("Proveedor:");

        jLabel8.setText("Ubicacion de la pieza:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar pieza");
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

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Dia--" }));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Mes--" }));

        cbxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Año--" }));

        cbxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquipoActionPerformed(evt);
            }
        });

        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });

        cbxUbiParte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxUbiParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUbiParteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("PARTES PC");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUbiParte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVencimientoParte, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMarcaParte, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSerialParte)
                                            .addComponent(txtNombreParte))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSerialParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNombreParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMarcaParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVencimientoParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxUbiParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Crear();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        LlenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquipoActionPerformed
        // TODO add your handling code here:
        PosEquipo=cbxEquipo.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxEquipoActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
        PosProveedor=cbxProveedor.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxProveedorActionPerformed

    private void cbxUbiParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbiParteActionPerformed
        // TODO add your handling code here:
        PosUbicacionParte=cbxUbiParte.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxUbiParteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Metodos CRUD
    private void Crear(){
        //Variables para crear la partePc
        if(!valCampos()){
            int vencimiento=Integer.parseInt(txtVencimientoParte.getText());
            int dia=Integer.parseInt(""+cbxDia.getSelectedItem());
            int mes=Integer.parseInt(""+cbxMes.getSelectedItem());
            int anio=Integer.parseInt(""+cbxYear.getSelectedItem());
            LocalDate fCompra = LocalDate.of(anio, mes, dia);
            int equipoId=lstEquipos.get(PosEquipo).getEquipoId();
            int proveedorId=lstProveedor.get(PosProveedor).getProveedorId();
            int ubiparteId=lstUbiPartes.get(PosUbicacionParte).getUbucacionPartesId();

            PartesPC parte = new PartesPC(txtNombreParte.getText(),txtSerialParte.getText(), txtMarcaParte.getText(),
                    fCompra, vencimiento, equipoId, proveedorId, ubiparteId);
            objDAO.CrearPartePc(parte);
        }
    }
    
    private void Buscar(){
        if(!txtSerialParte.getText().isEmpty()){
            PartesPcView parte = objDAO.BuscarPartePC(txtSerialParte.getText());
            
        }
    }
    
    //Metodos validacion
    private boolean valCampos(){
        if(txtNombreParte.getText().isEmpty() || txtSerialParte.getText().isEmpty() 
                || txtMarcaParte.getText().isEmpty() || txtVencimientoParte.getText().isEmpty()
                || cbxDia.getSelectedIndex()==0 || cbxMes.getSelectedIndex()==0 || cbxYear.getSelectedIndex()==0
                || cbxEquipo.getSelectedIndex()==0 || cbxProveedor.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos");
            return true;
        }
        return false;
    }
    
    //Metodo limpieza
    private void Limpiar(){
        int con = JOptionPane.showConfirmDialog(this, "¿Desea limpiar la pantalla?",
                "Limpiar Pantalla",JOptionPane.OK_CANCEL_OPTION);
        if(con==0){
            txtNombreParte.setText("");
            txtSerialParte.setText("");
            txtMarcaParte.setText("");
            txtVencimientoParte.setText("");
            cbxDia.setSelectedIndex(0);
            cbxMes.setSelectedIndex(0);
            cbxYear.setSelectedIndex(0);
            cbxEquipo.setSelectedIndex(0);
            cbxProveedor.setSelectedIndex(0);
            cbxUbiParte.setSelectedIndex(0);
        }
    }
    
    //Metodos Aparte
    private void LlenarCbx(){
        LocalDate year = LocalDate.now();
        
        for (int i=1;i<32;i++){
            cbxDia.addItem(""+i);
        }
        for (int i=1;i<13;i++){
            cbxMes.addItem(""+i);
        }
        for (int i=2011;i<year.getYear()+1;i++){
            cbxYear.addItem(""+i);
        }
        
        ListadoCbx("Proveedor");
        ListadoCbx("Equipo");
        ListadoCbx("UbiParte");
    }
    private void ListadoCbx(String accion){
        lstProveedor=objDAO.ListarProveedores();
        lstEquipos=objDAO.ListarEquipoComputo();
        lstUbiPartes=objDAO.ListarUbicacionPartes();
        switch(accion){
            case "Proveedor":
                for(Proveedor pro:lstProveedor){
                    cbxProveedor.addItem(pro.getRazonSocial());
                }
                break;
            case "Equipo":
                for(EquipoComputo equ:lstEquipos){
                    cbxEquipo.addItem(equ.getSerial()+" || "+equ.getMarca());
                }
                break;
            case "UbiParte":
                for(UbicacionPartes up:lstUbiPartes){
                    cbxUbiParte.addItem(up.getDescripcion());
                }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxEquipo;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxUbiParte;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMarcaParte;
    private javax.swing.JTextField txtNombreParte;
    private javax.swing.JTextField txtSerialParte;
    private javax.swing.JTextField txtVencimientoParte;
    // End of variables declaration//GEN-END:variables
}
