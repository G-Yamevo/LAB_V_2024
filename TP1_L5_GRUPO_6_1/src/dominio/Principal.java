package dominio;

import interfaces.ImprimibleEnConsola;

public class Principal {

	public static void main(String[] args) {

		ImprimibleEnConsola entradaRecital = new EntradaRecital("Naranja Persa", "Lunes", "20:00", "2 horas",
				"Los Piojos", "Rock", "Los Guasones", "Tributo al rock", false);
		ImprimibleEnConsola entradaDeporte = new EntradaDeporte("Test futbol", "1", "23:39", "3 horas", false,
				"Futbol");
		ImprimibleEnConsola entradaInfantil = new EntradaInfantil("Panam", "Viernes", "20:00 hrs", "2 hs", true, true);
		ImprimibleEnConsola entradaTeatro = new EntradaTeatro("FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs",
				"Drama", "Ricardo Darin", "Guillermo Francella", "Erica Rivas");
		entradaRecital.imprimirEnConsola();
		entradaDeporte.imprimirEnConsola();
		entradaInfantil.imprimirEnConsola();
		entradaTeatro.imprimirEnConsola();
	}
}
