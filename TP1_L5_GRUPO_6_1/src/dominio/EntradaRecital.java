package dominio;

import interfaces.ImprimibleEnConsola;


public class EntradaRecital extends Entrada implements ImprimibleEnConsola{
	private String banda;
	private String genero;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private boolean esVip;
	private static final float NOVIP_COSTO = 800;
	private static final float VIP_COSTO = 1500;

	public EntradaRecital(String nombreShow, String dia, String hora, String tiempoDuracion,
			String banda, String genero, String bandaSoporte1, String bandaSoporte2, boolean esVip) {
		super(nombreShow, dia, hora, tiempoDuracion);
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.esVip = esVip;
		this.costo = calcularCosto();
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
	
	//Metodo abstracto
	@Override
	public float calcularCosto() {
		if (esVip) {
			return VIP_COSTO;
		} else {
			return NOVIP_COSTO;
		}
	}
	@Override
	public String toString() {
		return "NUMERO DE ENTRADA: " + getNumeroUnico() + ", ENTRADA DE " + obtenerTipoEntrada() + ", BANDA PRINCIPAL: " 
	+ banda + ", GENERO: " + genero + ", BANDA SOPORTE 1: " + bandaSoporte1 + ", BANDA SOPORTE 2: " + bandaSoporte2 
	+ ", VIP: " + ObtenerSiNo(esVip) + ", NOMBRE DEL SHOW: " + getNombreShow() + ", DIA: " + getDia() + ", HORARIO: " + getHora() 
	+ ", DURACION: " + getTiempoDuracion() + ", COSTO ENTRADA: " + getCosto();
	}

	
	@Override
    public String obtenerTipoEntrada() {
		return "RECITAL";	
    }

	
	//Metodo interface
	@Override
	public void imprimirEnConsola() {
		System.out.println(this.toString());

	}
}

