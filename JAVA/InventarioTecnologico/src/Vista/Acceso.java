
package Vista;
import Controlador.Conexion;
import Controlador.DAO;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {

    DAO objDAO = new DAO();
    
    public Acceso() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pswClave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Clave:");

        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(pswClave, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCrear))
                            .addComponent(btnAcceder))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrear)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        crearUser();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        if(acceder()){
            frmPrincipal formPrincipal = new frmPrincipal();
            formPrincipal.setVisible(true);
            formPrincipal.setExtendedState(formPrincipal.MAXIMIZED_BOTH);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAccederActionPerformed
 
 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here: 
        if(objDAO.cantidadUsuario()>0){
            btnCrear.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void crearUser(){
        if(valCampo()==false){
            if(objDAO.crearUsuario(txtUsuario.getText(), pswClave.getText())){
                btnCrear.setVisible(false);
            }
        }
    }
    
    private boolean acceder(){
        if(objDAO.cantidadUsuario()>0){
            return objDAO.AccesoUsuario(txtUsuario.getText(), pswClave.getText());
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningun usuario creado");
            return false;
        }
    }
    
    private boolean valCampo(){
        if(txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "'Usuario' no puede ser vacio");
            txtUsuario.requestFocus();
            return true;
        }if(pswClave.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "'Clave' no puede ser vacio");
            pswClave.requestFocus();
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Conexion con =new Conexion();
                if(con.getConnection()!=null){
                    new Acceso().setVisible(true);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pswClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
