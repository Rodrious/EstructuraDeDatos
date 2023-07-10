package Semana9.dao;

import Semana9.dto.Persona;
import java.util.Stack;

public class PersonaDAO {

    Stack<Persona> pila = new Stack<>();
    Persona per = new Persona();

    public boolean esVacia() {
        return pila.isEmpty();
    }

    public int getTamanio() {
        return pila.size();
    }

    public void apilar(Persona p) {
        pila.push(p);
    }

    public void retirar() {
        pila.pop();
    }

    public Persona cima() throws Exception {
        if (!esVacia()) {
            return pila.peek();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }

    public boolean buscar(int dni) {
        Stack<Persona> pilaAuxiliar = new Stack<>();
        boolean encontrado = false;

        while (!esVacia()) {
            Persona personaActual = pila.pop();
            pilaAuxiliar.push(personaActual);

            if (personaActual.getDni() == dni) {
                encontrado = true;
                break;
            }
        }

        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }

        return encontrado;
    }

    public void listar() {
        for (int i = getTamanio() - 1; i >= 0; i--) {
            Persona persona = pila.get(i);
            System.out.println("|\t" + persona.getDni() + "   -   " + persona.getNombre() + "\t|");
            System.out.println("-------------------------");
        }
    }
}
