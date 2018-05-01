package it.dan.shape;

public class Circle implements Shape {
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	

}
