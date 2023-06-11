package Semana2;

import java.util.ArrayList;

public class Ejercicios04JefeDeZona extends Ejercicios04Empleado{
    private String despacho;
    private String matricula;
    private String marca;
    private String modelo;


    public Ejercicios04JefeDeZona(String despacho, String matricula, String marca, String modelo, String nombre, String apellido, String DNI, String direccion, String telefono, double salario) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    ArrayList<Ejercicios04Secretario> secretarios = new ArrayList<>();
    ArrayList<Ejercicios04Vendedor> vendedores = new ArrayList<>();
    
    @Override
    public String toString() {
        return "JefeDeZona{" + "Nombre = "+getNombre()+ " Apellido = "+ getApellido()+"Salario = "+getSalario()+'}';
    }
    
    public void getSecretario(Ejercicios04Secretario secretarioNuevo){
        this.secretarios.add(secretarioNuevo);
    }
    public void getVendedor(Ejercicios04Vendedor vendedorNuevo){
        this.vendedores.add(vendedorNuevo);
    }
  
    public void cambiarCoche(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo=modelo;
    }
    public void darAltaNuevoVendedor(Ejercicios04Vendedor vendedorNuevo){
        this.vendedores.add(vendedorNuevo);
    }
    public void darBajaCliente(Ejercicios04Vendedor vendedorEliminar){
        this.vendedores.remove(vendedorEliminar);
    }
            
}
