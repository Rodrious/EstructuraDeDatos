/*1. Crea un array de números donde le indicamos por teclado
el tamaño del array, rellenaremos el array con números
aleatorios entre 0 y 9, al final muestra por pantalla el
valor de cada posición y la suma de todos los valores.*/
package Semana1;

//import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        //Random ran =  new Random();
        int tamaño = 0;
        int suma = 0;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del Array :"));
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            //array[i]=ran.nextInt(10); 
            array[i]=(int)(Math.random()*10);
            suma= suma + array[i];
            System.out.println("Posición ["+i+"] : "+array[i]);
        }
        //Mostrar por pantalla
        System.out.println("\tSUMA DE TODOS LOS VALORES");
        System.out.println("================================================");
        System.out.println("Suma: \t"+suma);
    }
}
