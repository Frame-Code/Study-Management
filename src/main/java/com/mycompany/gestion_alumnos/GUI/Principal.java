package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author frame-code
 */
public class Principal extends javax.swing.JFrame {

    private final JButton BOTONES[];
    private Controladora control;
    private MatricularNuevoEstudiante pnlMatricularNuevo;
    private MatricularEstudianteExistente pnlMatricularExistente;
    private ConsultarEstudiantes pnlConsultarEstudiantes;
    private RegistrarConsultarCursos pnlRegistroConsultaCursos;
    private RegistrarConsultarMaterias pnlRegistroConsultarMaterias;

    public Principal() {
        control = new Controladora();
        initComponents();
        this.BOTONES = new JButton[]{btnMatricularNuevo, btnMatricularExistente, btnConsultaEstudiantes, btnRegistrarCursos, btnRegistrarMaterias};
        this.pnlMatricularNuevo = new MatricularNuevoEstudiante(control);
        this.pnlMatricularExistente = new MatricularEstudianteExistente();
        this.pnlConsultarEstudiantes = new ConsultarEstudiantes(control);
        this.pnlRegistroConsultaCursos = new RegistrarConsultarCursos(control);
        this.pnlRegistroConsultarMaterias = new RegistrarConsultarMaterias(control);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMatricularNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMatricularExistente = new javax.swing.JButton();
        btnConsultaEstudiantes = new javax.swing.JButton();
        btnRegistrarCursos = new javax.swing.JButton();
        btnRegistrarMaterias = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlPrincipalData = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(63, 72, 100));

