package dominio;

class Recital extends Entrada {
	private String banda;
	private String genero;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private boolean vip;
	
	public Recital(int numeroUnico, String nombreShow, String dia, String hora, String tiempoDuracion, 
			float costo, String banda, String genero, String bandaSoporte1, String bandaSoporte2, boolean vip) {
		super(numeroUnico, nombreShow, dia, hora, tiempoDuracion, costo);
		this.banda = banda;
		this.genero = genero;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.vip = vip;
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
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public float calcularCosto() {
	    if (vip) {
	        return 1500;
	    } else {
	        return 800;
	    }
	}
}
