package EvaluacionDemo.gui;

import EvaluacionDemo.dao.PersonaJpaController;
import EvaluacionDemo.dto.Persona;
import java.util.List;
import javax.swing.JOptionPane;

public class FraPrincipal extends javax.swing.JFrame {

    DlgInicio dlg = new DlgInicio(this, rootPaneCheckingEnabled);

    public FraPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        dlg.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTablas = new javax.swing.JMenu();
        mniPersonas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniNuevo = new javax.swing.JMenuItem();
        mniEditar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        mnuTablas.setText("Tablas");

        mniPersonas.setText("Listar");
        mniPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPersonasActionPerformed(evt);
            }
        });
        mnuTablas.add(mniPersonas);
        mnuTablas.add(jSeparator1);

        mniNuevo.setText("Nuevo");
        mniNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoActionPerformed(evt);
            }
        });
        mnuTablas.add(mniNuevo);

        mniEditar.setText("Editar");
        mniEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarActionPerformed(evt);
            }
        });
        mnuTablas.add(mniEditar);

        jMenuBar1.add(mnuTablas);

        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

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

    private void mniNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoActionPerformed
        FrmNuevo fnuevo = new FrmNuevo();
        jDesktopPane1.add(fnuevo);
        fnuevo.setVisible(true);
    }//GEN-LAST:event_mniNuevoActionPerformed

    private void mniEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarActionPerformed
        FrmEditar feditar = new FrmEditar();
        jDesktopPane1.add(feditar);
        feditar.setVisible(true);
    }//GEN-LAST:event_mniEditarActionPerformed

    private void mniPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPersonasActionPerformed
        PersonaJpaController perDAO = new PersonaJpaController();
        List<Persona> lista = perDAO.findPersonaEntities();
        String resultado = "|-----APELLIDO-----|-----NOMBRE-----|-----N°-DNI-----|\n";
        for (Persona persona : lista) {
            resultado += persona.getApelPers() + " | " + persona.getNombPers() + " | " + persona.getNdniPers() + " |\n";
        }
        JOptionPane.showMessageDialog(rootPane, resultado);
    }//GEN-LAST:event_mniPersonasActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnuSalirMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mniEditar;
    private javax.swing.JMenuItem mniNuevo;
    private javax.swing.JMenuItem mniPersonas;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuTablas;
    // End of variables declaration//GEN-END:variables
}
