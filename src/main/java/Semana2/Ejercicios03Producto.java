/*3. Diseñe una clase de nombre Producto con los siguientes
atributos privados: código (cadena),descripción
(cadena), precio (real) y con los métodos públicos
get/set. Considere los constructores adecuados, luego
habilite el método toString en donde debe mostrar toda
la información del producto. Finalmente ingresa 10
registros y presenta.*/
package Semana2;

import javax.swing.JOptionPane;

public class Ejercicios03Producto {

    private String codigo;
    private String descripcion;
    private double precio;

    public Ejercicios03Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo = " + codigo + ", descripcion = " + descripcion + ", precio = " + precio + '}';
    }

    public static void main(String[] args) {
        Ejercicios03Producto prod1 = new Ejercicios03Producto("01", "Lenovo XPedia", 1200);
        Ejercicios03Producto prod2 = new Ejercicios03Producto("02", "HP 23", 1500);
        Ejercicios03Producto prod3 = new Ejercicios03Producto("03", "TOSHIBA 12", 1300);
        Ejercicios03Producto prod4 = new Ejercicios03Producto("04", "ASUS", 1200);
        Ejercicios03Producto prod5 = new Ejercicios03Producto("05", "ASUS Oled", 1299);
        Ejercicios03Producto prod6 = new Ejercicios03Producto("06", "ASUS NVIDIA", 1100);
        Ejercicios03Producto prod7 = new Ejercicios03Producto("07", "TOSHIBA 85", 1399);
        Ejercicios03Producto prod8 = new Ejercicios03Producto("08", "MacBook", 1700);
        Ejercicios03Producto prod9 = new Ejercicios03Producto("09", "MacBook Pro", 1800);
        Ejercicios03Producto prod10 = new Ejercicios03Producto("10", "macBook Pro 12 Max", 12000);

        Ejercicios03Producto arrayProductos[] = new Ejercicios03Producto[10];
        arrayProductos[0]=prod1;
        arrayProductos[1]=prod2;
        arrayProductos[2]=prod3;
        arrayProductos[3]=prod4;
        arrayProductos[4]=prod5;
        arrayProductos[5]=prod6;
        arrayProductos[6]=prod7;
        arrayProductos[7]=prod8;
        arrayProductos[8]=prod9;
        arrayProductos[9]=prod10;
        
        for (int i = 0; i < arrayProductos.length; i++) {
            System.out.println(arrayProductos[i].toString());
        }
    }
}
