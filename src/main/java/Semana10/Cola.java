package Semana10;

public class Cola {

    private Nodo inicio;
    private Nodo fin;
    private int tamanio;

    public Cola() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    public Cola(Nodo inicio, int tamanio) {
        this.inicio = inicio;
        this.tamanio = tamanio;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamanio++;
    }

    public void retirar() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }

    public void listar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("|\t\t" + aux.getValor() + "\t\t|");
            System.out.println("----------------------------------");
            aux=aux.getSiguiente();
        }
    }

}
