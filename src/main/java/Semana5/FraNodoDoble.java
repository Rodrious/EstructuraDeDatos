package Semana5;

import Semana5.dao.NodoDobleDAO;
import Semana5.dto.NodoDoble;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FraNodoDoble extends javax.swing.JFrame {
    
    //Instanciamos la clase NodoDobleDAO
    NodoDobleDAO nddao = new NodoDobleDAO();

    public FraNodoDoble() {
        initComponents();
        //Al ejecutar el programa ocultamos los botones (btnAceptar y btnCancelar)
        //y el label (lblEliminar)
        btnAceptar.setVisible(false);
        btnCancelar.setVisible(false);
        lblEliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        lblEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo.setText("Codigo :");

        lblNombre.setText("Nombre :");

        lblEdad.setText("Edad :");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 0, 51));
        lblTitulo.setText("NodoDoble");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(51, 255, 51));
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txaLista.setColumns(20);
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblEliminar.setText("Codigo Eliminar :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad)
                                    .addComponent(lblNombre)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEliminar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 51, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEliminar))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed
    
    //Funcion del boton (btnAgregar)
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Verificamos si las cajas de texto estan vacias
        if (txtCodigo.getText().equalsIgnoreCase("") && txtNombre.getText().equalsIgnoreCase("") && txtEdad.getText().equalsIgnoreCase("")) {
            //Si estan vacias se muestra el siguiente mensaje
            JOptionPane.showMessageDialog(rootPane, "Campos vacios.");
        } else {
            //Si no estan vacias se procede con instanciar la clase (NodoDoble)
            //La cual nos permitira guardar los elementos en el nodo
            NodoDoble nd = new NodoDoble();
            //Pasamos los valores
            nd.setCodigo(Integer.parseInt(txtCodigo.getText()));
            nd.setNombre(txtNombre.getText());
            nd.setEdad(Integer.parseInt(txtEdad.getText()));
            nd.setSiguiente(null);
            //Lo agregamos con el metodo de la clase (NodoDobleDAO) llamada "agregar"
            nddao.agregar(nd);
            //Mostramos un mensaje avisando que ya se agrego
            JOptionPane.showMessageDialog(rootPane, "Se agrego correctamente.");
            //Limpiamos las cajas de texto 
            limpiarCajasTexto();
            //Ponemos a disposicion el textField (txtCodigo) para que vuelvan a ingresar
            txtCodigo.requestFocus(true);
            //Por ultimo listamos todos los elementos de cada nodo
            listarNodoDoble();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    //Funcion del boton (btnEliminar)
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Llamamos al metodo activarEliminar()
        activarEliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Funcion del boton (btnAceptar)
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //Verificamos si el textField (txtCodigo)es diferente de vacio 
        if (!txtCodigo.getText().equals("")) {
            //Si cumple entonces, recibimos el codigo haciendo un parseo de texto a entero
            int codigo = Integer.parseInt(txtCodigo.getText());
            //Luego mediano un mensaje llamamos al metodo de la clase (NodoDobleDAO) llamado "eliminarPorCodigo(int codigo)"
            //El cual se le paso como parametro el codigo del nodo a eliminar
            JOptionPane.showMessageDialog(rootPane, nddao.eliminarPorCodigo(codigo));
            //Listamos los elementos del nodo ya actualizdo
            listarNodoDoble();
            //Llamaos al metodo "desactivarEliminar()"
            desactivarEliminar();
            //Limpiamos cajas de texto
            limpiarCajasTexto();
        }else{
            //Mostramos un mensaje si el textField (txtCodigo) esta vacio
            JOptionPane.showMessageDialog(rootPane, "Escriba el codigo por favor.");
            //Le regresamos el foco para que este listo para escribir
            txtCodigo.requestFocus(true);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    //Funcion del boton (btnCancelar)
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Mostramos un mensaje que sera cancelado la eliminacion
        JOptionPane.showMessageDialog(rootPane, "Cancelando...");
        //Limpiamos las cajas de texto
        limpiarCajasTexto();
        //Desacactivamos el eliminar
        desactivarEliminar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraNodoDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraNodoDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraNodoDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraNodoDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraNodoDoble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    //METODOS 
    
    //El metodo limpiarCajasTexto() vacea los contenedos para que se
    //pueda agregar mas
    public void limpiarCajasTexto() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
    }

    //El metodo listarNodoDoble() trae todos los elementos de los nodos
    //para ser mostrados al usuario
    public void listarNodoDoble() {
        txaLista.setText(nddao.leer());
        txaLista.setEditable(false);
        txaLista.setForeground(Color.red);
    }
    
    //El metodo activarEliminar() sirve para desactivar y activar botones y label
    //para el proceso de eliminacion
    public void activarEliminar(){
        btnAgregar.setVisible(false);
        btnEliminar.setVisible(false);
        btnAceptar.setVisible(true);
        btnCancelar.setVisible(true);
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        lblCodigo.setVisible(false);
        lblEliminar.setVisible(true);
    }
    
    //El metodo desactivarEliminar() sirve para desactivar y activar botones y label
    //para el proceso de cancelar la eliminacion
    public void desactivarEliminar(){
        btnAgregar.setVisible(true);
        btnEliminar.setVisible(true);
        btnAceptar.setVisible(false);
        btnCancelar.setVisible(false);
        txtNombre.setEnabled(true);
        txtEdad.setEnabled(true);
        lblCodigo.setVisible(true);
        lblEliminar.setVisible(false);
    }
}
