/*3. Dado un array de números de 5 posiciones con los
siguiente valores {1,2,3,4,5}, guardar los valores de
este array en otro array distinto pero con los valores
invertidos, es decir, que el segundo array debera tener
los valores {5,4,3,2,1}.*/
package Semana1;

public class Ejercicio03 {
    public static void main(String[] args) {
        int []item={1,2,3,4,5};
        System.out.println("Posicion Actual");
        for (int i = 0; i < item.length; i++) {
            System.out.print(item[i]+" ");
        }
        System.out.println("");
        System.out.println("Posicion Invertida");
        for (int j = item.length-1; j >= 0; j--) {
            System.out.print(item[j]+" ");
        }
    }
}
