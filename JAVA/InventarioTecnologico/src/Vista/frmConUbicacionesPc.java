
package Vista;

import Controlador.DAO;
import Model.EquipoComputo;
import PlaceHolder.TextPrompt;
import java.util.ArrayList;
//import javax.swing.JOptionPane;
/**
 *
 * @author Juan Jose Marin
 */
public class frmConUbicacionesPc extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    ArrayList<EquipoComputo> lstEquipos;
    int PosEquipo=0;
    
    public frmConUbicacionesPc() {
        initComponents();
        objDAO.Holder=new TextPrompt("--Ningún equipo seleccionado--",txtUbicacion);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxEquipos = new javax.swing.JComboBox<>();
        txtUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultas Ubicaciones Pc");
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

        jLabel1.setText("Equipo:");

        cbxEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Equipos--" }));
        cbxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquiposActionPerformed(evt);
            }
        });

        txtUbicacion.setEditable(false);

        jLabel2.setText("Ubicacion del Equipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUbicacion)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquiposActionPerformed
        // TODO add your handling code here:
        PosEquipo=cbxEquipos.getSelectedIndex()-1;
        //JOptionPane.showMessageDialog(this,PosEquipo);
        if(PosEquipo>=0){
            int ubiPc=lstEquipos.get(PosEquipo).getEquipoId();
            txtUbicacion.setText(objDAO.UbicacionEquipoEspecifico(ubiPc));
        }else{
            txtUbicacion.setText("");
        }
    }//GEN-LAST:event_cbxEquiposActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void llenarCbx(){
        lstEquipos=objDAO.ListarEquipoComputo();
       
        for(EquipoComputo ec:lstEquipos){
            cbxEquipos.addItem(ec.getSerial()+" "+ec.getMarca()+" "+ec.getModelo());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEquipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
