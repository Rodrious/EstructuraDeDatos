package Semana10.pilacola;

import java.util.Stack;

public class Pila {
    Stack<Integer> pilaNumero = new Stack<>();
    
    public void agregar(int numero){
        pilaNumero.push(numero);
    }
    
    public int quitar(){
        return pilaNumero.pop();
    }
    
    public void mostrar(){
        for (Integer integer : pilaNumero) {
            System.out.println("|\t\t" + integer + "\t\t|");
            System.out.println("---------------------");
        }
    }
    
    public static void main(String[] args) {
        Pila p = new Pila();
        p.agregar(3);
        p.agregar(5);
        p.agregar(6);
        p.mostrar();
        p.quitar();
        p.mostrar();
    }
}
