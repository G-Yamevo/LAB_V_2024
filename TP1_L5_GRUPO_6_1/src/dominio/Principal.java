package dominio;

import interfaces.ImprimibleEnConsola;

public class Principal {

	public static void main(String[] args) {
		
		Generos[] generoRecital = new Generos[6];
		generoRecital[0] = new Generos("Rock");  //1
		generoRecital[0] = new Generos("Heavy Metal"); //2
		generoRecital[0] = new Generos("Reggaeton"); //3
		generoRecital[0] = new Generos("Trap"); //4
		generoRecital[0] = new Generos("Latinos"); //5
		generoRecital[0] = new Generos("Pop");//6
		
		Generos[] generoTeatro = new Generos[3];
		generoTeatro[0] = new Generos("Drama"); //1
		generoTeatro[1] = new Generos("Teatro"); //2
		generoTeatro[2] = new Generos("Comedia"); //3
		
		
		//Declaracion de las clases
		ImprimibleEnConsola entradaRecital = new EntradaRecital("Naranja Persa", "Lunes", "20:00", "2 horas",
				"Los Piojos", generoRecital[0], "Los Guasones", "Tributo al rock", false);
		ImprimibleEnConsola recitalVip = new EntradaRecital("Lollapalooza", "Sabado", "19:00", "4 horas", "Miranda", generoRecital[5],
				"Él Mató a un Policía Motorizado", "La Renga", true);
		
		ImprimibleEnConsola entradaFutbol = new EntradaDeporte("Test futbol", "1", "23:39", "3 horas", false,"Futbol");
		ImprimibleEnConsola entradaRugby = new EntradaDeporte("Pumas vs Inglaterra", "24/07/2024", "19:35", "2 horas", true, "Rugby");
		ImprimibleEnConsola entradaHockey = new EntradaDeporte("Las leonas vs España", "05/9/2024", "15:20", "2 horas", true, "Hockey");
		
		ImprimibleEnConsola entradaInfantil = new EntradaInfantil("Panam", "Viernes", "20:00 hrs", "2 hs", true, true);
		ImprimibleEnConsola entradaInfantil2 = new EntradaInfantil( "Piñon Fijo", "Domingo", "18:00 hrs", "3 hs", false, false);
		
		ImprimibleEnConsola entradaTeatro = new EntradaTeatro("FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs",
				generoTeatro[1], "Ricardo Darin", "Guillermo Francella", "Erica Rivas");
		
		
		
		// Impresiones por pantalla
		System.out.println("··················");
		entradaRecital.imprimirEnConsola();
		System.out.println("\t");
		recitalVip.imprimirEnConsola();
		System.out.println("··················");
		entradaFutbol.imprimirEnConsola();
		System.out.println("\t");
		entradaRugby.imprimirEnConsola();
		System.out.println("\t");
		entradaHockey.imprimirEnConsola();
		System.out.println("··················");
		entradaInfantil.imprimirEnConsola();
		System.out.println("\t");
		entradaInfantil2.imprimirEnConsola();
		System.out.println("\t");
		entradaTeatro.imprimirEnConsola();
	}
}
