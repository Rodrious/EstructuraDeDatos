 package Semana3;

public class SortShell {
    public static void main(String[] args) {
        int[] numeros = {80, 25, 70, 2, 9};
        int n = numeros.length;
        shellSort(numeros,n);
        //Mostramos en consola
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]+"\t");
        }
        
    }
    public static void shellSort(int a[], int n){
        int h=n/2;
        int i;
        while(h>0){
            for ( i = h-1; i < n; i++) {
                int B = a[i];
                int j=i;
                for ( j = i; (j>=h) && (a[j-h]>B); j-=h) {
                    a[j]=a[j-h]; 
                }
                a[j]=B;
            }
            h=h/2;
        }
        
    }
}
