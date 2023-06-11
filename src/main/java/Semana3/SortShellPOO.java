package Semana3;

public class SortShellPOO {
    int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public int[]sort(){
        int n = numeros.length;
        int h=n/2;
        int i;
        while(h>0){
            for ( i = h-1; i < n; i++) {
                int B = numeros[i];
                int j=i;
                for ( j = i; (j>=h) && (numeros[j-h]>B); j-=h) {
                    numeros[j]=numeros[j-h];
                }
                numeros[j]=B;
            }
            h=h/2;
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
        SortShellPOO objSort = new SortShellPOO();
        objSort.setNumeros(numeros);
        objSort.sort();
        objSort.mostrar();
    }
}
