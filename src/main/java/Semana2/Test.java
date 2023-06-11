package Semana2;

public class Test {
    public static void main(String[] args) {
        Animal anim=new Perro("goliath");
        anim.tipoAnimal();
        anim.comunicarse();
        System.out.println("");
        
        Perro perro=new Perro("hercules");
        perro.tipoAnimal();
        System.out.println("");
        
        Animal animalPolimorfico = perro;
        animalPolimorfico.tipoAnimal();
        System.out.println("");
        
        perro = (Perro) anim;
        perro.tipoAnimal();
        System.out.println("");
        
        Animal gat = new Gato("pichi");
        gat.tipoAnimal();
        gat.comunicarse();
        System.out.println("");
        
        IAnimal cat = new Gato("pitufa");
        cat.comunicarse();
        
        //System.out.println("\nConstante en la interfaz Animal : " + IAnimal.valor);
    }
}
