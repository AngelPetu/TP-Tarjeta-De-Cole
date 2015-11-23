
import java.util.ArrayList;
import java.util.Date;

public class Tarjeta {

	private int id;
	private Date horario;
	private double saldo;
	private double monto;
	private double boleto;
	
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	

	Tarjeta(int id, double saldo) {
		this.id = id;
		this.horario = horario;
		this.saldo = saldo;
		this.monto = monto;
		this.boleto = boleto;
		this.viajes = viajes;
	}

	public int id() {
		return id;
	}

	public void PagarBoleto(int colectivo) {
		
		//viajes.add(V);
		saldo = saldo - boleto;
		
		//return true o false
		
	}

	public void Recarga(double monto) {
		saldo = saldo + monto;
	}

	public double Saldo() {
		return saldo;
	}

	public ArrayList<Viaje> ViajesRealizados() {

		return viajes;
	}

}
