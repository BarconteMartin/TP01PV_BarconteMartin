package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10]: ");
            size = scanner.nextInt();
        } while (size < 3 || size > 10);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Valores del array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

        int suma = 0;
        for (int num : array) {
            suma += num;
        }

        System.out.println("Suma de todos los valores: " + suma);

        scanner.close();
    }
}
