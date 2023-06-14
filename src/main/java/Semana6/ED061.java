package Semana6;

import Semana6.util.Ordenamiento;

public class ED061 {
    public static void main(String[] args) {
        int arr [] = {5,26,12,6,1,4,7};
        int n = arr.length;

        System.out.println("Array original:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        Ordenamiento.sort(arr,0,n-1);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    
    }
}
