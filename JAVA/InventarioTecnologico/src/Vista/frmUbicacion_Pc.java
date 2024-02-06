
package Vista;

import Controlador.DAO;
import Model.EquipoComputo;
import Model.Ubicacion_Pc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmUbicacion_Pc extends javax.swing.JInternalFrame {
    //Clases Objetos
    
    DAO objDAO = new DAO();
    ArrayList<Ubicacion_Pc> lstUbiPcs;
    int PosUbiPc=0;
    public frmUbicacion_Pc() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnCrearUbiPc = new javax.swing.JButton();
        btnModificarUbiPc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxUbiPcs = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnMsjEliminar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnComoModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ubicacion Pc");
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

        jLabel1.setText("Descripcion/Lugar:");

        btnCrearUbiPc.setText("Crear");
        btnCrearUbiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUbiPcActionPerformed(evt);
            }
        });

        btnModificarUbiPc.setText("Modificar");
        btnModificarUbiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUbiPcActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Ubicacion PC");

        jLabel4.setText("Ubicaciones Pc:");

        cbxUbiPcs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxUbiPcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUbiPcsActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMsjEliminar.setText("Como Eliminar");
        btnMsjEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsjEliminarActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnComoModificar.setText("Como Modificar");
        btnComoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnCrearUbiPc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarUbiPc)
                                .addGap(12, 12, 12)
                                .addComponent(btnEliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxUbiPcs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMsjEliminar)
                            .addComponent(btnClear)
                            .addComponent(btnComoModificar))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxUbiPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearUbiPc)
                            .addComponent(btnModificarUbiPc)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMsjEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComoModificar)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUbiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUbiPcActionPerformed
        // TODO add your handling code here:
        CrearUbicacionPc();
    }//GEN-LAST:event_btnCrearUbiPcActionPerformed

    private void btnModificarUbiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUbiPcActionPerformed
        // TODO add your handling code here:
        ModificarUbicacionPc();
    }//GEN-LAST:event_btnModificarUbiPcActionPerformed

    private void btnMsjEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMsjEliminarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Primero, seleccione la ubicacion eliminar dentro de "
                + "\n 'Ubicaciones Pc' y luego pulse el boton eliminar");
    }//GEN-LAST:event_btnMsjEliminarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxUbiPcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbiPcsActionPerformed
        // TODO add your handling code here:
        PosUbiPc=cbxUbiPcs.getSelectedIndex()-1;
    }//GEN-LAST:event_cbxUbiPcsActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarUbiPc();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnComoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoModificarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Primero debe seleccionar en el campo 'Ubicaciones Pc', "
                + "la ubicacion a modificar, luego de esto"
                + "\n debe escribir en el campo ");
    }//GEN-LAST:event_btnComoModificarActionPerformed
    

    
    //CrearUbicacion
    private void CrearUbicacionPc(){
        if(!txtDescripcion.getText().isEmpty()){
            Ubicacion_Pc ubiPc = new Ubicacion_Pc();
            ubiPc.setDescripcion(txtDescripcion.getText());
            objDAO.CrearUbicacionPc(ubiPc);
            //Llamo funcion limpieza y actualizo combo box
            Clear();
            llenarCbx();
        }else{
            JOptionPane.showMessageDialog(null, "El campo Descripcion, esta vacio");
            txtDescripcion.requestFocus();
        }
    }
    //Eliminar UbicacionPc
    private void EliminarUbiPc(){
        if(cbxUbiPcs.getSelectedIndex()>0){
            int con=JOptionPane.showConfirmDialog(this, "¿Desea eliminar esta ubicacion?",
                    "Eliminar",JOptionPane.OK_CANCEL_OPTION);
            if(con==0){
                objDAO.EliminarUbicacionPc(lstUbiPcs.get(PosUbiPc).getUbicacionPcId());
                Clear();
                llenarCbx();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Se requiere que escoja una ubicacion ya existente"
                    + "\n -Para una informacion mas detallada presione el boton "
                    + "\n 'Como Eliminar'");
            
        }
    }
    //ModificarUbicacion
    private void ModificarUbicacionPc(){
        if(!txtDescripcion.getText().isEmpty()){
            if(cbxUbiPcs.getSelectedIndex()>0){
                Ubicacion_Pc ubiPC= new Ubicacion_Pc(lstUbiPcs.get(PosUbiPc).getUbicacionPcId(),
                        txtDescripcion.getText());
                objDAO.ModificarUbicacionPc(ubiPC);
                Clear();
                llenarCbx();
            }else{
                JOptionPane.showMessageDialog(this, "El campo 'Ubicaciones Pc' debe recibir una de las ubicaciones"
                        + "\n ya existentes");
            }
        }else{
            JOptionPane.showMessageDialog(this,"El campo descripcion está vacio");
        }
    }

    
    //Metodos calidad vista
    private void Clear(){
        int con=JOptionPane.showConfirmDialog(this, "¿Desea limpiar la pantalla?",
                "Limpiar",JOptionPane.OK_CANCEL_OPTION);
        if(con==0){
            txtDescripcion.setText("");
            cbxUbiPcs.setSelectedIndex(0);
            txtDescripcion.requestFocus();
        }
    }
    
    //Metodos aparte
    private void llenarCbx(){
        lstUbiPcs = objDAO.ListarUbicacionPc();
        cbxUbiPcs.removeAllItems();
        cbxUbiPcs.addItem("--Seleccionar--");
        for(Ubicacion_Pc up:lstUbiPcs){
            cbxUbiPcs.addItem(up.getDescripcion());
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnComoModificar;
    private javax.swing.JButton btnCrearUbiPc;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificarUbiPc;
    private javax.swing.JButton btnMsjEliminar;
    private javax.swing.JComboBox<String> cbxUbiPcs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
