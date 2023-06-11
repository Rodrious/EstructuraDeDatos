package EvaluacionUno;

public class Alumno {
    private int codigo;
    private String nombreEstudiante;

    public int getCodigo() {
        return codigo;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public Alumno(int codigo, String nombreEstudiante) {
        this.codigo = codigo;
        this.nombreEstudiante = nombreEstudiante;
    }
    
}
