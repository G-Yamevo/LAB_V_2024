package dominio;

import java.util.ArrayList;
import java.util.List;

import interfaces.ImprimibleEnConsola;

public class Principal {

	public static void main(String[] args) {
		List<Genero> generosRecitales = new ArrayList<>();
		generosRecitales.add(new Genero("Rock"));
		generosRecitales.add(new Genero("Heavy Metal"));
		generosRecitales.add(new Genero("Reggaeton"));
		generosRecitales.add(new Genero("Trap"));
		generosRecitales.add(new Genero("Latinos"));
		generosRecitales.add(new Genero("Pop"));
		List<Genero> generosTeatro = new ArrayList<>();
		generosTeatro.add(new Genero("Drama"));
		generosTeatro.add(new Genero("Teatro"));
		generosTeatro.add(new Genero("Comedia"));
		List<Deporte> deportes = new ArrayList<>();
		deportes.add(new Deporte("Futbol"));
		deportes.add(new Deporte("Hockey"));
		deportes.add(new Deporte("Rugby"));
		List<BandaRecitales> bandas = new ArrayList<>();
		bandas.add(new BandaRecitales("Los Piojos"));
		bandas.add(new BandaRecitales("Miranda"));
		List<BandaRecitales> bandasSoporte = new ArrayList<>();
		bandasSoporte.add(new BandaRecitales("Vox Dei"));
		bandasSoporte.add(new BandaRecitales("León Gieco"));
		bandasSoporte.add(new BandaRecitales("Soda Stereo"));
		bandasSoporte.add(new BandaRecitales("Los Fabulosos Cadillacs"));
		List<ImprimibleEnConsola> entradas = new ArrayList<>();
		entradas.add(new EntradaRecital("Naranja Persa", "Lunes", "20:00", "2 horas", bandas.get(0),
				generosRecitales.get(0), bandasSoporte.get(0), bandasSoporte.get(1), false));
		entradas.add(new EntradaRecital("Lollapalooza", "Sabado", "19:00", "4 horas", bandas.get(1),
				generosRecitales.get(5), bandasSoporte.get(2), bandasSoporte.get(3), true));
		entradas.add(new EntradaDeporte("Test futbol", "1", "23:39", "3 horas", false, deportes.get(0)));
		entradas.add(
				new EntradaDeporte("Pumas vs Inglaterra", "24/07/2024", "19:35", "2 horas", true, deportes.get(1)));
		entradas.add(
				new EntradaDeporte("Las leonas vs España", "05/9/2024", "15:20", "2 horas", true, deportes.get(2)));
		entradas.add(new EntradaInfantil("Panam", "Viernes", "20:00 hrs", "2 hs", true, true));
		entradas.add(new EntradaInfantil("Piñon Fijo", "Domingo", "18:00 hrs", "3 hs", false, false));
		entradas.add(new EntradaTeatro("FANTASMA DE LA OPERA", "Sabado", "22:00 hrs", "3 hs", generosTeatro.get(1),
				"Ricardo Darin", "Guillermo Francella", "Erica Rivas"));
		for (ImprimibleEnConsola entrada : entradas) {
			entrada.imprimirEnConsola();
		}
	}
}
