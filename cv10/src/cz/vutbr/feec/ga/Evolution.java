package cz.vutbr.feec.ga;

import java.io.IOException;

public class Evolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tournament ts = new Tournament();
		
		int pocetEvoluci = 50000;
		
		Population p1 = new Population(100);
		
		for (int i = 0; i < pocetEvoluci; i++) {
			
			for (int j = 0; j < 30; j++) {
				p1.krizeni(j);
			}
			
			for (int j = 0; j < 60; j++) {
				p1.mutate(j);
			}
			
			p1 = ts.selection(p1, 100);
			
			if (i % 10 == 0) {
				Chromozome nejlepsi = p1.get(i);
				try {
					Fitness eval = new Fitness("image/orloj.jpg");
					long error = eval.getFitness(nejlepsi);
					ShowChromozome.show(nejlepsi, "Nejlepsi z evoluce " + i + " ." + error);
					System.out.println(error);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

	}

}
