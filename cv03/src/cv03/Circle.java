package cv03;

public class Circle extends GrObject{
	private int radius;
	
	Circle(int x, int y, int size){
		setX(x);
		setY(y);
		setRadius(size);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing circle(" + getX() + ", " + getY() + ", " + getRadius() + ")");
	}


}
