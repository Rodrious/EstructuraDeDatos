package Semana7.dao;

import Semana7.dto.Usuario;
import java.util.ArrayList;
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
    
    public void retroceder(){
        ubicacion--;
    }
    
    public void inicio(){
        ubicacion=0;
    }
    
    public void fin(){
        ubicacion=lista.size()-1;
    }
    
    public void agregar(Usuario usu){
        lista.add(usu);
    }

}
