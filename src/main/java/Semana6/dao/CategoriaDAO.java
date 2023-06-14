package Semana6.dao;

import Semana6.dto.Categoria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CategoriaDAO {
    List<Categoria> lista =  new ArrayList<>();
    
    public void agregar(Categoria c){
        lista.add(c);
    }
    
    public String mostrar(){
        ordenar();
        String mensaje = "";
        Iterator<Categoria> it = lista.iterator();
        while (it.hasNext()) {   
            mensaje+=it.next().getNombCate()+"\n";
        }
        return mensaje;
    }
    
    public String mostrar2(){
        ordenar();
        String mensaje="";
        for (Categoria categoria : lista) {
            mensaje+=categoria+"\n";
        }
        return mensaje;
    }
    
    public void ordenar(){
        Collections.sort(lista);
    }
    
}
