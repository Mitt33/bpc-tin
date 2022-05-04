package cv03;

import java.util.LinkedList;

public class Screen {
	private int x;
	private int y;
	private String name;

	private LinkedList<GrObject> screenList = new LinkedList<>();

	Screen(int x, int y){
		setX(x);
		setY(y);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void addObject(GrObject grObject) {
		screenList.add(grObject);
	}
	
	public void print(){
		for (GrObject grObject : screenList) {
			grObject.Draw();
			}
	}

	public void createRastr(String name){
		print();
		System.out.println("\nI'm drawing " + name + ".");
	}


}
