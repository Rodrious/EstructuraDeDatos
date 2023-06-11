package Semana5.dao;

import Semana5.dto.NodoDoble;

public class NodoDobleDAO {

    private NodoDoble raiz;
    private NodoDoble ultimo;

    //Metodo para agregar un nodo
    public void agregar(NodoDoble nd) {
        //Si el inicio esta vacio se le agrega el nodo que le pasamos por parametros
        if (raiz == null) {
            raiz = ultimo = nd;
        } else {
            //Si ya hay un elemento se le agrega al anterior el ultimo nodo y la vez al siguiente
            nd.setAnterior(ultimo);
            ultimo.setSiguiente(nd);
            ultimo = nd;
        }
    }

    //Metodo para listar los elementos que hay en el nodo doble
    public String leer() {
        String lista = " ID   -   NOMBRE  -  EDAD\n";
        NodoDoble nd = raiz;
        while (nd != null) {
            lista += " " + nd.getCodigo() + "    -     ";
            lista += nd.getNombre() + "    -   ";
            lista += nd.getEdad() + "\n";
            nd = nd.getSiguiente();
        }
        return lista;
    }
    
    //Metodo para eliminar un nodo por codigo
    public String eliminarPorCodigo(int codigo) {
        if (raiz == null) {
            // La lista está vacía y por ende no se puede eliminar nada
            return "Lista esta vacia";
        }

        NodoDoble actual = raiz;

        while (actual != null && actual.getCodigo() != codigo) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            // No se encontró a ninguno nodo que tengo el codigo que se recibio como parametro
            return "No se encontro el codigo";
        }

        NodoDoble anterior = actual.getAnterior();
        NodoDoble siguiente = actual.getSiguiente();

        if (anterior != null) {
            anterior.setSiguiente(siguiente);
        } else {
            // El nodo a eliminar es el primer nodo (raíz)
            raiz = siguiente;
            if (raiz != null) {
                raiz.setAnterior(null);
            }
        }

        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        } else {
            // El nodo a eliminar es el último nodo
            ultimo = anterior;
            if (ultimo != null) {
                ultimo.setSiguiente(null);
            }
        }

        actual.setAnterior(null);
        actual.setSiguiente(null);
        
        return " El codigo ["+codigo+"] se elimino con exito.";
    }

}
