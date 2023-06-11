package Semana1;

public class Alumno {

    private String codigo;
    private String nombre;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Alumno arrayObjetos[] = new Alumno[3];
        arrayObjetos[0] = new Alumno("01", "Carlos");
        arrayObjetos[1] = new Alumno("02", "Juan");
        arrayObjetos[2] = new Alumno("03", "Luis");
        System.out.println("LISTADO DE ALUMNO");
        System.out.println("================================");
        for (int i = 0; i < arrayObjetos.length; i++) {
            System.out.println(arrayObjetos[i].getCodigo() + " - " + arrayObjetos[i].getNombre());
        }
    }
}
