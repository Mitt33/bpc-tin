package cz.vutbr.feec.tin;

public class Spustitelna {
	public static void main(String[] args) {
		Mapa m = new Mapa();
		m.pridejAuto(new Auto("SKODA", 100, 200));
		m.pridejAuto(new Auto("BMW", 10, 50));
		m.pridejAuto(new Auto("AUDI", 50, 100));
	}
}
