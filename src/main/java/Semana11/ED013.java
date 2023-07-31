package Semana11;

import Semana11.dao.PersonaDAO;
import Semana11.dto.Persona;
import java.util.List;

public class ED013 {
    public static void main(String[] args) {
        List<Persona> lista = PersonaDAO.listar();
        System.out.println(lista.size());
        PersonaDAO.mostrar();
    }
}
