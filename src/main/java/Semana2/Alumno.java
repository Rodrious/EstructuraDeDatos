
package Semana2;

public class Alumno extends Persona{
    private String idAlumno;

    public Alumno(String idAlumno,String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idAlumno=idAlumno;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno +" - "+getApellidos()+" "+ getNombre() + " "+getEdad()+ '}';
    }
    
    
}
