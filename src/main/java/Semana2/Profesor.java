package Semana2;

public class Profesor extends Persona {

    private String idProfesor;

    public Profesor(String idProfesor,String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idProfesor=" + idProfesor + " - " + getApellidos() + " " + getNombre() + " " + getEdad() + '}';
    }

}
