package Semana2;

public class Trabajador {
    private int codigo;
    private String nombre;
    private double sueldo;
    private boolean tieneHijo;
    private double descuento;
    
    private double rmv=1025;
    private double netoAPagar=0;
    private double asignacionFamiliar=0;

    public Trabajador(int codigo, String nombre, double sueldo, boolean tieneHijo, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.tieneHijo = tieneHijo;
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isTieneHijo() {
        return tieneHijo;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getNetoAPagar() {
        if (tieneHijo) {
            asignacionFamiliar=rmv*0.10;
        }
        netoAPagar=sueldo+asignacionFamiliar-descuento;
        return netoAPagar;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", sueldo=" + sueldo +'}';
    }
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(1, "Luis", 1500, true, 0);
        Trabajador t2 = new Trabajador(2, "Juan", 2000, false, 50);
        Trabajador t3 = new Trabajador(3, "Rosario", 1800, true, 10);
        
        Trabajador arrayTrabajador[]=new Trabajador[3];
        arrayTrabajador[0]=t1;
        arrayTrabajador[1]=t2;
        arrayTrabajador[2]=t3;
        
        for (int i = 0; i < arrayTrabajador.length; i++) {
            System.out.println(arrayTrabajador[i].toString()+" Neto a pagar : "+arrayTrabajador[i].getNetoAPagar());
        }
    }
}
