package cz.vutbr.feec.tin.hracisla;

import java.util.Arrays;

public class HraciPole {
	private int[][] data = {{0,1,2}, {3,4,5}, {6,7,8}};
	private int pozX = 0;
	private int pozY = 0;
	
	public static final int NAHORU = 0;
	public static final int DOLU = 1;
	public static final int DOLEVA = 2;
	public static final int DOPRAVA = 3;
	
	@Override
	public String toString() {
		String res = "";
		for (int y = 0; y < data[0].length; y++) {
			for (int x = 0; x < data.length; x++) {
				res += data[y][x]+" ";
			}
			res += "\n";
		}
		return res;
	}

	public void posun(int smer) {
		switch (smer) {
		case DOLU:
			if(pozY >= 2) break; // tah neni mozny
			// prohod s dalsim
			data[pozY][pozX] = data[pozY + 1][pozX];
			data[pozY + 1][pozX] = 0;
			pozY ++;
			break;
		case NAHORU:
			if(pozY <= 0) break; // tah neni mozny
			// prohod s dalsim
			data[pozY][pozX] = data[pozY - 1][pozX];
			data[pozY - 1][pozX] = 0;
			pozY--;
			break;
		default:
			break;
		}
	}
	/// SHIFT + ALT + S, generate hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(data);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HraciPole other = (HraciPole) obj;
		if (!Arrays.deepEquals(data, other.data))
			return false;
		return true;
	}
	
	
}
