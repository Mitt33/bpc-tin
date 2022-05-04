package cz.vutbr.feec.tin.pakety;

public class Spustitelna {
	public static void main(String[] args) {
		Paket p1 = new Paket();
		Paket p2 = new Paket();
		Paket p3 = new Paket();
		Paket p4 = new Paket();
		
		p1.dalsi = p2;
		p2.dalsi = p3;
		p3.dalsi = p4;
		// p4.dalsi = p1; // Priklad 4  
	}
}
