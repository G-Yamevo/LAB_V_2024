package dominio;

public abstract class Entrada {
	
	private int numeroUnico;
	private String nombreShow;
	private String dia;
	private String hora;
	private String tiempoDuracion;
	protected float costo;
	private static int cont=0;
	//constructores
	public Entrada() {
		cont ++;
		this.numeroUnico=cont;
		this.nombreShow = " Ingrese el nombreShow";
		this.dia = "Ingrese el dia";
		this.hora = "Ingrese la hora";
		this.tiempoDuracion = "Ingrese tiempoDuracion";
	}
	
	public Entrada( String nombreShow, String dia, String hora, String tiempoDuracion) {
		cont ++;
		this.numeroUnico = cont;
		this.nombreShow = nombreShow;
		this.dia = dia;
		this.hora = hora;
		this.tiempoDuracion = tiempoDuracion;
	}
	
//Getters and Setters
	public int getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(int numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public String getNombreShow() {
		return nombreShow;
	}
	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getTiempoDuracion() {
		return tiempoDuracion;
	}
	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	public float getCosto() {
		return costo;
	}
	
	//Metodos abstractos
	public abstract float calcularCosto();	
	
	public abstract String obtenerTipoEntrada();
}
