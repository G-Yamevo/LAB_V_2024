package dominio;

import interfaces.ImprimibleEnConsola;

public class EntradaDeporte extends Entrada implements ImprimibleEnConsola {
	private static final float RECARGO_INTERNACIONAL = (float) 1.3;
	private static final float COSTO_FUTBOL = 300;
	private static final float COSTO_RUGBY = 450;
	private static final float COSTO_HOCKEY = 380;

	private boolean esInternacional;
	private Deporte deporte;

	public EntradaDeporte(String nombreShow, String dia, String hora, String tiempoDuracion, boolean esInternacional,
			Deporte deporte) {
		super(nombreShow, dia, hora, tiempoDuracion);
		this.esInternacional = esInternacional;
		this.deporte = deporte;
		this.costo = calcularCosto();
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}

	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "NUMERO DE ENTRADA: " + getNumeroUnico() + ", ENTRADA DE " + obtenerTipoEntrada()
				+ ", ES INTERNACIONAL: " + ObtenerSiNo(esInternacional) + ", DEPORTE: " + deporte.toString()
				+ ", NOMBRE DEL SHOW: " + getNombreShow() + ", DIA: " + getDia() + ", HORARIO: " + getHora()
				+ ", DURACION: " + getTiempoDuracion() + ", COSTO ENTRADA: " + getCosto();
	}

	// Metodo abstracto
	@Override
	public float calcularCosto() {
		float precio = 0;
		switch (this.getDeporte().getNombreDeporte().toLowerCase()) {
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

	@Override
	public String obtenerTipoEntrada() {
		return "DEPORTE";
	}

	
	@Override
	public void imprimirEnConsola() {
		System.out.println(this.toString());

	}
}
