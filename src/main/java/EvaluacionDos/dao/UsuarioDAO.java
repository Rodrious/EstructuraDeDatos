package EvaluacionDos.dao;

import EvaluacionDos.dto.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    List<Usuario> lista = new ArrayList<>();

    public void agregar(Object ob) {
        lista.add((Usuario) ob);
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public Usuario busquedaBinaria(String usuaUsua) {
        ordenarPorUsuaUsua();
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            Usuario usuarioMedio = lista.get(medio);

            int comparacion = usuarioMedio.getUsuaUsua().compareTo(usuaUsua);

            if (comparacion == 0) {
                return usuarioMedio;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

    public void ordenarPorUsuaUsua() {
        mergeSort(0, lista.size() - 1);
    }

    private void mergeSort(int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            mergeSort(inicio, medio);
            mergeSort(medio + 1, fin);
            merge(inicio, medio, fin);
        }
    }

    private void merge(int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        List<Usuario> listaIzquierda = new ArrayList<>();
        List<Usuario> listaDerecha = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            listaIzquierda.add(lista.get(inicio + i));
        }
        for (int j = 0; j < n2; j++) {
            listaDerecha.add(lista.get(medio + 1 + j));
        }

        int i = 0, j = 0;
        int k = inicio;

        while (i < n1 && j < n2) {
            if (listaIzquierda.get(i).getUsuaUsua().compareTo(listaDerecha.get(j).getUsuaUsua()) <= 0) {
                lista.set(k, listaIzquierda.get(i));
                i++;
            } else {
                lista.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
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
