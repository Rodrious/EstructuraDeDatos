package Semana7.dao;

import Semana7.dto.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsuarioDAO {

    List<Usuario> lista = new ArrayList<>();
    int ubicacion = 0;

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuario mostrarUsuario() {
        return lista.get(ubicacion);
    }

    public void avanzar() {
        ubicacion++;
    }

    public void retroceder() {
        ubicacion--;
    }

    public void inicio() {
        ubicacion = 0;
    }

    public void fin() {
        ubicacion = lista.size() - 1;
    }

    public void agregar(Usuario usu) {
        lista.add(usu);
    }

    public boolean evitarCodigo(int codi) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == codi) {
                return true;
            }
        }
        return false;
    }
    
    public void ordenar(){
        Collections.sort(lista);
    }
    
    public int busquedaBinaria(int codiBuscar) {
        ordenar();

        int der = 0;
        int izq = lista.size() - 1;

        while (der <= izq) {
            int mitad = (der + izq) / 2;
            Usuario mitadUsuario = lista.get(mitad);
            int mitadCodigo = mitadUsuario.getCodigo();

            if (mitadCodigo == codiBuscar) {
                return mitad;
            } else if (mitadCodigo < codiBuscar) {
                der = mitad + 1;
            } else {
                izq = mitad - 1;
            }
        }

        return -1;
    }
}
