/*4. Ejercicio de Herencia y Polimorfismo: EMPLEADOS
Se pretende desarrollar un conjunto de clases que
representen, de forma simplificada, a una hipotética
empresa dedicada a vender un producto. A continuación,
se describen las características básicas de estas
clases:
        a.  Empleado. Clase básica que describe a un empleado.
            Incluye sus datos personales (nombre, apellidos,
            DNI, dirección, teléfono de contacto y su salario).
            Tendrá, al menos, las siguientes funciones miembro:
            ●   Constructores para definir correctamente un
                empleado, a partir de su nombre, apellidos,
                DNI, dirección, teléfono y salario.
            ●   Imprimir (Información detallada del empleado toString)
            ●   Incrementar salario
        b.  Secretario. Tiene despacho, número de fax e incrementa su salario un 5% anual. Tendrá, al
            menos, las siguientes funciones miembro:
            ●   Constructores (debe rellenar la información personal y los datos principales)
            ●   Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
        c.  Vendedor. Tiene coche de la empresa (identificado
            por la matrícula, marca y modelo), teléfono móvil,
            área de venta, lista de clientes y porcentaje que
            se lleva de las ventas en concepto de comisiones.
            Incrementa su salario un 10% anual. Tendrá, al menos, las siguientes funciones miembro:
            ●   Constructores (debe rellenar la información personal y los datos principales)
            ●   Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
            ●   Dar de alta un nuevo cliente.
            ●   Dar de baja un cliente.
            ●   Cambiar de coche.
        d.  Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de vendedores a su cargo y
            tiene coche de la empresa (identificado por la matrícula, marca y modelo). Incrementa su salario
            un 20% anual. Tendrá, al menos, las siguientes funciones miembro:
            ●   Constructores (debe rellenar la información personal y los datos principales)
            ●   Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
            ●   Cambiar de secretario.
            ●   Cambiar de coche.
            ●   Dar de alta y de baja un nuevo vendedor en su zona.
Todos los empleados son vendedores, jefes de
zona o secretarios. Hacer un programa de prueba que
muestre cómo funciona. Probar, especialmente, que
el método incrementar salario se comporta bien,
según el empleado que sea así es la subida.
*/
package Semana2;

public class Ejercicios04Empleado {
    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private String telefono;
    private double salario;

    public Ejercicios04Empleado(String nombre, String apellido, String DNI, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre = " + nombre + ", apellido = " + apellido + ", DNI = " + DNI + ", direccion = " + direccion + ", telefono = " + telefono + ", salario = " + salario + '}';
    }
    public void incremnetarSalario(double incremento){
        this.salario = this.salario + incremento*this.salario;
    }
    
}
