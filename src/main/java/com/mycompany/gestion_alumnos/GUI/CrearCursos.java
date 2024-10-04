package com.mycompany.gestion_alumnos.GUI;

import com.mycompany.gestion_alumnos.LOGICA.Controladora;
import com.mycompany.gestion_alumnos.LOGICA.Materia;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Frame-Code
 */
public class CrearCursos extends javax.swing.JFrame implements Mensajes, ModeloTabla {

    private Controladora control;
    private RegistrarConsultarCursos panelInicial;
    private int asientosPorAula[];
    private final SpinnerNumberModel modeloSpinner = new SpinnerNumberModel(1,1,8,1);

    public CrearCursos() {
        initComponents();
    }

    public CrearCursos(Controladora control, RegistrarConsultarCursos panelInicial) {
        this.control = control;
        this.panelInicial = panelInicial;
        this.initComponents();
        if(!control.leerListMaterias().isEmpty()) {
            cargarTabla();
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

        pnlPrincipalData = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        spnNumeroAulas = new javax.swing.JSpinner(modeloSpinner);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRellenarAsientos = new javax.swing.JButton();
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
        txtNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCursoActionPerformed(evt);
            }
        });

        spnNumeroAulas.setBorder(null);
        spnNumeroAulas.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 23, 23));
        jLabel5.setText("Numero de Aulas que tiene:");

        jLabel6.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 23, 23));
        jLabel6.setText("Asientos por Aula");

        btnRellenarAsientos.setBackground(new java.awt.Color(63, 72, 100));
        btnRellenarAsientos.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        btnRellenarAsientos.setForeground(new java.awt.Color(255, 255, 255));
        btnRellenarAsientos.setText("Rellenar");
        btnRellenarAsientos.setBorder(null);
        btnRellenarAsientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRellenarAsientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRellenarAsientosMouseExited(evt);
            }
        });
        btnRellenarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarAsientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(spnNumeroAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRellenarAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCurso)
                    .addComponent(spnNumeroAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRellenarAsientos))
                .addGap(17, 17, 17))
        );

        jPanel5.setBackground(new java.awt.Color(180, 180, 180));

        tblMaterias.setBackground(new java.awt.Color(180, 180, 180));
        tblMaterias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 23, 23), 1, true));
        tblMaterias.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
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
        btnCrearCursoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCursoNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCursoNuevoMouseExited(evt);
            }
        });
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
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setForeground(new java.awt.Color(99, 99, 99));
        jLabel17.setText("_____________________________________Informacion del curso________________________________________");

        javax.swing.GroupLayout pnlPrincipalDataLayout = new javax.swing.GroupLayout(pnlPrincipalData);
        pnlPrincipalData.setLayout(pnlPrincipalDataLayout);
        pnlPrincipalDataLayout.setHorizontalGroup(
            pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2))
                    .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlPrincipalDataLayout.setVerticalGroup(
            pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDataLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
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

        for (int i = 0; i < tblMaterias.getRowCount(); i++) {
            boolean seleccionado = (boolean) tblMaterias.getValueAt(i, 0);
            if (seleccionado) {
                materias.add(control.leerMateria((long) tblMaterias.getValueAt(i, 1)));
            }
        }
        if (materias.isEmpty()) {
            mostrarInformacion(this, "Selecciona al menos una materia", "Error");
        } else {
            if (verificarCantidadAsientos(asientosPorAula) && control.verificarNombreDisponible(txtNombreCurso.getText())) {
                control.crearCurso(txtNombreCurso.getText(), (int) spnNumeroAulas.getValue(), asientosPorAula, materias);
                mostrarInformacion(this, "Curso creado correctamente", "Crear curso");
                reiniciarDatos();
            } else {
                mostrarInformacion(this, "Registre la cantidad de asientos por Aula", "Error");
            }
        }
    }//GEN-LAST:event_btnCrearCursoNuevoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        panelInicial.recargarDatos();

    }//GEN-LAST:event_btnRegresarActionPerformed

    @Override
    public void dispose() {
        super.dispose();
        panelInicial.recargarDatos();
    }

    private void btnRellenarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarAsientosActionPerformed
        // TODO add your handling code here:
        if (txtNombreCurso.getText().equals("")) {
            mostrarInformacion(this, "Escribe el nombre del curso", "Error");
        } else {
            if (control.verificarNombreDisponible(txtNombreCurso.getText())) {
                String respuestaString;
                asientosPorAula = new int[(int) spnNumeroAulas.getValue()];
                char letraAula = 'A';
                for (int i = 0; i < asientosPorAula.length; i++) {
                    respuestaString = obtenerInformacion(this,
                            "Escribe la cantidad de asientos que tiene el aula '" + txtNombreCurso.getText() + " " + letraAula + "'", "Registrar cantidad de asientos por aula");
                    if (respuestaString.equals(CANCELADO)) {
                        break;
                    } else {
                        if (!respuestaString.equals("")) {
                            try {
                                Integer.valueOf(respuestaString);
                                if (Integer.parseInt(respuestaString) != 0) {
                                    asientosPorAula[i] = Integer.parseInt(respuestaString);
                                    letraAula++;
                                } else {
                                    mostrarInformacion(this, "No pueden haber aulas sin asientos", "Error");
                                    i--;
                                }
                            } catch (NumberFormatException e) {
                                mostrarInformacion(this, "Solo se admiten numeros", "Error");
                                i--;
                            }
                        } else {
                            mostrarInformacion(this, "No pueden haber nombres vacios", "error");
                            i--;
                        }
                    }
                    if (verificarCantidadAsientos(asientosPorAula)) {
                        mostrarInformacion(this, "Valores obtenidos correctamente, escoga las materias y cree un nuevo curso!", "Exito");
                    }
                }
            } else {
                mostrarInformacion(this, "El nombre de curso ya existe", "Error");
            }

        }
    }//GEN-LAST:event_btnRellenarAsientosActionPerformed

    private void txtNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCursoActionPerformed

    private void btnRellenarAsientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRellenarAsientosMouseEntered
        // TODO add your handling code here:
        btnRellenarAsientos.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnRellenarAsientosMouseEntered

    private void btnRellenarAsientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRellenarAsientosMouseExited
        // TODO add your handling code here:
        btnRellenarAsientos.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnRellenarAsientosMouseExited

    private void btnCrearCursoNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCursoNuevoMouseEntered
        // TODO add your handling code here:
        btnCrearCursoNuevo.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnCrearCursoNuevoMouseEntered

    private void btnCrearCursoNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCursoNuevoMouseExited
        // TODO add your handling code here:
        btnCrearCursoNuevo.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnCrearCursoNuevoMouseExited

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color(78, 90, 126));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new Color(63, 72, 100));
    }//GEN-LAST:event_btnRegresarMouseExited

    private boolean verificarCantidadAsientos(int cantidadAsientos[]) {
        //Verificar si la cantidad de asientos por cada aula es distinta de 0 para mostrar mensaje de que se obtuvieron valores correctamente
        int contador;
        for (contador = 0; contador < cantidadAsientos.length; contador++) {
            if (cantidadAsientos[contador] == 0) {
                break;
            }
        }
        //Si el contador es igual al largo del vector significa que cada elemento del vector es distinto de cero lo cual es correcto
        return contador == cantidadAsientos.length;
    }

    private void reiniciarDatos() {
        cargarTabla();
        txtNombreCurso.setText("");
        spnNumeroAulas.setModel(modeloSpinner);
        for (int i = 0; i < asientosPorAula.length; i++) {
            asientosPorAula[i] = 0;
        }
    }

    private void cargarTabla() {
        tblMaterias.setModel(obtenerModeloTablaMateriasSeleccion(new String[]{"SELECCIONAR", "ID", "MATERIA"}, control.leerListMaterias()));
        tblMaterias.setRowHeight(20);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCursoNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRellenarAsientos;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
