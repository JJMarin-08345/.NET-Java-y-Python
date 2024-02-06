
package Vista;

import Controlador.DAO;
import Model.Proveedor;
import Model.SoftwareView;
import Model.Software;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Jose Marin
 */
public class frmSoftware extends javax.swing.JInternalFrame {
    //Metodos
    DAO objDAO = new DAO();
    ArrayList<Proveedor> lstProveedor;
    
    ArrayList<SoftwareView> lstSoftware;
    SoftwareView sfwelst;
    int posicion=0;
    int PosPro=0;
    
    public frmSoftware() {
        initComponents();
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
        txtSoftwareId = new javax.swing.JTextField();
        txtSoftwareNombre = new javax.swing.JTextField();
        txtVersionSoftware = new javax.swing.JTextField();
        txtInstalationKey = new javax.swing.JTextField();
        txtCantidadLicencias = new javax.swing.JTextField();
        cbxProveedor = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        txtVigencia = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Software ");
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

        jLabel1.setText("Identificador:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Version:");

        jLabel4.setText("Clave de instalacion:");

        jLabel5.setText("Cantidad de licencias:");

        jLabel6.setText("Vigencia:");

        jLabel7.setText("Proveedor:");

        txtSoftwareId.setEditable(false);

        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtInstalationKey, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtVersionSoftware))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSoftwareNombre))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSoftwareId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSiguiente))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtVigencia))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCantidadLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 42, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnCrear)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificar)
                        .addGap(32, 32, 32)
                        .addComponent(btnEliminar)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoftwareId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoftwareNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVersionSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInstalationKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
        PosPro=cbxProveedor.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxProveedorActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        CrearSoftware();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarcbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarSoftware();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarSoftware();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BuscarSoftware();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        if(posicion>0){
            posicion--;
            MostrarSoftware(posicion);
        }else if(posicion==0){
            JOptionPane.showMessageDialog(this, "No hay mas atras");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        if(posicion<lstSoftware.size()-1){
            posicion++;
            MostrarSoftware(posicion);
        }else if (posicion==lstSoftware.size()-1){
            posicion=lstSoftware.size()-1;
            JOptionPane.showMessageDialog(this, "No hay mas adelante");
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void CrearSoftware(){
        //JOptionPane.showMessageDialog(this,lstProveedor.get(PosPro).getProveedorId());
        if(!valCampos()){
            Software sfwe = new Software(txtSoftwareNombre.getText(), txtVersionSoftware.getText(),
                    txtInstalationKey.getText(), Integer.parseInt(txtCantidadLicencias.getText()),
                    Integer.parseInt(txtVigencia.getText()), lstProveedor.get(PosPro).getProveedorId());
            objDAO.CrearSoftware(sfwe);
            Limpiar();
        }
    }
    private void EliminarSoftware(){
        int con=JOptionPane.showConfirmDialog(this,"¿Esta seguro de eliminar?",
                "Eliminar Software",JOptionPane.OK_CANCEL_OPTION);
        if(con==0){
            objDAO.EliminarSoftware(Integer.parseInt(txtSoftwareId.getText()));
            Limpiar();
        }
    }
    private void ModificarSoftware(){
        if (!valCampos()){
            Software sfwe = new Software(Integer.parseInt(txtSoftwareId.getText()),txtSoftwareNombre.getText(),
                    txtVersionSoftware.getText(),txtInstalationKey.getText(), 
                    Integer.parseInt(txtCantidadLicencias.getText()),
                    Integer.parseInt(txtVigencia.getText()), lstProveedor.get(PosPro).getProveedorId());
            objDAO.ModificarSoftware(sfwe);
            Limpiar();
        }
    }
    private void BuscarSoftware(){
        lstSoftware=objDAO.BuscarSoftware(txtSoftwareNombre.getText());
        if(lstSoftware.size()>0){
            txtSoftwareId.setText(""+lstSoftware.get(posicion).getSoftwareId());
            txtSoftwareNombre.setText(lstSoftware.get(posicion).getNombre());
            txtVersionSoftware.setText(lstSoftware.get(posicion).getVersion());
            txtCantidadLicencias.setText(""+lstSoftware.get(posicion).getCantidadLicencias());
            txtInstalationKey.setText(lstSoftware.get(posicion).getInstalationKey());
            txtVigencia.setText(""+lstSoftware.get(posicion).getVigencia());
            cbxProveedor.setSelectedItem(lstSoftware.get(posicion).getRazonSocial());
        }else{
            JOptionPane.showMessageDialog(this, "No se encontro");
        }
    }

    
    //Metodos aparte
    private void llenarcbx(){
        lstProveedor=objDAO.ListarProveedores();
        for (Proveedor pro:lstProveedor){
            cbxProveedor.addItem(pro.getRazonSocial());
        }
    }
    private void MostrarSoftware(int pos){
        sfwelst = lstSoftware.get(pos); 
        txtSoftwareId.setText(""+sfwelst.getSoftwareId());
        txtSoftwareNombre.setText(sfwelst.getNombre());
        txtVersionSoftware.setText(sfwelst.getVersion());
        txtCantidadLicencias.setText(""+sfwelst.getCantidadLicencias());
        txtVigencia.setText(""+sfwelst.getVigencia());
        cbxProveedor.setSelectedItem(sfwelst.getRazonSocial());
        
    }
    
    //Metodos calidad
    private boolean NumberException(){
        try{
            Integer.parseInt(txtCantidadLicencias.getText());
            Integer.parseInt(txtVigencia.getText());
            return true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros en los campos \n "
                    + "'Vigencia' o 'Cantidad Licencias' ");
        }
        return false;
    }
    private boolean valCampos(){
        if(txtCantidadLicencias.getText().isEmpty() || txtInstalationKey.getText().isEmpty()
                || txtSoftwareNombre.getText().isEmpty() || txtVersionSoftware.getText().isEmpty()
                || txtVigencia.getText().isEmpty() || cbxProveedor.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Por favor rellene todos los campos");
            return true;
        }else{
            if(!NumberException()){
                return true;
            }
        }
        return false;
    }
    private void Limpiar(){
        int con=JOptionPane.showConfirmDialog(this, "¿Desea limpiar pantalla?",
                "Limpiar Pantalla",JOptionPane.OK_CANCEL_OPTION);
        txtSoftwareId.setText("");
        txtSoftwareNombre.setText("");
        txtVersionSoftware.setText("");
        txtVigencia.setText("");
        txtCantidadLicencias.setText("");
        txtInstalationKey.setText("");
        cbxProveedor.setSelectedIndex(0);
        txtSoftwareNombre.requestFocus();
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCantidadLicencias;
    private javax.swing.JTextField txtInstalationKey;
    private javax.swing.JTextField txtSoftwareId;
    private javax.swing.JTextField txtSoftwareNombre;
    private javax.swing.JTextField txtVersionSoftware;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables
}
