package ar.edu.unju.fi.ejercicio06.main;

import ar.edu.unju.fi.ejercicio06.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando personas...");

        System.out.println("Ingrese los datos de la primera persona:");
        Persona persona1 = new Persona();

        System.out.println("Ingrese DNI, nombre, fecha de nacimiento (AAAA-MM-DD) y provincia para la segunda persona:");
        String dni2 = scanner.next();
        String nombre2 = scanner.next();
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.next());
        String provincia2 = scanner.next();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);

        System.out.println("Ingrese DNI, nombre y fecha de nacimiento (AAAA-MM-DD) para la tercera persona:");
        String dni3 = scanner.next();
        String nombre3 = scanner.next();
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.next());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);

        System.out.println("Datos de la primera persona:");
        persona1.mostrarDatos();
        System.out.println("Datos de la segunda persona:");
        persona2.mostrarDatos();
        System.out.println("Datos de la tercera persona:");
        persona3.mostrarDatos();

        scanner.close();
    }
}
