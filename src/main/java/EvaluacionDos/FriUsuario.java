package EvaluacionDos;

import EvaluacionDos.dao.UsuarioDAO;
import EvaluacionDos.dto.Usuario;
import javax.swing.JOptionPane;

public class FriUsuario extends javax.swing.JInternalFrame {

    UsuarioDAO usudao =  new UsuarioDAO();
    int ubic =-1;
    
    public FriUsuario() {
        initComponents();
        usudao.agregar(new Usuario(1, "marcos", "1234"));
        usudao.agregar(new Usuario(2, "maria", "567"));
        usudao.agregar(new Usuario(3, "jose", "789"));
        usudao.agregar(new Usuario(4, "ana", "1209"));
        usudao.agregar(new Usuario(5, "rosa", "0743"));
        ubic=0;
        mostrarDatos();
    }
    
    public void mostrarDatos(){
        if (ubic!=-1) {
            Usuario usu = usudao.getLista().get(ubic);
            txtCodigo.setText(usu.getCodiUsua()+"");
            txtUsuario.setText(usu.getUsuaUsua());
            txtClave.setText(usu.getClavUsua());
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay datos aun.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Usuarios");

        lblCodigo.setText("Codigo :");

        lblUsuario.setText("Usuario : ");

        lblClave.setText("Clave :");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnOrdenar.setBackground(new java.awt.Color(255, 153, 153));
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClave)
                            .addComponent(lblUsuario)
                            .addComponent(lblCodigo))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(txtClave))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnRetroceder)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (ubic!=0) {
            ubic=0;
            mostrarDatos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ya esta en el inicio.");
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        if (ubic!=0) {
            ubic--;
            mostrarDatos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No puede retroceder por que ya esta en el inicio.");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (ubic!=usudao.getLista().size()-1) {
            ubic++;
            mostrarDatos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No puede avanzar por que ya esta en el ultimo.");
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (ubic!=usudao.getLista().size()-1) {
            ubic=usudao.getLista().size()-1;
            mostrarDatos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ya esta en el ultimo.");
        }       
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario = JOptionPane.showInputDialog("Ingrese el usuario a buscar : ");
        Usuario usu = usudao.busquedaBinaria(usuario);
        if (usu!=null) {
            JOptionPane.showMessageDialog(rootPane,
                    "USUARIO ENCONTRADO\nUsuario : ["+usuario+"]\nClave : ["+usu.getClavUsua()+"]");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se encontro ningun usuario.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        usudao.ordenarPorUsuaUsua();
        ubic=0;
        mostrarDatos();
        JOptionPane.showMessageDialog(rootPane, "Ordenado correctamente");
    }//GEN-LAST:event_btnOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
