package Semana2;

public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
        System.out.println("Constructor perro, nombre : "+nombre);
    }

    public void tipoAnimal() {
        System.out.println("Tipo Animal : Es un perro");
    }
    public void comunicarse(){
        System.out.println("Metodo de comunicarse : El perro ladra ... Guau Guau");
    }

}
