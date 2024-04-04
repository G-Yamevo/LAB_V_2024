package dominio;

import java.time.LocalDateTime;

import interfaces.ImprimibleEnConsola;

public class EntradaTeatro extends Entrada implements ImprimibleEnConsola {

	// atributos

	private Genero genero;
	private String actorPrincipal1;
	private String actorPrincipal2;
	private String actorPrincipal3;

	// Constructor
	public EntradaTeatro(String nombreShow, LocalDateTime fechaHora, String tiempoDuracion, Genero genero,
			String actorPrincipal1, String actorPrincipal2, String actorPrincipal3) {
		super(nombreShow, fechaHora, tiempoDuracion);
		this.genero = genero;
		this.actorPrincipal1 = actorPrincipal1;
		this.actorPrincipal2 = actorPrincipal2;
		this.actorPrincipal3 = actorPrincipal3;
		this.costo = calcularCosto();
	}

	// Getters and Setters

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getActorPrincipal1() {
		return actorPrincipal1;
	}

	public void setActorPrincipal1(String actorPrincipal1) {
		this.actorPrincipal1 = actorPrincipal1;
	}

	public String getActorPrincipal2() {
		return actorPrincipal2;
	}

	public void setActorPrincipal2(String actorPrincipal2) {
		this.actorPrincipal2 = actorPrincipal2;
	}

	public String getActorPrincipal3() {
		return actorPrincipal3;
	}

	public void setActorPrincipal3(String actorPrincipal3) {
		this.actorPrincipal3 = actorPrincipal3;
	}

	// Metodo abstracto
	@Override
	public float calcularCosto() {

		return (float) 1350.50;
	}

	@Override
	public String toString() {
		return "NUMERO DE ENTRADA: " + getNumeroUnico() + ", ENTRADA DE " + obtenerTipoEntrada() + ", GENERO: " + genero
				+ ", ACTOR PRINCIPAL 1: " + actorPrincipal1 + ", ACTOR PRINCIPAL 2: " + actorPrincipal2
				+ ", ACTOR PRINCIPAL 3: " + actorPrincipal3 + ", NOMBRE DEL SHOW: " + getNombreShow() + ", FECHA Y HORA: "
				+ getFechaHora().toString() + ", DURACION: " + getTiempoDuracion() + ", COSTO ENTRADA: "
				+ getCosto();
	}

	@Override
	public String obtenerTipoEntrada() {
		return "TEATRO";
	}

	// Interface method
	@Override
	public void imprimirEnConsola() {
		System.out.println(this.toString());
	}

}
