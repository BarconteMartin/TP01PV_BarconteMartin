package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número entero:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par. El triple del número es: " + (numero * 3));
        } else {
            System.out.println("El número es impar. El doble del número es: " + (numero * 2));
        }
        scanner.close();
    }
}
