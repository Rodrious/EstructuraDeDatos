package Semana9;

import Semana9.dao.PersonaDAO;
import Semana9.dto.Persona;

public class Main {

    public static void main(String[] args) throws Exception {
        PersonaDAO perdao = new PersonaDAO();

        System.out.println("<<-- Ejemplo de Pila -->>\n\n");

        perdao.apilar(new Persona(4, "Rodrigo"));
        perdao.apilar(new Persona(6, "Jair"));
        perdao.apilar(new Persona(65, "Marss"));
        perdao.apilar(new Persona(8, "Tair"));
        perdao.apilar(new Persona(12, "Mark"));

        System.out.println("<<-- Pila -->>");
        perdao.listar();

        System.out.println("\n<<-- Tamaño -->>");
        System.out.println(perdao.getTamanio());

        System.out.println("\n<<-- Quitar el elemento del tope de la pila -->>");
        perdao.retirar();
        perdao.listar();
        System.out.println("Tamaño: " + perdao.getTamanio());

        System.out.println("\n<<-- Consulta si exite la persona con DNI 65-->>");
        System.out.println(perdao.buscar(65));

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(perdao.esVacia());

        System.out.println("\n<<-- Elemento de la cima -->>");
        Persona ultimo = perdao.cima();
        System.out.println("DNI : " + ultimo.getDni() + " NOMBRE : " + ultimo.getNombre());

        System.out.println("\n<<-- Fin de ejemplo pila -->>");

    }
}
