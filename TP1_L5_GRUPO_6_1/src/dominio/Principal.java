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
	}
	
}