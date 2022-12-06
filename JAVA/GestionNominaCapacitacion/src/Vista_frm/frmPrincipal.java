package Vista_frm;

public class frmPrincipal extends javax.swing.JFrame {
    
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jFormularioPrincipal = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuEmpleado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuEstudiante = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuDirectivo = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFormularioPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jFormularioPrincipalLayout = new javax.swing.GroupLayout(jFormularioPrincipal);
        jFormularioPrincipal.setLayout(jFormularioPrincipalLayout);
        jFormularioPrincipalLayout.setHorizontalGroup(
            jFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jFormularioPrincipalLayout.setVerticalGroup(
            jFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        jMenu3.setText("Empleados");

        jMenuEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        jMenuEmpleado.setText("Gestionar Empleados");
        jMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuEmpleado);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Estudiantes");

        jMenuEstudiante.setText("Gestionar Estudiantes");
        jMenuEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstudianteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuEstudiante);

        jMenuBar2.add(jMenu4);

        jMenu6.setText("Directivo");

        jMenuDirectivo.setText("Gestionar Directivos");
        jMenuDirectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDirectivoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuDirectivo);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormularioPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormularioPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmpleadoActionPerformed
        //Para mostrar el menu agregar empleado
        frmEmpleado formEmpleado = new frmEmpleado();
        formEmpleado.setVisible(true);
        jFormularioPrincipal.add(formEmpleado);
    }//GEN-LAST:event_jMenuEmpleadoActionPerformed

    private void jMenuEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstudianteActionPerformed
        // TODO add your handling code here:
        frmEstudiante formEstudiante = new frmEstudiante();
        formEstudiante.setVisible(true);
        jFormularioPrincipal.add(formEstudiante);
    }//GEN-LAST:event_jMenuEstudianteActionPerformed

    private void jMenuDirectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDirectivoActionPerformed
        // TODO add your handling code here:
        frmDirectivo formDirectivo = new frmDirectivo();
        formDirectivo.setVisible(true);
        jFormularioPrincipal.add(formDirectivo);
    }//GEN-LAST:event_jMenuDirectivoActionPerformed

    
    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jFormularioPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuDirectivo;
    private javax.swing.JMenuItem jMenuEmpleado;
    private javax.swing.JMenuItem jMenuEstudiante;
    // End of variables declaration//GEN-END:variables
}
