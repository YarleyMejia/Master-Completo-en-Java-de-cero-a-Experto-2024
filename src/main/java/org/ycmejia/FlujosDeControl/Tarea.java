package org.ycmejia.FlujosDeControl;

import java.util.Scanner;

public class Tarea {
    //Crear una clase con el método main donde el desafío es buscar el número menor
    // de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
    // números a comparar, luego utilizando una sentencia for iterar el numero de veces
    // (ingresado) para pedir el numero entero, entonces se requiere:

    //Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
    // si no, imprimir " el numero menor es igual o mayor que 10!".
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(" Ingrese el numero No." + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else if (menor >= 10) {
            System.out.println("El número menor es mayor o igual que 10!");

        }
    }
}

