package Semana12;

import Semana12.dao.PersonaJpaController;
import Semana12.dao.UsuarioJpaController;
import Semana12.dto.Persona;
import Semana12.dto.Usuario;
import java.util.List;

public class ED014 {
    
    public static void main(String[] args) throws Exception {
        /*
        Prueba de la tabla "Persona" de la Base de Datos
         */
        
        //  Insertar un elemento en la tabla "Persona"
        //  Creamos un instnacia de la clase "Persona" de la base de datos
        
        Persona per = new Persona();
        per.setCodiPers(8);
        per.setAppaPers("Maron");
        per.setApmaPers("Milan");
        per.setNombPers("Guti");
        PersonaJpaController perDAO = new PersonaJpaController();
        //Usando los metodos generados de la clase "PersonaJpaController"
        perDAO.create(per);
        //Listamos para ver los elementos de la tabla y el elemento nuevo que le enviamos
        List<Persona> lista = perDAO.findPersonaEntities();
        for (Persona persona : lista) {
            System.out.println("-----------------------------");
            System.out.println("CODIGO : " + persona.getCodiPers());
            System.out.println("APELLIDO PATERNO : " + persona.getAppaPers());
            System.out.println("APELLIDO MATERNO : " + persona.getApmaPers());
            System.out.println("NOMBRE : " + persona.getNombPers());
        }
      
        //Eliminar un elemento de la tabla "Persona" de la base de datos
        
        perDAO.destroy(8);
        
        //Actualiza un elemento de la tabla "Persona" de la base de datos
        
        Persona pers = new Persona();
        per.setCodiPers(8);
        per.setAppaPers("Maron");
        per.setApmaPers("Gonzalos");
        per.setNombPers("Guti");
        perDAO.edit(pers);
        
        //Buscar un elemento por ID de la tabla "Persona" de la base de datos

        Persona perso = perDAO.findPersona(8);
        if (perso!=null) {
            System.out.println("Se encontro");
        }else{
            System.out.println("No se encontro");
        }

        //Listar los elementos de la tabla "Persona" de la base de datos
        List<Persona> listado = perDAO.findPersonaEntities();
        for (Persona persona : listado) {
            System.out.println("-----------------------------");
            System.out.println("CODIGO : " + persona.getCodiPers());
            System.out.println("APELLIDO PATERNO : " + persona.getAppaPers());
            System.out.println("APELLIDO MATERNO : " + persona.getApmaPers());
            System.out.println("NOMBRE : " + persona.getNombPers());
        }
        /*
        Prueba de la tabla "Usuario" de la Base de Datos
        */
        //Vamos a usar el metodo creado llamado "validar"
        /*
            Tener en cuenta que en mi base de datos en la tabla "usuario" tengo 2
            elementos, que son:
            ------------------------------------
            | codigoUsua | logiUsua | passUsua |
            ------------------------------------
            |       1    | kike     | 1234     |
            ------------------------------------
            |       2    | rodrious | 123456   |
            ------------------------------------
        */
        //Creamos un objeto de la clase "Usuario"
        Usuario usu = new Usuario();
        //Le pasamos los dato que vamos a validar
        usu.setLogiUsua("kike");
        usu.setPassUsua("1234");
        //Creamos una instancia de la clase "UsuarioJpaController"
        UsuarioJpaController usuDAO =  new UsuarioJpaController();
        //Utilizamos el metodo que creamos
        Usuario u = usuDAO.validar(usu);
        if (u!=null) {
            System.out.println("Usuario existe.");
        }else{
            System.out.println("Usuario no existe.");
        }
    }
}
