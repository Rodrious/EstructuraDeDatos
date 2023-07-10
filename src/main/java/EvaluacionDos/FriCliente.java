package EvaluacionDos;

import EvaluacionDos.dao.ClienteDAO;
import EvaluacionDos.dto.Cliente;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FriCliente extends javax.swing.JInternalFrame {

    ClienteDAO clidao = new ClienteDAO();
    int ubic = -1;

    public FriCliente() {
        initComponents();

        clidao.agregar(new Cliente("7387", "Cadillo", "Carreño", "Rodrigo", new Date(2003-1900, 11, 27)));
        clidao.agregar(new Cliente("7385", "Juarez", "Arevalo", "Jair", new Date(2004-1900, 11, 12)));
        clidao.agregar(new Cliente("7390", "Campos", "Correa", "Tair", new Date(2006-1900, 5, 15)));
        clidao.agregar(new Cliente("7312", "Perez", "Mayta", "Marcos", new Date(2000-1900, 9, 10)));
        clidao.agregar(new Cliente("7345", "Carbajal", "Jara", "Ana", new Date(2001-1900, 2, 27)));
        ubic = 0;
        mostrarDatos();
    }

    public void mostrarDatos() {
        if (ubic != -1) {
            Cliente cli = clidao.getLista().get(ubic);
            txtDNI.setText(cli.getNdniClie());
            txtApPaterno.setText(cli.getAppaClie());
            txtApMaterno.setText(cli.getApmaClie());
            txtNombres.setText(cli.getNombClie());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = dateFormat.format(cli.getFechNaci());
            txtFecha.setText(fechaNacimiento);
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay datos aun.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDNI = new javax.swing.JLabel();
        lblApPaterno = new javax.swing.JLabel();
        lblApMaterno = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnOrdenarPorFecha = new javax.swing.JButton();
        btnOrdenarPorNombre = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Clientes");

        lblDNI.setText("DNI :");

        lblApPaterno.setText("Ap. Paterno :");

        lblApMaterno.setText("Ap. Materno :");

        lblNombres.setText("Nombres :");

        lblFecha.setText("Fecha Nacimiento :");

        btnOrdenarPorFecha.setBackground(new java.awt.Color(255, 102, 102));
        btnOrdenarPorFecha.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarPorFecha.setText("OrdenarPorFecha");
        btnOrdenarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPorFechaActionPerformed(evt);
            }
        });

        btnOrdenarPorNombre.setBackground(new java.awt.Color(255, 102, 102));
        btnOrdenarPorNombre.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarPorNombre.setText("OrdenarPorNombre");
        btnOrdenarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPorNombreActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(153, 255, 255));
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("|<");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnRetroceder.setBackground(new java.awt.Color(102, 255, 102));
        btnRetroceder.setForeground(new java.awt.Color(0, 0, 0));
        btnRetroceder.setText("<");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(102, 255, 102));
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(153, 255, 255));
        btnUltimo.setForeground(new java.awt.Color(0, 0, 0));
        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDNI)
                            .addComponent(txtApPaterno)
                            .addComponent(txtApMaterno)
                            .addComponent(txtNombres)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrdenarPorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrdenarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdenarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApPaterno)
                            .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOrdenarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApMaterno)
                    .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnRetroceder)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (ubic != 0) {
            ubic = 0;
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ya esta en el inicio.");
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        if (ubic != 0) {
            ubic--;
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No puede retroceder por que ya esta en el inicio.");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (ubic != clidao.getLista().size() - 1) {
            ubic++;
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No puede avanzar por que ya esta en el ultimo.");
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (ubic != clidao.getLista().size() - 1) {
            ubic = clidao.getLista().size() - 1;
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ya esta en el ultimo.");
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnOrdenarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPorNombreActionPerformed
        clidao.ordenarPorFechaONombre(1);
        ubic=0;
        mostrarDatos();
        JOptionPane.showMessageDialog(rootPane, "Se ordeno correctamente.");
    }//GEN-LAST:event_btnOrdenarPorNombreActionPerformed

    private void btnOrdenarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPorFechaActionPerformed
        clidao.ordenarPorFechaONombre(0);
        ubic=0;
        mostrarDatos();
        JOptionPane.showMessageDialog(rootPane, "Se ordeno correctamente.");
    }//GEN-LAST:event_btnOrdenarPorFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnOrdenarPorFecha;
    private javax.swing.JButton btnOrdenarPorNombre;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
