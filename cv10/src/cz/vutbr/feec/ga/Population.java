package cz.vutbr.feec.ga;

import java.util.LinkedList;
import java.util.Random;

public class Population {
	private LinkedList<Chromozome> chromozomes = new LinkedList<Chromozome>();
	private Random rnd = new Random();
	private Fitness f;
	
	
	public Population(int size) {
		for(int i =0; i < size; i++) {
			Chromozome ch = new Chromozome();
			ch.mutateAll();
			chromozomes.add(ch);
		}
	}	
	public void mutate(int pocetMutaci) {
		for (int i = 0; i < pocetMutaci; i++) {
			Chromozome ch = chromozomes.get(rnd.nextInt(chromozomes.size()));
			ch.mutation(0.01);
		}
	}
	
	public void krizeni(int pocetKrizeni) {
		for (int i = 0; i < pocetKrizeni; i++) {
			Chromozome ch1 = chromozomes.get(rnd.nextInt(chromozomes.size()));
			Chromozome ch2 = chromozomes.get(rnd.nextInt(chromozomes.size()));

			ch1 = ch1.cloneChromozome();
			ch2 = ch2.cloneChromozome();
			ch1.crossOver(ch2);
			chromozomes.add(ch1);
			chromozomes.add(ch2);
		}
	}

	
	public void add(Chromozome ch) {
		chromozomes.add(ch);
	}
	
	public void remove(Chromozome ch) {
		chromozomes.remove(ch);
	}
	
	public int size() {
		return chromozomes.size();
	}

	public Chromozome get(int nahodnyIndex) {
		return chromozomes.get(nahodnyIndex);
	}


}
