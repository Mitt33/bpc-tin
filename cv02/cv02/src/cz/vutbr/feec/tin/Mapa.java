package cz.vutbr.feec.tin;

import java.util.Vector;

public class Mapa {
	private Vector<Auto> auta = new Vector<>();
	
	public void pridejAuto(Auto auto) {
		this.auta.add(auto);
	}
	
	public Auto getAuto(int index) {
		return auta.get(index);
	}
	
	public int pocetAut() {
		return auta.size();
	}
	
	public void odstraAuto(int index) {
		auta.remove(index);
	}
	
	public void vypisVsechnaAuta() {
		for (Auto auto : auta) {
			System.out.println(auto.getNazev());
		}
	}
	
}
