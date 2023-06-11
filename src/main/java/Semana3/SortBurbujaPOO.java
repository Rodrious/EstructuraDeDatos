package Semana3;

public class SortBurbujaPOO {

    int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] sort() {
        int n = numeros.length, aux;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] > numeros[j]) { //De mayor a menor '<' y de menor a mayor '>'
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }

    public void mostrar() {
        int n = numeros.length;
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int numeros[] = {80, 25, 70, 2, 9};
        SortBurbujaPOO objSort = new SortBurbujaPOO();
        objSort.setNumeros(numeros);
        objSort.sort();
        objSort.mostrar();

        int numeros2[] = {4, 1, 78, 23, 2};
        
    }
}
