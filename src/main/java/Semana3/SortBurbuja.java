package Semana3;

public class SortBurbuja {
    
    
    public static void main(String[] args) {
        int[] numeros = {80, 25, 70, 2, 9};
        int n = numeros.length, aux;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] < numeros[j]) { //De mayor a menor '<' y de menor a mayor '>'
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        //Mostramos en consola
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]+"\t");
        }
    }
}
