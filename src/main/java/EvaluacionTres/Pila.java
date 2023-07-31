package EvaluacionTres;

import java.util.Scanner;
import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        
        Scanner scanner = new Scanner(System.in);

        do {
            int resultado = 1;
            System.out.print("Ingrese los números a multiplicar: ");
            String multiplicacion = scanner.nextLine();
            if (multiplicacion.equalsIgnoreCase("exit")) {
                System.out.println("Se cerró el programa.");
                System.exit(0);
            }

            String[] numText = multiplicacion.split("\\*");

            for (String numStr : numText) {
                int numero = Integer.parseInt(numStr.trim());
                numeros.push(numero);
            }

            while (!numeros.isEmpty()) {
                resultado *= numeros.pop();
            }

            System.out.println("El resultado de la multiplicación es: " + resultado);
        } while (true);
    }

}
