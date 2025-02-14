package Yaip5.ex2;

public class Cylinder {
	private Circle base;   
	private double height;

	public Cylinder(Circle base, double height) {
		this.base = base;
	   	this.height = height; 
	}
	
	public Cylinder() {
	      base = new Circle();
	      height = 1.0; 
	}

	public static void main(String[] args) {
		
		// Aggregation 
		Circle cercle = new Circle();
		Cylinder cylindre1 = new Cylinder(cercle, 15.0);
		
		// Composition
		Cylinder cylindre2 = new Cylinder();
	}

}
