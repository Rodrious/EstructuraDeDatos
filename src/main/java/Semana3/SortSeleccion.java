package Semana3;

public class SortSeleccion {
    public static void main(String[] args) {
        int[] numeros = {80, 25, 70, 2, 9};
        int n = numeros.length, aux, imin;
        for (int i = 0; i < n; i++) {
            imin=i;
            for (int j = i+1; j < n; j++) {
                if (numeros[j]<numeros[imin]) {
                    imin=j;
                }
            }
            aux=numeros[i];
            numeros[i]=numeros[imin];
            numeros[imin]=aux;
        }
        //Mostramos en consola
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]+"\t");
        }
    }
}
