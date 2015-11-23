
public class Principal {
	public static void main(String[] args) {

		/*Tarjeta T1 = new Tarjeta(1000, 100.0);
		System.out.println("Saldo= "+ T1.Saldo());
		
		T1.Recarga(25.0);
		System.out.println("Saldo= "+ T1.Saldo());
		
		T1.PagarBoleto(113);
		System.out.println("Saldo= "+ T1.Saldo());
		*/
		
		Viaje V = new Viaje(false, true);
		
		System.out.println("Valor del  boleto =" + V.calculoBoleto());

	}

}
