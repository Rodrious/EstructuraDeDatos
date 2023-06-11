package Semana1;

import javax.swing.JOptionPane;

public class ED001 {

    public static void main(String[] args) {
        float[] notas = new float[5];

        int[] item = {1, 2, 3, 4, 5};

        String notasCadena;
        //Ingresamos valores
        for (int i = 0; i < 5; i++) {
            notasCadena = JOptionPane.showInputDialog("Ingrese nota " + (i + 1) + " : ");
            notas[i] = Float.parseFloat(notasCadena);
        }
        //Visualizamos valores
        System.out.println("N° \t Nota");
        System.out.println("=========================");
        for (int i = 0; i < 5; i++) {
            System.out.println(item[i] + "\t" + notas[i]);
        }
    }
}
