package Semana2;

import java.util.Vector;

public class VectorCRUD {

    public static void main(String[] args) {
        //Creamos el vector
        Vector vector = new Vector();

        //Agregamos elementos
        vector.addElement("uno");
        vector.addElement("dos");
        vector.addElement("cuatro");
        vector.addElement("cinco");
        vector.addElement("seis");
        vector.addElement("siete");
        vector.addElement("OXio");

        //Insertamos en una determinada ubicacion
        vector.insertElementAt("tres", 2);

        //Modificar OXio por ocho
        vector.setElementAt("ocho", 7);

        //Mostramos los elementos
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.elementAt(i) + "\t");
        }
        
        //Eliminamos el ultimo elemento "ocho"
        vector.remove("ocho");

        //Buscamos el ocho
        System.out.println("\nEl vector contiene ocho? : " + vector.contains("ocho"));

    }
}
