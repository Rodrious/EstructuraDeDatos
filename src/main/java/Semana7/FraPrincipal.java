package Semana7;

public class FraPrincipal extends javax.swing.JFrame {
    
    public FraPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTablas = new javax.swing.JMenu();
        mniAlu = new javax.swing.JMenuItem();
        mniDocente = new javax.swing.JMenuItem();
        mniUsuario = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Matricula");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        mnuTablas.setText("Tablas");

        mniAlu.setText("Alumno");
        mniAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAluActionPerformed(evt);
            }
        });
        mnuTablas.add(mniAlu);

        mniDocente.setText("Docente");
        mniDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteActionPerformed(evt);
            }
        });
        mnuTablas.add(mniDocente);

        mniUsuario.setText("Usuario");
        mniUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuarioActionPerformed(evt);
            }
        });
        mnuTablas.add(mniUsuario);

        jMenuBar1.add(mnuTablas);

        mnuAyuda.setText("Ayuda");
        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAluActionPerformed
        friAlumno f =  new friAlumno();
        this.jDesktopPane1.add(f);
        f.setVisible(true);
        
    }//GEN-LAST:event_mniAluActionPerformed

    private void mniDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteActionPerformed
        friDocente fd =  new friDocente();
        this.jDesktopPane1.add(fd);
        fd.setVisible(true);
    }//GEN-LAST:event_mniDocenteActionPerformed

    private void mniUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsuarioActionPerformed
        friUsuario fu =  new friUsuario();
        this.jDesktopPane1.add(fu);
        fu.setVisible(true);
    }//GEN-LAST:event_mniUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAlu;
    private javax.swing.JMenuItem mniDocente;
    private javax.swing.JMenuItem mniUsuario;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuTablas;
    // End of variables declaration//GEN-END:variables
}
