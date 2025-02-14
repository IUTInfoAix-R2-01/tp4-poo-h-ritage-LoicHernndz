package Yaip5.ex2;

public class Circle {

	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle() {
		radius = 5;
		color = "red";
	}
	
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		
	}

}
