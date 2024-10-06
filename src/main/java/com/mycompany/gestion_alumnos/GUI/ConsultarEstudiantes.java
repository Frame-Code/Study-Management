package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.TableColumn;

/**
 *
 * @author artist-code
 */
public final class ConsultarEstudiantes extends javax.swing.JPanel implements ModeloTabla, Mensajes {

    private Controladora control;
    private ListadoEstudiantesAula estudiantes;
    private ListadoEstudiantesAnulados anulados;
    private Principal principal;

    public ConsultarEstudiantes() {
        initComponents();
        cargarTablaCursos();
    }

    public ConsultarEstudiantes(Controladora control, Principal principal) {
        this.control = control;
        this.principal = principal;
        this.initComponents();
        if(!control.leerListCursos().isEmpty()) {
            this.cargarTablaCursos();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        lblMatricula3 = new javax.swing.JLabel();
        lblMatricula5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAulas = new javax.swing.JTable();
        lblMatricula4 = new javax.swing.JLabel();
        lblMatricula6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVerEstudiantes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnVerEstudiantesAnulados = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 196, 196));
        setPreferredSize(new java.awt.Dimension(716, 479));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("CONSULTAR ESTUDIANTES");

        jPanel4.setBackground(new java.awt.Color(180, 180, 180));

        tblCursos.setBackground(new java.awt.Color(180, 180, 180));
        tblCursos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 23, 23), 1, true));
        tblCursos.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCursos);

        lblMatricula3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula3.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula3.setText("Cursos");

        lblMatricula5.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula5.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula5.setText("Selecciona un curso para ver sus aulas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblMatricula3))
                    .addComponent(lblMatricula5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblMatricula3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula5))
        );

        jPanel5.setBackground(new java.awt.Color(180, 180, 180));

        tblAulas.setBackground(new java.awt.Color(180, 180, 180));
        tblAulas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 23, 23), 1, true));
        tblAulas.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        tblAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAulasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAulas);

        lblMatricula4.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula4.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula4.setText("Aulas");

        lblMatricula6.setFont(new java.awt.Font("Waree", 1, 10)); // NOI18N
        lblMatricula6.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula6.setText("Doble click en un aula para ver sus estudiante, o presionar el boton");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblMatricula4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMatricula6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblMatricula4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatricula6))
        );

        jPanel3.setBackground(new java.awt.Color(180, 180, 180));

        btnVerEstudiantes.setBackground(new java.awt.Color(63, 72, 100));
        btnVerEstudiantes.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnVerEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEstudiantes.setText("Ver estudiantes");
        btnVerEstudiantes.setBorder(null);
        btnVerEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEstudiantesMouseExited(evt);
            }
        });
        btnVerEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(180, 180, 180));

        btnVerEstudiantesAnulados.setBackground(new java.awt.Color(63, 72, 100));
        btnVerEstudiantesAnulados.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnVerEstudiantesAnulados.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEstudiantesAnulados.setText("Ver estudiantes con matriculas anuladas");
        btnVerEstudiantesAnulados.setBorder(null);
        btnVerEstudiantesAnulados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEstudiantesAnuladosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEstudiantesAnuladosMouseExited(evt);
            }
        });
        btnVerEstudiantesAnulados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstudiantesAnuladosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerEstudiantesAnulados, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerEstudiantesAnulados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTablaCursos() {
        tblCursos.setModel(obtenerModeloTablaCursos(new String[]{"ID", "CURSO"}, control.leerListCursos()));
        tblAulas.setModel(obtenerModeloTablaAulas(new String[]{"ID", "AULA", "# Estudiantes", "# Asientos disponibles"}, new ArrayList<>()));
        tblCursos.setRowHeight(20);
    }

    private void cargarAulasCurso(Long idCurso) {
        tblAulas.setModel(obtenerModeloTablaAulasConEstudiante(new String[]{"ID", "AULA", "# Estudiantes", "# Asientos disponibles"}, control.obtenerListAulasDeCurso(idCurso)));
        TableColumn columnaID = tblAulas.getColumnModel().getColumn(0);
        columnaID.setPreferredWidth(8);
        tblAulas.setRowHeight(20);
    }

    private void btnVerEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstudiantesMouseEntered
        btnVerEstudiantes.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnVerEstudiantesMouseEntered

    private void btnVerEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstudiantesMouseExited
        btnVerEstudiantes.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnVerEstudiantesMouseExited

    private void btnVerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudiantesActionPerformed
        mostrarEstudiantes();
    }//GEN-LAST:event_btnVerEstudiantesActionPerformed

    private void tblCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursosMouseClicked
        cargarAulasCurso((Long) tblCursos.getValueAt(tblCursos.getSelectedRow(), 0));
    }//GEN-LAST:event_tblCursosMouseClicked

    private void tblAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAulasMouseClicked
        if(evt.getClickCount() == 2) {
            mostrarEstudiantes();
        }
    }//GEN-LAST:event_tblAulasMouseClicked

    private void btnVerEstudiantesAnuladosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstudiantesAnuladosMouseEntered
        btnVerEstudiantesAnulados.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnVerEstudiantesAnuladosMouseEntered

    private void btnVerEstudiantesAnuladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstudiantesAnuladosMouseExited
        btnVerEstudiantesAnulados.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnVerEstudiantesAnuladosMouseExited

    private void btnVerEstudiantesAnuladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudiantesAnuladosActionPerformed
        anulados = new ListadoEstudiantesAnulados(control, this, principal);
        principal.pnlPrincipalData.add(anulados);
        anulados.setVisible(true);
        anulados.cargarTablaEstudiantes();
        this.setVisible(false);
    }//GEN-LAST:event_btnVerEstudiantesAnuladosActionPerformed

    private void mostrarEstudiantes() {
        if (tblCursos.getRowCount() > 0) {
            if (tblCursos.getSelectedRow() != -1 && tblAulas.getSelectedRow() != -1) {
                estudiantes = new ListadoEstudiantesAula(control, (Long) tblAulas.getValueAt(tblAulas.getSelectedRow(), 0), this, principal);
                principal.pnlPrincipalData.add(estudiantes);
                estudiantes.setVisible(true);
                estudiantes.cargarEstadoMatricula();
                this.setVisible(false);
            } else {
                mostrarInformacion(this, "Selecciona un aula y un curso por favor", "Error");
            }
        } else {
            mostrarInformacion(this, "No hay tablas cargadas", "Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JButton btnVerEstudiantesAnulados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMatricula3;
    private javax.swing.JLabel lblMatricula4;
    private javax.swing.JLabel lblMatricula5;
    private javax.swing.JLabel lblMatricula6;
    private javax.swing.JTable tblAulas;
    private javax.swing.JTable tblCursos;
    // End of variables declaration//GEN-END:variables

}
