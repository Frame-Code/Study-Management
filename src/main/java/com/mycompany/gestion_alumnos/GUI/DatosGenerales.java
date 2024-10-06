package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Frame-Code
 */
public class DatosGenerales extends javax.swing.JPanel implements Mensajes, Utils{

    private Controladora control;
    private Principal principal;

    public DatosGenerales() {
        initComponents();
    }

    public DatosGenerales(Controladora control, Principal principal) {
        this.control = control;
        this.principal = principal;
        this.initComponents();
        this.cargarDatos();

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
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTipoInstitucion = new javax.swing.JTextField();
        txtNombreInstitucion = new javax.swing.JTextField();
        lblValorPagado = new javax.swing.JLabel();
        SpinnerNumberModel modelCostoMatricula = new SpinnerNumberModel(1, 1, 500, 1);
        spnValorMatricula = new javax.swing.JSpinner(modelCostoMatricula);
        lblMesPagado1 = new javax.swing.JLabel();
        lblMesPagado2 = new javax.swing.JLabel();
        lblValorPagado1 = new javax.swing.JLabel();
        SpinnerNumberModel modelCostoColegiatura = new SpinnerNumberModel(1, 1, 500, 1);
        spnValorColegiatura = new javax.swing.JSpinner(modelCostoColegiatura);
        btnRegistrar = new javax.swing.JButton();
        SpinnerNumberModel modelDiaInicioCiclo = new SpinnerNumberModel(1, 1, 31, 1);
        spnDiaInicioCiclo = new javax.swing.JSpinner(modelDiaInicioCiclo);
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        cmbMesInicioCiclo = new javax.swing.JComboBox<>();
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        SpinnerNumberModel modelAnioInicioCiclo = new SpinnerNumberModel(anioActual, anioActual, anioActual+100 , 1);
        spnAnioInicioCiclo = new javax.swing.JSpinner(modelAnioInicioCiclo);
        lblFechaVencimiento = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblFechaVencimiento1 = new javax.swing.JLabel();
        SpinnerNumberModel modelDiaFinalCiclo = new SpinnerNumberModel(1, 1, 31, 1);
        spnDiaFinalCiclo = new javax.swing.JSpinner(modelDiaFinalCiclo);
        cmbMesFinalCiclo = new javax.swing.JComboBox<>();
        SpinnerNumberModel modelAnioFinalCiclo = new SpinnerNumberModel(anioActual, anioActual, anioActual+100 , 1);
        spnAnioFinalCiclo = new javax.swing.JSpinner(modelAnioFinalCiclo);
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblMatricula9 = new javax.swing.JLabel();
        lblMatricula12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMatricula3 = new javax.swing.JLabel();
        lblMatricula4 = new javax.swing.JLabel();
        lblMatricula5 = new javax.swing.JLabel();
        lblMatricula6 = new javax.swing.JLabel();
        lblMatricula7 = new javax.swing.JLabel();
        lblMatricula8 = new javax.swing.JLabel();
        lblMatricula10 = new javax.swing.JLabel();
        lblMatricula11 = new javax.swing.JLabel();
        lblMatricula13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(196, 196, 196));
        setPreferredSize(new java.awt.Dimension(755, 657));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("Registrar datos generales");

        jLabel17.setForeground(new java.awt.Color(99, 99, 99));
        jLabel17.setText("_________________________________________________Información ___________________________________________________");

        jPanel1.setBackground(new java.awt.Color(180, 180, 180));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("Tipo de institución");

