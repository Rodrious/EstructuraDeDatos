package Semana2;

public class Herencia {

    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", "Chinga Ramos", 40);

        Profesor profe1 = new Profesor("40981412", "Juan", "Rosales Romero", 34);

        Alumno alumno1 = new Alumno("101", "Rosa", "Campos Rios", 22);

        System.out.println(p1.toString());
        System.out.println(profe1.toString());
        System.out.println(alumno1.toString());
    }
}
