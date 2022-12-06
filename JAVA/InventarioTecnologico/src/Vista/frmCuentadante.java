
package Vista;

import Model.Cuentadante;
import Controlador.DAO;
import PlaceHolder.TextPrompt;
import javax.swing.JOptionPane;

public class frmCuentadante extends javax.swing.JInternalFrame{
    //Clases de objetos
    DAO objDAO = new DAO();
    //TextPrompt Holder;
    public frmCuentadante() {
        initComponents();
        objDAO.Holder = new TextPrompt("0123456789", txtDocumentoCue);
        objDAO.Holder = new TextPrompt("Pepito", txtNombresCue);
        objDAO.Holder = new TextPrompt("Fernando Perez", txtApellidosCue);
        objDAO.Holder = new TextPrompt("pepitofernando@gmail.com", txtCorreoCue);
        objDAO.Holder = new TextPrompt("312-345-6789", txtTelefonoCue);
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
        txtDocumentoCue = new javax.swing.JTextField();
        txtNombresCue = new javax.swing.JTextField();
        txtApellidosCue = new javax.swing.JTextField();
        txtCorreoCue = new javax.swing.JTextField();
        txtCantidadEquipos = new javax.swing.JTextField();
        txtTelefonoCue = new javax.swing.JTextField();
        btnCrearCue = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnModificarCue = new javax.swing.JToggleButton();
        btnBuscarCue = new javax.swing.JButton();
        btnEliminarCue = new javax.swing.JButton();
        btnLimpiarCue = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCueId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Funcionarios Cuentadante");

        jLabel1.setText("Documento:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Cantidad de equipos a cargo:");

        txtCantidadEquipos.setEditable(false);

        btnCrearCue.setText("Crear");
        btnCrearCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCueActionPerformed(evt);
            }
        });

        jLabel7.setText("CUENTADANTES");

        btnModificarCue.setText("Modificar");
        btnModificarCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCueActionPerformed(evt);
            }
        });

        btnBuscarCue.setText("Buscar");
        btnBuscarCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCueActionPerformed(evt);
            }
        });

        btnEliminarCue.setText("Eliminar");
        btnEliminarCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCueActionPerformed(evt);
            }
        });

        btnLimpiarCue.setText("Limpiar");
        btnLimpiarCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCueActionPerformed(evt);
            }
        });

        jLabel8.setText("Identificador:");

        txtCueId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnCrearCue)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarCue)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCue))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidadEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(btnLimpiarCue))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtApellidosCue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(txtNombresCue, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCueId, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(txtDocumentoCue))
                                        .addGap(32, 32, 32)
                                        .addComponent(btnBuscarCue))
                                    .addComponent(txtTelefonoCue, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoCue, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCueId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDocumentoCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCue))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombresCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidosCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreoCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidadEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCue))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCue)
                    .addComponent(btnModificarCue)
                    .addComponent(btnEliminarCue))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCueActionPerformed
        // TODO add your handling code here:
        CrearCue();
    }//GEN-LAST:event_btnCrearCueActionPerformed

    private void btnModificarCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCueActionPerformed
        // TODO add your handling code here:
        Modificar();
    }//GEN-LAST:event_btnModificarCueActionPerformed

    private void btnBuscarCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCueActionPerformed
        // TODO add your handling code here:
        Buscar();
    }//GEN-LAST:event_btnBuscarCueActionPerformed

    private void btnEliminarCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCueActionPerformed
        // TODO add your handling code here:
        Eliminar();
    }//GEN-LAST:event_btnEliminarCueActionPerformed

    private void btnLimpiarCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCueActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarCueActionPerformed
    
    //Crear Cuentadante
    private void CrearCue(){
        //Sirve
        if (!ValCampos()){
            Cuentadante cue = new Cuentadante(txtDocumentoCue.getText(), txtNombresCue.getText(),
                    txtApellidosCue.getText(), txtCorreoCue.getText(), txtTelefonoCue.getText());
            if(objDAO.CrearCuentadante(cue)){
                Limpiar();
            }
        }
    }
    //Modificar Cuentadante
    private void Modificar(){
        if(ValCampos()!=true){
            Cuentadante Modifycue = new Cuentadante(Integer.parseInt(txtCueId.getText()),
                    txtDocumentoCue.getText(),txtNombresCue.getText(),
                    txtApellidosCue.getText(), txtCorreoCue.getText(), txtTelefonoCue.getText(),
                    Integer.parseInt(txtCantidadEquipos.getText()));
            if(objDAO.ModificarCuentadante(Modifycue)){
                Limpiar();   
            }
        }
    }
    //Eliminar Cuentadante por Documento
    private void Eliminar(){
        if (!txtDocumentoCue.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Para eliminar un cuentadante, debe ingresar su documento,"
                    + "\nluego de esto, presionar el boton buscar para que sepa cual es el usuario \na eliminar, "
                   + "si esta seguro del documento ingresado, puede borrarlo sin necesidad de buscarlo");
            int confirmar=JOptionPane.showConfirmDialog(this,"¿Esta seguro de eliminar?",
                    "ELIMINAR CUENTADANTE",JOptionPane.OK_CANCEL_OPTION);
            if(confirmar==0){
                objDAO.EliminarCuentadante(txtDocumentoCue.getText());
                Limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(this,"El campo 'Documento', esta vacio");
            txtDocumentoCue.requestFocus();
        }
    }
    //Buscar Cuentadante por Documento
    private void Buscar(){
        if(!txtDocumentoCue.getText().isEmpty()){
            Cuentadante searchCue = objDAO.BuscarCuentadante(txtDocumentoCue.getText());
            if (searchCue!=null){
                txtCueId.setText(""+searchCue.getCueId());
                txtNombresCue.setText(searchCue.getNombres());
                txtApellidosCue.setText(searchCue.getApellidos());
                txtCorreoCue.setText(searchCue.getCorreo());
                txtTelefonoCue.setText(searchCue.getTelefono());
                txtCantidadEquipos.setText(""+searchCue.getCantidadEquipos());
            }
        }else{
            JOptionPane.showMessageDialog(this, "El campo 'Documento' está vacio");
            txtDocumentoCue.requestFocus();
        }
    }
    
    //Validar todos los campos
    private boolean ValCampos(){
        boolean lleno=false;
        if(txtDocumentoCue.getText().isEmpty() || txtNombresCue.getText().isEmpty() || txtApellidosCue.getText().isEmpty()
                || txtCorreoCue.getText().isEmpty() || txtTelefonoCue.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
                lleno=true;
        }
        return lleno;
    }
    
    //Limpiar Formulario
    private void Limpiar(){
        int confirm=JOptionPane.showConfirmDialog(this, "¿Desea limpiar pantalla?",
                "LIMPIAR FORMULARIO",JOptionPane.OK_CANCEL_OPTION);
        if (confirm==0){
            txtCueId.setText("");
            txtDocumentoCue.setText("");
            txtNombresCue.setText("");
            txtApellidosCue.setText("");
            txtCorreoCue.setText("");
            txtTelefonoCue.setText("");
            txtCantidadEquipos.setText("");
            txtDocumentoCue.requestFocus();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCue;
    private javax.swing.JButton btnCrearCue;
    private javax.swing.JButton btnEliminarCue;
    private javax.swing.JButton btnLimpiarCue;
    private javax.swing.JToggleButton btnModificarCue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidosCue;
    private javax.swing.JTextField txtCantidadEquipos;
    private javax.swing.JTextField txtCorreoCue;
    private javax.swing.JTextField txtCueId;
    private javax.swing.JTextField txtDocumentoCue;
    private javax.swing.JTextField txtNombresCue;
    private javax.swing.JTextField txtTelefonoCue;
    // End of variables declaration//GEN-END:variables
}
