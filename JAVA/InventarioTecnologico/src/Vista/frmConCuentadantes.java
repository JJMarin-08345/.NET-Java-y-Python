
package Vista;

import Controlador.DAO;
import Model.Cuentadante;
import Model.EquipoXCuentadante;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class frmConCuentadantes extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    ArrayList<Cuentadante> lstCue;
    ArrayList<Cuentadante> lstCueAct;
    ArrayList<EquipoXCuentadante> lstEquipoCue;
    int PosCue=0;
    
    public frmConCuentadantes() {
        initComponents();
        limpiarjList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxCuentadantes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtC_EquiposCuentadante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCueActivos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstEquiposCue = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Cuentadantes");
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

        cbxCuentadantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        cbxCuentadantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCuentadantesActionPerformed(evt);
            }
        });

        jLabel1.setText("Cuentadantes:");

        jLabel2.setText("Cantidad de equipos por cuentadante:");

        txtC_EquiposCuentadante.setEditable(false);

        jScrollPane1.setViewportView(jListCueActivos);

        jLabel3.setText("Cuentadantes Activos:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Consultas Cuentadantes");

        jLabel5.setText("Equipos por Cuentadante:");

        jScrollPane2.setViewportView(jLstEquiposCue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtC_EquiposCuentadante))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxCuentadantes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel4)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCuentadantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtC_EquiposCuentadante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCuentadantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCuentadantesActionPerformed
       
        PosCue=cbxCuentadantes.getSelectedIndex()-1;
        if(cbxCuentadantes.getSelectedIndex()>0){
            txtC_EquiposCuentadante.setText(""+lstCue.get(PosCue).getCantidadEquipos());
        }else{
            txtC_EquiposCuentadante.setText(""+0);
        }
    }//GEN-LAST:event_cbxCuentadantesActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarCbx();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void llenarCbx(){
        lstCue = objDAO.ListarCuentadante();
        lstCueAct = objDAO.ListadoCuentadantesActivos();
        lstEquipoCue = objDAO.ListadoEquipoPorCuentadante();
        
        DefaultListModel llenarList = (DefaultListModel)jListCueActivos.getModel();
        for(Cuentadante cu:lstCueAct){
            llenarList.addElement("<html> <body> <b>CC:</b> "+cu.getDocumento()+" || <b>Nombres</b> "+cu.getNombres()+
                    " || <b>Apellidos:</b> "+cu.getApellidos()+"<br> <b>Equipos a cargo: </b>"+cu.getCantidadEquipos()+
                    "<br><br></body></html>");
        }
        for(Cuentadante cue:lstCue){
            cbxCuentadantes.addItem("CC: "+cue.getDocumento()+" || "+
                    cue.getNombres()+" "+cue.getApellidos());
        }
        
        DefaultListModel llenarLst = (DefaultListModel) jLstEquiposCue.getModel();
        for(EquipoXCuentadante eq:lstEquipoCue){
            llenarLst.addElement("<html><body> <b>CC:</b>"
                    
                    +eq.getDocumento()+" <b>Nombres:</b> "+eq.getNombres()+
                    " <b>Apellidos:</b> "+eq.getApellidos()+
                    " <br><b>Equipo a cargo: <i>Serial:</i></b> "+eq.getSerial()+
                    " <b><i>Marca:</i></b> "+eq.getMarca()+" <b><i>Modelo:</i></b> "+eq.getModelo()
                    
                    +"<br><br></body></html>");
        }
    }
    
    private void limpiarjList(){
        DefaultListModel clear = new DefaultListModel();
        jListCueActivos.setModel(clear);
        
        DefaultListModel clear2 = new DefaultListModel();
        jLstEquiposCue.setModel(clear2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCuentadantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListCueActivos;
    private javax.swing.JList<String> jLstEquiposCue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtC_EquiposCuentadante;
    // End of variables declaration//GEN-END:variables
}
