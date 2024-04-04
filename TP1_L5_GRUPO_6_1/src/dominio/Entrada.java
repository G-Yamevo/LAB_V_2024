package dominio;

import java.time.LocalDateTime;

public abstract class Entrada {

	private int numeroUnico;
	private String nombreShow;
	private LocalDateTime fechaHora;
	private String tiempoDuracion;
	protected float costo;
	private static int cont = 0;

	
	public Entrada(String nombreShow, LocalDateTime fechaHora, String tiempoDuracion) {
		aumentarContador();
		this.numeroUnico = cont;
		this.nombreShow = nombreShow;
		this.fechaHora = fechaHora;
		this.tiempoDuracion = tiempoDuracion;
	}

	public int getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(int numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	public String getNombreShow() {
		return nombreShow;
	}

	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}

	public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

	public String getTiempoDuracion() {
		return tiempoDuracion;
	}

	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}

	public float getCosto() {
		return costo;
	}

	public static void aumentarContador() {
		Entrada.cont++;
	}

	public String ObtenerSiNo(boolean valor) {
		if (valor)
			return "SI";
		else
			return "NO";
	}

	// Metodos abstractos
	public abstract float calcularCosto();

	public abstract String obtenerTipoEntrada();
}
