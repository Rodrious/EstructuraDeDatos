package Semana10.pilacola;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    Queue<Integer> cola = new LinkedList<>();
    
    public void agregar(int numero){
        cola.add(numero);
    }
    
    public int quitar(){
        return cola.poll();
    }
    
    public void mostrar(){
        for (Integer integer : cola) {
            System.out.println("|\t\t" + integer + "\t\t|");
            System.out.println("---------------------");
        }
    }
    
    public static void main(String[] args) {
        Cola col = new Cola();
        col.agregar(3);
        col.agregar(5);
        col.agregar(6);
        col.mostrar();
        col.quitar();
        col.mostrar();
    }
}
