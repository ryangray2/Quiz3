package base;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double p = (this.side1 + this.side2 + this.side3) / 2; 
		double z = p * (p - this.side1) * (p - this.side2) * (p - this.side3);
		double area = Math.sqrt(z);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}
	
	public String toString() {
		String s1 = Double.toString(this.side1);
		String s2 = Double.toString(this.side2);
		String s3 = Double.toString(this.side3);
		return "This triangle has sides of length " + s1 + ", " + s2 + ", and " + s3;
	}

}

