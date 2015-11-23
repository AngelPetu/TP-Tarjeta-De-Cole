import java.util.Date;

public class Viaje {
	public Date Fecha;
	private boolean transbordo;
	private boolean medioBoleto;
	private double valor;
	private Colectivo cole;

	Viaje(boolean medioBoletoo, boolean transbordo) {
		this.transbordo = transbordo;
		this.medioBoleto = medioBoleto;
		this.valor = valor;
	}

	public double calculoBoleto() {

		if (medioBoleto == true) {
			if (transbordo == true) {
				valor = 0.96;

			} else {
				valor = 2.9;
			}

		} else {
			if (transbordo == true) {
				valor = 1.9;

			} else {
				valor = 5.75;
			}

		}
		return valor;
	}

	public boolean isTransbordo() {
		return transbordo;
	}

	public void setTransbordo(boolean transbordo) {
		this.transbordo = transbordo;
	}

	public boolean isMedioBoleto() {
		return medioBoleto;
	}

	public void setMedioBoleto(boolean medioBoleto) {
		this.medioBoleto = medioBoleto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}