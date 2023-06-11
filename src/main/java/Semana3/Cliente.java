
package Semana3;

public class Cliente {
    private int codigo;
    private String apellidos;
    private String nombres;
    private String telefono;

    public int getCodigo() {
        return codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public Cliente(int codigo, String apellidos, String nombres, String telefono) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
    }
    
}
