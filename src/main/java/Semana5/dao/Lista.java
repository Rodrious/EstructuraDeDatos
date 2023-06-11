package Semana5.dao;

import Semana5.dto.Nodo;

public class Lista {

    private Nodo raiz;
    private Nodo ultimo;

    public Lista() {
        raiz = null;
        ultimo = null;
    }

    public void agregar(Nodo p) {
        if (raiz == null) {
            raiz = ultimo = p;
        } else {
            ultimo.setSig(p);
            ultimo = p;
        }
    }

    public void agregarAlInicio(Nodo p) {
        if (raiz == null) {
            raiz = ultimo = p;
        } else {
            p.setSig(raiz);
            raiz = p;
        }
    }

    public void eliminarUltimo() {
        if (raiz == null) {
            //No se hace nada
        } else if (raiz == ultimo) {
            raiz = ultimo = null;
        } else {
            Nodo nodoActual = raiz;
            while (nodoActual.getSig() != ultimo) {
                nodoActual = nodoActual.getSig();
            }
            nodoActual.setSig(null);
            ultimo = nodoActual; 
        }
    }
    
    public void eliminarPrimero() {
    if (raiz == null) {
        // La lista está vacía, no hay nada que eliminar
        return;
    } else if (raiz == ultimo) {
        // Solo hay un nodo en la lista, se elimina y se establecen raiz y ultimo a null
        raiz = ultimo = null;
    } else {
        // La lista tiene más de un nodo
        raiz = raiz.getSig();
    }
}


    public void leer() {
        Nodo p = raiz;
        while (p != null) {
            System.out.println(p.getDato());
            p = p.getSig();
        }
    }
}
