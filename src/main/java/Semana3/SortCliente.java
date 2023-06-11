
package Semana3;

public class SortCliente {
    Cliente arrayCliente[]= new Cliente[3];
    public void setArrayClientes(Cliente [] arrayClientes){
        this.arrayCliente = arrayClientes;
    }
    public Cliente[] sortBurbuja(){
        int n = arrayCliente.length;
        Cliente aux;       
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arrayCliente[i].getCodigo()>arrayCliente[j].getCodigo()) {
                    aux = arrayCliente[i];
                    arrayCliente[i]=arrayCliente[j];
                    arrayCliente[j]=aux;
                }
            }
        }
        return arrayCliente;
    }
    public void mostrar(){
        int n=arrayCliente.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arrayCliente[i].getCodigo() + " "+arrayCliente[i].getNombres()+"\n");
        }
    }
    public static void main(String[] args) {
        Cliente c1 =  new Cliente(9, "CHINGA", "CARLOS", "903432321");
        Cliente c2 =  new Cliente(1, "ROMERO", "RITA", "904812321");
        Cliente c3 =  new Cliente(5, "MENDEZ", "MARLA", "9034541321");
        
        Cliente arrayCliente[]=new Cliente[3];
        arrayCliente[0]=c1;
        arrayCliente[1]=c2;
        arrayCliente[2]=c3;
        
        SortCliente objSort =  new SortCliente();
        objSort.setArrayClientes(arrayCliente);
        System.out.println("LISTA DESORDENADA\n======================");
        objSort.mostrar();
        objSort.sortBurbuja();
        System.out.println("LISTA ORDENADA\n======================");
        objSort.mostrar();
    }
}
