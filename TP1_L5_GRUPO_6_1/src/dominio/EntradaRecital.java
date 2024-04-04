package dominio;

import java.time.LocalDateTime;

import interfaces.ImprimibleEnConsola;


public class EntradaRecital extends Entrada implements ImprimibleEnConsola{
	private BandaRecitales banda;
	private Genero genero;
	private BandaRecitales bandaSoporte1;
	private BandaRecitales bandaSoporte2;
	private boolean esVip;
	private static final float NOVIP_COSTO = 800;
	private static final float VIP_COSTO = 1500;

	public EntradaRecital(String nombreShow, LocalDateTime fechaHora, String tiempoDuracion,
			BandaRecitales banda, Genero genero, BandaRecitales bandaSoporte1, BandaRecitales bandaSoporte2, boolean esVip) {
		super(nombreShow, fechaHora, tiempoDuracion);
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.esVip = esVip;
		this.costo = calcularCosto();
	}

	public BandaRecitales getBanda() {
		return banda;
	}

	public void setBanda(BandaRecitales banda) {
		this.banda = banda;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public BandaRecitales getBandaSoporte1() {
		return bandaSoporte1;
	}

	public void setBandaSoporte1(BandaRecitales bandaSoporte1) {
		this.bandaSoporte1 = bandaSoporte1;
	}

	public BandaRecitales getBandaSoporte2() {
		return bandaSoporte2;
	}

	public void setBandaSoporte2(BandaRecitales bandaSoporte2) {
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
	+ banda.toString() + ", GENERO: " + genero + ", BANDA SOPORTE 1: " + bandaSoporte1.toString() + ", BANDA SOPORTE 2: " + bandaSoporte2.toString() 
	+ ", VIP: " + ObtenerSiNo(esVip) + ", NOMBRE DEL SHOW: " + getNombreShow() + ", FECHA Y HORA: " + getFechaHora().toString() 
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

