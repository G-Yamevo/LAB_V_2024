package dominio;

public class EntradaDeporte extends Entrada {
	private static final float RECARGO_INTERNACIONAL = (float) 1.3;
	private static final float COSTO_FUTBOL = 300;
	private static final float COSTO_RUGBY = 450;
	private static final float COSTO_HOCKEY = 380;

	private boolean esInternacional;
	private String deporte;

	public EntradaDeporte(int numeroUnico, String nombreShow, String dia, String hora, String tiempoDuracion,
		 boolean esInternacional, String deporte) {
		super(numeroUnico, nombreShow, dia, hora, tiempoDuracion);
		this.esInternacional = esInternacional;
		this.deporte = deporte;
		calcularCosto();
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}

	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}


	@Override
	public String toString() {
		return "Entrada de Deportes [INTERNACIONAL:" + esInternacional + ", DEPORTE:" + deporte + ", NUMERO ENTRADA:"
				+ getNumeroUnico() + ", NOMBRE DEL SHOW:" + getNombreShow() + ", DIA:" + getDia() + ", HORARIO:"
				+ getHora() + ", DURACION: " + getTiempoDuracion() + ", COSTO ENTRADA:" + getCosto() + "]";
	}
	
	//Metodo abstracto
	@Override
	public float calcularCosto() {
		float precio = 0;
		switch (deporte.toLowerCase()) {
		case "futbol":
			precio = COSTO_FUTBOL;
			break;
		case "rugby":
			precio = COSTO_RUGBY;
			break;
		case "hockey":
			precio = COSTO_HOCKEY;
			break;
		default:
			throw new IllegalArgumentException("Deporte no reconocido");
		}

		if (esInternacional) {
			precio *= RECARGO_INTERNACIONAL;
		}
		
		return precio;
		
	}
	
}
