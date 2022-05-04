package cz.vutbr.feec.tin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpocitejSlova {
	public static void main(String[] args) {
		BufferedReader reader;
		int celkovyPocet = 0;
		try {
			reader = new BufferedReader(new FileReader("mujsoubor.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				celkovyPocet += line.split("[ ,\\.]").length;
				// read next line
				line = reader.readLine();
			}
			reader.close();
			System.out.println(celkovyPocet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
