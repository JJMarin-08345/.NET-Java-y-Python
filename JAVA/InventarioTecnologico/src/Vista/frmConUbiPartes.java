
package Vista;

import Controlador.DAO;
import Model.PartesPC;
import PlaceHolder.TextPrompt;
import java.util.ArrayList;

public class frmConUbiPartes extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    ArrayList<PartesPC> lstPartes = new ArrayList<>();
    int PosParte;
    
    public frmConUbiPartes() {
        initComponents();
        objDAO.Holder=new TextPrompt("--Nada Seleccionado--",txtEquipo);
        objDAO.Holder=new TextPrompt("--Nada Seleccionado--",txtUbiParte);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxParte = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUbiParte = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Ubicaciones de las partes");
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

        jLabel1.setText("Partes de Equipo:");

        cbxParte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Parte--" }));
        cbxParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxParteActionPerformed(evt);
            }
        });

        jLabel2.setText("Ubicacion de la parte:");

        jLabel3.setText("Equipo en el que está instalado:");

        txtUbiParte.setEditable(false);

        txtEquipo.setEditable(false);

        jLabel4.setText("Serial");

        jLabel5.setText("Marca");

        jLabel6.setText("Nombre");

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEquipo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUbiParte))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxParte, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnLimpiar)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUbiParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxParteActionPerformed
        // TODO add your handling code here:
        PosParte=cbxParte.getSelectedIndex()-1;
        //Se hace esto para que cuando se seleccione --Parte--, los txtField, se vacien 
        if(cbxParte.getSelectedIndex()>0){
            ArrayList<String> ParteEnEquipo=objDAO.UbicacionParteEspecifica(lstPartes.get(PosParte).getEquipoId());
            txtUbiParte.setText(ParteEnEquipo.get(0));
            txtEquipo.setText(ParteEnEquipo.get(1));
        }else{
            txtUbiParte.setText("");
            txtEquipo.setText("");
        }
        
    }//GEN-LAST:event_cbxParteActionPerformed

    private void llenarCbx(){
        lstPartes = objDAO.ListarPartesPc();
        for(PartesPC parte:lstPartes){
            cbxParte.addItem(parte.getSerial()+" || "+parte.getPartes_Marca()+" || "+parte.getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxParte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtUbiParte;
    // End of variables declaration//GEN-END:variables
}
