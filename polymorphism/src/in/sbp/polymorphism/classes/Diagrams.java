package in.sbp.polymorphism.classes;

public class Diagrams {
	private int radius;
	private int height;
	private int width;
	
//	public Diagrams() {
//		this.radius=radius;
//		this.height=height;
//		this.width=width;
//		
//	}
	public Diagrams(int radius) {
		this.radius=radius;
	}
	public Diagrams(int height,int width) {
		this.height=height;
		this.width=width;
	}
	public void area(int radius) {
		System.out.println("Area of circle:" + (3.14*radius*radius));
	}
	public void area(int height,int width) {
		System.out.println("Area of rectangle:" + (height*width));
	}
	public void printHeightWidth() {
		System.out.println("height:"+height);
		System.out.println("width:"+width);
	}
	
	
}
