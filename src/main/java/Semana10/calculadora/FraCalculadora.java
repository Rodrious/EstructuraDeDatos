package Semana10.calculadora;

import java.util.Stack;
import javax.swing.JOptionPane;

public class FraCalculadora extends javax.swing.JFrame {

    public FraCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExpresion = new javax.swing.JTextField();
        lblExpresion = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblExpresion.setText("Expresión :");

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoConvertir(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblExpresion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvertir)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpresion)
                    .addComponent(btnConvertir))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventoConvertir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoConvertir
        String expresion = txtExpresion.getText();
        String expresionFinal = "";
        Stack<Character> pilaFinal = InfijoAPrefijo(expresion);
        while (!pilaFinal.empty()) {            
            expresionFinal+=pilaFinal.pop().toString();
        }
        JOptionPane.showMessageDialog(null,expresionFinal);
    }//GEN-LAST:event_eventoConvertir

    public static Stack<Character> InfijoAPrefijo(String infijo) {
        infijo = '(' + infijo;
        int tamanio = infijo.length();
        Stack<Character> PilaDefinitiva = new Stack<>();
        Stack<Character> PilaTemp = new Stack<>();
        PilaTemp.push(')');
        for (int i = tamanio - 1; i > -1; i--) {
            char caracter = infijo.charAt(i);
            switch (caracter) {
                case ')':
                    PilaTemp.push(caracter);
                    break;
                case '+':
                case '-':
                case '^':
                case '*':
                case '/':
                    while (Jerarquia(caracter) > Jerarquia(PilaTemp.peek())) {
                        PilaDefinitiva.push(PilaTemp.pop());
                    }
                    PilaTemp.push(caracter);
                    break;
                case '(':
                    while (PilaTemp.peek()!= ')') {
                        PilaDefinitiva.push(PilaTemp.pop());
                    }
                    PilaTemp.pop();
                    break;
                default:
                    PilaDefinitiva.push(caracter);
            }
        }
        return PilaDefinitiva;
    }

    public static int Jerarquia(char elemento) {
        int res = 0;
        switch (elemento) {
            case ')':
                res = 5;
                break;
            case '^':
                res = 4;
                break;
            case '*':
            case '/':
                res = 3;
                break;
            case '+':
            case '-':
                res = 2;
                break;
            case '(':
                res = 1;
                break;
        }
        return res;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FraCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel lblExpresion;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables
}
