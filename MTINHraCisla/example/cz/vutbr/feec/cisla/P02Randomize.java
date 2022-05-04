package cz.vutbr.feec.cisla;

import java.util.Random;

import cz.vutbr.feec.cisla.HraciPole;

/**
 * Tento priklad demonstruje jak nahodne zamichat pocatecni reseni s pomoci
 * 10000 nahodnych tahu.
 */
public class P02Randomize {
	public static void main(String[] args) {
		HraciPole g = new HraciPole();
		Random rnd = new Random();
		int j = 0;
		for (int i = 0; i < 100000; i++) {
			// nahodne cislo 0 - 3
			int nahodne = rnd.nextInt(4);
			if(g.pohni(1 + nahodne) == true) {
				j++;
			}
			
		}
		System.out.println(g);
		System.out.println(j);
	}
}
