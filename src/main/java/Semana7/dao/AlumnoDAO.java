package Semana7.dao;

import Semana7.dto.Alumno;
import Semana7.interfaz.OperacionesCRUD;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO implements OperacionesCRUD{
    List<Alumno>lista= new ArrayList<>();

    @Override
    public void agregar(Object o) {
        lista.add(((Alumno)o));
    }

    @Override
    public void editar(Object o) {
    
    }

    @Override
    public String listar() {
        String resultado="";
        for (Alumno alumno : lista) {
            resultado+=alumno.getNombPers()+"\n";
        }
        return resultado;
    }
    
}
