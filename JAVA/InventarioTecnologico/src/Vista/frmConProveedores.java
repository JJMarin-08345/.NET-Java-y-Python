
package Vista;

import javax.swing.DefaultListModel;
import java.util.ArrayList;
import Controlador.DAO;
import Model.EquipoCompradoProveedor;
import Model.Proveedor;

public class frmConProveedores extends javax.swing.JInternalFrame {
    
    DAO objDAO = new DAO();
    ArrayList<Proveedor> lstProveedores;
    ArrayList<EquipoCompradoProveedor> lstEquiposCompraos;
    
    
    public frmConProveedores() {
        initComponents();
        limpiarjList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProveedores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEquipoComprado = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Consulta Proveedores");
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

        jLabel1.setText("LISTA DE PROVEEDORES:");

        jScrollPane1.setViewportView(jListProveedores);

        jLabel2.setText("EQUIPOS COMPRADOS A CADA PROVEEDOR:");

        jScrollPane2.setViewportView(jListEquipoComprado);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Consultas Proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        ConsultasPro();
    }//GEN-LAST:event_formInternalFrameOpened

    //Metodos consulta proveedores
    private void ConsultasPro(){
        lstProveedores = objDAO.ListarProveedores();
        DefaultListModel llenar = (DefaultListModel) jListProveedores.getModel();
        for(Proveedor pro:lstProveedores){
            llenar.addElement("<html><body> <b>NIT: </b>"+pro.getNIT()+" <br><b> Razon Social:</b> "+
                    pro.getRazonSocial()+" <br><b>Correo:</b> "+pro.getCorreo()+"<br><br></body></html>");
        }
        
        lstEquiposCompraos = objDAO.ListadoEquipoCompradoProveedor();
        DefaultListModel llenar2 = (DefaultListModel) jListEquipoComprado.getModel();
        for(EquipoCompradoProveedor ECP:lstEquiposCompraos){
            llenar2.addElement("<html><body> <b>Razon Social:</b> "+ECP.getRazonSocial()+
                    " <b>Correo:</b> "+ECP.getCorreo()+
                    "<br> <b>Equipo Comprado: <i> Serial:</i></b> "+ECP.getSerial()+" <b><i>Marca:</i></b> "+ECP.getMarca()+
                    " <b><i>Modelo:</i></b> "+ECP.getModelo()+"<br><br></body></html>");
        }
     }
    
    //Limpiar jList
    private void limpiarjList(){
        DefaultListModel limpiar = new DefaultListModel();
        jListProveedores.setModel(limpiar);
        
        DefaultListModel limpiar2 = new DefaultListModel();
        jListEquipoComprado.setModel(limpiar2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListEquipoComprado;
    private javax.swing.JList<String> jListProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
