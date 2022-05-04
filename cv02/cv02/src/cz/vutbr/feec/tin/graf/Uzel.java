package cz.vutbr.feec.tin.graf;

import java.util.Vector;

public class Uzel {
	private Vector<Uzel> sousede = new Vector<>();
	public void pridejSouseda(Uzel u) {
		sousede.add(u);
	}
}
