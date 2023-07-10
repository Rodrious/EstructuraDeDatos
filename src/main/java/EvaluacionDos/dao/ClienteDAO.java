package EvaluacionDos.dao;

import EvaluacionDos.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    List<Cliente> lista = new ArrayList<>();

    public void agregar(Object ob) {
        lista.add((Cliente) ob);
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    // Condicion = 0 -> Ordena por Fecha
    // Condicion != 0 -> Ordena por nombre
    public void ordenarPorFechaONombre(int condicion) {
        mergeSortFechaNombre(0, lista.size() - 1, condicion);
    }

    private void mergeSortFechaNombre(int inicio, int fin, int condicion) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            mergeSortFechaNombre(inicio, medio, condicion);
            mergeSortFechaNombre(medio + 1, fin, condicion);
            mergeSort(inicio, medio, fin, condicion);
        }
    }

    private void mergeSort(int inicio, int medio, int fin, int condicion) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        List<Cliente> listaIzquierda = new ArrayList<>();
        List<Cliente> listaDerecha = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            listaIzquierda.add(lista.get(inicio + i));
        }
        for (int j = 0; j < n2; j++) {
            listaDerecha.add(lista.get(medio + 1 + j));
        }

        int i = 0, j = 0;
        int k = inicio;

        while (i < n1 && j < n2) {
            if (condicion == 0) {
                if (listaIzquierda.get(i).getFechNaci().compareTo(listaDerecha.get(j).getFechNaci()) <= 0) {
                    lista.set(k, listaIzquierda.get(i));
                    i++;
                } else {
                    lista.set(k, listaDerecha.get(j));
                    j++;
                }
                k++;
            } else {
                if (listaIzquierda.get(i).getNombClie().compareTo(listaDerecha.get(j).getNombClie()) <= 0) {
                    lista.set(k, listaIzquierda.get(i));
                    i++;
                } else {
                    lista.set(k, listaDerecha.get(j));
                    j++;
                }
                k++;
            }
        }

        while (i < n1) {
            lista.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            lista.set(k, listaDerecha.get(j));
            j++;
            k++;
        }
    }
}
