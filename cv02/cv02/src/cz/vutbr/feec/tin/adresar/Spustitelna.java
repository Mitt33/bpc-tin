package cz.vutbr.feec.tin.adresar;

public class Spustitelna {
	public static void main(String[] args) {
		Adresar a1 = new Adresar();
		Adresar a2 = new Adresar();
		Adresar a3 = new Adresar();
		Adresar a4 = new Adresar();
		Adresar a5 = new Adresar();
		
		a1.setLevy(a4);
		a1.setPravy(a2);
		
		a2.setLevy(a5);
		a2.setPravy(a3);
	}
}
