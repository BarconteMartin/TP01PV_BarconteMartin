package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAMANO_ARRAY = 5;
        String[] nombres = new String[TAMANO_ARRAY];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }

        System.out.println("\nTamaño del array: " + nombres.length);

        int indiceEliminar;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-" + (TAMANO_ARRAY - 1) + "): ");
            indiceEliminar = scanner.nextInt();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

        for (int i = indiceEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null;

        System.out.println("\nArray después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}
