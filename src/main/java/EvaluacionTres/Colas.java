package EvaluacionTres;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            int resultado = 1;
            System.out.print("Ingrese los números a multiplicar: ");
            String multiplicacion = scanner.nextLine();
            if (multiplicacion.equalsIgnoreCase("exit")) {
                System.out.println("Se cerro el programa.");
                System.exit(0);
            }

            String[] numText = multiplicacion.split("\\*");

            for (String numStr : numText) {
                int numero = Integer.parseInt(numStr);
                numeros.add(numero);
            }

            while (!numeros.isEmpty()) {
                resultado *= numeros.poll();
            }

            System.out.println("El resultado de la multiplicación es: " + resultado);
        } while (true);
    }
}
