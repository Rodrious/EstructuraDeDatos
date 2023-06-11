/*2. Modificar el segundo ejercicio para que las operaciones
de Agregar, insertar, modificar, eliminar y buscar estén
dentro de las operaciones de la clase “VectorCRUD” .
 */
package Semana2;

import java.util.Vector;
import javax.swing.JOptionPane;

public class Ejercicios02 {

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

        String menu = "-----------OPERACIONES-----------\n";
        menu = menu + "1.Ver elementos\n";
        menu = menu + "2.Agregar elementos\n";
        menu = menu + "3.Insertar elementos\n";
        menu = menu + "4.Modificar elementos\n";
        menu = menu + "5.Eliminar elementos\n";
        menu = menu + "6.Buscar elementos\n";
        menu = menu + "9.Salir";

        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            String mostrar = "", elemento;
            int index;
            switch (opc) {
                case 1: //Mostrar elementos
                    for (int i = 0; i < vector.size(); i++) {
                        mostrar = mostrar + i + " - " + vector.elementAt(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, mostrar);
                    break;
                case 2: //Agregar elementos
                    elemento = JOptionPane.showInputDialog("Ingrese el elemento : ");
                    vector.addElement(elemento);
                    JOptionPane.showMessageDialog(null, "Elemento agregado");
                    break;
                case 3: //Insertar elementos
                    elemento = JOptionPane.showInputDialog("Ingrese el elemento : ");
                    do {
                        index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice: 0-" + vector.size()));
                    } while (index < 0 || index > vector.size());
                    vector.insertElementAt(elemento, index);
                    JOptionPane.showMessageDialog(null, "Elemento insertado.");
                    break;
                case 4: //Modificar elementos
                    mostrar = "Indice    -   Elemento\n";
                    for (int i = 0; i < vector.size(); i++) {
                        mostrar = mostrar + i + "  -    " + vector.elementAt(i) + "\n";
                    }
                    do {
                        index = Integer.parseInt(JOptionPane.showInputDialog(mostrar));
                    } while (index < 0 || index > vector.size());
                    elemento = JOptionPane.showInputDialog("Ingrese el elemento : ");
                    vector.setElementAt(elemento, index);
                    break;
                case 5: //Eliminar elementos
                    for (int i = 0; i < vector.size(); i++) {
                        mostrar = mostrar + i + "  -    " + vector.elementAt(i) + "\n";
                    }
                    elemento = JOptionPane.showInputDialog(mostrar + "Ingrese el elemento : ");
                    if(vector.contains(elemento)){
                        vector.remove(elemento);
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe el elemento.");
                    }
                    break;
                case 6: //Buscar elementos
                    elemento = JOptionPane.showInputDialog("Ingrese el elemento a buscar: ");
                    if(vector.contains(elemento)){
                        JOptionPane.showMessageDialog(null, "Si existe el elemento.");
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe el elemento.");
                    }
                    break;
                case 9: //Finalizar 
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una operacion correcta.");
                    break;
            }
        } while (opc != 9);
    }

}
