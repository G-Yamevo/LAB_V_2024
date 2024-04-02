package dominio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("··················");
		Recital recital = new Recital(123, "Naranja Persa", "Lunes", "20:00", "2 horas", 800, "Los Piojos", "Rock",
				"Los Guasones", "Tributo al rock", false);
		System.out.println(recital.toString());
		System.out.println("··················");
		// Test de la clase EntradaDeporte
		EntradaDeporte entradaDeporte = new EntradaDeporte(1, "Test futbol", "1", "23:39", "3 horas",  false,
				"Futbol");
		System.out.println(entradaDeporte.toString());
		System.out.println("··················");
		// Test para la entrada del Evento Infantil
		EventoInfantil entradaInfantil = new EventoInfantil (234, "Panam", "Viernes", "20:00 hrs", "2 hs", 250, true, true);
		System.out.println(entradaInfantil.toString());
		System.out.println("··················");
		// Test para la entrada del Teatro
		Teatro entradaTeatro = new Teatro (234, "FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs", (float) 1350.50, "Drama", "Ricardo Darin", "Guillermo Francella", "Erica Rivas");
		System.out.println(entradaTeatro.toString());
		}
		
		
	}
