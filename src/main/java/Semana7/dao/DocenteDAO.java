package Semana7.dao;

import Semana7.dto.Docente;
import Semana7.interfaz.OperacionesCRUD;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO implements OperacionesCRUD{
    List<Docente> lista = new ArrayList<>();
    @Override
    public void agregar(Object o) {
        lista.add((Docente)o);
    }

    @Override
    public void editar(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String listar() {
        String resultado="";
        for (Docente docente : lista) {
            resultado+=docente.getNombPers();
        }
        return resultado;
    }
    
    
    
}
