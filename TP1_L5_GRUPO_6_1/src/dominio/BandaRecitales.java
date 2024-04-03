package dominio;

public class BandaRecitales {
	private int nroBanda;
	private String nombreBanda;
	private static int cont = 0;
	
	public BandaRecitales(String nombreBanda) {
		super();
		this.nroBanda = ++cont;
		this.nombreBanda = nombreBanda;
	}
	public int getNroBanda() {
		return nroBanda;
	}
	public void setNroBanda(int nroBanda) {
		this.nroBanda = nroBanda;
	}
	public String getNombreBanda() {
		return nombreBanda;
	}
	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}
	@Override
	public String toString() {
		return nroBanda + " - NOMBRE DE LA BANDA: " + nombreBanda;
	}
}
