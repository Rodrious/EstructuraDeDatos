package Semana5.dao;

import Semana5.dto.Categoria;

public class CategoriaDAO {

    private Categoria raiz;
    private Categoria ultimo;

    public void agregar(Categoria p) {
        if (raiz == null) {
            raiz = ultimo = p;
        } else {
            ultimo.setSig(p);
            ultimo = p;
        }
    }

    public String leer() {
        String lista = " ID   -   NOMBRE\n";
        Categoria p = raiz;
        while (p != null) {
            lista += " " + p.getCodiCate() + "    -   ";
            lista += p.getNombCate() + "\n";
            p = p.getSig();
        }
        return lista;
    }

    //Metodo de ordenamiento por seleccion
    public void ordenarPorCodigo() {
        if (raiz == null || raiz.getSig() == null) {
            // La lista está vacía o solo tiene un elemento, no es necesario ordenar
            return;
        }
        Categoria actual = raiz;
        while (actual != null) {
            Categoria minimo = actual;
            Categoria siguiente = actual.getSig();

            while (siguiente != null) {
                if (siguiente.getCodiCate() < minimo.getCodiCate()) {
                    minimo = siguiente;
                }
                siguiente = siguiente.getSig();
            }
            if (minimo != actual) {
                // Intercambiar los valores de 'actual' y 'minimo'
                int tempCodigo = actual.getCodiCate();
                String tempNombre = actual.getNombCate();

                actual.setCodiCate(minimo.getCodiCate());
                actual.setNombCate(minimo.getNombCate());

                minimo.setCodiCate(tempCodigo);
                minimo.setNombCate(tempNombre);
            }
            actual = actual.getSig();
        }
    }

}
