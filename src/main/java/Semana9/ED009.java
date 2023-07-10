package Semana9;

import Semana9.dao.Pila;

public class ED009 {

    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();

        System.out.println("<<-- Ejemplo de Pila -->>\n\n");

        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);

        System.out.println("<<-- Pila -->>");
        pila.listar();

        System.out.println("\n<<-- Tamaño -->>");
        System.out.println(pila.getTamanio());

        System.out.println("\n<<-- Quitar el elemento del tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Consulta si exite el valor 65-->>");
        System.out.println(pila.buscar(65));

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());
        
        System.out.println("\n<<-- Elemento de la cima -->>");
        System.out.println(pila.cima());;

        System.out.println("\n<<-- Fin de ejemplo pila -->>");
    }
}
