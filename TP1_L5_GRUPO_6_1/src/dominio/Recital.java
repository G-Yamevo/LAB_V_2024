package dominio;

public class Recital extends Entrada {
	private String banda;
	private String genero;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private boolean esVip;
	private static final float NOVIP_COSTO = 800;
	private static final float VIP_COSTO = 1500;

	public Recital(int numeroUnico, String nombreShow, String dia, String hora, String tiempoDuracion, float costo,
			String banda, String genero, String bandaSoporte1, String bandaSoporte2, boolean esVip) {
		super(numeroUnico, nombreShow, dia, hora, tiempoDuracion, costo);
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.esVip = esVip;
		setCosto(calcularCosto());
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getBandaSoporte1() {
		return bandaSoporte1;
	}

	public void setBandaSoporte1(String bandaSoporte1) {
		this.bandaSoporte1 = bandaSoporte1;
	}

	public String getBandaSoporte2() {
		return bandaSoporte2;
	}

	public void setBandaSoporte2(String bandaSoporte2) {
		this.bandaSoporte2 = bandaSoporte2;
	}

	public boolean isVip() {
		return esVip;
	}

	public void setVip(boolean esVip) {
		this.esVip = esVip;
	}

	public float calcularCosto() {
		if (esVip) {
			return VIP_COSTO;
		} else {
			return NOVIP_COSTO;
		}
	}

	@Override
	public String toString() {
		return "Recital [banda=" + banda + ", genero=" + genero + ", bandaSoporte1=" + bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", esVip=" + esVip + ", getNumeroUnico()="
	            + getNumeroUnico() + ", getNombreShow()=" + getNombreShow() + ", getDia()=" + getDia() + ", getHora()="
				+ getHora() + ", getTiempoDuracion()=" + getTiempoDuracion() + ", getCosto()=" + getCosto() + "]";
	}
}