        jLabel3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 23, 23));
        jLabel3.setText("Nombre de la institución");

        txtTipoInstitucion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtTipoInstitucion.setOpaque(false);

        txtNombreInstitucion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtNombreInstitucion.setOpaque(false);
        txtNombreInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreInstitucionActionPerformed(evt);
            }
        });

        lblValorPagado.setBackground(new java.awt.Color(0, 0, 0));
        lblValorPagado.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblValorPagado.setForeground(new java.awt.Color(23, 23, 23));
        lblValorPagado.setText("$ Valor de matrícula");

        spnValorMatricula.setBorder(null);
        spnValorMatricula.setOpaque(false);

        lblMesPagado1.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMesPagado1.setForeground(new java.awt.Color(71, 71, 71));
        lblMesPagado1.setText("$");

        lblMesPagado2.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMesPagado2.setForeground(new java.awt.Color(71, 71, 71));
        lblMesPagado2.setText("$");

        lblValorPagado1.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblValorPagado1.setForeground(new java.awt.Color(23, 23, 23));
        lblValorPagado1.setText("$ Valor de colegiatura");

        spnValorColegiatura.setBorder(null);
        spnValorColegiatura.setOpaque(false);

        btnRegistrar.setBackground(new java.awt.Color(63, 72, 100));
        btnRegistrar.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        spnDiaInicioCiclo.setBorder(null);
        spnDiaInicioCiclo.setOpaque(false);

        cmbMesInicioCiclo.setBackground(new java.awt.Color(180, 180, 180));
        cmbMesInicioCiclo.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        cmbMesInicioCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(meses));
        cmbMesInicioCiclo.setBorder(null);
        cmbMesInicioCiclo.setOpaque(false);
        cmbMesInicioCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesInicioCicloActionPerformed(evt);
            }
        });

        spnAnioInicioCiclo.setBorder(null);
        spnAnioInicioCiclo.setOpaque(false);

        lblFechaVencimiento.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblFechaVencimiento.setForeground(new java.awt.Color(23, 23, 23));
        lblFechaVencimiento.setText("Fecha de inicio del ciclo");

        jLabel14.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(99, 99, 99));
        jLabel14.setText("Día");

        jLabel13.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 99));
        jLabel13.setText("Mes");

        jLabel12.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 99, 99));
        jLabel12.setText("Año");

        lblFechaVencimiento1.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblFechaVencimiento1.setForeground(new java.awt.Color(23, 23, 23));
        lblFechaVencimiento1.setText("Fecha de finalizacion del ciclo");

        spnDiaFinalCiclo.setBorder(null);
        spnDiaFinalCiclo.setOpaque(false);

        cmbMesFinalCiclo.setBackground(new java.awt.Color(180, 180, 180));
        cmbMesFinalCiclo.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        cmbMesFinalCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(meses));
        cmbMesFinalCiclo.setBorder(null);
        cmbMesFinalCiclo.setOpaque(false);

        spnAnioFinalCiclo.setBorder(null);
        spnAnioFinalCiclo.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(99, 99, 99));
        jLabel15.setText("Día");

        jLabel16.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(99, 99, 99));
        jLabel16.setText("Mes");

        jLabel18.setFont(new java.awt.Font("Waree", 1, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(99, 99, 99));
        jLabel18.setText("Año");

        lblMatricula9.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula9.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula9.setText("|");

        lblMatricula12.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula12.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula12.setText("FrameCode$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreInstitucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoInstitucion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaVencimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFechaVencimiento1)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spnDiaInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMesInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel14)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(spnAnioInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblMatricula9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(spnDiaFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbMesFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15)
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel16)
                                                .addGap(35, 35, 35)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnAnioFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblMatricula12)
                                                    .addComponent(jLabel18))))))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorPagado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnValorMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMesPagado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnValorColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorPagado1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMesPagado2)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorPagado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblMesPagado1)
                                            .addComponent(spnValorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValorPagado1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMesPagado2)
                                        .addComponent(spnValorColegiatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaVencimiento)
                            .addComponent(lblFechaVencimiento1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDiaInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAnioInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMesInicioCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnDiaFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAnioFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMesFinalCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMatricula9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMatricula12)))
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        lblMatricula3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula3.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula3.setText("Caracteristicas principales del sistema:");

        lblMatricula4.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula4.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula4.setText("* Puedes registrar y matricular nuevos estudiantes que se integren a la institución.");

        lblMatricula5.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula5.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula5.setText("* Puedes volver a matricular estudiantes que en ciclos anteriores han sido matriculados.");

        lblMatricula6.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula6.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula6.setText("Los mismos cuentan con matricula ANULADA, que pueden ser eliminados posteriormente.");

        lblMatricula7.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula7.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula7.setText("* Puedes consultar, editar y eliminar información de estudiantes matriculados actualmente.");

        lblMatricula8.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula8.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula8.setText("Los mismos cuentan con matricula ACTIVA o INACTIVA despendiendo su historial de pagos.");

        lblMatricula10.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula10.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula10.setText("* Puedes crear, editar y eliminar cursos con sus respectivas materias y aulas asignadas.");

        lblMatricula11.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula11.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula11.setText("* Puedes crear, editar y eliminar materias que reciben cada uno de los cursos.");

        lblMatricula13.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        lblMatricula13.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula13.setText("* Puedes registrar los datos generales de la institucion como los que ves en esta pantalla.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMatricula3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblMatricula4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatricula5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMatricula7)
                                    .addComponent(lblMatricula6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblMatricula8))
                                    .addComponent(lblMatricula10)
                                    .addComponent(lblMatricula11)
                                    .addComponent(lblMatricula13))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatricula3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatricula7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula13)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        LocalDate inicioCiclo = LocalDate.of((int) spnAnioInicioCiclo.getValue(),
                obtenerMes(String.valueOf(cmbMesInicioCiclo.getSelectedItem())),
                (int) spnDiaInicioCiclo.getValue());
        LocalDate finalCiclo = LocalDate.of((int) spnAnioFinalCiclo.getValue(),
                obtenerMes(String.valueOf(cmbMesFinalCiclo.getSelectedItem())),
                (int) spnDiaFinalCiclo.getValue());
        control.crearInstitucion(txtTipoInstitucion.getText(), txtNombreInstitucion.getText(), String.valueOf(spnValorMatricula.getValue()), (Integer) spnValorColegiatura.getValue(), inicioCiclo, finalCiclo);
        mostrarInformacion(this, "Datos registrados correctamente", "Exito");
        Long idInstitucion = control.leerListInstitucion().get(control.leerListInstitucion().size() - 1).getId();
        principal.lblNombreInstitucion.setText(control.leerInstitucion(idInstitucion).getNombreInstitucion());
        principal.lblTipoInstitucion.setText(control.leerInstitucion(idInstitucion).getTipoInstitucion());
        this.cargarDatos();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    public final void cargarDatos() {
        if (!control.leerListInstitucion().isEmpty()) {
            Long idInstitucion = control.leerListInstitucion().get(control.leerListInstitucion().size() - 1).getId();
            LocalDate inicioCiclo = control.leerInstitucion(idInstitucion).getFechaInicioCiclo();
            LocalDate finalCiclo = control.leerInstitucion(idInstitucion).getFechaFinalCiclo();
            
            txtNombreInstitucion.setText(control.leerInstitucion(idInstitucion).getNombreInstitucion());
            txtTipoInstitucion.setText(control.leerInstitucion(idInstitucion).getTipoInstitucion());
            spnValorMatricula.setValue(Integer.valueOf(control.leerInstitucion(idInstitucion).getCostoMatricula()));
            spnValorColegiatura.setValue(control.leerInstitucion(idInstitucion).getCostoColegiatura());
            
            spnDiaInicioCiclo.setValue(control.leerInstitucion(idInstitucion).getFechaInicioCiclo().getDayOfMonth());
            spnAnioInicioCiclo.setValue(control.leerInstitucion(idInstitucion).getFechaInicioCiclo().getYear());
            cmbMesInicioCiclo.setSelectedItem(obtenerMesPorNumero(control.leerInstitucion(idInstitucion).getFechaInicioCiclo().getMonthValue()));
            
            spnDiaFinalCiclo.setValue(control.leerInstitucion(idInstitucion).getFechaFinalCiclo().getDayOfMonth());
            cmbMesFinalCiclo.setSelectedItem(obtenerMesPorNumero(control.leerInstitucion(idInstitucion).getFechaFinalCiclo().getMonthValue()));
            spnAnioFinalCiclo.setValue(control.leerInstitucion(idInstitucion).getFechaFinalCiclo().getYear());
        
        }
    }

    private void txtNombreInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreInstitucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreInstitucionActionPerformed

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void cmbMesInicioCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesInicioCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesInicioCicloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbMesFinalCiclo;
    private javax.swing.JComboBox<String> cmbMesInicioCiclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFechaVencimiento;
    private javax.swing.JLabel lblFechaVencimiento1;
    private javax.swing.JLabel lblMatricula10;
    private javax.swing.JLabel lblMatricula11;
    private javax.swing.JLabel lblMatricula12;
    private javax.swing.JLabel lblMatricula13;
    private javax.swing.JLabel lblMatricula3;
    private javax.swing.JLabel lblMatricula4;
    private javax.swing.JLabel lblMatricula5;
    private javax.swing.JLabel lblMatricula6;
    private javax.swing.JLabel lblMatricula7;
    private javax.swing.JLabel lblMatricula8;
    private javax.swing.JLabel lblMatricula9;
    private javax.swing.JLabel lblMesPagado1;
    private javax.swing.JLabel lblMesPagado2;
    private javax.swing.JLabel lblValorPagado;
    private javax.swing.JLabel lblValorPagado1;
    private javax.swing.JSpinner spnAnioFinalCiclo;
    private javax.swing.JSpinner spnAnioInicioCiclo;
    private javax.swing.JSpinner spnDiaFinalCiclo;
    private javax.swing.JSpinner spnDiaInicioCiclo;
    private javax.swing.JSpinner spnValorColegiatura;
    private javax.swing.JSpinner spnValorMatricula;
    private javax.swing.JTextField txtNombreInstitucion;
    private javax.swing.JTextField txtTipoInstitucion;
    // End of variables declaration//GEN-END:variables

}
