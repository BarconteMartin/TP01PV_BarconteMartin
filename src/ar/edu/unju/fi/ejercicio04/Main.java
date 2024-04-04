package ar.edu.unju.fi.ejercicio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 0 y 10 para calcular su factorial:");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            int factorial = 1;
            int numeroOriginal = numero; 
            while (numero > 1) {
                factorial *= numero;
                numero--;
            }
            System.out.println("El factorial de " + numeroOriginal + " es: " + factorial);
        } else {
            System.out.println("El número ingresado no está en el rango de 0 a 10.");
        }
        scanner.close();
    }
}
