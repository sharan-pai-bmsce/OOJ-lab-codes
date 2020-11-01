
abstract class Shape{
	int l,b;
	Shape(int len,int bre){
		l=len;
		b=bre;
	}
	abstract void printArea();
}

class Triangle extends Shape{
	Triangle(int base,int hei){
		super(base,hei);
	}

	void printArea() {
		double area = 0.5*l*b;
		System.out.println("Area of triangle = "+area);
	}
}

class Rectangle extends Shape{
	Rectangle(int len,int bre){
		super(len,bre);
	}
	
	void printArea() {
		double area = l*b;
		System.out.println("Area of rectangle = "+area);
	}
}

class Circle extends Shape{
	Circle(int radius){
		super(radius,radius);
	}
	
	void printArea() {
		double area = 3.14*(double)l*(double)b;
		System.out.println("Area of circle = "+area);
	}
}

public class W4P1 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(7,7);
		t1.printArea();
		Rectangle r1 = new Rectangle(7,7);
		r1.printArea();
		Circle c1 = new Circle(5);
		c1.printArea();
	}

}
