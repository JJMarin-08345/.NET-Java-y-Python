
package Vista;

//import javax.swing.ImageIcon;

import java.awt.Dimension;


public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("/Trajeado.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormularioPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCuentadante = new javax.swing.JMenu();
        jMenuCuentadante = new javax.swing.JMenuItem();
        MenuEquipo = new javax.swing.JMenu();
        jMenuEquipo = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        jMenuProveedor = new javax.swing.JMenuItem();
        MenuSoftware = new javax.swing.JMenu();
        jMenuSoftwarePC = new javax.swing.JMenuItem();
        MenuPartePc = new javax.swing.JMenu();
        jMenuPartesPC = new javax.swing.JMenuItem();
        MenuUbicacion = new javax.swing.JMenu();
        jMenuUbiPc = new javax.swing.JMenuItem();
        jMenuUbiPartesPC = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        SubMenuEquipo = new javax.swing.JMenuItem();
        SubMenuCuentadantes = new javax.swing.JMenuItem();
        SubMenuProveedores = new javax.swing.JMenuItem();
        SubMenuUbiPc = new javax.swing.JMenuItem();
        SubMenuUbiPartes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFormularioPrincipalLayout = new javax.swing.GroupLayout(jFormularioPrincipal);
        jFormularioPrincipal.setLayout(jFormularioPrincipalLayout);
        jFormularioPrincipalLayout.setHorizontalGroup(
            jFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        jFormularioPrincipalLayout.setVerticalGroup(
            jFormularioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        MenuCuentadante.setText("Cuentadante");

        jMenuCuentadante.setText("Gestionar Cuentadantes");
        jMenuCuentadante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCuentadanteActionPerformed(evt);
            }
        });
        MenuCuentadante.add(jMenuCuentadante);

        jMenuBar1.add(MenuCuentadante);

        MenuEquipo.setText("Equipo");

        jMenuEquipo.setText("Gestionar Equipos Institucion");
        jMenuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEquipoActionPerformed(evt);
            }
        });
        MenuEquipo.add(jMenuEquipo);

        jMenuBar1.add(MenuEquipo);

        MenuProveedor.setText("Proveedor");

        jMenuProveedor.setText("Gestion Proveedor");
        jMenuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProveedorActionPerformed(evt);
            }
        });
        MenuProveedor.add(jMenuProveedor);

        jMenuBar1.add(MenuProveedor);

        MenuSoftware.setText("Software");

        jMenuSoftwarePC.setText("Gestion Software");
        jMenuSoftwarePC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSoftwarePCActionPerformed(evt);
            }
        });
        MenuSoftware.add(jMenuSoftwarePC);

        jMenuBar1.add(MenuSoftware);

        MenuPartePc.setText("Parte");

        jMenuPartesPC.setText("Partes PC");
        jMenuPartesPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPartesPCActionPerformed(evt);
            }
        });
        MenuPartePc.add(jMenuPartesPC);

        jMenuBar1.add(MenuPartePc);

        MenuUbicacion.setText("Ubicacion");

        jMenuUbiPc.setText("Ubicacion Pc");
        jMenuUbiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUbiPcActionPerformed(evt);
            }
        });
        MenuUbicacion.add(jMenuUbiPc);

        jMenuUbiPartesPC.setText("Ubicacion Partes Pc");
        jMenuUbiPartesPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUbiPartesPCActionPerformed(evt);
            }
        });
        MenuUbicacion.add(jMenuUbiPartesPC);

        jMenuBar1.add(MenuUbicacion);

        MenuConsultas.setText("Consultas");

        SubMenuEquipo.setText("Equipos Institucion");
        SubMenuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuEquipoActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubMenuEquipo);

        SubMenuCuentadantes.setText("Cuentadantes");
        SubMenuCuentadantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCuentadantesActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubMenuCuentadantes);

        SubMenuProveedores.setText("Proveedores");
        SubMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuProveedoresActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubMenuProveedores);

        SubMenuUbiPc.setText("Ubicaciones de los equipos");
        SubMenuUbiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuUbiPcActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubMenuUbiPc);

        SubMenuUbiPartes.setText("Ubicaciones de las partes");
        SubMenuUbiPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuUbiPartesActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubMenuUbiPartes);

        jMenuBar1.add(MenuConsultas);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCuentadanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCuentadanteActionPerformed
        // TODO add your handling code here:
        frmCuentadante formCuentadante = new frmCuentadante();
        formCuentadante.setVisible(true);
        formCuentadante.setSize(new Dimension (200,200));
        jFormularioPrincipal.add(formCuentadante);
    }//GEN-LAST:event_jMenuCuentadanteActionPerformed

    private void jMenuUbiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbiPcActionPerformed
        // TODO add your handling code here:
        frmUbicacion_Pc formUbicacionPc = new frmUbicacion_Pc();
        formUbicacionPc.setVisible(true);
        jFormularioPrincipal.add(formUbicacionPc);
    }//GEN-LAST:event_jMenuUbiPcActionPerformed

    private void jMenuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEquipoActionPerformed
        // TODO add your handling code here:
        frmEquipoComputo formEquipoComputo = new frmEquipoComputo();
        formEquipoComputo.setVisible(true);
        jFormularioPrincipal.add(formEquipoComputo);
    }//GEN-LAST:event_jMenuEquipoActionPerformed

    private void jMenuPartesPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPartesPCActionPerformed
        // TODO add your handling code here:
        frmPartesPC formPartesPC = new frmPartesPC();
        formPartesPC.setVisible(true);
        jFormularioPrincipal.add(formPartesPC);
    }//GEN-LAST:event_jMenuPartesPCActionPerformed

    private void jMenuUbiPartesPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUbiPartesPCActionPerformed
        // TODO add your handling code here:
        frmUbiPartesPC formUbiPartesPC = new frmUbiPartesPC();
        formUbiPartesPC.setVisible(true);
        jFormularioPrincipal.add(formUbiPartesPC);
    }//GEN-LAST:event_jMenuUbiPartesPCActionPerformed

    private void jMenuSoftwarePCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSoftwarePCActionPerformed
        // TODO add your handling code here:
        frmSoftware formSoftware = new frmSoftware();
        formSoftware.setVisible(true);
        jFormularioPrincipal.add(formSoftware);
    }//GEN-LAST:event_jMenuSoftwarePCActionPerformed

    private void jMenuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProveedorActionPerformed
        // TODO add your handling code here:
        frmProveedor formProveedor = new frmProveedor();
        formProveedor.setVisible(true);
        jFormularioPrincipal.add(formProveedor);
    }//GEN-LAST:event_jMenuProveedorActionPerformed

    private void SubMenuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuEquipoActionPerformed
        // TODO add your handling code here:
        frmConEquipos formConEquipo = new frmConEquipos();
        formConEquipo.setVisible(true);
        jFormularioPrincipal.add(formConEquipo);
    }//GEN-LAST:event_SubMenuEquipoActionPerformed

    private void SubMenuCuentadantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCuentadantesActionPerformed
        // TODO add your handling code here:
        frmConCuentadantes formConCue = new frmConCuentadantes();
        formConCue.setVisible(true);
        jFormularioPrincipal.add(formConCue);
    }//GEN-LAST:event_SubMenuCuentadantesActionPerformed

    private void SubMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuProveedoresActionPerformed
        // TODO add your handling code here:
        frmConProveedores formConProvee = new frmConProveedores();
        formConProvee.setVisible(true);
        jFormularioPrincipal.add(formConProvee);
    }//GEN-LAST:event_SubMenuProveedoresActionPerformed

    private void SubMenuUbiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuUbiPcActionPerformed
        // TODO add your handling code here:
        frmConUbicacionesPc formConUbiPc = new frmConUbicacionesPc();
        formConUbiPc.setVisible(true);
        jFormularioPrincipal.add(formConUbiPc);
    }//GEN-LAST:event_SubMenuUbiPcActionPerformed

    private void SubMenuUbiPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuUbiPartesActionPerformed
        // TODO add your handling code here:
        frmConUbiPartes formConUbiPar = new frmConUbiPartes();
        formConUbiPar.setVisible(true);
        jFormularioPrincipal.add(formConUbiPar);
    }//GEN-LAST:event_SubMenuUbiPartesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuCuentadante;
    private javax.swing.JMenu MenuEquipo;
    private javax.swing.JMenu MenuPartePc;
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JMenu MenuSoftware;
    private javax.swing.JMenu MenuUbicacion;
    private javax.swing.JMenuItem SubMenuCuentadantes;
    private javax.swing.JMenuItem SubMenuEquipo;
    private javax.swing.JMenuItem SubMenuProveedores;
    private javax.swing.JMenuItem SubMenuUbiPartes;
    private javax.swing.JMenuItem SubMenuUbiPc;
    private javax.swing.JDesktopPane jFormularioPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCuentadante;
    private javax.swing.JMenuItem jMenuEquipo;
    private javax.swing.JMenuItem jMenuPartesPC;
    private javax.swing.JMenuItem jMenuProveedor;
    private javax.swing.JMenuItem jMenuSoftwarePC;
    private javax.swing.JMenuItem jMenuUbiPartesPC;
    private javax.swing.JMenuItem jMenuUbiPc;
    // End of variables declaration//GEN-END:variables
}
