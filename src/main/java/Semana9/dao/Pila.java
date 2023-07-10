package Semana9.dao;

import Semana9.dto.Nodo;

public class Pila {

    private Nodo inicio;
    private int tamanio;

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void apilar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public void retirar() { 
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }

    public int cima() throws Exception {
        if (!esVacia()) {
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }

    public boolean buscar(int referencia) {
        Nodo aux = inicio;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (referencia == aux.getValor()) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public void listar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("------------------");
            aux = aux.getSiguiente();
        }
    }
}
