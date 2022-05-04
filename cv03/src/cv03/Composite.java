package cv03;

import java.util.LinkedList;

public class Composite extends GrObject{
	private LinkedList<GrObject> combine = new LinkedList<>();
	
	
	Composite(int x, int y){
		setX(x);
		setY(y);
	}
	
	public void addObject(GrObject grObject) {
		combine.add(grObject);
	}
	
	public void Print() {
		for (GrObject grObject : combine) {
			grObject.Draw();
			}
	}

	
	@Override
	public void Draw() {
		System.out.println("Drawing composite object(" + getX() + ", " + getY()+ ")");
		Print();
	}	
		
		
	
	

}
