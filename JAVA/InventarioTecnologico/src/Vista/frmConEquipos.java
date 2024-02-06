
package Vista;

import Controlador.DAO;
import Model.EquipoComputo;
import Model.EquipoGarantia;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class frmConEquipos extends javax.swing.JInternalFrame {

    DAO objDAO = new DAO();
    ArrayList<EquipoComputo> lstEquipos;
    ArrayList<EquipoComputo> lstTipoEquipos;
    ArrayList<EquipoGarantia> lstEquiposGarantia;
    DefaultListModel jListTipo = new DefaultListModel();
    DefaultTableModel EquipoG = new DefaultTableModel(){
      @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }  
    };
    
    
    public frmConEquipos() {
        initComponents();
        limpiar();
        limpiarLstTipoEquipo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidadEquipos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEquipos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblEqGr = new javax.swing.JTable();
        btnEquipoOficina = new javax.swing.JButton();
        btnEquipoFormacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListTipoEquipo = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultas para Equipos de la institucion");
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

        txtCantidadEquipos.setEditable(false);
        txtCantidadEquipos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jListEquipos.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jListEquipos.setDragEnabled(true);
        jScrollPane2.setViewportView(jListEquipos);

        jLabel3.setText("EQUIPOS EN LA INSTITUCION:");

        jLabel4.setText("CANTIDAD DE EQUIPOS:");

        jLabel1.setText("EQUIPOS EN GARANTIA:");

        jTblEqGr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblEqGr);

        btnEquipoOficina.setText("EQUIPOS DE OFICINA");
        btnEquipoOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoOficinaActionPerformed(evt);
            }
        });

        btnEquipoFormacion.setText("EQUIPOS DE FORMACION");
        btnEquipoFormacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoFormacionActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListTipoEquipo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEquipoOficina)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEquipoFormacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEquipoOficina)
                    .addComponent(btnEquipoFormacion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        ConsultasEquipos();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEquipoOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoOficinaActionPerformed
        // TODO add your handling code here:
        EquipoOficina();
    }//GEN-LAST:event_btnEquipoOficinaActionPerformed

    private void btnEquipoFormacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoFormacionActionPerformed
        // TODO add your handling code here:
        EquipoEstudiantil();
    }//GEN-LAST:event_btnEquipoFormacionActionPerformed

    private void ConsultasEquipos(){
        txtCantidadEquipos.setText(""+objDAO.CantidadTotalEquiposComputo());
        
        lstEquipos=objDAO.ListarEquipoComputo();
        DefaultListModel modelo = (DefaultListModel) jListEquipos.getModel();
        for(EquipoComputo equipo:lstEquipos){
            //Se que esto no se ve bien en el código, pero quedaba mucho mejor
            //Además también soy consciente que se puede usar un txt y hacerle un .append
            //pero quise usar tablas y JList para probar un poco
            modelo.addElement("<html><body> <b>Serial:</b> "+equipo.getSerial()+
                    " <br><b>Marca:</b> "+equipo.getMarca()+
                    " <br><b>Modelo:</b> "+equipo.getModelo()+
                    " <br><b>Clasificacion:</b> "+equipo.getTipo()+"<br><br></body></html>");
        }
        Object[] datos = new Object[EquipoG.getColumnCount()];
        lstEquiposGarantia=objDAO.EquiposEnGarantia();
        for(EquipoGarantia eg:lstEquiposGarantia){
            datos[0]=eg.getSerial();
            datos[1]=eg.getMarca();
            datos[2]=eg.getModelo();
            datos[3]=eg.getFechaCompra();
            datos[4]=eg.getFechaVencimiento();
            EquipoG.addRow(datos);
            jTblEqGr.setModel(EquipoG);
        }
    }
    
    private void EquipoOficina(){
        limpiarLstTipoEquipo();
        jListTipo= (DefaultListModel)jListTipoEquipo.getModel();
        lstEquipos=objDAO.ListadoEquiposOficina();
        for(EquipoComputo eq:lstEquipos){
            jListTipo.addElement("<html><body><b>Serial:</b> "+eq.getSerial()
                    +" <br> <b>Marca:</b> "+eq.getMarca()+" <br> <b>Modelo:</b> "+eq.getModelo()
                    +" <br> <b>Tipo:</b> "+eq.getTipo()+"<br><br> </body></html>");
        }
    }
    
    
    private void EquipoEstudiantil(){
        limpiarLstTipoEquipo();
        jListTipo = (DefaultListModel)jListTipoEquipo.getModel();
        lstEquipos=objDAO.ListadoEquiposEstudiantil();
        for(EquipoComputo eq:lstEquipos){
            jListTipo.addElement("<html><body><b>Serial:</b> "+eq.getSerial()
                    +" <br> <b>Marca:</b> "+eq.getMarca()+" <br> <b>Modelo:</b> "+eq.getModelo()
                    +" <br> <b>Tipo:</b> "+eq.getTipo()+"<br><br> </body></html>");
        }
    }
    
    private void limpiar(){
        DefaultListModel Equipos = new DefaultListModel();
        jListEquipos.setModel(Equipos);
        
        String[] cabezaTable={"Serial","Marca","Modelo","F.Compra","F.Vence"};
        EquipoG.setColumnIdentifiers(cabezaTable);
        jTblEqGr.setModel(EquipoG);   
    }
    
    private void limpiarLstTipoEquipo(){
        DefaultListModel TipoEquipo = new DefaultListModel();
        jListTipoEquipo.setModel(TipoEquipo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEquipoFormacion;
    private javax.swing.JButton btnEquipoOficina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListEquipos;
    private javax.swing.JList<String> jListTipoEquipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTblEqGr;
    private javax.swing.JTextField txtCantidadEquipos;
    // End of variables declaration//GEN-END:variables
}
