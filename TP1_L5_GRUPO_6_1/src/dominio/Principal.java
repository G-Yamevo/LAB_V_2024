package dominio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recital recital = new Recital(123, "Nombre del Recital", "Lunes", "20:00", "2 horas", 800, "Banda 1", 
				"Rock", "Banda Soporte 1", "Banda Soporte 2", false);
		System.out.println(recital.getCosto());
	}
}