        btnMatricularNuevo.setBackground(new java.awt.Color(39, 44, 62));
        btnMatricularNuevo.setFont(new java.awt.Font("Waree", 0, 17)); // NOI18N
        btnMatricularNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricularNuevo.setText("° Matricular nuevo estudiante");
        btnMatricularNuevo.setBorder(null);
        btnMatricularNuevo.setBorderPainted(false);
        btnMatricularNuevo.setOpaque(false);
        btnMatricularNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMatricularNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMatricularNuevoMouseExited(evt);
            }
        });
        btnMatricularNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        btnMatricularExistente.setBackground(new java.awt.Color(39, 44, 62));
        btnMatricularExistente.setFont(new java.awt.Font("Waree", 0, 17)); // NOI18N
        btnMatricularExistente.setForeground(new java.awt.Color(255, 255, 255));
        btnMatricularExistente.setText("° Matricular estudiante existente");
        btnMatricularExistente.setBorder(null);
        btnMatricularExistente.setBorderPainted(false);
        btnMatricularExistente.setOpaque(false);
        btnMatricularExistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMatricularExistenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMatricularExistenteMouseExited(evt);
            }
        });
        btnMatricularExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularExistenteActionPerformed(evt);
            }
        });

        btnConsultaEstudiantes.setBackground(new java.awt.Color(39, 44, 62));
        btnConsultaEstudiantes.setFont(new java.awt.Font("Waree", 0, 17)); // NOI18N
        btnConsultaEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaEstudiantes.setText("° Consultar estudiantes");
        btnConsultaEstudiantes.setBorder(null);
        btnConsultaEstudiantes.setBorderPainted(false);
        btnConsultaEstudiantes.setOpaque(false);
        btnConsultaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultaEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultaEstudiantesMouseExited(evt);
            }
        });
        btnConsultaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEstudiantesActionPerformed(evt);
            }
        });

        btnRegistrarCursos.setBackground(new java.awt.Color(39, 44, 62));
        btnRegistrarCursos.setFont(new java.awt.Font("Waree", 0, 17)); // NOI18N
        btnRegistrarCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCursos.setText("° Registrar - Consultar cursos");
        btnRegistrarCursos.setBorder(null);
        btnRegistrarCursos.setBorderPainted(false);
        btnRegistrarCursos.setOpaque(false);
        btnRegistrarCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarCursosMouseExited(evt);
            }
        });
        btnRegistrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCursosActionPerformed(evt);
            }
        });

        btnRegistrarMaterias.setBackground(new java.awt.Color(39, 44, 62));
        btnRegistrarMaterias.setFont(new java.awt.Font("Waree", 0, 17)); // NOI18N
        btnRegistrarMaterias.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarMaterias.setText("° Registrar - consultar materias");
        btnRegistrarMaterias.setBorder(null);
        btnRegistrarMaterias.setBorderPainted(false);
        btnRegistrarMaterias.setOpaque(false);
        btnRegistrarMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMateriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMateriasMouseExited(evt);
            }
        });
        btnRegistrarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMateriasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UNIDAD EDUCATIVA ");

        jLabel4.setFont(new java.awt.Font("Waree", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\"25 DE SEPTIEMBRE\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnMatricularNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMatricularExistente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
            .addComponent(btnConsultaEstudiantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrarMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(134, 134, 134)
                .addComponent(btnMatricularNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMatricularExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(196, 196, 196));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("SISTEMA DE GESTION DE ESTUDIANTES Y CURSOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlPrincipalData.setBackground(new java.awt.Color(196, 196, 196));
        pnlPrincipalData.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipalData.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPrincipalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipalData, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatricularNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularNuevoActionPerformed
        inicializarPanel(btnMatricularNuevo, pnlMatricularNuevo);
    }//GEN-LAST:event_btnMatricularNuevoActionPerformed

    private void btnMatricularExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularExistenteActionPerformed
        inicializarPanel(btnMatricularExistente, pnlMatricularExistente);
    }//GEN-LAST:event_btnMatricularExistenteActionPerformed

    private void btnConsultaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEstudiantesActionPerformed
        inicializarPanel(btnConsultaEstudiantes, pnlConsultarEstudiantes);
    }//GEN-LAST:event_btnConsultaEstudiantesActionPerformed

    private void btnRegistrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCursosActionPerformed
        inicializarPanel(btnRegistrarCursos, pnlRegistroConsultaCursos);
    }//GEN-LAST:event_btnRegistrarCursosActionPerformed

    private void btnRegistrarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMateriasActionPerformed
        inicializarPanel(btnRegistrarMaterias, pnlRegistroConsultarMaterias);
    }//GEN-LAST:event_btnRegistrarMateriasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnlPrincipalData.add(new JLabel("Selecciona una opción"), BorderLayout.NORTH);
    }//GEN-LAST:event_formWindowOpened

    private void btnMatricularNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatricularNuevoMouseEntered
        btnMatricularNuevo.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnMatricularNuevoMouseEntered

    private void btnMatricularNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatricularNuevoMouseExited
        btnMatricularNuevo.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnMatricularNuevoMouseExited

    private void btnMatricularExistenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatricularExistenteMouseEntered
        btnMatricularExistente.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnMatricularExistenteMouseEntered

    private void btnMatricularExistenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatricularExistenteMouseExited
        btnMatricularExistente.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnMatricularExistenteMouseExited

    private void btnConsultaEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaEstudiantesMouseEntered
        btnConsultaEstudiantes.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnConsultaEstudiantesMouseEntered

    private void btnConsultaEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaEstudiantesMouseExited
        btnConsultaEstudiantes.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnConsultaEstudiantesMouseExited

    private void btnRegistrarCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCursosMouseEntered
        btnRegistrarCursos.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnRegistrarCursosMouseEntered

    private void btnRegistrarCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCursosMouseExited
        btnRegistrarCursos.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnRegistrarCursosMouseExited

    private void btnRegistrarMateriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMateriasMouseEntered
        btnRegistrarMaterias.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnRegistrarMateriasMouseEntered

    private void btnRegistrarMateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMateriasMouseExited
        btnRegistrarMaterias.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnRegistrarMateriasMouseExited

    private void inicializarPanel(JButton btnParaPintar, JPanel pnlMostrar) {
        this.pnlMatricularNuevo.setVisible(false);
        this.pnlMatricularExistente.setVisible(false);
        this.pnlConsultarEstudiantes.setVisible(false);
        this.pnlRegistroConsultaCursos.setVisible(false);
        this.pnlRegistroConsultarMaterias.setVisible(false);
        pnlPrincipalData.removeAll();

        pintarBtn(btnParaPintar);
        pnlPrincipalData.add(pnlMostrar);
        pnlMostrar.setVisible(true);
        resetFrame();
    }

    private void pintarBtn(JButton btnPintar) {
        for (JButton btn : BOTONES) {
            if (btn == btnPintar) {
                btn.setBackground(new java.awt.Color(39, 44, 62));
                btn.setOpaque(true);
            } else {
                btn.setBackground(new java.awt.Color(147, 147, 147));
                btn.setOpaque(false);
            }
        }
    }

    private void resetFrame() {
        this.setSize(1079, 719);
        this.setSize(1080, 720);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaEstudiantes;
    private javax.swing.JButton btnMatricularExistente;
    private javax.swing.JButton btnMatricularNuevo;
    private javax.swing.JButton btnRegistrarCursos;
    private javax.swing.JButton btnRegistrarMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlPrincipalData;
    // End of variables declaration//GEN-END:variables
}
