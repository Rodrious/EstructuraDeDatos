package Semana5.dto;

public class NodoDoble {
    private int codigo;
    private String nombre;
    private int edad;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    
    public NodoDoble() {
    }

    public NodoDoble(int codigo, String nombre, int edad, NodoDoble siguiente, NodoDoble anterior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
}
