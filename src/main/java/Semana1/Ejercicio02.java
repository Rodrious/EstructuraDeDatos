/*2. Crea un array de números de 100 posiciones, que
contendrá los números del 1 al 100. Obtén la suma de
todos ellos y la media.*/
package Semana1;

public class Ejercicio02 {
    public static void main(String[] args) {
        int [] array = new int [100];
        int suma=0;
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i]=j;
            suma = suma + array[i];
        }
        //Calculamos la media
        double media;
        media = suma / array.length;
        System.out.println("La suma es : "+suma);
        System.out.println("La media es : "+media);
    }
}
