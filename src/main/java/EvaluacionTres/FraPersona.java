package EvaluacionTres;

import EvaluacionTres.dao.PersonaDAO;
import EvaluacionTres.dto.Persona;
import javax.swing.JOptionPane;

public class FraPersona extends javax.swing.JFrame {

    PersonaDAO perdao =  new PersonaDAO();
    
    public FraPersona() {
        initComponents();
        this.setLocationRelativeTo(null);
        txaListado.setEditable(false);
        perdao.agregar(new Persona(1, "CARLOS", "MASCULINO"));
        perdao.agregar(new Persona(2, "LUIS", "MASCULINO"));
        perdao.agregar(new Persona(3, "MARIA", "FEMENINO"));
        perdao.agregar(new Persona(4, "ROXANA", "FEMENINO"));
        perdao.agregar(new Persona(5, "RODOLFO", "MASCULINO"));
        perdao.agregar(new Persona(6, "VALENTINA", "NO BINARIO"));
        perdao.agregar(new Persona(7, "KIKE", "MASCULINO"));
        perdao.agregar(new Persona(8, "SHAKIRA", "FEMENINO"));
        perdao.agregar(new Persona(9, "PIKE", "NO BINARIO"));
        txaListado.setText(perdao.listar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaListado = new javax.swing.JTextArea();
        btnOrdenar = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(255, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("LISTADO DE PILA (PERSONA)");

        txaListado.setColumns(20);
        txaListado.setRows(5);
        jScrollPane1.setViewportView(txaListado);

        btnOrdenar.setBackground(new java.awt.Color(102, 255, 102));
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnGenerarPDF.setBackground(new java.awt.Color(255, 0, 0));
        btnGenerarPDF.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarPDF.setText("PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addGap(73, 73, 73)
                .addComponent(btnOrdenar)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btnOrdenar)
                    .addComponent(btnGenerarPDF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        perdao.ordenarPorGenero();
        txaListado.setText(perdao.listar());
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        String nombrePDF =  JOptionPane.showInputDialog("Escriba el nombre del archivo: ");
        nombrePDF+=".pdf";
        perdao.generarReportePDF(nombrePDF);
        JOptionPane.showMessageDialog(rootPane, "PDF Generado con nombre -> '"+nombrePDF+"' <- ");
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaListado;
    // End of variables declaration//GEN-END:variables
}
