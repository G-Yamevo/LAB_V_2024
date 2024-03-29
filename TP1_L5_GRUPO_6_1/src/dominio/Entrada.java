package dominio;

public abstract class Entrada {
	
	private int numeroUnico;
	private String nombreShow;
	private String dia;
	private String hora;
	private String tiempoDuracion;
	private float costo;
	
	
	public Entrada(int numeroUnico, String nombreShow, String dia, String hora, String tiempoDuracion, float costo) {
		super();
		this.numeroUnico = numeroUnico;
		this.nombreShow = nombreShow;
		this.dia = dia;
		this.hora = hora;
		this.tiempoDuracion = tiempoDuracion;
		this.costo = costo;
	}
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
	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	
}
