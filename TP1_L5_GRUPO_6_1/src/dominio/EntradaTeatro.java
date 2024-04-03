package dominio;

import interfaces.IGenero;

public class EntradaTeatro extends Entrada implements IGenero{

	//atributos
	
	private String genero;
	private String actorPrincipal1;
	private String actorPrincipal2;
	private String actorPrincipal3;
	
	//Constructor
	public EntradaTeatro( String nombreShow, String dia, String hora, String tiempoDuracion, 
			String genero, String actorPrincipal1, String actorPrincipal2,String actorPrincipal3) {
		super(nombreShow, dia, hora, tiempoDuracion);
		this.genero = genero;
		this.actorPrincipal1 = actorPrincipal1;
		this.actorPrincipal2 = actorPrincipal2;
		this.actorPrincipal3 = actorPrincipal3;
		this.costo = calcularCosto();
	}
	
//Getters and Setters
	
  public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
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
	//Metodo abstracto
	@Override
	public float calcularCosto() {
	    
	        return (float) 1350.50;
	    }
	
	@Override
	public String toString() {
		return "Entrada de EntradaTeatro [NUMERO ENTRADA:"+ getNumeroUnico() + " GENERO:" + genero + ", ACTOR PRINCIPAL 1:" + actorPrincipal1 + ", ACTOR PRINCIPAL 2:" + actorPrincipal2 + ", ACTOR PRINCIPAL 3:" + actorPrincipal3 + ",  NOMBRE DEL SHOW:" + getNombreShow() + ", DIA:" + getDia() + ", HORARIO:"
				+ getHora() + ", DURACION:" + getTiempoDuracion() + ", COSTO ENTRADA:" + getCosto() + "]";
	}
	
	//Metodo Interface
	@Override
	public void mostrarGenero() {
		System.out.println("Genero de la obra: " + getGenero());
		
	}
	 
	
}
