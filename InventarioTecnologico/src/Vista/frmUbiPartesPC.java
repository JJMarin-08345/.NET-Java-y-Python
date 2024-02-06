
package Vista;

import Controlador.DAO;
import Model.UbicacionPartes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 @author Juan Jose Marin
**/

public class frmUbiPartesPC extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    ArrayList<UbicacionPartes> lstUbiPartes;
    int PosUbiPar=0;
    
    public frmUbiPartesPC() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescripcionUbiPartes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxUbiPartes = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnInfoModificar = new javax.swing.JButton();
        btnInfoEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ubicacion de Partes en un PC");
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

        jLabel1.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Ubicacion de partes en un equipo");

        jLabel4.setText("Ubicaciones Partes:");

        cbxUbiPartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxUbiPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUbiPartesActionPerformed(evt);
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

        btnInfoModificar.setText("Como Modificar");

        btnInfoEliminar.setText("Como Eliminar");
        btnInfoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUbiPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcionUbiPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInfoModificar)
                            .addComponent(btnInfoEliminar))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDescripcionUbiPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxUbiPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInfoEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfoModificar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        CrearUbiPartes();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void cbxUbiPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbiPartesActionPerformed
        // TODO add your handling code here:
        PosUbiPar=cbxUbiPartes.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxUbiPartesActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarUbiParte();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarUbiParte();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnInfoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEliminarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "En el desplegable 'Ubicaciones Partes' debe"
                + "\n seleccionar una de estas y luego pulsar 'Eliminar'",
                "COMO ELIMINAR",JOptionPane.WARNING_MESSAGE,frameIcon);
    }//GEN-LAST:event_btnInfoEliminarActionPerformed

    //Metodos CRUD
    private void CrearUbiPartes(){
        if(valCampos("Descripcion","")){
            UbicacionPartes ubiPar = new UbicacionPartes(txtDescripcionUbiPartes.getText());
            objDAO.CrearUbicacionPartes(ubiPar);
            Limpiar();
            llenarCbx();
        }
    }
    private void ModificarUbiParte(){
        if(valCampos("ComboBox","modificar")){
            if(valCampos("Descripcion","")){
                UbicacionPartes uPar = new UbicacionPartes(lstUbiPartes.get(PosUbiPar).getUbucacionPartesId(),
                        txtDescripcionUbiPartes.getText());
                objDAO.ModificarUbicacionPartes(uPar);
                Limpiar();
                llenarCbx();
            }
        }
    }
    private void EliminarUbiParte(){
        if(valCampos("ComboBox","eliminar")){
            int con=JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar?",
                    "Eliminar",JOptionPane.OK_CANCEL_OPTION);
            if(con==0){
                objDAO.EliminarUbicacionPartes(lstUbiPartes.get(PosUbiPar).getUbucacionPartesId());
                Limpiar();
                llenarCbx();
            }
        }
    }
    
    
    //Metodos calidad vista
    private boolean valCampos(String action, String tipe){
        switch(action){
            case "Descripcion":
                if(txtDescripcionUbiPartes.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"El campo Descripcion está vacio");
                    txtDescripcionUbiPartes.requestFocus();
                    return false;
                }
                break;
            case "ComboBox":
                if(cbxUbiPartes.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(this, "No hay nada seleccionado en 'Ubicaciones Partes' para "+tipe);
                    cbxUbiPartes.requestFocus();
                    return false;
                }
                break;
        }
        return true;
    }
    private void Limpiar(){
        txtDescripcionUbiPartes.setText("");
        cbxUbiPartes.setSelectedIndex(0);
    }
    
    //Metodos Apartes
    private void llenarCbx(){
        lstUbiPartes=objDAO.ListarUbicacionPartes();
        cbxUbiPartes.removeAllItems();
        
        cbxUbiPartes.addItem("--Seleccionar--");
        for (UbicacionPartes ubi:lstUbiPartes){
            cbxUbiPartes.addItem(ubi.getDescripcion());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInfoEliminar;
    private javax.swing.JButton btnInfoModificar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxUbiPartes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDescripcionUbiPartes;
    // End of variables declaration//GEN-END:variables
}
