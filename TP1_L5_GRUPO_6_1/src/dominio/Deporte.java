package dominio;

public class Deporte {
	private int nroDeporte;
	private String nombreDeporte;
	private static int cont = 0;
	public Deporte(String nombreDeporte) {
		super();
		this.nroDeporte = ++cont;
		this.nombreDeporte = nombreDeporte;
	}
	public int getNroDeporte() {
		return nroDeporte;
	}
	public void setNroDeporte(int nroDeporte) {
		this.nroDeporte = nroDeporte;
	}
	public String getNombreDeporte() {
		return nombreDeporte;
	}
	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	@Override
	public String toString() {
		return nroDeporte + " - NOMBRE DEL DEPORTE: " + nombreDeporte;
	}
}
