package Semana3;

public class SortInsercionPOO {

    int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public int[]sort(){
        int n = numeros.length, temp, Izq,Der,Medio;
        for (int i = 0; i < n; i++) {
            temp=numeros[i];
            Izq=0;
            Der=i-1;
            while(Izq<=Der){
                Medio=(Izq+Der)/2;
                if (temp<numeros[Medio]) {
                    Der=Medio-1;
                }else{
                    Izq=Medio+1;
                }
            }
            for (int j = i-1; j >= Izq; j--) {
                numeros[j+1]=numeros[j];
            }
            numeros[Izq]=temp;
        }
        return numeros;
    }
    public void mostrar() {
        int n = numeros.length;
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }
    
    public static void main(String[] args) {
        int numeros[] = {80, 25, 70, 2, 9};
        SortInsercionPOO objSort =  new SortInsercionPOO();
        objSort.setNumeros(numeros);
        objSort.sort();
        objSort.mostrar();
    }
}
