package Semana2;

public abstract class Animal extends IAnimal{
    private String nombre;
    public Animal(String nombre){
        this.nombre=nombre;
        System.out.println("Constructor Animla, "+"nombre del animal : "+this.nombre);
    }

    public String getNombre() {
        return nombre;
    }
    public abstract void tipoAnimal();
}
