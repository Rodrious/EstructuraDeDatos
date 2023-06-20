package Semana7;

import Semana7.dao.UsuarioDAO;
import Semana7.dto.Usuario;
import javax.swing.JOptionPane;

public class friUsuario extends javax.swing.JInternalFrame {

    UsuarioDAO usuDAO = new UsuarioDAO();
    int r = 0;

    public friUsuario() {
        initComponents();
        usuDAO.agregar(new Usuario(1, "Carlos"));
        usuDAO.agregar(new Usuario(2, "Juan"));
        usuDAO.agregar(new Usuario(3, "Luis"));
        usuDAO.agregar(new Usuario(4, "Jair"));
        usuDAO.agregar(new Usuario(5, "Rodrigo"));
        mostrarDatos();
    }

    private void mostrarDatos() {
        Usuario actual = usuDAO.mostrarUsuario();
        txtCodigo.setText(actual.getCodigo() + "");
        txtNombre.setText(actual.getNombres());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscarBin = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gestion de Usuario");

        lblCodigo.setText("Codigo :");

        lblNombre.setText("Nombre :");

        btnPrimero.setBackground(new java.awt.Color(0, 255, 204));
        btnPrimero.setForeground(new java.awt.Color(0, 0, 0));
        btnPrimero.setText("Primero");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(153, 255, 153));
        btnAnterior.setForeground(new java.awt.Color(0, 0, 0));
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(0, 255, 204));
        btnUltimo.setForeground(new java.awt.Color(0, 0, 0));
        btnUltimo.setText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 204, 102));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscarBin.setBackground(new java.awt.Color(255, 255, 153));
        btnBuscarBin.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarBin.setText("Buscar2");
        btnBuscarBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrimero)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodigo)
                        .addComponent(lblNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnAgregar)
                            .addComponent(btnBuscarBin))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarBin)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (usuDAO.getUbicacion() == usuDAO.getLista().size() - 1) {
            JOptionPane.showMessageDialog(rootPane, "Estas en el final");
        } else {
            usuDAO.avanzar();
            mostrarDatos();
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (usuDAO.getUbicacion() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Estas en el inicio");
        } else {
            usuDAO.retroceder();
            mostrarDatos();
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if (usuDAO.getUbicacion() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ya estas en el primero.");
        } else {
            usuDAO.inicio();
            mostrarDatos();
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (usuDAO.getUbicacion() == usuDAO.getLista().size() - 1) {
            JOptionPane.showMessageDialog(rootPane, "Ya estas en el ultimo.");
        } else {
            usuDAO.fin();
            mostrarDatos();
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre para buscar :");
        boolean encontrado = false;
        int n = 0;
        for (Usuario usu : usuDAO.getLista()) {
            if (usu.getNombres().equalsIgnoreCase(nombreBuscar)) {
                JOptionPane.showMessageDialog(rootPane, "Se encontro con codigo " + usu.getCodigo());
                usuDAO.setUbicacion(n);
                mostrarDatos();
                encontrado = true;
                break;
            }
            n++;
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(rootPane, "Disculpe, no se encontro.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (r == 0) {
            limpiarCampos();
            r = 1;
        } else {
            txtCodigo.requestFocus();
            if ((!txtCodigo.getText().equals("")) && (!txtNombre.getText().equals(""))) {
                int cod = Integer.parseInt(txtCodigo.getText());
                boolean encontrado = usuDAO.evitarCodigo(cod);
                if (!encontrado) {
                    Usuario temp = new Usuario(cod, txtNombre.getText());
                    usuDAO.agregar(temp);
                    JOptionPane.showMessageDialog(rootPane, "Se agrego con exito.");
                    r = 0;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El codigo ingresado ya esta registrado.");
                    txtCodigo.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campos vacios.");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBinActionPerformed
        int codiBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a buscar :"));
        int busqueda = usuDAO.busquedaBinaria(codiBuscar);
        if (busqueda >= 0) {
            JOptionPane.showMessageDialog(rootPane, "Se encontro con exito");
            usuDAO.setUbicacion(busqueda);
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sin exito al buscar.");
        }
    }//GEN-LAST:event_btnBuscarBinActionPerformed

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarBin;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
