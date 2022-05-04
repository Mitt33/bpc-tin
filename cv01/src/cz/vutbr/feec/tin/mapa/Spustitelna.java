package cz.vutbr.feec.tin.mapa;

public class Spustitelna {
	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.nazev = "BMW";
		a1.x = 100;
		a1.y = 100;
		
		Auto a2 = new Auto();
		a2.nazev = "BMWmodre";
		a2.x = 200;
		a2.y = 100;
		
		Auto a3 = new Auto();
		a3.nazev = "cerne";
		a3.x = 200;
		a3.y = 200;
		
		Auto a4 = new Auto();
		a4.nazev = "cerne2";
		a4.x = 20;
		a4.y = 10;
		
		Mapa m = new Mapa();
		m.a1 = a1;
		m.a2 = a2;
		m.a3 = a3;
		m.a4 = a4;
		
	}
}
