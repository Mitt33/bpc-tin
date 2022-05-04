package cv03;

public class Square extends GrObject {
	private int side;
	
	public Square(int x, int y, int side) {
		setX(x);
		setY(y);
		setSide(side);
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public int getSide(){
		return side;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing square(" + getX() + ", " + getY() + ", " + getSide() + ")");
	}
}
