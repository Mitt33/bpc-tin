package cv03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen s = new Screen(800, 800);
		
		s.addObject(new Circle(20, 10, 10));
		s.addObject(new Square(10, 10, 10));
		
		Composite c = new Composite(30, 30);
		c.addObject(new Circle(111, 10, 10));
		c.addObject(new Square(88, 10, 10));
		s.addObject(c);
		
		
		s.createRastr("Obrazek.pjg");
		

	}

}
