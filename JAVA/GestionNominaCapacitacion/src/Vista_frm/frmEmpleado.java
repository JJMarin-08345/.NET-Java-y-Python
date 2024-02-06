package Vista_frm;

import Clases_Gestion.Empleado;
import Controlador.GestionNomina_Capacitacion;
import Controlador.ValidacionesCampos;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmEmpleado extends javax.swing.JInternalFrame {

    //Atributos
    public static GestionNomina_Capacitacion objEmpresa = new GestionNomina_Capacitacion();
    private ValidacionesCampos ValidadorCampos = new ValidacionesCampos();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private Empleado emp1 = new Empleado();//Para manejo de listado
    private JButton[] botones = new JButton[4];
    private JTextField[] campos = new JTextField[6];
    private JComboBox[] selecciones = new JComboBox[2];
    private int posicion = 0;

    public frmEmpleado() {
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
        txtApellidos = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtHorasTrabajadas = new javax.swing.JTextField();
        txtValorHora = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnBEmpleadoDoc = new javax.swing.JButton();
        btnBEmpleadoNombres = new javax.swing.JButton();
        btnBEmpleadoApellidos = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnPrimerEmpleado = new javax.swing.JButton();
        btnUltimoEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCantidadEmpNom = new javax.swing.JLabel();
        lblCantidadEmpApe = new javax.swing.JLabel();
        btnEliminarEmp = new javax.swing.JButton();
        btnModifyEmp = new javax.swing.JButton();
        lblmsjSalario = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        txtAumentoSalario = new javax.swing.JTextField();
        btnAumentarSalario = new javax.swing.JButton();
        btnNomina = new javax.swing.JButton();
        btnListarEmpleados = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Empleados");
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

        jLabel1.setText("Documento:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Genero:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Cargo:");

        jLabel7.setText("Horas Trabajadas:");

        jLabel8.setText("Valor Hora: ");

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyTyped(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });

        txtHorasTrabajadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasTrabajadasKeyTyped(evt);
            }
        });

        txtValorHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorHoraKeyTyped(evt);
            }
        });

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar ---", "Hombre", "Mujer" }));
        cbxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGeneroActionPerformed(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Seleccionar ---", "Directivo", "Administrativo", "Operativo" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBEmpleadoDoc.setText("Por documento");
        btnBEmpleadoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBEmpleadoDocActionPerformed(evt);
            }
        });

        btnBEmpleadoNombres.setText("Por nombres");
        btnBEmpleadoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBEmpleadoNombresActionPerformed(evt);
            }
        });

        btnBEmpleadoApellidos.setText("Por apellidos");
        btnBEmpleadoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBEmpleadoApellidosActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Buscar Empleado");

        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnPrimerEmpleado.setText("|<");
        btnPrimerEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerEmpleadoActionPerformed(evt);
            }
        });

        btnUltimoEmpleado.setText(">|");
        btnUltimoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Empleados con mismo nombre:");

        jLabel11.setText("Empleados con mismo apellido:");

        lblCantidadEmpNom.setText("0");

        lblCantidadEmpApe.setText("0");

        btnEliminarEmp.setText("Eliminar");
        btnEliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpActionPerformed(evt);
            }
        });

        btnModifyEmp.setText("Modificar");
        btnModifyEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyEmpActionPerformed(evt);
            }
        });

        lblmsjSalario.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblmsjSalario.setText("Salario:");

        lblSalario.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblSalario.setText("0$");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("Datos Empleado");

        lblPorcentaje.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPorcentaje.setText("%");

        txtAumentoSalario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtAumentoSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAumentoSalarioKeyTyped(evt);
            }
        });

        btnAumentarSalario.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAumentarSalario.setText("Aumentar Salario");
        btnAumentarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarSalarioActionPerformed(evt);
            }
        });

        btnNomina.setText("Nomina de Empleados");
        btnNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominaActionPerformed(evt);
            }
        });

        btnListarEmpleados.setText("Mostrar Empleados");
        btnListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtNombres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrear)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifyEmp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtHorasTrabajadas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBEmpleadoDoc)
                            .addComponent(jLabel9))
                        .addContainerGap(258, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBEmpleadoNombres)
                                    .addComponent(btnBEmpleadoApellidos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCantidadEmpNom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCantidadEmpApe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrimerEmpleado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUltimoEmpleado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSiguiente)))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListarEmpleados)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblmsjSalario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNomina)
                                            .addComponent(lblSalario)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAumentarSalario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAumentoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBEmpleadoDoc)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnBEmpleadoNombres)
                                .addGap(14, 14, 14)
                                .addComponent(btnBEmpleadoApellidos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblCantidadEmpNom))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(lblCantidadEmpApe))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAnterior)
                                    .addComponent(btnSiguiente)
                                    .addComponent(btnPrimerEmpleado)
                                    .addComponent(btnUltimoEmpleado))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPorcentaje)
                            .addComponent(txtAumentoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAumentarSalario))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmsjSalario)
                            .addComponent(lblSalario))
                        .addGap(18, 18, 18)
                        .addComponent(btnListarEmpleados)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnEliminarEmp)
                            .addComponent(btnModifyEmp)
                            .addComponent(btnLimpiar))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNomina)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        crearEmpleado();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBEmpleadoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBEmpleadoDocActionPerformed
        // TODO add your handling code here
        if (txtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escriba un documento");
            txtDocumento.requestFocus();
        } else {
            BuscarEmpleadoDoc();
        }
    }//GEN-LAST:event_btnBEmpleadoDocActionPerformed

    private void btnBEmpleadoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBEmpleadoNombresActionPerformed
        // TODO add your handling code here:
        if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Nombres' esta vacio");
            txtNombres.requestFocus();
        } else {
            BuscarEmpleadoNombre();
        }

    }//GEN-LAST:event_btnBEmpleadoNombresActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        //Boton de anterior usuario
        if (this.posicion > 0) {
            this.posicion--;
            MostrarEmpleados(this.posicion);
        } else if (this.posicion == 0) {
            JOptionPane.showMessageDialog(this, "No hay un empleado anterior");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        //Botón de siguiente usuario con mismo nombre

        if (this.posicion < this.empleados.size() - 1) {
            this.posicion++;
            MostrarEmpleados(this.posicion);
        } else if (this.posicion == this.empleados.size() - 1) {
            JOptionPane.showMessageDialog(this, "No hay un empleado siguiente");
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        int confirmLimpiar = JOptionPane.showConfirmDialog(this, "¿Desea limpiar el formulario?", "Confirmar",
                JOptionPane.OK_CANCEL_OPTION);
        if (confirmLimpiar == 0) {
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPrimerEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerEmpleadoActionPerformed
        // TODO add your handling code here:
        this.posicion = 0;
        MostrarEmpleados(this.posicion);
    }//GEN-LAST:event_btnPrimerEmpleadoActionPerformed

    private void btnUltimoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoEmpleadoActionPerformed
        // TODO add your handling code here:
        if(this.empleados.size()>0){
            this.posicion = this.empleados.size() - 1;
            MostrarEmpleados(this.posicion);
        }
    }//GEN-LAST:event_btnUltimoEmpleadoActionPerformed

    private void btnBEmpleadoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBEmpleadoApellidosActionPerformed
        // TODO add your handling code here:
        if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Apellidos' esta vacio");
            txtApellidos.requestFocus();
        } else {
            BuscarEmpleadoApellido();
        }
    }//GEN-LAST:event_btnBEmpleadoApellidosActionPerformed

    private void btnEliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpActionPerformed
        // TODO add your handling code here:
        EliminarEmpleado();
    }//GEN-LAST:event_btnEliminarEmpActionPerformed

    private void btnModifyEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyEmpActionPerformed
        // TODO add your handling code here:
        if (VerificarCampos() == false) {
            ModificarEmpleado();
        }
    }//GEN-LAST:event_btnModifyEmpActionPerformed

    private void btnAumentarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarSalarioActionPerformed
        // TODO add your handling code here:
        if (txtAumentoSalario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo esta vacio");
            txtAumentoSalario.requestFocus();
        } else {
            AumentarSalario();
        }
    }//GEN-LAST:event_btnAumentarSalarioActionPerformed

    private void btnNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominaActionPerformed
        // TODO add your handling code here:
        objEmpresa.Nomina();
    }//GEN-LAST:event_btnNominaActionPerformed

    private void btnListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpleadosActionPerformed
        // TODO add your handling code here:
        this.empleados = objEmpresa.ListarEmpleado();
        if (this.empleados.size() > 0) {
            MostrarEmpleados(0);
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningun empleado registrado", "Sin this.empleados",
                    JOptionPane.OK_CANCEL_OPTION);
        }

    }//GEN-LAST:event_btnListarEmpleadosActionPerformed

    private void txtValorHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorHoraKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumeros(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtValorHoraKeyTyped

    private void txtHorasTrabajadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasTrabajadasKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumeros(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtHorasTrabajadasKeyTyped

    private void txtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtCargoKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloLetras(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtNombresKeyTyped

    //VALIDACION CAMPO DOCUMENTO, PERMITE SOLO NUMEROS
    private void txtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumeros(evt);
        HabilitarBotones();
    }//GEN-LAST:event_txtDocumentoKeyTyped

    private void cbxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGeneroActionPerformed
        // TODO add your handling code here:
        HabilitarBotones();
    }//GEN-LAST:event_cbxGeneroActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
        HabilitarBotones();
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        // TODO add your handling code here:
        ValidadorCampos.HabilitarUnBoton(txtApellidos, 3, btnBEmpleadoApellidos);
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        // TODO add your handling code here:
        ValidadorCampos.HabilitarUnBoton(txtNombres, 3, btnBEmpleadoNombres);
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyReleased
        // TODO add your handling code here:
        ValidadorCampos.HabilitarUnBoton(txtDocumento, 7, btnBEmpleadoDoc);
    }//GEN-LAST:event_txtDocumentoKeyReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        LlenarVectoresTxt_Btn();
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtAumentoSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAumentoSalarioKeyTyped
        // TODO add your handling code here:
        ValidadorCampos.PermitirSoloNumerosDecimales(evt);
        if(Double.parseDouble(txtAumentoSalario.getText())>100 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtAumentoSalarioKeyTyped

    private void crearEmpleado() {
        if (!VerificarCampos()) {
            Empleado emp = new Empleado(txtCargo.getText().toUpperCase(), "" + cbxTipo.getSelectedItem(),
                    Integer.parseInt(txtHorasTrabajadas.getText()), Integer.parseInt(txtValorHora.getText()),
                    txtDocumento.getText(), txtNombres.getText().toUpperCase(),
                    txtApellidos.getText().toUpperCase(), "" + cbxGenero.getSelectedItem());
            if (objEmpresa.GuardarEmpleado(emp) == false) {
                limpiarFormulario();
                BotonesDeBusqueda();
                /*Preguntamos si el empleado existe, y si no (false)
                limpiar el formulario */
            }
        }
    }

    private void BuscarEmpleadoDoc() {
        Empleado BempDoc = objEmpresa.BuscarEmpleadoDocumento(txtDocumento.getText(), true);
        if (BempDoc != null) {
            txtDocumento.setText(BempDoc.getDocumento());
            txtNombres.setText(BempDoc.getNombres());
            txtApellidos.setText(BempDoc.getApellidos());
            cbxGenero.setSelectedItem(BempDoc.getGenero());
            txtCargo.setText(BempDoc.getCargo());
            cbxTipo.setSelectedItem(BempDoc.getTipo());
            txtHorasTrabajadas.setText("" + BempDoc.getHorasTrabajadas());
            txtValorHora.setText("" + BempDoc.getValorHora());

            BempDoc.CalcularSalario();
            lblSalario.setText("" + BempDoc.getSalario() + "$");
            BotonesDeBusqueda();
        }
    }

    private void BuscarEmpleadoNombre() {
        this.empleados = objEmpresa.BuscarEmpleadoNombre(txtNombres.getText().toUpperCase());
        lblCantidadEmpNom.setText("" + this.empleados.size());
        if (this.empleados.size() > 0) {
            MostrarEmpleados(0);
        }
    }

    private void BuscarEmpleadoApellido() {
        this.empleados = objEmpresa.BuscarEmpleadoApe(txtApellidos.getText().toUpperCase());
        lblCantidadEmpApe.setText("" + this.empleados.size());
        if (this.empleados.size() > 0) {
            MostrarEmpleados(0);
        }
    }

    private void MostrarEmpleados(int pos) {
        this.emp1 = this.empleados.get(pos);
        txtDocumento.setText(this.emp1.getDocumento());
        txtNombres.setText(this.emp1.getNombres());
        txtApellidos.setText(this.emp1.getApellidos());
        cbxGenero.setSelectedItem(this.emp1.getGenero());
        txtCargo.setText(this.emp1.getCargo());
        cbxTipo.setSelectedItem(this.emp1.getTipo());
        txtHorasTrabajadas.setText("" + this.emp1.getHorasTrabajadas());
        txtValorHora.setText("" + this.emp1.getValorHora());
        this.emp1.CalcularSalario();
        lblSalario.setText("" + this.emp1.getSalario() + "$");
        //LLamado a las funciones del validador de campos
        HabilitarBotones();
        BotonesDeBusqueda();
    }

    private void EliminarEmpleado() {
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el empleado?",
                "Eliminar empleado", JOptionPane.OK_CANCEL_OPTION);

        if (confirmar == 0) {
            objEmpresa.EliminarEmpleado(txtDocumento.getText());
            limpiarFormulario();
        }

    }

    private void ModificarEmpleado() {
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desa modificar?",
                "Modificar Empleado", JOptionPane.OK_CANCEL_OPTION);
        if (confirmar == 0) {
            Empleado ModEmp = new Empleado();
            ModEmp.setDocumento(txtDocumento.getText());
            ModEmp.setNombres(txtNombres.getText().toUpperCase());
            ModEmp.setApellidos(txtApellidos.getText().toUpperCase());
            ModEmp.setGenero("" + cbxGenero.getSelectedItem());
            ModEmp.setCargo(txtCargo.getText().toUpperCase());
            ModEmp.setTipo("" + cbxTipo.getSelectedItem());
            ModEmp.setHorasTrabajadas(Integer.parseInt(txtHorasTrabajadas.getText()));
            ModEmp.setValorHora(Integer.parseInt(txtValorHora.getText()));

            ModEmp.CalcularSalario();
            lblSalario.setText("" + ModEmp.getSalario() + "$");
            objEmpresa.ModificarEmpleado(ModEmp);

        }
    }

    private void AumentarSalario() {
        if (VerificarCampos() == false) {
            Empleado empAS = objEmpresa.BuscarEmpleadoDocumento(txtDocumento.getText(), false);
            if (empAS != null) {
                try {
                    Float.parseFloat(txtAumentoSalario.getText());
                    empAS.IncrementoSalario(Float.parseFloat(txtAumentoSalario.getText()));
                    JOptionPane.showMessageDialog(this, "Aumento Realizado Con Exito",
                            "Aumento de Salario",
                            JOptionPane.INFORMATION_MESSAGE);
                    empAS.CalcularSalario();
                    objEmpresa.ModificarEmpleado(empAS);
                    txtValorHora.setText("" + empAS.getValorHora());
                    lblSalario.setText("" + empAS.getSalario() + "$");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite un numero valido");
                }
            }
        }
        /*else{
            JOptionPane.showMessageDialog(this,"Debe a ver un usuario registrado"+
                    "\n Recuerde que para aplicar esta opcion tiene que buscar un empleado");
        }*/
    }

    private boolean VerificarCampos() {
        //Esta funcion sera verdadera si algun campo esta vacio o si 
        //los campos numericos tienes letras ( con la funcion Excepcion_HT_VH() )
        if (txtDocumento.getText().isEmpty() || txtNombres.getText().isEmpty()
                || txtApellidos.getText().isEmpty() || cbxGenero.getSelectedIndex() == 0
                || txtCargo.getText().isEmpty() || cbxTipo.getSelectedIndex() == 0 || txtHorasTrabajadas.getText().isEmpty()
                || txtValorHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos");
            return true;
        } else if (!Excepcion_HT_VH()) {
            return true;
        }
        return false;
    }

    private boolean Excepcion_HT_VH() {
        try {
            Integer.parseInt(txtHorasTrabajadas.getText());
            Integer.parseInt(txtValorHora.getText());
            return true;
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Revise que no hayan caracteres \n"
                    + " en 'Horas Trabajadas' o 'Valor Hora'");
            return false;
        }
    }

    private void limpiarFormulario() {
        txtDocumento.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        cbxGenero.setSelectedIndex(0);
        txtCargo.setText("");
        cbxTipo.setSelectedIndex(0);
        txtHorasTrabajadas.setText("");
        txtValorHora.setText("");
        lblSalario.setText("0$");
        lblCantidadEmpNom.setText("0");
        lblCantidadEmpApe.setText("0");
        txtAumentoSalario.setText("");
        HabilitarBotones();
        BotonesDeBusqueda();
        this.requestFocus();
    }

    //FUNCIONES PARA VALIDADOR DE CAMPOS
    private void HabilitarBotones() {
        ValidadorCampos.HabilitarBotones(campos, botones, selecciones, txtAumentoSalario);
    }

    private void BotonesDeBusqueda() {
        ValidadorCampos.HabilitarUnBoton(txtDocumento, 7, btnBEmpleadoDoc);
        ValidadorCampos.HabilitarUnBoton(txtNombres, 7, btnBEmpleadoNombres);
        ValidadorCampos.HabilitarUnBoton(txtApellidos, 7, btnBEmpleadoApellidos);
    }

    //FUNCION PARA INICIALIZAR VECTORES
    private void LlenarVectoresTxt_Btn() {
        btnCrear.setEnabled(false);
        btnModifyEmp.setEnabled(false);
        btnEliminarEmp.setEnabled(false);
        btnAumentarSalario.setEnabled(false);
        btnBEmpleadoDoc.setEnabled(false);
        btnBEmpleadoNombres.setEnabled(false);
        btnBEmpleadoApellidos.setEnabled(false);
        txtAumentoSalario.setEnabled(false);
        //Vectores del JButton
        botones[0] = btnCrear;
        botones[1] = btnModifyEmp;
        botones[2] = btnEliminarEmp;
        botones[3] = btnAumentarSalario;
        //Vectores del JTextField 
        campos[0] = txtDocumento;
        campos[1] = txtNombres;
        campos[2] = txtApellidos;
        campos[3] = txtCargo;
        campos[4] = txtHorasTrabajadas;
        campos[5] = txtValorHora;
        //Vectores del JComboBox
        selecciones[0] = cbxGenero;
        selecciones[1] = cbxTipo;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAumentarSalario;
    private javax.swing.JButton btnBEmpleadoApellidos;
    private javax.swing.JButton btnBEmpleadoDoc;
    private javax.swing.JButton btnBEmpleadoNombres;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminarEmp;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarEmpleados;
    private javax.swing.JButton btnModifyEmp;
    private javax.swing.JButton btnNomina;
    private javax.swing.JButton btnPrimerEmpleado;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimoEmpleado;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCantidadEmpApe;
    private javax.swing.JLabel lblCantidadEmpNom;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblmsjSalario;
    public static javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAumentoSalario;
    public static javax.swing.JTextField txtCargo;
    public static javax.swing.JTextField txtDocumento;
    public static javax.swing.JTextField txtHorasTrabajadas;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}
