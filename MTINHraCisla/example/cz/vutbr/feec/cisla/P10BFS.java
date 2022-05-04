package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = new HraciPole();
		for (int i = 0; i < 10000; i++) {
			h.pohni(new Random().nextInt(4)+ 1);
		}
		System.out.println(h);
		BFS bfs = new BFS();
		bfs.vypisTahy(h);
		h.pohni(1);
		
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		closed.add(h);
		fronta.add(h);
		while(!fronta.isEmpty()) {
			HraciPole tmp = fronta.pop();
			if(tmp.jeReseni()) {
				System.out.println("Reseni nalezeno: ");
				System.out.println(tmp);
				return;
			}
			for (int i = 1; i <= 4; i++) {
				HraciPole p = tmp.klonujAPohni(i);
				if(p != null && !closed.contains(p)) {
					fronta.add(p);
					closed.add(p);
				}
			}
		}
	}
}
