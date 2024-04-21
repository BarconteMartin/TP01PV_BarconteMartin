package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		int añoActual = hoy.get(Calendar.YEAR);
		int mesActual = hoy.get(Calendar.MONTH);
		int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
		
		int añoNac = fechaNac.get(Calendar.YEAR);
		int mesNac = fechaNac.get(Calendar.MONTH);
		int diaNac = fechaNac.get(Calendar.DAY_OF_MONTH);
		
		int edad = añoActual - añoNac;
		
		if (mesNac > mesActual || (mesNac == mesActual && diaNac > diaActual)) {
			edad--;
		}
		
		return edad;
	}

	public String obtenerSignoZodiacal() {
		int mes = fechaNac.get(Calendar.MONTH) + 1;
		if ((mes == 3 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 21) || (mes == 4 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 20)) {
			return "Aries";
		} else if ((mes == 4 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 21) || (mes == 5 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 21)) {
			return "Tauro";
		} else if ((mes == 5 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 22) || (mes == 6 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 21)) {
			return "Géminis";
		} else if ((mes == 6 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 22) || (mes == 7 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 22)) {
			return "Cáncer";
		} else if ((mes == 7 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 23) || (mes == 8 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 22)) {
			return "Leo";
		} else if ((mes == 8 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 23) || (mes == 9 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 23)) {
			return "Virgo";
		} else if ((mes == 9 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 24) || (mes == 10 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 23)) {
			return "Libra";
		} else if ((mes == 10 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 24) || (mes == 11 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 22)) {
			return "Escorpio";
		} else if ((mes == 11 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 23) || (mes == 12 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 21)) {
			return "Sagitario";
		} else if ((mes == 12 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 22) || (mes == 1 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 20)) {
			return "Capricornio";
		} else if ((mes == 1 && fechaNac.get(Calendar.DAY_OF_MONTH) >= 21) || (mes == 2 && fechaNac.get(Calendar.DAY_OF_MONTH) <= 18)) {
			return "Acuario";
		} else { 
			return "Piscis";
		}
	}
	
	public String calcularEstacion() {
		int mes = fechaNac.get(Calendar.MONTH) + 1;
		switch (mes) {
			case 1:
			case 2:
				return "Verano";
			case 3:
				return (fechaNac.get(Calendar.DAY_OF_MONTH) < 21) ? "Verano" : "Otoño";
			case 4:
			case 5:
				return "Otoño";
			case 6:
				return (fechaNac.get(Calendar.DAY_OF_MONTH) < 21) ? "Otoño" : "Invierno";
			case 7:
			case 8:
				return "Invierno";
			case 9:
				return (fechaNac.get(Calendar.DAY_OF_MONTH) < 21) ? "Invierno" : "Primavera";
			case 10:
			case 11:
				return "Primavera";
			case 12:
				return (fechaNac.get(Calendar.DAY_OF_MONTH) < 21) ? "Primavera" : "Verano";
			default:
				return "Error";
		}
	}
}
