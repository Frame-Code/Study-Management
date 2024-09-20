package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import com.mycompany.gestion_alumnos.LOGICA.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frame-Code
 */
public class CrearCursos extends javax.swing.JFrame implements Mensajes{

    private Controladora control;

    public CrearCursos() {
        initComponents();
    }

    public CrearCursos(Controladora control) {
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

        pnlPrincipalData = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        spnNumeroAulas = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        lblMatricula4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCrearCursoNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipalData.setBackground(new java.awt.Color(196, 196, 196));
        pnlPrincipalData.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(180, 180, 180));

        jLabel3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 23, 23));
        jLabel3.setText("Nombre del curso:");

        txtNombreCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64), 1, true));
        txtNombreCurso.setOpaque(false);

        spnNumeroAulas.setBorder(null);
        spnNumeroAulas.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 23, 23));
        jLabel5.setText("Numero de Aulas que tiene:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(spnNumeroAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCurso)
                    .addComponent(spnNumeroAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(180, 180, 180));

        tblMaterias.setBackground(new java.awt.Color(180, 180, 180));
        tblMaterias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 23, 23), 1, true));
        tblMaterias.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMaterias);

        lblMatricula4.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        lblMatricula4.setForeground(new java.awt.Color(71, 71, 71));
        lblMatricula4.setText("Selecciona las materias que tiene el curso: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMatricula4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblMatricula4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Waree", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("CREAR NUEVO CURSO");

        jPanel3.setBackground(new java.awt.Color(180, 180, 180));

        btnCrearCursoNuevo.setBackground(new java.awt.Color(63, 72, 100));
        btnCrearCursoNuevo.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnCrearCursoNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCursoNuevo.setText("Crear curso nuevo");
        btnCrearCursoNuevo.setBorder(null);
        btnCrearCursoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoNuevoActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(63, 72, 100));
        btnRegresar.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCursoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearCursoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jLabel17.setForeground(new java.awt.Color(99, 99, 99));
        jLabel17.setText("____________________________________________Informacion del curso________________________________________");

        javax.swing.GroupLayout pnlPrincipalDataLayout = new javax.swing.GroupLayout(pnlPrincipalData);
        pnlPrincipalData.setLayout(pnlPrincipalDataLayout);
        pnlPrincipalDataLayout.setHorizontalGroup(
            pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                            .addGap(248, 248, 248)
                            .addComponent(jLabel2))
                        .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlPrincipalDataLayout.setVerticalGroup(
            pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCursoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoNuevoActionPerformed
        // TODO add your handling code here:
        
        List<Materia> materias = new ArrayList<>();
        for(int i = 0; i < tblMaterias.getRowCount(); i++) {
            boolean seleccionado = (boolean) tblMaterias.getValueAt(i, 0);
            if (seleccionado) {
                materias.add(control.leerMateria((long) tblMaterias.getValueAt(i, 1)));
            } else {
                mostrarInformacion(this, "Selecciona al menos una materia", "Error");
                break;
            }
        }
        
        control.crearCurso(txtNombreCurso.getText(), (int) spnNumeroAulas.getValue(), materias);
        
        
         /*if (tblMaterias.getRowCount() > 0) {
            if (tblMaterias.getSelectedRow() != -1) {
                
            } else {
                mostrarInformacion(this, "Selecciona una materia por favor", "Error");
            }
        } else {
            mostrarInformacion(this, "Tabla vacia", "Error");
        }*/
           
        
    }//GEN-LAST:event_btnCrearCursoNuevoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0;
            }
            public Class<?> getColumnClass(int column) {
                // La primera columna tendrá CheckBoxes, por lo tanto tipo Boolean
                if (column == 0) {
                    return Boolean.class;
                }
                return super.getColumnClass(column);
            }
        };

        String titulos[] = {"SELECCIONAR", "ID", "MATERIA"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Materia> materias = new ArrayList<>(control.leerListMaterias());
        for (Materia materia : materias) {
            Object object[] = {false, materia.getId(), materia.getNombre()};
            modeloTabla.addRow(object);
        }
        tblMaterias.setModel(modeloTabla);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCursoNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMatricula4;
    private javax.swing.JPanel pnlPrincipalData;
    private javax.swing.JSpinner spnNumeroAulas;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
