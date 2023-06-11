
package Semana3;

public class SortEmpleado {
    Empleado [] arrayEmpleados =  new Empleado[3];

    public void setArrayEmpleados(Empleado[] arrayEmpleados) {
        this.arrayEmpleados = arrayEmpleados;
    }
    public Empleado[] ordenarInsercion(){
        int n = arrayEmpleados.length, izq,der,medio;
        Empleado aux;
        for (int i = 0; i < n; i++) {
            aux = arrayEmpleados[i];
            izq=0;
            der = i-1;
            while(izq<=der){
                medio=(izq+der)/2;
                if (aux.getCodigo()<arrayEmpleados[medio].getCodigo()) {
                    der = medio-1;
                }else{
                    izq=medio+1;
                }
            }
            for (int j = i-1; j >= izq; j--) {
                arrayEmpleados[j+1]=arrayEmpleados[j];
            }
            arrayEmpleados[izq]=aux;   
            
        }
        return arrayEmpleados;
    }
    public void mostrar(){
        int n=arrayEmpleados.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arrayEmpleados[i].getCodigo() + " "+arrayEmpleados[i].getNombre()+" "+arrayEmpleados[i].getTelefono()+"\n");
        }
    }
    public static void main(String[] args) {
        Empleado em1 = new Empleado(4, "Rodrigo", "903939434");
        Empleado em2 = new Empleado(1, "Keysi", "90344444");
        Empleado em3 = new Empleado(3, "Kynlee", "999999999");
        
        Empleado[] arrayEmpleados=new Empleado[3];
        arrayEmpleados[0]=em1;
        arrayEmpleados[1]=em2;
        arrayEmpleados[2]=em3;
        
        SortEmpleado objSort =  new SortEmpleado();
        objSort.setArrayEmpleados(arrayEmpleados);
        System.out.println("LISTA DESORDENADA\n======================");
        objSort.mostrar();
        objSort.ordenarInsercion();
        System.out.println("LISTA ORDENADA\n======================");
        objSort.mostrar();
    }
}
