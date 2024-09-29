package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import com.mycompany.gestion_alumnos.LOGICA.Curso;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frame-Code
 */
public class RegistrarConsultarCursos extends javax.swing.JPanel implements Mensajes {

    public String nombre = "dsd";
    private Controladora control;
    private VerEditarCursos frameVerEditar;
    private CrearCursos frameCrearCursos;

    public RegistrarConsultarCursos() {
        initComponents();
    }

    public RegistrarConsultarCursos(Controladora control) {
        this.control = control;
        initComponents();
        cargarTabla();
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
        btnActualizarDatos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVerEditarCurso = new javax.swing.JButton();
        btnEliminarCurso = new javax.swing.JButton();
        btnCrearCurso = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 196, 196));
        setPreferredSize(new java.awt.Dimension(761, 657));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("REGISTRAR - CONSULTAR CURSOS");

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
        jScrollPane2.setViewportView(tblCursos);

        lblMatricula3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula3.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula3.setText("Selecciona un curso para editarlo, eliminarlo o ver mas información");

        btnActualizarDatos.setBackground(new java.awt.Color(63, 72, 100));
        btnActualizarDatos.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatos.setText("Actualizar Datos");
        btnActualizarDatos.setBorder(null);
        btnActualizarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarDatosMouseExited(evt);
            }
        });
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMatricula3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula3)
                    .addComponent(btnActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel17.setForeground(new java.awt.Color(99, 99, 99));
        jLabel17.setText("_________________________________________________Cursos registrados____________________________________________________");

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        btnVerEditarCurso.setBackground(new java.awt.Color(63, 72, 100));
        btnVerEditarCurso.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnVerEditarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEditarCurso.setText("Ver/Editar información detallada del curso");
        btnVerEditarCurso.setBorder(null);
        btnVerEditarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEditarCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEditarCursoMouseExited(evt);
            }
        });
        btnVerEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEditarCursoActionPerformed(evt);
            }
        });

        btnEliminarCurso.setBackground(new java.awt.Color(165, 80, 80));
        btnEliminarCurso.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnEliminarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCurso.setText("Eliminar curso");
        btnEliminarCurso.setBorder(null);
        btnEliminarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCursoMouseExited(evt);
            }
        });
        btnEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCursoActionPerformed(evt);
            }
        });

        btnCrearCurso.setBackground(new java.awt.Color(63, 72, 100));
        btnCrearCurso.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnCrearCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCurso.setText("Crear Curso");
        btnCrearCurso.setBorder(null);
        btnCrearCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCursoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearCursoMousePressed(evt);
            }
        });
        btnCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEditarCursoActionPerformed
        if (tblCursos.getRowCount() > 0) {
            if (tblCursos.getSelectedRow() != -1) {
                Long idCurso = (long) tblCursos.getValueAt(tblCursos.getSelectedRow(), 0);
                frameVerEditar = new VerEditarCursos(control, idCurso, this);
                frameVerEditar.setVisible(true);
                frameVerEditar.setLocationRelativeTo(null);
                frameVerEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameVerEditar.setResizable(false);
            } else {
                mostrarInformacion(this, "Selecciona una materia por favor", "Error");
            }
        } else {
            mostrarInformacion(this, "Tabla vacia", "Error");
        }

    }//GEN-LAST:event_btnVerEditarCursoActionPerformed

    private void btnEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCursoActionPerformed
        // TODO add your handling code here:
        if (tblCursos.getRowCount() > 0) {
            if (tblCursos.getSelectedRow() != -1) {
                Long idCurso = (long) tblCursos.getValueAt(tblCursos.getSelectedRow(), 0);
                int respuesta = confirmarInformacion(this, "Deseas eliminar el curso: "
                        + String.valueOf(tblCursos.getValueAt(tblCursos.getSelectedRow(), 1))
                        + " y sus aulas asignadas. Los estudiantes de cada aula tendran matricula CANCELADA, ", "Advertencia");
                if (respuesta == SI) {
                    control.eliminarCurso(idCurso);
                    mostrarInformacion(this, "Cuso eliminado", "Advertencia");
                }
                recargarDatos();
            } else {
                mostrarInformacion(this, "Selecciona una materia por favor", "Error");
            }
        } else {
            mostrarInformacion(this, "Tabla vacia", "Error");
        }
    }//GEN-LAST:event_btnEliminarCursoActionPerformed

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
        frameCrearCursos = new CrearCursos(control, RegistrarConsultarCursos.this);
        frameCrearCursos.setVisible(true);
        frameCrearCursos.setLocationRelativeTo(null);
        frameCrearCursos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        // TODO add your handling code here:
        recargarDatos();
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnVerEditarCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEditarCursoMouseEntered
        // TODO add your handling code here:
        btnVerEditarCurso.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnVerEditarCursoMouseEntered

    private void btnVerEditarCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEditarCursoMouseExited
        // TODO add your handling code here:
        btnVerEditarCurso.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnVerEditarCursoMouseExited

    private void btnCrearCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCursoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCursoMousePressed

    private void btnCrearCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCursoMouseEntered
        // TODO add your handling code here:
        btnCrearCurso.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnCrearCursoMouseEntered

    private void btnCrearCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCursoMouseExited
        // TODO add your handling code here:
        btnCrearCurso.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnCrearCursoMouseExited

    private void btnActualizarDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarDatosMouseEntered
        // TODO add your handling code here:
        btnActualizarDatos.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnActualizarDatosMouseEntered

    private void btnActualizarDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarDatosMouseExited
        // TODO add your handling code here:
        btnActualizarDatos.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnActualizarDatosMouseExited

    private void btnEliminarCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCursoMouseEntered
        // TODO add your handling code here:
        btnEliminarCurso.setBackground(new Color(201, 119, 119));
    }//GEN-LAST:event_btnEliminarCursoMouseEntered

    private void btnEliminarCursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCursoMouseExited
        // TODO add your handling code here:
        btnEliminarCurso.setBackground(new Color(165, 80, 80));
    }//GEN-LAST:event_btnEliminarCursoMouseExited

    public void recargarDatos() {
        cargarTabla();
    }
    
    //Factorizar este metodo
    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE_CURSO", "CANTIDAD_MATERIAS", "CANTIDAD_AULAS"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Curso> cursos = new ArrayList<>(control.leerListCursos());
        for (Curso curso : cursos) {
            Object object[] = {curso.getId(), curso.getNombre(), curso.getListMaterias().size(), curso.getListAulas().size()};
            modeloTabla.addRow(object);
        }
        tblCursos.setModel(modeloTabla);
        tblCursos.setRowHeight(20);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnEliminarCurso;
    private javax.swing.JButton btnVerEditarCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMatricula3;
    private javax.swing.JTable tblCursos;
    // End of variables declaration//GEN-END:variables
}
