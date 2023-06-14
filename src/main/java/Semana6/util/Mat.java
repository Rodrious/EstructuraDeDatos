package Semana6.util;

public class Mat {

    //Funcion factorial
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    //Funcion suma
    public static long suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return suma(n - 1) + n;
        }
    }

    //Funcion producto de dos numero enteros
    public static int producto(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + producto(a, b - 1);
        } else {
            return -producto(a, -b);
        }
    }

    //Funcion para calcular el maximo comun divisor
    public static int maxComunDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return maxComunDivisor(b, a % b);
        }
    }

    //Funcion para encontrar el maximo valor de un arreglo
    public static int encontrarMaximo(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxAnterior = encontrarMaximo(arr, n - 1);
        int elementoActual = arr[n - 1];

        return Math.max(maxAnterior, elementoActual);
    }

}
