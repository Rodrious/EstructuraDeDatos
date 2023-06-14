package Semana6.util;

public class Ordenamiento {

    //Metodo de ordenamiento por quickSort
    public static void quickSort(int vec[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int pivote = vec[inicio];
        int elemIzq = inicio + 1;
        int elemDer = fin;

        while (elemIzq <= elemDer) {
            while (elemIzq <= fin && vec[elemIzq] < pivote) {
                elemIzq++;
            }
            while (elemDer > inicio && vec[elemDer] >= pivote) {
                elemDer--;
            }
            if (elemIzq < elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
        }
        if (elemDer > inicio) {
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }
        quickSort(vec, inicio, elemDer - 1);
        quickSort(vec, elemDer + 1, fin);
    }

    public static void ordenacionRapida(int vec[]) {
        final int N = vec.length;
        quickSort(vec, 0, N - 1);
    }

    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i] + " ");
        }
    }

    //Metodo de ordenamiento por MergeSort
    public static void sort(int array[], int izq, int der) {
        if (izq < der) {
            //Aqui encontramos el punto medio del arreglo 
            int medio = (izq + der) / 2;
            //Implementamos recursividad
            sort(array, izq, medio);
            sort(array, medio + 1, der);

            merge(array, izq, medio, der);
        }
    }

    public static void merge(int array[], int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;

        int izqArray[] = new int[n1];
        int derArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            izqArray[i] = array[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derArray[j] = array[medio + j + 1];
        }

        int i = 0, j = 0;
        int k = izq;

        while (i < n1 && j < n2) {
            if (izqArray[i] <= derArray[j]) {
                array[k] = izqArray[i];
                i++;
            } else {
                array[k] = derArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = izqArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = derArray[j];
            j++;
            k++;
        }
    }

}
