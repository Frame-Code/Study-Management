package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Aula;
import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import com.mycompany.gestion_alumnos.LOGICA.Curso;
import com.mycompany.gestion_alumnos.LOGICA.Estudiante;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Frame-Code
 */
public class MatricularNuevoEstudiante extends javax.swing.JPanel implements Mensajes {

    private Controladora control;
    private Long idCurso;

    public MatricularNuevoEstudiante() {
        initComponents();
    }

    public MatricularNuevoEstudiante(Controladora control) {
        this.control = control;
        this.initComponents();
        if (!control.leerListAulas().isEmpty() && !control.leerListCursos().isEmpty()) {
            this.idCurso = control.leerListCursos().get(0).getId();
            this.cargarCmbCursos();
            this.limpiar();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGenerarMatricula = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SpinnerNumberModel modelDia = new SpinnerNumberModel(1, 1, 31, 1);
        spnDiaNacimiento = new javax.swing.JSpinner(modelDia);
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        SpinnerNumberModel modelAnio = new SpinnerNumberModel(2005, 1985, anioActual-1 , 1);
        spnAnioNacimiento = new javax.swing.JSpinner(modelAnio);
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        cmbMesNacimiento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbAulas = new javax.swing.JComboBox<>();
        btnComprobarDisponibilidad = new javax.swing.JButton();
        lblMatricula3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblFechaVencimiento = new javax.swing.JLabel();
        SpinnerNumberModel modelDiaMatricula = new SpinnerNumberModel(1, 1, 31, 1);
        spnDiaMatricula = new javax.swing.JSpinner(modelDiaMatricula);
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SpinnerNumberModel modelAnioVencimiento = new SpinnerNumberModel(anioActual, anioActual, anioActual+100 , 1);
        spnAnioMatricula = new javax.swing.JSpinner(modelAnioVencimiento);
        jLabel12 = new javax.swing.JLabel();
        lblValorPagado = new javax.swing.JLabel();
        SpinnerNumberModel modelPago = new SpinnerNumberModel(1, 1, 500, 1);
        spnCantidadPagado = new javax.swing.JSpinner(modelPago);
        cmbMesMatricula = new javax.swing.JComboBox<>();
        lblMesPagado1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(196, 196, 196));
        setPreferredSize(new java.awt.Dimension(755, 657));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("MATRICULAR NUEVO ESTUDIANTE");

        btnGenerarMatricula.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnGenerarMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarMatricula.setText("Registrar y Generar Matricula ");
        btnGenerarMatricula.setBorder(null);
        btnGenerarMatricula.setEnabled(false);
        btnGenerarMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarMatriculaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarMatriculaMouseExited(evt);
            }
        });
        btnGenerarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarMatriculaActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(99, 99, 99));
        jLabel17.setText("_______________________________________________Información Personal_______________________________________________");

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("Nombres Completos");

        jLabel3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 23, 23));
        jLabel3.setText("Apellidos completos: ");

        jLabel4.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 23, 23));
        jLabel4.setText("Cédula: ");

        txtCedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtCedula.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 23, 23));
        jLabel5.setText("Fecha de nacimiento: ");

        spnDiaNacimiento.setBorder(null);
        spnDiaNacimiento.setOpaque(false);

        spnAnioNacimiento.setBorder(null);
        spnAnioNacimiento.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Waree", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(99, 99, 99));
        jLabel8.setText("Año");

        jLabel7.setFont(new java.awt.Font("Waree", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 99));
        jLabel7.setText("Mes");

        jLabel6.setFont(new java.awt.Font("Waree", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(99, 99, 99));
        jLabel6.setText("Día");

        txtNombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtNombres.setOpaque(false);

        txtApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtApellidos.setOpaque(false);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        cmbMesNacimiento.setBackground(new java.awt.Color(180, 180, 180));
        cmbMesNacimiento.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        cmbMesNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(meses));
        cmbMesNacimiento.setBorder(null);
        cmbMesNacimiento.setOpaque(false);
        cmbMesNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesNacimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addComponent(spnAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCedula)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(81, 81, 81))
        );

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        jLabel9.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 23, 23));
        jLabel9.setText("Curso: ");

        cmbCursos.setBackground(new java.awt.Color(180, 180, 180));
        cmbCursos.setBorder(null);
        cmbCursos.setOpaque(false);
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(23, 23, 23));
        jLabel10.setText("Aula:");

        cmbAulas.setBackground(new java.awt.Color(180, 180, 180));
        cmbAulas.setBorder(null);
        cmbAulas.setOpaque(false);

        btnComprobarDisponibilidad.setBackground(new java.awt.Color(63, 72, 100));
        btnComprobarDisponibilidad.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnComprobarDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobarDisponibilidad.setText("Comprobar disponibilidad");
        btnComprobarDisponibilidad.setBorder(null);
        btnComprobarDisponibilidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprobarDisponibilidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprobarDisponibilidadMouseExited(evt);
            }
        });
        btnComprobarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarDisponibilidadActionPerformed(evt);
            }
        });

        lblMatricula3.setFont(new java.awt.Font("Waree", 1, 10)); // NOI18N
        lblMatricula3.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula3.setText("Nota: Asegurese que existan cursos y aulas asignadas a dichos cursos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnComprobarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMatricula3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatricula3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprobarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel18.setForeground(new java.awt.Color(99, 99, 99));
        jLabel18.setText("___________________________________________________Matriculación____________________________________________________");

        jPanel3.setBackground(new java.awt.Color(180, 180, 180));

        lblFechaVencimiento.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblFechaVencimiento.setForeground(new java.awt.Color(71, 71, 71));
        lblFechaVencimiento.setText("Fecha de vencimiento de matricula:");

        spnDiaMatricula.setBorder(null);
        spnDiaMatricula.setEnabled(false);
        spnDiaMatricula.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(99, 99, 99));
        jLabel14.setText("Día");

        jLabel13.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 99));
        jLabel13.setText("Mes");

        spnAnioMatricula.setBorder(null);
        spnAnioMatricula.setEnabled(false);
        spnAnioMatricula.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 99, 99));
        jLabel12.setText("Año");

        lblValorPagado.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblValorPagado.setForeground(new java.awt.Color(71, 71, 71));
        lblValorPagado.setText("$ Valor de matrícula");

        spnCantidadPagado.setBorder(null);
        spnCantidadPagado.setEnabled(false);
        spnCantidadPagado.setOpaque(false);

        cmbMesMatricula.setBackground(new java.awt.Color(180, 180, 180));
        cmbMesMatricula.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        cmbMesMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(meses));
        cmbMesMatricula.setBorder(null);
        cmbMesMatricula.setEnabled(false);
        cmbMesMatricula.setOpaque(false);

        lblMesPagado1.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMesPagado1.setForeground(new java.awt.Color(71, 71, 71));
        lblMesPagado1.setText("$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(spnDiaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnAnioMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(lblFechaVencimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPagado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnCantidadPagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMesPagado1)
                .addGap(137, 137, 137))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesPagado1)
                            .addComponent(spnCantidadPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaVencimiento)
                            .addComponent(lblValorPagado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDiaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAnioMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnGenerarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprobarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarDisponibilidadActionPerformed
        if (cmbCursos.getSelectedItem() != null && cmbAulas.getSelectedItem() != null) {
            if (!(txtNombres.getText().equals("") && txtApellidos.getText().equals("") && txtCedula.getText().equals(""))) {
                String nombreAula = String.valueOf(cmbAulas.getSelectedItem());
                idCurso = control.leerCurso(String.valueOf(cmbCursos.getSelectedItem())).getId();
                //Condicional que puede cambiar
                if (control.obtenerAulaDeCurso(nombreAula, idCurso).getNumeroAsientosDisponibles() != 0) {
                    mostrarInformacion(this, "Hay disponibilidad en el aula!", "Exito");
                    habilitarUltimasOpciones();
                } else {
                    mostrarInformacion(this, "No hay disponibilidad en el aula", "Error");
                    bloquearUltimasOpciones();
                }
            } else {
                mostrarInformacion(this, "No pueden haber campos vacios", "Error");
                bloquearUltimasOpciones();
            }
        } else {
            mostrarInformacion(this, "No hay cursos seleccionados", "Error");

        }

    }//GEN-LAST:event_btnComprobarDisponibilidadActionPerformed

    private void btnComprobarDisponibilidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobarDisponibilidadMouseEntered
        btnComprobarDisponibilidad.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnComprobarDisponibilidadMouseEntered

    private void btnComprobarDisponibilidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobarDisponibilidadMouseExited
        btnComprobarDisponibilidad.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnComprobarDisponibilidadMouseExited

    private void btnGenerarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMatriculaActionPerformed
        if (isNumber(txtCedula.getText())) {
            boolean isRegistered = true;
            String nombreAula = "";
            Long numeroCedula = Long.valueOf(txtCedula.getText());
            idCurso = control.leerCurso(String.valueOf(cmbCursos.getSelectedItem())).getId();

            if (control.leerListEstudiantes().isEmpty()) {
                isRegistered = false;
            } else {
                for (Estudiante estudiante : control.leerListEstudiantes()) {
                    if (estudiante.getId().equals(numeroCedula)) {
                        nombreAula = estudiante.getAula().getNombre();
                        isRegistered = true;
                        break;
                    } else {
                        isRegistered = false;
                    }
                }
            }

            if (isRegistered == false) {
                LocalDate fechaNacimiento = LocalDate.of((int) spnAnioNacimiento.getValue(),
                    obtenerMes(String.valueOf(cmbMesNacimiento.getSelectedItem())),
                    (int) spnDiaNacimiento.getValue());
                LocalDate fechaVencimiento = LocalDate.of((int) spnAnioMatricula.getValue(),
                    obtenerMes(String.valueOf(cmbMesMatricula.getSelectedItem())),
                    (int) spnDiaMatricula.getValue());

                control.crearEstudiante(txtNombres.getText(), txtApellidos.getText(),
                    numeroCedula, fechaNacimiento,
                    idCurso, String.valueOf(cmbAulas.getSelectedItem()), fechaVencimiento,
                    String.valueOf(spnCantidadPagado.getValue()));

                mostrarInformacion(this, "Estudiante matriculado correctamente", "Exito");
                limpiar();
            } else {
                mostrarInformacion(this, "El estudiante con dicha cédula ya existe en el aula '" + nombreAula + "'", "Exito");
            }
        } else {
            mostrarInformacion(this, "No pueden haber letras en la cedula", "Error");
        }
    }//GEN-LAST:event_btnGenerarMatriculaActionPerformed

    private void btnGenerarMatriculaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMatriculaMouseExited
        btnGenerarMatricula.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnGenerarMatriculaMouseExited

    private void btnGenerarMatriculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMatriculaMouseEntered
        btnGenerarMatricula.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnGenerarMatriculaMouseEntered

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        String nombreCurso = String.valueOf(cmbCursos.getSelectedItem());
        cmbAulas.removeAllItems();
        for (Aula aula : control.obtenerListAulasDeCurso(control.leerCurso(nombreCurso).getId())) {
            cmbAulas.addItem(aula.getNombre());
        }
    }//GEN-LAST:event_cmbCursosActionPerformed

    private void cmbMesNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesNacimientoActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    public final void cargarCmbCursos() {
        if (isEmptyCombo(cmbCursos)) {
            for (Curso curso : control.leerListCursos()) {
                cmbCursos.addItem(curso.getNombre());
            }
        }
    }

    public final void limpiar() {
        txtApellidos.setText("");
        txtNombres.setText("");
        txtCedula.setText("");
        spnDiaNacimiento.setValue(1);
        cmbMesNacimiento.setSelectedIndex(0);
        spnAnioNacimiento.setValue(2005);
        if (!(isEmptyCombo(cmbAulas) && isEmptyCombo(cmbAulas))) {
            cmbCursos.setSelectedIndex(0);
            cmbAulas.setSelectedIndex(0);
        }
        bloquearUltimasOpciones();
        spnDiaMatricula.setValue(1);
        cmbMesMatricula.setSelectedIndex(0);
        spnAnioMatricula.setValue(LocalDate.now().getYear());
        spnCantidadPagado.setValue(1);

    }

    private int obtenerMes(String mes) {
        if (mes.equals("Enero")) {
            return 1;
        } else if (mes.equals("Febrero")) {
            return 2;
        } else if (mes.equals("Marzo")) {
            return 3;
        } else if (mes.equals("Abril")) {
            return 4;
        } else if (mes.equals("Mayo")) {
            return 5;
        } else if (mes.equals("Junio")) {
            return 6;
        } else if (mes.equals("Julio")) {
            return 7;
        } else if (mes.equals("Agosto")) {
            return 8;
        } else if (mes.equals("Septiembre")) {
            return 9;
        } else if (mes.equals("Octubre")) {
            return 10;
        } else if (mes.equals("Noviembre")) {
            return 11;
        } else if (mes.equals("Diciembre")) {
            return 12;
        }
        return 0;
    }

    private void habilitarUltimasOpciones() {
        lblFechaVencimiento.setForeground(new Color(23, 23, 23));
        lblValorPagado.setForeground(new Color(23, 23, 23));

        spnDiaMatricula.setEnabled(true);
        cmbMesMatricula.setEnabled(true);
        spnAnioMatricula.setEnabled(true);
        spnCantidadPagado.setEnabled(true);

        btnGenerarMatricula.setEnabled(true);
        btnGenerarMatricula.setBackground(new Color(63, 72, 100));

    }

    private void bloquearUltimasOpciones() {
        lblFechaVencimiento.setForeground(new Color(71, 71, 71));
        lblValorPagado.setForeground(new Color(71, 71, 71));

        spnDiaMatricula.setEnabled(false);
        cmbMesMatricula.setEnabled(false);
        spnAnioMatricula.setEnabled(false);
        spnCantidadPagado.setEnabled(false);

        btnGenerarMatricula.setEnabled(false);
        btnGenerarMatricula.setBackground(new Color(255, 255, 255));
    }

    private boolean isEmptyCombo(JComboBox cmb) {
        int cantidadElementos = 0;
        for (int i = 0; i < cmb.getItemCount(); i++) {
            cantidadElementos++;
        }
        return (cantidadElementos == 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobarDisponibilidad;
    private javax.swing.JButton btnGenerarMatricula;
    private javax.swing.JComboBox<String> cmbAulas;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JComboBox<String> cmbMesMatricula;
    private javax.swing.JComboBox<String> cmbMesNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFechaVencimiento;
    private javax.swing.JLabel lblMatricula3;
    private javax.swing.JLabel lblMesPagado1;
    private javax.swing.JLabel lblValorPagado;
    private javax.swing.JSpinner spnAnioMatricula;
    private javax.swing.JSpinner spnAnioNacimiento;
    private javax.swing.JSpinner spnCantidadPagado;
    private javax.swing.JSpinner spnDiaMatricula;
    private javax.swing.JSpinner spnDiaNacimiento;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
