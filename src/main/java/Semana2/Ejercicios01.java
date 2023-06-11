/*
1. Modificar el primer ejercicio para que se pueda insertar
un elemento en cualquier ubicación.
 */
package Semana2;

import javax.swing.JOptionPane;

public class Ejercicios01 {

    public static void main(String[] args) {
        int dato = 10;
        int[] nums = {5, 90, 23, 4, 1, 8};

        int[] auxiliar = new int[nums.length + 1];
        auxiliar[0] = dato;

        for (int i = 0; i < nums.length; i++) {
            auxiliar[i + 1] = nums[i];
        }

        nums = auxiliar;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("----------------------------------------");
        int posicion, elemento;
        do {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ubicacion para insertar un elemento :"));
        } while (posicion < 0 || posicion > nums.length - 1);
        elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento numerico : "));

        int aux[] = new int[nums.length + 1];
        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if (i == posicion) {
                aux[j] = elemento;
                j++;
            }
            aux[j] = nums[i];
        }
        nums = aux;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
