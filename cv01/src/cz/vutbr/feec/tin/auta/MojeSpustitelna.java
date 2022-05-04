package cz.vutbr.feec.tin.auta;

public class MojeSpustitelna {
	public static void main(String[] args) {
		Car t1 = new Car();
		t1.cena = 100;
		t1.znacka = "Skoda";
		
		Car t2 = new Car();
		t2.cena = 500;
		t2.znacka = "Audi";
		
		Car t3 = t1;
		Car t4 = new Car();
		t4.cena = 300;
		t4.znacka = "BMW";

		t1.vpravo = t2;
		t2.vpravo = t4;
		
		System.out.println(t1.vpravo.znacka);
		System.out.println(t1.vpravo.vpravo.znacka);
		
		Car temp = t1;
		t1 = t2;
		t2 = temp;
		
		System.out.println(t1.znacka);
		
	}
}
