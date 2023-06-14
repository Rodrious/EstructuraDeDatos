package Semana6;

import Semana6.util.Mat;
import Semana6.util.Ordenamiento;
import javax.swing.JOptionPane;

public class ED006 {
    public static void main(String[] args) {
        //Factorial
        String snumero = JOptionPane.showInputDialog("Ingrese el valor: ",null);
        int numero = Integer.parseInt(snumero);
        long fac = Mat.factorial(numero);
        JOptionPane.showMessageDialog(null, "El factorial de ["+snumero+"] es : "+fac);
        
        //Suma
        long suma = Mat.suma(numero);
        JOptionPane.showMessageDialog(null, "La suma de los primeros ["+snumero+"] es : "+suma);
        
        //Producto
        String snum1 = JOptionPane.showInputDialog("Ingrese el numero 1: ",null);
        String snum2 = JOptionPane.showInputDialog("Ingrese el numero 2: ",null);
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);
        long producto = Mat.producto(num1, num2);
        JOptionPane.showMessageDialog(null, "El producto de los numeros ["+num1+" y "+num2+"] es : "+producto);
        
        //Maximo Comun Divisor
        long mcd = Mat.maxComunDivisor(num1, num2);
        JOptionPane.showMessageDialog(null, "El mcd de los numeros ["+num1+" y "+num2+"] es : "+mcd);
        
        //Encontrar el maximo valor de un arreglo
        int [] num = {4,5,6,8,10,89};
        int max = Mat.encontrarMaximo(num,num.length);
        JOptionPane.showMessageDialog(null, "El maximo valor del arreglo es : "+max);
        
    }
}
