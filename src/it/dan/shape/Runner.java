package it.dan.shape;

public class Runner {

	public static void main(String[] args) {
		Shape[] figures = new Shape[3];
		
		figures[0] = new Triangle(7, 7, 5);
		figures[1] = new Circle(5);
		figures[2] = new Square(5);
		
		System.out.printf("The area of triangle is %.2f%n", figures[0].getArea());
		System.out.printf("The area of circle is %.2f%n", figures[1].getArea());
		System.out.printf("The area of square is %.2f%n",figures[2].getArea());
		
	}

}
