package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int CantElem = 8;
        int[] numeros = new int[CantElem];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < CantElem; i++) {
            System.out.print("Ingrese un número entero (" + (i + 1) + "/" + CantElem + "): ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nContenido del array:");
        for (int i = 0; i < CantElem; i++) {
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
        }

        scanner.close();
    }
}
