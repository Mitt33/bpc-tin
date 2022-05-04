package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole zadani) {
		
		// TIP: Vyzkousejte s ruznyma strukturama
		//HashSet<HraciPole> closed = new HashSet<HraciPole>();
		//TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
		LinkedList<HraciPole> open = new LinkedList<HraciPole>();
		closed.add(zadani);
		open.add(zadani);
		while(!open.isEmpty()) {
			HraciPole tmp = open.pop();
			if(tmp.jeReseni()) {
				System.out.println("Reseni nalezeno: ");
				System.out.println(tmp);
				return;
			}
			for (int i = 1; i <= 4; i++) {
				HraciPole p = tmp.klonujAPohni(i);
				if(p != null && !closed.contains(p)) {
					open.add(p);
					closed.add(p);
				}
			}
		}
		System.out.println("Nema reseni!");
	}
}
