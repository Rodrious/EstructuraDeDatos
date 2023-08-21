package EvaluacionDemo.gui;

import EvaluacionDemo.dao.PersonaJpaController;
import EvaluacionDemo.dto.Persona;
import javax.swing.JOptionPane;

public class FrmEditar extends javax.swing.JInternalFrame {

    public FrmEditar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblApellido = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtNdni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblNdni = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Editar Persona");

        lblApellido.setText("APELLIDO :");

        lblNombres.setText("NOMBRES :");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblNdni.setText("N° DNI :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNdni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNdni)
                    .addComponent(txtApellido)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNdni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombres))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Persona p = new Persona();

        p.setNdniPers(txtNdni.getText());
        p.setApelPers(txtApellido.getText());
        p.setNombPers(txtNombres.getText());

        PersonaJpaController perDAO = new PersonaJpaController();
        try{
            perDAO.edit(p);
            JOptionPane.showMessageDialog(rootPane, "Se actualizo correctamente");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblNdni;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNdni;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
