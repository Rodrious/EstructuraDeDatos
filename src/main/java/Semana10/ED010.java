package Semana10;

public class ED010 {

    public static void main(String[] args) {
        Cola c =  new Cola();
        c.agregar(3);
        c.agregar(5);
        c.agregar(6);
        
        c.listar();
        
        c.retirar();
        System.out.println("--------Despues de retirar--------");
        c.listar();
        
    }
}
