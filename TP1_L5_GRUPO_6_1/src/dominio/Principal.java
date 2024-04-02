package dominio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recital recital = new Recital(123, "Nombre del Recital", "Lunes", "20:00", "2 horas", 800, "Banda 1", "Rock",
				"Banda Soporte 1", "Banda Soporte 2", false);
		System.out.println(recital.getCosto());
		
		// Test de la clase EntradaDeporte
		EntradaDeporte entradaDeporte = new EntradaDeporte(1, "Test futbol", "1", "23:39", "3 horas",  false,
				"Futbol");
		System.out.println(entradaDeporte.toString());
		
		// Test para la entrada del Evento Infantil
		EventoInfantil entradaInfantil = new EventoInfantil (234, "Panam", "Viernes", "20:00 hrs", "2 hs", 250, true, true);
		System.out.println(entradaInfantil.toString());
		
		// Test para la entrada del Teatro
		Teatro entradaTeatro = new Teatro (234, "FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs", (float) 1350.50, "Drama", "Ricardo Darin", "Guillermo Francella", "Erica Rivas");
		System.out.println(entradaTeatro.toString());
		}
		
		
	}
