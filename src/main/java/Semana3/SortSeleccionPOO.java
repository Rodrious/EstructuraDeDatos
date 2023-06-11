
package Semana3;

public class SortSeleccionPOO {
    int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public int[]sort(){
        int n=numeros.length;
        int imin, aux;
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
        SortSeleccionPOO objSort =  new SortSeleccionPOO();
        objSort.setNumeros(numeros);
        objSort.sort();
        objSort.mostrar();
        
    }
}
