package dominio;

public class Principal {

	public static void main(String[] args) {
		// Impresiones por pantalla
		System.out.println("··················");
		EntradaRecital recital = new EntradaRecital( "Naranja Persa", "Lunes", "20:00", "2 horas", "Los Piojos", "Rock",
				"Los Guasones", "Tributo al rock", false);
		System.out.println(recital.toString());
		System.out.println("··················");
		// Test de la clase EntradaDeporte
		Entrada entradaDeporte = new EntradaDeporte( "Test futbol", "1", "23:39", "3 horas", false, "Futbol");
		System.out.println(entradaDeporte.toString());
		System.out.println("··················");
		// Test para la entrada del Evento Infantil
		Entrada entradaInfantil = new EntradaInfantil( "Panam", "Viernes", "20:00 hrs", "2 hs", true, true);
		System.out.println(entradaInfantil.toString());
		System.out.println("··················");
		// Test para la entrada del EntradaTeatro
		EntradaTeatro entradaTeatro = new EntradaTeatro( "FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs", "Drama",
				"Ricardo Darin", "Guillermo Francella", "Erica Rivas");
		System.out.println(entradaTeatro.toString());
	}
}
