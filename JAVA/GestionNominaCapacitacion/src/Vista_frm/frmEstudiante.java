
package Vista_frm;

import Clases_Gestion.Estudiante;
import Controlador.ValidacionesCampos;
import static Vista_frm.frmEmpleado.objEmpresa;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class frmEstudiante extends javax.swing.JInternalFrame {
    
    private ValidacionesCampos ValidadorCampos = new ValidacionesCampos();
    private JButton[] botones = new JButton[3];
    private JTextField[] campos = new JTextField[7];
    private JComboBox[] comboBox = new JComboBox[1];
    
    private ArrayList<Estudiante> lstEstudiantes = new ArrayList<>();
    private Estudiante estudiante= new Estudiante();
    private int posicion=0;
    
    public frmEstudiante() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        lblDefinitiva = new javax.swing.JLabel();
        lblAprobado = new javax.swing.JLabel();
        btnCrearStudent = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnMostrarEstudiantes = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Estudiante");
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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setText("Datos Estudiante");

        jLabel2.setText("Documento:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Genero:");

        jLabel6.setText("Nota 1:");

        jLabel7.setText("Nota 2:");

        jLabel8.setText("Nota 3:");

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota1KeyTyped(evt);
            }
        });

        txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota2KeyTyped(evt);
            }
        });

        txtNota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota3KeyTyped(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar ---", "Hombre", "Mujer" }));
        cbxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGeneroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel9.setText("DEFINITIVA:");

        jLabel10.setText("Curso:");

        jLabel11.setText("APROBADO:");

        txtCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCursoKeyTyped(evt);
            }
        });

        lblDefinitiva.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N

        lblAprobado.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N

        btnCrearStudent.setText("Crear");
        btnCrearStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearStudentActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar por documento");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnMostrarEstudiantes.setText("Ver Estudiantes");
        btnMostrarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEstudiantesActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(lblDefinitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(lblAprobado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnCrearStudent)
                        .addGap(52, 52, 52)
                        .addComponent(btnModificar)
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrarEstudiantes)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnSiguiente)))
                        .addGap(81, 81, 81)
                        .addComponent(btnLimpiar)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9))
                    .addComponent(lblDefinitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lblAprobado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearStudent)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnMostrarEstudiantes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnLimpiar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearStudentActionPerformed
        // TODO add your handling code here:
        DeshabilitarBotones();
        if(VCampos()==false){
            CrearEstudiante();
        }
    }//GEN-LAST:event_btnCrearStudentActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DeshabilitarBotones();
        if(VCampos()==false){
            EliminarEstudiante();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        DeshabilitarBotones();
        if(VCampos()==false){
            ModificarEstudiante();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        DeshabilitarBotones();
        int confirmar=JOptionPane.showConfirmDialog(this,"¿Desea limpiar el formulario?",
                "Limpiar Formulario",JOptionPane.OK_CANCEL_OPTION);
        if(confirmar==0){
            Limpiar();
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BuscarEstudiante();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumeros(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCursoKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtCursoKeyTyped

    private void txtNota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumerosDecimales(evt);
        ValidadorCampos.PermitirUnRangoDeNumeros(0.0, 5.0, txtNota1,3,evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtNota1KeyTyped

    private void txtNota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota2KeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumerosDecimales(evt);
        ValidadorCampos.PermitirUnRangoDeNumeros(0.0, 5.0, txtNota2,3,evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtNota2KeyTyped

    private void txtNota3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota3KeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumerosDecimales(evt);
        ValidadorCampos.PermitirUnRangoDeNumeros(0.0, 5.0, txtNota3,3,evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtNota3KeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        InicializarVectores();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGeneroActionPerformed
        // TODO add your handling code here:
        HabilitarBotones();
    }//GEN-LAST:event_cbxGeneroActionPerformed

    private void txtDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyReleased
        // TODO add your handling code here:
        ValidadorCampos.HabilitarUnBoton(txtDocumento, 7,btnBuscar);
    }//GEN-LAST:event_txtDocumentoKeyReleased

    private void btnMostrarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEstudiantesActionPerformed
        // TODO add your handling code here:
        FuncionalidadBtnMostrarEstudiantes();
    }//GEN-LAST:event_btnMostrarEstudiantesActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        FuncionalidadBtnSgtYAnt("btnSiguiente");
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        FuncionalidadBtnSgtYAnt("btnAnterior");
    }//GEN-LAST:event_btnAnteriorActionPerformed
    
    //CRUD PARA ESTUDIANTE
    private void CrearEstudiante(){
        //ExcepcionNotas();
        Estudiante student = new Estudiante(txtCurso.getText(),Float.parseFloat(txtNota1.getText()),
                Float.parseFloat(txtNota2.getText()),Float.parseFloat(txtNota3.getText()),txtDocumento.getText(),
        txtNombres.getText(),txtApellidos.getText(),""+cbxGenero.getSelectedItem());
        if(RangoNotas(student)==true){
            student.CalcularDefinitiva();
            student.DefinirAprobado();

            lblDefinitiva.setText(""+String.format("%.1f", student.getDefinitiva()));
            EnviarAprobado(student);
            objEmpresa.guardarEstudiante(student);   
        }
    }
    
    private void BuscarEstudiante(){
        if (!txtDocumento.getText().isEmpty()){
            Estudiante estd=objEmpresa.BuscarEstudianteDocumento(txtDocumento.getText());
            if (estd!=null){
                txtDocumento.setText(estd.getDocumento());
                txtNombres.setText(estd.getNombres());
                txtApellidos.setText(estd.getApellidos());
                cbxGenero.setSelectedItem(estd.getGenero());
                txtCurso.setText(estd.getCurso());
                txtNota1.setText(""+estd.getNota1());
                txtNota2.setText(""+estd.getNota2());
                txtNota3.setText(""+estd.getNota3());
                lblDefinitiva.setText(String.format("%.1f",estd.getDefinitiva()));
                EnviarAprobado(estd);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El campo 'Documento' esta vacio");
        }
    }
    
    private void EliminarEstudiante(){
        //falta preguntar confirmacion
        objEmpresa.EliminarEstudiante(txtDocumento.getText());
        Limpiar();
    }
    
    private void ModificarEstudiante(){
        int confirmar=JOptionPane.showConfirmDialog(this,"¿Esta seguro que desea modificar el estudiante?",
                "Modificar Estudiante",JOptionPane.OK_CANCEL_OPTION);
        if (confirmar==0){
            //ExcepcionNotas();
            Estudiante estd = new Estudiante();
            estd.setDocumento(txtDocumento.getText());
            estd.setNombres(txtNombres.getText());
            estd.setApellidos(txtApellidos.getText());
            estd.setGenero(""+cbxGenero.getSelectedItem());
            estd.setCurso(txtCurso.getText());
            
            if(RangoNotas(estd)==true){
                estd.CalcularDefinitiva();
                lblDefinitiva.setText(String.format("%.1f",estd.getDefinitiva()));
                estd.DefinirAprobado();
                EnviarAprobado(estd);
                objEmpresa.ModificarEstudiante(estd);
            }
        }
    }
    
    private void EnviarAprobado(Estudiante estd){
        if (estd.isAprobado()==true){
            lblAprobado.setText("Aprobado");
        }else{
            lblAprobado.setText("No Aprobado");
        }
    }
    
    private void MostrarEstudiantes(int pos){
        this.estudiante = this.lstEstudiantes.get(pos);
        
        txtDocumento.setText(""+this.estudiante.getDocumento());
        txtNombres.setText(this.estudiante.getNombres());
        txtApellidos.setText(this.estudiante.getApellidos());
        txtCurso.setText(this.estudiante.getCurso());
        txtNota1.setText(""+this.estudiante.getNota1());
        txtNota2.setText(""+this.estudiante.getNota2());
        txtNota3.setText(""+this.estudiante.getNota3());
        lblDefinitiva.setText(String.format("%.1f",this.estudiante.getDefinitiva()));
        EnviarAprobado(this.estudiante); 
    }
    
    private void FuncionalidadBtnMostrarEstudiantes(){
        this.lstEstudiantes=objEmpresa.ListarEstudiantes();
        
        if(this.lstEstudiantes.size()>0){
            MostrarEstudiantes(0);
        }
    }
    
    private void FuncionalidadBtnSgtYAnt(String caso){
        switch(caso){
            case "btnAnterior":
                if(this.posicion > 0 ){
                    this.posicion--;
                    MostrarEstudiantes(this.posicion);
                }else if(this.posicion==0){
                    JOptionPane.showMessageDialog(null, "No hay un Estudiante anterior");
                }
                break;
            case "btnSiguiente":
                if(this.posicion < this.lstEstudiantes.size()-1){
                    this.posicion++;
                    MostrarEstudiantes(this.posicion);
                }else if(this.posicion==this.lstEstudiantes.size()-1){
                    JOptionPane.showMessageDialog(null, "No hay un Estudiante siguiente");
                }
                break;
        }
    }
            
    //FIN CRUD PARA ESTUDIANTES
    private void Limpiar(){
        txtDocumento.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        cbxGenero.setSelectedIndex(0);
        txtCurso.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        lblDefinitiva.setText("");
        lblAprobado.setText("");
    }
    //FUNCION PARA VERIFICAR QUE LOS CAMPOS NO ESTEN VACIOS
    private boolean VCampos(){
        //falta validar campos
        boolean VCampos=false;
        if(txtDocumento.getText().isEmpty() || txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || cbxGenero.getSelectedIndex()==0 || txtCurso.getText().isEmpty() || txtNota1.getText().isEmpty()
                ||txtNota2.getText().isEmpty() ||txtNota3.getText().isEmpty()){
            VCampos=true;
            JOptionPane.showMessageDialog(this,"Por favor rellene todos los campos");
        } 
        return VCampos;
    }
    //FUNCION PARA EVITAR QUE LOS NUMEROS SEAN MAYORES A 5
    /*Queria quitar esta funcion, pero no pude debido a que con el KeyTyped no capta el numero desde el primer
    momento, hay que darle otra vez, mas sin embargo logre que si se ingresa el 5.1 en adelante, el JTextField
    se limpie, pero hay que digitar otro numero, cosa que esta mal lo se, pero sigo investigando para hallar
    una pronta solucion*/
    private boolean RangoNotas(Estudiante stdn){
        
        if(Float.parseFloat(txtNota1.getText())>5 ||
                Float.parseFloat(txtNota2.getText())>5 || Float.parseFloat(txtNota3.getText())>5){
            
            JOptionPane.showMessageDialog(this,"Ninguna de las notas pueden ser menores a *1.0* y mayores que *5.0*");
        }
        else{
            stdn.setNota1(Float.parseFloat(txtNota1.getText()));
            
            stdn.setNota2(Float.parseFloat(txtNota2.getText()));
            
            stdn.setNota3(Float.parseFloat(txtNota3.getText()));
            return true;
        }
        return false;
    }
    //Para castear los txt, pero ya no es necesario
    /*private void ExcepcionNotas(){
        try{
            Float.parseFloat(txtNota1.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Revise que el campo 'Nota 1' no contenga caracteres");
            txtNota1.requestFocus(true);
        }
        try{
            Float.parseFloat(txtNota2.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Revise que el campo 'Nota 2' no contenga caracteres");
            txtNota2.requestFocus(true);
        }        
        try{
            Float.parseFloat(txtNota3.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Revise que el campo 'Nota 3' no contenga caracteres");
            txtNota3.requestFocus(true);
        }
    }*/
    
    //FUNCIONES PARA CLASE VALIDACIONESCAMPOS
    private void HabilitarBotones(){
        ValidadorCampos.HabilitarBotones(campos, botones,comboBox);
    }
    
    //FUNCION PARA CUANDO SE ABRA EL INTERNALFRAME
    private void InicializarVectores(){
        DeshabilitarBotones();
        //Inicializar Vector JTextField[] campos
        campos[0]= txtDocumento;
        campos[1]= txtNombres;
        campos[2]= txtApellidos;
        campos[3]= txtCurso;
        campos[4]= txtNota1;
        campos[5]= txtNota2;
        campos[6]= txtNota3;
        
        //Inicializar Vector JButton[] botones
        botones[0]= btnCrearStudent;
        botones[1]= btnModificar;
        botones[2]= btnEliminar;
        
        //Inicializar Vector JComboBox[] comboBos
        comboBox[0]= cbxGenero;
    }
        //SUBFUNCION PARA DESHABILITAR LOS BOTONES AL INICIO
        private void DeshabilitarBotones(){
            btnBuscar.setEnabled(false);
            btnCrearStudent.setEnabled(false);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearStudent;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarEstudiantes;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAprobado;
    private javax.swing.JLabel lblDefinitiva;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    // End of variables declaration//GEN-END:variables
}
