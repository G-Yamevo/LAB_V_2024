package dominio;

public class EventoInfantil extends Entrada {
	private boolean souvenir;
	private boolean menor;
	private static final float MENOR8_COSTO = 250;
	private static final float MAYOR8_COSTO = 500;
	
	public EventoInfantil(int numeroUnico, String nombreShow, String dia, String hora, String tiempoDuracion,
			float costo, boolean souvenir, boolean menor) {
		super(numeroUnico, nombreShow, dia, hora, tiempoDuracion, costo);
		this.souvenir = souvenir;
		this.menor = menor;
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

	public float calcularCosto() {
		if (menor) {
			return MENOR8_COSTO;
		} else {
			return MAYOR8_COSTO;
		}
	}

	@Override
	public String toString() {
		return "EventoInfantil [souvenir=" + souvenir + ", menor=" + menor + "]";
	}
}
