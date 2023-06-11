

package EvaluacionUno;

public class EvaluacionPrimerModulo {
    
    private int codigo;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String ciudad;

    public int getCodigo() {
        return codigo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCiudad() {
        return ciudad;
    }

    public EvaluacionPrimerModulo(int codigo, String apellidoPaterno, String apellidoMaterno, String nombres, String ciudad) {
        this.codigo = codigo;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.ciudad = ciudad;
    }
    
}
