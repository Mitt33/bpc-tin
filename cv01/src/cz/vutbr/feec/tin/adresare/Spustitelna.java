package cz.vutbr.feec.tin.adresare;

public class Spustitelna {
	public static void main(String[] args) {
		Adresar a1 = new Adresar();
		Adresar a2 = new Adresar();
		Adresar a3 = new Adresar();
		Adresar a4 = new Adresar();
		Adresar a5 = new Adresar();
		
		a1.levy = a4;
		a1.pravy = a2;
		
		a2.levy = a5;
		a2.pravy = a3;
	}
}
