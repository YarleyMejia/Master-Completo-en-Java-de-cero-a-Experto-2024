package org.ycmejia.FlujosDeControl;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int resultado = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            if (num2 > 0) {
                resultado += num1;
            } else {
                resultado -= num1;
            }
        }

        // Imprimir el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

