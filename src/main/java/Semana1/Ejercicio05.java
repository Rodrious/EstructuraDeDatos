/*5. Escribir un programa que defina el siguiente TAD:
        Clase: Trabajador
        código int
        nombre String
        sueldo double
Ahora debemos crear un programa que cree un array de
objetos de la clase Trabajador de 5 elementos, luego
debe presentar la información de cada trabajador con su
respectivo sueldo, y al final presentar la suma.*/
package Semana1;

public class Ejercicio05 {
    private int codigo;
    private String nombre;
    private double sueldo;

    public Ejercicio05() {
    }

    public Ejercicio05(int codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public static void main(String[] args) {
        double suma=0;
        Ejercicio05 trabajadores[]= new Ejercicio05[5];
        trabajadores[0]=new Ejercicio05(12, "Rodrigo", 10000);
        trabajadores[1]=new Ejercicio05(13, "Jair", 9000);
        trabajadores[2]=new Ejercicio05(14, "Juan", 10000);
        trabajadores[3]=new Ejercicio05(15, "Carlos", 1000);
        trabajadores[4]=new Ejercicio05(16, "Maria", 10);
        System.out.println("LISTADO DE TRABAJADORES");
        System.out.println("================================");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].getCodigo()+ " - "+trabajadores[i].getNombre()+" - "+ trabajadores[i].getSueldo());
            suma = suma + trabajadores[i].getSueldo();
        }
        System.out.println("SUMA DE SUELDOS: ");
        System.out.println(" Es: "+ suma);
    }
    

}
