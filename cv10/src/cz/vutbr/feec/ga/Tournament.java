package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.Random;

public class Tournament {
	private Fitness eval;
	private Random rnd = new Random();
	
	public Population selection(Population p, int pocet) {
		Population p2 = new Population(0);
		try {
			eval = new Fitness("image/orloj.jpg");
			for (int i = 0; i < pocet; i++) {
				int nahodnyIndex1 = rnd.nextInt(p.size());
				Chromozome ch1 = p.get(nahodnyIndex1);
				p.remove(ch1);
				
				int nahodnyIndex2 = rnd.nextInt(p.size());
				Chromozome ch2 = p.get(nahodnyIndex2);
				p.remove(ch2);
				
				if(eval.getFitness(ch1) < eval.getFitness(ch2)) {
					p2.add(ch1);
				}
				else {
					p2.add(ch2);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p2;
		
	}


}
