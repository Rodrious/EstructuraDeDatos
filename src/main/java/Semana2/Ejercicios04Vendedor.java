package Semana2;

import java.util.ArrayList;

public class Ejercicios04Vendedor extends Ejercicios04Empleado{
    private String matricula;
    private String marca;
    private String modelo;
    private String telefonoMovil;
    private String areaVenta;
    private ArrayList<String> listaClientes;
    private double porcentajeVenta;

    public Ejercicios04Vendedor(String nombre, String apellido, String DNI, String direccion, String telefono, double salario,
            String matricula, String marca, String modelo, String telefonoMovil,String areaVenta,double porcentajeVenta) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaClientes= new ArrayList<>();
        this.porcentajeVenta = porcentajeVenta;
    }

    @Override
    public String toString() {
        return "Puesto : Vendedor{" + "Nombre = "+getNombre() + "Apellido = "+getApellido()+" Salario = "+getSalario()+'}';
    }
    
    public void darAltaNuevoCliente(String cliente){
        listaClientes.add(cliente);
    }
    public void darBajaCliente(String cliente){
        listaClientes.remove(cliente);
    }
    public void cambiarCoche(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo=modelo;
    }
    
}
