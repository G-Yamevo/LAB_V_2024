package dominio;

public class EntradaInfantil extends Entrada{
	private boolean souvenir;
	private boolean menor;
	private static final float MENOR8_COSTO = 250;
	private static final float MAYOR8_COSTO = 500;
	
	public EntradaInfantil(String nombreShow, String dia, String hora, String tiempoDuracion, boolean souvenir, boolean menor) {
		super(nombreShow, dia, hora, tiempoDuracion);
		this.souvenir = souvenir;
		this.menor = menor;
		this.costo = calcularCosto();
	}

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	public boolean isMenor() {
		return menor;
	}

	public void setMenor(boolean menor) {
		this.menor = menor;
	}

	//Metodo abstracto
	@Override
	public float calcularCosto() {
		if (menor) {
			return MENOR8_COSTO;
		} else {
			return MAYOR8_COSTO;
		}
	}

	@Override
	public String toString() {
		return "NUMERO DE ENTRADA: " + getNumeroUnico() + ", TIPO ENTRADA: " + obtenerTipoEntrada() + ", SOUVENIR: " 
	+ souvenir + ", ES MENOR: " + ObtenerSiNo(menor) + ", NOMBRE DEL SHOW: " + getNombreShow()  + ", DIA: " + getDia() + ", HORARIO: " 
	+ getHora() + ", DURACION: " + getTiempoDuracion() + ", COSTO ENTRADA: " + getCosto();
	}
	
	//Interface method
	@Override
    public String obtenerTipoEntrada() {
		return "EVENTO INFANTIL";	
    }
}
