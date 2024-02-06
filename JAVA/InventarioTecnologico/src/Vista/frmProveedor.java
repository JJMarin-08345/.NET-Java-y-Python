package Vista;

import Controlador.DAO;
import Model.Proveedor;
import javax.swing.JOptionPane;

/**
  @author Anonimo
 **/
public class frmProveedor extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    
    public frmProveedor() {
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
        txtProveedorID = new javax.swing.JTextField();
        txtProNIT = new javax.swing.JTextField();
        txtProRazonSocial = new javax.swing.JTextField();
        txtProDireccion = new javax.swing.JTextField();
        txtProCorreo = new javax.swing.JTextField();
        txtProTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarPro = new javax.swing.JButton();
        btnCrearPro = new javax.swing.JButton();
        btnModificarPro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Proveedores");
        setToolTipText("");

        jLabel1.setText("Proveedor ID:");

        jLabel2.setText("NIT:");

        jLabel3.setText("Razon Social:");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Telefono:");

        txtProveedorID.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("PROVEEDOR");

        btnBuscarPro.setText("Buscar");
        btnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProActionPerformed(evt);
            }
        });

        btnCrearPro.setText("Crear");
        btnCrearPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProActionPerformed(evt);
            }
        });

        btnModificarPro.setText("Modificar");
        btnModificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProActionPerformed(evt);
            }
        });

        btnEliminarPro.setText("Eliminar");
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });

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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtProTelefono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProRazonSocial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProDireccion)
                                    .addComponent(txtProCorreo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtProveedorID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnBuscarPro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnLimpiar)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProveedorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPro)
                    .addComponent(btnModificarPro)
                    .addComponent(btnEliminarPro))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProActionPerformed
        // TODO add your handling code here:
        CrearPro();
    }//GEN-LAST:event_btnCrearProActionPerformed

    private void btnModificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProActionPerformed
        // TODO add your handling code here:
        ModificarPro();
    }//GEN-LAST:event_btnModificarProActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed
        // TODO add your handling code here:
        BuscarPro();
    }//GEN-LAST:event_btnBuscarProActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed
        // TODO add your handling code here:
        EliminarPro();
    }//GEN-LAST:event_btnEliminarProActionPerformed

    //Metodos CRUD 
    private void CrearPro(){
        if (!valCampos()){
            Proveedor pro = new Proveedor();
            pro.setNIT(txtProNIT.getText());
            pro.setRazonSocial(txtProRazonSocial.getText());
            pro.setDireccion(txtProDireccion.getText());
            pro.setCorreo(txtProCorreo.getText());
            pro.setTelefono(txtProTelefono.getText());
            objDAO.CrearProveedor(pro);
            Limpiar();
        }
    }
    private void ModificarPro(){
        if(!valCampos()){
            Proveedor pro = new Proveedor();
            pro.setNIT(txtProNIT.getText());
            pro.setRazonSocial(txtProRazonSocial.getText());
            pro.setDireccion(txtProDireccion.getText());
            pro.setCorreo(txtProCorreo.getText());
            pro.setTelefono(txtProTelefono.getText());
            objDAO.ModificarProveedor(pro);
            Limpiar();
        }
    }
    private void BuscarPro(){
        if (!txtProNIT.getText().isEmpty()){
            Proveedor proFind = objDAO.BuscarProveedor(txtProNIT.getText());
            if (proFind!=null){
                txtProveedorID.setText(""+proFind.getProveedorId());
                txtProNIT.setText(""+proFind.getNIT());
                txtProRazonSocial.setText(""+proFind.getRazonSocial());
                txtProDireccion.setText(""+proFind.getDireccion());
                txtProCorreo.setText(""+proFind.getCorreo());
                txtProTelefono.setText(""+proFind.getTelefono());
            }
        }
    }
    private void EliminarPro(){
        if(!txtProNIT.getText().isEmpty()){
            int conf=JOptionPane.showConfirmDialog(this, "¿Esta segurp que desea eliminar?",
                    "Eliminar",JOptionPane.OK_CANCEL_OPTION);
            if(conf==0){
                if(objDAO.EliminarProveedor(txtProNIT.getText())){
                    Limpiar();
                }else{
                    txtProNIT.requestFocus();
                }    
            }
        }else{
            JOptionPane.showMessageDialog(this, "El campo 'NIT' esta vacio");
            txtProNIT.requestFocus();
        }
    }
    //Metodos para buena calidad
    private boolean valCampos(){
        if(txtProNIT.getText().isEmpty() || txtProRazonSocial.getText().isEmpty()
                || txtProDireccion.getText().isEmpty() || txtProCorreo.getText().isEmpty()
                || txtProCorreo.getText().isEmpty() || txtProTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos");
            return true;
        }
        return false;
    }
    
    private void Limpiar(){
        int confirm=JOptionPane.showConfirmDialog(this, "¿Desea limpiar la pantalla?",
                "Limpiar Pantalla",JOptionPane.OK_CANCEL_OPTION);
        if(confirm==0){
            txtProveedorID.setText("");
            txtProNIT.setText("");
            txtProRazonSocial.setText("");
            txtProDireccion.setText("");
            txtProCorreo.setText("");
            txtProTelefono.setText("");
            txtProNIT.requestFocus();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JButton btnCrearPro;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtProCorreo;
    private javax.swing.JTextField txtProDireccion;
    private javax.swing.JTextField txtProNIT;
    private javax.swing.JTextField txtProRazonSocial;
    private javax.swing.JTextField txtProTelefono;
    private javax.swing.JTextField txtProveedorID;
    // End of variables declaration//GEN-END:variables
}
