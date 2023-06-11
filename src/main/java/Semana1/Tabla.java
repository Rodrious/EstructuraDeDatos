package Semana1;

import javax.swing.JOptionPane;

public class Tabla {
    public static void main(String[] args) throws Exception {
        int v[][] = new int [3][5];
        leer(v);
        visualizar(v);
    }
    static void leer(int a[][]) throws Exception{
        int i, j;
        System.out.println("Entrada de datos de la tabla: ");
        for (i = 0; i < a.length; i++) {
            System.out.println("Fila " + i);
            for ( j = 0; j < a[i].length; j++) {
                String valor = JOptionPane.showInputDialog("Ingrese valor: ");
                a[i][j] = Integer.parseInt(valor);
            }
        }
    }
    
    static void visualizar(int a[][]){
        int i,j;
        System.out.println("\n\t Matriz leida\n");
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
