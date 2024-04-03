package dominio;

public class Generos {
	


	private int nroGenero;
	private String nombreGenero;
	
	private static int cont = 0;	
	
	public Generos(String nombreGenero) {
		super();
		this.nroGenero = cont++;
		this.nombreGenero = nombreGenero;
	}
	public int getNroGenero() {
		return nroGenero;
	}
	public void setNroGenero(int nroGenero) {
		this.nroGenero = nroGenero;
	}
	public String getNombreGenero() {
		return nombreGenero;
	}
	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	
	@Override
	public String toString() {
		return nroGenero + " - NOMBRE DEL GENERO: " + nombreGenero;
	}
}
