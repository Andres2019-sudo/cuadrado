package unibe.edu.ec.examen;

public class Square {
	private int centimeter;

	public Square(int centimeter) {
		super();
		this.centimeter = centimeter;
	}

	public int getCentimeter() {
		return centimeter;
	} 

	public void setCentimeter(int centimeter) {
		this.centimeter = centimeter;
	}
	public int calculateArea() {
		int area= centimeter*centimeter;
		return area;
	}
	public int calculatePerimeter() {
		int perimeter= centimeter*4;
		return perimeter;
	}
}
