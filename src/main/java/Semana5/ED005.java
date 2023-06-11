package Semana5;

import Semana5.dao.Lista;
import Semana5.dto.Nodo;

public class ED005 {

    public static void main(String[] args) {
        Lista l = new Lista();
        
        Nodo n1 = new Nodo();
        n1.setDato(3);
        n1.setSig(null);
        
        Nodo n2 = new Nodo();
        n2.setDato(5);
        n2.setSig(null);
        
        Nodo n3 = new Nodo();
        n3.setDato(2);
        n3.setSig(null);
        
        l.agregar(n1);
        l.agregar(n2);
        l.agregar(n3);
        l.agregar(new Nodo (4,null));
        l.agregar(new Nodo (1,null));
        l.agregarAlInicio(new Nodo(0,null));
        l.agregarAlInicio(new Nodo(1,null));
        l.leer();
        System.out.println("-------------------");
        l.eliminarUltimo();
        l.leer();
        System.out.println("-----------------");
        l.eliminarPrimero();
        l.leer();
    }

}
