package cv03;

public abstract class GrObject {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	public abstract void Draw();
	

}
