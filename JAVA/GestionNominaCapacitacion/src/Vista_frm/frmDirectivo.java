/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_frm;
import Clases_Gestion.Directivo;
import Clases_Gestion.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class frmDirectivo extends javax.swing.JInternalFrame {

    ArrayList<Empleado> secretarias;
    
    public frmDirectivo() {
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
        btnBuscarDir = new javax.swing.JButton();
        txtDocumentoDir = new javax.swing.JTextField();
        lblNameDir = new javax.swing.JLabel();
        lblApeDir = new javax.swing.JLabel();
        txtPAcargo = new javax.swing.JTextField();
        cbxSecretaria = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Directivos");
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

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Documento:");

        jLabel4.setText("Personal a cargo:");

        jLabel5.setText("Secretaria:");

        btnBuscarDir.setText("Buscar");
        btnBuscarDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDirActionPerformed(evt);
            }
        });

        lblNameDir.setText("-----------------------------------");

        lblApeDir.setText("-----------------------------------");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDocumentoDir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPAcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNameDir)
                                            .addComponent(lblApeDir))))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarDir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnLimpiar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarDir)
                    .addComponent(txtDocumentoDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNameDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblApeDir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPAcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        secretarias=frmEmpleado.objEmpresa.BuscarSecretarias();
        for(int i=0;i<secretarias.size();i++){
            cbxSecretaria.addItem(secretarias.get(i).getNombres()+" "+secretarias.get(i).getApellidos());
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnBuscarDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDirActionPerformed
        // TODO add your handling code here:
        if(txtDocumentoDir.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ingrese un documento");
        }else{
            buscarDirectivo();
        }
    }//GEN-LAST:event_btnBuscarDirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        int confirm=JOptionPane.showConfirmDialog(this,"¿Desea limpiar el formulario?",
                "Limpiar",JOptionPane.OK_CANCEL_OPTION);
        if(confirm==0){
            clear();
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    private void buscarDirectivo(){
        //me toca hacerlo asi pq al no tener la funcion que me guarde los directivos, no puedo enviar la secretaria
        Empleado dir = frmEmpleado.objEmpresa.BuscarEmpleadoDocumento(txtDocumentoDir.getText(),true);    
        
        if (dir!=null){
            if(dir.getTipo().equals("Directivo")){
                lblNameDir.setText(dir.getNombres());
                lblApeDir.setText(dir.getApellidos());
            }else{
                JOptionPane.showMessageDialog(null, "El empleado no es de tipo directivo");
            }
        }
    }
    
    private void saveDir(){
        Empleado lasecretaria=null;
        for (int i=0;i<secretarias.size();i++){
            if(frmEmpleado.objEmpresa.BuscarEmpleadoDocumento(txtDocumentoDir.getText(),true)!=null){
                if(cbxSecretaria.getSelectedItem().equals(secretarias.get(i).getNombres()+" "+
                        secretarias.get(i).getApellidos())){
                    lasecretaria=secretarias.get(i);
                    Directivo dir = new Directivo(lasecretaria,Integer.parseInt(txtPAcargo.getText()));
                    //frmEmpleado.objEmpresa.GuardarDirectivo(dir);
                    //cbxSecretaria.removeItemAt(i);
                    /*Esta cosa no me dio por ningun lado, el ciclo sirve, me retorna el tipo empleado 
                    que necesito para crear el directivo, pero no me deja es guardarlo, no pude.
                    */
                }
            }
        }
        if(lasecretaria==null){
            JOptionPane.showMessageDialog(this,"No se pudo guardar");
        }
    }
    
    private boolean valCamp(){
        boolean camp=false;
        if(txtDocumentoDir.getText().isEmpty() || txtPAcargo.getText().isEmpty()){
            camp=true;
            JOptionPane.showMessageDialog(this,"Por favor, rellene todos los campos");
        }
        return camp;
    }
    
    private void clear(){
        txtDocumentoDir.setText("");
        txtPAcargo.setText("");
        lblNameDir.setText("-----------------------------------");
        lblApeDir.setText("-----------------------------------");
        cbxSecretaria.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxSecretaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblApeDir;
    private javax.swing.JLabel lblNameDir;
    private javax.swing.JTextField txtDocumentoDir;
    private javax.swing.JTextField txtPAcargo;
    // End of variables declaration//GEN-END:variables
}
