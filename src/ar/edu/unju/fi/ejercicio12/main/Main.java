package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato dd/MM/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = formatter.parse(fechaNacimientoStr);

        Persona persona = new Persona();
        persona.setNombre(nombre);
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fechaNacimiento);
        persona.setFechaNac(calendario);

        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + formatter.format(fechaNacimiento));
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiacal());
        System.out.println("Estación: " + persona.calcularEstacion());
        scanner.close();
    }
}
