package cz.vutbr.feec.tin.hracisla;

import java.util.HashSet;

public class Spustitelna {
	public static void main(String[] args) {
		HraciPole h1 = new HraciPole();

		HraciPole h2 = new HraciPole();
		h2.posun(HraciPole.DOLU);
		//h2.posun(HraciPole.NAHORU);
		
		System.out.println(h1);
		System.out.println(h2);
		
		HashSet<HraciPole> mn = new HashSet<>();
		mn.add(h1);
		mn.add(h2);
		
		System.out.println(mn.size());
	}
}
