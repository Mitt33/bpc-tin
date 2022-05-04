package cz.vutbr.feec.tin.mnoziny;

import java.util.HashSet;

import cz.vutbr.feec.tin.Auto;

public class Spustitelna {
	public static void main(String[] args) {
		HashSet<Auto> mn = new HashSet<>();
		mn.add(new Auto("SKODA", 100, 100));
		mn.add(new Auto("BMW", 100, 100));
		mn.add(new Auto("AUDI", 100, 100));
		
		System.out.println(mn.size());
	}
}
