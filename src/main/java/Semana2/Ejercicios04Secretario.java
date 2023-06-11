package Semana2;

public class Ejercicios04Secretario extends Ejercicios04Empleado{
    private String despacho;
    private int num_fax;

    public Ejercicios04Secretario(String nombre, String apellido, String DNI, String direccion, String telefono, double salario, String despacho, int num_fax) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.num_fax = num_fax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getNum_fax() {
        return num_fax;
    }

    public void setNum_fax(int num_fax) {
        this.num_fax = num_fax;
    }
    
    @Override
    public String toString() {
        return "Puesto : Secretario {" + "nombre = " + getNombre() + ", apellido = " + getApellido() + ", DNI = " + getDNI() + ", Salario = "+ getSalario()+'}';
    }
    
}
